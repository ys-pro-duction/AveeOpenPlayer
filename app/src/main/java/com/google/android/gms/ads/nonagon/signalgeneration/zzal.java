package com.google.android.gms.ads.nonagon.signalgeneration;

import com.daaw.AbstractC7000o83;
import com.daaw.AbstractC9322wT1;
import com.daaw.C9411wm2;
import com.daaw.InterfaceC4758g83;
import com.daaw.InterfaceC8394t83;
import com.daaw.PS2;

/* JADX INFO: loaded from: classes.dex */
public final class zzal implements InterfaceC4758g83 {
    public final InterfaceC8394t83 a;
    public final InterfaceC8394t83 b;

    public zzal(InterfaceC8394t83 interfaceC8394t83, InterfaceC8394t83 interfaceC8394t832) {
        this.a = interfaceC8394t83;
        this.b = interfaceC8394t832;
    }

    @Override // com.daaw.InterfaceC8394t83
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzak zzb() {
        PS2 ps2 = AbstractC9322wT1.a;
        AbstractC7000o83.b(ps2);
        return new zzak(ps2, ((C9411wm2) this.b).zzb());
    }
}
