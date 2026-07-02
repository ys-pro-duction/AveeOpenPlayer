package com.daaw;

import com.daaw.InterfaceC8103s61;
import com.google.android.exoplayer2.Format;

/* JADX INFO: renamed from: com.daaw.Kl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1389Kl0 implements InterfaceC9543xF {
    public final C2584Vs0 a;
    public final C1285Jl0 b;
    public final String c;
    public String d;
    public Z41 e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public long j;
    public int k;
    public long l;

    public C1389Kl0() {
        this(null);
    }

    @Override // com.daaw.InterfaceC9543xF
    public void a(C2584Vs0 c2584Vs0) {
        while (c2584Vs0.a() > 0) {
            int i = this.f;
            if (i == 0) {
                f(c2584Vs0);
            } else if (i == 1) {
                h(c2584Vs0);
            } else if (i == 2) {
                g(c2584Vs0);
            }
        }
    }

    @Override // com.daaw.InterfaceC9543xF
    public void b() {
        this.f = 0;
        this.g = 0;
        this.i = false;
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

    public final void f(C2584Vs0 c2584Vs0) {
        byte[] bArr = c2584Vs0.a;
        int iD = c2584Vs0.d();
        for (int iC = c2584Vs0.c(); iC < iD; iC++) {
            byte b = bArr[iC];
            boolean z = (b & 255) == 255;
            boolean z2 = this.i && (b & 224) == 224;
            this.i = z;
            if (z2) {
                c2584Vs0.J(iC + 1);
                this.i = false;
                this.a.a[1] = bArr[iC];
                this.g = 2;
                this.f = 1;
                return;
            }
        }
        c2584Vs0.J(iD);
    }

    public final void g(C2584Vs0 c2584Vs0) {
        int iMin = Math.min(c2584Vs0.a(), this.k - this.g);
        this.e.c(c2584Vs0, iMin);
        int i = this.g + iMin;
        this.g = i;
        int i2 = this.k;
        if (i < i2) {
            return;
        }
        this.e.a(this.l, 1, i2, 0, null);
        this.l += this.j;
        this.g = 0;
        this.f = 0;
    }

    public final void h(C2584Vs0 c2584Vs0) {
        int iMin = Math.min(c2584Vs0.a(), 4 - this.g);
        c2584Vs0.g(this.a.a, this.g, iMin);
        int i = this.g + iMin;
        this.g = i;
        if (i < 4) {
            return;
        }
        this.a.J(0);
        if (!C1285Jl0.b(this.a.i(), this.b)) {
            this.g = 0;
            this.f = 1;
            return;
        }
        C1285Jl0 c1285Jl0 = this.b;
        this.k = c1285Jl0.c;
        if (!this.h) {
            long j = ((long) c1285Jl0.g) * 1000000;
            int i2 = c1285Jl0.d;
            this.j = j / ((long) i2);
            this.e.d(Format.k(this.d, c1285Jl0.b, null, -1, 4096, c1285Jl0.e, i2, null, null, 0, this.c));
            this.h = true;
        }
        this.a.J(0);
        this.e.c(this.a, 4);
        this.f = 2;
    }

    public C1389Kl0(String str) {
        this.f = 0;
        C2584Vs0 c2584Vs0 = new C2584Vs0(4);
        this.a = c2584Vs0;
        c2584Vs0.a[0] = -1;
        this.b = new C1285Jl0();
        this.c = str;
    }

    @Override // com.daaw.InterfaceC9543xF
    public void c() {
    }
}
