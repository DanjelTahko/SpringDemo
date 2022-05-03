package com.example.springdemo;

import lombok.Data;

@Data
public class Response {
    private String message;
    private Boolean status;

    public Response(){}

    public Response(String message, Boolean status) {
        this.message = message;
        this.status = status;
    }

    public void setMessage(String msg) {
        this.message = msg;
    }

    public String getMessage() {
        return message;
    }

    public void setStatus(Boolean stat) {
        this.status = stat;
    }

    public Boolean getStatus() {
        return status;
    }
}
