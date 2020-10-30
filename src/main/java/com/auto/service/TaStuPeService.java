package com.auto.service;

import com.auto.common.Page;

import com.auto.domain.TaStuPe;
import com.auto.domain.TaStuPePageQueryCondition;

//功能实现类

import java.util.List;

/**
* 测试看看2020Service层接口类
* User: 大胖子
* DateTime: Thu Apr 30 07:58:28 CST 2020
**/
public interface TaStuPeService {

    /**
    * 新增测试看看2020
    * @param taStuPe 测试看看2020Domain
    */
    public void insert(TaStuPe taStuPe) throws Exception;

    /**
    * 修改测试看看2020
    * @param taStuPe 测试看看2020Domain
    */
    public void updateByID(TaStuPe taStuPe) throws Exception;

    /**
    * 根据主键删除测试看看2020
    * @param taStuPeVID 测试看看2020Domain
    */
    public void deleteByID(String taStuPeVID) throws Exception;

    /**
    * 根据主键批量删除测试看看2020
    * @param taStuPeList 测试看看2020Domain集合
    */
    public void deleteBatchByIDList(List<TaStuPe> taStuPeList) throws Exception;

    /**
    * 查询测试看看2020列表
    * @param taStuPe 测试看看2020Domain
    * @return 测试看看2020列表
    */
    public List<TaStuPe> select( TaStuPe taStuPe) throws Exception;

    /**
    * 分页查询测试看看2020列表
    * @param taStuPe 测试看看2020Domain
    * @return 测试看看2020列表
    */
    public Page<TaStuPe> findTaStuPePage(TaStuPePageQueryCondition taStuPe) throws Exception;

}
