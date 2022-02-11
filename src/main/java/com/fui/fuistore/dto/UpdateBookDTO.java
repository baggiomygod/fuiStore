package com.fui.fuistore.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
@Data
@NoArgsConstructor
public class UpdateBookDTO {
    @Length(max=50, message="{book.title.length}")
    private String title;

    @Length(max=20, message="{book.author.length}")
    private String author;

    @Length(max = 1000, message = "{book.summary.length}")
    private String summary;

    @Length(max = 100, message = "{book.image.length}")
    private String image;
}
