package com.fui.fuistore.sample;

import com.fui.fuistore.sample.condition.DianaCondition;
import com.fui.fuistore.sample.condition.IreliaCondition;
import com.fui.fuistore.sample.hero.Irelia;
import com.fui.fuistore.sample.hero.Diana;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HeroConfiguration {
    @Bean
    @Conditional(DianaCondition.class)
    public ISkill diana() {
        return new Diana("Diana", 19);
    }

    @Bean
    @Conditional(IreliaCondition.class)
    public ISkill irelia() {
        return new Irelia();
    }
}
