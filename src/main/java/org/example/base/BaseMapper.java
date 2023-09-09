package org.example.base;

import tk.mybatis.mapper.common.Mapper;

/**
 * mybatis通用Mapper
 * 特别注意，该接口不能被扫描到，否则会出错
 */
public interface BaseMapper<T> extends Mapper<T> {

}