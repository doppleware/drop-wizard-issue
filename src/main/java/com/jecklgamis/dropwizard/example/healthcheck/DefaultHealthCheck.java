package com.jecklgamis.dropwizard.example.healthcheck;

import com.codahale.metrics.health.HealthCheck;

public class DefaultHealthCheck extends HealthCheck {
    @Override
    protected Result check() throws Exception {
        return Result.healthy();
    }
}
