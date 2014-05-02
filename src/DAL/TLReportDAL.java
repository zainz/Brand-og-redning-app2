/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAL;

import BE.Fireman;
import BE.InjuredPerson;
import BE.Shift;
import BE.TeamLeaderReport;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Christian
 */
public class TLReportDAL extends AbstractDAL {
    
    /**
     * Add a new "forbrug" to the database with the given inputs 
     * and then using that "forbrug" to create a new Team Leader Report
     * @param tlr
     * @throws SQLException 
     */
    public void newTeamLeaderReport(TeamLeaderReport tlr) throws SQLException{
        Connection con = null;
        
        
        
        try{
            con = getConnection();
            stmt = con.createStatement();
            stmt.executeUpdate("INSERT INTO Udrykning_forbrug (ht_rør, stål_rør, b_slange, c_slange, røgdykker_rapport, flaske, firgørelsesmateriale, overtryksventil, vandforbrug, skumvæske, "
                    + "lys_materiale, pulverslukker, kulsyreslukker, flydespærringer, absordan, absorbentW, engangspressening, mængde_opsamlet, sprænglågsfade)"
                    + " VALUES(" + tlr.getHtRør() + ", " + tlr.getStrålerør() + ", " + tlr.getbSlanger() + ", " + tlr.getcSlanger() + ", " 
                    + tlr.getRøgdykkerapp() + ", " + tlr.getFlasker() + ", " + tlr.getFrigørelsesMat() + ", " + tlr.getOvertryksVent() + ", '" + tlr.getVandforbrug() + "', '" 
                    + tlr.getSkumvæske() + "', " + tlr.getLysMat() + ", " + tlr.getPulverSluk() + ", " + tlr.getKulSluk() + ", " + tlr.getFlydeSpær() + ", " 
                    + tlr.getAbsordan() + ", " + tlr.getAbsorbent() + ", " + tlr.getEngangsPres() + ", '" + tlr.getMængde() + "', " + tlr.getSprænglågsfode() + ")", 
                    Statement.RETURN_GENERATED_KEYS);
            
            int forbrugId = stmt.getGeneratedKeys().getInt(1);
            
            stmt.executeUpdate("INSERT INTO Udrykning (dato, ugedag, beskrivelse, alarm_modtaget, indsatsleder, holdleder, forbrug, udryknings_no, eva_no, bemærkning)"
                    + " VALUES('" + tlr.getDato()+ "', '" + tlr.getUgedag()+ "', '" + tlr.getBeskrivelse()+ "', '" 
                    + tlr.getAlarmModtaget()+ "', '" + tlr.getIndsatsleder() + "', " + tlr.getHoldleder() + ", " + forbrugId + ", " + tlr.getUdrykningsNo()+ ", '" + tlr.getEvaNo()+ "', '" 
                    + tlr.getBemærkning() + "')");
        } finally{
            if(con != null) con.close();
        }
    }
    
    /**
     * Returns a shift from "midlertidig_løn" when the user enters a CPR number
     * @param fm
     * @return
     * @throws SQLException 
     */
    public Shift getShift(Fireman fm) throws SQLException{
        Connection con = null;
        Shift s = null;
        
        try{
            con = getConnection();
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT dat, brandmand, role.role, type_arbejde.type, ferie_dag, tod_logind, tid_logud, timer, køretøj, beskrivelse, køretøj, andet FROM midlertidig_løn, udrykning "
                    + "JOIN type_arbejde ON midlertidig_løn.type_arbejde = type_arbejde.id "
                    + "JOIN role ON midlertidig_løn.role = role.id "
                    + "JOIN brandmand ON midlertidig_løn.brandmand = brandmand.cpr "
                    + "JOIN brandmand ON udrykning_bemanding.brandmand = brandmand.id "
                    + "JOIN udrykning ON udrykning_bemanding.udrykning = udrykning.id"
                    + "WHERE midlertidig_løn.brandmand = '" + fm.getCprNo() + "'");
            while(rs.next()){
                String dato = rs.getString("dato");
                String cpr = rs.getString("brandmand");
                String role = rs.getString("role.role");
                String typeArbejde = rs.getString("type_arbejde.type");
                int ferieDag = rs.getInt("ferie_dag");
                String logind = rs.getString("tid_logind");
                String logud = rs.getString("tid_logud");
                int timer = rs.getInt("timer");
                String bil = rs.getString("køretøj");
                String indsatsNavn = rs.getString("udrykning.beskrivelse");
                s = new Shift(cpr, bil, timer, dato, role, typeArbejde, indsatsNavn, ferieDag, logind, logud);
            }
        } finally{
            if(con != null) con.close();
        }
        return s;
    }
    
    /**
     * Adds a new injured person to the database with the given things
     * @param ip
     * @param udrykning
     * @throws SQLException 
     */
    public void addInjury(InjuredPerson ip, int udrykning) throws SQLException{
        Connection con = null;
        
        try{
            con = getConnection();
            stmt = con.createStatement();
            stmt.executeUpdate("INSERT INTO tilskadekommende (fornavn, efternavn, adresse) "
                    + "VALUES ('" + ip.getFirstName() + "', '" + ip.getLastName() + "', '" + ip.getAddress() + "')", Statement.RETURN_GENERATED_KEYS);
                    
            int temp = stmt.getGeneratedKeys().getInt(1);
            stmt.executeUpdate("INSERT INTO Udryknings_tilskadekommende (udrykning, tilskadekommende) "
                    + "VALUES (" + udrykning + ", " + temp + ")");
        } finally{
            if(con != null) con.close();
        }
    }
    
    /**
     * Edit a shift that has been gone through App 1, in case of missclick
     * @param s
     * @throws SQLException 
     */
    public void editShift(Shift s) throws SQLException{
        Connection con = null;
        int id = 0;
        int typeId = 0;
        
        try{
            con = getConnection();
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id FROM role WHERE role = '" + s.getRolle() + "'");
            while(rs.next()){
                id = rs.getInt("id");
            }
            
            ResultSet rs2 = stmt.executeQuery("SELECT id FROM type_arbejde WHERE type = '" + s.getType() + "'");
            while(rs2.next()){
                typeId = rs2.getInt("id");
            }
            
            stmt.executeUpdate("UPDATE midlertidig_løn "
                    + "JOIN role ON midlertidig_løn.role = role.id "
                    + "JOIN type_arbejde ON midlertidig_løn.type_arbejde = type_arbejde.id"
                    + "SET brandmand = '" + s.getCpr() + "', role = " + id + ", type_arbejde = " + typeId + ", ferie_dag = " + s.getFerie() + ", timer = " + s.getTimer() + " " 
                    + "WHERE tid_logind = '" + s.getLogind() + "' AND tid_logud = '" + s.getLogud()+ "'");
        } finally{
            if(con!=null) con.close();
        }
    }
}
