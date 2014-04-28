/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BLL;

import BE.ErrorReport;
import DAL.ErrorReportDAL;
import java.sql.SQLException;

/**
 *
 * @author Christian
 */
public class ErrorReportBLL {
    
    ErrorReportDAL erd = new ErrorReportDAL();
    
    public void newErrorReport(ErrorReport er) throws SQLException{
        erd.newErrorReport(er);
    }
}
