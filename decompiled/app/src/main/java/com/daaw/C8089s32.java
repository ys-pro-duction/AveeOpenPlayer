package com.daaw;

/* JADX INFO: renamed from: com.daaw.s32, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8089s32 implements InterfaceC4758g83 {
    public final C4732g32 a;
    public final InterfaceC8394t83 b;
    public final InterfaceC8394t83 c;

    public C8089s32(C4732g32 c4732g32, InterfaceC8394t83 interfaceC8394t83, InterfaceC8394t83 interfaceC8394t832) {
        this.a = c4732g32;
        this.b = interfaceC8394t83;
        this.c = interfaceC8394t832;
    }

    @Override // com.daaw.InterfaceC8394t83
    public final /* bridge */ /* synthetic */ Object zzb() {
        C3334b42 c3334b42 = (C3334b42) this.b.zzb();
        PS2 ps2 = AbstractC9322wT1.a;
        AbstractC7000o83.b(ps2);
        return new C0623Db2(c3334b42, ps2);
    }
}
