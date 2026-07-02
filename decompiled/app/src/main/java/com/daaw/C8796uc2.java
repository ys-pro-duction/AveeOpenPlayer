package com.daaw;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.uc2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8796uc2 implements InterfaceC4758g83 {
    public final C8517tc2 a;
    public final InterfaceC8394t83 b;

    public C8796uc2(C8517tc2 c8517tc2, InterfaceC8394t83 interfaceC8394t83) {
        this.a = c8517tc2;
        this.b = interfaceC8394t83;
    }

    @Override // com.daaw.InterfaceC8394t83
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = Collections.singleton(new C0623Db2((C5305i62) this.b.zzb(), AbstractC9322wT1.f));
        AbstractC7000o83.b(setSingleton);
        return setSingleton;
    }
}
