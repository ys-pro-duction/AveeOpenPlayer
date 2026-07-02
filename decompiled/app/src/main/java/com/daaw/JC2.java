package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class JC2 implements InterfaceC1223Iv2 {
    public final /* synthetic */ KC2 a;

    public JC2(KC2 kc2) {
        this.a = kc2;
    }

    @Override // com.daaw.InterfaceC1223Iv2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        P22 p22 = (P22) obj;
        synchronized (this.a) {
            try {
                P22 p222 = this.a.L;
                if (p222 != null) {
                    p222.a();
                }
                KC2 kc2 = this.a;
                kc2.L = p22;
                p22.i(kc2);
                KC2 kc22 = this.a;
                kc22.G.o(new Q22(p22, kc22, kc22.G, kc22.I));
                p22.b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.daaw.InterfaceC1223Iv2
    public final void zza() {
        synchronized (this.a) {
            this.a.L = null;
        }
    }
}
