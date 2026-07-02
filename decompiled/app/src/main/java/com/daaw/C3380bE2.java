package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.bE2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3380bE2 implements InterfaceC1742Nv2 {
    public final Context a;
    public final Executor b;
    public final AbstractC10175zX1 c;
    public final C8611tv2 d;
    public final FE2 e;
    public InterfaceC3383bF1 f;
    public final WI2 g;
    public final DF2 h;
    public InterfaceFutureC8236sc0 i;

    public C3380bE2(Context context, Executor executor, AbstractC10175zX1 abstractC10175zX1, C8611tv2 c8611tv2, FE2 fe2, DF2 df2) {
        this.a = context;
        this.b = executor;
        this.c = abstractC10175zX1;
        this.d = c8611tv2;
        this.h = df2;
        this.e = fe2;
        this.g = abstractC10175zX1.D();
    }

    @Override // com.daaw.InterfaceC1742Nv2
    public final boolean a(zzl zzlVar, String str, AbstractC1119Hv2 abstractC1119Hv2, InterfaceC1223Iv2 interfaceC1223Iv2) {
        AbstractC1978Qc2 abstractC1978Qc2Zzf;
        TI2 ti2D;
        if (str == null) {
            AbstractC4274eT1.zzg("Ad unit ID should not be null for interstitial ad.");
            this.b.execute(new Runnable() { // from class: com.daaw.VD2
                @Override // java.lang.Runnable
                public final void run() {
                    this.B.g();
                }
            });
            return false;
        }
        if (zza()) {
            return false;
        }
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.F8)).booleanValue() && zzlVar.zzf) {
            this.c.p().n(true);
        }
        zzq zzqVar = ((UD2) abstractC1119Hv2).a;
        DF2 df2 = this.h;
        df2.J(str);
        df2.I(zzqVar);
        df2.e(zzlVar);
        Context context = this.a;
        FF2 ff2G = df2.g();
        EI2 ei2B = DI2.b(context, SI2.f(ff2G), 4, zzlVar);
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.W7)).booleanValue()) {
            InterfaceC1874Pc2 interfaceC1874Pc2L = this.c.l();
            C8383t62 c8383t62 = new C8383t62();
            c8383t62.e(this.a);
            c8383t62.i(ff2G);
            interfaceC1874Pc2L.j(c8383t62.j());
            C0610Da2 c0610Da2 = new C0610Da2();
            c0610Da2.m(this.d, this.b);
            c0610Da2.n(this.d, this.b);
            interfaceC1874Pc2L.f(c0610Da2.q());
            interfaceC1874Pc2L.o(new C8886uu2(this.f));
            abstractC1978Qc2Zzf = interfaceC1874Pc2L.zzh();
        } else {
            C0610Da2 c0610Da22 = new C0610Da2();
            FE2 fe2 = this.e;
            if (fe2 != null) {
                c0610Da22.h(fe2, this.b);
                c0610Da22.i(this.e, this.b);
                c0610Da22.e(this.e, this.b);
            }
            InterfaceC1874Pc2 interfaceC1874Pc2L2 = this.c.l();
            C8383t62 c8383t622 = new C8383t62();
            c8383t622.e(this.a);
            c8383t622.i(ff2G);
            interfaceC1874Pc2L2.j(c8383t622.j());
            c0610Da22.m(this.d, this.b);
            c0610Da22.h(this.d, this.b);
            c0610Da22.i(this.d, this.b);
            c0610Da22.e(this.d, this.b);
            c0610Da22.d(this.d, this.b);
            c0610Da22.o(this.d, this.b);
            c0610Da22.n(this.d, this.b);
            c0610Da22.l(this.d, this.b);
            c0610Da22.f(this.d, this.b);
            interfaceC1874Pc2L2.f(c0610Da22.q());
            interfaceC1874Pc2L2.o(new C8886uu2(this.f));
            abstractC1978Qc2Zzf = interfaceC1874Pc2L2.zzh();
        }
        AbstractC1978Qc2 abstractC1978Qc2 = abstractC1978Qc2Zzf;
        if (((Boolean) AbstractC7307pF1.c.e()).booleanValue()) {
            ti2D = abstractC1978Qc2.d();
            ti2D.h(4);
            ti2D.b(zzlVar.zzp);
        } else {
            ti2D = null;
        }
        TI2 ti2 = ti2D;
        V42 v42A = abstractC1978Qc2.a();
        InterfaceFutureC8236sc0 interfaceFutureC8236sc0I = v42A.i(v42A.j());
        this.i = interfaceFutureC8236sc0I;
        AbstractC7360pS2.r(interfaceFutureC8236sc0I, new C3101aE2(this, interfaceC1223Iv2, ti2, ei2B, abstractC1978Qc2), this.b);
        return true;
    }

    public final /* synthetic */ void g() {
        this.d.P(AbstractC5908kG2.d(6, null, null));
    }

    public final void h(InterfaceC3383bF1 interfaceC3383bF1) {
        this.f = interfaceC3383bF1;
    }

    @Override // com.daaw.InterfaceC1742Nv2
    public final boolean zza() {
        InterfaceFutureC8236sc0 interfaceFutureC8236sc0 = this.i;
        return (interfaceFutureC8236sc0 == null || interfaceFutureC8236sc0.isDone()) ? false : true;
    }
}
