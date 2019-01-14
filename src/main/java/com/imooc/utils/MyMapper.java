package com.imooc.utils;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by IntelliJ IDEA.
 * User: LiHanFei
 * Date_Time: 2019-01-1321:03
 * Package_Name:com.imooc.utils
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
