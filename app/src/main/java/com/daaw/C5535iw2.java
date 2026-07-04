package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.nonagon.signalgeneration.zzf;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.daaw.iw2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5535iw2 implements InterfaceC1447Kz2 {
    public final PS2 a;
    public final FF2 b;
    public final WF2 c;

    public C5535iw2(PS2 ps2, FF2 ff2, WF2 wf2) {
        this.a = ps2;
        this.b = ff2;
        this.c = wf2;
    }

    public final /* synthetic */ C5817jw2 a() {
        String strA = null;
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.f7)).booleanValue() && "requester_type_2".equals(zzf.zzb(this.b.d))) {
            strA = WF2.a();
        }
        return new C5817jw2(strA);
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final int zza() {
        return 5;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final InterfaceFutureC8236sc0 zzb() {
        return this.a.S0(new Callable() { // from class: com.daaw.hw2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.a();
            }
        });
    }
}
