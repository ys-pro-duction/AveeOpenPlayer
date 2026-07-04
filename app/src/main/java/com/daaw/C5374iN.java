package com.daaw;

import com.daaw.InterfaceC3413bN;

/* JADX INFO: renamed from: com.daaw.iN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5374iN implements InterfaceC3413bN {
    public final int a;
    public final int b;
    public final InterfaceC4216eF c;

    public C5374iN(int i, int i2, InterfaceC4216eF interfaceC4216eF) {
        G10.g(interfaceC4216eF, "easing");
        this.a = i;
        this.b = i2;
        this.c = interfaceC4216eF;
    }

    @Override // com.daaw.InterfaceC3413bN
    public float a(long j, float f, float f2, float f3) {
        long jF = f(j / 1000000);
        if (jF < 0) {
            return 0.0f;
        }
        if (jF == 0) {
            return f3;
        }
        return (d(jF * 1000000, f, f2, f3) - d((jF - 1) * 1000000, f, f2, f3)) * 1000.0f;
    }

    @Override // com.daaw.InterfaceC3413bN
    public long b(float f, float f2, float f3) {
        return ((long) (this.b + this.a)) * 1000000;
    }

    @Override // com.daaw.InterfaceC3413bN
    public float c(float f, float f2, float f3) {
        return InterfaceC3413bN.a.a(this, f, f2, f3);
    }

    @Override // com.daaw.InterfaceC3413bN
    public float d(long j, float f, float f2, float f3) {
        long jF = f(j / 1000000);
        int i = this.a;
        return AbstractC2521Vc1.d(f, f2, this.c.a(AbstractC8417tE0.k(i == 0 ? 1.0f : jF / i, 0.0f, 1.0f)));
    }

    public final long f(long j) {
        return AbstractC8417tE0.m(j - ((long) this.b), 0L, this.a);
    }

    @Override // com.daaw.InterfaceC5866k7
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public C6290ld1 e(InterfaceC3626c71 interfaceC3626c71) {
        return InterfaceC3413bN.a.b(this, interfaceC3626c71);
    }
}
