/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAL;

import BE.Employee;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Christian
 */
public class EmployeeDAL extends AbstractDAL {
    
    public Employee getEmployeeByCpr(Employee e) throws SQLException{
        Connection con = null;
        Employee employee = null;
        
        try{
            con = getConnection();
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Firemen WHERE cprNo = '" + e.getCprNo() + "'");
            while(rs.next()){
                String cprNo = rs.getString("cprNo");
                String firstName = rs.getString("firstName");
                String lastName = rs.getString("lastName");
                String address = rs.getString("address");
                String phone = rs.getString("phone");
                String callNo = rs.getString("callNo");
                String paymentNo = rs.getString("paymentNo");
                employee = new Employee(cprNo, firstName, lastName, address, phone, callNo, paymentNo);
            }
        } finally{
            if(con!=null) con.close();
        }
        return employee;
    }
}
