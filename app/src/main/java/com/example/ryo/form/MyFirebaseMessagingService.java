package com.example.ryo.form;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.util.Log;

import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ryo on 4/20/17.
 */

public class MyFirebaseMessagingService extends FirebaseMessagingService {

    private static final String TAG = "MyFirebaseService";

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {

        Log.d(TAG, "From:" + remoteMessage.getFrom());
        //Log.d(TAG, "Message Notification Body: " + remoteMessage.getNotification().getBody());

        if (remoteMessage.getData().size() > 0){
            Log.d(TAG, "message data payload: " + remoteMessage.getData());
        }

       if (remoteMessage.getNotification() !=null) {
           Log.d(TAG, "Message Notification Body: " + remoteMessage.getNotification().getBody());

        }

    }}
