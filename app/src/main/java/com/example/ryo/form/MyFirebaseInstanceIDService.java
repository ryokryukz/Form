package com.example.ryo.form;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;
/**
 * Created by ryo on 4/19/17.
 */

public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {

    private static final String TAG = "MyFirebaseIIDService";

    @Override
    public void onTokenRefresh(){

        String refreshToken = FirebaseInstanceId.getInstance().getToken();

        Log.d(TAG, "RefreshedToken: " + refreshToken);

        storeToken(refreshToken);
    }
        private void storeToken(String token){
           //SharedPrefManager.getInstance(getApplicationContext()).saveDeviceToken(token);
        }
}
