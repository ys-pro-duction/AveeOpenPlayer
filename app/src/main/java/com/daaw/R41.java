package com.daaw;

import android.os.Trace;

/* JADX INFO: loaded from: classes.dex */
public abstract class R41 {
    public static void a(String str) {
        Trace.beginSection(str);
    }

    public static void b() {
        Trace.endSection();
    }
}
