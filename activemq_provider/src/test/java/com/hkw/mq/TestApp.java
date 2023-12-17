package com.hkw.mq;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jms.core.JmsMessagingTemplate;

@SpringBootTest
public class TestApp {

    //JmsMessagingTemplate: 用于工具类发送消息
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    //是点对点模式还是消息订阅模式，在yml文件修改
    @Test
    public void ptpSender(){
        /**
         * 参数一：队列的名称或主题名称
         * 参数二：消息内容
         */
        jmsMessagingTemplate.convertAndSend("springboot_queue_top",
                "spring boot message");
    }
}
