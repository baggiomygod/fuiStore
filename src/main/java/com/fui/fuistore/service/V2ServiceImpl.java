package com.fui.fuistore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class V2ServiceImpl implements V2Service {
    @Autowired(required = true)

    public String getV2(){return "v2 test";}
}
