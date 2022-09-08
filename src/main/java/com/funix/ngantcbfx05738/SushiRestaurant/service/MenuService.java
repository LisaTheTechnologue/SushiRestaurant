/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.funix.ngantcbfx05738.SushiRestaurant.service;

import com.funix.ngantcbfx05738.SushiRestaurant.model.Menu;
import com.funix.ngantcbfx05738.SushiRestaurant.repo.MenuRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author baong
 */
@Service
public class MenuService {
    @Autowired
    private final MenuRepo menuRepo;

    public MenuService(MenuRepo menuRepo) {
        this.menuRepo = menuRepo;
    }    
    
    public List<Menu> getAllMenus() {
        List<Menu> menus = menuRepo.findAll();
        return menus;
    }
}
