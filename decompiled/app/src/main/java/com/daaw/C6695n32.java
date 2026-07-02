package com.daaw;

import java.util.Set;

/* JADX INFO: renamed from: com.daaw.n32, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6695n32 implements InterfaceC4758g83 {
    public final C4732g32 a;
    public final InterfaceC8394t83 b;

    public C6695n32(C4732g32 c4732g32, InterfaceC8394t83 interfaceC8394t83) {
        this.a = c4732g32;
        this.b = interfaceC8394t83;
    }

    @Override // com.daaw.InterfaceC8394t83
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setG = C4732g32.g((U32) this.b.zzb());
        AbstractC7000o83.b(setG);
        return setG;
    }
}
