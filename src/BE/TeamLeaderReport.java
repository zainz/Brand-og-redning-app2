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
public class TeamLeaderReport {
    
    private String holdleder;
    private String indsatsleder;
    private String alarmModtaget;
    private String ugedag;
    private String beskrivelse;
    private String dato;
    private String udrykningsNo;
    private String evaNo;
    private String htRør;
    private String strålerør;
    private String bSlanger;
    private String cSlanger;
    private String røgdykkerapp;
    private String flasker;
    private String frigørelsesMat;
    private String overtryksVent;
    private String vandforbrug;
    private String skumvæske;
    private String lysMat;
    private String pulverSluk;
    private String kulSluk;
    private String flydeSpær;
    private String absordan;
    private String absorbent;
    private String engangsPres;
    private String mængde;
    private String sprænglågsfode;
    private String type;
    private String gruppeNo;
    private String detektorNo;
    private String bemærkning;
    
    public TeamLeaderReport(String teamLeader, String commander, String alarmReceived, String weekday, 
            String message, String personName, String personAddress, String date, String fireReportNo, 
            String evaReportNo, String htRør, String strålerør, String bSlanger, String cSlanger, String røgdykkerapp, String flasker, 
            String frigærelsesMat, String overstryksVent, String vandforbrug, String skunvæske, String lysMat, String pulverSluk, 
            String kulSluk, String flydeSpær, String absordan, String absorbent, String engangsPres, String mængde, String sprænglågsfode, 
            String type, String groupNo, String detektorNo, String remark, String beretning){
        
        this.holdleder = teamLeader;
        this.indsatsleder = commander;
        this.alarmModtaget = alarmReceived;
        this.ugedag = weekday;
        this.beskrivelse = message;
        this.dato = date;
        this.udrykningsNo = fireReportNo;
        this.evaNo = evaReportNo;
        
        this.htRør= htRør;
        this.strålerør = strålerør;
        this.bSlanger = bSlanger;
        this.cSlanger = cSlanger;
        this.røgdykkerapp = røgdykkerapp;
        this.flasker = flasker;
        this.frigørelsesMat = frigærelsesMat;
        this.overtryksVent = overstryksVent;
        this.vandforbrug = vandforbrug;
        this.skumvæske = skunvæske;
        this.lysMat = lysMat;
        this.pulverSluk = pulverSluk;
        this.kulSluk = kulSluk;
        this.flydeSpær = flydeSpær;
        this.absordan = absordan;
        this.absorbent = absorbent;
        this.engangsPres = engangsPres;
        this.mængde = mængde;
        this.sprænglågsfode = sprænglågsfode;
        
        this.type = type;
        this.gruppeNo = groupNo;
        this.detektorNo = detektorNo;
        
        this.bemærkning = remark;
    }

    /**
     * @return the holdleder
     */
    public String getHoldleder() {
        return holdleder;
    }

    /**
     * @return the indsatsleder
     */
    public String getIndsatsleder() {
        return indsatsleder;
    }

    /**
     * @return the alarmModtaget
     */
    public String getAlarmModtaget() {
        return alarmModtaget;
    }

    /**
     * @return the ugedag
     */
    public String getUgedag() {
        return ugedag;
    }

    /**
     * @return the beskrivelse
     */
    public String getBeskrivelse() {
        return beskrivelse;
    }

    /**
     * @return the dato
     */
    public String getDato() {
        return dato;
    }

    /**
     * @return the udrykningsNo
     */
    public String getUdrykningsNo() {
        return udrykningsNo;
    }

    /**
     * @return the evaNo
     */
    public String getEvaNo() {
        return evaNo;
    }

    /**
     * @return the htRør
     */
    public String getHtRør() {
        return htRør;
    }

    /**
     * @return the strålerør
     */
    public String getStrålerør() {
        return strålerør;
    }

    /**
     * @return the bSlanger
     */
    public String getbSlanger() {
        return bSlanger;
    }

    /**
     * @return the cSlanger
     */
    public String getcSlanger() {
        return cSlanger;
    }

    /**
     * @return the røgdykkerapp
     */
    public String getRøgdykkerapp() {
        return røgdykkerapp;
    }

    /**
     * @return the flasker
     */
    public String getFlasker() {
        return flasker;
    }

    /**
     * @return the frigørelsesMat
     */
    public String getFrigørelsesMat() {
        return frigørelsesMat;
    }

    /**
     * @return the overtryksVent
     */
    public String getOvertryksVent() {
        return overtryksVent;
    }

    /**
     * @return the vandforbrug
     */
    public String getVandforbrug() {
        return vandforbrug;
    }

    /**
     * @return the skumvæske
     */
    public String getSkumvæske() {
        return skumvæske;
    }

    /**
     * @return the lysMat
     */
    public String getLysMat() {
        return lysMat;
    }

    /**
     * @return the pulverSluk
     */
    public String getPulverSluk() {
        return pulverSluk;
    }

    /**
     * @return the kulSluk
     */
    public String getKulSluk() {
        return kulSluk;
    }

    /**
     * @return the flydeSpær
     */
    public String getFlydeSpær() {
        return flydeSpær;
    }

    /**
     * @return the absordan
     */
    public String getAbsordan() {
        return absordan;
    }

    /**
     * @return the absorbent
     */
    public String getAbsorbent() {
        return absorbent;
    }

    /**
     * @return the engangsPres
     */
    public String getEngangsPres() {
        return engangsPres;
    }

    /**
     * @return the mængde
     */
    public String getMængde() {
        return mængde;
    }

    /**
     * @return the sprænglågsfode
     */
    public String getSprænglågsfode() {
        return sprænglågsfode;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @return the gruppeNo
     */
    public String getGruppeNo() {
        return gruppeNo;
    }

    /**
     * @return the detektorNo
     */
    public String getDetektorNo() {
        return detektorNo;
    }

    /**
     * @return the bemærkning
     */
    public String getBemærkning() {
        return bemærkning;
    }

}