package com.lxz.metrics.service;

import com.codahale.metrics.MetricRegistry;

/**
 * Created by xiaolezheng on 15/9/13.
 */

public final class MetricRegistryFactory {
    private static final MetricRegistry METRIC_REGISTRY = new MetricRegistry();

    public static MetricRegistry getInstance(){
        return METRIC_REGISTRY;
    }
}
