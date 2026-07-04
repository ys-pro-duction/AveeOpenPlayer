package com.daaw;

import com.daaw.AbstractC4719g1;
import com.daaw.InterfaceC8103s61;
import com.google.android.exoplayer2.Format;

/* JADX INFO: renamed from: com.daaw.f1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4430f1 implements InterfaceC9543xF {
    public final C2480Us0 a;
    public final C2584Vs0 b;
    public final String c;
    public String d;
    public Z41 e;
    public int f;
    public int g;
    public boolean h;
    public long i;
    public Format j;
    public int k;
    public long l;

    public C4430f1() {
        this(null);
    }

    @Override // com.daaw.InterfaceC9543xF
    public void a(C2584Vs0 c2584Vs0) {
        while (c2584Vs0.a() > 0) {
            int i = this.f;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int iMin = Math.min(c2584Vs0.a(), this.k - this.g);
                        this.e.c(c2584Vs0, iMin);
                        int i2 = this.g + iMin;
                        this.g = i2;
                        int i3 = this.k;
                        if (i2 == i3) {
                            this.e.a(this.l, 1, i3, 0, null);
                            this.l += this.i;
                            this.f = 0;
                        }
                    }
                } else if (f(c2584Vs0, this.b.a, 128)) {
                    g();
                    this.b.J(0);
                    this.e.c(this.b, 128);
                    this.f = 2;
                }
            } else if (h(c2584Vs0)) {
                this.f = 1;
                byte[] bArr = this.b.a;
                bArr[0] = 11;
                bArr[1] = 119;
                this.g = 2;
            }
        }
    }

    @Override // com.daaw.InterfaceC9543xF
    public void b() {
        this.f = 0;
        this.g = 0;
        this.h = false;
    }

    @Override // com.daaw.InterfaceC9543xF
    public void d(InterfaceC9838yJ interfaceC9838yJ, InterfaceC8103s61.d dVar) {
        dVar.a();
        this.d = dVar.b();
        this.e = interfaceC9838yJ.a(dVar.c(), 1);
    }

    @Override // com.daaw.InterfaceC9543xF
    public void e(long j, boolean z) {
        this.l = j;
    }

    public final boolean f(C2584Vs0 c2584Vs0, byte[] bArr, int i) {
        int iMin = Math.min(c2584Vs0.a(), i - this.g);
        c2584Vs0.g(bArr, this.g, iMin);
        int i2 = this.g + iMin;
        this.g = i2;
        return i2 == i;
    }

    public final void g() {
        this.a.m(0);
        AbstractC4719g1.b bVarE = AbstractC4719g1.e(this.a);
        Format format = this.j;
        if (format == null || bVarE.d != format.S || bVarE.c != format.T || bVarE.a != format.G) {
            Format formatK = Format.k(this.d, bVarE.a, null, -1, -1, bVarE.d, bVarE.c, null, null, 0, this.c);
            this.j = formatK;
            this.e.d(formatK);
        }
        this.k = bVarE.e;
        this.i = (((long) bVarE.f) * 1000000) / ((long) this.j.T);
    }

    public final boolean h(C2584Vs0 c2584Vs0) {
        while (true) {
            if (c2584Vs0.a() <= 0) {
                return false;
            }
            if (this.h) {
                int iX = c2584Vs0.x();
                if (iX == 119) {
                    this.h = false;
                    return true;
                }
                this.h = iX == 11;
            } else {
                this.h = c2584Vs0.x() == 11;
            }
        }
    }

    public C4430f1(String str) {
        C2480Us0 c2480Us0 = new C2480Us0(new byte[128]);
        this.a = c2480Us0;
        this.b = new C2584Vs0(c2480Us0.a);
        this.f = 0;
        this.c = str;
    }

    @Override // com.daaw.InterfaceC9543xF
    public void c() {
    }
}
