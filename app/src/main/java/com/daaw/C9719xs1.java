package com.daaw;

/* JADX INFO: renamed from: com.daaw.xs1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9719xs1 implements InterfaceC6365ls1 {
    public InterfaceC8576to1 b;
    public boolean c;
    public int e;
    public int f;
    public final C5900kE2 a = new C5900kE2(10);
    public long d = -9223372036854775807L;

    @Override // com.daaw.InterfaceC6365ls1
    public final void a(C5900kE2 c5900kE2) {
        AbstractC6048km2.b(this.b);
        if (this.c) {
            int iJ = c5900kE2.j();
            int i = this.f;
            if (i < 10) {
                int iMin = Math.min(iJ, 10 - i);
                System.arraycopy(c5900kE2.i(), c5900kE2.l(), this.a.i(), this.f, iMin);
                if (this.f + iMin == 10) {
                    this.a.g(0);
                    if (this.a.u() != 73 || this.a.u() != 68 || this.a.u() != 51) {
                        AbstractC3305ay2.f("Id3Reader", "Discarding invalid ID3 tag");
                        this.c = false;
                        return;
                    } else {
                        this.a.h(3);
                        this.e = this.a.t() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iJ, this.e - this.f);
            this.b.b(c5900kE2, iMin2);
            this.f += iMin2;
        }
    }

    @Override // com.daaw.InterfaceC6365ls1
    public final void b(boolean z) {
        int i;
        AbstractC6048km2.b(this.b);
        if (this.c && (i = this.e) != 0 && this.f == i) {
            long j = this.d;
            if (j != -9223372036854775807L) {
                this.b.c(j, 1, i, 0, null);
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
            this.d = j;
        }
        this.e = 0;
        this.f = 0;
    }

    @Override // com.daaw.InterfaceC6365ls1
    public final void d(InterfaceC1398Kn1 interfaceC1398Kn1, C4118dt1 c4118dt1) {
        c4118dt1.c();
        InterfaceC8576to1 interfaceC8576to1O = interfaceC1398Kn1.o(c4118dt1.a(), 5);
        this.b = interfaceC8576to1O;
        C1106Hs1 c1106Hs1 = new C1106Hs1();
        c1106Hs1.j(c4118dt1.b());
        c1106Hs1.u("application/id3");
        interfaceC8576to1O.e(c1106Hs1.D());
    }

    @Override // com.daaw.InterfaceC6365ls1
    public final void zze() {
        this.c = false;
        this.d = -9223372036854775807L;
    }
}
