package com.fui.fuistore.api.v1;

import com.fui.fuistore.exception.http.ForbiddenException;
import com.fui.fuistore.exception.http.NotFoundException;
import com.fui.fuistore.sample.ISkill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
// 注解，把某个类或方法打上标记
//@Controller
//@ResponseBody

@RestController // 相当于@Controller + @ResponseBody
@RequestMapping("/banner") // core.configuration.AutoPrefixConfiguration + hack.AutoPrefixUrlMapping 实现读取prefix，
public class BannerController {
    // setter 注入
//    @Autowired
//    public void setDiana(Diana diana) {
//        this.diana = diana;
//    }
//    // 构造函数注入
//    public BannerController(Diana diana){
//        this.diana = diana;
//    }

    // 属性方式注入（不推荐）
    @Autowired // bytype 模式注入方式，byname
    private ISkill iSkill;

    // @Configuration 方式注入
//    private ISkill camile;

    // host:port/v1/banner
    @GetMapping("/test/{id}")
    public void test(@PathVariable Integer id, @RequestParam String name) throws Exception {
        iSkill.r(); // 直接使用

        System.out.println("id:" + id + "name:" + name);
//        throw new NotFoundException(10001);
//        throw new Exception("test error 测试");
        // 抛出已知异常
        throw new ForbiddenException(10002);
    }

    @GetMapping("/test2")
    public String test2()  {
        return "hello world 222!";
    }

    @PostMapping("/test3")
    public String test3() {
        return "post api";
    }

    @RequestMapping(value = "/request_mapping", method = { RequestMethod.GET, RequestMethod.POST })
    public String test4(){
        return "Request Mapping";
    }
}
