package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.Si2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2234Si2 implements InterfaceC4758g83 {
    public final InterfaceC8394t83 a;
    public final InterfaceC8394t83 b;

    public C2234Si2(InterfaceC8394t83 interfaceC8394t83, InterfaceC8394t83 interfaceC8394t832) {
        this.a = interfaceC8394t83;
        this.b = interfaceC8394t832;
    }

    @Override // com.daaw.InterfaceC8394t83
    public final /* bridge */ /* synthetic */ Object zzb() {
        PS2 ps2 = AbstractC9322wT1.a;
        AbstractC7000o83.b(ps2);
        Set setSingleton = ((Boolean) zzba.zzc().b(AbstractC9820yE1.M4)).booleanValue() ? Collections.singleton(new C0623Db2(((C6321lj2) this.b).zzb(), ps2)) : Collections.EMPTY_SET;
        AbstractC7000o83.b(setSingleton);
        return setSingleton;
    }
}
