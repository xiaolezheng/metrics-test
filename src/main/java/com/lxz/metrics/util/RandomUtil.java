package com.lxz.metrics.util;

import java.util.concurrent.ThreadLocalRandom;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by xiaolezheng on 15/9/13.
 */

@Slf4j
public final class RandomUtil {
    private static ThreadLocalRandom random = ThreadLocalRandom.current();


    public static int random(int min, int max){
        return random.nextInt(max) % (max - min + 1) + min;
    }

    public static void main(String[] args) {
        int max = 20;
        int min = 10;

        for (int i = 0; i < 10; i++) {

            int s = random.nextInt(max) % (max - min + 1) + min;

            log.info("result: {}", s);
        }
    }
}
