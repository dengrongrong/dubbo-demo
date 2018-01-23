package com.dr.dubbo;

import java.util.Date;
/**
 * DemoService 和Impl可以在同一应用中，不同模块，可以直接导入。
 */
public class DemoServiceImpl implements DemoService{

    @Override
    public String welcome(String name, Date time) {
        return "hello! "+name+"\n            "+(new Date()).toString();
    }
}
