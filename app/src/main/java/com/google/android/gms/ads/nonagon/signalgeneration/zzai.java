package com.google.android.gms.ads.nonagon.signalgeneration;

import com.daaw.AbstractC9820yE1;
import com.daaw.C7547q62;
import com.daaw.InterfaceC4758g83;
import com.daaw.InterfaceC8394t83;
import com.daaw.SH2;
import com.daaw.YH2;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class zzai implements InterfaceC4758g83 {
    public final InterfaceC8394t83 a;
    public final InterfaceC8394t83 b;
    public final InterfaceC8394t83 c;

    public zzai(InterfaceC8394t83 interfaceC8394t83, InterfaceC8394t83 interfaceC8394t832, InterfaceC8394t83 interfaceC8394t833) {
        this.a = interfaceC8394t83;
        this.b = interfaceC8394t832;
        this.c = interfaceC8394t833;
    }

    @Override // com.daaw.InterfaceC8394t83
    public final /* bridge */ /* synthetic */ Object zzb() {
        return ((YH2) this.a.zzb()).b(SH2.GENERATE_SIGNALS, ((C7547q62) this.c).zzb().c()).f(((zzal) this.b).zzb()).i(((Integer) zzba.zzc().b(AbstractC9820yE1.u5)).intValue(), TimeUnit.SECONDS).a();
    }
}
