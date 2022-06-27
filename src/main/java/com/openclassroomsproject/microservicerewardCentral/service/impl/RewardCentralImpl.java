package com.openclassroomsproject.microservicerewardCentral.service.impl;

import com.openclassroomsproject.microservicerewardCentral.service.IRewardCentralService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import rewardCentral.RewardCentral;
import java.util.UUID;

/**
 * This class contains the methods allowing to call the functions of the RewardCentral library
 *
 * @author jonathan GOUVEIA
 * @version 1.0
 */
@Service
public class RewardCentralImpl implements IRewardCentralService {

    private static final Logger LOGGER = LoggerFactory.getLogger(RewardCentralImpl.class);
    private final RewardCentral rewardCentral;

    /**
     * Constructor
     *
     * @param rewardCentral The library used by the methods of this class
     */
    public RewardCentralImpl(RewardCentral rewardCentral) {
        this.rewardCentral = rewardCentral;
    }

    /**
     * This method return a number corresponding to the reward points earned with an attraction
     *
     * @param attractionId The attraction id
     * @param userId The user id
     * @return An integer corresponding to the number of reward points
     */
    @Override
    public int getAttractionRewardPoints(UUID attractionId, UUID userId) {
        LOGGER.info("#[MS-RewardCentral]-> Call - SERVICE: getAttractionRewardPoints(UUID attractionId, UUID userId) method ");
        return rewardCentral.getAttractionRewardPoints(attractionId, userId);
    }
}