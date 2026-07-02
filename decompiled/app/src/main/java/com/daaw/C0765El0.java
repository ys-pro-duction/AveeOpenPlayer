package com.daaw;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import java.io.EOFException;

/* JADX INFO: renamed from: com.daaw.El0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0765El0 implements InterfaceC8715uJ {
    public static final InterfaceC10117zJ o = new a();
    public static final int p = AbstractC6280lb1.v("Xing");
    public static final int q = AbstractC6280lb1.v("Info");
    public static final int r = AbstractC6280lb1.v("VBRI");
    public final int a;
    public final long b;
    public final C2584Vs0 c;
    public final C1285Jl0 d;
    public final MR e;
    public final PX f;
    public InterfaceC9838yJ g;
    public Z41 h;
    public int i;
    public Metadata j;
    public b k;
    public long l;
    public long m;
    public int n;

    /* JADX INFO: renamed from: com.daaw.El0$a */
    public static class a implements InterfaceC10117zJ {
        @Override // com.daaw.InterfaceC10117zJ
        public InterfaceC8715uJ[] a() {
            return new InterfaceC8715uJ[]{new C0765El0()};
        }
    }

    /* JADX INFO: renamed from: com.daaw.El0$b */
    public interface b extends CO0 {
        long b(long j);
    }

    public C0765El0() {
        this(0);
    }

    public static int e(C2584Vs0 c2584Vs0, int i) {
        if (c2584Vs0.d() >= i + 4) {
            c2584Vs0.J(i);
            int i2 = c2584Vs0.i();
            if (i2 == p || i2 == q) {
                return i2;
            }
        }
        if (c2584Vs0.d() < 40) {
            return 0;
        }
        c2584Vs0.J(36);
        int i3 = c2584Vs0.i();
        int i4 = r;
        if (i3 == i4) {
            return i4;
        }
        return 0;
    }

    public static boolean g(int i, long j) {
        return ((long) (i & (-128000))) == (j & (-128000));
    }

    private int j(InterfaceC9001vJ interfaceC9001vJ) {
        if (this.n == 0) {
            interfaceC9001vJ.i();
            if (!interfaceC9001vJ.e(this.c.a, 0, 4, true)) {
                return -1;
            }
            this.c.J(0);
            int i = this.c.i();
            if (!g(i, this.i) || C1285Jl0.a(i) == -1) {
                interfaceC9001vJ.j(1);
                this.i = 0;
                return 0;
            }
            C1285Jl0.b(i, this.d);
            if (this.l == -9223372036854775807L) {
                this.l = this.k.b(interfaceC9001vJ.getPosition());
                if (this.b != -9223372036854775807L) {
                    this.l += this.b - this.k.b(0L);
                }
            }
            this.n = this.d.c;
        }
        int iB = this.h.b(interfaceC9001vJ, this.n, true);
        if (iB == -1) {
            return -1;
        }
        int i2 = this.n - iB;
        this.n = i2;
        if (i2 > 0) {
            return 0;
        }
        long j = this.l;
        long j2 = this.m * 1000000;
        C1285Jl0 c1285Jl0 = this.d;
        this.h.a(j + (j2 / ((long) c1285Jl0.d)), 1, c1285Jl0.c, 0, null);
        this.m += (long) this.d.g;
        this.n = 0;
        return 0;
    }

    public final b b(InterfaceC9001vJ interfaceC9001vJ) {
        interfaceC9001vJ.k(this.c.a, 0, 4);
        this.c.J(0);
        C1285Jl0.b(this.c.i(), this.d);
        return new C2783Xq(interfaceC9001vJ.b(), interfaceC9001vJ.getPosition(), this.d);
    }

    @Override // com.daaw.InterfaceC8715uJ
    public boolean c(InterfaceC9001vJ interfaceC9001vJ) {
        return k(interfaceC9001vJ, true);
    }

    @Override // com.daaw.InterfaceC8715uJ
    public int d(InterfaceC9001vJ interfaceC9001vJ, C2082Qx0 c2082Qx0) throws Throwable {
        if (this.i == 0) {
            try {
                k(interfaceC9001vJ, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.k == null) {
            b bVarH = h(interfaceC9001vJ);
            this.k = bVarH;
            if (bVarH == null || (!bVarH.e() && (this.a & 1) != 0)) {
                this.k = b(interfaceC9001vJ);
            }
            this.g.b(this.k);
            Z41 z41 = this.h;
            C1285Jl0 c1285Jl0 = this.d;
            String str = c1285Jl0.b;
            int i = c1285Jl0.e;
            int i2 = c1285Jl0.d;
            MR mr = this.e;
            z41.d(Format.i(null, str, null, -1, 4096, i, i2, -1, mr.a, mr.b, null, null, 0, null, (this.a & 2) != 0 ? null : this.j));
        }
        return j(interfaceC9001vJ);
    }

    @Override // com.daaw.InterfaceC8715uJ
    public void f(long j, long j2) {
        this.i = 0;
        this.l = -9223372036854775807L;
        this.m = 0L;
        this.n = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.daaw.C0765El0.b h(com.daaw.InterfaceC9001vJ r10) {
        /*
            r9 = this;
            com.daaw.Vs0 r5 = new com.daaw.Vs0
            com.daaw.Jl0 r0 = r9.d
            int r0 = r0.c
            r5.<init>(r0)
            byte[] r0 = r5.a
            com.daaw.Jl0 r1 = r9.d
            int r1 = r1.c
            r6 = 0
            r10.k(r0, r6, r1)
            com.daaw.Jl0 r0 = r9.d
            int r1 = r0.a
            r2 = 1
            r1 = r1 & r2
            r3 = 21
            int r0 = r0.e
            if (r1 == 0) goto L29
            if (r0 == r2) goto L26
            r3 = 36
            r7 = 36
            goto L30
        L26:
            r7 = 21
            goto L30
        L29:
            if (r0 == r2) goto L2c
            goto L26
        L2c:
            r3 = 13
            r7 = 13
        L30:
            int r8 = e(r5, r7)
            int r0 = com.daaw.C0765El0.p
            if (r8 == r0) goto L5c
            int r0 = com.daaw.C0765El0.q
            if (r8 != r0) goto L3d
            goto L5c
        L3d:
            int r0 = com.daaw.C0765El0.r
            if (r8 != r0) goto L57
            long r0 = r10.b()
            long r2 = r10.getPosition()
            com.daaw.Jl0 r4 = r9.d
            com.daaw.Kc1 r0 = com.daaw.C1354Kc1.a(r0, r2, r4, r5)
            com.daaw.Jl0 r1 = r9.d
            int r1 = r1.c
            r10.j(r1)
            return r0
        L57:
            r10.i()
            r10 = 0
            return r10
        L5c:
            long r0 = r10.b()
            long r2 = r10.getPosition()
            com.daaw.Jl0 r4 = r9.d
            com.daaw.Aj1 r0 = com.daaw.C0333Aj1.a(r0, r2, r4, r5)
            if (r0 == 0) goto L94
            com.daaw.MR r1 = r9.e
            boolean r1 = r1.a()
            if (r1 != 0) goto L94
            r10.i()
            int r7 = r7 + 141
            r10.h(r7)
            com.daaw.Vs0 r1 = r9.c
            byte[] r1 = r1.a
            r2 = 3
            r10.k(r1, r6, r2)
            com.daaw.Vs0 r1 = r9.c
            r1.J(r6)
            com.daaw.MR r1 = r9.e
            com.daaw.Vs0 r2 = r9.c
            int r2 = r2.A()
            r1.d(r2)
        L94:
            com.daaw.Jl0 r1 = r9.d
            int r1 = r1.c
            r10.j(r1)
            if (r0 == 0) goto Lac
            boolean r1 = r0.e()
            if (r1 != 0) goto Lac
            int r1 = com.daaw.C0765El0.q
            if (r8 != r1) goto Lac
            com.daaw.El0$b r10 = r9.b(r10)
            return r10
        Lac:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C0765El0.h(com.daaw.vJ):com.daaw.El0$b");
    }

    @Override // com.daaw.InterfaceC8715uJ
    public void i(InterfaceC9838yJ interfaceC9838yJ) {
        this.g = interfaceC9838yJ;
        this.h = interfaceC9838yJ.a(0, 1);
        this.g.n();
    }

    public final boolean k(InterfaceC9001vJ interfaceC9001vJ, boolean z) throws Throwable {
        int i;
        int iF;
        int iA;
        int i2 = z ? 16384 : 131072;
        interfaceC9001vJ.i();
        if (interfaceC9001vJ.getPosition() == 0) {
            Metadata metadataA = this.f.a(interfaceC9001vJ, (this.a & 2) != 0 ? MR.c : null);
            this.j = metadataA;
            if (metadataA != null) {
                this.e.c(metadataA);
            }
            iF = (int) interfaceC9001vJ.f();
            if (!z) {
                interfaceC9001vJ.j(iF);
            }
            i = 0;
        } else {
            i = 0;
            iF = 0;
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (!interfaceC9001vJ.e(this.c.a, 0, 4, i > 0)) {
                break;
            }
            this.c.J(0);
            int i5 = this.c.i();
            if ((i3 == 0 || g(i5, i3)) && (iA = C1285Jl0.a(i5)) != -1) {
                i++;
                if (i != 1) {
                    if (i == 4) {
                        break;
                    }
                } else {
                    C1285Jl0.b(i5, this.d);
                    i3 = i5;
                }
                interfaceC9001vJ.h(iA - 4);
            } else {
                int i6 = i4 + 1;
                if (i4 == i2) {
                    if (z) {
                        return false;
                    }
                    throw new C3000Zs0("Searched too many bytes.");
                }
                if (z) {
                    interfaceC9001vJ.i();
                    interfaceC9001vJ.h(iF + i6);
                } else {
                    interfaceC9001vJ.j(1);
                }
                i4 = i6;
                i = 0;
                i3 = 0;
            }
        }
        if (z) {
            interfaceC9001vJ.j(iF + i4);
        } else {
            interfaceC9001vJ.i();
        }
        this.i = i3;
        return true;
    }

    public C0765El0(int i) {
        this(i, -9223372036854775807L);
    }

    public C0765El0(int i, long j) {
        this.a = i;
        this.b = j;
        this.c = new C2584Vs0(10);
        this.d = new C1285Jl0();
        this.e = new MR();
        this.l = -9223372036854775807L;
        this.f = new PX();
    }

    @Override // com.daaw.InterfaceC8715uJ
    public void a() {
    }
}
