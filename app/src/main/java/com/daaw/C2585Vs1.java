package com.daaw;

/* JADX INFO: renamed from: com.daaw.Vs1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2585Vs1 {
    public boolean c;
    public boolean d;
    public boolean e;
    public final C5916kI2 a = new C5916kI2(0);
    public long f = -9223372036854775807L;
    public long g = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public final C5900kE2 b = new C5900kE2();

    public C2585Vs1(int i) {
    }

    public final int a(InterfaceC1190In1 interfaceC1190In1, C6057ko1 c6057ko1, int i) {
        if (i <= 0) {
            e(interfaceC1190In1);
            return 0;
        }
        long j = -9223372036854775807L;
        if (!this.e) {
            long jZzd = interfaceC1190In1.zzd();
            int iMin = (int) Math.min(112800L, jZzd);
            long j2 = jZzd - ((long) iMin);
            if (interfaceC1190In1.zzf() != j2) {
                c6057ko1.a = j2;
                return 1;
            }
            this.b.d(iMin);
            interfaceC1190In1.zzj();
            ((C9694xn1) interfaceC1190In1).h(this.b.i(), 0, iMin, false);
            C5900kE2 c5900kE2 = this.b;
            int iL = c5900kE2.l();
            int iM = c5900kE2.m();
            int i2 = iM - 188;
            while (true) {
                if (i2 < iL) {
                    break;
                }
                byte[] bArrI = c5900kE2.i();
                int i3 = -4;
                int i4 = 0;
                while (true) {
                    if (i3 > 4) {
                        break;
                    }
                    int i5 = (i3 * 188) + i2;
                    if (i5 < iL || i5 >= iM || bArrI[i5] != 71) {
                        i4 = 0;
                    } else {
                        i4++;
                        if (i4 == 5) {
                            long jB = AbstractC4686ft1.b(c5900kE2, i2, i);
                            if (jB != -9223372036854775807L) {
                                j = jB;
                                break;
                            }
                        }
                    }
                    i3++;
                }
                i2--;
            }
            this.g = j;
            this.e = true;
            return 0;
        }
        if (this.g == -9223372036854775807L) {
            e(interfaceC1190In1);
            return 0;
        }
        if (this.d) {
            long j3 = this.f;
            if (j3 == -9223372036854775807L) {
                e(interfaceC1190In1);
                return 0;
            }
            C5916kI2 c5916kI2 = this.a;
            long jB2 = c5916kI2.b(this.g) - c5916kI2.b(j3);
            this.h = jB2;
            if (jB2 < 0) {
                AbstractC3305ay2.f("TsDurationReader", "Invalid duration: " + jB2 + ". Using TIME_UNSET instead.");
                this.h = -9223372036854775807L;
            }
            e(interfaceC1190In1);
            return 0;
        }
        int iMin2 = (int) Math.min(112800L, interfaceC1190In1.zzd());
        if (interfaceC1190In1.zzf() != 0) {
            c6057ko1.a = 0L;
            return 1;
        }
        this.b.d(iMin2);
        interfaceC1190In1.zzj();
        ((C9694xn1) interfaceC1190In1).h(this.b.i(), 0, iMin2, false);
        C5900kE2 c5900kE22 = this.b;
        int iL2 = c5900kE22.l();
        int iM2 = c5900kE22.m();
        while (true) {
            if (iL2 >= iM2) {
                break;
            }
            if (c5900kE22.i()[iL2] == 71) {
                long jB3 = AbstractC4686ft1.b(c5900kE22, iL2, i);
                if (jB3 != -9223372036854775807L) {
                    j = jB3;
                    break;
                }
            }
            iL2++;
        }
        this.f = j;
        this.d = true;
        return 0;
    }

    public final long b() {
        return this.h;
    }

    public final C5916kI2 c() {
        return this.a;
    }

    public final boolean d() {
        return this.c;
    }

    public final int e(InterfaceC1190In1 interfaceC1190In1) {
        byte[] bArr = AbstractC9004vJ2.f;
        int length = bArr.length;
        this.b.e(bArr, 0);
        this.c = true;
        interfaceC1190In1.zzj();
        return 0;
    }
}
