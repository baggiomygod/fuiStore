package com.fui.fuistore.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import java.sql.Date;

@Getter
@Setter
@MappedSuperclass // 表明是一个映射的基类： 避免没有值时返回null
public abstract class BaseEntity { // 抽象类 abstract 需要被继承
    @JsonIgnore // JsonIgnore 避免序列化时将这个字段返回到前端，
    private Date createTime;
    @JsonIgnore
    private Date updateTime;
    @JsonIgnore
    private Date deleteTime;
}
