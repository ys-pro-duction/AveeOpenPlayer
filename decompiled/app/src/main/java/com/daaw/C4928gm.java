package com.daaw;

import com.daaw.InterfaceC9110vi0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroupArray;

/* JADX INFO: renamed from: com.daaw.gm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4928gm implements InterfaceC9110vi0, InterfaceC9110vi0.a {
    public final InterfaceC9110vi0 B;
    public InterfaceC9110vi0.a C;
    public a[] D = new a[0];
    public long E;
    public long F;
    public long G;

    /* JADX INFO: renamed from: com.daaw.gm$a */
    public final class a implements QM0 {
        public final QM0 B;
        public boolean C;

        public a(QM0 qm0) {
            this.B = qm0;
        }

        @Override // com.daaw.QM0
        public boolean a() {
            return !C4928gm.this.h() && this.B.a();
        }

        @Override // com.daaw.QM0
        public void b() {
            this.B.b();
        }

        public void c() {
            this.C = false;
        }

        @Override // com.daaw.QM0
        public int j(C5103hP c5103hP, C1016Gw c1016Gw, boolean z) {
            if (C4928gm.this.h()) {
                return -3;
            }
            if (this.C) {
                c1016Gw.r(4);
                return -4;
            }
            int iJ = this.B.j(c5103hP, c1016Gw, z);
            if (iJ == -5) {
                Format format = c5103hP.a;
                int i = format.V;
                if (i != 0 || format.W != 0) {
                    C4928gm c4928gm = C4928gm.this;
                    if (c4928gm.F != 0) {
                        i = 0;
                    }
                    c5103hP.a = format.c(i, c4928gm.G == Long.MIN_VALUE ? format.W : 0);
                }
                return -5;
            }
            C4928gm c4928gm2 = C4928gm.this;
            long j = c4928gm2.G;
            if (j == Long.MIN_VALUE || ((iJ != -4 || c1016Gw.E < j) && !(iJ == -3 && c4928gm2.f() == Long.MIN_VALUE))) {
                return iJ;
            }
            c1016Gw.l();
            c1016Gw.r(4);
            this.C = true;
            return -4;
        }

        @Override // com.daaw.QM0
        public int n(long j) {
            if (C4928gm.this.h()) {
                return -3;
            }
            return this.B.n(j);
        }
    }

    public C4928gm(InterfaceC9110vi0 interfaceC9110vi0, boolean z, long j, long j2) {
        this.B = interfaceC9110vi0;
        this.E = z ? j : -9223372036854775807L;
        this.F = j;
        this.G = j2;
    }

    public static boolean s(long j, com.google.android.exoplayer2.trackselection.c[] cVarArr) {
        if (j != 0) {
            for (com.google.android.exoplayer2.trackselection.c cVar : cVarArr) {
                if (cVar != null && !AbstractC8834uk0.k(cVar.k().G)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final DO0 b(long j, DO0 do0) {
        long jM = AbstractC6280lb1.m(do0.a, 0L, j - this.F);
        long j2 = do0.b;
        long j3 = this.G;
        long jM2 = AbstractC6280lb1.m(j2, 0L, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j);
        return (jM == do0.a && jM2 == do0.b) ? do0 : new DO0(jM, jM2);
    }

    @Override // com.daaw.InterfaceC9110vi0, com.daaw.PP0
    public long c() {
        long jC = this.B.c();
        if (jC != Long.MIN_VALUE) {
            long j = this.G;
            if (j == Long.MIN_VALUE || jC < j) {
                return jC;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.daaw.InterfaceC9110vi0, com.daaw.PP0
    public boolean d(long j) {
        return this.B.d(j);
    }

    @Override // com.daaw.InterfaceC9110vi0
    public long e(long j, DO0 do0) {
        long j2 = this.F;
        if (j == j2) {
            return j2;
        }
        return this.B.e(j, b(j, do0));
    }

    @Override // com.daaw.InterfaceC9110vi0, com.daaw.PP0
    public long f() {
        long jF = this.B.f();
        if (jF != Long.MIN_VALUE) {
            long j = this.G;
            if (j == Long.MIN_VALUE || jF < j) {
                return jF;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.daaw.InterfaceC9110vi0, com.daaw.PP0
    public void g(long j) {
        this.B.g(j);
    }

    public boolean h() {
        return this.E != -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    @Override // com.daaw.InterfaceC9110vi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long i(com.google.android.exoplayer2.trackselection.c[] r10, boolean[] r11, com.daaw.QM0[] r12, boolean[] r13, long r14) {
        /*
            r9 = this;
            int r0 = r12.length
            com.daaw.gm$a[] r0 = new com.daaw.C4928gm.a[r0]
            r9.D = r0
            int r0 = r12.length
            com.daaw.QM0[] r4 = new com.daaw.QM0[r0]
            r0 = 0
            r1 = 0
        La:
            int r2 = r12.length
            r8 = 0
            if (r1 >= r2) goto L1f
            com.daaw.gm$a[] r2 = r9.D
            r3 = r12[r1]
            com.daaw.gm$a r3 = (com.daaw.C4928gm.a) r3
            r2[r1] = r3
            if (r3 == 0) goto L1a
            com.daaw.QM0 r8 = r3.B
        L1a:
            r4[r1] = r8
            int r1 = r1 + 1
            goto La
        L1f:
            com.daaw.vi0 r1 = r9.B
            r2 = r10
            r3 = r11
            r5 = r13
            r6 = r14
            long r10 = r1.i(r2, r3, r4, r5, r6)
            boolean r13 = r9.h()
            if (r13 == 0) goto L3d
            long r13 = r9.F
            int r15 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r15 != 0) goto L3d
            boolean r13 = s(r13, r2)
            if (r13 == 0) goto L3d
            r13 = r10
            goto L42
        L3d:
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L42:
            r9.E = r13
            int r13 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r13 == 0) goto L5d
            long r13 = r9.F
            int r15 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r15 < 0) goto L5b
            long r13 = r9.G
            r1 = -9223372036854775808
            int r15 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r15 == 0) goto L5d
            int r15 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r15 > 0) goto L5b
            goto L5d
        L5b:
            r13 = 0
            goto L5e
        L5d:
            r13 = 1
        L5e:
            com.daaw.AbstractC7115ob.f(r13)
        L61:
            int r13 = r12.length
            if (r0 >= r13) goto L8b
            r13 = r4[r0]
            if (r13 != 0) goto L6d
            com.daaw.gm$a[] r13 = r9.D
            r13[r0] = r8
            goto L82
        L6d:
            r14 = r12[r0]
            if (r14 == 0) goto L79
            com.daaw.gm$a[] r14 = r9.D
            r14 = r14[r0]
            com.daaw.QM0 r14 = r14.B
            if (r14 == r13) goto L82
        L79:
            com.daaw.gm$a[] r14 = r9.D
            com.daaw.gm$a r15 = new com.daaw.gm$a
            r15.<init>(r13)
            r14[r0] = r15
        L82:
            com.daaw.gm$a[] r13 = r9.D
            r13 = r13[r0]
            r12[r0] = r13
            int r0 = r0 + 1
            goto L61
        L8b:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C4928gm.i(com.google.android.exoplayer2.trackselection.c[], boolean[], com.daaw.QM0[], boolean[], long):long");
    }

    @Override // com.daaw.InterfaceC9110vi0.a
    public void j(InterfaceC9110vi0 interfaceC9110vi0) {
        this.C.j(this);
    }

    @Override // com.daaw.InterfaceC9110vi0
    public void l() {
        this.B.l();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    @Override // com.daaw.InterfaceC9110vi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long m(long r7) {
        /*
            r6 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6.E = r0
            com.daaw.gm$a[] r0 = r6.D
            int r1 = r0.length
            r2 = 0
            r3 = 0
        Lc:
            if (r3 >= r1) goto L18
            r4 = r0[r3]
            if (r4 == 0) goto L15
            r4.c()
        L15:
            int r3 = r3 + 1
            goto Lc
        L18:
            com.daaw.vi0 r0 = r6.B
            long r0 = r0.m(r7)
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 == 0) goto L34
            long r7 = r6.F
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 < 0) goto L35
            long r7 = r6.G
            r3 = -9223372036854775808
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 == 0) goto L34
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 > 0) goto L35
        L34:
            r2 = 1
        L35:
            com.daaw.AbstractC7115ob.f(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C4928gm.m(long):long");
    }

    @Override // com.daaw.InterfaceC9110vi0
    public void o(InterfaceC9110vi0.a aVar, long j) {
        this.C = aVar;
        this.B.o(this, j);
    }

    @Override // com.daaw.PP0.a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void n(InterfaceC9110vi0 interfaceC9110vi0) {
        this.C.n(this);
    }

    @Override // com.daaw.InterfaceC9110vi0
    public long q() {
        if (h()) {
            long j = this.E;
            this.E = -9223372036854775807L;
            long jQ = q();
            return jQ != -9223372036854775807L ? jQ : j;
        }
        long jQ2 = this.B.q();
        if (jQ2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        AbstractC7115ob.f(jQ2 >= this.F);
        long j2 = this.G;
        AbstractC7115ob.f(j2 == Long.MIN_VALUE || jQ2 <= j2);
        return jQ2;
    }

    @Override // com.daaw.InterfaceC9110vi0
    public TrackGroupArray r() {
        return this.B.r();
    }

    @Override // com.daaw.InterfaceC9110vi0
    public void t(long j, boolean z) {
        this.B.t(j, z);
    }
}
