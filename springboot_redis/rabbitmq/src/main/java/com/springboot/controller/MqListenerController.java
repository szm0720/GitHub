package com.springboot.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;


/**
 * @author: shimingming
 * @create: 2018-10-23
 * @description:
 **/

@Component
@Slf4j
public class MqListenerController {

    @RabbitHandler
    @RabbitListener(queues = "ha.firmiana.proxy.createInsurance")
    public void createInsurance(byte[] bytes) {

        String jsonStr="";
        try {
            jsonStr=byteArrayToStr(bytes);
            //字节转换
            log.info("梧桐创建订单队列createInsurance 接收到参数:{}",jsonStr);
            log.info("createInsurance over");
        } catch (Exception e) {
            log.error("createInsurance error,{},传入参数:{}",e.toString(),jsonStr);
        }
    }


    /**
     * byte[] to String
     * @param byteArray
     * @return
     */
    private  String byteArrayToStr(byte[] byteArray) {
        if (byteArray == null) {
            return null;
        }
        String str = new String(byteArray);
        return str;
    }
}
