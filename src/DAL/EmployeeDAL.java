/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAL;

import BE.Fireman;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Christian
 */
public class EmployeeDAL extends AbstractDAL {
    
    public Fireman getFiremanByCpr(Fireman e) throws SQLException{
        Connection con = null;
        Fireman fm = null;
        
        try{
            con = getConnection();
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Brandmand WHERE cpr_no = '" + e.getCprNo() + "'");
            while(rs.next()){
                String cprNo = rs.getString("cpr_no");
                String firstName = rs.getString("fornavn");
                String lastName = rs.getString("efternavn");
                String address = rs.getString("adresse");
                String phone = rs.getString("telefon");
                String callNo = rs.getString("udkaldsnummer");
                String paymentNo = rs.getString("løn_nummer");
                fm = new Fireman(cprNo, firstName, lastName, address, phone, callNo, paymentNo);
            }
        } finally{
            if(con!=null) con.close();
        }
        return fm;
    }
}
