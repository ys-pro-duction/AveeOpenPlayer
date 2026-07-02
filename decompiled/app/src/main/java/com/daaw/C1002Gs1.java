package com.daaw;

/* JADX INFO: renamed from: com.daaw.Gs1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1002Gs1 {
    public boolean c;
    public boolean d;
    public boolean e;
    public final C5916kI2 a = new C5916kI2(0);
    public long f = -9223372036854775807L;
    public long g = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public final C5900kE2 b = new C5900kE2();

    public static long c(C5900kE2 c5900kE2) {
        int iL = c5900kE2.l();
        if (c5900kE2.j() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        c5900kE2.c(bArr, 0, 9);
        c5900kE2.g(iL);
        byte b = bArr[0];
        if ((b & 196) == 68) {
            byte b2 = bArr[2];
            if ((b2 & 4) == 4) {
                byte b3 = bArr[4];
                if ((b3 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j = b;
                    long j2 = b2;
                    return ((j2 & 3) << 13) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((bArr[1] & 255) << 20) | (((j2 & 248) >> 3) << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b3) & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    public static final int g(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public final int a(InterfaceC1190In1 interfaceC1190In1, C6057ko1 c6057ko1) {
        long j = -9223372036854775807L;
        if (!this.e) {
            long jZzd = interfaceC1190In1.zzd();
            int iMin = (int) Math.min(20000L, jZzd);
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
            int iM = c5900kE2.m() - 4;
            while (true) {
                if (iM < iL) {
                    break;
                }
                if (g(c5900kE2.i(), iM) == 442) {
                    c5900kE2.g(iM + 4);
                    long jC = c(c5900kE2);
                    if (jC != -9223372036854775807L) {
                        j = jC;
                        break;
                    }
                }
                iM--;
            }
            this.g = j;
            this.e = true;
            return 0;
        }
        if (this.g == -9223372036854775807L) {
            f(interfaceC1190In1);
            return 0;
        }
        if (this.d) {
            long j3 = this.f;
            if (j3 == -9223372036854775807L) {
                f(interfaceC1190In1);
                return 0;
            }
            C5916kI2 c5916kI2 = this.a;
            long jB = c5916kI2.b(this.g) - c5916kI2.b(j3);
            this.h = jB;
            if (jB < 0) {
                AbstractC3305ay2.f("PsDurationReader", "Invalid duration: " + jB + ". Using TIME_UNSET instead.");
                this.h = -9223372036854775807L;
            }
            f(interfaceC1190In1);
            return 0;
        }
        int iMin2 = (int) Math.min(20000L, interfaceC1190In1.zzd());
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
            if (iL2 >= iM2 - 3) {
                break;
            }
            if (g(c5900kE22.i(), iL2) == 442) {
                c5900kE22.g(iL2 + 4);
                long jC2 = c(c5900kE22);
                if (jC2 != -9223372036854775807L) {
                    j = jC2;
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

    public final C5916kI2 d() {
        return this.a;
    }

    public final boolean e() {
        return this.c;
    }

    public final int f(InterfaceC1190In1 interfaceC1190In1) {
        byte[] bArr = AbstractC9004vJ2.f;
        int length = bArr.length;
        this.b.e(bArr, 0);
        this.c = true;
        interfaceC1190In1.zzj();
        return 0;
    }
}
