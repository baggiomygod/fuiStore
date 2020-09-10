package com.fui.fuistore.api.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("theme")
public class ThemeController {

    @GetMapping("/by/names")
    public String getThemeGroupByNames(@RequestParam(name = "names") String names){
        System.out.println(names);
        return "sss";
    }

}
