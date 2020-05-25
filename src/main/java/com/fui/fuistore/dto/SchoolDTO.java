package com.fui.fuistore.dto;

import org.hibernate.validator.constraints.Length;

public class SchoolDTO {
    @Length(min=2, message="最少输入2个字符")
    private String schoolName;

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }
}
