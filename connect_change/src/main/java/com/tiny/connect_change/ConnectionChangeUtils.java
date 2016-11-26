package com.tiny.connect_change;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tiny on 16/11/26.
 */
public class ConnectionChangeUtils {

    private static List<Object> objects = new ArrayList<>();

    public static void register(Object o) {
        objects.add(o);
    }

    public static void unregister(Object o) {
        objects.remove(o);
    }

    public static List<Object> getObjects() {
        return objects;
    }
}
