package com.daaw;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.rd2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7964rd2 implements InterfaceC4758g83 {
    public final InterfaceC8394t83 a;

    public C7964rd2(InterfaceC8394t83 interfaceC8394t83) {
        this.a = interfaceC8394t83;
    }

    @Override // com.daaw.InterfaceC8394t83
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = ((C7128od2) this.a).a().e() != null ? Collections.singleton("banner") : Collections.EMPTY_SET;
        AbstractC7000o83.b(setSingleton);
        return setSingleton;
    }
}
