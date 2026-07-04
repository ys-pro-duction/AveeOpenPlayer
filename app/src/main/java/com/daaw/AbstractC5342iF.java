package com.daaw;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: com.daaw.iF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5342iF {
    public static final a a = new a(new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    public static final c b = new c(new d(new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}), new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    public static final byte[] c = {-19, -45, -11, 92, 26, 99, 18, 88, -42, -100, -9, -94, -34, -7, -34, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16};

    /* JADX INFO: renamed from: com.daaw.iF$a */
    public static class a {
        public final long[] a;
        public final long[] b;
        public final long[] c;

        public a(long[] jArr, long[] jArr2, long[] jArr3) {
            this.a = jArr;
            this.b = jArr2;
            this.c = jArr3;
        }

        public void a(long[] jArr, long[] jArr2) {
            System.arraycopy(jArr2, 0, jArr, 0, 10);
        }
    }

    /* JADX INFO: renamed from: com.daaw.iF$b */
    public static class b extends a {
        public final long[] d;

        public b() {
            this(new long[10], new long[10], new long[10], new long[10]);
        }

        @Override // com.daaw.AbstractC5342iF.a
        public void a(long[] jArr, long[] jArr2) {
            TJ.f(jArr, jArr2, this.d);
        }

        public b(e eVar) {
            this();
            long[] jArr = this.a;
            d dVar = eVar.a;
            TJ.n(jArr, dVar.b, dVar.a);
            long[] jArr2 = this.b;
            d dVar2 = eVar.a;
            TJ.m(jArr2, dVar2.b, dVar2.a);
            System.arraycopy(eVar.a.c, 0, this.d, 0, 10);
            TJ.f(this.c, eVar.b, AbstractC5619jF.b);
        }

        public b(long[] jArr, long[] jArr2, long[] jArr3, long[] jArr4) {
            super(jArr, jArr2, jArr4);
            this.d = jArr3;
        }
    }

    /* JADX INFO: renamed from: com.daaw.iF$c */
    public static class c {
        public final d a;
        public final long[] b;

        public c() {
            this(new d(), new long[10]);
        }

        public c(d dVar, long[] jArr) {
            this.a = dVar;
            this.b = jArr;
        }

        public c(c cVar) {
            this.a = new d(cVar.a);
            this.b = Arrays.copyOf(cVar.b, 10);
        }
    }

    /* JADX INFO: renamed from: com.daaw.iF$d */
    public static class d {
        public final long[] a;
        public final long[] b;
        public final long[] c;

        public d() {
            this(new long[10], new long[10], new long[10]);
        }

        public static d a(d dVar, c cVar) {
            TJ.f(dVar.a, cVar.a.a, cVar.b);
            long[] jArr = dVar.b;
            d dVar2 = cVar.a;
            TJ.f(jArr, dVar2.b, dVar2.c);
            TJ.f(dVar.c, cVar.a.c, cVar.b);
            return dVar;
        }

        public byte[] b() {
            long[] jArr = new long[10];
            long[] jArr2 = new long[10];
            long[] jArr3 = new long[10];
            TJ.e(jArr, this.c);
            TJ.f(jArr2, this.a, jArr);
            TJ.f(jArr3, this.b, jArr);
            byte[] bArrA = TJ.a(jArr3);
            bArrA[31] = (byte) ((AbstractC5342iF.i(jArr2) << 7) ^ bArrA[31]);
            return bArrA;
        }

        public d(long[] jArr, long[] jArr2, long[] jArr3) {
            this.a = jArr;
            this.b = jArr2;
            this.c = jArr3;
        }

        public d(d dVar) {
            this.a = Arrays.copyOf(dVar.a, 10);
            this.b = Arrays.copyOf(dVar.b, 10);
            this.c = Arrays.copyOf(dVar.c, 10);
        }

        public d(c cVar) {
            this();
            a(this, cVar);
        }
    }

    /* JADX INFO: renamed from: com.daaw.iF$e */
    public static class e {
        public final d a;
        public final long[] b;

        public e() {
            this(new d(), new long[10]);
        }

        public static e c(byte[] bArr) throws GeneralSecurityException {
            long[] jArr = new long[10];
            long[] jArrC = TJ.c(bArr);
            long[] jArr2 = new long[10];
            jArr2[0] = 1;
            long[] jArr3 = new long[10];
            long[] jArr4 = new long[10];
            long[] jArr5 = new long[10];
            long[] jArr6 = new long[10];
            long[] jArr7 = new long[10];
            TJ.k(jArr4, jArrC);
            TJ.f(jArr5, jArr4, AbstractC5619jF.a);
            TJ.m(jArr4, jArr4, jArr2);
            TJ.n(jArr5, jArr5, jArr2);
            long[] jArr8 = new long[10];
            TJ.k(jArr8, jArr5);
            TJ.f(jArr8, jArr8, jArr5);
            TJ.k(jArr, jArr8);
            TJ.f(jArr, jArr, jArr5);
            TJ.f(jArr, jArr, jArr4);
            AbstractC5342iF.o(jArr, jArr);
            TJ.f(jArr, jArr, jArr8);
            TJ.f(jArr, jArr, jArr4);
            TJ.k(jArr6, jArr);
            TJ.f(jArr6, jArr6, jArr5);
            TJ.m(jArr7, jArr6, jArr4);
            if (AbstractC5342iF.j(jArr7)) {
                TJ.n(jArr7, jArr6, jArr4);
                if (AbstractC5342iF.j(jArr7)) {
                    throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. No square root exists for modulo 2^255-19");
                }
                TJ.f(jArr, jArr, AbstractC5619jF.c);
            }
            if (!AbstractC5342iF.j(jArr) && ((bArr[31] & 255) >> 7) != 0) {
                throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. Computed x is zero and encoded x's least significant bit is not zero");
            }
            if (AbstractC5342iF.i(jArr) == ((bArr[31] & 255) >> 7)) {
                AbstractC5342iF.n(jArr, jArr);
            }
            TJ.f(jArr3, jArr, jArrC);
            return new e(new d(jArr, jArrC, jArr2), jArr3);
        }

        public static e d(e eVar, c cVar) {
            TJ.f(eVar.a.a, cVar.a.a, cVar.b);
            long[] jArr = eVar.a.b;
            d dVar = cVar.a;
            TJ.f(jArr, dVar.b, dVar.c);
            TJ.f(eVar.a.c, cVar.a.c, cVar.b);
            long[] jArr2 = eVar.b;
            d dVar2 = cVar.a;
            TJ.f(jArr2, dVar2.a, dVar2.b);
            return eVar;
        }

        public e(d dVar, long[] jArr) {
            this.a = dVar;
            this.b = jArr;
        }

        public e(c cVar) {
            this();
            d(this, cVar);
        }
    }

    public static void e(c cVar, e eVar, a aVar) {
        long[] jArr = new long[10];
        long[] jArr2 = cVar.a.a;
        d dVar = eVar.a;
        TJ.n(jArr2, dVar.b, dVar.a);
        long[] jArr3 = cVar.a.b;
        d dVar2 = eVar.a;
        TJ.m(jArr3, dVar2.b, dVar2.a);
        long[] jArr4 = cVar.a.b;
        TJ.f(jArr4, jArr4, aVar.b);
        d dVar3 = cVar.a;
        TJ.f(dVar3.c, dVar3.a, aVar.a);
        TJ.f(cVar.b, eVar.b, aVar.c);
        aVar.a(cVar.a.a, eVar.a.c);
        long[] jArr5 = cVar.a.a;
        TJ.n(jArr, jArr5, jArr5);
        d dVar4 = cVar.a;
        TJ.m(dVar4.a, dVar4.c, dVar4.b);
        d dVar5 = cVar.a;
        long[] jArr6 = dVar5.b;
        TJ.n(jArr6, dVar5.c, jArr6);
        TJ.n(cVar.a.c, jArr, cVar.b);
        long[] jArr7 = cVar.b;
        TJ.m(jArr7, jArr, jArr7);
    }

    public static d f(byte[] bArr, e eVar, byte[] bArr2) {
        b[] bVarArr = new b[8];
        bVarArr[0] = new b(eVar);
        c cVar = new c();
        h(cVar, eVar);
        e eVar2 = new e(cVar);
        for (int i = 1; i < 8; i++) {
            e(cVar, eVar2, bVarArr[i - 1]);
            bVarArr[i] = new b(new e(cVar));
        }
        byte[] bArrQ = q(bArr);
        byte[] bArrQ2 = q(bArr2);
        c cVar2 = new c(b);
        e eVar3 = new e();
        int i2 = 255;
        while (i2 >= 0 && bArrQ[i2] == 0 && bArrQ2[i2] == 0) {
            i2--;
        }
        while (i2 >= 0) {
            g(cVar2, new d(cVar2));
            byte b2 = bArrQ[i2];
            if (b2 > 0) {
                e(cVar2, e.d(eVar3, cVar2), bVarArr[bArrQ[i2] / 2]);
            } else if (b2 < 0) {
                r(cVar2, e.d(eVar3, cVar2), bVarArr[(-bArrQ[i2]) / 2]);
            }
            byte b3 = bArrQ2[i2];
            if (b3 > 0) {
                e(cVar2, e.d(eVar3, cVar2), AbstractC5619jF.e[bArrQ2[i2] / 2]);
            } else if (b3 < 0) {
                r(cVar2, e.d(eVar3, cVar2), AbstractC5619jF.e[(-bArrQ2[i2]) / 2]);
            }
            i2--;
        }
        return new d(cVar2);
    }

    public static void g(c cVar, d dVar) {
        long[] jArr = new long[10];
        TJ.k(cVar.a.a, dVar.a);
        TJ.k(cVar.a.c, dVar.b);
        TJ.k(cVar.b, dVar.c);
        long[] jArr2 = cVar.b;
        TJ.n(jArr2, jArr2, jArr2);
        TJ.n(cVar.a.b, dVar.a, dVar.b);
        TJ.k(jArr, cVar.a.b);
        d dVar2 = cVar.a;
        TJ.n(dVar2.b, dVar2.c, dVar2.a);
        d dVar3 = cVar.a;
        long[] jArr3 = dVar3.c;
        TJ.m(jArr3, jArr3, dVar3.a);
        d dVar4 = cVar.a;
        TJ.m(dVar4.a, jArr, dVar4.b);
        long[] jArr4 = cVar.b;
        TJ.m(jArr4, jArr4, cVar.a.c);
    }

    public static void h(c cVar, e eVar) {
        g(cVar, eVar.a);
    }

    public static int i(long[] jArr) {
        return TJ.a(jArr)[0] & 1;
    }

    public static boolean j(long[] jArr) {
        long[] jArr2 = new long[jArr.length + 1];
        System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
        TJ.i(jArr2);
        for (byte b2 : TJ.a(jArr2)) {
            if (b2 != 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean k(byte[] bArr) {
        for (int i = 31; i >= 0; i--) {
            int i2 = bArr[i] & 255;
            int i3 = c[i] & 255;
            if (i2 != i3) {
                return i2 < i3;
            }
        }
        return false;
    }

    public static long l(byte[] bArr, int i) {
        return (((long) (bArr[i + 2] & 255)) << 16) | (((long) bArr[i]) & 255) | (((long) (bArr[i + 1] & 255)) << 8);
    }

    public static long m(byte[] bArr, int i) {
        return (((long) (bArr[i + 3] & 255)) << 24) | l(bArr, i);
    }

    public static void n(long[] jArr, long[] jArr2) {
        for (int i = 0; i < jArr2.length; i++) {
            jArr[i] = -jArr2[i];
        }
    }

    public static void o(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        long[] jArr5 = new long[10];
        TJ.k(jArr3, jArr2);
        TJ.k(jArr4, jArr3);
        TJ.k(jArr4, jArr4);
        TJ.f(jArr4, jArr2, jArr4);
        TJ.f(jArr3, jArr3, jArr4);
        TJ.k(jArr3, jArr3);
        TJ.f(jArr3, jArr4, jArr3);
        TJ.k(jArr4, jArr3);
        for (int i = 1; i < 5; i++) {
            TJ.k(jArr4, jArr4);
        }
        TJ.f(jArr3, jArr4, jArr3);
        TJ.k(jArr4, jArr3);
        for (int i2 = 1; i2 < 10; i2++) {
            TJ.k(jArr4, jArr4);
        }
        TJ.f(jArr4, jArr4, jArr3);
        TJ.k(jArr5, jArr4);
        for (int i3 = 1; i3 < 20; i3++) {
            TJ.k(jArr5, jArr5);
        }
        TJ.f(jArr4, jArr5, jArr4);
        TJ.k(jArr4, jArr4);
        for (int i4 = 1; i4 < 10; i4++) {
            TJ.k(jArr4, jArr4);
        }
        TJ.f(jArr3, jArr4, jArr3);
        TJ.k(jArr4, jArr3);
        for (int i5 = 1; i5 < 50; i5++) {
            TJ.k(jArr4, jArr4);
        }
        TJ.f(jArr4, jArr4, jArr3);
        TJ.k(jArr5, jArr4);
        for (int i6 = 1; i6 < 100; i6++) {
            TJ.k(jArr5, jArr5);
        }
        TJ.f(jArr4, jArr5, jArr4);
        TJ.k(jArr4, jArr4);
        for (int i7 = 1; i7 < 50; i7++) {
            TJ.k(jArr4, jArr4);
        }
        TJ.f(jArr3, jArr4, jArr3);
        TJ.k(jArr3, jArr3);
        TJ.k(jArr3, jArr3);
        TJ.f(jArr, jArr3, jArr2);
    }

    public static void p(byte[] bArr) {
        long jL = l(bArr, 0) & 2097151;
        long jM = (m(bArr, 2) >> 5) & 2097151;
        long jL2 = (l(bArr, 5) >> 2) & 2097151;
        long jM2 = (m(bArr, 7) >> 7) & 2097151;
        long jM3 = (m(bArr, 10) >> 4) & 2097151;
        long jL3 = (l(bArr, 13) >> 1) & 2097151;
        long jM4 = (m(bArr, 15) >> 6) & 2097151;
        long jL4 = (l(bArr, 18) >> 3) & 2097151;
        long jL5 = l(bArr, 21) & 2097151;
        long jM5 = (m(bArr, 23) >> 5) & 2097151;
        long jL6 = (l(bArr, 26) >> 2) & 2097151;
        long jM6 = (m(bArr, 28) >> 7) & 2097151;
        long jM7 = (m(bArr, 31) >> 4) & 2097151;
        long jL7 = (l(bArr, 34) >> 1) & 2097151;
        long jM8 = (m(bArr, 36) >> 6) & 2097151;
        long jL8 = (l(bArr, 39) >> 3) & 2097151;
        long jL9 = l(bArr, 42) & 2097151;
        long jM9 = (m(bArr, 44) >> 5) & 2097151;
        long jL10 = (l(bArr, 47) >> 2) & 2097151;
        long jM10 = (m(bArr, 49) >> 7) & 2097151;
        long jM11 = (m(bArr, 52) >> 4) & 2097151;
        long jL11 = (l(bArr, 55) >> 1) & 2097151;
        long jM12 = (m(bArr, 57) >> 6) & 2097151;
        long jM13 = m(bArr, 60) >> 3;
        long j = jL9 - (jM13 * 683901);
        long j2 = ((jM8 - (jM13 * 997805)) + (jM12 * 136657)) - (jL11 * 683901);
        long j3 = ((((jM7 + (jM13 * 470296)) + (jM12 * 654183)) - (jL11 * 997805)) + (jM11 * 136657)) - (jM10 * 683901);
        long j4 = jM4 + (jL10 * 666643);
        long j5 = jL4 + (jM10 * 666643) + (jL10 * 470296);
        long j6 = jL5 + (jM11 * 666643) + (jM10 * 470296) + (jL10 * 654183);
        long j7 = (((jM5 + (jL11 * 666643)) + (jM11 * 470296)) + (jM10 * 654183)) - (jL10 * 997805);
        long j8 = ((((jL6 + (jM12 * 666643)) + (jL11 * 470296)) + (jM11 * 654183)) - (jM10 * 997805)) + (jL10 * 136657);
        long j9 = (((((jM6 + (jM13 * 666643)) + (jM12 * 470296)) + (jL11 * 654183)) - (jM11 * 997805)) + (jM10 * 136657)) - (jL10 * 683901);
        long j10 = (j4 + 1048576) >> 21;
        long j11 = j5 + j10;
        long j12 = j4 - (j10 << 21);
        long j13 = (j6 + 1048576) >> 21;
        long j14 = j7 + j13;
        long j15 = j6 - (j13 << 21);
        long j16 = (j8 + 1048576) >> 21;
        long j17 = j9 + j16;
        long j18 = j8 - (j16 << 21);
        long j19 = (j3 + 1048576) >> 21;
        long j20 = ((((jL7 + (jM13 * 654183)) - (jM12 * 997805)) + (jL11 * 136657)) - (jM11 * 683901)) + j19;
        long j21 = j3 - (j19 << 21);
        long j22 = (j2 + 1048576) >> 21;
        long j23 = ((jL8 + (jM13 * 136657)) - (jM12 * 683901)) + j22;
        long j24 = j2 - (j22 << 21);
        long j25 = (j + 1048576) >> 21;
        long j26 = jM9 + j25;
        long j27 = j - (j25 << 21);
        long j28 = (j11 + 1048576) >> 21;
        long j29 = j15 + j28;
        long j30 = j11 - (j28 << 21);
        long j31 = (j14 + 1048576) >> 21;
        long j32 = j18 + j31;
        long j33 = j14 - (j31 << 21);
        long j34 = (j17 + 1048576) >> 21;
        long j35 = j21 + j34;
        long j36 = j17 - (j34 << 21);
        long j37 = (j20 + 1048576) >> 21;
        long j38 = j24 + j37;
        long j39 = j20 - (j37 << 21);
        long j40 = (j23 + 1048576) >> 21;
        long j41 = j27 + j40;
        long j42 = j23 - (j40 << 21);
        long j43 = j32 - (j26 * 683901);
        long j44 = ((j29 - (j26 * 997805)) + (j41 * 136657)) - (j42 * 683901);
        long j45 = ((((j12 + (j26 * 470296)) + (j41 * 654183)) - (j42 * 997805)) + (j38 * 136657)) - (j39 * 683901);
        long j46 = jL + (j35 * 666643);
        long j47 = jM + (j39 * 666643) + (j35 * 470296);
        long j48 = jL2 + (j38 * 666643) + (j39 * 470296) + (j35 * 654183);
        long j49 = (((jM2 + (j42 * 666643)) + (j38 * 470296)) + (j39 * 654183)) - (j35 * 997805);
        long j50 = ((((jM3 + (j41 * 666643)) + (j42 * 470296)) + (j38 * 654183)) - (j39 * 997805)) + (j35 * 136657);
        long j51 = (((((jL3 + (j26 * 666643)) + (j41 * 470296)) + (j42 * 654183)) - (j38 * 997805)) + (j39 * 136657)) - (j35 * 683901);
        long j52 = (j46 + 1048576) >> 21;
        long j53 = j47 + j52;
        long j54 = j46 - (j52 << 21);
        long j55 = (j48 + 1048576) >> 21;
        long j56 = j49 + j55;
        long j57 = j48 - (j55 << 21);
        long j58 = (j50 + 1048576) >> 21;
        long j59 = j51 + j58;
        long j60 = j50 - (j58 << 21);
        long j61 = (j45 + 1048576) >> 21;
        long j62 = ((((j30 + (j26 * 654183)) - (j41 * 997805)) + (j42 * 136657)) - (j38 * 683901)) + j61;
        long j63 = j45 - (j61 << 21);
        long j64 = (j44 + 1048576) >> 21;
        long j65 = ((j33 + (j26 * 136657)) - (j41 * 683901)) + j64;
        long j66 = j44 - (j64 << 21);
        long j67 = (j43 + 1048576) >> 21;
        long j68 = j36 + j67;
        long j69 = j43 - (j67 << 21);
        long j70 = (j53 + 1048576) >> 21;
        long j71 = j57 + j70;
        long j72 = j53 - (j70 << 21);
        long j73 = (j56 + 1048576) >> 21;
        long j74 = j60 + j73;
        long j75 = j56 - (j73 << 21);
        long j76 = (j59 + 1048576) >> 21;
        long j77 = j63 + j76;
        long j78 = j59 - (j76 << 21);
        long j79 = (j62 + 1048576) >> 21;
        long j80 = j66 + j79;
        long j81 = j62 - (j79 << 21);
        long j82 = (j65 + 1048576) >> 21;
        long j83 = (j68 + 1048576) >> 21;
        long j84 = j68 - (j83 << 21);
        long j85 = j54 + (j83 * 666643);
        long j86 = j72 + (j83 * 470296);
        long j87 = j71 + (j83 * 654183);
        long j88 = j75 - (j83 * 997805);
        long j89 = j74 + (j83 * 136657);
        long j90 = j78 - (j83 * 683901);
        long j91 = j85 >> 21;
        long j92 = j86 + j91;
        long j93 = j85 - (j91 << 21);
        long j94 = j92 >> 21;
        long j95 = j87 + j94;
        long j96 = j92 - (j94 << 21);
        long j97 = j95 >> 21;
        long j98 = j88 + j97;
        long j99 = j95 - (j97 << 21);
        long j100 = j98 >> 21;
        long j101 = j89 + j100;
        long j102 = j98 - (j100 << 21);
        long j103 = j101 >> 21;
        long j104 = j90 + j103;
        long j105 = j101 - (j103 << 21);
        long j106 = j104 >> 21;
        long j107 = j77 + j106;
        long j108 = j104 - (j106 << 21);
        long j109 = j107 >> 21;
        long j110 = j81 + j109;
        long j111 = j107 - (j109 << 21);
        long j112 = j110 >> 21;
        long j113 = j80 + j112;
        long j114 = j110 - (j112 << 21);
        long j115 = j113 >> 21;
        long j116 = (j65 - (j82 << 21)) + j115;
        long j117 = j113 - (j115 << 21);
        long j118 = j116 >> 21;
        long j119 = j69 + j82 + j118;
        long j120 = j116 - (j118 << 21);
        long j121 = j119 >> 21;
        long j122 = j84 + j121;
        long j123 = j119 - (j121 << 21);
        long j124 = j122 >> 21;
        long j125 = j122 - (j124 << 21);
        long j126 = j93 + (666643 * j124);
        long j127 = j96 + (470296 * j124);
        long j128 = j99 + (654183 * j124);
        long j129 = j102 - (997805 * j124);
        long j130 = j105 + (136657 * j124);
        long j131 = j108 - (j124 * 683901);
        long j132 = j126 >> 21;
        long j133 = j127 + j132;
        long j134 = j126 - (j132 << 21);
        long j135 = j133 >> 21;
        long j136 = j128 + j135;
        long j137 = j133 - (j135 << 21);
        long j138 = j136 >> 21;
        long j139 = j129 + j138;
        long j140 = j136 - (j138 << 21);
        long j141 = j139 >> 21;
        long j142 = j130 + j141;
        long j143 = j139 - (j141 << 21);
        long j144 = j142 >> 21;
        long j145 = j131 + j144;
        long j146 = j142 - (j144 << 21);
        long j147 = j145 >> 21;
        long j148 = j111 + j147;
        long j149 = j145 - (j147 << 21);
        long j150 = j148 >> 21;
        long j151 = j114 + j150;
        long j152 = j148 - (j150 << 21);
        long j153 = j151 >> 21;
        long j154 = j117 + j153;
        long j155 = j151 - (j153 << 21);
        long j156 = j154 >> 21;
        long j157 = j120 + j156;
        long j158 = j154 - (j156 << 21);
        long j159 = j157 >> 21;
        long j160 = j123 + j159;
        long j161 = j157 - (j159 << 21);
        long j162 = j160 >> 21;
        long j163 = j125 + j162;
        long j164 = j160 - (j162 << 21);
        bArr[0] = (byte) j134;
        bArr[1] = (byte) (j134 >> 8);
        bArr[2] = (byte) ((j134 >> 16) | (j137 << 5));
        bArr[3] = (byte) (j137 >> 3);
        bArr[4] = (byte) (j137 >> 11);
        bArr[5] = (byte) ((j137 >> 19) | (j140 << 2));
        bArr[6] = (byte) (j140 >> 6);
        bArr[7] = (byte) ((j140 >> 14) | (j143 << 7));
        bArr[8] = (byte) (j143 >> 1);
        bArr[9] = (byte) (j143 >> 9);
        bArr[10] = (byte) ((j143 >> 17) | (j146 << 4));
        bArr[11] = (byte) (j146 >> 4);
        bArr[12] = (byte) (j146 >> 12);
        bArr[13] = (byte) ((j146 >> 20) | (j149 << 1));
        bArr[14] = (byte) (j149 >> 7);
        bArr[15] = (byte) ((j149 >> 15) | (j152 << 6));
        bArr[16] = (byte) (j152 >> 2);
        bArr[17] = (byte) (j152 >> 10);
        bArr[18] = (byte) ((j152 >> 18) | (j155 << 3));
        bArr[19] = (byte) (j155 >> 5);
        bArr[20] = (byte) (j155 >> 13);
        bArr[21] = (byte) j158;
        bArr[22] = (byte) (j158 >> 8);
        bArr[23] = (byte) ((j158 >> 16) | (j161 << 5));
        bArr[24] = (byte) (j161 >> 3);
        bArr[25] = (byte) (j161 >> 11);
        bArr[26] = (byte) ((j161 >> 19) | (j164 << 2));
        bArr[27] = (byte) (j164 >> 6);
        bArr[28] = (byte) ((j164 >> 14) | (j163 << 7));
        bArr[29] = (byte) (j163 >> 1);
        bArr[30] = (byte) (j163 >> 9);
        bArr[31] = (byte) (j163 >> 17);
    }

    public static byte[] q(byte[] bArr) {
        int i;
        byte[] bArr2 = new byte[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        for (int i2 = 0; i2 < 256; i2++) {
            bArr2[i2] = (byte) (1 & ((bArr[i2 >> 3] & 255) >> (i2 & 7)));
        }
        for (int i3 = 0; i3 < 256; i3++) {
            if (bArr2[i3] != 0) {
                for (int i4 = 1; i4 <= 6 && (i = i3 + i4) < 256; i4++) {
                    byte b2 = bArr2[i];
                    if (b2 != 0) {
                        byte b3 = bArr2[i3];
                        if ((b2 << i4) + b3 <= 15) {
                            bArr2[i3] = (byte) (b3 + (b2 << i4));
                            bArr2[i] = 0;
                        } else if (b3 - (b2 << i4) >= -15) {
                            bArr2[i3] = (byte) (b3 - (b2 << i4));
                            while (true) {
                                if (i >= 256) {
                                    break;
                                }
                                if (bArr2[i] == 0) {
                                    bArr2[i] = 1;
                                    break;
                                }
                                bArr2[i] = 0;
                                i++;
                            }
                        }
                    }
                }
            }
        }
        return bArr2;
    }

    public static void r(c cVar, e eVar, a aVar) {
        long[] jArr = new long[10];
        long[] jArr2 = cVar.a.a;
        d dVar = eVar.a;
        TJ.n(jArr2, dVar.b, dVar.a);
        long[] jArr3 = cVar.a.b;
        d dVar2 = eVar.a;
        TJ.m(jArr3, dVar2.b, dVar2.a);
        long[] jArr4 = cVar.a.b;
        TJ.f(jArr4, jArr4, aVar.a);
        d dVar3 = cVar.a;
        TJ.f(dVar3.c, dVar3.a, aVar.b);
        TJ.f(cVar.b, eVar.b, aVar.c);
        aVar.a(cVar.a.a, eVar.a.c);
        long[] jArr5 = cVar.a.a;
        TJ.n(jArr, jArr5, jArr5);
        d dVar4 = cVar.a;
        TJ.m(dVar4.a, dVar4.c, dVar4.b);
        d dVar5 = cVar.a;
        long[] jArr6 = dVar5.b;
        TJ.n(jArr6, dVar5.c, jArr6);
        TJ.m(cVar.a.c, jArr, cVar.b);
        long[] jArr7 = cVar.b;
        TJ.n(jArr7, jArr, jArr7);
    }

    public static boolean s(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr2.length != 64) {
            return false;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, 32, 64);
        if (!k(bArrCopyOfRange)) {
            return false;
        }
        MessageDigest messageDigest = (MessageDigest) LG.e.a("SHA-512");
        messageDigest.update(bArr2, 0, 32);
        messageDigest.update(bArr3);
        messageDigest.update(bArr);
        byte[] bArrDigest = messageDigest.digest();
        p(bArrDigest);
        byte[] bArrB = f(bArrDigest, e.c(bArr3), bArrCopyOfRange).b();
        for (int i = 0; i < 32; i++) {
            if (bArrB[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }
}
