package com.fui.fuistore.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented // 使代码里的注释可以加入到文档中
@Retention(RetentionPolicy.RUNTIME) // 表示注解要保留到什么阶段 RUNTIME保留到运行阶段
@Target({ElementType.TYPE, ElementType.FIELD}) // 指定注解用在哪些目标上
@Constraint(validatedBy = PasswordValidator.class)

public @interface PasswordEqual {
    int min() default 6;

    int max() default 12;

    String message() default "请确认输入密码一致！"; // 长度不必皮 如何添加返回字符串

    // 自定义校验必须加上的代码
    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    // 关联类

}
