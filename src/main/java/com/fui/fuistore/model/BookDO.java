package com.fui.fuistore.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
//Serializable: 序列化，
@Data
@TableName("book")
@EqualsAndHashCode(callSuper = true)
public class BookDO extends BaseModel implements Serializable {
//    被final修饰的 不能被继承
    private static final long serialVersionUID = 1L;

    private String title;

    private String author;

    private String summary;

    private String image;
}
