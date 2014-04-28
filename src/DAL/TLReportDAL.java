/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAL;

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
            stmt.executeUpdate("INSERT INTO Forbrug (htRør, strålerør, bSlanger, cSlanger, røgdykkerapp, flasker, firgørelsesmateriale, overtryksventiler, vandforbrug, skumvæske, "
                    + "lysmateriel, pulverslukker, kulsyreslukker, flydespærringer, absodant, absorbent, engangspresseninger, mængdeOpsamlet, sprænglågsfode)"
                    + " VALUES(" + tlr.getHtRør() + ", " + tlr.getStrålerør() + ", " + tlr.getbSlanger() + ", " + tlr.getcSlanger() + ", " 
                    + tlr.getRøgdykkerapp() + ", " + tlr.getFlasker() + ", " + tlr.getFrigørelsesMat() + ", " + tlr.getOvertryksVent() + ", '" + tlr.getVandforbrug() + "', '" 
                    + tlr.getSkumvæske() + "', " + tlr.getLysMat() + ", " + tlr.getPulverSluk() + ", " + tlr.getKulSluk() + ", " + tlr.getFlydeSpær() + ", " 
                    + tlr.getAbsordan() + ", " + tlr.getAbsorbent() + ", " + tlr.getEngangsPres() + ", '" + tlr.getMængde() + "', " + tlr.getSprænglågsfode() + ")", 
                    Statement.RETURN_GENERATED_KEYS);
            
            int forbrugId = stmt.getGeneratedKeys().getInt(1);
            
            ResultSet rs = stmt.executeQuery("SELECT id FROM Beretning WHERE description = '" + tlr.getBeretning());
            int beretningId = 0;
            while(rs.next()){
                beretningId = rs.getInt("id");
            }
            
            stmt.executeUpdate("INSERT INTO Team_leader_report (teamleader, commander, date, alarmRecieved, weekday, firereportNo, evaNo, message, consumption, account, remark)"
                    + " VALUES('" + tlr.getTeamleader() + "', '" + tlr.getCommander() + "', '" + tlr.getDate() + "', '" 
                    + tlr.getAlarmReceived() + "', '" + tlr.getWeekday() + "', " + tlr.getFireReportNo() + ", " + tlr.getEvaReportNo() + ", '" + tlr.getMessage() + "', " 
                    + forbrugId + ", " + beretningId + ", '" + tlr.getRemark() + "')");
        } finally{
            if(con != null) con.close();
        }
    }
}
