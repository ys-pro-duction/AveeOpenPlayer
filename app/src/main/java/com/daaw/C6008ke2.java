package com.daaw;

import com.google.android.gms.ads.internal.zzt;

/* JADX INFO: renamed from: com.daaw.ke2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6008ke2 implements InterfaceC6244lS2 {
    public final /* synthetic */ String a = "Google";
    public final /* synthetic */ C6575me2 b;

    public C6008ke2(C6575me2 c6575me2, String str, boolean z) {
        this.b = c6575me2;
    }

    @Override // com.daaw.InterfaceC6244lS2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        this.b.j.t((InterfaceC9334wW1) obj);
        C6575me2 c6575me2 = this.b;
        BT1 bt1C0 = c6575me2.j.c0();
        AbstractC9841yJ2 abstractC9841yJ2P = c6575me2.P(this.a, true);
        if (abstractC9841yJ2P != null && bt1C0 != null) {
            bt1C0.b(abstractC9841yJ2P);
        } else if (bt1C0 != null) {
            bt1C0.cancel(false);
        }
    }

    @Override // com.daaw.InterfaceC6244lS2
    public final void b(Throwable th) {
        zzt.zzo().u(th, "omid native display exp");
    }
}
