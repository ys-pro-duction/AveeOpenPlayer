package com.daaw;

import com.google.android.exoplayer2.Format;

/* JADX INFO: renamed from: com.daaw.Gr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0996Gr extends AbstractC0415Be {
    public final int m;
    public final long n;
    public final C1903Pk o;
    public volatile int p;
    public volatile boolean q;
    public volatile boolean r;

    public C0996Gr(InterfaceC2595Vv interfaceC2595Vv, C2907Yv c2907Yv, Format format, int i, Object obj, long j, long j2, long j3, long j4, int i2, long j5, C1903Pk c1903Pk) {
        super(interfaceC2595Vv, c2907Yv, format, i, obj, j, j2, j3, j4);
        this.m = i2;
        this.n = j5;
        this.o = c1903Pk;
    }

    @Override // com.daaw.C0833Fc0.c
    public final void a() {
        C2907Yv c2907YvB = this.a.b(this.p);
        try {
            InterfaceC2595Vv interfaceC2595Vv = this.h;
            C5536ix c5536ix = new C5536ix(interfaceC2595Vv, c2907YvB.c, interfaceC2595Vv.d(c2907YvB));
            if (this.p == 0) {
                C0519Ce c0519CeH = h();
                c0519CeH.c(this.n);
                C1903Pk c1903Pk = this.o;
                long j = this.j;
                c1903Pk.e(c0519CeH, j == -9223372036854775807L ? 0L : j - this.n);
            }
            try {
                InterfaceC8715uJ interfaceC8715uJ = this.o.B;
                int iD = 0;
                while (iD == 0 && !this.q) {
                    iD = interfaceC8715uJ.d(c5536ix, null);
                }
                AbstractC7115ob.f(iD != 1);
                this.p = (int) (c5536ix.getPosition() - this.a.c);
                AbstractC6280lb1.h(this.h);
                this.r = true;
            } catch (Throwable th) {
                this.p = (int) (c5536ix.getPosition() - this.a.c);
                throw th;
            }
        } catch (Throwable th2) {
            AbstractC6280lb1.h(this.h);
            throw th2;
        }
    }

    @Override // com.daaw.C0833Fc0.c
    public final void b() {
        this.q = true;
    }

    @Override // com.daaw.AbstractC1799Ok
    public final long c() {
        return this.p;
    }

    @Override // com.daaw.AbstractC3506bi0
    public long e() {
        return this.i + ((long) this.m);
    }

    @Override // com.daaw.AbstractC3506bi0
    public boolean f() {
        return this.r;
    }
}
