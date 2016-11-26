package com.tiny.connect_change;

import android.content.Context;

/**
 * Created by tiny on 16/11/26.
 */
public class ConnectionChangeInit {
    private static Context mContext;

    public static void init(Context context) {
        mContext = context;
    }

    public static Context getContext() {
        return mContext;
    }
}
