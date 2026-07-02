package com.daaw;

import com.daaw.AbstractC3317b10;

/* JADX INFO: renamed from: com.daaw.Oa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1759Oa {

    /* JADX INFO: renamed from: com.daaw.Oa$a */
    public static final class a {
        public int a;
        public long b;
        public Object c;
        public final C6484mJ d;

        public a(C6484mJ c6484mJ) {
            c6484mJ.getClass();
            this.d = c6484mJ;
        }
    }

    public static int A(int i, byte[] bArr, int i2, int i3, AbstractC3317b10.e eVar, a aVar) {
        AbstractC4321ee0 abstractC4321ee0 = (AbstractC4321ee0) eVar;
        int iK = K(bArr, i2, aVar);
        abstractC4321ee0.m(AbstractC9408wm.c(aVar.b));
        while (iK < i3) {
            int iH = H(bArr, iK, aVar);
            if (i != aVar.a) {
                break;
            }
            iK = K(bArr, iH, aVar);
            abstractC4321ee0.m(AbstractC9408wm.c(aVar.b));
        }
        return iK;
    }

    public static int B(byte[] bArr, int i, a aVar) throws P10 {
        int iH = H(bArr, i, aVar);
        int i2 = aVar.a;
        if (i2 < 0) {
            throw P10.g();
        }
        if (i2 == 0) {
            aVar.c = "";
            return iH;
        }
        aVar.c = new String(bArr, iH, i2, AbstractC3317b10.b);
        return iH + i2;
    }

    public static int C(int i, byte[] bArr, int i2, int i3, AbstractC3317b10.e eVar, a aVar) throws P10 {
        int iH = H(bArr, i2, aVar);
        int i4 = aVar.a;
        if (i4 < 0) {
            throw P10.g();
        }
        if (i4 == 0) {
            eVar.add("");
        } else {
            eVar.add(new String(bArr, iH, i4, AbstractC3317b10.b));
            iH += i4;
        }
        while (iH < i3) {
            int iH2 = H(bArr, iH, aVar);
            if (i != aVar.a) {
                break;
            }
            iH = H(bArr, iH2, aVar);
            int i5 = aVar.a;
            if (i5 < 0) {
                throw P10.g();
            }
            if (i5 == 0) {
                eVar.add("");
            } else {
                eVar.add(new String(bArr, iH, i5, AbstractC3317b10.b));
                iH += i5;
            }
        }
        return iH;
    }

    public static int D(int i, byte[] bArr, int i2, int i3, AbstractC3317b10.e eVar, a aVar) throws P10 {
        int iH = H(bArr, i2, aVar);
        int i4 = aVar.a;
        if (i4 < 0) {
            throw P10.g();
        }
        if (i4 == 0) {
            eVar.add("");
        } else {
            int i5 = iH + i4;
            if (!AbstractC3472bb1.t(bArr, iH, i5)) {
                throw P10.d();
            }
            eVar.add(new String(bArr, iH, i4, AbstractC3317b10.b));
            iH = i5;
        }
        while (iH < i3) {
            int iH2 = H(bArr, iH, aVar);
            if (i != aVar.a) {
                break;
            }
            iH = H(bArr, iH2, aVar);
            int i6 = aVar.a;
            if (i6 < 0) {
                throw P10.g();
            }
            if (i6 == 0) {
                eVar.add("");
            } else {
                int i7 = iH + i6;
                if (!AbstractC3472bb1.t(bArr, iH, i7)) {
                    throw P10.d();
                }
                eVar.add(new String(bArr, iH, i6, AbstractC3317b10.b));
                iH = i7;
            }
        }
        return iH;
    }

    public static int E(byte[] bArr, int i, a aVar) throws P10 {
        int iH = H(bArr, i, aVar);
        int i2 = aVar.a;
        if (i2 < 0) {
            throw P10.g();
        }
        if (i2 == 0) {
            aVar.c = "";
            return iH;
        }
        aVar.c = AbstractC3472bb1.h(bArr, iH, i2);
        return iH + i2;
    }

    public static int F(int i, byte[] bArr, int i2, int i3, L91 l91, a aVar) throws P10 {
        if (AbstractC6027ki1.a(i) == 0) {
            throw P10.c();
        }
        int iB = AbstractC6027ki1.b(i);
        if (iB == 0) {
            int iK = K(bArr, i2, aVar);
            l91.n(i, Long.valueOf(aVar.b));
            return iK;
        }
        if (iB == 1) {
            l91.n(i, Long.valueOf(i(bArr, i2)));
            return i2 + 8;
        }
        if (iB == 2) {
            int iH = H(bArr, i2, aVar);
            int i4 = aVar.a;
            if (i4 < 0) {
                throw P10.g();
            }
            if (i4 > bArr.length - iH) {
                throw P10.n();
            }
            if (i4 == 0) {
                l91.n(i, AbstractC4340ei.C);
            } else {
                l91.n(i, AbstractC4340ei.H(bArr, iH, i4));
            }
            return iH + i4;
        }
        if (iB != 3) {
            if (iB != 5) {
                throw P10.c();
            }
            l91.n(i, Integer.valueOf(g(bArr, i2)));
            return i2 + 4;
        }
        L91 l91K = L91.k();
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int iH2 = H(bArr, i2, aVar);
            i6 = aVar.a;
            if (i6 == i5) {
                i2 = iH2;
                break;
            }
            i2 = F(i6, bArr, iH2, i3, l91K, aVar);
        }
        if (i2 > i3 || i6 != i5) {
            throw P10.h();
        }
        l91.n(i, l91K);
        return i2;
    }

    public static int G(int i, byte[] bArr, int i2, a aVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            aVar.a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            aVar.a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            aVar.a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            aVar.a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                aVar.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int H(byte[] bArr, int i, a aVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return G(b, bArr, i2, aVar);
        }
        aVar.a = b;
        return i2;
    }

    public static int I(int i, byte[] bArr, int i2, int i3, AbstractC3317b10.e eVar, a aVar) {
        C9753y00 c9753y00 = (C9753y00) eVar;
        int iH = H(bArr, i2, aVar);
        c9753y00.q(aVar.a);
        while (iH < i3) {
            int iH2 = H(bArr, iH, aVar);
            if (i != aVar.a) {
                break;
            }
            iH = H(bArr, iH2, aVar);
            c9753y00.q(aVar.a);
        }
        return iH;
    }

    public static int J(long j, byte[] bArr, int i, a aVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        long j2 = (j & 127) | (((long) (b & 127)) << 7);
        int i3 = 7;
        while (b < 0) {
            int i4 = i2 + 1;
            byte b2 = bArr[i2];
            i3 += 7;
            j2 |= ((long) (b2 & 127)) << i3;
            i2 = i4;
            b = b2;
        }
        aVar.b = j2;
        return i2;
    }

    public static int K(byte[] bArr, int i, a aVar) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j < 0) {
            return J(j, bArr, i2, aVar);
        }
        aVar.b = j;
        return i2;
    }

    public static int L(int i, byte[] bArr, int i2, int i3, AbstractC3317b10.e eVar, a aVar) {
        AbstractC4321ee0 abstractC4321ee0 = (AbstractC4321ee0) eVar;
        int iK = K(bArr, i2, aVar);
        abstractC4321ee0.m(aVar.b);
        while (iK < i3) {
            int iH = H(bArr, iK, aVar);
            if (i != aVar.a) {
                break;
            }
            iK = K(bArr, iH, aVar);
            abstractC4321ee0.m(aVar.b);
        }
        return iK;
    }

    public static int M(Object obj, DN0 dn0, byte[] bArr, int i, int i2, int i3, a aVar) {
        int iG0 = ((C2444Uj0) dn0).g0(obj, bArr, i, i2, i3, aVar);
        aVar.c = obj;
        return iG0;
    }

    public static int N(Object obj, DN0 dn0, byte[] bArr, int i, int i2, a aVar) throws P10 {
        int iG = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iG = G(i3, bArr, iG, aVar);
            i3 = aVar.a;
        }
        int i4 = iG;
        if (i3 < 0 || i3 > i2 - i4) {
            throw P10.n();
        }
        int i5 = i4 + i3;
        dn0.b(obj, bArr, i4, i5, aVar);
        aVar.c = obj;
        return i5;
    }

    public static int O(int i, byte[] bArr, int i2, int i3, a aVar) throws P10 {
        if (AbstractC6027ki1.a(i) == 0) {
            throw P10.c();
        }
        int iB = AbstractC6027ki1.b(i);
        if (iB == 0) {
            return K(bArr, i2, aVar);
        }
        if (iB == 1) {
            return i2 + 8;
        }
        if (iB == 2) {
            return H(bArr, i2, aVar) + aVar.a;
        }
        if (iB != 3) {
            if (iB == 5) {
                return i2 + 4;
            }
            throw P10.c();
        }
        int i4 = (i & (-8)) | 4;
        int i5 = 0;
        while (i2 < i3) {
            i2 = H(bArr, i2, aVar);
            i5 = aVar.a;
            if (i5 == i4) {
                break;
            }
            i2 = O(i5, bArr, i2, i3, aVar);
        }
        if (i2 > i3 || i5 != i4) {
            throw P10.h();
        }
        return i2;
    }

    public static int a(int i, byte[] bArr, int i2, int i3, AbstractC3317b10.e eVar, a aVar) {
        AbstractC6303lg abstractC6303lg = (AbstractC6303lg) eVar;
        int iK = K(bArr, i2, aVar);
        abstractC6303lg.m(aVar.b != 0);
        while (iK < i3) {
            int iH = H(bArr, iK, aVar);
            if (i != aVar.a) {
                break;
            }
            iK = K(bArr, iH, aVar);
            abstractC6303lg.m(aVar.b != 0);
        }
        return iK;
    }

    public static int b(byte[] bArr, int i, a aVar) throws P10 {
        int iH = H(bArr, i, aVar);
        int i2 = aVar.a;
        if (i2 < 0) {
            throw P10.g();
        }
        if (i2 > bArr.length - iH) {
            throw P10.n();
        }
        if (i2 == 0) {
            aVar.c = AbstractC4340ei.C;
            return iH;
        }
        aVar.c = AbstractC4340ei.H(bArr, iH, i2);
        return iH + i2;
    }

    public static int c(int i, byte[] bArr, int i2, int i3, AbstractC3317b10.e eVar, a aVar) throws P10 {
        int iH = H(bArr, i2, aVar);
        int i4 = aVar.a;
        if (i4 < 0) {
            throw P10.g();
        }
        if (i4 > bArr.length - iH) {
            throw P10.n();
        }
        if (i4 == 0) {
            eVar.add(AbstractC4340ei.C);
        } else {
            eVar.add(AbstractC4340ei.H(bArr, iH, i4));
            iH += i4;
        }
        while (iH < i3) {
            int iH2 = H(bArr, iH, aVar);
            if (i != aVar.a) {
                break;
            }
            iH = H(bArr, iH2, aVar);
            int i5 = aVar.a;
            if (i5 < 0) {
                throw P10.g();
            }
            if (i5 > bArr.length - iH) {
                throw P10.n();
            }
            if (i5 == 0) {
                eVar.add(AbstractC4340ei.C);
            } else {
                eVar.add(AbstractC4340ei.H(bArr, iH, i5));
                iH += i5;
            }
        }
        return iH;
    }

    public static double d(byte[] bArr, int i) {
        return Double.longBitsToDouble(i(bArr, i));
    }

    public static int e(int i, byte[] bArr, int i2, int i3, AbstractC3317b10.e eVar, a aVar) {
        AbstractC5055hD abstractC5055hD = (AbstractC5055hD) eVar;
        abstractC5055hD.m(d(bArr, i2));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int iH = H(bArr, i4, aVar);
            if (i != aVar.a) {
                break;
            }
            abstractC5055hD.m(d(bArr, iH));
            i4 = iH + 8;
        }
        return i4;
    }

    public static int f(int i, byte[] bArr, int i2, int i3, Object obj, InterfaceC1900Pj0 interfaceC1900Pj0, K91 k91, a aVar) {
        aVar.d.a(interfaceC1900Pj0, i >>> 3);
        return F(i, bArr, i2, i3, C2444Uj0.w(obj), aVar);
    }

    public static int g(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static int h(int i, byte[] bArr, int i2, int i3, AbstractC3317b10.e eVar, a aVar) {
        C9753y00 c9753y00 = (C9753y00) eVar;
        c9753y00.q(g(bArr, i2));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int iH = H(bArr, i4, aVar);
            if (i != aVar.a) {
                break;
            }
            c9753y00.q(g(bArr, iH));
            i4 = iH + 4;
        }
        return i4;
    }

    public static long i(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public static int j(int i, byte[] bArr, int i2, int i3, AbstractC3317b10.e eVar, a aVar) {
        AbstractC4321ee0 abstractC4321ee0 = (AbstractC4321ee0) eVar;
        abstractC4321ee0.m(i(bArr, i2));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int iH = H(bArr, i4, aVar);
            if (i != aVar.a) {
                break;
            }
            abstractC4321ee0.m(i(bArr, iH));
            i4 = iH + 8;
        }
        return i4;
    }

    public static float k(byte[] bArr, int i) {
        return Float.intBitsToFloat(g(bArr, i));
    }

    public static int l(int i, byte[] bArr, int i2, int i3, AbstractC3317b10.e eVar, a aVar) {
        AbstractC3691cN abstractC3691cN = (AbstractC3691cN) eVar;
        abstractC3691cN.m(k(bArr, i2));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int iH = H(bArr, i4, aVar);
            if (i != aVar.a) {
                break;
            }
            abstractC3691cN.m(k(bArr, iH));
            i4 = iH + 4;
        }
        return i4;
    }

    public static int m(DN0 dn0, byte[] bArr, int i, int i2, int i3, a aVar) {
        Object objH = dn0.h();
        int iM = M(objH, dn0, bArr, i, i2, i3, aVar);
        dn0.c(objH);
        aVar.c = objH;
        return iM;
    }

    public static int n(DN0 dn0, int i, byte[] bArr, int i2, int i3, AbstractC3317b10.e eVar, a aVar) {
        int i4 = (i & (-8)) | 4;
        int iM = m(dn0, bArr, i2, i3, i4, aVar);
        eVar.add(aVar.c);
        while (iM < i3) {
            int iH = H(bArr, iM, aVar);
            if (i != aVar.a) {
                break;
            }
            iM = m(dn0, bArr, iH, i3, i4, aVar);
            eVar.add(aVar.c);
        }
        return iM;
    }

    public static int o(DN0 dn0, byte[] bArr, int i, int i2, a aVar) throws P10 {
        Object objH = dn0.h();
        int iN = N(objH, dn0, bArr, i, i2, aVar);
        dn0.c(objH);
        aVar.c = objH;
        return iN;
    }

    public static int p(DN0 dn0, int i, byte[] bArr, int i2, int i3, AbstractC3317b10.e eVar, a aVar) throws P10 {
        int iO = o(dn0, bArr, i2, i3, aVar);
        eVar.add(aVar.c);
        while (iO < i3) {
            int iH = H(bArr, iO, aVar);
            if (i != aVar.a) {
                break;
            }
            iO = o(dn0, bArr, iH, i3, aVar);
            eVar.add(aVar.c);
        }
        return iO;
    }

    public static int q(byte[] bArr, int i, AbstractC3317b10.e eVar, a aVar) throws P10 {
        AbstractC6303lg abstractC6303lg = (AbstractC6303lg) eVar;
        int iH = H(bArr, i, aVar);
        int i2 = aVar.a + iH;
        while (iH < i2) {
            iH = K(bArr, iH, aVar);
            abstractC6303lg.m(aVar.b != 0);
        }
        if (iH == i2) {
            return iH;
        }
        throw P10.n();
    }

    public static int r(byte[] bArr, int i, AbstractC3317b10.e eVar, a aVar) throws P10 {
        AbstractC5055hD abstractC5055hD = (AbstractC5055hD) eVar;
        int iH = H(bArr, i, aVar);
        int i2 = aVar.a + iH;
        while (iH < i2) {
            abstractC5055hD.m(d(bArr, iH));
            iH += 8;
        }
        if (iH == i2) {
            return iH;
        }
        throw P10.n();
    }

    public static int s(byte[] bArr, int i, AbstractC3317b10.e eVar, a aVar) throws P10 {
        C9753y00 c9753y00 = (C9753y00) eVar;
        int iH = H(bArr, i, aVar);
        int i2 = aVar.a + iH;
        while (iH < i2) {
            c9753y00.q(g(bArr, iH));
            iH += 4;
        }
        if (iH == i2) {
            return iH;
        }
        throw P10.n();
    }

    public static int t(byte[] bArr, int i, AbstractC3317b10.e eVar, a aVar) throws P10 {
        AbstractC4321ee0 abstractC4321ee0 = (AbstractC4321ee0) eVar;
        int iH = H(bArr, i, aVar);
        int i2 = aVar.a + iH;
        while (iH < i2) {
            abstractC4321ee0.m(i(bArr, iH));
            iH += 8;
        }
        if (iH == i2) {
            return iH;
        }
        throw P10.n();
    }

    public static int u(byte[] bArr, int i, AbstractC3317b10.e eVar, a aVar) throws P10 {
        AbstractC3691cN abstractC3691cN = (AbstractC3691cN) eVar;
        int iH = H(bArr, i, aVar);
        int i2 = aVar.a + iH;
        while (iH < i2) {
            abstractC3691cN.m(k(bArr, iH));
            iH += 4;
        }
        if (iH == i2) {
            return iH;
        }
        throw P10.n();
    }

    public static int v(byte[] bArr, int i, AbstractC3317b10.e eVar, a aVar) throws P10 {
        C9753y00 c9753y00 = (C9753y00) eVar;
        int iH = H(bArr, i, aVar);
        int i2 = aVar.a + iH;
        while (iH < i2) {
            iH = H(bArr, iH, aVar);
            c9753y00.q(AbstractC9408wm.b(aVar.a));
        }
        if (iH == i2) {
            return iH;
        }
        throw P10.n();
    }

    public static int w(byte[] bArr, int i, AbstractC3317b10.e eVar, a aVar) throws P10 {
        AbstractC4321ee0 abstractC4321ee0 = (AbstractC4321ee0) eVar;
        int iH = H(bArr, i, aVar);
        int i2 = aVar.a + iH;
        while (iH < i2) {
            iH = K(bArr, iH, aVar);
            abstractC4321ee0.m(AbstractC9408wm.c(aVar.b));
        }
        if (iH == i2) {
            return iH;
        }
        throw P10.n();
    }

    public static int x(byte[] bArr, int i, AbstractC3317b10.e eVar, a aVar) throws P10 {
        C9753y00 c9753y00 = (C9753y00) eVar;
        int iH = H(bArr, i, aVar);
        int i2 = aVar.a + iH;
        while (iH < i2) {
            iH = H(bArr, iH, aVar);
            c9753y00.q(aVar.a);
        }
        if (iH == i2) {
            return iH;
        }
        throw P10.n();
    }

    public static int y(byte[] bArr, int i, AbstractC3317b10.e eVar, a aVar) throws P10 {
        AbstractC4321ee0 abstractC4321ee0 = (AbstractC4321ee0) eVar;
        int iH = H(bArr, i, aVar);
        int i2 = aVar.a + iH;
        while (iH < i2) {
            iH = K(bArr, iH, aVar);
            abstractC4321ee0.m(aVar.b);
        }
        if (iH == i2) {
            return iH;
        }
        throw P10.n();
    }

    public static int z(int i, byte[] bArr, int i2, int i3, AbstractC3317b10.e eVar, a aVar) {
        C9753y00 c9753y00 = (C9753y00) eVar;
        int iH = H(bArr, i2, aVar);
        c9753y00.q(AbstractC9408wm.b(aVar.a));
        while (iH < i3) {
            int iH2 = H(bArr, iH, aVar);
            if (i != aVar.a) {
                break;
            }
            iH = H(bArr, iH2, aVar);
            c9753y00.q(AbstractC9408wm.b(aVar.a));
        }
        return iH;
    }
}
