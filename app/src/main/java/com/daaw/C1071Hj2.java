package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.Hj2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1071Hj2 {
    public final C1590Mj2 a;
    public final Executor b;
    public final Map c;

    public C1071Hj2(C1590Mj2 c1590Mj2, Executor executor) {
        this.a = c1590Mj2;
        this.c = c1590Mj2.g();
        this.b = executor;
    }

    public final C0967Gj2 a() {
        C0967Gj2 c0967Gj2 = new C0967Gj2(this);
        C0967Gj2.a(c0967Gj2);
        return c0967Gj2;
    }

    public final void e() {
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.Fa)).booleanValue()) {
            C0967Gj2 c0967Gj2A = a();
            c0967Gj2A.b("action", "pecr");
            c0967Gj2A.g();
        }
    }
}
