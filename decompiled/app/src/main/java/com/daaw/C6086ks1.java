package com.daaw;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.ks1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6086ks1 implements InterfaceC6365ls1 {
    public final List a;
    public final InterfaceC8576to1[] b;
    public boolean c;
    public int d;
    public int e;
    public long f = -9223372036854775807L;

    public C6086ks1(List list) {
        this.a = list;
        this.b = new InterfaceC8576to1[list.size()];
    }

    @Override // com.daaw.InterfaceC6365ls1
    public final void a(C5900kE2 c5900kE2) {
        if (this.c) {
            if (this.d != 2 || e(c5900kE2, 32)) {
                if (this.d != 1 || e(c5900kE2, 0)) {
                    int iL = c5900kE2.l();
                    int iJ = c5900kE2.j();
                    for (InterfaceC8576to1 interfaceC8576to1 : this.b) {
                        c5900kE2.g(iL);
                        interfaceC8576to1.b(c5900kE2, iJ);
                    }
                    this.e += iJ;
                }
            }
        }
    }

    @Override // com.daaw.InterfaceC6365ls1
    public final void b(boolean z) {
        if (this.c) {
            if (this.f != -9223372036854775807L) {
                for (InterfaceC8576to1 interfaceC8576to1 : this.b) {
                    interfaceC8576to1.c(this.f, 1, this.e, 0, null);
                }
            }
            this.c = false;
        }
    }

    @Override // com.daaw.InterfaceC6365ls1
    public final void c(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.c = true;
        if (j != -9223372036854775807L) {
            this.f = j;
        }
        this.e = 0;
        this.d = 2;
    }

    @Override // com.daaw.InterfaceC6365ls1
    public final void d(InterfaceC1398Kn1 interfaceC1398Kn1, C4118dt1 c4118dt1) {
        for (int i = 0; i < this.b.length; i++) {
            C3283at1 c3283at1 = (C3283at1) this.a.get(i);
            c4118dt1.c();
            InterfaceC8576to1 interfaceC8576to1O = interfaceC1398Kn1.o(c4118dt1.a(), 3);
            C1106Hs1 c1106Hs1 = new C1106Hs1();
            c1106Hs1.j(c4118dt1.b());
            c1106Hs1.u("application/dvbsubs");
            c1106Hs1.k(Collections.singletonList(c3283at1.b));
            c1106Hs1.m(c3283at1.a);
            interfaceC8576to1O.e(c1106Hs1.D());
            this.b[i] = interfaceC8576to1O;
        }
    }

    public final boolean e(C5900kE2 c5900kE2, int i) {
        if (c5900kE2.j() == 0) {
            return false;
        }
        if (c5900kE2.u() != i) {
            this.c = false;
        }
        this.d--;
        return this.c;
    }

    @Override // com.daaw.InterfaceC6365ls1
    public final void zze() {
        this.c = false;
        this.f = -9223372036854775807L;
    }
}
