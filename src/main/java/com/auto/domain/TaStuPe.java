package com.auto.domain;

import java.util.Date;
import java.math.BigDecimal;
import java.io.Serializable;

/**
 * 测试看看2020Domain
 * User: 大胖子
 * Date: Thu Apr 30 07:58:28 CST 2020
 **/
public class TaStuPe implements Serializable {

    private static final long serialVersionUID = -13248L;

    /**
     * 主键 主键
     */
    private String vID;

    /**
    * 逻辑删除标识 逻辑删除标识
    */
    private Integer delflag;

    /**
    * 业务列的数据库的备注0
    */
    private String taTestNBA0;
    /**
    * 业务列的数据库的备注1
    */
    private String taTestNBA1;
    /**
    * 业务列的数据库的备注2
    */
    private String taTestNBA2;
    /**
    * 业务列的数据库的备注3
    */
    private String taTestNBA3;
    /**
    * 业务列的数据库的备注4
    */
    private String taTestNBA4;



    public String getVID() {
        return vID;
    }

    public void setVID(String vID) {
        this.vID = vID;
    }

    public Integer getDelflag() {
        return delflag;
    }

    public void setDelflag(Integer delflag) {
        this.delflag = delflag;
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
