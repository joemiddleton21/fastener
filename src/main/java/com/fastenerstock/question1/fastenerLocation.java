package com.fastenerstock.question1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Joe_m
 */
public class fastenerLocation{

    private int siteId;
    private String fastenerId;
    private String siteName;
    private String siteLocation;


    public fastenerLocation() {

    }

    public fastenerLocation(String fastenerId, String siteName, String siteLocation) {
        this.fastenerId = fastenerId;
        this.siteName = siteName;
        this.siteLocation = siteLocation;
 
    }

    public int getSiteId() {
        return siteId;
    }

    public void setSiteId(int siteId) {
        this.siteId = siteId;
    }

    public String getFastenerId() {
        return fastenerId;
    }

    public void setFastenerId(String fastenerId) {
        this.fastenerId = fastenerId;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getSiteLocation() {
        return siteLocation;
    }

    public void setSiteLocation(String siteLocation) {
        this.siteLocation = siteLocation;
    }
    
    

    

    @Override
    public String toString() {
        return "fastenerDetails [siteId=" + siteId + ", fastenerId=" + fastenerId + ", siteName=" + siteName +  
                ", siteLocation=" + siteLocation + "]";
    }

}
