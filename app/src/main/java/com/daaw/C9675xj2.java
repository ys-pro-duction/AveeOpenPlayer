package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;

/* JADX INFO: renamed from: com.daaw.xj2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9675xj2 implements InterfaceC4758g83 {
    public final InterfaceC8394t83 a;
    public final InterfaceC8394t83 b;
    public final InterfaceC8394t83 c;

    public C9675xj2(InterfaceC8394t83 interfaceC8394t83, InterfaceC8394t83 interfaceC8394t832, InterfaceC8394t83 interfaceC8394t833) {
        this.a = interfaceC8394t83;
        this.b = interfaceC8394t832;
        this.c = interfaceC8394t833;
    }

    @Override // com.daaw.InterfaceC8394t83
    public final /* bridge */ /* synthetic */ Object zzb() {
        C1383Kj2 c1383Kj2 = (C1383Kj2) this.a.zzb();
        PS2 ps2 = AbstractC9322wT1.a;
        AbstractC7000o83.b(ps2);
        return ((Boolean) zzba.zzc().b(AbstractC9820yE1.r8)).booleanValue() ? new C0623Db2((C6630mp2) this.c.zzb(), ps2) : new C0623Db2(c1383Kj2, ps2);
    }
}
