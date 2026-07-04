package com.daaw;

import java.util.Set;

/* JADX INFO: renamed from: com.daaw.ck2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3796ck2 implements InterfaceC4758g83 {
    public final C2966Zj2 a;
    public final InterfaceC8394t83 b;
    public final InterfaceC8394t83 c;

    public C3796ck2(C2966Zj2 c2966Zj2, InterfaceC8394t83 interfaceC8394t83, InterfaceC8394t83 interfaceC8394t832) {
        this.a = c2966Zj2;
        this.b = interfaceC8394t83;
        this.c = interfaceC8394t832;
    }

    @Override // com.daaw.InterfaceC8394t83
    public final /* bridge */ /* synthetic */ Object zzb() {
        C5759jk2 c5759jk2 = (C5759jk2) this.b.zzb();
        PS2 ps2 = AbstractC9322wT1.a;
        AbstractC7000o83.b(ps2);
        Set setC = C2966Zj2.c(c5759jk2, ps2);
        AbstractC7000o83.b(setC);
        return setC;
    }
}
