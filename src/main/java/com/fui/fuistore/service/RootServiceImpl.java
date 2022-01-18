package com.fui.fuistore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RootServiceImpl implements RootService {
    @Autowired(required = true) // 注入

    public String getRoot() {
        return "root 123";
    }


}