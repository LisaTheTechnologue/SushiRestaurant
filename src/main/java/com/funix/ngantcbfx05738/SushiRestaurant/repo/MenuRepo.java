/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.funix.ngantcbfx05738.SushiRestaurant.repo;

import com.funix.ngantcbfx05738.SushiRestaurant.model.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author baong
 */
@Repository
public interface MenuRepo extends JpaRepository<Menu, Long> {
    
}
