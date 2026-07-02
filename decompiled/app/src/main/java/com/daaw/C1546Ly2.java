package com.daaw;

import java.util.Set;

/* JADX INFO: renamed from: com.daaw.Ly2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1546Ly2 implements InterfaceC4758g83 {
    public final InterfaceC8394t83 a;
    public final InterfaceC8394t83 b;
    public final InterfaceC8394t83 c;

    public C1546Ly2(InterfaceC8394t83 interfaceC8394t83, InterfaceC8394t83 interfaceC8394t832, InterfaceC8394t83 interfaceC8394t833) {
        this.a = interfaceC8394t83;
        this.b = interfaceC8394t832;
        this.c = interfaceC8394t833;
    }

    @Override // com.daaw.InterfaceC8394t83
    public final /* bridge */ /* synthetic */ Object zzb() {
        PS2 ps2 = AbstractC9322wT1.a;
        AbstractC7000o83.b(ps2);
        return new C1339Jy2(ps2, ((LX1) this.b).a(), (Set) this.c.zzb());
    }
}
