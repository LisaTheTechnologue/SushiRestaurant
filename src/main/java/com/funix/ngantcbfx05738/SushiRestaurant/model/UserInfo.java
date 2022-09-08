/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.funix.ngantcbfx05738.SushiRestaurant.model;

import javax.persistence.*;

/**
 *
 * @author baong
 */
@Entity
@Table(name = "user_info")
public class UserInfo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    
    private String address;
    
    private String tel;
    
    private String email;
    
    private byte is_activated;

    public UserInfo() {
    }

    public UserInfo(Long id, String title, String address, String tel, String email, byte is_activated) {
        this.id = id;
        this.title = title;
        this.address = address;
        this.tel = tel;
        this.email = email;
        this.is_activated = is_activated;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public byte getIs_activated() {
        return is_activated;
    }

    public void setIs_activated(byte is_activated) {
        this.is_activated = is_activated;
    }
    
    
}
