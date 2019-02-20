/**
 * Copyright (C), 2015-2019, 重庆了赢科技有限公司
 * FileName: SX
 * Author:   萧毅
 * Date:     2019/2/19 16:32
 * Description:
 */
package com.snow.cxfclient;


import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

public class SX {


    private static final String url="http://127.0.0.1:8080/soap/user?wsdl";
    private static final String name2="http://service.cxfserver.snow.com/";
    private static final String name="http://cxf.apache.org/";
    private static final String method="getUserName";


    @Test
    public void test(){



      System.out.println(JSONObject.toJSONString(CxfUtils.invoke(url,name,method,"is")));




    }






}