package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.Cg2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0530Cg2 {
    public final FF2 a;
    public final Executor b;
    public final C2958Zh2 c;
    public final C7706qh2 d;
    public final Context e;
    public final C1071Hj2 f;
    public final InterfaceC6483mI2 g;
    public final C6487mJ2 h;
    public final C6077kq2 i;

    public C0530Cg2(FF2 ff2, Executor executor, C2958Zh2 c2958Zh2, Context context, C1071Hj2 c1071Hj2, InterfaceC6483mI2 interfaceC6483mI2, C6487mJ2 c6487mJ2, C6077kq2 c6077kq2, C7706qh2 c7706qh2) {
        this.a = ff2;
        this.b = executor;
        this.c = c2958Zh2;
        this.e = context;
        this.f = c1071Hj2;
        this.g = interfaceC6483mI2;
        this.h = c6487mJ2;
        this.i = c6077kq2;
        this.d = c7706qh2;
    }

    public static final void i(InterfaceC9334wW1 interfaceC9334wW1) {
        interfaceC9334wW1.C("/videoClicked", GI1.h);
        interfaceC9334wW1.zzN().Y(true);
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.C3)).booleanValue()) {
            interfaceC9334wW1.C("/getNativeAdViewSignals", GI1.s);
        }
        interfaceC9334wW1.C("/getNativeClickMeta", GI1.t);
    }

    public final InterfaceFutureC8236sc0 a(final JSONObject jSONObject) {
        return AbstractC7360pS2.n(AbstractC7360pS2.n(AbstractC7360pS2.h(null), new WR2() { // from class: com.daaw.pg2
            @Override // com.daaw.WR2
            public final InterfaceFutureC8236sc0 zza(Object obj) {
                return this.a.e(obj);
            }
        }, this.b), new WR2() { // from class: com.daaw.og2
            @Override // com.daaw.WR2
            public final InterfaceFutureC8236sc0 zza(Object obj) {
                return this.a.c(jSONObject, (InterfaceC9334wW1) obj);
            }
        }, this.b);
    }

    public final InterfaceFutureC8236sc0 b(final String str, final String str2, final C4498fF2 c4498fF2, final C5622jF2 c5622jF2, final zzq zzqVar) {
        return AbstractC7360pS2.n(AbstractC7360pS2.h(null), new WR2() { // from class: com.daaw.ng2
            @Override // com.daaw.WR2
            public final InterfaceFutureC8236sc0 zza(Object obj) {
                return this.a.d(zzqVar, c4498fF2, c5622jF2, str, str2, obj);
            }
        }, this.b);
    }

    public final /* synthetic */ InterfaceFutureC8236sc0 c(JSONObject jSONObject, final InterfaceC9334wW1 interfaceC9334wW1) {
        final AT1 at1D = AT1.d(interfaceC9334wW1);
        if (this.a.b != null) {
            interfaceC9334wW1.H(C8494tX1.d());
        } else {
            interfaceC9334wW1.H(C8494tX1.e());
        }
        interfaceC9334wW1.zzN().I(new InterfaceC7379pX1() { // from class: com.daaw.qg2
            @Override // com.daaw.InterfaceC7379pX1
            public final void zza(boolean z, int i, String str, String str2) {
                this.B.f(interfaceC9334wW1, at1D, z, i, str, str2);
            }
        });
        interfaceC9334wW1.y0("google.afma.nativeAds.renderVideo", jSONObject);
        return at1D;
    }

    public final /* synthetic */ InterfaceFutureC8236sc0 d(zzq zzqVar, C4498fF2 c4498fF2, C5622jF2 c5622jF2, String str, String str2, Object obj) {
        final InterfaceC9334wW1 interfaceC9334wW1A = this.c.a(zzqVar, c4498fF2, c5622jF2);
        final AT1 at1D = AT1.d(interfaceC9334wW1A);
        if (this.a.b != null) {
            h(interfaceC9334wW1A);
            interfaceC9334wW1A.H(C8494tX1.d());
        } else {
            C6869nh2 c6869nh2B = this.d.b();
            interfaceC9334wW1A.zzN().O(c6869nh2B, c6869nh2B, c6869nh2B, c6869nh2B, c6869nh2B, false, null, new zzb(this.e, null, null), null, null, this.i, this.h, this.f, this.g, null, c6869nh2B, null, null, null);
            i(interfaceC9334wW1A);
        }
        interfaceC9334wW1A.zzN().I(new InterfaceC7379pX1() { // from class: com.daaw.rg2
            @Override // com.daaw.InterfaceC7379pX1
            public final void zza(boolean z, int i, String str3, String str4) {
                this.B.g(interfaceC9334wW1A, at1D, z, i, str3, str4);
            }
        });
        interfaceC9334wW1A.n0(str, str2, null);
        return at1D;
    }

    public final /* synthetic */ InterfaceFutureC8236sc0 e(Object obj) {
        InterfaceC9334wW1 interfaceC9334wW1A = this.c.a(zzq.zzc(), null, null);
        final AT1 at1D = AT1.d(interfaceC9334wW1A);
        h(interfaceC9334wW1A);
        interfaceC9334wW1A.zzN().K(new InterfaceC7658qX1() { // from class: com.daaw.sg2
            @Override // com.daaw.InterfaceC7658qX1
            public final void zza() {
                at1D.e();
            }
        });
        interfaceC9334wW1A.loadUrl((String) zzba.zzc().b(AbstractC9820yE1.B3));
        return at1D;
    }

    public final /* synthetic */ void f(InterfaceC9334wW1 interfaceC9334wW1, AT1 at1, boolean z, int i, String str, String str2) {
        if (this.a.a != null && interfaceC9334wW1.zzq() != null) {
            interfaceC9334wW1.zzq().c3(this.a.a);
        }
        at1.e();
    }

    public final /* synthetic */ void g(InterfaceC9334wW1 interfaceC9334wW1, AT1 at1, boolean z, int i, String str, String str2) {
        if (z) {
            if (this.a.a != null && interfaceC9334wW1.zzq() != null) {
                interfaceC9334wW1.zzq().c3(this.a.a);
            }
            at1.e();
            return;
        }
        at1.c(new C6092kt2(1, "Html video Web View failed to load. Error code: " + i + ", Description: " + str + ", Failing URL: " + str2));
    }

    public final void h(InterfaceC9334wW1 interfaceC9334wW1) {
        i(interfaceC9334wW1);
        interfaceC9334wW1.C("/video", GI1.l);
        interfaceC9334wW1.C("/videoMeta", GI1.m);
        interfaceC9334wW1.C("/precache", new C9609xV1());
        interfaceC9334wW1.C("/delayPageLoaded", GI1.p);
        interfaceC9334wW1.C("/instrument", GI1.n);
        interfaceC9334wW1.C("/log", GI1.g);
        interfaceC9334wW1.C("/click", new ZH1(null, 0 == true ? 1 : 0));
        if (this.a.b != null) {
            interfaceC9334wW1.zzN().m0(true);
            interfaceC9334wW1.C("/open", new SI1(null, null, null, null, null, null));
        } else {
            interfaceC9334wW1.zzN().m0(false);
        }
        if (zzt.zzn().z(interfaceC9334wW1.getContext())) {
            interfaceC9334wW1.C("/logScionEvent", new MI1(interfaceC9334wW1.getContext()));
        }
    }
}
