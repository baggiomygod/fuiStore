package com.fui.fuistore.repository;

import com.fui.fuistore.model.Banner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * repository 用于操作数据库
 * 在service层调用 repository
 */
@Repository
public interface BannerRepository extends JpaRepository<Banner, Long> {
    // 通过id查询banner
    Banner findOneById(Long id);

    Banner findOneByName(String name);
}
