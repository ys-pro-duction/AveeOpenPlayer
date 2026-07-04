package com.daaw;

import java.util.Collections;

/* JADX INFO: renamed from: com.daaw.ys1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9998ys1 implements InterfaceC6365ls1 {
    public final String a;
    public final C5900kE2 b;
    public final GD2 c;
    public InterfaceC8576to1 d;
    public String e;
    public C2485Ut1 f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long k;
    public boolean l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public long q;
    public int r;
    public long s;
    public int t;
    public String u;

    public C9998ys1(String str) {
        this.a = str;
        C5900kE2 c5900kE2 = new C5900kE2(1024);
        this.b = c5900kE2;
        byte[] bArrI = c5900kE2.i();
        this.c = new GD2(bArrI, bArrI.length);
        this.k = -9223372036854775807L;
    }

    public static long f(GD2 gd2) {
        return gd2.d((gd2.d(2) + 1) * 8);
    }

    @Override // com.daaw.InterfaceC6365ls1
    public final void a(C5900kE2 c5900kE2) throws QT1 {
        int i;
        int i2;
        int iD;
        boolean zN;
        AbstractC6048km2.b(this.d);
        while (c5900kE2.j() > 0) {
            int i3 = this.g;
            if (i3 != 0) {
                if (i3 == 1) {
                    int iU = c5900kE2.u();
                    if ((iU & 224) == 224) {
                        this.j = iU;
                        this.g = 2;
                    } else if (iU != 86) {
                        this.g = 0;
                    }
                } else if (i3 != 2) {
                    int iMin = Math.min(c5900kE2.j(), this.i - this.h);
                    c5900kE2.c(this.c.a, this.h, iMin);
                    int i4 = this.h + iMin;
                    this.h = i4;
                    if (i4 == this.i) {
                        this.c.j(0);
                        GD2 gd2 = this.c;
                        if (gd2.n()) {
                            if (this.l) {
                            }
                            this.g = 0;
                        } else {
                            this.l = true;
                            int iD2 = gd2.d(1);
                            if (iD2 == 1) {
                                iD = gd2.d(1);
                                i2 = 1;
                            } else {
                                i2 = iD2;
                                iD = 0;
                            }
                            this.m = iD;
                            if (iD != 0) {
                                throw QT1.a(null, null);
                            }
                            if (i2 == 1) {
                                f(gd2);
                                i2 = 1;
                            }
                            if (!gd2.n()) {
                                throw QT1.a(null, null);
                            }
                            this.n = gd2.d(6);
                            int iD3 = gd2.d(4);
                            int iD4 = gd2.d(3);
                            if (iD3 != 0 || iD4 != 0) {
                                throw QT1.a(null, null);
                            }
                            if (i2 == 0) {
                                int iC = gd2.c();
                                int iE = e(gd2);
                                gd2.j(iC);
                                byte[] bArr = new byte[(iE + 7) / 8];
                                gd2.g(bArr, 0, iE);
                                C1106Hs1 c1106Hs1 = new C1106Hs1();
                                c1106Hs1.j(this.e);
                                c1106Hs1.u("audio/mp4a-latm");
                                c1106Hs1.l0(this.u);
                                c1106Hs1.k0(this.t);
                                c1106Hs1.v(this.r);
                                c1106Hs1.k(Collections.singletonList(bArr));
                                c1106Hs1.m(this.a);
                                C2485Ut1 c2485Ut1D = c1106Hs1.D();
                                if (!c2485Ut1D.equals(this.f)) {
                                    this.f = c2485Ut1D;
                                    this.s = 1024000000 / ((long) c2485Ut1D.z);
                                    this.d.e(c2485Ut1D);
                                }
                            } else {
                                gd2.l(((int) f(gd2)) - e(gd2));
                            }
                            int iD5 = gd2.d(3);
                            this.o = iD5;
                            if (iD5 == 0) {
                                gd2.l(8);
                            } else if (iD5 == 1) {
                                gd2.l(9);
                            } else if (iD5 == 3 || iD5 == 4 || iD5 == 5) {
                                gd2.l(6);
                            } else {
                                if (iD5 != 6 && iD5 != 7) {
                                    throw new IllegalStateException();
                                }
                                gd2.l(1);
                            }
                            boolean zN2 = gd2.n();
                            this.p = zN2;
                            this.q = 0L;
                            if (zN2) {
                                if (i2 != 1) {
                                    do {
                                        zN = gd2.n();
                                        this.q = (this.q << 8) + ((long) gd2.d(8));
                                    } while (zN);
                                } else {
                                    this.q = f(gd2);
                                }
                            }
                            if (gd2.n()) {
                                gd2.l(8);
                            }
                        }
                        if (this.m != 0) {
                            throw QT1.a(null, null);
                        }
                        if (this.n != 0) {
                            throw QT1.a(null, null);
                        }
                        if (this.o != 0) {
                            throw QT1.a(null, null);
                        }
                        int i5 = 0;
                        while (true) {
                            int iD6 = gd2.d(8);
                            i = i5 + iD6;
                            if (iD6 != 255) {
                                break;
                            } else {
                                i5 = i;
                            }
                        }
                        int iC2 = gd2.c();
                        if ((iC2 & 7) == 0) {
                            this.b.g(iC2 >> 3);
                        } else {
                            gd2.g(this.b.i(), 0, i * 8);
                            this.b.g(0);
                        }
                        this.d.b(this.b, i);
                        long j = this.k;
                        if (j != -9223372036854775807L) {
                            this.d.c(j, 1, i, 0, null);
                            this.k += this.s;
                        }
                        if (this.p) {
                            gd2.l((int) this.q);
                        }
                        this.g = 0;
                    } else {
                        continue;
                    }
                } else {
                    int iU2 = ((this.j & (-225)) << 8) | c5900kE2.u();
                    this.i = iU2;
                    C5900kE2 c5900kE22 = this.b;
                    if (iU2 > c5900kE22.i().length) {
                        c5900kE22.d(iU2);
                        GD2 gd22 = this.c;
                        byte[] bArrI = this.b.i();
                        gd22.i(bArrI, bArrI.length);
                    }
                    this.h = 0;
                    this.g = 3;
                }
            } else if (c5900kE2.u() == 86) {
                this.g = 1;
            }
        }
    }

    @Override // com.daaw.InterfaceC6365ls1
    public final void c(long j, int i) {
        if (j != -9223372036854775807L) {
            this.k = j;
        }
    }

    @Override // com.daaw.InterfaceC6365ls1
    public final void d(InterfaceC1398Kn1 interfaceC1398Kn1, C4118dt1 c4118dt1) {
        c4118dt1.c();
        this.d = interfaceC1398Kn1.o(c4118dt1.a(), 1);
        this.e = c4118dt1.b();
    }

    public final int e(GD2 gd2) throws QT1 {
        int iA = gd2.a();
        C2873Ym1 c2873Ym1B = AbstractC2977Zm1.b(gd2, true);
        this.u = c2873Ym1B.c;
        this.r = c2873Ym1B.a;
        this.t = c2873Ym1B.b;
        return iA - gd2.a();
    }

    @Override // com.daaw.InterfaceC6365ls1
    public final void zze() {
        this.g = 0;
        this.k = -9223372036854775807L;
        this.l = false;
    }

    @Override // com.daaw.InterfaceC6365ls1
    public final void b(boolean z) {
    }
}
