package com.lxz.metrics.servlet;

import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.servlets.MetricsServlet;
import com.lxz.metrics.service.MetricRegistryFactory;

import javax.servlet.annotation.WebListener;

@WebListener
public class MyMetricsServletContextListener extends MetricsServlet.ContextListener {

    public static final MetricRegistry METRIC_REGISTRY = MetricRegistryFactory.getInstance();

    @Override
    protected MetricRegistry getMetricRegistry() {
        return METRIC_REGISTRY;
    }

}