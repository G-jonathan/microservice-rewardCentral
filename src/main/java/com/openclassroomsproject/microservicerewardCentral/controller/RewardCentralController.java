package com.openclassroomsproject.microservicerewardCentral.controller;

import com.openclassroomsproject.microservicerewardCentral.service.IRewardCentralService;
import com.openclassroomsproject.microservicerewardCentral.utils.CustomRequestLoggingFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.UUID;

/**
 * This is the controller of this microService
 *
 * @author jonathan GOUVEIA
 * @version 1.0
 */
@RestController
public class RewardCentralController extends CustomRequestLoggingFilter {

    @Autowired
    private IRewardCentralService rewardCentralService;

    /**
     * This method allows to obtain the reward points earned with an attraction
     *
     * @param attractionId The attraction id
     * @param userId The user id
     * @return An integer corresponding to the number of reward points
     */
    @GetMapping("/attraction-reward-points")
    public int getAttractionRewardPoints(@RequestParam UUID attractionId, @RequestParam UUID userId) {
        return rewardCentralService.getAttractionRewardPoints(attractionId, userId);
    }
}