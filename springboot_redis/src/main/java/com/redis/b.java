package com.redis;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * @author: shimingming
 * @create: 2018-10-31
 * @description:
 **/
public class b {

    public static void main(String[] args) {

//        getDataFromMqMessage();


//        System.out.println(System.currentTimeMillis() / 1000);




    }

    private static void getDataFromMqMessage() {
        String mq="{\"msgid\":\"rabbit.send.5bd6c5bb58d451540801979\",\"data\":{\"InsuredOrderId\":\"1540801979296974016\",\"InsuredPerson\":\"\\u5317\\u4eac\\u53f8\\u673a1\",\"InsuredSex\":1,\"InsuredIdCard\":\"142625197711111111\",\"InsuredPhone\":\"11088881110\",\"AdcId\":1,\"InsuredArea\":\"\\u5317\\u4eac\\u7ba1\\u7406\\u533a\",\"InsuredType\":8,\"DriverId\":2001123,\"DriverName\":\"\\u5317\\u4eac\\u53f8\\u673a1\",\"DriverSex\":1,\"DriverIdCard\":\"142625197711111111\",\"DriverPhone\":\"11088881110\",\"Source\":\"yunniao\"}}\n";
        JSONObject jsonObject = JSON.parseObject(mq);
        String data = jsonObject.getString("data");
        System.out.println(data);
    }
}
