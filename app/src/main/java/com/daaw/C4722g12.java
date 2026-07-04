package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.g12, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4722g12 implements X02 {
    public final C2474Uq2 a;

    public C4722g12(C2474Uq2 c2474Uq2) {
        this.a = c2474Uq2;
    }

    @Override // com.daaw.X02
    public final void a(Map map) {
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.C9)).booleanValue()) {
            AbstractC7360pS2.f(AbstractC4839gS2.C(this.a.a(true)), Throwable.class, new WR2() { // from class: com.daaw.f12
                @Override // com.daaw.WR2
                public final InterfaceFutureC8236sc0 zza(Object obj) {
                    zzt.zzo().u((Throwable) obj, "GetTopicsApiWithRecordObservationActionHandler");
                    return AbstractC7360pS2.h(new C9874yS(OP2.J()));
                }
            }, AbstractC9322wT1.a);
        }
    }
}
