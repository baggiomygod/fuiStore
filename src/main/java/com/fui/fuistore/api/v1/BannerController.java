package com.fui.fuistore.api.v1;

import com.fui.fuistore.exception.http.NotFoundException;
import com.fui.fuistore.model.Banner;
import com.fui.fuistore.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController // 相当于@Controller + @ResponseBody
@RequestMapping("/banner") // core.configuration.AutoPrefixConfiguration + hack.AutoPrefixUrlMapping 实现读取prefix，
@Validated
public class BannerController {
    @Autowired // 注入Service
    private BannerService bannerService;

    // banner接口
    @GetMapping("/name/{name}")
    public Banner getName(@PathVariable String name) {
        Banner banner = bannerService.getByName(name);
        if(banner == null) {
            throw new NotFoundException(30005);
        }
        return banner;
    }

    @GetMapping("/banner_id/{id}")
    public Banner getName(@PathVariable Long id) {
        Banner banner = bannerService.getById(id);
        if(banner == null) {
            throw new NotFoundException(30005);
        }
        return banner;
    }
}
