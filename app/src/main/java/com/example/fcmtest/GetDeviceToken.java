package com.example.fcmtest;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;
import com.google.firebase.messaging.FirebaseMessagingService;

public class GetDeviceToken extends FirebaseInstanceIdService {

    public void onTokenRefresh(String s) {
        String device_token = FirebaseInstanceId.getInstance().getToken();
        Log.d("Device Token: ", device_token);
    }

}
