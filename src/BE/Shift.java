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
public class Shift {
    
    private String cpr;
    private String bil;
    private int timer;
    private String dato;
    private String rolle;
    private String type;
    private String indsatsNavn;
    private String indsatsForm;
    private int ferie;
    private String andet;
    private String logind;
    private String logud;
    
    public Shift(String cpr, String bil, int timer, String dato, String rolle,String type, String indsatsNavn, String indsatsForm, int ferie, String andet, String logind, String logud){
        this.cpr = cpr;
        this.bil = bil;
        this.timer = timer;
        this.dato = dato;
        this.rolle = rolle;
        this.type = type;
        this.indsatsNavn = indsatsNavn;
        this.indsatsForm = indsatsForm;
        this.ferie = ferie;
        this.andet = andet;
        this.logind = logind;
        this.logud = logud;
    }
    
    public Shift(String cpr, String bil, int timer, String dato, String role, String typeArbejde, String indsatsNavn, int ferieDag, String logind, String logud){
        this.cpr = cpr;
        this.bil = bil;
        this.timer = timer;
        this.dato = dato;
        this.rolle = role;
        this.type = typeArbejde;
        this.indsatsNavn = indsatsNavn;
        this.ferie = ferieDag;
        this.logind = logind;
        this.logud = logud;
    }

    /**
     * @return the cpr
     */
    public String getCpr() {
        return cpr;
    }

    /**
     * @return the bil
     */
    public String getBil() {
        return bil;
    }

    /**
     * @return the dato
     */
    public String getDato() {
        return dato;
    }

    /**
     * @return the rolle
     */
    public String getRolle() {
        return rolle;
    }

    /**
     * @return the indsatsNavn
     */
    public String getIndsatsNavn() {
        return indsatsNavn;
    }

    /**
     * @return the indsatsForm
     */
    public String getIndsatsForm() {
        return indsatsForm;
    }

    /**
     * @return the andet
     */
    public String getAndet() {
        return andet;
    }

    /**
     * @return the timer
     */
    public int getTimer() {
        return timer;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @return the ferie
     */
    public int getFerie() {
        return ferie;
    }

    /**
     * @return the logind
     */
    public String getLogind() {
        return logind;
    }

    /**
     * @return the logud
     */
    public String getLogud() {
        return logud;
    }
}
