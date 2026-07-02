package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzcaz;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.kh2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6023kh2 {
    public final zza b;
    public final KW1 c;
    public final Context d;
    public final C1071Hj2 e;
    public final InterfaceC6483mI2 f;
    public final Executor g;
    public final C7782qx1 h;
    public final zzcaz i;
    public final C6077kq2 k;
    public final C6487mJ2 l;
    public final BinderC9431wq2 m;
    public InterfaceFutureC8236sc0 n;
    public final C2330Tg2 a = new C2330Tg2();
    public final WI1 j = new WI1();

    public C6023kh2(CallableC5185hh2 callableC5185hh2) {
        this.d = callableC5185hh2.c;
        this.g = callableC5185hh2.g;
        this.h = callableC5185hh2.h;
        this.i = callableC5185hh2.i;
        this.b = callableC5185hh2.a;
        this.c = callableC5185hh2.b;
        this.k = callableC5185hh2.f;
        this.l = callableC5185hh2.j;
        this.e = callableC5185hh2.d;
        this.f = callableC5185hh2.e;
        this.m = callableC5185hh2.k;
    }

    public final /* synthetic */ InterfaceC9334wW1 a(InterfaceC9334wW1 interfaceC9334wW1) {
        interfaceC9334wW1.C("/result", this.j);
        InterfaceC7936rX1 interfaceC7936rX1ZzN = interfaceC9334wW1.zzN();
        zzb zzbVar = new zzb(this.d, null, null);
        C6077kq2 c6077kq2 = this.k;
        C6487mJ2 c6487mJ2 = this.l;
        C1071Hj2 c1071Hj2 = this.e;
        InterfaceC6483mI2 interfaceC6483mI2 = this.f;
        C2330Tg2 c2330Tg2 = this.a;
        interfaceC7936rX1ZzN.O(null, c2330Tg2, c2330Tg2, c2330Tg2, c2330Tg2, false, null, zzbVar, null, null, c6077kq2, c6487mJ2, c1071Hj2, interfaceC6483mI2, null, null, null, null, null);
        return interfaceC9334wW1;
    }

    public final /* synthetic */ InterfaceFutureC8236sc0 c(String str, JSONObject jSONObject, InterfaceC9334wW1 interfaceC9334wW1) {
        return this.j.b(interfaceC9334wW1, str, jSONObject);
    }

    public final synchronized InterfaceFutureC8236sc0 d(final String str, final JSONObject jSONObject) {
        InterfaceFutureC8236sc0 interfaceFutureC8236sc0 = this.n;
        if (interfaceFutureC8236sc0 == null) {
            return AbstractC7360pS2.h(null);
        }
        return AbstractC7360pS2.n(interfaceFutureC8236sc0, new WR2() { // from class: com.daaw.Ug2
            @Override // com.daaw.WR2
            public final InterfaceFutureC8236sc0 zza(Object obj) {
                return this.a.c(str, jSONObject, (InterfaceC9334wW1) obj);
            }
        }, this.g);
    }

    public final synchronized void e(C4498fF2 c4498fF2, C5622jF2 c5622jF2) {
        InterfaceFutureC8236sc0 interfaceFutureC8236sc0 = this.n;
        if (interfaceFutureC8236sc0 == null) {
            return;
        }
        AbstractC7360pS2.r(interfaceFutureC8236sc0, new C4338eh2(this, c4498fF2, c5622jF2), this.g);
    }

    public final synchronized void f() {
        InterfaceFutureC8236sc0 interfaceFutureC8236sc0 = this.n;
        if (interfaceFutureC8236sc0 == null) {
            return;
        }
        AbstractC7360pS2.r(interfaceFutureC8236sc0, new C2642Wg2(this), this.g);
        this.n = null;
    }

    public final synchronized void g(String str, Map map) {
        InterfaceFutureC8236sc0 interfaceFutureC8236sc0 = this.n;
        if (interfaceFutureC8236sc0 == null) {
            return;
        }
        AbstractC7360pS2.r(interfaceFutureC8236sc0, new C4060dh2(this, "sendMessageToNativeJs", map), this.g);
    }

    public final synchronized void h() {
        final String str = (String) zzba.zzc().b(AbstractC9820yE1.A3);
        final Context context = this.d;
        final C7782qx1 c7782qx1 = this.h;
        final zzcaz zzcazVar = this.i;
        final zza zzaVar = this.b;
        final BinderC9431wq2 binderC9431wq2 = this.m;
        InterfaceFutureC8236sc0 interfaceFutureC8236sc0M = AbstractC7360pS2.m(AbstractC7360pS2.k(new RR2() { // from class: com.daaw.IW1
            @Override // com.daaw.RR2
            public final InterfaceFutureC8236sc0 zza() throws JW1 {
                zzt.zzz();
                Context context2 = context;
                C8494tX1 c8494tX1A = C8494tX1.a();
                C7782qx1 c7782qx12 = c7782qx1;
                zza zzaVar2 = zzaVar;
                InterfaceC9334wW1 interfaceC9334wW1A = KW1.a(context2, c8494tX1A, "", false, false, c7782qx12, null, zzcazVar, null, null, zzaVar2, C6454mB1.a(), null, null, binderC9431wq2);
                final AT1 at1D = AT1.d(interfaceC9334wW1A);
                interfaceC9334wW1A.zzN().I(new InterfaceC7379pX1() { // from class: com.daaw.GW1
                    @Override // com.daaw.InterfaceC7379pX1
                    public final void zza(boolean z, int i, String str2, String str3) {
                        at1D.e();
                    }
                });
                interfaceC9334wW1A.loadUrl(str);
                return at1D;
            }
        }, AbstractC9322wT1.e), new WN2() { // from class: com.daaw.Vg2
            @Override // com.daaw.WN2
            public final Object apply(Object obj) {
                InterfaceC9334wW1 interfaceC9334wW1 = (InterfaceC9334wW1) obj;
                this.a.a(interfaceC9334wW1);
                return interfaceC9334wW1;
            }
        }, this.g);
        this.n = interfaceFutureC8236sc0M;
        AbstractC10159zT1.a(interfaceFutureC8236sc0M, "NativeJavascriptExecutor.initializeEngine");
    }

    public final synchronized void i(String str, HI1 hi1) {
        InterfaceFutureC8236sc0 interfaceFutureC8236sc0 = this.n;
        if (interfaceFutureC8236sc0 == null) {
            return;
        }
        AbstractC7360pS2.r(interfaceFutureC8236sc0, new C2746Xg2(this, str, hi1), this.g);
    }

    public final void j(WeakReference weakReference, String str, HI1 hi1) {
        i(str, new C5744jh2(this, weakReference, str, hi1, null));
    }

    public final synchronized void k(String str, HI1 hi1) {
        InterfaceFutureC8236sc0 interfaceFutureC8236sc0 = this.n;
        if (interfaceFutureC8236sc0 == null) {
            return;
        }
        AbstractC7360pS2.r(interfaceFutureC8236sc0, new C3781ch2(this, str, hi1), this.g);
    }
}
