package com.sky.mapper;

import com.sky.entity.DishFlavor;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @ClassName DishFlavorMapper
 * @Description TODO
 * @Author XiangHeng
 * @Date 12/7/2023 17:52
 * @Verstion 1.0
 */
@Mapper
public interface DishFlavorMapper {
    /**
     * 批量插入口味数据
     *
     * @param flavors
     */
    void insertBatch(List<DishFlavor> flavors);

    /**
     * 根据主键删除菜品口味
     *
     * @param dishId
     */
    @Delete("delete from dish_flavor where dish_id=#{id}")
    void deleteByDishId(Long dishId);

    /**
     * 根据id查询菜品对应的口味数据
     * @param dishId
     * @return
     */
    @Select("select * from dish_flavor where dish_id=#{dishId}")
    List<DishFlavor> getByDishId(Long dishId);
}
