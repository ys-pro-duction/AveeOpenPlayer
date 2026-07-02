package com.daaw;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class UC2 implements InterfaceC1742Nv2 {
    public final Context a;
    public final Executor b;
    public final AbstractC10175zX1 c;
    public final C8611tv2 d;
    public final C9734xv2 e;
    public final ViewGroup f;
    public InterfaceC3383bF1 g;
    public final M82 h;
    public final WI2 i;
    public final C4303ea2 j;
    public final DF2 k;
    public InterfaceFutureC8236sc0 l;

    public UC2(Context context, Executor executor, zzq zzqVar, AbstractC10175zX1 abstractC10175zX1, C8611tv2 c8611tv2, C9734xv2 c9734xv2, DF2 df2, C4303ea2 c4303ea2) {
        this.a = context;
        this.b = executor;
        this.c = abstractC10175zX1;
        this.d = c8611tv2;
        this.e = c9734xv2;
        this.k = df2;
        this.h = abstractC10175zX1.k();
        this.i = abstractC10175zX1.D();
        this.f = new FrameLayout(context);
        this.j = c4303ea2;
        df2.I(zzqVar);
    }

    @Override // com.daaw.InterfaceC1742Nv2
    public final boolean a(zzl zzlVar, String str, AbstractC1119Hv2 abstractC1119Hv2, InterfaceC1223Iv2 interfaceC1223Iv2) {
        AbstractC9212w32 abstractC9212w32Zzk;
        if (str == null) {
            AbstractC4274eT1.zzg("Ad unit ID should not be null for banner ad.");
            this.b.execute(new Runnable() { // from class: com.daaw.MC2
                @Override // java.lang.Runnable
                public final void run() {
                    this.B.l();
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
        DF2 df2 = this.k;
        df2.J(str);
        df2.e(zzlVar);
        Context context = this.a;
        FF2 ff2G = df2.g();
        EI2 ei2B = DI2.b(context, SI2.f(ff2G), 3, zzlVar);
        TI2 ti2F = null;
        if (((Boolean) HF1.e.e()).booleanValue() && this.k.x().zzk) {
            C8611tv2 c8611tv2 = this.d;
            if (c8611tv2 != null) {
                c8611tv2.P(AbstractC5908kG2.d(7, null, null));
            }
            return false;
        }
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.U7)).booleanValue()) {
            InterfaceC8933v32 interfaceC8933v32J = this.c.j();
            C8383t62 c8383t62 = new C8383t62();
            c8383t62.e(this.a);
            c8383t62.i(ff2G);
            interfaceC8933v32J.m(c8383t62.j());
            C0610Da2 c0610Da2 = new C0610Da2();
            c0610Da2.m(this.d, this.b);
            c0610Da2.n(this.d, this.b);
            interfaceC8933v32J.n(c0610Da2.q());
            interfaceC8933v32J.l(new C8886uu2(this.g));
            interfaceC8933v32J.a(new C6291ld2(C0522Ce2.h, null));
            interfaceC8933v32J.i(new X32(this.h, this.j));
            interfaceC8933v32J.d(new S22(this.f));
            abstractC9212w32Zzk = interfaceC8933v32J.zzh();
        } else {
            InterfaceC8933v32 interfaceC8933v32J2 = this.c.j();
            C8383t62 c8383t622 = new C8383t62();
            c8383t622.e(this.a);
            c8383t622.i(ff2G);
            interfaceC8933v32J2.m(c8383t622.j());
            C0610Da2 c0610Da22 = new C0610Da2();
            c0610Da22.m(this.d, this.b);
            c0610Da22.d(this.d, this.b);
            c0610Da22.d(this.e, this.b);
            c0610Da22.o(this.d, this.b);
            c0610Da22.g(this.d, this.b);
            c0610Da22.h(this.d, this.b);
            c0610Da22.i(this.d, this.b);
            c0610Da22.e(this.d, this.b);
            c0610Da22.n(this.d, this.b);
            c0610Da22.l(this.d, this.b);
            interfaceC8933v32J2.n(c0610Da22.q());
            interfaceC8933v32J2.l(new C8886uu2(this.g));
            interfaceC8933v32J2.a(new C6291ld2(C0522Ce2.h, null));
            interfaceC8933v32J2.i(new X32(this.h, this.j));
            interfaceC8933v32J2.d(new S22(this.f));
            abstractC9212w32Zzk = interfaceC8933v32J2.zzh();
        }
        AbstractC9212w32 abstractC9212w32 = abstractC9212w32Zzk;
        if (((Boolean) AbstractC7307pF1.c.e()).booleanValue()) {
            ti2F = abstractC9212w32.f();
            ti2F.h(3);
            ti2F.b(zzlVar.zzp);
        }
        V42 v42D = abstractC9212w32.d();
        InterfaceFutureC8236sc0 interfaceFutureC8236sc0I = v42D.i(v42D.j());
        this.l = interfaceFutureC8236sc0I;
        AbstractC7360pS2.r(interfaceFutureC8236sc0I, new TC2(this, interfaceC1223Iv2, ti2F, ei2B, abstractC9212w32), this.b);
        return true;
    }

    public final ViewGroup c() {
        return this.f;
    }

    public final DF2 h() {
        return this.k;
    }

    public final /* synthetic */ void l() {
        this.d.P(AbstractC5908kG2.d(6, null, null));
    }

    public final void m() {
        this.h.B0(this.j.a());
    }

    public final void n(zzbe zzbeVar) {
        this.e.a(zzbeVar);
    }

    public final void o(N82 n82) {
        this.h.x0(n82, this.b);
    }

    public final void p(InterfaceC3383bF1 interfaceC3383bF1) {
        this.g = interfaceC3383bF1;
    }

    public final boolean q() {
        Object parent = this.f.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        zzt.zzp();
        return com.google.android.gms.ads.internal.util.zzt.zzV(view, view.getContext());
    }

    @Override // com.daaw.InterfaceC1742Nv2
    public final boolean zza() {
        InterfaceFutureC8236sc0 interfaceFutureC8236sc0 = this.l;
        return (interfaceFutureC8236sc0 == null || interfaceFutureC8236sc0.isDone()) ? false : true;
    }
}
