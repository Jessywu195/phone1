package com.example.phone1;

import android.telephony.*;
import android.util.*;
import android.widget.TextView;

public class phonelisener extends PhoneStateListener {
    private String tag = "PhoneListenService";
    @Override
    public void onCallStateChanged(int state, String number){
        super.onCallStateChanged(state , number);

        switch (state){
            case TelephonyManager.CALL_STATE_RINGING: Log.i(tag, "响铃+在这里启动录音鸭" + number);break;
            case TelephonyManager.CALL_STATE_OFFHOOK:Log.i(tag, "接听");break;
            case TelephonyManager.CALL_STATE_IDLE: Log.i(tag, "挂断");break;
        }
    }
}
