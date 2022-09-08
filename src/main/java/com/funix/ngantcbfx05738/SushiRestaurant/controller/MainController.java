/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.funix.ngantcbfx05738.SushiRestaurant.controller;

import com.funix.ngantcbfx05738.SushiRestaurant.service.MenuService;
import com.funix.ngantcbfx05738.SushiRestaurant.service.OpeningHoursService;
import com.funix.ngantcbfx05738.SushiRestaurant.service.ProductService;
import com.funix.ngantcbfx05738.SushiRestaurant.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author baong
 */
@Controller
public class MainController {
    
    @Autowired
    ProductService pService;
    
    @Autowired
    MenuService mService;
    
    @Autowired
    UserInfoService uiService;
    
    @Autowired
    OpeningHoursService ohService;
    
    @RequestMapping(value = {"/", "/index", "/home"}, method = RequestMethod.GET)
    public String index(Model model) {
        
        model.addAttribute("products", pService.getAllProducts());
        
        return "index";
    }
    
    @RequestMapping(value = "/menu", method = RequestMethod.GET)
    public String showMenus(Model model) {
        
        model.addAttribute("menus", mService.getAllMenus());
        
        return "menu";
    }
    
    @RequestMapping(value = "/find-us", method = RequestMethod.GET)
    public String showFindUs(Model model) {
        
        model.addAttribute("userinfo", uiService.getUserInfo());
        model.addAttribute("openinghours", ohService.getAllOpeningHours());
        
        return "find-us";
    }
}
