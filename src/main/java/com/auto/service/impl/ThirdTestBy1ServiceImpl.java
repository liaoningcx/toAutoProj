package com.auto.service.impl;

import com.auto.common.Page;

import com.auto.domain.ThirdTestBy1;
import com.auto.service.ThirdTestBy1Service;
import com.auto.dao.ThirdTestBy1Dao;

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
public class ThirdTestBy1ServiceImpl implements ThirdTestBy1Service {

    @Autowired
    private ThirdTestBy1Dao thirdTestBy1Dao;

    /**
     * 新增第三次测试表
     * @param thirdTestBy1 第三次测试表Domain
     */
    @Override
    public void insert(ThirdTestBy1 thirdTestBy1) throws Exception{
        thirdTestBy1Dao.insert(thirdTestBy1);
    }

    /**
     * 修改第三次测试表
     * @param thirdTestBy1 第三次测试表Domain
     */
    @Override
    public void updateByID(ThirdTestBy1 thirdTestBy1) throws Exception{
        thirdTestBy1Dao.updateByID(thirdTestBy1);
    }

    /**
     * 根据主键删除第三次测试表
     * @param thirdTestBy1 第三次测试表Domain
     */
    @Override
    public void deleteByID(ThirdTestBy1 thirdTestBy1) throws Exception{
        thirdTestBy1Dao.deleteByID(thirdTestBy1);
    }

    /**
     * 根据主键批量删除第三次测试表
     * @param thirdTestBy1List 第三次测试表Domain集合
     */
    @Override
    public void deleteBatchByIDList(List<ThirdTestBy1> thirdTestBy1List) throws Exception{
        thirdTestBy1Dao.deleteBatchByIDList(thirdTestBy1List);
    }

    /**
     * 查询第三次测试表列表
     * @param thirdTestBy1 第三次测试表Domain
     * @return 第三次测试表列表
     */
    @Override
    public List<ThirdTestBy1> select( ThirdTestBy1 thirdTestBy1) throws Exception{
        return thirdTestBy1Dao.select(thirdTestBy1);
    }

    /**
    * 分页查询第三次测试表列表
    * @param thirdTestBy1 第三次测试表Domain
    * @return 第三次测试表列表
    */
    @Override
    public Page<ThirdTestBy1> findThirdTestBy1Page(ThirdTestBy1 query) throws Exception{
        Page<ThirdTestBy1> thirdTestBy1Page = new Page<ThirdTestBy1>();
        int count = thirdTestBy1Dao.selectCount(query);
        if(count>0){
            thirdTestBy1Page.setTotalRow(count);
            thirdTestBy1Page.refresh();
            thirdTestBy1Page.setResult(thirdTestBy1Dao.select(query));
            return thirdTestBy1Page;
        }else {
            return null;
        }
    }
}
