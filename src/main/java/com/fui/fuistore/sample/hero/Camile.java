package com.fui.fuistore.sample.hero;

import com.fui.fuistore.sample.ISkill;

public class Camile implements ISkill {

    //    public void setSkillName(String skillName) {
//        this.skillName = skillName;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setAge(Integer age) {
//        this.age = age;
//    }
    private String skillName = "Camile R";
    private String name;
    private Integer age;

    public Camile(String name, Integer age) {
        this.name = name;
        this.age = age;
        System.out.println("Camile...");
    }

    public void q() {
        System.out.println("Camile Q");
    }

    public void w() {
        System.out.println("Camile W");
    }

    public void e() {
        System.out.println("Camile E");
    }

    public void r() {
        System.out.println("Camile R");
    }
}
