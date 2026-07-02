package com.daaw;

import android.content.Context;

/* JADX INFO: renamed from: com.daaw.nj1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C6878nj1 {
    public static final C6878nj1 b = new C6878nj1();
    public C4391es0 a = null;

    public static C4391es0 a(Context context) {
        return b.b(context);
    }

    public final synchronized C4391es0 b(Context context) {
        try {
            if (this.a == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                this.a = new C4391es0(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.a;
    }
}
