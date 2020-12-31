package com.rationalteam.reaymixcommon;

public class ServerMessage {
    String message;
    String details;

    public ServerMessage() {
    }

    public ServerMessage(String message) {
        this.message = message;
    }

    public ServerMessage(String message, String details) {
        this.message = message;
        this.details = details;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
