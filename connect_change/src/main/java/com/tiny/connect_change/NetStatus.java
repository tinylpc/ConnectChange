package com.tiny.connect_change;

/**
 * Created by tiny on 16/11/26.
 */
public enum NetStatus {

    NO_NET(Constants.NO_NET), HAVE_NET(Constants.HAVE_NET), WIFI(Constants.WIFI), NET_2G(Constants.NET_2G), NET_3G(Constants.NET_3G), NET_4G(Constants.NET_4G);

    private int mType;

    private NetStatus(int type) {
        this.mType = type;
    }

    public int getType() {
        return mType;
    }

}
