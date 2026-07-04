package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbvg;
import com.google.android.gms.internal.ads.zzffh;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class V42 {
    public final C0875Fm2 a;
    public final FF2 b;
    public final YH2 c;
    public final V02 d;
    public final C6929nt2 e;
    public final C6834na2 f;
    public C9267wF2 g;
    public final C7178on2 h;
    public final C7268p62 i;
    public final Executor j;
    public final C3254an2 k;
    public final C3553br2 l;
    public final C1295Jn2 m;
    public final C2044Qn2 n;

    public V42(C0875Fm2 c0875Fm2, FF2 ff2, YH2 yh2, V02 v02, C6929nt2 c6929nt2, C6834na2 c6834na2, C9267wF2 c9267wF2, C7178on2 c7178on2, C7268p62 c7268p62, Executor executor, C3254an2 c3254an2, C3553br2 c3553br2, C1295Jn2 c1295Jn2, C2044Qn2 c2044Qn2) {
        this.a = c0875Fm2;
        this.b = ff2;
        this.c = yh2;
        this.d = v02;
        this.e = c6929nt2;
        this.f = c6834na2;
        this.g = c9267wF2;
        this.h = c7178on2;
        this.i = c7268p62;
        this.j = executor;
        this.k = c3254an2;
        this.l = c3553br2;
        this.m = c1295Jn2;
        this.n = c2044Qn2;
    }

    public final zze a(Throwable th) {
        return AbstractC5908kG2.b(th, this.l);
    }

    public final C6834na2 c() {
        return this.f;
    }

    public final /* synthetic */ C9267wF2 d(C9267wF2 c9267wF2) {
        this.d.a(c9267wF2);
        return c9267wF2;
    }

    public final InterfaceFutureC8236sc0 e(final zzffh zzffhVar) {
        C10112zH2 c10112zH2A = this.c.b(SH2.GET_CACHE_KEY, this.i.c()).f(new WR2() { // from class: com.daaw.R42
            @Override // com.daaw.WR2
            public final InterfaceFutureC8236sc0 zza(Object obj) {
                return this.a.f(zzffhVar, (zzbvg) obj);
            }
        }).a();
        AbstractC7360pS2.r(c10112zH2A, new T42(this), this.j);
        return c10112zH2A;
    }

    public final /* synthetic */ InterfaceFutureC8236sc0 f(zzffh zzffhVar, zzbvg zzbvgVar) {
        zzbvgVar.J = zzffhVar;
        return this.h.a(zzbvgVar);
    }

    public final /* synthetic */ InterfaceFutureC8236sc0 g(InterfaceFutureC8236sc0 interfaceFutureC8236sc0, InterfaceFutureC8236sc0 interfaceFutureC8236sc02, InterfaceFutureC8236sc0 interfaceFutureC8236sc03) {
        return this.n.c((zzbvg) interfaceFutureC8236sc0.get(), (JSONObject) interfaceFutureC8236sc02.get(), (IP1) interfaceFutureC8236sc03.get());
    }

    public final InterfaceFutureC8236sc0 h(zzbvg zzbvgVar) {
        C10112zH2 c10112zH2A = this.c.b(SH2.NOTIFY_CACHE_HIT, this.h.g(zzbvgVar)).a();
        AbstractC7360pS2.r(c10112zH2A, new U42(this), this.j);
        return c10112zH2A;
    }

    public final InterfaceFutureC8236sc0 i(InterfaceFutureC8236sc0 interfaceFutureC8236sc0) {
        PH2 ph2F = this.c.b(SH2.RENDERER, interfaceFutureC8236sc0).e(new InterfaceC9554xH2() { // from class: com.daaw.I42
            @Override // com.daaw.InterfaceC9554xH2
            public final Object zza(Object obj) {
                C9267wF2 c9267wF2 = (C9267wF2) obj;
                this.a.d(c9267wF2);
                return c9267wF2;
            }
        }).f(this.e);
        if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.s5)).booleanValue()) {
            ph2F = ph2F.i(((Integer) zzba.zzc().b(AbstractC9820yE1.u5)).intValue(), TimeUnit.SECONDS);
        }
        return ph2F.a();
    }

    public final InterfaceFutureC8236sc0 j() {
        zzl zzlVar = this.b.d;
        if (zzlVar.zzx == null && zzlVar.zzs == null) {
            return k(this.i.c());
        }
        YH2 yh2 = this.c;
        C0875Fm2 c0875Fm2 = this.a;
        return IH2.c(c0875Fm2.a(), SH2.PRELOADED_LOADER, yh2).a();
    }

    public final InterfaceFutureC8236sc0 k(final InterfaceFutureC8236sc0 interfaceFutureC8236sc0) {
        C9267wF2 c9267wF2 = this.g;
        if (c9267wF2 != null) {
            return IH2.c(AbstractC7360pS2.h(c9267wF2), SH2.SERVER_TRANSACTION, this.c).a();
        }
        zzt.zzc().j();
        if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.za)).booleanValue() || ((Boolean) HF1.c.e()).booleanValue()) {
            PH2 ph2B = this.c.b(SH2.SERVER_TRANSACTION, interfaceFutureC8236sc0);
            final C3254an2 c3254an2 = this.k;
            return ph2B.f(new WR2() { // from class: com.daaw.S42
                @Override // com.daaw.WR2
                public final InterfaceFutureC8236sc0 zza(Object obj) {
                    return c3254an2.a((zzbvg) obj);
                }
            }).a();
        }
        final C1295Jn2 c1295Jn2 = this.m;
        final InterfaceFutureC8236sc0 interfaceFutureC8236sc0N = AbstractC7360pS2.n(interfaceFutureC8236sc0, new WR2() { // from class: com.daaw.J42
            @Override // com.daaw.WR2
            public final InterfaceFutureC8236sc0 zza(Object obj) {
                return c1295Jn2.a((zzbvg) obj);
            }
        }, this.j);
        PH2 ph2B2 = this.c.b(SH2.BUILD_URL, interfaceFutureC8236sc0N);
        final C7178on2 c7178on2 = this.h;
        final C10112zH2 c10112zH2A = ph2B2.f(new WR2() { // from class: com.daaw.K42
            @Override // com.daaw.WR2
            public final InterfaceFutureC8236sc0 zza(Object obj) {
                return c7178on2.b((JSONObject) obj);
            }
        }).a();
        return this.c.a(SH2.SERVER_TRANSACTION, interfaceFutureC8236sc0, interfaceFutureC8236sc0N, c10112zH2A).a(new Callable() { // from class: com.daaw.L42
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.g(interfaceFutureC8236sc0, interfaceFutureC8236sc0N, c10112zH2A);
            }
        }).f(new WR2() { // from class: com.daaw.M42
            @Override // com.daaw.WR2
            public final InterfaceFutureC8236sc0 zza(Object obj) {
                return (InterfaceFutureC8236sc0) obj;
            }
        }).a();
    }

    public final void l(C9267wF2 c9267wF2) {
        this.g = c9267wF2;
    }
}
