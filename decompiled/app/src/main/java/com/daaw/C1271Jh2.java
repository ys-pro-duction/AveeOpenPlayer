package com.daaw;

/* JADX INFO: renamed from: com.daaw.Jh2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1271Jh2 implements InterfaceC4758g83 {
    public final InterfaceC8394t83 a;
    public final InterfaceC8394t83 b;
    public final InterfaceC8394t83 c;

    public C1271Jh2(InterfaceC8394t83 interfaceC8394t83, InterfaceC8394t83 interfaceC8394t832, InterfaceC8394t83 interfaceC8394t833) {
        this.a = interfaceC8394t83;
        this.b = interfaceC8394t832;
        this.c = interfaceC8394t833;
    }

    @Override // com.daaw.InterfaceC8394t83
    public final /* synthetic */ Object zzb() {
        int i = ((I62) this.c).a().o.a;
        if (i != 0) {
            return i + (-1) != 0 ? ((C5250hu2) this.b).zzb() : ((C5250hu2) this.a).zzb();
        }
        throw null;
    }
}
