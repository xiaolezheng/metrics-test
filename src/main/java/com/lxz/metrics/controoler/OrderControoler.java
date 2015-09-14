package com.lxz.metrics.controoler;

import com.lxz.metrics.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by xiaolezheng on 15/9/13.
 */
@Controller
@RequestMapping("order")
@Slf4j
public class OrderControoler {
    @Resource
    private OrderService orderService;

    @ResponseBody
    @RequestMapping(value="create")
    public Object create(String order){
        return orderService.create();

    }

    @ResponseBody
    @RequestMapping(value="get")
    public Object get(String order){
        return orderService.get();
    }
}
