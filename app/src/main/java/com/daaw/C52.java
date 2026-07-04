package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.zzb;

/* JADX INFO: loaded from: classes3.dex */
public final class C52 implements InterfaceC4758g83 {
    public final B52 a;
    public final InterfaceC8394t83 b;
    public final InterfaceC8394t83 c;

    public C52(B52 b52, InterfaceC8394t83 interfaceC8394t83, InterfaceC8394t83 interfaceC8394t832) {
        this.a = b52;
        this.b = interfaceC8394t83;
        this.c = interfaceC8394t832;
    }

    @Override // com.daaw.InterfaceC8394t83
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzb((Context) this.b.zzb(), (InterfaceC3152aR1) this.c.zzb(), null);
    }
}
