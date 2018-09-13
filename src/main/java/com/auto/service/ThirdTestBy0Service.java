package com.auto.service;

import com.auto.common.Page;

import com.auto.domain.ThirdTestBy0;

//功能实现类

import java.util.List;

/**
* 第三次测试表Service层接口类
* User: 大胖子
* DateTime: 2018/9/6 15:28
**/
public interface ThirdTestBy0Service {

    /**
    * 新增第三次测试表
    * @param thirdTestBy0 第三次测试表Domain
    */
    public void insert(ThirdTestBy0 thirdTestBy0) throws Exception;

    /**
    * 修改第三次测试表
    * @param thirdTestBy0 第三次测试表Domain
    */
    public void updateByID(ThirdTestBy0 thirdTestBy0) throws Exception;

    /**
    * 根据主键删除第三次测试表
    * @param thirdTestBy0 第三次测试表Domain
    */
    public void deleteByID(ThirdTestBy0 thirdTestBy0) throws Exception;

    /**
    * 根据主键批量删除第三次测试表
    * @param thirdTestBy0List 第三次测试表Domain集合
    */
    public void deleteBatchByIDList(List<ThirdTestBy0> thirdTestBy0List) throws Exception;

    /**
    * 查询第三次测试表列表
    * @param thirdTestBy0 第三次测试表Domain
    * @return 第三次测试表列表
    */
    public List<ThirdTestBy0> select( ThirdTestBy0 thirdTestBy0) throws Exception;

    /**
    * 分页查询第三次测试表列表
    * @param thirdTestBy0 第三次测试表Domain
    * @return 第三次测试表列表
    */
    public Page<ThirdTestBy0> findThirdTestBy0Page( ThirdTestBy0 thirdTestBy0) throws Exception;

}
