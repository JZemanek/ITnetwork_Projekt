/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itnetwork.cz.projektjavazjednodusenaverze;

/**
 * Entita pojištěného
 * 
 */
public class Pojisteny {
    private String jmeno;
    //Jméno pojištěného
    private String prijmeni;
    //Příjmení pojištěného
    private int vek;
    //Věk pojištěného
    private String telefon;
    //Telefonní číslo pojištěného
    
    /**
     * 
     * @param jmeno Jméno pojištěného
     * @param prijmeni Příjmení pojištěného
     * @param vek Věk pojištěného
     * @param telefon Telefonní číslo pojištěného
     */
    public Pojisteny(String jmeno, String prijmeni, int vek, String telefon){
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefon = telefon;
    }
    
    //Gettery a settery

    /**
     *
     * @return
     */

    public String getJmeno() {
        return jmeno;
    }

    /**
     *
     * @param jmeno
     */
    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    /**
     *
     * @return
     */
    public String getPrijmeni() {
        return prijmeni;
    }

    /**
     *
     * @param prijmeni
     */
    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    /**
     *
     * @return
     */
    public int getVek() {
        return vek;
    }

    /**
     *
     * @param vek
     */
    public void setVek(int vek) {
        this.vek = vek;
    }

    /**
     *
     * @return
     */
    public String getTelefon() {
        return telefon;
    }

    /**
     *
     * @param telefon
     */
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return String.format("%-10s %-15s%-10d%-10s", jmeno, prijmeni, vek, telefon);
    }
}
