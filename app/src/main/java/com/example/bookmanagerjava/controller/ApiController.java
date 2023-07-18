package com.example.bookmanagerjava.controller;

import com.example.bookmanagerjava.api.ApiService;
import com.example.bookmanagerjava.constant.ApiCallback;
import com.example.bookmanagerjava.constant.RetrofitRequest;
import com.example.bookmanagerjava.model.KindOfBook;
import com.example.bookmanagerjava.model.User;
import com.example.bookmanagerjava.model.response.BodyKindOfBookResponse;
import com.example.bookmanagerjava.model.response.BodyLoginResponse;
import com.example.bookmanagerjava.model.response.BodyResponseAddKindOfBook;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ApiController {
    private ApiService apiService;

    public ApiController() {
        apiService = RetrofitRequest.getRetrofitInstance().create(ApiService.class);
    }

    public void login(User user, final ApiCallback<BodyLoginResponse> callback) {
        apiService.login(user).enqueue(new Callback<BodyLoginResponse>() {
            @Override
            public void onResponse(Call<BodyLoginResponse> call, Response<BodyLoginResponse> response) {
                if (response.isSuccessful()) {
                    callback.onSuccess(response.body());
                } else {
                    callback.onError(new Exception("Failed to fetch data"));
                }
            }

            @Override
            public void onFailure(Call<BodyLoginResponse> call, Throwable t) {
                callback.onError(t);
            }
        });
    }

    public void getAllListKindOfBook(final ApiCallback<BodyKindOfBookResponse> callback) {
        apiService.getListKindOfBook().enqueue(new Callback<BodyKindOfBookResponse>() {
            @Override
            public void onResponse(Call<BodyKindOfBookResponse> call, Response<BodyKindOfBookResponse> response) {
                if (response.isSuccessful()) {
                    callback.onSuccess(response.body());
                } else {
                    callback.onError(new Exception("Failed to fetch data"));
                }
            }

            @Override
            public void onFailure(Call<BodyKindOfBookResponse> call, Throwable t) {
                callback.onError(t);
            }
        });
    }

    public void addKindOfBook(KindOfBook kindOfBook, final ApiCallback<BodyResponseAddKindOfBook> callback) {
        apiService.addKindOfBook(kindOfBook).enqueue(new Callback<BodyResponseAddKindOfBook>() {
            @Override
            public void onResponse(Call<BodyResponseAddKindOfBook> call, Response<BodyResponseAddKindOfBook> response) {
                if (response.isSuccessful()) {
                    callback.onSuccess(response.body());
                } else {
                    callback.onError(new Exception("Failed to fetch data"));
                }
            }

            @Override
            public void onFailure(Call<BodyResponseAddKindOfBook> call, Throwable t) {
                callback.onError(t);
            }
        });
    }

    public void deleteKindOfBook(String id, final ApiCallback<BodyResponseAddKindOfBook> callback) {
        apiService.deleteKindOfBook(id).enqueue(new Callback<BodyResponseAddKindOfBook>() {
            @Override
            public void onResponse(Call<BodyResponseAddKindOfBook> call, Response<BodyResponseAddKindOfBook> response) {
                if (response.isSuccessful()) {
                    callback.onSuccess(response.body());
                } else {
                    callback.onError(new Exception("Failed to fetch data"));
                }
            }

            @Override
            public void onFailure(Call<BodyResponseAddKindOfBook> call, Throwable t) {
                callback.onError(t);
            }
        });
    }

    public void updateKindOfBook(String id, KindOfBook kindOfBook, final ApiCallback<BodyResponseAddKindOfBook> callback) {
        apiService.updateKindOfBook(id, kindOfBook).enqueue(new Callback<BodyResponseAddKindOfBook>() {
            @Override
            public void onResponse(Call<BodyResponseAddKindOfBook> call, Response<BodyResponseAddKindOfBook> response) {
                if (response.isSuccessful()) {
                    callback.onSuccess(response.body());
                } else {
                    callback.onError(new Exception("Failed to fetch data"));
                }
            }

            @Override
            public void onFailure(Call<BodyResponseAddKindOfBook> call, Throwable t) {
                callback.onError(t);
            }
        });
    }
}
