package com.fui.fuistore.service;

import org.springframework.stereotype.Service;

// 层与层之间的连接通过interface接口 实现，
// 实际情况可以不需要接口---如果改动不大
@Service
public class BannerServiceImpl implements BannerService {
    public void getByName(String name) {

    }
}

// 策略模式时 必须要使用interface
