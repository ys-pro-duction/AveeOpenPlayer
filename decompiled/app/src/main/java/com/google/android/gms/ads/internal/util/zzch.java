package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.os.StrictMode;
import com.daaw.AbstractC4274eT1;
import com.daaw.RO1;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class zzch {
    @Deprecated
    public static Object zza(Context context, Callable callable) {
        try {
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return callable.call();
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (Throwable th) {
            AbstractC4274eT1.zzh("Unexpected exception.", th);
            RO1.c(context).a(th, "StrictModeUtil.runWithLaxStrictMode");
            return null;
        }
    }
}
