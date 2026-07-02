package com.daaw;

import com.google.android.gms.ads.internal.client.zzl;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.fD2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4490fD2 implements PD2 {
    public final PD2 a;
    public final PD2 b;
    public final VG2 c;
    public final String d;
    public InterfaceC8104s62 e;
    public final Executor f;

    public C4490fD2(PD2 pd2, PD2 pd22, VG2 vg2, String str, Executor executor) {
        this.a = pd2;
        this.b = pd22;
        this.c = vg2;
        this.d = str;
        this.f = executor;
    }

    @Override // com.daaw.PD2
    public final /* bridge */ /* synthetic */ InterfaceFutureC8236sc0 a(QD2 qd2, OD2 od2, Object obj) {
        return e(qd2, od2, null);
    }

    @Override // com.daaw.PD2
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized InterfaceC8104s62 zzd() {
        return this.e;
    }

    public final /* synthetic */ InterfaceFutureC8236sc0 c(QD2 qd2, C4211eD2 c4211eD2, OD2 od2, InterfaceC8104s62 interfaceC8104s62, C5896kD2 c5896kD2) {
        if (c5896kD2 != null) {
            C4211eD2 c4211eD22 = new C4211eD2(c4211eD2.a, c4211eD2.b, c4211eD2.c, c4211eD2.d, c4211eD2.e, c4211eD2.f, c5896kD2.a);
            if (c5896kD2.c != null) {
                this.e = null;
                this.c.e(c4211eD22);
                return f(c5896kD2.c, qd2);
            }
            InterfaceFutureC8236sc0 interfaceFutureC8236sc0A = this.c.a(c4211eD22);
            if (interfaceFutureC8236sc0A != null) {
                this.e = null;
                return AbstractC7360pS2.n(interfaceFutureC8236sc0A, new WR2() { // from class: com.daaw.bD2
                    @Override // com.daaw.WR2
                    public final InterfaceFutureC8236sc0 zza(Object obj) {
                        return this.a.d((SG2) obj);
                    }
                }, this.f);
            }
            this.c.e(c4211eD22);
            qd2 = new QD2(qd2.b, c5896kD2.b);
        }
        InterfaceFutureC8236sc0 interfaceFutureC8236sc0C = ((C7300pD2) this.a).c(qd2, od2, interfaceC8104s62);
        this.e = interfaceC8104s62;
        return interfaceFutureC8236sc0C;
    }

    public final /* synthetic */ InterfaceFutureC8236sc0 d(SG2 sg2) throws C2350Tl2 {
        UG2 ug2;
        if (sg2 == null || sg2.a == null || (ug2 = sg2.b) == null) {
            throw new C2350Tl2(1, "Empty prefetch");
        }
        FB1 fb1M = LB1.M();
        DB1 db1M = EB1.M();
        db1M.r(2);
        db1M.o(IB1.O());
        fb1M.n(db1M);
        sg2.a.a.zzb().c().A((LB1) fb1M.j());
        return f(sg2.a, ((C4211eD2) ug2).b);
    }

    public final synchronized InterfaceFutureC8236sc0 e(final QD2 qd2, final OD2 od2, InterfaceC8104s62 interfaceC8104s62) {
        InterfaceC7825r62 interfaceC7825r62A = od2.a(qd2.b);
        interfaceC7825r62A.h(new C4779gD2(this.d));
        final InterfaceC8104s62 interfaceC8104s622 = (InterfaceC8104s62) interfaceC7825r62A.zzh();
        interfaceC8104s622.zzg();
        interfaceC8104s622.zzg();
        zzl zzlVar = interfaceC8104s622.zzg().d;
        if (zzlVar.zzs != null || zzlVar.zzx != null) {
            this.e = interfaceC8104s622;
            return ((C7300pD2) this.a).c(qd2, od2, interfaceC8104s622);
        }
        FF2 ff2Zzg = interfaceC8104s622.zzg();
        final C4211eD2 c4211eD2 = new C4211eD2(od2, qd2, ff2Zzg.d, ff2Zzg.f, this.f, ff2Zzg.j, null);
        return AbstractC7360pS2.n(AbstractC4839gS2.C(((C6184lD2) this.b).c(qd2, od2, interfaceC8104s622)), new WR2() { // from class: com.daaw.cD2
            @Override // com.daaw.WR2
            public final InterfaceFutureC8236sc0 zza(Object obj) {
                return this.a.c(qd2, c4211eD2, od2, interfaceC8104s622, (C5896kD2) obj);
            }
        }, this.f);
    }

    public final InterfaceFutureC8236sc0 f(IG2 ig2, QD2 qd2) {
        InterfaceC8104s62 interfaceC8104s62 = ig2.a;
        this.e = interfaceC8104s62;
        if (ig2.c != null) {
            if (interfaceC8104s62.zzf() != null) {
                ig2.c.f().a(ig2.a.zzf());
            }
            return AbstractC7360pS2.h(ig2.c);
        }
        interfaceC8104s62.zzb().l(ig2.b);
        return ((C7300pD2) this.a).c(qd2, null, ig2.a);
    }
}
