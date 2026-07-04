package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;

/* JADX INFO: loaded from: classes3.dex */
public final class E22 {
    public final InterfaceC6483mI2 a;
    public final C1071Hj2 b;
    public final C9267wF2 c;

    public E22(C1071Hj2 c1071Hj2, C9267wF2 c9267wF2, InterfaceC6483mI2 interfaceC6483mI2) {
        this.a = interfaceC6483mI2;
        this.b = c1071Hj2;
        this.c = c9267wF2;
    }

    public static String b(int i) {
        int i2 = i - 1;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "u" : "ac" : "cb" : "cc" : "bb" : "h";
    }

    public final void a(long j, int i) {
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.r8)).booleanValue()) {
            InterfaceC6483mI2 interfaceC6483mI2 = this.a;
            C9267wF2 c9267wF2 = this.c;
            C6204lI2 c6204lI2B = C6204lI2.b("ad_closed");
            c6204lI2B.g(c9267wF2.b.b);
            c6204lI2B.a("show_time", String.valueOf(j));
            c6204lI2B.a("ad_format", "app_open_ad");
            c6204lI2B.a("acr", b(i));
            interfaceC6483mI2.a(c6204lI2B);
            return;
        }
        C1071Hj2 c1071Hj2 = this.b;
        C9267wF2 c9267wF22 = this.c;
        C0967Gj2 c0967Gj2A = c1071Hj2.a();
        c0967Gj2A.e(c9267wF22.b.b);
        c0967Gj2A.b("action", "ad_closed");
        c0967Gj2A.b("show_time", String.valueOf(j));
        c0967Gj2A.b("ad_format", "app_open_ad");
        c0967Gj2A.b("acr", b(i));
        c0967Gj2A.g();
    }
}
