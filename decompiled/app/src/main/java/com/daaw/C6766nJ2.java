package com.daaw;

import android.content.Context;

/* JADX INFO: renamed from: com.daaw.nJ2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6766nJ2 implements InterfaceC4758g83 {
    public final InterfaceC8394t83 a;
    public final InterfaceC8394t83 b;
    public final InterfaceC8394t83 c;
    public final InterfaceC8394t83 d;

    public C6766nJ2(InterfaceC8394t83 interfaceC8394t83, InterfaceC8394t83 interfaceC8394t832, InterfaceC8394t83 interfaceC8394t833, InterfaceC8394t83 interfaceC8394t834) {
        this.a = interfaceC8394t83;
        this.b = interfaceC8394t832;
        this.c = interfaceC8394t833;
        this.d = interfaceC8394t834;
    }

    @Override // com.daaw.InterfaceC8394t83
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context contextA = ((LX1) this.a).a();
        PS2 ps2 = AbstractC9322wT1.a;
        AbstractC7000o83.b(ps2);
        return new C6487mJ2(contextA, ps2, (C5680jT1) this.c.zzb(), (WI2) this.d.zzb());
    }
}
