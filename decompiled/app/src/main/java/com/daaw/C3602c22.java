package com.daaw;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.zzt;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.daaw.c22, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3602c22 implements R62, J72, InterfaceC7273p72, zza, InterfaceC6157l72 {
    public final Context B;
    public final Executor C;
    public final Executor D;
    public final ScheduledExecutorService E;
    public final C9267wF2 F;
    public final C4498fF2 G;
    public final C5361iJ2 H;
    public final PF2 I;
    public final C7782qx1 J;
    public final C4497fF1 K;
    public final TI2 L;
    public final WeakReference M;
    public final WeakReference N;
    public final C6710n62 O;
    public boolean P;
    public final AtomicBoolean Q = new AtomicBoolean();
    public final C5065hF1 R;

    public C3602c22(Context context, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, C9267wF2 c9267wF2, C4498fF2 c4498fF2, C5361iJ2 c5361iJ2, PF2 pf2, View view, InterfaceC9334wW1 interfaceC9334wW1, C7782qx1 c7782qx1, C4497fF1 c4497fF1, C5065hF1 c5065hF1, TI2 ti2, C6710n62 c6710n62) {
        this.B = context;
        this.C = executor;
        this.D = executor2;
        this.E = scheduledExecutorService;
        this.F = c9267wF2;
        this.G = c4498fF2;
        this.H = c5361iJ2;
        this.I = pf2;
        this.J = c7782qx1;
        this.M = new WeakReference(view);
        this.N = new WeakReference(interfaceC9334wW1);
        this.K = c4497fF1;
        this.R = c5065hF1;
        this.L = ti2;
        this.O = c6710n62;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P() {
        String strZzh;
        int i;
        List list;
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.Ea)).booleanValue() && ((list = this.G.d) == null || list.isEmpty())) {
            return;
        }
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.m3)).booleanValue()) {
            strZzh = this.J.c().zzh(this.B, (View) this.M.get(), null);
        } else {
            strZzh = null;
        }
        if ((((Boolean) zzba.zzc().b(AbstractC9820yE1.n0)).booleanValue() && this.F.b.b.g) || !((Boolean) AF1.h.e()).booleanValue()) {
            PF2 pf2 = this.I;
            C5361iJ2 c5361iJ2 = this.H;
            C9267wF2 c9267wF2 = this.F;
            C4498fF2 c4498fF2 = this.G;
            pf2.a(c5361iJ2.d(c9267wF2, c4498fF2, false, strZzh, null, c4498fF2.d));
            return;
        }
        if (((Boolean) AF1.g.e()).booleanValue() && ((i = this.G.b) == 1 || i == 2 || i == 5)) {
        }
        AbstractC7360pS2.r((AbstractC4839gS2) AbstractC7360pS2.o(AbstractC4839gS2.C(AbstractC7360pS2.h(null)), ((Long) zzba.zzc().b(AbstractC9820yE1.U0)).longValue(), TimeUnit.MILLISECONDS, this.E), new C3324b22(this, strZzh), this.C);
    }

    public final /* synthetic */ void A(int i, int i2) {
        R(i - 1, i2);
    }

    public final /* synthetic */ void G(final int i, final int i2) {
        this.C.execute(new Runnable() { // from class: com.daaw.X12
            @Override // java.lang.Runnable
            public final void run() {
                this.B.A(i, i2);
            }
        });
    }

    public final void R(final int i, final int i2) {
        View view;
        if (i <= 0 || !((view = (View) this.M.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            P();
        } else {
            this.E.schedule(new Runnable() { // from class: com.daaw.Z12
                @Override // java.lang.Runnable
                public final void run() {
                    this.B.G(i, i2);
                }
            }, i2, TimeUnit.MILLISECONDS);
        }
    }

    @Override // com.daaw.InterfaceC6157l72
    public final void d(zze zzeVar) {
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.t1)).booleanValue()) {
            this.I.a(this.H.c(this.F, this.G, C5361iJ2.f(2, zzeVar.zza, this.G.q)));
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (!(((Boolean) zzba.zzc().b(AbstractC9820yE1.n0)).booleanValue() && this.F.b.b.g) && ((Boolean) AF1.d.e()).booleanValue()) {
            AbstractC7360pS2.r(AbstractC7360pS2.e(AbstractC4839gS2.C(this.K.a()), Throwable.class, new WN2() { // from class: com.daaw.W12
                @Override // com.daaw.WN2
                public final Object apply(Object obj) {
                    return "failure_click_attok";
                }
            }, AbstractC9322wT1.f), new C3045a22(this), this.C);
            return;
        }
        PF2 pf2 = this.I;
        C5361iJ2 c5361iJ2 = this.H;
        C9267wF2 c9267wF2 = this.F;
        C4498fF2 c4498fF2 = this.G;
        pf2.c(c5361iJ2.c(c9267wF2, c4498fF2, c4498fF2.c), true == zzt.zzo().x(this.B) ? 2 : 1);
    }

    @Override // com.daaw.R62
    public final void t(VP1 vp1, String str, String str2) {
        C5361iJ2 c5361iJ2 = this.H;
        C4498fF2 c4498fF2 = this.G;
        this.I.a(c5361iJ2.e(c4498fF2, c4498fF2.j, vp1));
    }

    @Override // com.daaw.R62
    public final void zze() {
        C5361iJ2 c5361iJ2 = this.H;
        C9267wF2 c9267wF2 = this.F;
        C4498fF2 c4498fF2 = this.G;
        this.I.a(c5361iJ2.c(c9267wF2, c4498fF2, c4498fF2.k));
    }

    @Override // com.daaw.R62
    public final void zzf() {
        C5361iJ2 c5361iJ2 = this.H;
        C9267wF2 c9267wF2 = this.F;
        C4498fF2 c4498fF2 = this.G;
        this.I.a(c5361iJ2.c(c9267wF2, c4498fF2, c4498fF2.i));
    }

    public final /* synthetic */ void zzm() {
        this.C.execute(new Runnable() { // from class: com.daaw.Y12
            @Override // java.lang.Runnable
            public final void run() {
                this.B.P();
            }
        });
    }

    @Override // com.daaw.InterfaceC7273p72
    public final void zzq() {
        if (this.Q.compareAndSet(false, true)) {
            int iIntValue = ((Integer) zzba.zzc().b(AbstractC9820yE1.v3)).intValue();
            if (iIntValue > 0) {
                R(iIntValue, ((Integer) zzba.zzc().b(AbstractC9820yE1.w3)).intValue());
                return;
            }
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.u3)).booleanValue()) {
                this.D.execute(new Runnable() { // from class: com.daaw.Q12
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.B.zzm();
                    }
                });
            } else {
                P();
            }
        }
    }

    @Override // com.daaw.J72
    public final synchronized void zzr() {
        C6710n62 c6710n62;
        try {
            if (this.P) {
                ArrayList arrayList = new ArrayList(this.G.d);
                arrayList.addAll(this.G.g);
                this.I.a(this.H.d(this.F, this.G, true, null, null, arrayList));
            } else {
                PF2 pf2 = this.I;
                C5361iJ2 c5361iJ2 = this.H;
                C9267wF2 c9267wF2 = this.F;
                C4498fF2 c4498fF2 = this.G;
                pf2.a(c5361iJ2.c(c9267wF2, c4498fF2, c4498fF2.o));
                if (((Boolean) zzba.zzc().b(AbstractC9820yE1.r3)).booleanValue() && (c6710n62 = this.O) != null) {
                    List listH = C5361iJ2.h(C5361iJ2.g(c6710n62.b().o, c6710n62.a().g()), this.O.a().a());
                    PF2 pf22 = this.I;
                    C5361iJ2 c5361iJ22 = this.H;
                    C6710n62 c6710n622 = this.O;
                    pf22.a(c5361iJ22.c(c6710n622.c(), c6710n622.b(), listH));
                }
                PF2 pf23 = this.I;
                C5361iJ2 c5361iJ23 = this.H;
                C9267wF2 c9267wF22 = this.F;
                C4498fF2 c4498fF22 = this.G;
                pf23.a(c5361iJ23.c(c9267wF22, c4498fF22, c4498fF22.g));
            }
            this.P = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.daaw.R62
    public final void zza() {
    }

    @Override // com.daaw.R62
    public final void zzb() {
    }

    @Override // com.daaw.R62
    public final void zzc() {
    }
}
