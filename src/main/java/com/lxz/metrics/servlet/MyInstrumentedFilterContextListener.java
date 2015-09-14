package com.lxz.metrics.servlet;

import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.servlet.InstrumentedFilterContextListener;
import com.lxz.metrics.service.MetricRegistryFactory;

import javax.servlet.annotation.WebListener;

@WebListener
public class MyInstrumentedFilterContextListener extends InstrumentedFilterContextListener {
    public static final MetricRegistry REGISTRY = MetricRegistryFactory.getInstance();

    @Override
    protected MetricRegistry getMetricRegistry() {
        return REGISTRY;
    }
}