package com.auto.dao;

import com.auto.domain.TaStuPe;
import com.auto.domain.TaStuPePageQueryCondition;

//功能实现类

import java.util.List;


/**
* 测试看看2020Dao层接口类
* User: 大胖子
* DateTime: Thu Apr 30 07:58:28 CST 2020
**/
public interface TaStuPeDao {
    /**
    * 添加测试看看2020信息
    * @param taStuPe 测试看看2020Domain
    */
    public void insert(TaStuPe taStuPe) throws Exception;

    /**
    * 通过主键修改测试看看2020
    * @param taStuPe 测试看看2020Domain
    */
    public boolean updateByID(TaStuPe taStuPe) throws Exception;

    /**
    * 根据主键删除测试看看2020
    * @param taStuPeVID 测试看看2020Domain
    */
    public boolean deleteByID(String taStuPeVID) throws Exception;

    /**
    * 根据主键批量删除测试看看2020
    * @param taStuPeList 测试看看2020Domain集合
    */
    public boolean deleteBatchByIDList(List<TaStuPe> taStuPeList) throws Exception;

    /**
    * 查询测试看看2020列表
    * @param taStuPe 测试看看2020Domain
    * @return 测试看看2020列表
    */
    public List<TaStuPe> select( TaStuPe taStuPe) throws Exception;

    /**
     * 查询测试看看2020列表
     * @param taStuPePageQueryCondition 测试看看2020Domain
     * @return 测试看看2020列表个数
     */
    public int findPageCount(TaStuPePageQueryCondition taStuPePageQueryCondition) throws Exception;

    /**
     * 查询测试看看2020列表
     * @param taStuPePageQueryCondition 测试看看2020Domain
     * @return 测试看看2020列表个数
     */
    public List<TaStuPe> findPage(TaStuPePageQueryCondition taStuPePageQueryCondition) throws Exception;
}