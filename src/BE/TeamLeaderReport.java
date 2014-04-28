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
    
    String teamleader, commander, alarmReceived, weekday, message, personName, personAddress, date;
    String fireReportNo, evaReportNo;
    
    String htRør, strålerør, bSlanger, cSlanger, røgdykkerapp, flasker, frigørelsesMat, overtryksVent, 
            vandforbrug, skumvæske, lysMat, pulverSluk, kulSluk, flydeSpær, absordan, absorbent, 
            engangsPres, mængde, sprænglågsfode;
    
    String type, groupNo, detektorNo;
    
    String remark, beretning;
    
    public TeamLeaderReport(String teamLeader, String commander, String alarmReceived, String weekday, 
            String message, String personName, String personAddress, String date, String fireReportNo, 
            String evaReportNo, String htRør, String strålerør, String bSlanger, String cSlanger, String røgdykkerapp, String flasker, 
            String frigærelsesMat, String overstryksVent, String vandforbrug, String skunvæske, String lysMat, String pulverSluk, 
            String kulSluk, String flydeSpær, String absordan, String absorbent, String engangsPres, String mængde, String sprænglågsfode, 
            String type, String groupNo, String detektorNo, String remark, String beretning){
        
        this.teamleader = teamLeader;
        this.commander = commander;
        this.alarmReceived = alarmReceived;
        this.weekday = weekday;
        this.message = message;
        this.personName = personName;
        this.personAddress = personAddress;
        this.date = date;
        this.fireReportNo = fireReportNo;
        this.evaReportNo = evaReportNo;
        
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
        this.groupNo = groupNo;
        this.detektorNo = detektorNo;
        
        this.remark = remark;
        this.beretning = beretning;
    }

    /**
     * @return the teamleader
     */
    public String getTeamleader() {
        return teamleader;
    }

    /**
     * @return the commander
     */
    public String getCommander() {
        return commander;
    }

    /**
     * @return the alarmReceived
     */
    public String getAlarmReceived() {
        return alarmReceived;
    }

    /**
     * @return the weekday
     */
    public String getWeekday() {
        return weekday;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @return the personName
     */
    public String getPersonName() {
        return personName;
    }

    /**
     * @return the personAddress
     */
    public String getPersonAddress() {
        return personAddress;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @return the fireReportNo
     */
    public int getFireReportNo() {
        int temp = Integer.parseInt(fireReportNo);
        return temp;
    }

    /**
     * @return the evaReportNo
     */
    public int getEvaReportNo() {
        int temp = Integer.parseInt(evaReportNo);
        return temp;
    }

    /**
     * @return the htRør
     */
    public int getHtRør() {
        int temp = Integer.parseInt(htRør);
        return temp;
    }

    /**
     * @return the strålerør
     */
    public int getStrålerør() {
        int temp = Integer.parseInt(strålerør);
        return temp;
    }

    /**
     * @return the bSlanger
     */
    public int getbSlanger() {
        int temp = Integer.parseInt(bSlanger);
        return temp;
    }

    /**
     * @return the cSlanger
     */
    public int getcSlanger() {
        int temp = Integer.parseInt(cSlanger);
        return temp;
    }

    /**
     * @return the røgdykkerapp
     */
    public int getRøgdykkerapp() {
        int temp = Integer.parseInt(røgdykkerapp);
        return temp;
    }

    /**
     * @return the flasker
     */
    public int getFlasker() {
        int temp = Integer.parseInt(flasker);
        return temp;
    }

    /**
     * @return the frigørelsesMat
     */
    public int getFrigørelsesMat() {
        int temp = Integer.parseInt(frigørelsesMat);
        return temp;
    }

    /**
     * @return the overtryksVent
     */
    public int getOvertryksVent() {
        int temp = Integer.parseInt(overtryksVent);
        return temp;
    }

    /**
     * @return the vandforbrug
     */
    public int getVandforbrug() {
        int temp = Integer.parseInt(vandforbrug);
        return temp;
    }

    /**
     * @return the skumvæske
     */
    public int getSkumvæske() {
        int temp = Integer.parseInt(skumvæske);
        return temp;
    }

    /**
     * @return the lysMat
     */
    public int getLysMat() {
        int temp = Integer.parseInt(lysMat);
        return temp;
    }

    /**
     * @return the pulverSluk
     */
    public int getPulverSluk() {
        int temp = Integer.parseInt(pulverSluk);
        return temp;
    }

    /**
     * @return the kulSluk
     */
    public int getKulSluk() {
        int temp = Integer.parseInt(kulSluk);
        return temp;
    }

    /**
     * @return the flydeSpær
     */
    public int getFlydeSpær() {
        int temp = Integer.parseInt(flydeSpær);
        return temp;
    }

    /**
     * @return the absordan
     */
    public int getAbsordan() {
        int temp = Integer.parseInt(absordan);
        return temp;
    }

    /**
     * @return the absorbent
     */
    public int getAbsorbent() {
        int temp = Integer.parseInt(absorbent);
        return temp;
    }

    /**
     * @return the engangsPres
     */
    public int getEngangsPres() {
        int temp = Integer.parseInt(engangsPres);
        return temp;
    }

    /**
     * @return the mængde
     */
    public int getMængde() {
        int temp = Integer.parseInt(mængde);
        return temp;
    }

    /**
     * @return the sprænglågsfode
     */
    public int getSprænglågsfode() {
        int temp = Integer.parseInt(sprænglågsfode);
        return temp;
    }

    /**
     * @return the type
     */
    public int getType() {
        int temp = Integer.parseInt(type);
        return temp;
    }
    
    /**
     * 
     * @return the beretning 
     */
    public String getBeretning(){
        return beretning;
    }

    /**
     * @return the groupNo
     */
    public int getGroupNo() {
        int temp = Integer.parseInt(groupNo);
        return temp;
    }

    /**
     * @return the detektorNo
     */
    public int getDetektorNo() {
        int temp = Integer.parseInt(detektorNo);
        return temp;
    }

    /**
     * @return the remark
     */
    public String getRemark() {
        return remark;
    }
}
