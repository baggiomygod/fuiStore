package com.fui.fuistore.service;

import com.fui.fuistore.model.Banner;
import com.fui.fuistore.repository.BannerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// 层与层之间的连接通过interface接口 实现，
// 实际情况可以不需要接口---如果改动不大

/**
 * Controller 调用 service
 */
@Service
public class BannerServiceImpl implements BannerService {
    @Autowired(required = true) // 注入
    private BannerRepository bannerRepository;

    public Banner getByName(String name) {
        return bannerRepository.findOneByName(name);
    }

    public Banner getById(Long id) {
        return bannerRepository.findOneById(id);
    }

}

// 策略模式时 必须要使用interface
