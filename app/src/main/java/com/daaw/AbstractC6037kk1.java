package com.daaw;

import android.content.Context;

/* JADX INFO: renamed from: com.daaw.kk1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6037kk1 {
    public static C4920gk1 a;

    public static synchronized C4920gk1 a(Context context) {
        try {
            if (a == null) {
                C3795ck1 c3795ck1 = new C3795ck1(null);
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                c3795ck1.b(context);
                a = c3795ck1.a();
            }
        } catch (Throwable th) {
            throw th;
        }
        return a;
    }
}
