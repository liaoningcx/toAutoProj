package com.auto.domain;

import java.util.Date;
import java.math.BigDecimal;
import java.io.Serializable;

/**
 * 第三次测试表Domain
 * User: 大胖子
 * Date: 2018/9/6 15:28
 **/
public class ThirdTestBy0 implements Serializable {

    private static final long serialVersionUID = -9222833L;

    /**
     * 主键 第三次主键注释
     */
    private Integer thirdid;

    /**
    * 逻辑删除标识 逻辑删除标识
    */
    private Integer yn;

    /**
    * 表列名的注释0
    */
    private String taTestNBA0;
    /**
    * 表列名的注释1
    */
    private String taTestNBA1;
    /**
    * 表列名的注释2
    */
    private String taTestNBA2;
    /**
    * 表列名的注释3
    */
    private String taTestNBA3;
    /**
    * 表列名的注释4
    */
    private String taTestNBA4;


    public Integer getThirdid() {
        return thirdid;
    }

    public void setThirdid(Integer thirdid) {
        this.thirdid = thirdid;
    }

    public Integer getYn() {
        return yn;
    }

    public void setYn(Integer yn) {
        this.yn = yn;
    }

    public String getTaTestNBA0() {
        return taTestNBA0;
    }

    public void setTaTestNBA0(String taTestNBA0) {
        this.taTestNBA0 = taTestNBA0;
    }
    public String getTaTestNBA1() {
        return taTestNBA1;
    }

    public void setTaTestNBA1(String taTestNBA1) {
        this.taTestNBA1 = taTestNBA1;
    }
    public String getTaTestNBA2() {
        return taTestNBA2;
    }

    public void setTaTestNBA2(String taTestNBA2) {
        this.taTestNBA2 = taTestNBA2;
    }
    public String getTaTestNBA3() {
        return taTestNBA3;
    }

    public void setTaTestNBA3(String taTestNBA3) {
        this.taTestNBA3 = taTestNBA3;
    }
    public String getTaTestNBA4() {
        return taTestNBA4;
    }

    public void setTaTestNBA4(String taTestNBA4) {
        this.taTestNBA4 = taTestNBA4;
    }
}
