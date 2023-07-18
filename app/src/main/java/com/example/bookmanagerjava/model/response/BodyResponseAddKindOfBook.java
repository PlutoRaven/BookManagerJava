package com.example.bookmanagerjava.model.response;

import com.example.bookmanagerjava.model.KindOfBook;
import com.example.bookmanagerjava.model.Message;

public class BodyResponseAddKindOfBook {
    private KindOfBook data;
    private Message message;

    public KindOfBook getData() {
        return data;
    }

    public Message getMessage() {
        return message;
    }
}
