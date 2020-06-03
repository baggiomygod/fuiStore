package com.fui.fuistore.api.v1;

import com.fui.fuistore.dto.PersonDTO;
import com.fui.fuistore.exception.http.ForbiddenException;
import com.fui.fuistore.exception.http.NotFoundException;
import com.fui.fuistore.sample.ISkill;
import com.sun.istack.internal.NotNull;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.constraints.Max;
import java.io.IOException;
import java.util.Map;
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
    @Validated
    public void test(
            @PathVariable @Range(min = 1, max = 10, message = "id不可大于10") Integer id,
            @RequestParam @Length(min = 3, max = 10, message="name长度不符合规则")String name) throws Exception {
        iSkill.r(); // 直接使用
        System.out.println("id:" + id + "---name:" + name);
//        throw new NotFoundException(10001);
//        throw new Exception("test error 测试");
        // 抛出已知异常
//        throw new ForbiddenException(10002);
    }

    @PostMapping("/test2/{id}") // url上参数异常代码如何写
    @Validated
    public PersonDTO test2(
            @PathVariable @Range(min = 2, max = 10, message = "id不可大于10") Integer id,
            @RequestParam @Length(min = 2, max = 4, message = "验证字符串长度是否在给定范围内") String pid, // url参数 ？name=xxx, TODO  如何加上参数校验？
            @RequestBody @Validated PersonDTO person
        )  { // @Validated开启校验
        System.out.println("id:" + id + ";pid:" + pid);
        PersonDTO dto = new PersonDTO();
        System.out.println("dto:" + person);
        dto.setName(person.getName());
        dto.setAge(person.getAge());
        dto.setPassword1(person.getPassword1());
        dto.setPassword2(person.getPassword2());
        System.out.println(person.getSchoolDTO() + "-----" + person.getName() + "," + person.getAge() + "," + person.getPassword1() + "," + person.getPassword1());
//        PersonDTO dto = PersonDTO.builder()
//                                .name("wf")
//                                .age(12)
//                                .build();
        return dto;
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
