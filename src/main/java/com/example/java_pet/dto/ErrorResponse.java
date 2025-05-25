package com.example.java_pet.dto;

public class ErrorResponse {
    private int status;
    private String error;
    private String message;
    private long timestamp;

    public int getStatus() {
        return status;
    }

    public String getError() {
        return error;
    }

    public String getMessage() {
        return message;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public ErrorResponse(int status, String error, String message, long timestamp) {
        this.status = status;
        this.error = error;
        this.message = message;
        this.timestamp = timestamp;


    }
}
