package com.fastenerstock.question1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Joe_m
 */
public class fastenerDetails {

    private int fastenerId;
    private String fastenerType;
    private String threadType;
    private String threadDesc;
    private String threadLength;

    public fastenerDetails() {

    }

    public fastenerDetails(String fastenerType, String threadType, String threadDesc, String threadLength) {
        this.fastenerType = fastenerType;
        this.threadType = threadType;
        this.threadDesc = threadDesc;
        this.threadLength = threadLength;
    }

    public int getFastenerId() {
        return fastenerId;
    }

    public void setFastenerId(int fastenerId) {
        this.fastenerId = fastenerId;
    }

    public String getFastenerType() {
        return fastenerType;
    }

    public void setFastenerType(String fastenerType) {
        this.fastenerType = fastenerType;
    }

    public String getThreadType() {
        return threadType;
    }

    public void setThreadType(String threadType) {
        this.threadType = threadType;
    }

    public String getThreadDesc() {
        return threadDesc;
    }

    public void setThreadDesc(String threadDesc) {
        this.threadDesc = threadDesc;
    }

    public String getThreadLength() {
        return threadLength;
    }

    public void setThreadLength(String threadLength) {
        this.threadLength = threadLength;
    }

    

    @Override
    public String toString() {
        return "fastenerDetails [fastenerId=" + fastenerId + ", fastenerType=" + fastenerType + ", threadType=" + threadType +  
                ", threadDesc=" + threadDesc + ", threadLength=" + threadLength+ "]";
    }

}
