package com.example.bookmanagerjava.constant;

public interface ApiCallback<T> {
    void onSuccess(T data);

    void onError(Throwable t);
}
