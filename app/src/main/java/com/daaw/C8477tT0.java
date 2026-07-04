package com.daaw;

import com.google.android.exoplayer2.Format;

/* JADX INFO: renamed from: com.daaw.tT0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8477tT0 extends AbstractC0415Be {
    public final int m;
    public final Format n;
    public volatile int o;
    public volatile boolean p;

    public C8477tT0(InterfaceC2595Vv interfaceC2595Vv, C2907Yv c2907Yv, Format format, int i, Object obj, long j, long j2, long j3, int i2, Format format2) {
        super(interfaceC2595Vv, c2907Yv, format, i, obj, j, j2, -9223372036854775807L, j3);
        this.m = i2;
        this.n = format2;
    }

    @Override // com.daaw.C0833Fc0.c
    public void a() {
        try {
            long jD = this.h.d(this.a.b(this.o));
            if (jD != -1) {
                jD += (long) this.o;
            }
            C5536ix c5536ix = new C5536ix(this.h, this.o, jD);
            C0519Ce c0519CeH = h();
            c0519CeH.c(0L);
            Z41 z41A = c0519CeH.a(0, this.m);
            z41A.d(this.n);
            for (int iB = 0; iB != -1; iB = z41A.b(c5536ix, Integer.MAX_VALUE, true)) {
                this.o += iB;
            }
            z41A.a(this.f, 1, this.o, 0, null);
            AbstractC6280lb1.h(this.h);
            this.p = true;
        } catch (Throwable th) {
            AbstractC6280lb1.h(this.h);
            throw th;
        }
    }

    @Override // com.daaw.AbstractC1799Ok
    public long c() {
        return this.o;
    }

    @Override // com.daaw.AbstractC3506bi0
    public boolean f() {
        return this.p;
    }

    @Override // com.daaw.C0833Fc0.c
    public void b() {
    }
}
