package com.example.retro;

import java.util.ArrayList;

public class ServiceListApiResponse {
    private boolean status;
    private String action;
    private String message;
    private ArrayList<ServicesList> responce;

    public boolean isStatus() {
        return status;
    }

    public String getAction() {
        return action;
    }

    public String getMessage() {
        return message;
    }
    public ArrayList<ServicesList> getResponce() {
        return responce;
    }
}
