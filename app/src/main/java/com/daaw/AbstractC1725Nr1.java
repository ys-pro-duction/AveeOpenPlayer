package com.daaw;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: com.daaw.Nr1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1725Nr1 {
    public InterfaceC8576to1 b;
    public InterfaceC1398Kn1 c;
    public InterfaceC1206Ir1 d;
    public long e;
    public long f;
    public long g;
    public int h;
    public int i;
    public long k;
    public boolean l;
    public boolean m;
    public final C0998Gr1 a = new C0998Gr1();
    public C1414Kr1 j = new C1414Kr1();

    public abstract long a(C5900kE2 c5900kE2);

    public void b(boolean z) {
        int i;
        if (z) {
            this.j = new C1414Kr1();
            this.f = 0L;
            i = 0;
        } else {
            i = 1;
        }
        this.h = i;
        this.e = -1L;
        this.g = 0L;
    }

    public abstract boolean c(C5900kE2 c5900kE2, long j, C1414Kr1 c1414Kr1);

    public final int d(InterfaceC1190In1 interfaceC1190In1, C6057ko1 c6057ko1) throws EOFException, InterruptedIOException {
        AbstractC6048km2.b(this.b);
        int i = AbstractC9004vJ2.a;
        int i2 = this.h;
        if (i2 == 0) {
            while (this.a.e(interfaceC1190In1)) {
                long jZzf = interfaceC1190In1.zzf();
                long j = this.f;
                this.k = jZzf - j;
                if (!c(this.a.a(), j, this.j)) {
                    C2485Ut1 c2485Ut1 = this.j.a;
                    this.i = c2485Ut1.z;
                    if (!this.m) {
                        this.b.e(c2485Ut1);
                        this.m = true;
                    }
                    InterfaceC1206Ir1 interfaceC1206Ir1 = this.j.b;
                    if (interfaceC1206Ir1 != null) {
                        this.d = interfaceC1206Ir1;
                    } else if (interfaceC1190In1.zzd() == -1) {
                        this.d = new C1621Mr1(null);
                    } else {
                        C1102Hr1 c1102Hr1B = this.a.b();
                        this.d = new C0469Br1(this, this.f, interfaceC1190In1.zzd(), c1102Hr1B.d + c1102Hr1B.e, c1102Hr1B.b, (c1102Hr1B.a & 4) != 0);
                    }
                    this.h = 2;
                    this.a.d();
                    return 0;
                }
                this.f = interfaceC1190In1.zzf();
            }
            this.h = 3;
            return -1;
        }
        if (i2 == 1) {
            ((C9694xn1) interfaceC1190In1).m((int) this.f, false);
            this.h = 2;
            return 0;
        }
        if (i2 != 2) {
            return -1;
        }
        long jB = this.d.b(interfaceC1190In1);
        if (jB >= 0) {
            c6057ko1.a = jB;
            return 1;
        }
        if (jB < -1) {
            h(-(jB + 2));
        }
        if (!this.l) {
            InterfaceC6903no1 interfaceC6903no1Zze = this.d.zze();
            AbstractC6048km2.b(interfaceC6903no1Zze);
            this.c.p(interfaceC6903no1Zze);
            this.l = true;
        }
        if (this.k <= 0 && !this.a.e(interfaceC1190In1)) {
            this.h = 3;
            return -1;
        }
        this.k = 0L;
        C5900kE2 c5900kE2A = this.a.a();
        long jA = a(c5900kE2A);
        if (jA >= 0) {
            long j2 = this.g;
            if (j2 + jA >= this.e) {
                long jE = e(j2);
                AbstractC8018ro1.b(this.b, c5900kE2A, c5900kE2A.m());
                this.b.c(jE, 1, c5900kE2A.m(), 0, null);
                this.e = -1L;
            }
        }
        this.g += jA;
        return 0;
    }

    public final long e(long j) {
        return (j * 1000000) / ((long) this.i);
    }

    public final long f(long j) {
        return (((long) this.i) * j) / 1000000;
    }

    public final void g(InterfaceC1398Kn1 interfaceC1398Kn1, InterfaceC8576to1 interfaceC8576to1) {
        this.c = interfaceC1398Kn1;
        this.b = interfaceC8576to1;
        b(true);
    }

    public void h(long j) {
        this.g = j;
    }

    public final void i(long j, long j2) {
        this.a.c();
        if (j == 0) {
            b(!this.l);
            return;
        }
        if (this.h != 0) {
            long jF = f(j2);
            this.e = jF;
            InterfaceC1206Ir1 interfaceC1206Ir1 = this.d;
            int i = AbstractC9004vJ2.a;
            interfaceC1206Ir1.a(jF);
            this.h = 2;
        }
    }
}
