/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.funix.ngantcbfx05738.SushiRestaurant.repo;

import com.funix.ngantcbfx05738.SushiRestaurant.model.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author baong
 */
@Repository
public interface UserInfoRepo extends JpaRepository<UserInfo, Long> {

    @Query(value="SELECT * FROM user_info u WHERE u.is_activated = 1 LIMIT 1", nativeQuery = true)
    UserInfo findActivatedUserInfo();
}
