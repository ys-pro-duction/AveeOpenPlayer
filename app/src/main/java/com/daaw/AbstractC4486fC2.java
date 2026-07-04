package com.daaw;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.internal.ads.zzcaz;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.fC2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4486fC2 implements InterfaceC1742Nv2 {
    public final Context a;
    public final Executor b;
    public final AbstractC10175zX1 c;
    public final CC2 d;
    public final PD2 e;
    public final zzcaz f;
    public final ViewGroup g;
    public final WI2 h;
    public final DF2 i;
    public InterfaceFutureC8236sc0 j;

    public AbstractC4486fC2(Context context, Executor executor, AbstractC10175zX1 abstractC10175zX1, PD2 pd2, CC2 cc2, DF2 df2, zzcaz zzcazVar) {
        this.a = context;
        this.b = executor;
        this.c = abstractC10175zX1;
        this.e = pd2;
        this.d = cc2;
        this.i = df2;
        this.f = zzcazVar;
        this.g = new FrameLayout(context);
        this.h = abstractC10175zX1.D();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // com.daaw.InterfaceC1742Nv2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean a(com.google.android.gms.ads.internal.client.zzl r8, java.lang.String r9, com.daaw.AbstractC1119Hv2 r10, com.daaw.InterfaceC1223Iv2 r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC4486fC2.a(com.google.android.gms.ads.internal.client.zzl, java.lang.String, com.daaw.Hv2, com.daaw.Iv2):boolean");
    }

    public abstract InterfaceC7825r62 d(S22 s22, C8948v62 c8948v62, C0827Fa2 c0827Fa2);

    public final /* synthetic */ void j() {
        this.d.P(AbstractC5908kG2.d(6, null, null));
    }

    public final void k(zzw zzwVar) {
        this.i.K(zzwVar);
    }

    public final synchronized InterfaceC7825r62 l(ND2 nd2) {
        C4207eC2 c4207eC2 = (C4207eC2) nd2;
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.V7)).booleanValue()) {
            S22 s22 = new S22(this.g);
            C8383t62 c8383t62 = new C8383t62();
            c8383t62.e(this.a);
            c8383t62.i(c4207eC2.a);
            C8948v62 c8948v62J = c8383t62.j();
            C0610Da2 c0610Da2 = new C0610Da2();
            c0610Da2.f(this.d, this.b);
            c0610Da2.o(this.d, this.b);
            return d(s22, c8948v62J, c0610Da2.q());
        }
        CC2 cc2L = CC2.l(this.d);
        C0610Da2 c0610Da22 = new C0610Da2();
        c0610Da22.e(cc2L, this.b);
        c0610Da22.j(cc2L, this.b);
        c0610Da22.k(cc2L, this.b);
        c0610Da22.l(cc2L, this.b);
        c0610Da22.f(cc2L, this.b);
        c0610Da22.o(cc2L, this.b);
        c0610Da22.p(cc2L);
        S22 s222 = new S22(this.g);
        C8383t62 c8383t622 = new C8383t62();
        c8383t622.e(this.a);
        c8383t622.i(c4207eC2.a);
        return d(s222, c8383t622.j(), c0610Da22.q());
    }

    @Override // com.daaw.InterfaceC1742Nv2
    public final boolean zza() {
        InterfaceFutureC8236sc0 interfaceFutureC8236sc0 = this.j;
        return (interfaceFutureC8236sc0 == null || interfaceFutureC8236sc0.isDone()) ? false : true;
    }
}
