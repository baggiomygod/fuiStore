package com.fui.fuistore.dto;

import org.hibernate.validator.constraints.Length;

public class SchoolDTO {
    @Length(min=2)
    private String schoolName;

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }
}
