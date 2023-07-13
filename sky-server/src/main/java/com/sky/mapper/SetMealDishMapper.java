package com.sky.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ClassName SetMealDishMapper
 * @Description TODO
 * @Author XiangHeng
 * @Date 12/7/2023 19:17
 * @Verstion 1.0
 */
@Mapper
public interface SetMealDishMapper {

    /**
     * 根据菜品多个id查询对应的套餐id
     * @param dishIds
     * @return
     */
    List<Long> getSetMealIdsByDishIds(List<Long> dishIds);
}
