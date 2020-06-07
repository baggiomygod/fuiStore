package com.fui.fuistore.api.v1;

import com.fui.fuistore.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController // 相当于@Controller + @ResponseBody
@RequestMapping("/banner") // core.configuration.AutoPrefixConfiguration + hack.AutoPrefixUrlMapping 实现读取prefix，
public class BannerController {
    @Autowired // 注入Service
    private BannerService bannerService;
    // banner接口
    @GetMapping("name/{name}")
    public void getName(@PathVariable String name) {

    }
}
