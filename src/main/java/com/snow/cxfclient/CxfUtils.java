/**
 * Copyright (C), 2015-2019, 重庆了赢科技有限公司
 * FileName: CxfUtils
 * Author:   萧毅
 * Date:     2019/2/19 10:25
 * Description:
 */
package com.snow.cxfclient;


import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

import javax.xml.namespace.QName;

public class CxfUtils {



    /**
     * 接口调用
     *
     * @param wsdlUrl
     * @param namespaceURI
     * @param methodName
     * @param
     * @return
     */
    public static String invoke(String wsdlUrl, String namespaceURI, String methodName, Object... inputObj) {
        JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
        Client client = dcf.createClient(wsdlUrl);
        QName name = new QName(namespaceURI, methodName);
        Object[] objects = null;
        try {
            objects = client.invoke(name, inputObj);
        } catch (Exception e) {
            e.printStackTrace();
            return "接口服务请求失败";

        }

        return (String)objects[0];
    }







}