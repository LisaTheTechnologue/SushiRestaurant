/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.funix.ngantcbfx05738.SushiRestaurant.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author baong
 */
@Entity
@Table(name="opening_hours")
public class OpeningHours implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Integer day_of_week;
    
    private Integer opening_minutes_past_midnight;
    
    private Integer closing_minutes_past_midnight;
    
    private byte is_closed;

    public OpeningHours() {
    }

    public OpeningHours(Long id, Integer day_of_week, Integer opening_minutes_past_midnight, Integer closing_minutes_past_midnight, byte is_closed) {
        this.id = id;
        this.day_of_week = day_of_week;
        this.opening_minutes_past_midnight = opening_minutes_past_midnight;
        this.closing_minutes_past_midnight = closing_minutes_past_midnight;
        this.is_closed = is_closed;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getDay_of_week() {
        return day_of_week;
    }

    public void setDay_of_week(Integer day_of_week) {
        this.day_of_week = day_of_week;
    }

    public Integer getOpening_minutes_past_midnight() {
        return opening_minutes_past_midnight;
    }

    public void setOpening_minutes_past_midnight(Integer opening_minutes_past_midnight) {
        this.opening_minutes_past_midnight = opening_minutes_past_midnight;
    }

    public Integer getClosing_minutes_past_midnight() {
        return closing_minutes_past_midnight;
    }

    public void setClosing_minutes_past_midnight(Integer closing_minutes_past_midnight) {
        this.closing_minutes_past_midnight = closing_minutes_past_midnight;
    }

    public byte getIs_closed() {
        return is_closed;
    }

    public void setIs_closed(byte is_closed) {
        this.is_closed = is_closed;
    }
    
    
}
