package com.daaw;

import android.content.Context;

/* JADX INFO: renamed from: com.daaw.xM2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9574xM2 extends AbstractC9016vM2 {
    public static C9574xM2 h;

    public C9574xM2(Context context) {
        super(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
    }

    public static final C9574xM2 k(Context context) {
        C9574xM2 c9574xM2;
        synchronized (C9574xM2.class) {
            try {
                if (h == null) {
                    h = new C9574xM2(context);
                }
                c9574xM2 = h;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c9574xM2;
    }

    public final C8730uM2 i(long j, boolean z) {
        C8730uM2 c8730uM2B;
        synchronized (C9574xM2.class) {
            c8730uM2B = b(null, null, j, z);
        }
        return c8730uM2B;
    }

    public final C8730uM2 j(String str, String str2, long j, boolean z) {
        C8730uM2 c8730uM2B;
        synchronized (C9574xM2.class) {
            c8730uM2B = b(str, str2, j, z);
        }
        return c8730uM2B;
    }

    public final void l() {
        synchronized (C9574xM2.class) {
            f(false);
        }
    }

    public final void m() {
        synchronized (C9574xM2.class) {
            f(true);
        }
    }
}
