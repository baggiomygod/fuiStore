package com.fui.fuistore.api.v2;

import com.fui.fuistore.service.V2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class V2Controller {
    @Autowired(required = true)
    private V2Service vtwoService;
    @GetMapping("")
    public String getV2() {
        return "root v2 8088";
    }
}
