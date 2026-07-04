package com.daaw;

import java.util.Set;

/* JADX INFO: renamed from: com.daaw.ak2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3239ak2 implements InterfaceC4758g83 {
    public final C2966Zj2 a;
    public final InterfaceC8394t83 b;
    public final InterfaceC8394t83 c;

    public C3239ak2(C2966Zj2 c2966Zj2, InterfaceC8394t83 interfaceC8394t83, InterfaceC8394t83 interfaceC8394t832) {
        this.a = c2966Zj2;
        this.b = interfaceC8394t83;
        this.c = interfaceC8394t832;
    }

    @Override // com.daaw.InterfaceC8394t83
    public final /* bridge */ /* synthetic */ Object zzb() {
        C5759jk2 c5759jk2 = (C5759jk2) this.b.zzb();
        PS2 ps2 = AbstractC9322wT1.a;
        AbstractC7000o83.b(ps2);
        Set setA = C2966Zj2.a(c5759jk2, ps2);
        AbstractC7000o83.b(setA);
        return setA;
    }
}
