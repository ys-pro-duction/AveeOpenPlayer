package com.daaw;

import com.daaw.V01;
import com.google.android.exoplayer2.Format;

/* JADX INFO: renamed from: com.daaw.Ld1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1462Ld1 extends V01 {
    public final C2584Vs0 b;
    public final C2584Vs0 c;
    public int d;
    public boolean e;
    public int f;

    public C1462Ld1(Z41 z41) {
        super(z41);
        this.b = new C2584Vs0(AbstractC2248Sm0.a);
        this.c = new C2584Vs0(4);
    }

    @Override // com.daaw.V01
    public boolean b(C2584Vs0 c2584Vs0) throws V01.a {
        int iX = c2584Vs0.x();
        int i = (iX >> 4) & 15;
        int i2 = iX & 15;
        if (i2 == 7) {
            this.f = i;
            return i != 5;
        }
        throw new V01.a("Video format not supported: " + i2);
    }

    @Override // com.daaw.V01
    public void c(C2584Vs0 c2584Vs0, long j) throws C3000Zs0 {
        int iX = c2584Vs0.x();
        long j2 = j + (((long) c2584Vs0.j()) * 1000);
        if (iX == 0 && !this.e) {
            C2584Vs0 c2584Vs02 = new C2584Vs0(new byte[c2584Vs0.a()]);
            c2584Vs0.g(c2584Vs02.a, 0, c2584Vs0.a());
            C1979Qd c1979QdB = C1979Qd.b(c2584Vs02);
            this.d = c1979QdB.b;
            this.a.d(Format.A(null, "video/avc", null, -1, -1, c1979QdB.c, c1979QdB.d, -1.0f, c1979QdB.a, -1, c1979QdB.e, null));
            this.e = true;
            return;
        }
        if (iX == 1 && this.e) {
            byte[] bArr = this.c.a;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i = 4 - this.d;
            int i2 = 0;
            while (c2584Vs0.a() > 0) {
                c2584Vs0.g(this.c.a, i, this.d);
                this.c.J(0);
                int iB = this.c.B();
                this.b.J(0);
                this.a.c(this.b, 4);
                this.a.c(c2584Vs0, iB);
                i2 = i2 + 4 + iB;
            }
            this.a.a(j2, this.f == 1 ? 1 : 0, i2, 0, null);
        }
    }
}
