package com.daaw;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzfl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zzau;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.Br2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0470Br2 implements InterfaceC2682Wq2 {
    public final AbstractC9212w32 a;
    public final Context b;
    public final C2958Zh2 c;
    public final FF2 d;
    public final Executor e;
    public final WN2 f;

    public C0470Br2(AbstractC9212w32 abstractC9212w32, Context context, Executor executor, C2958Zh2 c2958Zh2, FF2 ff2, WN2 wn2) {
        this.b = context;
        this.a = abstractC9212w32;
        this.e = executor;
        this.c = c2958Zh2;
        this.d = ff2;
        this.f = wn2;
    }

    @Override // com.daaw.InterfaceC2682Wq2
    public final InterfaceFutureC8236sc0 a(final C9267wF2 c9267wF2, final C4498fF2 c4498fF2) {
        return AbstractC7360pS2.n(AbstractC7360pS2.h(null), new WR2() { // from class: com.daaw.Ar2
            @Override // com.daaw.WR2
            public final InterfaceFutureC8236sc0 zza(Object obj) {
                return this.a.c(c9267wF2, c4498fF2, obj);
            }
        }, this.e);
    }

    @Override // com.daaw.InterfaceC2682Wq2
    public final boolean b(C9267wF2 c9267wF2, C4498fF2 c4498fF2) {
        C6192lF2 c6192lF2 = c4498fF2.u;
        return (c6192lF2 == null || c6192lF2.a == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ InterfaceFutureC8236sc0 c(C9267wF2 c9267wF2, C4498fF2 c4498fF2, Object obj) {
        View c3786ci2;
        zzq zzqVarA = JF2.a(this.b, c4498fF2.w);
        final InterfaceC9334wW1 interfaceC9334wW1A = this.c.a(zzqVarA, c4498fF2, c9267wF2.b.b);
        interfaceC9334wW1A.Q(c4498fF2.Y);
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.D7)).booleanValue() && c4498fF2.i0) {
            c3786ci2 = R32.a(this.b, (View) interfaceC9334wW1A, c4498fF2);
        } else {
            c3786ci2 = new C3786ci2(this.b, (View) interfaceC9334wW1A, (zzau) this.f.apply(c4498fF2));
        }
        final W22 w22A = this.a.a(new C10054z42(c9267wF2, c4498fF2, null), new C4732g32(c3786ci2, interfaceC9334wW1A, new InterfaceC3891d42() { // from class: com.daaw.vr2
            @Override // com.daaw.InterfaceC3891d42
            public final zzdq zza() {
                return interfaceC9334wW1A.zzq();
            }
        }, JF2.b(zzqVarA)));
        w22A.j().i(interfaceC9334wW1A, false, null);
        C6715n72 c6715n72B = w22A.b();
        InterfaceC7273p72 interfaceC7273p72 = new InterfaceC7273p72() { // from class: com.daaw.wr2
            @Override // com.daaw.InterfaceC7273p72
            public final void zzq() {
                InterfaceC9334wW1 interfaceC9334wW1 = interfaceC9334wW1A;
                if (interfaceC9334wW1.zzN() != null) {
                    interfaceC9334wW1.zzN().zzq();
                }
            }
        };
        PS2 ps2 = AbstractC9322wT1.f;
        c6715n72B.x0(interfaceC7273p72, ps2);
        w22A.j();
        C6192lF2 c6192lF2 = c4498fF2.u;
        InterfaceFutureC8236sc0 interfaceFutureC8236sc0J = C2854Yh2.j(interfaceC9334wW1A, c6192lF2.b, c6192lF2.a);
        if (c4498fF2.O) {
            interfaceFutureC8236sc0J.g(new Runnable() { // from class: com.daaw.xr2
                @Override // java.lang.Runnable
                public final void run() {
                    interfaceC9334wW1A.N();
                }
            }, this.e);
        }
        interfaceFutureC8236sc0J.g(new Runnable() { // from class: com.daaw.yr2
            @Override // java.lang.Runnable
            public final void run() {
                this.B.d(interfaceC9334wW1A);
            }
        }, this.e);
        return AbstractC7360pS2.m(interfaceFutureC8236sc0J, new WN2() { // from class: com.daaw.zr2
            @Override // com.daaw.WN2
            public final Object apply(Object obj2) {
                return w22A.h();
            }
        }, ps2);
    }

    public final /* synthetic */ void d(InterfaceC9334wW1 interfaceC9334wW1) {
        interfaceC9334wW1.zzY();
        UW1 uw1Zzq = interfaceC9334wW1.zzq();
        zzfl zzflVar = this.d.a;
        if (zzflVar == null || uw1Zzq == null) {
            return;
        }
        uw1Zzq.c3(zzflVar);
    }
}
