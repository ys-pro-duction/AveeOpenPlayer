package com.daaw;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class SE2 implements InterfaceC1742Nv2 {
    public final Context a;
    public final Executor b;
    public final AbstractC10175zX1 c;
    public final FE2 d;
    public final PD2 e;
    public final C9546xF2 f;
    public final WI2 g;
    public final DF2 h;
    public InterfaceFutureC8236sc0 i;

    public SE2(Context context, Executor executor, AbstractC10175zX1 abstractC10175zX1, PD2 pd2, FE2 fe2, DF2 df2, C9546xF2 c9546xF2) {
        this.a = context;
        this.b = executor;
        this.c = abstractC10175zX1;
        this.e = pd2;
        this.d = fe2;
        this.h = df2;
        this.f = c9546xF2;
        this.g = abstractC10175zX1.D();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    @Override // com.daaw.InterfaceC1742Nv2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(com.google.android.gms.ads.internal.client.zzl r9, java.lang.String r10, com.daaw.AbstractC1119Hv2 r11, com.daaw.InterfaceC1223Iv2 r12) {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.zzbwd r11 = new com.google.android.gms.internal.ads.zzbwd
            r11.<init>(r9, r10)
            java.lang.String r9 = r11.C
            r10 = 0
            if (r9 != 0) goto L1a
            java.lang.String r9 = "Ad unit ID should not be null for rewarded video ad."
            com.daaw.AbstractC4274eT1.zzg(r9)
            java.util.concurrent.Executor r9 = r8.b
            com.daaw.IE2 r11 = new com.daaw.IE2
            r11.<init>()
            r9.execute(r11)
            return r10
        L1a:
            com.daaw.sc0 r9 = r8.i
            if (r9 == 0) goto L25
            boolean r9 = r9.isDone()
            if (r9 != 0) goto L25
            return r10
        L25:
            com.daaw.iF1 r9 = com.daaw.AbstractC7307pF1.c
            java.lang.Object r9 = r9.e()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            r10 = 5
            r0 = 0
            if (r9 == 0) goto L53
            com.daaw.PD2 r9 = r8.e
            java.lang.Object r1 = r9.zzd()
            if (r1 == 0) goto L53
            java.lang.Object r9 = r9.zzd()
            com.daaw.Ih2 r9 = (com.daaw.AbstractC1167Ih2) r9
            com.daaw.TI2 r9 = r9.zzh()
            r9.h(r10)
            com.google.android.gms.ads.internal.client.zzl r1 = r11.B
            java.lang.String r1 = r1.zzp
            r9.b(r1)
            r5 = r9
            goto L54
        L53:
            r5 = r0
        L54:
            android.content.Context r9 = r8.a
            com.google.android.gms.ads.internal.client.zzl r1 = r11.B
            boolean r1 = r1.zzf
            com.daaw.AbstractC4223eG2.a(r9, r1)
            com.daaw.qE1 r9 = com.daaw.AbstractC9820yE1.F8
            com.daaw.wE1 r1 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r9 = r1.b(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            r1 = 1
            if (r9 == 0) goto L7f
            com.google.android.gms.ads.internal.client.zzl r9 = r11.B
            boolean r9 = r9.zzf
            if (r9 == 0) goto L7f
            com.daaw.zX1 r9 = r8.c
            com.daaw.pl2 r9 = r9.p()
            r9.n(r1)
        L7f:
            com.daaw.DF2 r9 = r8.h
            java.lang.String r2 = r11.C
            r9.J(r2)
            com.google.android.gms.ads.internal.client.zzq r2 = com.google.android.gms.ads.internal.client.zzq.zzd()
            r9.I(r2)
            com.google.android.gms.ads.internal.client.zzl r2 = r11.B
            r9.e(r2)
            android.content.Context r2 = r8.a
            com.daaw.FF2 r9 = r9.g()
            int r3 = com.daaw.SI2.f(r9)
            com.google.android.gms.ads.internal.client.zzl r11 = r11.B
            com.daaw.EI2 r6 = com.daaw.DI2.b(r2, r3, r10, r11)
            com.daaw.RE2 r7 = new com.daaw.RE2
            r7.<init>(r0)
            r7.a = r9
            com.daaw.PD2 r9 = r8.e
            com.daaw.QD2 r10 = new com.daaw.QD2
            r10.<init>(r7, r0)
            com.daaw.JE2 r11 = new com.daaw.JE2
            r11.<init>()
            com.daaw.sc0 r9 = r9.a(r10, r11, r0)
            r8.i = r9
            com.daaw.PE2 r2 = new com.daaw.PE2
            r3 = r8
            r4 = r12
            r2.<init>(r3, r4, r5, r6, r7)
            java.util.concurrent.Executor r10 = r3.b
            com.daaw.AbstractC7360pS2.r(r9, r2, r10)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.SE2.a(com.google.android.gms.ads.internal.client.zzl, java.lang.String, com.daaw.Hv2, com.daaw.Iv2):boolean");
    }

    public final /* synthetic */ void h() {
        this.d.P(AbstractC5908kG2.d(6, null, null));
    }

    public final void i(int i) {
        this.h.F().a(i);
    }

    public final InterfaceC1063Hh2 j(ND2 nd2) {
        InterfaceC1063Hh2 interfaceC1063Hh2N = this.c.n();
        C8383t62 c8383t62 = new C8383t62();
        c8383t62.e(this.a);
        c8383t62.i(((RE2) nd2).a);
        c8383t62.h(this.f);
        interfaceC1063Hh2N.c(c8383t62.j());
        interfaceC1063Hh2N.b(new C0610Da2().q());
        return interfaceC1063Hh2N;
    }

    @Override // com.daaw.InterfaceC1742Nv2
    public final boolean zza() {
        throw null;
    }
}
