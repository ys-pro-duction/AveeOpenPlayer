package com.daaw;

import android.content.Context;

/* JADX INFO: renamed from: com.daaw.us2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8876us2 implements InterfaceC4758g83 {
    public final InterfaceC8394t83 a;
    public final InterfaceC8394t83 b;

    public C8876us2(InterfaceC8394t83 interfaceC8394t83, InterfaceC8394t83 interfaceC8394t832) {
        this.a = interfaceC8394t83;
        this.b = interfaceC8394t832;
    }

    @Override // com.daaw.InterfaceC8394t83
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C8597ts2 zzb() {
        return new C8597ts2((Context) this.a.zzb(), (AbstractC1978Qc2) this.b.zzb());
    }
}
