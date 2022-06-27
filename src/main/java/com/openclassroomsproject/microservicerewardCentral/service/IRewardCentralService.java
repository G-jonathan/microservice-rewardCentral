package com.openclassroomsproject.microservicerewardCentral.service;

import java.util.UUID;

/**
 * @author jonathan GOUVEIA
 * @version 1.0
 */
public interface IRewardCentralService {

    int getAttractionRewardPoints(UUID attractionId, UUID userId);
}