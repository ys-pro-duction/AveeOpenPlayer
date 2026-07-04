package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class RX1 implements InterfaceC4758g83 {
    public final InterfaceC8394t83 a;
    public final InterfaceC8394t83 b;

    public RX1(InterfaceC8394t83 interfaceC8394t83, InterfaceC8394t83 interfaceC8394t832) {
        this.a = interfaceC8394t83;
        this.b = interfaceC8394t832;
    }

    @Override // com.daaw.InterfaceC8394t83
    public final /* bridge */ /* synthetic */ Object zzb() {
        C2450Uk2 c2450Uk2 = (C2450Uk2) this.a.zzb();
        PS2 ps2 = AbstractC9322wT1.a;
        AbstractC7000o83.b(ps2);
        Set setSingleton = ((Boolean) zzba.zzc().b(AbstractC9820yE1.B1)).booleanValue() ? Collections.singleton(new C0623Db2(c2450Uk2, ps2)) : Collections.EMPTY_SET;
        AbstractC7000o83.b(setSingleton);
        return setSingleton;
    }
}
