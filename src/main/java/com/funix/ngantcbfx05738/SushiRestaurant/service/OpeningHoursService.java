/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.funix.ngantcbfx05738.SushiRestaurant.service;

import com.funix.ngantcbfx05738.SushiRestaurant.model.OpeningHours;
import com.funix.ngantcbfx05738.SushiRestaurant.model.OpeningHoursModified;
import com.funix.ngantcbfx05738.SushiRestaurant.repo.OpeningHoursRepo;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author baong
 */
@Service
public class OpeningHoursService {
    
    // day of week
    String[] strDays = new String[] { "Monday", 
        "Tuesday","Wednesday", 
        "Thursday","Friday", 
        "Saturday", "Sunday" };

    @Autowired
    private final OpeningHoursRepo openingHoursRepo;

    public OpeningHoursService(OpeningHoursRepo openingHoursRepo) {
        this.openingHoursRepo = openingHoursRepo;
    }

    public List<OpeningHoursModified> getAllOpeningHours() {

        List<OpeningHours> ohList = openingHoursRepo.findAll();
        List<OpeningHoursModified> modifiedList = new ArrayList();

        for (OpeningHours oh : ohList) {
            OpeningHoursModified modifiedHours = new OpeningHoursModified();

//            String day = DayOfWeek.of(oh.getDay_of_week()).toString();
            String day = strDays[oh.getDay_of_week()-1];
            modifiedHours.setDayOfWeek(day);

            byte isClosed = oh.getIs_closed();
            modifiedHours.setIsClosed(isClosed);

            if (isClosed != 1) {

                String open = getHour(oh.getOpening_minutes_past_midnight());
                String close = getHour(oh.getClosing_minutes_past_midnight());
                
                modifiedHours.setOpenHours(open);
                modifiedHours.setCloseHours(close);
            }

            modifiedList.add(modifiedHours);
        }
        return modifiedList;
    }

    public String getHour(int m) {
        int hours = m / 60;
        String hour = hours + "";
        return hour;
    }
}
