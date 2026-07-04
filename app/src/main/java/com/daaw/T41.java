package com.daaw;

import android.os.Trace;

/* JADX INFO: loaded from: classes.dex */
public abstract class T41 {
    public static void a(String str) {
        if (AbstractC6280lb1.a >= 18) {
            b(str);
        }
    }

    public static void b(String str) {
        Trace.beginSection(str);
    }

    public static void c() {
        if (AbstractC6280lb1.a >= 18) {
            d();
        }
    }

    public static void d() {
        Trace.endSection();
    }
}
