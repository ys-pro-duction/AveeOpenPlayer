package com.daaw;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzbuk;
import com.google.android.gms.internal.ads.zzbvg;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.Jn2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1295Jn2 {
    public final PS2 a;
    public final C0775En2 b;
    public final YH2 c;

    public C1295Jn2(PS2 ps2, C0775En2 c0775En2, YH2 yh2) {
        this.a = ps2;
        this.b = c0775En2;
        this.c = yh2;
    }

    public final InterfaceFutureC8236sc0 a(final zzbvg zzbvgVar) {
        PH2 ph2B = this.c.b(SH2.GMS_SIGNALS, AbstractC7360pS2.m(AbstractC7360pS2.h(null), new WN2() { // from class: com.daaw.Gn2
            @Override // com.daaw.WN2
            public final Object apply(Object obj) {
                zzbvg zzbvgVar2 = zzbvgVar;
                return new zzbuk(zzbvgVar2.D, zzbvgVar2.E, zzbvgVar2.G, BO2.c(zzbvgVar2.B.getString("ms")), -1, zzbvgVar2.I, zzbvgVar2.F, zzbvgVar2.L, zzbvgVar2.M);
            }
        }, this.a));
        final C0775En2 c0775En2 = this.b;
        return AbstractC7360pS2.m(ph2B.f(new WR2() { // from class: com.daaw.Hn2
            @Override // com.daaw.WR2
            public final InterfaceFutureC8236sc0 zza(Object obj) {
                return c0775En2.b((zzbuk) obj);
            }
        }).a(), new WN2() { // from class: com.daaw.In2
            @Override // com.daaw.WN2
            public final Object apply(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                Bundle bundle = zzbvgVar.B;
                if (bundle == null) {
                    return jSONObject;
                }
                try {
                    JSONObject jSONObjectL = zzay.zzb().l(bundle);
                    try {
                        zzay.zzb().o(jSONObject, jSONObjectL);
                        return jSONObject;
                    } catch (JSONException unused) {
                        return jSONObjectL;
                    }
                } catch (JSONException unused2) {
                    return jSONObject;
                }
            }
        }, this.a);
    }
}
