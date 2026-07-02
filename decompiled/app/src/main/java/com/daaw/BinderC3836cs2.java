package com.daaw;

import com.google.android.gms.internal.ads.zzbwi;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.cs2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC3836cs2 extends AbstractBinderC5947kQ1 implements F72 {
    public InterfaceC6235lQ1 B;
    public E72 C;
    public InterfaceC3478bc2 D;

    @Override // com.daaw.InterfaceC6235lQ1
    public final synchronized void E(InterfaceC7934rX interfaceC7934rX) {
        InterfaceC6235lQ1 interfaceC6235lQ1 = this.B;
        if (interfaceC6235lQ1 != null) {
            interfaceC6235lQ1.E(interfaceC7934rX);
        }
    }

    @Override // com.daaw.F72
    public final synchronized void G(E72 e72) {
        this.C = e72;
    }

    @Override // com.daaw.InterfaceC6235lQ1
    public final synchronized void N(InterfaceC7934rX interfaceC7934rX) {
        InterfaceC6235lQ1 interfaceC6235lQ1 = this.B;
        if (interfaceC6235lQ1 != null) {
            ((BinderC2278St2) interfaceC6235lQ1).D.zzb();
        }
    }

    @Override // com.daaw.InterfaceC6235lQ1
    public final synchronized void V0(InterfaceC7934rX interfaceC7934rX, int i) {
        InterfaceC3478bc2 interfaceC3478bc2 = this.D;
        if (interfaceC3478bc2 != null) {
            AbstractC4274eT1.zzj("Fail to initialize adapter ".concat(String.valueOf(((C2172Rt2) interfaceC3478bc2).c.a)));
        }
    }

    @Override // com.daaw.InterfaceC6235lQ1
    public final synchronized void W2(InterfaceC7934rX interfaceC7934rX) {
        InterfaceC6235lQ1 interfaceC6235lQ1 = this.B;
        if (interfaceC6235lQ1 != null) {
            ((BinderC2278St2) interfaceC6235lQ1).E.zzc();
        }
    }

    public final synchronized void a3(InterfaceC6235lQ1 interfaceC6235lQ1) {
        this.B = interfaceC6235lQ1;
    }

    public final synchronized void b3(InterfaceC3478bc2 interfaceC3478bc2) {
        this.D = interfaceC3478bc2;
    }

    @Override // com.daaw.InterfaceC6235lQ1
    public final synchronized void l1(InterfaceC7934rX interfaceC7934rX, zzbwi zzbwiVar) {
        InterfaceC6235lQ1 interfaceC6235lQ1 = this.B;
        if (interfaceC6235lQ1 != null) {
            ((BinderC2278St2) interfaceC6235lQ1).E.k0(zzbwiVar);
        }
    }

    @Override // com.daaw.InterfaceC6235lQ1
    public final synchronized void s2(InterfaceC7934rX interfaceC7934rX) {
        InterfaceC6235lQ1 interfaceC6235lQ1 = this.B;
        if (interfaceC6235lQ1 != null) {
            ((BinderC2278St2) interfaceC6235lQ1).D.zze();
        }
    }

    @Override // com.daaw.InterfaceC6235lQ1
    public final synchronized void u1(InterfaceC7934rX interfaceC7934rX) {
        InterfaceC3478bc2 interfaceC3478bc2 = this.D;
        if (interfaceC3478bc2 != null) {
            Executor executor = ((C2172Rt2) interfaceC3478bc2).d.b;
            final C2994Zq2 c2994Zq2 = ((C2172Rt2) interfaceC3478bc2).c;
            final C4498fF2 c4498fF2 = ((C2172Rt2) interfaceC3478bc2).b;
            final C9267wF2 c9267wF2 = ((C2172Rt2) interfaceC3478bc2).a;
            final C2172Rt2 c2172Rt2 = (C2172Rt2) interfaceC3478bc2;
            executor.execute(new Runnable() { // from class: com.daaw.Qt2
                @Override // java.lang.Runnable
                public final void run() {
                    C2382Tt2 c2382Tt2 = c2172Rt2.d;
                    C2382Tt2.e(c9267wF2, c4498fF2, c2994Zq2);
                }
            });
        }
    }

    @Override // com.daaw.InterfaceC6235lQ1
    public final synchronized void zze(InterfaceC7934rX interfaceC7934rX) {
        InterfaceC6235lQ1 interfaceC6235lQ1 = this.B;
        if (interfaceC6235lQ1 != null) {
            ((BinderC2278St2) interfaceC6235lQ1).C.onAdClicked();
        }
    }

    @Override // com.daaw.InterfaceC6235lQ1
    public final synchronized void zzg(InterfaceC7934rX interfaceC7934rX, int i) {
        E72 e72 = this.C;
        if (e72 != null) {
            e72.c(i);
        }
    }

    @Override // com.daaw.InterfaceC6235lQ1
    public final synchronized void zzi(InterfaceC7934rX interfaceC7934rX) {
        E72 e72 = this.C;
        if (e72 != null) {
            e72.zzd();
        }
    }

    @Override // com.daaw.InterfaceC6235lQ1
    public final synchronized void zzj(InterfaceC7934rX interfaceC7934rX) {
        InterfaceC6235lQ1 interfaceC6235lQ1 = this.B;
        if (interfaceC6235lQ1 != null) {
            ((BinderC2278St2) interfaceC6235lQ1).B.zzbv();
        }
    }
}
