/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAL;

import BE.ErrorReport;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Christian
 */
public class ErrorReportDAL extends AbstractDAL {
    
    
    /**
     * Adds a new error report with the given information
     * @param er
     * @throws SQLException 
     */
    public void newErrorReport(ErrorReport er) throws SQLException{
        Connection con = null;
        
        try{
            con = getConnection();
            stmt = con.createStatement();
            stmt.executeUpdate("INSERT INTO ErrorReport (date, employeeName, error, cause, notWorking, important, occasion) "
                    + "VALUES ('" + er.getDate() + "', '" + er.getEmployeeName() + "', '"
                    + er.getError() + "', '" + er.getCause() + "', " + er.getNotWorking() + ", " + er.getImportant() + ", '" + er.getOccasion() + "')");
        } finally{
            if(con != null) con.close();
        }
    }
}
