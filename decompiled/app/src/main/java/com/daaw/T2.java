package com.daaw;

import android.os.Build;
import android.os.ext.SdkExtensions;
import com.revenuecat.purchases.common.UtilsKt;

/* JADX INFO: loaded from: classes.dex */
public final class T2 {
    public static final T2 a = new T2();

    public static final class a {
        public static final a a = new a();

        public final int a() {
            return SdkExtensions.getExtensionVersion(UtilsKt.MICROS_MULTIPLIER);
        }
    }

    public final int a() {
        if (Build.VERSION.SDK_INT >= 30) {
            return a.a.a();
        }
        return 0;
    }
}
