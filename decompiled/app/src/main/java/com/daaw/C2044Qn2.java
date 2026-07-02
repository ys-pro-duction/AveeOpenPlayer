package com.daaw;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbuo;
import com.google.android.gms.internal.ads.zzbvg;
import com.google.android.gms.internal.ads.zzcaz;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.Qn2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2044Qn2 {
    public final Q82 a;
    public final C9974yn2 b;
    public final YH2 c;
    public final FF2 d;
    public final zzcaz e;
    public final WI2 f;
    public final TI2 g;
    public final Context h;
    public final PS2 i;
    public InterfaceFutureC8236sc0 j;

    public C2044Qn2(Q82 q82, C9974yn2 c9974yn2, YH2 yh2, FF2 ff2, zzcaz zzcazVar, WI2 wi2, TI2 ti2, Context context, PS2 ps2) {
        this.a = q82;
        this.b = c9974yn2;
        this.c = yh2;
        this.d = ff2;
        this.e = zzcazVar;
        this.f = wi2;
        this.g = ti2;
        this.h = context;
        this.i = ps2;
    }

    public final /* synthetic */ zzbuo a(zzbvg zzbvgVar, C2570Vo2 c2570Vo2) {
        c2570Vo2.c.put("Content-Type", c2570Vo2.e);
        c2570Vo2.c.put("User-Agent", zzt.zzp().zzc(this.h, zzbvgVar.C.B));
        Bundle bundle = new Bundle();
        for (Map.Entry entry : c2570Vo2.c.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        return new zzbuo(c2570Vo2.a, c2570Vo2.b, bundle, c2570Vo2.d, c2570Vo2.f, zzbvgVar.E, zzbvgVar.I);
    }

    public final InterfaceFutureC8236sc0 c(final zzbvg zzbvgVar, final JSONObject jSONObject, final IP1 ip1) {
        this.a.v0(zzbvgVar);
        PH2 ph2B = this.c.b(SH2.PROXY, AbstractC7360pS2.m(this.c.b(SH2.PREPARE_HTTP_REQUEST, AbstractC7360pS2.h(new C2986Zo2(jSONObject, ip1))).e(new C3264ap2(zzbvgVar.H, this.g, DI2.a(this.h, 9))).a(), new WN2() { // from class: com.daaw.Mn2
            @Override // com.daaw.WN2
            public final Object apply(Object obj) {
                return this.a.a(zzbvgVar, (C2570Vo2) obj);
            }
        }, this.i));
        final C9974yn2 c9974yn2 = this.b;
        C10112zH2 c10112zH2A = ph2B.f(new WR2() { // from class: com.daaw.Nn2
            @Override // com.daaw.WR2
            public final InterfaceFutureC8236sc0 zza(Object obj) {
                return c9974yn2.c((zzbuo) obj);
            }
        }).a();
        this.j = c10112zH2A;
        InterfaceFutureC8236sc0 interfaceFutureC8236sc0N = AbstractC7360pS2.n(this.c.b(SH2.PRE_PROCESS, c10112zH2A).e(new InterfaceC9554xH2() { // from class: com.daaw.Ln2
            @Override // com.daaw.InterfaceC9554xH2
            public final Object zza(Object obj) {
                return new C0779Eo2(C2674Wo2.a(new InputStreamReader((InputStream) obj)), jSONObject, ip1);
            }
        }).f(zzt.zzf().a(this.h, this.e, this.f).a("google.afma.response.normalize", C0779Eo2.d, AbstractC6773nL1.c)).a(), new WR2() { // from class: com.daaw.On2
            @Override // com.daaw.WR2
            public final InterfaceFutureC8236sc0 zza(Object obj) {
                return this.a.d((InputStream) obj);
            }
        }, this.i);
        AbstractC7360pS2.r(interfaceFutureC8236sc0N, new C1918Pn2(this), this.i);
        return interfaceFutureC8236sc0N;
    }

    public final /* synthetic */ InterfaceFutureC8236sc0 d(InputStream inputStream) {
        return AbstractC7360pS2.h(new C9267wF2(new C8423tF2(this.d), C8988vF2.a(new InputStreamReader(inputStream))));
    }
}
