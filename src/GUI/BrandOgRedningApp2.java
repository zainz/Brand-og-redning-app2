/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import BE.ErrorReport;
import BLL.ErrorReportBLL;
import java.sql.SQLException;

/**
 *
 * @author Christian
 */
public class BrandOgRedningApp2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        ErrorReportBLL bll = new ErrorReportBLL();
        bll.newErrorReport(new ErrorReport(1, 1, 2, "lol", "lol", "lol", "lol", "lol", "lol", "lol"));
    }
    
}
