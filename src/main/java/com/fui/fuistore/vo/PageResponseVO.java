package com.fui.fuistore.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PageResponseVO<T> {
    private Integer total;
    private List<T> items;
    private Integer page;
    private Integer count;
}
