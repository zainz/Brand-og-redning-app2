/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAL;

import BE.InjuredPerson;
import BE.TeamLeaderReport;
import java.sql.Connection;
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
}
