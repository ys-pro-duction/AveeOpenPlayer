package com.daaw;

/* JADX INFO: renamed from: com.daaw.y32, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9770y32 implements InterfaceC4758g83 {
    public final InterfaceC8394t83 a;
    public final InterfaceC8394t83 b;
    public final InterfaceC8394t83 c;

    public C9770y32(InterfaceC8394t83 interfaceC8394t83, InterfaceC8394t83 interfaceC8394t832, InterfaceC8394t83 interfaceC8394t833) {
        this.a = interfaceC8394t83;
        this.b = interfaceC8394t832;
        this.c = interfaceC8394t833;
    }

    @Override // com.daaw.InterfaceC8394t83
    public final /* synthetic */ Object zzb() {
        return ((I32) this.a).zzb().booleanValue() ? ((C3284at2) this.b).zzb() : ((C5250hu2) this.c).zzb();
    }
}
