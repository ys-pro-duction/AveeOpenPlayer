package com.daaw;

import android.content.Context;

/* JADX INFO: renamed from: com.daaw.Rr2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2164Rr2 implements InterfaceC4758g83 {
    public final InterfaceC8394t83 a;
    public final InterfaceC8394t83 b;

    public C2164Rr2(InterfaceC8394t83 interfaceC8394t83, InterfaceC8394t83 interfaceC8394t832) {
        this.a = interfaceC8394t83;
        this.b = interfaceC8394t832;
    }

    @Override // com.daaw.InterfaceC8394t83
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2060Qr2 zzb() {
        return new C2060Qr2((Context) this.a.zzb(), (AbstractC9212w32) this.b.zzb());
    }
}
