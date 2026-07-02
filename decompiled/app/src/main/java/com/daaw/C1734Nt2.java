package com.daaw;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzcaz;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.Nt2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1734Nt2 implements InterfaceC2682Wq2 {
    public final Context a;
    public final C2958Zh2 b;
    public final AbstractC1167Ih2 c;
    public final FF2 d;
    public final Executor e;
    public final zzcaz f;
    public final JI1 g;
    public final boolean h = ((Boolean) zzba.zzc().b(AbstractC9820yE1.E8)).booleanValue();
    public final BinderC9431wq2 i;

    public C1734Nt2(Context context, zzcaz zzcazVar, FF2 ff2, Executor executor, AbstractC1167Ih2 abstractC1167Ih2, C2958Zh2 c2958Zh2, JI1 ji1, BinderC9431wq2 binderC9431wq2) {
        this.a = context;
        this.d = ff2;
        this.c = abstractC1167Ih2;
        this.e = executor;
        this.f = zzcazVar;
        this.b = c2958Zh2;
        this.g = ji1;
        this.i = binderC9431wq2;
    }

    @Override // com.daaw.InterfaceC2682Wq2
    public final InterfaceFutureC8236sc0 a(final C9267wF2 c9267wF2, final C4498fF2 c4498fF2) {
        final C4065di2 c4065di2 = new C4065di2();
        InterfaceFutureC8236sc0 interfaceFutureC8236sc0N = AbstractC7360pS2.n(AbstractC7360pS2.h(null), new WR2() { // from class: com.daaw.Gt2
            @Override // com.daaw.WR2
            public final InterfaceFutureC8236sc0 zza(Object obj) {
                return this.a.c(c4498fF2, c9267wF2, c4065di2, obj);
            }
        }, this.e);
        interfaceFutureC8236sc0N.g(new Runnable() { // from class: com.daaw.Ht2
            @Override // java.lang.Runnable
            public final void run() {
                c4065di2.b();
            }
        }, this.e);
        return interfaceFutureC8236sc0N;
    }

    @Override // com.daaw.InterfaceC2682Wq2
    public final boolean b(C9267wF2 c9267wF2, C4498fF2 c4498fF2) {
        C6192lF2 c6192lF2 = c4498fF2.u;
        return (c6192lF2 == null || c6192lF2.a == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ InterfaceFutureC8236sc0 c(final C4498fF2 c4498fF2, C9267wF2 c9267wF2, C4065di2 c4065di2, Object obj) {
        final InterfaceC9334wW1 interfaceC9334wW1A = this.b.a(this.d.e, c4498fF2, c9267wF2.b.b);
        interfaceC9334wW1A.Q(c4498fF2.Y);
        c4065di2.a(this.a, (View) interfaceC9334wW1A);
        BT1 bt1 = new BT1();
        final AbstractC0326Ah2 abstractC0326Ah2B = this.c.b(new C10054z42(c9267wF2, c4498fF2, null), new C0430Bh2(new C1630Mt2(this.a, this.b, this.d, this.f, c4498fF2, bt1, interfaceC9334wW1A, this.g, this.h, this.i), interfaceC9334wW1A));
        bt1.b(abstractC0326Ah2B);
        C4234eJ1.b(interfaceC9334wW1A, abstractC0326Ah2B.i());
        abstractC0326Ah2B.b().x0(new InterfaceC7273p72() { // from class: com.daaw.It2
            @Override // com.daaw.InterfaceC7273p72
            public final void zzq() {
                InterfaceC9334wW1 interfaceC9334wW1 = interfaceC9334wW1A;
                if (interfaceC9334wW1.zzN() != null) {
                    interfaceC9334wW1.zzN().zzq();
                }
            }
        }, AbstractC9322wT1.f);
        abstractC0326Ah2B.l().i(interfaceC9334wW1A, true, this.h ? this.g : null);
        abstractC0326Ah2B.l();
        C6192lF2 c6192lF2 = c4498fF2.u;
        return AbstractC7360pS2.m(C2854Yh2.j(interfaceC9334wW1A, c6192lF2.b, c6192lF2.a), new WN2() { // from class: com.daaw.Jt2
            @Override // com.daaw.WN2
            public final Object apply(Object obj2) {
                InterfaceC9334wW1 interfaceC9334wW1 = interfaceC9334wW1A;
                if (c4498fF2.O) {
                    interfaceC9334wW1.N();
                }
                AbstractC0326Ah2 abstractC0326Ah2 = abstractC0326Ah2B;
                interfaceC9334wW1.zzY();
                interfaceC9334wW1.onPause();
                return abstractC0326Ah2.k();
            }
        }, this.e);
    }
}
