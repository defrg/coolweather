package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by ZZY on 2018/3/19.
 */

public class Province extends DataSupport {
    private int id;
    private String provinceName;
    private int privinceCode;


    public int getId() {
        return id;
    }

    public int getPrivinceCode() {
        return privinceCode;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrivinceCode(int privinceCode) {
        this.privinceCode = privinceCode;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }
}
