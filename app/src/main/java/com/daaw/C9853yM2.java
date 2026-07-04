package com.daaw;

import android.content.Context;
import java.io.IOException;

/* JADX INFO: renamed from: com.daaw.yM2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9853yM2 extends AbstractC9016vM2 {
    public static C9853yM2 h;

    public C9853yM2(Context context) {
        super(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
    }

    public static final C9853yM2 j(Context context) {
        C9853yM2 c9853yM2;
        synchronized (C9853yM2.class) {
            try {
                if (h == null) {
                    h = new C9853yM2(context);
                }
                c9853yM2 = h;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c9853yM2;
    }

    public final C8730uM2 i(long j, boolean z) {
        synchronized (C9853yM2.class) {
            try {
                if (p()) {
                    return b(null, null, j, z);
                }
                return new C8730uM2();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k() {
        synchronized (C9853yM2.class) {
            try {
                if (g(false)) {
                    f(false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l() throws IOException {
        this.f.e("paidv2_publisher_option");
    }

    public final void m() throws IOException {
        this.f.e("paidv2_user_option");
    }

    public final void n(boolean z) throws IOException {
        this.f.d("paidv2_user_option", Boolean.valueOf(z));
    }

    public final void o(boolean z) throws IOException {
        this.f.d("paidv2_publisher_option", Boolean.valueOf(z));
        if (z) {
            return;
        }
        k();
    }

    public final boolean p() {
        return this.f.f("paidv2_publisher_option", true);
    }

    public final boolean q() {
        return this.f.f("paidv2_user_option", true);
    }
}
