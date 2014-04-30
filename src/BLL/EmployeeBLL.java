/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BLL;

import BE.Fireman;
import DAL.EmployeeDAL;
import java.sql.SQLException;

/**
 *
 * @author Christian
 */
public class EmployeeBLL {
    
    EmployeeDAL emd = new EmployeeDAL();
    
    public Fireman getEmployeeByCpr(Fireman fm) throws SQLException{
        return emd.getFiremanByCpr(fm);
    }
}
