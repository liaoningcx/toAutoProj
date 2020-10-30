package com.auto.service.impl;

import com.auto.common.Page;

import com.auto.domain.TaStuPe;
import com.auto.domain.TaStuPePageQueryCondition;
import com.auto.service.TaStuPeService;
import com.auto.dao.TaStuPeDao;

//功能实现类
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * 测试看看2020Service层实现类
 * User: 大胖子
 * DateTime: Thu Apr 30 07:58:28 CST 2020
 **/
@Service
public class TaStuPeServiceImpl implements TaStuPeService {

    @Autowired
    private TaStuPeDao taStuPeDao;

    /**
     * 新增测试看看2020
     * @param taStuPe 测试看看2020Domain
     */
    @Override
    public void insert(TaStuPe taStuPe) throws Exception{
        taStuPeDao.insert(taStuPe);
    }

    /**
     * 修改测试看看2020
     * @param taStuPe 测试看看2020Domain
     */
    @Override
    public void updateByID(TaStuPe taStuPe) throws Exception{
        taStuPeDao.updateByID(taStuPe);
    }

    /**
     * 根据主键删除测试看看2020
     * @param taStuPeVID 测试看看2020Domain
     */
    @Override
    public void deleteByID(String taStuPeVID) throws Exception{
        taStuPeDao.deleteByID(taStuPeVID);
    }

    /**
     * 根据主键批量删除测试看看2020
     * @param taStuPeList 测试看看2020Domain集合
     */
    @Override
    public void deleteBatchByIDList(List<TaStuPe> taStuPeList) throws Exception{
        taStuPeDao.deleteBatchByIDList(taStuPeList);
    }

    /**
     * 查询测试看看2020列表
     * @param taStuPe 测试看看2020Domain
     * @return 测试看看2020列表
     */
    @Override
    public List<TaStuPe> select( TaStuPe taStuPe) throws Exception{
        return taStuPeDao.select(taStuPe);
    }

    /**
    * 分页查询测试看看2020列表
    * @param taStuPePageCondition 测试看看2020Domain
    * @return 测试看看2020列表
    */
    @Override
    public Page<TaStuPe> findTaStuPePage(TaStuPePageQueryCondition taStuPePageCondition) throws Exception{
        Page<TaStuPe> taStuPePage = new Page<TaStuPe>();
        int count = taStuPeDao.findPageCount(taStuPePageCondition);
        if(count>0){
            taStuPePage.setTotalRowCount(count);
            taStuPePage.setResult(taStuPeDao.findPage(taStuPePageCondition));
            return taStuPePage;
        }else {
            return null;
        }
    }
}
