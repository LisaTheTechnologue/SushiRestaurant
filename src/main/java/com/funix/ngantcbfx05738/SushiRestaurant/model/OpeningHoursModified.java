/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.funix.ngantcbfx05738.SushiRestaurant.model;

/**
 *
 * @author baong
 */
public class OpeningHoursModified {       

    private String dayOfWeek;
    
    private String openHours;
    
    private String closeHours;
    
    private byte isClosed;

    public OpeningHoursModified() {
    }

    public OpeningHoursModified(String dayOfWeek, String openHours, String closeHours, byte isClosed) {
        this.dayOfWeek = dayOfWeek;
        this.openHours = openHours;
        this.closeHours = closeHours;
        this.isClosed = isClosed;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public String getOpenHours() {
        return openHours;
    }

    public void setOpenHours(String openHours) {
        this.openHours = openHours;
    }

    public String getCloseHours() {
        return closeHours;
    }

    public void setCloseHours(String closeHours) {
        this.closeHours = closeHours;
    }

    public byte getIsClosed() {
        return isClosed;
    }

    public void setIsClosed(byte isClosed) {
        this.isClosed = isClosed;
    }

    
}
