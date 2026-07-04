package com.daaw;

/* JADX INFO: renamed from: com.daaw.r32, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7810r32 implements InterfaceC4758g83 {
    public final C4732g32 a;
    public final InterfaceC8394t83 b;
    public final InterfaceC8394t83 c;

    public C7810r32(C4732g32 c4732g32, InterfaceC8394t83 interfaceC8394t83, InterfaceC8394t83 interfaceC8394t832) {
        this.a = c4732g32;
        this.b = interfaceC8394t83;
        this.c = interfaceC8394t832;
    }

    @Override // com.daaw.InterfaceC8394t83
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C7912rR1 zzb() {
        return new C7912rR1(((LX1) this.b).a(), ((I62) this.c).a().f);
    }
}
