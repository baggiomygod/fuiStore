package com.fui.fuistore.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Getter
@Setter
//@Table(name = "banner_item", schema = "fuistore", catalog = "")
public class BannerItem extends BaseEntity {
    @Id
    private Long id;
    private Long bannerId;
    private String img;
    private String keyword;
    private short type;
    private String name;
}
