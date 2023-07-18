package com.example.bookmanagerjava.model.response;

import com.example.bookmanagerjava.model.Message;
import com.example.bookmanagerjava.model.User;

public class BodyLoginResponse {
    private User data;
    private Message message;

    public User getData() {
        return data;
    }

    public Message getMessage() {
        return message;
    }
}
