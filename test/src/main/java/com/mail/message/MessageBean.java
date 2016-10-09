package com.mail.message;

import com.mail.message.api.Message;

/**
 * Created by Julia on 09.10.2016.
 */
public class MessageBean implements Message {
    public String getText() {
        return "Hello world!";
    }
}
