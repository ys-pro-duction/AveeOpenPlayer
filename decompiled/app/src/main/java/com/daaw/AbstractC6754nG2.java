package com.daaw;

import android.content.Context;

/* JADX INFO: renamed from: com.daaw.nG2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6754nG2 {
    public static AbstractC6963o11 a;
    public static InterfaceC6273la b;
    public static final Object c = new Object();

    public static AbstractC6963o11 a(Context context) {
        AbstractC6963o11 abstractC6963o11;
        b(context, false);
        synchronized (c) {
            abstractC6963o11 = a;
        }
        return abstractC6963o11;
    }

    public static void b(Context context, boolean z) {
        synchronized (c) {
            try {
                if (b == null) {
                    b = AbstractC5985ka.a(context);
                }
                AbstractC6963o11 abstractC6963o11 = a;
                if (abstractC6963o11 == null || ((abstractC6963o11.m() && !a.n()) || (z && a.m()))) {
                    a = ((InterfaceC6273la) AbstractC7506py0.m(b, "the appSetIdClient shouldn't be null")).a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
