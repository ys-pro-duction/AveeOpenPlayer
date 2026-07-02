package com.daaw;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.Ic2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1147Ic2 implements InterfaceC4758g83 {
    public final InterfaceC8394t83 a;

    public C1147Ic2(InterfaceC8394t83 interfaceC8394t83) {
        this.a = interfaceC8394t83;
    }

    @Override // com.daaw.InterfaceC8394t83
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = Collections.singleton(new C0623Db2((C4607fd2) this.a.zzb(), AbstractC9322wT1.f));
        AbstractC7000o83.b(setSingleton);
        return setSingleton;
    }
}
