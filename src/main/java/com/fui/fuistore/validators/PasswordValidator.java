package com.fui.fuistore.validators;

import com.fui.fuistore.dto.PersonDTO;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

// 第一个参数：自定义注解； 第二个参数：自定义注解修饰的目标的类型 比如：PersonDTO
public class PasswordValidator implements ConstraintValidator<PasswordEqual, PersonDTO> {
    private int min;
    private int max;

    @Override
    public void initialize(PasswordEqual constraintAnnotation) {
        this.min = constraintAnnotation.min();
        this.max = constraintAnnotation.max();
    }

    // 实现ConstraintValidator接口的一个方法
    @Override
    public boolean isValid(PersonDTO personDTO, ConstraintValidatorContext constraintValidatorContext) {
        String password1 = PersonDTO.getStaticPassword1();
        String password2 = PersonDTO.getStaticPassword2();
        // 密码匹配
        boolean match = password1.equals(password2);

        // 长度匹配
        boolean MatchMinLen1 = password1.length() > this.min;
        boolean MatchMaxLen1 = password1.length() < this.max;
        boolean MatchMinLen2 = password2.length() > this.min;
        boolean MatchMaxLen2 = password2.length() < this.max;

        System.out.println("len:" + password1.length() + "--" + this.min);
        System.out.println("len:" + password2.length() + "--" + this.max);
        boolean resultMatch = match && MatchMinLen1 && MatchMaxLen1 && MatchMinLen2 && MatchMaxLen2;
        return resultMatch;
    }
}
