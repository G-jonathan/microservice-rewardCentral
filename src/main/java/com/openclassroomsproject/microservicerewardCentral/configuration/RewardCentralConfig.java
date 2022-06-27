package com.openclassroomsproject.microservicerewardCentral.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import rewardCentral.RewardCentral;

/**
 * Spring Configuration class
 *
 * @author jonathan GOUVEIA
 * @version 1.0
 */
@Configuration
public class RewardCentralConfig {

    /**
     * Allows to load the library in the spring context
     *
     * @return The library used by this microservice
     */
    @Bean
    public RewardCentral getRewardCentral() {
        return new RewardCentral();
    }
}