package com.fui.fuistore.dto;

// 接收前端请求test2参数的 类
// 数据传输对象

import org.springframework.lang.NonNull;

// 课程lomBok--@builder 13周1-7
//@builder
//public class PersonDTO {
//    private String name;
//    private Integer age;
//}

// 课程lomBok 实用注解 13周1-6
//@Data // 生成Getter Setter equals hashCode toString
@Gette // 生成Getter
@Setter // 生成Setter
//@AllArgsConstructor // 生成构造函数注解
@RequiredArgsConstructor // 部分参数不能为空
@NoArgsConstructor // 无参构造函数
public class PersonDTO {
    @NonNull // name不能为空
    private String name;
    private Integer age;

    // 构造函数 用
//    public PersonDTO(String name, Integer age) {
//        this.age = age;
//        this.name = name;
//    }

    // 无参构造函数 用@NoArgsConstructor代替
//    public PersonDTO() {
//    }
}
