package com.example.phone1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class OutCallReceiver extends BroadcastReceiver {
    String tag = "PhoneListenService";
    @Override
    public void onReceive(Context context, Intent intent) {
        String outphone = getResultData();
        Log.i(tag,"outphone:" + outphone); //拨号的时候就会响应
    }
}
