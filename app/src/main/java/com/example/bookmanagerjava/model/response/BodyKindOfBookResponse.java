package com.example.bookmanagerjava.model.response;

import com.example.bookmanagerjava.model.KindOfBook;
import com.example.bookmanagerjava.model.Message;

import java.util.List;

public class BodyKindOfBookResponse {
    private List<KindOfBook> data;
    private Message message;

    public List<KindOfBook> getData() {
        return data;
    }

    public Message getMessage() {
        return message;
    }
}
