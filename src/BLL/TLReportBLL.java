/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BLL;

import BE.InjuredPerson;
import BE.Shift;
import BE.TeamLeaderReport;
import DAL.TLReportDAL;
import java.sql.SQLException;
/**
 *
 * @author Christian
 */
public class TLReportBLL {
    
    TLReportDAL tld = new TLReportDAL();
    
    public void newTeamLeaderReport(TeamLeaderReport tlr) throws SQLException{
        
        tld.newTeamLeaderReport(tlr);
    }
    
    public void addInjury(InjuredPerson ip, int udrykning) throws SQLException{
        tld.addInjury(ip, udrykning);
    }
    
    public void editShift(Shift s) throws SQLException{
        tld.editShift(s);
    }
    
    
}
