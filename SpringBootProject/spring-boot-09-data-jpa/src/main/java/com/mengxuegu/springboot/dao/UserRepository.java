package com.mengxuegu.springboot.dao;

import com.mengxuegu.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 自定义接口继承JpaRepository，就会有crud操作且分页排序 等功能
 * @Auther: 梦学谷
 */
// 指定的泛型<操作的实体类，主键的数据类型>
public interface UserRepository extends JpaRepository<User, Integer> {
}
