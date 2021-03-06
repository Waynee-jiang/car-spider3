package com.fxyz.chebao.mapper;

import com.fxyz.chebao.pojo.car.CarSeries;
import com.fxyz.chebao.pojo.car.CarSeriesExample;
import java.util.List;

public interface CarSeriesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CarSeries record);

    int insertSelective(CarSeries record);

    List<CarSeries> selectByExample(CarSeriesExample example);

    CarSeries selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CarSeries record);

    int updateByPrimaryKey(CarSeries record);
}