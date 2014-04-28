/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BE;

/**
 *
 * @author Christian
 */
public class Employee {
    
    private String cprNo;
    private String firstName;
    private String lastName;
    private String address;
    private String phone;
    private String callNo;
    private String paymentNo;
    
    public Employee(String cprNo, String firstName, String lastName, String address, String phone, String callNo, String paymentNo){
        this.cprNo = cprNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.callNo = callNo;
        this.paymentNo = paymentNo;
    }

    /**
     * @return the cprNo
     */
    public String getCprNo() {
        return cprNo;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @return the callNo
     */
    public String getCallNo() {
        return callNo;
    }

    /**
     * @return the paymentNo
     */
    public String getPaymentNo() {
        return paymentNo;
    }
}
