package com.fui.fuistore.api.v1;

import com.fui.fuistore.service.RootService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class RootController {
    @Autowired(required = true)
    private RootService rootService;

    @GetMapping("")
    public String getRoot() {
        return "root v1 8088";
    }

}
