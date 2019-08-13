package com.test.domain;

import lombok.Data;

@Data
public class Result<T> {

    private String result;

    private String message;

    private T data;

    public Result(String result, String message, T data) {
        this.result = result;
        this.message = message;
        this.data = data;
    }

    public static Result success() {
        return new Result("1", "成功", null);
    }

}
