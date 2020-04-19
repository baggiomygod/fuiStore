package com.fui.fuistore.sample.hero;

import com.fui.fuistore.sample.ISkill;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component // 自动把类加入到容器中
//@Primary
public class Diana implements ISkill {
    private String skillName = "Diana R";
    private String name;
    private Integer age;
    public Diana(String name, Integer age){
        this.name = name;
        this.age = age;
        System.out.println("Diana...");
    }
    public void q(){
        System.out.println("Diana Q");
    }
    public void w(){
        System.out.println("Diana W");
    }
    public void e(){
        System.out.println("Diana E");
    }
    public void r(){
        System.out.println("Diana R");
    }
}