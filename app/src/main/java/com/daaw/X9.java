package com.daaw;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ServiceInfo;
import android.os.Build;
import com.google.android.gms.ads.AdRequest;

/* JADX INFO: loaded from: classes.dex */
public abstract class X9 extends Service {

    public static class a {
        public static int a() {
            return AdRequest.MAX_CONTENT_URL_LENGTH;
        }
    }

    public static ServiceInfo a(Context context) {
        return context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) X9.class), Build.VERSION.SDK_INT >= 24 ? a.a() | 128 : 640);
    }
}
