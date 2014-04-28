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
public class ErrorReport {
    private int vehicle;
    private int notWorking;
    private int important;
    private String employeeName;
    private String error;
    private String cause;
    private String occasion;
    private String date;
    private String repairDate;
    private String repairName;
    
    public ErrorReport(int vehicle, int notWorking, int important, String employeeName, String error, String cause, String occasion, String date, String repairDate, String repairName){
        this.vehicle = vehicle;
        this.notWorking = notWorking;
        this.important = important;
        this.employeeName = employeeName;
        this.error = error;
        this.cause = cause;
        this.occasion = occasion;
        this.date = date;
        this.repairDate = repairDate;
        this.repairName = repairName;
    }

    /**
     * @return the vehicle
     */
    public int getVehicle() {
        return vehicle;
    }

    /**
     * @return the notWorking
     */
    public int getNotWorking() {
        return notWorking;
    }

    /**
     * @return the important
     */
    public int getImportant() {
        return important;
    }

    /**
     * @return the employeeName
     */
    public String getEmployeeName() {
        return employeeName;
    }

    /**
     * @return the error
     */
    public String getError() {
        return error;
    }

    /**
     * @return the cause
     */
    public String getCause() {
        return cause;
    }

    /**
     * @return the occasion
     */
    public String getOccasion() {
        return occasion;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @return the repairDate
     */
    public String getRepairDate() {
        return repairDate;
    }

    /**
     * @return the repairName
     */
    public String getRepairName() {
        return repairName;
    }
}
