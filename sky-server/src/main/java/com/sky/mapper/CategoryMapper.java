package com.sky.mapper;

import com.github.pagehelper.Page;
import com.sky.dto.CategoryPageQueryDTO;
import com.sky.entity.Category;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CategoryMapper {
    Page<Category> pageQuery(CategoryPageQueryDTO categoryPageQueryDTO);

    @Insert("insert into category (name, sort, type, create_time, update_time, create_user, update_user, status)" +
            "values " +
            "(#{name},#{sort},#{type},#{createTime},#{updateTime},#{createUser},#{updateUser},#{status})")
    void insert(Category category);

    void update(Category category);

    @Delete("delete from category where id = #{id}")
    void delete(Category category);
}
