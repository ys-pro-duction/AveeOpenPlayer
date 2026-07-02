package com.daaw;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbvg;
import com.google.android.gms.internal.ads.zzcaz;
import com.google.android.gms.internal.ads.zzffh;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.Fo2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC0883Fo2 extends AbstractBinderC6510mP1 {
    public final Context B;
    public final PS2 C;
    public final C3543bp2 D;
    public final U02 E;
    public final ArrayDeque F;
    public final WI2 G;
    public final RP1 H;
    public final C2882Yo2 I;

    public BinderC0883Fo2(Context context, PS2 ps2, RP1 rp1, U02 u02, C3543bp2 c3543bp2, ArrayDeque arrayDeque, C2882Yo2 c2882Yo2, WI2 wi2) {
        AbstractC9820yE1.a(context);
        this.B = context;
        this.C = ps2;
        this.H = rp1;
        this.D = c3543bp2;
        this.E = u02;
        this.F = arrayDeque;
        this.I = c2882Yo2;
        this.G = wi2;
    }

    public static InterfaceFutureC8236sc0 f3(InterfaceFutureC8236sc0 interfaceFutureC8236sc0, YH2 yh2, C9011vL1 c9011vL1, TI2 ti2, EI2 ei2) {
        InterfaceC4810gL1 interfaceC4810gL1A = c9011vL1.a("AFMA_getAdDictionary", AbstractC6773nL1.b, new InterfaceC5368iL1() { // from class: com.daaw.yo2
            @Override // com.daaw.InterfaceC5368iL1
            public final Object b(JSONObject jSONObject) {
                return new IP1(jSONObject);
            }
        });
        SI2.d(interfaceFutureC8236sc0, ei2);
        C10112zH2 c10112zH2A = yh2.b(SH2.BUILD_URL, interfaceFutureC8236sc0).f(interfaceC4810gL1A).a();
        SI2.c(c10112zH2A, ti2, ei2);
        return c10112zH2A;
    }

    public static InterfaceFutureC8236sc0 g3(zzbvg zzbvgVar, YH2 yh2, final AbstractC6451mA2 abstractC6451mA2) {
        WR2 wr2 = new WR2() { // from class: com.daaw.so2
            @Override // com.daaw.WR2
            public final InterfaceFutureC8236sc0 zza(Object obj) {
                return abstractC6451mA2.b().a(zzay.zzb().l((Bundle) obj));
            }
        };
        return yh2.b(SH2.GMS_SIGNALS, AbstractC7360pS2.h(zzbvgVar.B)).f(wr2).e(new InterfaceC9554xH2() { // from class: com.daaw.to2
            @Override // com.daaw.InterfaceC9554xH2
            public final Object zza(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                zze.zza("Ad request signals:");
                zze.zza(jSONObject.toString(2));
                return jSONObject;
            }
        }).a();
    }

    private final synchronized void zzo() {
        int iIntValue = ((Long) IF1.c.e()).intValue();
        while (this.F.size() >= iIntValue) {
            this.F.removeFirst();
        }
    }

    @Override // com.daaw.InterfaceC6789nP1
    public final void N1(zzbvg zzbvgVar, DP1 dp1) {
        InterfaceFutureC8236sc0 interfaceFutureC8236sc0A3 = a3(zzbvgVar, Binder.getCallingUid());
        i3(interfaceFutureC8236sc0A3, dp1);
        if (((Boolean) BF1.c.e()).booleanValue()) {
            C3543bp2 c3543bp2 = this.D;
            c3543bp2.getClass();
            interfaceFutureC8236sc0A3.g(new RunnableC9700xo2(c3543bp2), this.C);
        }
    }

    @Override // com.daaw.InterfaceC6789nP1
    public final void N2(String str, DP1 dp1) {
        i3(c3(str), dp1);
    }

    public final InterfaceFutureC8236sc0 Z2(final zzbvg zzbvgVar, int i) {
        if (!((Boolean) IF1.a.e()).booleanValue()) {
            return AbstractC7360pS2.g(new Exception("Split request is disabled."));
        }
        zzffh zzffhVar = zzbvgVar.J;
        if (zzffhVar == null) {
            return AbstractC7360pS2.g(new Exception("Pool configuration missing from request."));
        }
        if (zzffhVar.F == 0 || zzffhVar.G == 0) {
            return AbstractC7360pS2.g(new Exception("Caching is disabled."));
        }
        C9011vL1 c9011vL1B = zzt.zzf().b(this.B, zzcaz.e(), this.G);
        AbstractC6451mA2 abstractC6451mA2A = this.E.a(zzbvgVar, i);
        YH2 yh2C = abstractC6451mA2A.c();
        final InterfaceFutureC8236sc0 interfaceFutureC8236sc0G3 = g3(zzbvgVar, yh2C, abstractC6451mA2A);
        TI2 ti2D = abstractC6451mA2A.d();
        final EI2 ei2A = DI2.a(this.B, 9);
        final InterfaceFutureC8236sc0 interfaceFutureC8236sc0F3 = f3(interfaceFutureC8236sc0G3, yh2C, c9011vL1B, ti2D, ei2A);
        return yh2C.a(SH2.GET_URL_AND_CACHE_KEY, interfaceFutureC8236sc0G3, interfaceFutureC8236sc0F3).a(new Callable() { // from class: com.daaw.wo2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.d3(interfaceFutureC8236sc0F3, interfaceFutureC8236sc0G3, zzbvgVar, ei2A);
            }
        }).a();
    }

    public final InterfaceFutureC8236sc0 a3(zzbvg zzbvgVar, int i) {
        C0562Co2 c0562Co2E3;
        C10112zH2 c10112zH2A;
        C9011vL1 c9011vL1B = zzt.zzf().b(this.B, zzcaz.e(), this.G);
        AbstractC6451mA2 abstractC6451mA2A = this.E.a(zzbvgVar, i);
        InterfaceC4810gL1 interfaceC4810gL1A = c9011vL1B.a("google.afma.response.normalize", C0779Eo2.d, AbstractC6773nL1.c);
        if (((Boolean) IF1.a.e()).booleanValue()) {
            c0562Co2E3 = e3(zzbvgVar.I);
            if (c0562Co2E3 == null) {
                zze.zza("Request contained a PoolKey but no matching parameters were found.");
            }
        } else {
            String str = zzbvgVar.K;
            c0562Co2E3 = null;
            if (str != null && !str.isEmpty()) {
                zze.zza("Request contained a PoolKey but split request is disabled.");
            }
        }
        EI2 ei2A = c0562Co2E3 == null ? DI2.a(this.B, 9) : c0562Co2E3.e;
        TI2 ti2D = abstractC6451mA2A.d();
        ti2D.d(zzbvgVar.B.getStringArrayList("ad_types"));
        C3264ap2 c3264ap2 = new C3264ap2(zzbvgVar.H, ti2D, ei2A);
        C2778Xo2 c2778Xo2 = new C2778Xo2(this.B, zzbvgVar.C.B, this.H, i);
        YH2 yh2C = abstractC6451mA2A.c();
        EI2 ei2A2 = DI2.a(this.B, 11);
        if (c0562Co2E3 == null) {
            final InterfaceFutureC8236sc0 interfaceFutureC8236sc0G3 = g3(zzbvgVar, yh2C, abstractC6451mA2A);
            final InterfaceFutureC8236sc0 interfaceFutureC8236sc0F3 = f3(interfaceFutureC8236sc0G3, yh2C, c9011vL1B, ti2D, ei2A);
            EI2 ei2A3 = DI2.a(this.B, 10);
            final C10112zH2 c10112zH2A2 = yh2C.a(SH2.HTTP, interfaceFutureC8236sc0F3, interfaceFutureC8236sc0G3).a(new Callable() { // from class: com.daaw.uo2
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new C2986Zo2((JSONObject) interfaceFutureC8236sc0G3.get(), (IP1) interfaceFutureC8236sc0F3.get());
                }
            }).e(c3264ap2).e(new KI2(ei2A3)).e(c2778Xo2).a();
            SI2.a(c10112zH2A2, ti2D, ei2A3);
            SI2.d(c10112zH2A2, ei2A2);
            c10112zH2A = yh2C.a(SH2.PRE_PROCESS, interfaceFutureC8236sc0G3, interfaceFutureC8236sc0F3, c10112zH2A2).a(new Callable() { // from class: com.daaw.vo2
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new C0779Eo2((C2674Wo2) c10112zH2A2.get(), (JSONObject) interfaceFutureC8236sc0G3.get(), (IP1) interfaceFutureC8236sc0F3.get());
                }
            }).f(interfaceC4810gL1A).a();
        } else {
            C2986Zo2 c2986Zo2 = new C2986Zo2(c0562Co2E3.b, c0562Co2E3.a);
            EI2 ei2A4 = DI2.a(this.B, 10);
            final C10112zH2 c10112zH2A3 = yh2C.b(SH2.HTTP, AbstractC7360pS2.h(c2986Zo2)).e(c3264ap2).e(new KI2(ei2A4)).e(c2778Xo2).a();
            SI2.a(c10112zH2A3, ti2D, ei2A4);
            final InterfaceFutureC8236sc0 interfaceFutureC8236sc0H = AbstractC7360pS2.h(c0562Co2E3);
            SI2.d(c10112zH2A3, ei2A2);
            c10112zH2A = yh2C.a(SH2.PRE_PROCESS, c10112zH2A3, interfaceFutureC8236sc0H).a(new Callable() { // from class: com.daaw.ro2
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C2674Wo2 c2674Wo2 = (C2674Wo2) c10112zH2A3.get();
                    InterfaceFutureC8236sc0 interfaceFutureC8236sc0 = interfaceFutureC8236sc0H;
                    return new C0779Eo2(c2674Wo2, ((C0562Co2) interfaceFutureC8236sc0.get()).b, ((C0562Co2) interfaceFutureC8236sc0.get()).a);
                }
            }).f(interfaceC4810gL1A).a();
        }
        SI2.a(c10112zH2A, ti2D, ei2A2);
        return c10112zH2A;
    }

    @Override // com.daaw.InterfaceC6789nP1
    public final void b1(zzbvg zzbvgVar, DP1 dp1) {
        i3(Z2(zzbvgVar, Binder.getCallingUid()), dp1);
    }

    public final InterfaceFutureC8236sc0 b3(zzbvg zzbvgVar, int i) {
        C9011vL1 c9011vL1B = zzt.zzf().b(this.B, zzcaz.e(), this.G);
        if (!((Boolean) NF1.a.e()).booleanValue()) {
            return AbstractC7360pS2.g(new Exception("Signal collection disabled."));
        }
        AbstractC6451mA2 abstractC6451mA2A = this.E.a(zzbvgVar, i);
        final C1758Nz2 c1758Nz2A = abstractC6451mA2A.a();
        InterfaceC4810gL1 interfaceC4810gL1A = c9011vL1B.a("google.afma.request.getSignals", AbstractC6773nL1.b, AbstractC6773nL1.c);
        EI2 ei2A = DI2.a(this.B, 22);
        C10112zH2 c10112zH2A = abstractC6451mA2A.c().b(SH2.GET_SIGNALS, AbstractC7360pS2.h(zzbvgVar.B)).e(new KI2(ei2A)).f(new WR2() { // from class: com.daaw.zo2
            @Override // com.daaw.WR2
            public final InterfaceFutureC8236sc0 zza(Object obj) throws JSONException {
                return c1758Nz2A.a(zzay.zzb().l((Bundle) obj));
            }
        }).b(SH2.JS_SIGNALS).f(interfaceC4810gL1A).a();
        TI2 ti2D = abstractC6451mA2A.d();
        ti2D.d(zzbvgVar.B.getStringArrayList("ad_types"));
        SI2.b(c10112zH2A, ti2D, ei2A);
        if (((Boolean) BF1.e.e()).booleanValue()) {
            C3543bp2 c3543bp2 = this.D;
            c3543bp2.getClass();
            c10112zH2A.g(new RunnableC9700xo2(c3543bp2), this.C);
        }
        return c10112zH2A;
    }

    public final InterfaceFutureC8236sc0 c3(String str) {
        if (((Boolean) IF1.a.e()).booleanValue()) {
            return e3(str) == null ? AbstractC7360pS2.g(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str)))) : AbstractC7360pS2.h(new C0354Ao2(this));
        }
        return AbstractC7360pS2.g(new Exception("Split request is disabled."));
    }

    public final /* synthetic */ InputStream d3(InterfaceFutureC8236sc0 interfaceFutureC8236sc0, InterfaceFutureC8236sc0 interfaceFutureC8236sc02, zzbvg zzbvgVar, EI2 ei2) {
        String strC = ((IP1) interfaceFutureC8236sc0.get()).c();
        h3(new C0562Co2((IP1) interfaceFutureC8236sc0.get(), (JSONObject) interfaceFutureC8236sc02.get(), zzbvgVar.I, strC, ei2));
        return new ByteArrayInputStream(strC.getBytes(UN2.c));
    }

    public final synchronized C0562Co2 e3(String str) {
        Iterator it = this.F.iterator();
        while (it.hasNext()) {
            C0562Co2 c0562Co2 = (C0562Co2) it.next();
            if (c0562Co2.c.equals(str)) {
                it.remove();
                return c0562Co2;
            }
        }
        return null;
    }

    public final synchronized void h3(C0562Co2 c0562Co2) {
        zzo();
        this.F.addLast(c0562Co2);
    }

    public final void i3(InterfaceFutureC8236sc0 interfaceFutureC8236sc0, DP1 dp1) {
        AbstractC7360pS2.r(AbstractC7360pS2.n(interfaceFutureC8236sc0, new WR2() { // from class: com.daaw.qo2
            @Override // com.daaw.WR2
            public final InterfaceFutureC8236sc0 zza(Object obj) {
                return AbstractC7360pS2.h(AbstractC5626jG2.a((InputStream) obj));
            }
        }, AbstractC9322wT1.a), new C0458Bo2(this, dp1), AbstractC9322wT1.f);
    }

    @Override // com.daaw.InterfaceC6789nP1
    public final void w1(zzbvg zzbvgVar, DP1 dp1) {
        i3(b3(zzbvgVar, Binder.getCallingUid()), dp1);
    }
}
