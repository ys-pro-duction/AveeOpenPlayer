package com.daaw;

import android.os.Binder;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class S83 {
    public static Object a(W83 w83) {
        try {
            return w83.zza();
        } catch (SecurityException unused) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return w83.zza();
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
    }
}
