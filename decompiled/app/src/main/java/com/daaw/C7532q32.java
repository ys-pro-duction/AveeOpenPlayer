package com.daaw;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.q32, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7532q32 implements InterfaceC4758g83 {
    public final C4732g32 a;
    public final InterfaceC8394t83 b;

    public C7532q32(C4732g32 c4732g32, InterfaceC8394t83 interfaceC8394t83) {
        this.a = c4732g32;
        this.b = interfaceC8394t83;
    }

    @Override // com.daaw.InterfaceC8394t83
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = Collections.singleton(new C0623Db2((U32) this.b.zzb(), AbstractC9322wT1.f));
        AbstractC7000o83.b(setSingleton);
        return setSingleton;
    }
}
