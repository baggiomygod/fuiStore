package com.fui.fuistore.dto;

// 接收前端请求test2参数的 类
// 数据传输对象

import com.fui.fuistore.validators.PasswordEqual;
import org.hibernate.validator.constraints.Length;
import org.springframework.lang.NonNull;

import javax.validation.Valid;

// 课程lomBok--@builder 13周1-7
//@builder
//@Getter // 用@Builder时使用Getter保证可以正确的返回
//public class PersonDTO {
//    private String name;
//    private Integer age;
//}

// 课程lomBok 实用注解 13周1-6
//@Data // 生成Getter Setter equals hashCode toString
//@Getter // 生成Getter
//@Setter // 生成Setter
////@AllArgsConstructor // 生成构造函数注解
//@RequiredArgsConstructor // 部分参数不能为空
//@NoArgsConstructor // 无参构造函数
//public class PersonDTO {
//    @NonNull // name不能为空
//    private String name;
//    private Integer age;
//
//    // 构造函数 用
////    public PersonDTO(String name, Integer age) {
////        this.age = age;
////        this.name = name;
////    }
//
//    // 无参构造函数 用@NoArgsConstructor代替
////    public PersonDTO() {
////    }
//}

@PasswordEqual(message="密码不符合规则！", max = 8) // 使用自定义注解
public class PersonDTO {


    @NonNull // name不能为空
    @Length(min=2, max=10, message="限2-10个字符")
    private String name;
    private Integer age;

    private static String password1;
    private static String password2;

    // 级联校验使用valid
    @Valid
    private SchoolDTO schoolDTO;
    // 构造函数 用
    public PersonDTO(String name, Integer age) {
        this.age = age;
        this.name = name;
    }

    public PersonDTO() {
    }

    @NonNull
    public String getName() {
        return name;
    }
    public Integer getAge() {
        return age;
    }
    public static String getStaticPassword1() {
        return password1;
    }

    public static String getStaticPassword2() {
        return password2;
    }
    public void setName(@NonNull String name) {
        this.name = name;
    }
    public void setAge(Integer age) {
        this.age = age;
    }

    public SchoolDTO getSchoolDTO() {
        return schoolDTO;
    }

    public void setPassword1(@NonNull String psw) {
        this.password1 = psw;
    }

    public void setPassword2(@NonNull String psw) {
        this.password2 = psw;
    }

    public String getPassword1() {
        return password1;
    }

    public String getPassword2() {
        return password2;
    }
}
