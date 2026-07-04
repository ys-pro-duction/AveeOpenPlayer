package com.daaw;

import android.os.StrictMode;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DE1 {
    public static Object a(CO2 co2) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            return co2.zza();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
