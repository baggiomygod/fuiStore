package com.fui.fuistore.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageResponseVO<T> {
    private Integer total;

    private List<T> items;

    private Integer page;

    private Integer count;

    public static <T> PageResponseVOBuilder<T> builder(){
        return new PageResponseVOBuilder<T>();
    }

    public static class PageResponseVOBuilder<T> {
        private Integer total;
        private List<T> items;
        private Integer page;
        private Integer count;

        PageResponseVOBuilder() {
        }

        public PageResponseVOBuilder<T> total(Integer total) {
            this.total = total;
            return this;
        }

        public PageResponseVOBuilder<T> items(List<T> items) {
            this.items = items;
            return this;
        }

        public PageResponseVOBuilder<T> page(Integer page) {
            this.page = page;
            return this;
        }

        public PageResponseVOBuilder<T> count(Integer count) {
            this.count = count;
            return this;
        }

        public PageResponseVO<T> build() {
            return new PageResponseVO<T>(total, items, page, count);
        }

        public String toString() {
            return "PageResponseVO.PageResponseVOBuilder(total=" + this.total + ", items=" + this.items + ", page=" + this.page + ", count=" + this.count + ")";
        }
    }
}
