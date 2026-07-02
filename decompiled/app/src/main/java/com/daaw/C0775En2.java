package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbuk;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.En2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0775En2 {
    public final PS2 a;
    public final PS2 b;
    public final C6625mo2 c;

    public C0775En2(PS2 ps2, PS2 ps22, C6625mo2 c6625mo2) {
        this.a = ps2;
        this.b = ps22;
        this.c = c6625mo2;
    }

    public final /* synthetic */ InterfaceFutureC8236sc0 a(zzbuk zzbukVar) {
        return this.c.c(zzbukVar, ((Long) zzba.zzc().b(AbstractC9820yE1.Aa)).longValue());
    }

    public final InterfaceFutureC8236sc0 b(final zzbuk zzbukVar) {
        InterfaceFutureC8236sc0 interfaceFutureC8236sc0F;
        String str = zzbukVar.C;
        zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzt.zzB(str)) {
            interfaceFutureC8236sc0F = AbstractC7360pS2.g(new C4090dn2(1, "Ads signal service force local"));
        } else {
            interfaceFutureC8236sc0F = AbstractC7360pS2.f(AbstractC7360pS2.k(new RR2() { // from class: com.daaw.An2
                @Override // com.daaw.RR2
                public final InterfaceFutureC8236sc0 zza() {
                    return this.a.a(zzbukVar);
                }
            }, this.a), ExecutionException.class, new WR2() { // from class: com.daaw.Bn2
                @Override // com.daaw.WR2
                public final InterfaceFutureC8236sc0 zza(Object obj) {
                    Throwable cause = (ExecutionException) obj;
                    if (cause.getCause() != null) {
                        cause = cause.getCause();
                    }
                    return AbstractC7360pS2.g(cause);
                }
            }, this.b);
        }
        return AbstractC7360pS2.n(AbstractC7360pS2.f(AbstractC4839gS2.C(interfaceFutureC8236sc0F), C4090dn2.class, new WR2() { // from class: com.daaw.Cn2
            @Override // com.daaw.WR2
            public final InterfaceFutureC8236sc0 zza(Object obj) {
                return AbstractC7360pS2.h(null);
            }
        }, this.b), new WR2() { // from class: com.daaw.Dn2
            @Override // com.daaw.WR2
            public final InterfaceFutureC8236sc0 zza(Object obj) {
                InputStream inputStream = (InputStream) obj;
                JSONObject jSONObject = new JSONObject();
                if (inputStream == null) {
                    return AbstractC7360pS2.h(jSONObject);
                }
                try {
                    zzt.zzp();
                    jSONObject = new JSONObject(com.google.android.gms.ads.internal.util.zzt.zzM(new InputStreamReader(inputStream)));
                } catch (IOException | JSONException e) {
                    zzt.zzo().u(e, "AdsServiceSignalTask.startAdsServiceSignalTask");
                }
                return AbstractC7360pS2.h(jSONObject);
            }
        }, this.b);
    }
}
