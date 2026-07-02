package com.daaw;

import android.content.Context;

/* JADX INFO: renamed from: com.daaw.Ct2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0582Ct2 implements InterfaceC4758g83 {
    public final InterfaceC8394t83 a;
    public final InterfaceC8394t83 b;

    public C0582Ct2(InterfaceC8394t83 interfaceC8394t83, InterfaceC8394t83 interfaceC8394t832) {
        this.a = interfaceC8394t83;
        this.b = interfaceC8394t832;
    }

    @Override // com.daaw.InterfaceC8394t83
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0478Bt2 zzb() {
        return new C0478Bt2((Context) this.a.zzb(), (AbstractC1167Ih2) this.b.zzb());
    }
}
