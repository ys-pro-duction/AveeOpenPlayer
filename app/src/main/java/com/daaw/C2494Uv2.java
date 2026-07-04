package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: com.daaw.Uv2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2494Uv2 implements InterfaceC1742Nv2 {
    public final DF2 a;
    public final AbstractC10175zX1 b;
    public final Context c;
    public final C1015Gv2 d;
    public final WI2 e;
    public C9775y42 f;

    public C2494Uv2(AbstractC10175zX1 abstractC10175zX1, Context context, C1015Gv2 c1015Gv2, DF2 df2) {
        this.b = abstractC10175zX1;
        this.c = context;
        this.d = c1015Gv2;
        this.a = df2;
        this.e = abstractC10175zX1.D();
        df2.L(c1015Gv2.d());
    }

    @Override // com.daaw.InterfaceC1742Nv2
    public final boolean a(zzl zzlVar, String str, AbstractC1119Hv2 abstractC1119Hv2, InterfaceC1223Iv2 interfaceC1223Iv2) {
        zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzt.zzG(this.c) && zzlVar.zzs == null) {
            AbstractC4274eT1.zzg("Failed to load the ad because app ID is missing.");
            this.b.c().execute(new Runnable() { // from class: com.daaw.Pv2
                @Override // java.lang.Runnable
                public final void run() {
                    this.B.e();
                }
            });
            return false;
        }
        if (str == null) {
            AbstractC4274eT1.zzg("Ad unit ID should not be null for NativeAdLoader.");
            this.b.c().execute(new Runnable() { // from class: com.daaw.Qv2
                @Override // java.lang.Runnable
                public final void run() {
                    this.B.f();
                }
            });
            return false;
        }
        AbstractC4223eG2.a(this.c, zzlVar.zzf);
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.F8)).booleanValue() && zzlVar.zzf) {
            this.b.p().n(true);
        }
        int i = ((C1846Ov2) abstractC1119Hv2).a;
        DF2 df2 = this.a;
        df2.e(zzlVar);
        df2.Q(i);
        Context context = this.c;
        FF2 ff2G = df2.g();
        EI2 ei2B = DI2.b(context, SI2.f(ff2G), 8, zzlVar);
        zzcb zzcbVar = ff2G.n;
        if (zzcbVar != null) {
            this.d.d().A(zzcbVar);
        }
        InterfaceC7407pd2 interfaceC7407pd2M = this.b.m();
        C8383t62 c8383t62 = new C8383t62();
        c8383t62.e(this.c);
        c8383t62.i(ff2G);
        interfaceC7407pd2M.g(c8383t62.j());
        C0610Da2 c0610Da2 = new C0610Da2();
        c0610Da2.n(this.d.d(), this.b.c());
        interfaceC7407pd2M.p(c0610Da2.q());
        interfaceC7407pd2M.a(this.d.c());
        TI2 ti2E = null;
        interfaceC7407pd2M.d(new S22(null));
        AbstractC7686qd2 abstractC7686qd2Zzg = interfaceC7407pd2M.zzg();
        if (((Boolean) AbstractC7307pF1.c.e()).booleanValue()) {
            ti2E = abstractC7686qd2Zzg.e();
            ti2E.h(8);
            ti2E.b(zzlVar.zzp);
        }
        TI2 ti2 = ti2E;
        this.b.B().c(1);
        PS2 ps2 = AbstractC9322wT1.a;
        AbstractC7000o83.b(ps2);
        ScheduledExecutorService scheduledExecutorServiceD = this.b.d();
        V42 v42A = abstractC7686qd2Zzg.a();
        C9775y42 c9775y42 = new C9775y42(ps2, scheduledExecutorServiceD, v42A.i(v42A.j()));
        this.f = c9775y42;
        c9775y42.e(new C2390Tv2(this, interfaceC1223Iv2, ti2, ei2B, abstractC7686qd2Zzg));
        return true;
    }

    public final /* synthetic */ void e() {
        this.d.a().P(AbstractC5908kG2.d(4, null, null));
    }

    public final /* synthetic */ void f() {
        this.d.a().P(AbstractC5908kG2.d(6, null, null));
    }

    @Override // com.daaw.InterfaceC1742Nv2
    public final boolean zza() {
        C9775y42 c9775y42 = this.f;
        return c9775y42 != null && c9775y42.f();
    }
}
