/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.funix.ngantcbfx05738.SushiRestaurant.service;

import com.funix.ngantcbfx05738.SushiRestaurant.model.UserInfo;
import com.funix.ngantcbfx05738.SushiRestaurant.repo.UserInfoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author baong
 */
@Service
public class UserInfoService {
    @Autowired
    private final UserInfoRepo userInfoRepo;

    public UserInfoService(UserInfoRepo userInfoRepo) {
        this.userInfoRepo = userInfoRepo;
    }    
    
    public UserInfo getUserInfo() {
        UserInfo userinfo = userInfoRepo.findActivatedUserInfo();
        return userinfo;
    }
}
