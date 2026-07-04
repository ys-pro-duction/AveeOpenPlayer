package com.daaw;

import java.util.Map;

/* JADX INFO: renamed from: com.daaw.bn2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3533bn2 implements InterfaceC4758g83 {
    public final InterfaceC8394t83 a;
    public final InterfaceC8394t83 b;
    public final InterfaceC8394t83 c;

    public C3533bn2(InterfaceC8394t83 interfaceC8394t83, InterfaceC8394t83 interfaceC8394t832, InterfaceC8394t83 interfaceC8394t833) {
        this.a = interfaceC8394t83;
        this.b = interfaceC8394t832;
        this.c = interfaceC8394t833;
    }

    @Override // com.daaw.InterfaceC8394t83
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3254an2 zzb() {
        Map mapC = ((C6721n83) this.a).c();
        PS2 ps2 = AbstractC9322wT1.a;
        AbstractC7000o83.b(ps2);
        return new C3254an2(mapC, ps2, ((R82) this.c).zzb());
    }
}
