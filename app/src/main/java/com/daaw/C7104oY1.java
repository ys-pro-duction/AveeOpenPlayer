package com.daaw;

import android.content.Context;

/* JADX INFO: renamed from: com.daaw.oY1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7104oY1 {
    public boolean a;
    public F51 b;

    public C7104oY1(Context context) {
        try {
            P51.f(context);
            this.b = P51.c().g(C6313li.g).a("PLAY_BILLING_LIBRARY", E83.class, EG.b("proto"), new InterfaceC7819r51() { // from class: com.daaw.IX1
                @Override // com.daaw.InterfaceC7819r51
                public final Object apply(Object obj) {
                    return ((E83) obj).c();
                }
            });
        } catch (Throwable unused) {
            this.a = true;
        }
    }

    public final void a(E83 e83) {
        if (this.a) {
            JC1.j("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            this.b.b(GH.d(e83));
        } catch (Throwable unused) {
            JC1.j("BillingLogger", "logging failed.");
        }
    }
}
