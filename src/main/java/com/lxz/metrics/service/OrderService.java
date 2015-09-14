package com.lxz.metrics.service;

import java.util.concurrent.TimeUnit;

import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Service;

import com.codahale.metrics.annotation.Timed;
import com.lxz.metrics.util.RandomUtil;

/**
 * Created by xiaolezheng on 15/9/13.
 */
@Service
@Slf4j
public class OrderService {

    @Timed
    public long create() {
        try {
            TimeUnit.MILLISECONDS.sleep(RandomUtil.random(100, 150));

        } catch (Exception e) {
            log.error("", e);
        }

        return System.currentTimeMillis();

    }

    @Timed
    public long get() {
        try {
            TimeUnit.MILLISECONDS.sleep(RandomUtil.random(50, 100));

        } catch (Exception e) {
            log.error("", e);
        }

        return System.currentTimeMillis();

    }
}
