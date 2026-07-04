package com.daaw;

import com.google.android.gms.ads.internal.zzt;

/* JADX INFO: loaded from: classes3.dex */
public final class OF2 implements InterfaceC6244lS2 {
    public final /* synthetic */ PF2 a;
    public final /* synthetic */ int b;

    public OF2(PF2 pf2, int i) {
        this.a = pf2;
        this.b = i;
    }

    @Override // com.daaw.InterfaceC6244lS2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        int i = this.b;
        this.a.b((String) obj, i);
    }

    @Override // com.daaw.InterfaceC6244lS2
    public final void b(Throwable th) {
        zzt.zzo().u(th, "BufferingUrlPinger.attributionReportingManager");
    }
}
