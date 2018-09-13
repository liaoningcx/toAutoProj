package com.auto.service.impl;

import com.auto.common.Page;

import com.auto.domain.ThirdTestBy0;
import com.auto.service.ThirdTestBy0Service;
import com.auto.dao.ThirdTestBy0Dao;

//功能实现类
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

/**
 * 第三次测试表Service层实现类
 * User: 大胖子
 * DateTime: 2018/9/6 15:28
 **/
@Service
public class ThirdTestBy0ServiceImpl implements ThirdTestBy0Service {

    @Autowired
    private ThirdTestBy0Dao thirdTestBy0Dao;

    /**
     * 新增第三次测试表
     * @param thirdTestBy0 第三次测试表Domain
     */
    @Override
    public void insert(ThirdTestBy0 thirdTestBy0) throws Exception{
        thirdTestBy0Dao.insert(thirdTestBy0);
    }

    /**
     * 修改第三次测试表
     * @param thirdTestBy0 第三次测试表Domain
     */
    @Override
    public void updateByID(ThirdTestBy0 thirdTestBy0) throws Exception{
        thirdTestBy0Dao.updateByID(thirdTestBy0);
    }

    /**
     * 根据主键删除第三次测试表
     * @param thirdTestBy0 第三次测试表Domain
     */
    @Override
    public void deleteByID(ThirdTestBy0 thirdTestBy0) throws Exception{
        thirdTestBy0Dao.deleteByID(thirdTestBy0);
    }

    /**
     * 根据主键批量删除第三次测试表
     * @param thirdTestBy0List 第三次测试表Domain集合
     */
    @Override
    public void deleteBatchByIDList(List<ThirdTestBy0> thirdTestBy0List) throws Exception{
        thirdTestBy0Dao.deleteBatchByIDList(thirdTestBy0List);
    }

    /**
     * 查询第三次测试表列表
     * @param thirdTestBy0 第三次测试表Domain
     * @return 第三次测试表列表
     */
    @Override
    public List<ThirdTestBy0> select( ThirdTestBy0 thirdTestBy0) throws Exception{
        return thirdTestBy0Dao.select(thirdTestBy0);
    }

    /**
    * 分页查询第三次测试表列表
    * @param thirdTestBy0 第三次测试表Domain
    * @return 第三次测试表列表
    */
    @Override
    public Page<ThirdTestBy0> findThirdTestBy0Page(ThirdTestBy0 query) throws Exception{
        Page<ThirdTestBy0> thirdTestBy0Page = new Page<ThirdTestBy0>();
        int count = thirdTestBy0Dao.selectCount(query);
        if(count>0){
            thirdTestBy0Page.setTotalRow(count);
            thirdTestBy0Page.refresh();
            thirdTestBy0Page.setResult(thirdTestBy0Dao.select(query));
            return thirdTestBy0Page;
        }else {
            return null;
        }
    }
}
