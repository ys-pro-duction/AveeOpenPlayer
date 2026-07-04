package com.daaw;

import android.content.Context;

/* JADX INFO: renamed from: com.daaw.vt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9164vt {
    public static final String[] a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    public static boolean a(Context context, Throwable th) {
        try {
            AbstractC7506py0.l(context);
            AbstractC7506py0.l(th);
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
