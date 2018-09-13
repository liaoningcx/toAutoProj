package com.auto.dao;

import com.auto.domain.ThirdTestBy1;
import com.auto.dao.ThirdTestBy1Dao;

//功能实现类

import java.util.List;


/**
* 第三次测试表Dao层接口类
* User: 大胖子
* DateTime: 2018/9/6 15:28
**/
public interface ThirdTestBy1Dao {
    /**
    * 添加第三次测试表信息
    * @param thirdTestBy1 第三次测试表Domain
    */
    public void insert(ThirdTestBy1 thirdTestBy1) throws Exception;

    /**
    * 通过主键修改第三次测试表
    * @param thirdTestBy1 第三次测试表Domain
    */
    public void updateByID(ThirdTestBy1 thirdTestBy1) throws Exception;

    /**
    * 根据主键删除第三次测试表
    * @param thirdTestBy1 第三次测试表Domain
    */
    public void deleteByID(ThirdTestBy1 thirdTestBy1) throws Exception;

    /**
    * 根据主键批量删除第三次测试表
    * @param thirdTestBy1List 第三次测试表Domain集合
    */
    public void deleteBatchByIDList(List<ThirdTestBy1> thirdTestBy1List) throws Exception;

    /**
    * 查询第三次测试表列表
    * @param thirdTestBy1 第三次测试表Domain
    * @return 第三次测试表列表
    */
    public List<ThirdTestBy1> select( ThirdTestBy1 thirdTestBy1) throws Exception;

    /**
    * 查询第三次测试表列表
    * @param query 第三次测试表Domain
    * @return 第三次测试表列表个数
    */
    public int selectCount(ThirdTestBy1 query) throws Exception;
}