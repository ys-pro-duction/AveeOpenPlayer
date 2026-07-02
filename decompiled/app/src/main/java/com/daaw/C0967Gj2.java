package com.daaw;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Gj2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0967Gj2 {
    public final Map a = new ConcurrentHashMap();
    public final /* synthetic */ C1071Hj2 b;

    public C0967Gj2(C1071Hj2 c1071Hj2) {
        this.b = c1071Hj2;
    }

    public static /* bridge */ /* synthetic */ C0967Gj2 a(C0967Gj2 c0967Gj2) {
        c0967Gj2.a.putAll(c0967Gj2.b.c);
        return c0967Gj2;
    }

    public final C0967Gj2 b(String str, String str2) {
        this.a.put(str, str2);
        return this;
    }

    public final C0967Gj2 c(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            this.a.put(str, str2);
        }
        return this;
    }

    public final C0967Gj2 d(C4498fF2 c4498fF2) {
        this.a.put("aai", c4498fF2.y);
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.W6)).booleanValue()) {
            c("rid", c4498fF2.p0);
        }
        return this;
    }

    public final C0967Gj2 e(C5622jF2 c5622jF2) {
        this.a.put("gqi", c5622jF2.b);
        return this;
    }

    public final String f() {
        return this.b.a.b(this.a);
    }

    public final void g() {
        this.b.b.execute(new Runnable() { // from class: com.daaw.Ej2
            @Override // java.lang.Runnable
            public final void run() {
                this.B.i();
            }
        });
    }

    public final void h() {
        this.b.b.execute(new Runnable() { // from class: com.daaw.Fj2
            @Override // java.lang.Runnable
            public final void run() {
                this.B.j();
            }
        });
    }

    public final /* synthetic */ void i() {
        this.b.a.f(this.a);
    }

    public final /* synthetic */ void j() {
        this.b.a.e(this.a);
    }
}
