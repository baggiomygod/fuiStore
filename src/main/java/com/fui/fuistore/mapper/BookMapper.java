package com.fui.fuistore.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fui.fuistore.model.BookDO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository // @Repository 它用于将数据访问层 (DAO 层 ) 的类标识为 Spring Bean。
public interface BookMapper<T> extends BaseMapper<T> {
    List<BookDO> selectByTitleLikeKeyword(@Param("q") String q);

    List<BookDO> selectByTitle(@Param("title") String title);
}
