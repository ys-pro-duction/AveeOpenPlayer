package com.daaw;

/* JADX INFO: renamed from: com.daaw.Cs1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0577Cs1 implements InterfaceC4397et1 {
    public final InterfaceC6365ls1 a;
    public final GD2 b = new GD2(new byte[10], 10);
    public int c = 0;
    public int d;
    public C5916kI2 e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;

    public C0577Cs1(InterfaceC6365ls1 interfaceC6365ls1) {
        this.a = interfaceC6365ls1;
    }

    @Override // com.daaw.InterfaceC4397et1
    public final void a(C5900kE2 c5900kE2, int i) {
        int i2;
        long jB;
        long j;
        AbstractC6048km2.b(this.e);
        int i3 = -1;
        int i4 = 2;
        if ((i & 1) != 0) {
            int i5 = this.c;
            if (i5 != 0 && i5 != 1) {
                if (i5 != 2) {
                    int i6 = this.j;
                    if (i6 != -1) {
                        AbstractC3305ay2.f("PesReader", "Unexpected start indicator: expected " + i6 + " more bytes");
                    }
                    this.a.b(c5900kE2.m() == 0);
                } else {
                    AbstractC3305ay2.f("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            c(1);
        }
        int i7 = i;
        while (c5900kE2.j() > 0) {
            int i8 = this.c;
            if (i8 == 0) {
                c5900kE2.h(c5900kE2.j());
            } else if (i8 != 1) {
                if (i8 != i4) {
                    int iJ = c5900kE2.j();
                    int i9 = this.j;
                    int i10 = i9 == i3 ? 0 : iJ - i9;
                    if (i10 > 0) {
                        iJ -= i10;
                        c5900kE2.f(c5900kE2.l() + iJ);
                    }
                    this.a.a(c5900kE2);
                    int i11 = this.j;
                    if (i11 != i3) {
                        int i12 = i11 - iJ;
                        this.j = i12;
                        if (i12 == 0) {
                            this.a.b(false);
                            c(1);
                        }
                    }
                } else {
                    if (d(c5900kE2, this.b.a, Math.min(10, this.i)) && d(c5900kE2, null, this.i)) {
                        this.b.j(0);
                        if (this.f) {
                            this.b.l(4);
                            long jD = this.b.d(3);
                            this.b.l(1);
                            int iD = this.b.d(15) << 15;
                            this.b.l(1);
                            long jD2 = this.b.d(15);
                            this.b.l(1);
                            if (this.h || !this.g) {
                                j = jD;
                            } else {
                                this.b.l(4);
                                j = jD;
                                long jD3 = ((long) this.b.d(3)) << 30;
                                this.b.l(1);
                                int iD2 = this.b.d(15) << 15;
                                this.b.l(1);
                                long jD4 = this.b.d(15);
                                this.b.l(1);
                                this.e.b(jD3 | ((long) iD2) | jD4);
                                this.h = true;
                            }
                            jB = this.e.b((j << 30) | ((long) iD) | jD2);
                        } else {
                            jB = -9223372036854775807L;
                        }
                        i7 |= true != this.k ? 0 : 4;
                        this.a.c(jB, i7);
                        c(3);
                        i3 = -1;
                    }
                }
            } else if (d(c5900kE2, this.b.a, 9)) {
                this.b.j(0);
                int iD3 = this.b.d(24);
                if (iD3 != 1) {
                    AbstractC3305ay2.f("PesReader", "Unexpected start code prefix: " + iD3);
                    i3 = -1;
                    this.j = -1;
                    i2 = 0;
                } else {
                    this.b.l(8);
                    GD2 gd2 = this.b;
                    int iD4 = gd2.d(16);
                    gd2.l(5);
                    this.k = this.b.n();
                    this.b.l(2);
                    this.f = this.b.n();
                    this.g = this.b.n();
                    this.b.l(6);
                    int iD5 = this.b.d(8);
                    this.i = iD5;
                    if (iD4 == 0) {
                        this.j = -1;
                    } else {
                        int i13 = (iD4 - 3) - iD5;
                        this.j = i13;
                        if (i13 < 0) {
                            AbstractC3305ay2.f("PesReader", "Found negative packet payload size: " + i13);
                            i3 = -1;
                            this.j = -1;
                        }
                        i2 = 2;
                    }
                    i3 = -1;
                    i2 = 2;
                }
                c(i2);
            } else {
                i3 = -1;
            }
            i4 = 2;
        }
    }

    @Override // com.daaw.InterfaceC4397et1
    public final void b(C5916kI2 c5916kI2, InterfaceC1398Kn1 interfaceC1398Kn1, C4118dt1 c4118dt1) {
        this.e = c5916kI2;
        this.a.d(interfaceC1398Kn1, c4118dt1);
    }

    public final void c(int i) {
        this.c = i;
        this.d = 0;
    }

    public final boolean d(C5900kE2 c5900kE2, byte[] bArr, int i) {
        int iMin = Math.min(c5900kE2.j(), i - this.d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            c5900kE2.h(iMin);
        } else {
            c5900kE2.c(bArr, this.d, iMin);
        }
        int i2 = this.d + iMin;
        this.d = i2;
        return i2 == i;
    }

    @Override // com.daaw.InterfaceC4397et1
    public final void zzc() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.zze();
    }
}
