package com.mail.message.configs;

import com.mail.message.api.Message;
import com.mail.message.MessageBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Julia on 09.10.2016.
 */
@Configuration
@ComponentScan(basePackages = "com.mail")
public class MessageConfig {
    @Bean(name = "message")
    public Message message(){
        return new MessageBean();
    }
}