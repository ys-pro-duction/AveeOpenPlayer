package com.daaw;

import android.util.Pair;
import android.util.SparseArray;
import com.daaw.AbstractC1244Jb;
import com.daaw.CO0;
import com.daaw.Z41;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.gms.ads.AdRequest;
import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: com.daaw.nQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6791nQ implements InterfaceC8715uJ {
    public static final InterfaceC10117zJ H = new a();
    public static final int I = AbstractC6280lb1.v("seig");
    public static final byte[] J = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final Format K = Format.n(null, "application/x-emsg", Long.MAX_VALUE);
    public int A;
    public int B;
    public boolean C;
    public InterfaceC9838yJ D;
    public Z41[] E;
    public Z41[] F;
    public boolean G;
    public final int a;
    public final U41 b;
    public final List c;
    public final DrmInitData d;
    public final SparseArray e;
    public final C2584Vs0 f;
    public final C2584Vs0 g;
    public final C2584Vs0 h;
    public final R31 i;
    public final C2584Vs0 j;
    public final byte[] k;
    public final ArrayDeque l;
    public final ArrayDeque m;
    public final Z41 n;
    public int o;
    public int p;
    public long q;
    public int r;
    public C2584Vs0 s;
    public long t;
    public int u;
    public long v;
    public long w;
    public long x;
    public c y;
    public int z;

    /* JADX INFO: renamed from: com.daaw.nQ$a */
    public static class a implements InterfaceC10117zJ {
        @Override // com.daaw.InterfaceC10117zJ
        public InterfaceC8715uJ[] a() {
            return new InterfaceC8715uJ[]{new C6791nQ()};
        }
    }

    /* JADX INFO: renamed from: com.daaw.nQ$b */
    public static final class b {
        public final long a;
        public final int b;

        public b(long j, int i) {
            this.a = j;
            this.b = i;
        }
    }

    /* JADX INFO: renamed from: com.daaw.nQ$c */
    public static final class c {
        public final Z41 a;
        public U41 c;
        public C1539Lx d;
        public int e;
        public int f;
        public int g;
        public int h;
        public final X41 b = new X41();
        public final C2584Vs0 i = new C2584Vs0(1);
        public final C2584Vs0 j = new C2584Vs0();

        public c(Z41 z41) {
            this.a = z41;
        }

        public final W41 b() {
            X41 x41 = this.b;
            int i = x41.a.a;
            W41 w41 = x41.o;
            return w41 != null ? w41 : this.c.a(i);
        }

        public void c(U41 u41, C1539Lx c1539Lx) {
            this.c = (U41) AbstractC7115ob.e(u41);
            this.d = (C1539Lx) AbstractC7115ob.e(c1539Lx);
            this.a.d(u41.f);
            f();
        }

        public boolean d() {
            this.e++;
            int i = this.f + 1;
            this.f = i;
            int[] iArr = this.b.h;
            int i2 = this.g;
            if (i != iArr[i2]) {
                return true;
            }
            this.g = i2 + 1;
            this.f = 0;
            return false;
        }

        public int e() {
            C2584Vs0 c2584Vs0;
            if (!this.b.m) {
                return 0;
            }
            W41 w41B = b();
            int length = w41B.d;
            if (length != 0) {
                c2584Vs0 = this.b.q;
            } else {
                byte[] bArr = w41B.e;
                this.j.H(bArr, bArr.length);
                C2584Vs0 c2584Vs02 = this.j;
                length = bArr.length;
                c2584Vs0 = c2584Vs02;
            }
            boolean z = this.b.n[this.e];
            C2584Vs0 c2584Vs03 = this.i;
            c2584Vs03.a[0] = (byte) ((z ? 128 : 0) | length);
            c2584Vs03.J(0);
            this.a.c(this.i, 1);
            this.a.c(c2584Vs0, length);
            if (!z) {
                return length + 1;
            }
            C2584Vs0 c2584Vs04 = this.b.q;
            int iD = c2584Vs04.D();
            c2584Vs04.K(-2);
            int i = (iD * 6) + 2;
            this.a.c(c2584Vs04, i);
            return length + 1 + i;
        }

        public void f() {
            this.b.f();
            this.e = 0;
            this.g = 0;
            this.f = 0;
            this.h = 0;
        }

        public void g(long j) {
            long jB = AbstractC6025ki.b(j);
            int i = this.e;
            while (true) {
                X41 x41 = this.b;
                if (i >= x41.f || x41.c(i) >= jB) {
                    return;
                }
                if (this.b.l[i]) {
                    this.h = i;
                }
                i++;
            }
        }

        public final void h() {
            X41 x41 = this.b;
            if (x41.m) {
                C2584Vs0 c2584Vs0 = x41.q;
                int i = b().d;
                if (i != 0) {
                    c2584Vs0.K(i);
                }
                if (this.b.n[this.e]) {
                    c2584Vs0.K(c2584Vs0.D() * 6);
                }
            }
        }

        public void i(DrmInitData drmInitData) {
            W41 w41A = this.c.a(this.b.a.a);
            this.a.d(this.c.f.b(drmInitData.c(w41A != null ? w41A.b : null)));
        }
    }

    public C6791nQ() {
        this(0);
    }

    public static Pair A(C2584Vs0 c2584Vs0) {
        c2584Vs0.J(12);
        return Pair.create(Integer.valueOf(c2584Vs0.i()), new C1539Lx(c2584Vs0.B() - 1, c2584Vs0.B(), c2584Vs0.B(), c2584Vs0.i()));
    }

    public static int B(c cVar, int i, long j, int i2, C2584Vs0 c2584Vs0, int i3) {
        int i4;
        boolean z;
        int i5;
        int i6;
        int i7;
        c2584Vs0.J(8);
        int iB = AbstractC1244Jb.b(c2584Vs0.i());
        U41 u41 = cVar.c;
        X41 x41 = cVar.b;
        C1539Lx c1539Lx = x41.a;
        x41.h[i] = c2584Vs0.B();
        long[] jArr = x41.g;
        long j2 = x41.c;
        jArr[i] = j2;
        if ((iB & 1) != 0) {
            jArr[i] = j2 + ((long) c2584Vs0.i());
        }
        boolean z2 = (iB & 4) != 0;
        int iB2 = c1539Lx.d;
        if (z2) {
            iB2 = c2584Vs0.B();
        }
        boolean z3 = (iB & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0;
        boolean z4 = (iB & AdRequest.MAX_CONTENT_URL_LENGTH) != 0;
        boolean z5 = (iB & 1024) != 0;
        boolean z6 = (iB & 2048) != 0;
        long[] jArr2 = u41.h;
        long jT = 0;
        if (jArr2 != null && jArr2.length == 1 && jArr2[0] == 0) {
            i4 = 0;
            jT = AbstractC6280lb1.T(u41.i[0], 1000L, u41.c);
        } else {
            i4 = 0;
        }
        int[] iArr = x41.i;
        int[] iArr2 = x41.j;
        long[] jArr3 = x41.k;
        boolean[] zArr = x41.l;
        boolean z7 = z6;
        boolean z8 = u41.b == 2 && (i2 & 1) != 0;
        int i8 = i3 + x41.h[i];
        boolean z9 = z2;
        long j3 = u41.c;
        int i9 = i3;
        long j4 = i > 0 ? x41.s : j;
        while (i9 < i8) {
            int iB3 = z3 ? c2584Vs0.B() : c1539Lx.b;
            int iB4 = z4 ? c2584Vs0.B() : c1539Lx.c;
            if (i9 == 0 && z9) {
                z = z8;
                i5 = iB2;
            } else if (z5) {
                z = z8;
                i5 = c2584Vs0.i();
            } else {
                z = z8;
                i5 = c1539Lx.d;
            }
            if (z7) {
                i6 = i5;
                i7 = i8;
                iArr2[i9] = (int) ((((long) c2584Vs0.i()) * 1000) / j3);
            } else {
                i6 = i5;
                i7 = i8;
                iArr2[i9] = i4;
            }
            long j5 = j4;
            jArr3[i9] = AbstractC6280lb1.T(j4, 1000L, j3) - jT;
            iArr[i9] = iB4;
            zArr[i9] = ((i6 >> 16) & 1) == 0 && (!z || i9 == 0);
            j4 = j5 + ((long) iB3);
            i9++;
            z8 = z;
            i8 = i7;
        }
        int i10 = i8;
        x41.s = j4;
        return i10;
    }

    public static void C(AbstractC1244Jb.a aVar, c cVar, long j, int i) {
        c cVar2;
        long j2;
        int i2;
        List list = aVar.R0;
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            AbstractC1244Jb.b bVar = (AbstractC1244Jb.b) list.get(i6);
            if (bVar.a == AbstractC1244Jb.A) {
                C2584Vs0 c2584Vs0 = bVar.Q0;
                c2584Vs0.J(12);
                int iB = c2584Vs0.B();
                if (iB > 0) {
                    i5 += iB;
                    i4++;
                }
            }
        }
        cVar.g = 0;
        cVar.f = 0;
        cVar.e = 0;
        cVar.b.e(i4, i5);
        int i7 = 0;
        int iB2 = 0;
        while (i3 < size) {
            AbstractC1244Jb.b bVar2 = (AbstractC1244Jb.b) list.get(i3);
            if (bVar2.a == AbstractC1244Jb.A) {
                C2584Vs0 c2584Vs02 = bVar2.Q0;
                cVar2 = cVar;
                j2 = j;
                i2 = i;
                iB2 = B(cVar2, i7, j2, i2, c2584Vs02, iB2);
                i7++;
            } else {
                cVar2 = cVar;
                j2 = j;
                i2 = i;
            }
            i3++;
            cVar = cVar2;
            j = j2;
            i = i2;
        }
    }

    public static void D(C2584Vs0 c2584Vs0, X41 x41, byte[] bArr) throws C3000Zs0 {
        c2584Vs0.J(8);
        c2584Vs0.g(bArr, 0, 16);
        if (Arrays.equals(bArr, J)) {
            t(c2584Vs0, 16, x41);
        }
    }

    private void E(long j) throws C3000Zs0 {
        while (!this.l.isEmpty() && ((AbstractC1244Jb.a) this.l.peek()).Q0 == j) {
            j((AbstractC1244Jb.a) this.l.pop());
        }
        b();
    }

    private boolean F(InterfaceC9001vJ interfaceC9001vJ) throws C3000Zs0 {
        if (this.r == 0) {
            if (!interfaceC9001vJ.d(this.j.a, 0, 8, true)) {
                return false;
            }
            this.r = 8;
            this.j.J(0);
            this.q = this.j.z();
            this.p = this.j.i();
        }
        long j = this.q;
        if (j == 1) {
            interfaceC9001vJ.g(this.j.a, 8, 8);
            this.r += 8;
            this.q = this.j.C();
        } else if (j == 0) {
            long jB = interfaceC9001vJ.b();
            if (jB == -1 && !this.l.isEmpty()) {
                jB = ((AbstractC1244Jb.a) this.l.peek()).Q0;
            }
            if (jB != -1) {
                this.q = (jB - interfaceC9001vJ.getPosition()) + ((long) this.r);
            }
        }
        if (this.q < this.r) {
            throw new C3000Zs0("Atom size less than header length (unsupported).");
        }
        long position = interfaceC9001vJ.getPosition() - ((long) this.r);
        if (this.p == AbstractC1244Jb.L) {
            int size = this.e.size();
            for (int i = 0; i < size; i++) {
                X41 x41 = ((c) this.e.valueAt(i)).b;
                x41.b = position;
                x41.d = position;
                x41.c = position;
            }
        }
        int i2 = this.p;
        if (i2 == AbstractC1244Jb.i) {
            this.y = null;
            this.t = this.q + position;
            if (!this.G) {
                this.D.b(new CO0.b(this.w, position));
                this.G = true;
            }
            this.o = 2;
            return true;
        }
        if (J(i2)) {
            long position2 = (interfaceC9001vJ.getPosition() + this.q) - 8;
            this.l.push(new AbstractC1244Jb.a(this.p, position2));
            if (this.q == this.r) {
                E(position2);
            } else {
                b();
            }
        } else if (K(this.p)) {
            if (this.r != 8) {
                throw new C3000Zs0("Leaf atom defines extended atom size (unsupported).");
            }
            long j2 = this.q;
            if (j2 > 2147483647L) {
                throw new C3000Zs0("Leaf atom with length > 2147483647 (unsupported).");
            }
            C2584Vs0 c2584Vs0 = new C2584Vs0((int) j2);
            this.s = c2584Vs0;
            System.arraycopy(this.j.a, 0, c2584Vs0.a, 0, 8);
            this.o = 1;
        } else {
            if (this.q > 2147483647L) {
                throw new C3000Zs0("Skipping atom with length > 2147483647 (unsupported).");
            }
            this.s = null;
            this.o = 1;
        }
        return true;
    }

    private static boolean J(int i) {
        return i == AbstractC1244Jb.C || i == AbstractC1244Jb.E || i == AbstractC1244Jb.F || i == AbstractC1244Jb.G || i == AbstractC1244Jb.H || i == AbstractC1244Jb.L || i == AbstractC1244Jb.M || i == AbstractC1244Jb.N || i == AbstractC1244Jb.Q;
    }

    private static boolean K(int i) {
        return i == AbstractC1244Jb.T || i == AbstractC1244Jb.S || i == AbstractC1244Jb.D || i == AbstractC1244Jb.B || i == AbstractC1244Jb.U || i == AbstractC1244Jb.x || i == AbstractC1244Jb.y || i == AbstractC1244Jb.P || i == AbstractC1244Jb.z || i == AbstractC1244Jb.A || i == AbstractC1244Jb.V || i == AbstractC1244Jb.d0 || i == AbstractC1244Jb.e0 || i == AbstractC1244Jb.i0 || i == AbstractC1244Jb.h0 || i == AbstractC1244Jb.f0 || i == AbstractC1244Jb.g0 || i == AbstractC1244Jb.R || i == AbstractC1244Jb.O || i == AbstractC1244Jb.H0;
    }

    private void b() {
        this.o = 0;
        this.r = 0;
    }

    public static DrmInitData e(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            AbstractC1244Jb.b bVar = (AbstractC1244Jb.b) list.get(i);
            if (bVar.a == AbstractC1244Jb.V) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = bVar.Q0.a;
                UUID uuidD = AbstractC9249wB0.d(bArr);
                if (uuidD != null) {
                    arrayList.add(new DrmInitData.SchemeData(uuidD, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(arrayList);
    }

    public static c g(SparseArray sparseArray) {
        int size = sparseArray.size();
        c cVar = null;
        long j = Long.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            c cVar2 = (c) sparseArray.valueAt(i);
            int i2 = cVar2.g;
            X41 x41 = cVar2.b;
            if (i2 != x41.e) {
                long j2 = x41.g[i2];
                if (j2 < j) {
                    cVar = cVar2;
                    j = j2;
                }
            }
        }
        return cVar;
    }

    public static long p(C2584Vs0 c2584Vs0) {
        c2584Vs0.J(8);
        return AbstractC1244Jb.c(c2584Vs0.i()) == 0 ? c2584Vs0.z() : c2584Vs0.C();
    }

    public static void q(AbstractC1244Jb.a aVar, SparseArray sparseArray, int i, byte[] bArr) throws C3000Zs0 {
        int size = aVar.S0.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC1244Jb.a aVar2 = (AbstractC1244Jb.a) aVar.S0.get(i2);
            if (aVar2.a == AbstractC1244Jb.M) {
                z(aVar2, sparseArray, i, bArr);
            }
        }
    }

    public static void r(C2584Vs0 c2584Vs0, X41 x41) throws C3000Zs0 {
        c2584Vs0.J(8);
        int i = c2584Vs0.i();
        if ((AbstractC1244Jb.b(i) & 1) == 1) {
            c2584Vs0.K(8);
        }
        int iB = c2584Vs0.B();
        if (iB == 1) {
            x41.d += AbstractC1244Jb.c(i) == 0 ? c2584Vs0.z() : c2584Vs0.C();
        } else {
            throw new C3000Zs0("Unexpected saio entry count: " + iB);
        }
    }

    public static void s(W41 w41, C2584Vs0 c2584Vs0, X41 x41) throws C3000Zs0 {
        int i;
        int i2 = w41.d;
        c2584Vs0.J(8);
        if ((AbstractC1244Jb.b(c2584Vs0.i()) & 1) == 1) {
            c2584Vs0.K(8);
        }
        int iX = c2584Vs0.x();
        int iB = c2584Vs0.B();
        if (iB != x41.f) {
            throw new C3000Zs0("Length mismatch: " + iB + ", " + x41.f);
        }
        if (iX == 0) {
            boolean[] zArr = x41.n;
            i = 0;
            for (int i3 = 0; i3 < iB; i3++) {
                int iX2 = c2584Vs0.x();
                i += iX2;
                zArr[i3] = iX2 > i2;
            }
        } else {
            i = iX * iB;
            Arrays.fill(x41.n, 0, iB, iX > i2);
        }
        x41.d(i);
    }

    public static void t(C2584Vs0 c2584Vs0, int i, X41 x41) throws C3000Zs0 {
        c2584Vs0.J(i + 8);
        int iB = AbstractC1244Jb.b(c2584Vs0.i());
        if ((iB & 1) != 0) {
            throw new C3000Zs0("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (iB & 2) != 0;
        int iB2 = c2584Vs0.B();
        if (iB2 == x41.f) {
            Arrays.fill(x41.n, 0, iB2, z);
            x41.d(c2584Vs0.a());
            x41.b(c2584Vs0);
        } else {
            throw new C3000Zs0("Length mismatch: " + iB2 + ", " + x41.f);
        }
    }

    public static void u(C2584Vs0 c2584Vs0, X41 x41) throws C3000Zs0 {
        t(c2584Vs0, 0, x41);
    }

    public static void v(C2584Vs0 c2584Vs0, C2584Vs0 c2584Vs02, String str, X41 x41) throws C3000Zs0 {
        byte[] bArr;
        c2584Vs0.J(8);
        int i = c2584Vs0.i();
        int i2 = c2584Vs0.i();
        int i3 = I;
        if (i2 != i3) {
            return;
        }
        if (AbstractC1244Jb.c(i) == 1) {
            c2584Vs0.K(4);
        }
        if (c2584Vs0.i() != 1) {
            throw new C3000Zs0("Entry count in sbgp != 1 (unsupported).");
        }
        c2584Vs02.J(8);
        int i4 = c2584Vs02.i();
        if (c2584Vs02.i() != i3) {
            return;
        }
        int iC = AbstractC1244Jb.c(i4);
        if (iC == 1) {
            if (c2584Vs02.z() == 0) {
                throw new C3000Zs0("Variable length description in sgpd found (unsupported)");
            }
        } else if (iC >= 2) {
            c2584Vs02.K(4);
        }
        if (c2584Vs02.z() != 1) {
            throw new C3000Zs0("Entry count in sgpd != 1 (unsupported).");
        }
        c2584Vs02.K(1);
        int iX = c2584Vs02.x();
        int i5 = (iX & 240) >> 4;
        int i6 = iX & 15;
        boolean z = c2584Vs02.x() == 1;
        if (z) {
            int iX2 = c2584Vs02.x();
            byte[] bArr2 = new byte[16];
            c2584Vs02.g(bArr2, 0, 16);
            if (z && iX2 == 0) {
                int iX3 = c2584Vs02.x();
                bArr = new byte[iX3];
                c2584Vs02.g(bArr, 0, iX3);
            } else {
                bArr = null;
            }
            byte[] bArr3 = bArr;
            x41.m = true;
            x41.o = new W41(z, str, iX2, bArr2, i5, i6, bArr3);
        }
    }

    public static Pair w(C2584Vs0 c2584Vs0, long j) throws C3000Zs0 {
        long jC;
        long jC2;
        c2584Vs0.J(8);
        int iC = AbstractC1244Jb.c(c2584Vs0.i());
        c2584Vs0.K(4);
        long jZ = c2584Vs0.z();
        if (iC == 0) {
            jC = c2584Vs0.z();
            jC2 = c2584Vs0.z();
        } else {
            jC = c2584Vs0.C();
            jC2 = c2584Vs0.C();
        }
        long j2 = j + jC2;
        long jT = AbstractC6280lb1.T(jC, 1000000L, jZ);
        c2584Vs0.K(2);
        int iD = c2584Vs0.D();
        int[] iArr = new int[iD];
        long[] jArr = new long[iD];
        long[] jArr2 = new long[iD];
        long[] jArr3 = new long[iD];
        long j3 = j2;
        long jT2 = jT;
        int i = 0;
        while (i < iD) {
            int i2 = c2584Vs0.i();
            if ((Integer.MIN_VALUE & i2) != 0) {
                throw new C3000Zs0("Unhandled indirect reference");
            }
            long jZ2 = c2584Vs0.z();
            iArr[i] = i2 & Integer.MAX_VALUE;
            jArr[i] = j3;
            jArr3[i] = jT2;
            jC += jZ2;
            long[] jArr4 = jArr3;
            jT2 = AbstractC6280lb1.T(jC, 1000000L, jZ);
            jArr2[i] = jT2 - jArr4[i];
            c2584Vs0.K(4);
            j3 += (long) iArr[i];
            i++;
            jArr3 = jArr4;
        }
        return Pair.create(Long.valueOf(jT), new C2133Rk(iArr, jArr, jArr2, jArr3));
    }

    public static long x(C2584Vs0 c2584Vs0) {
        c2584Vs0.J(8);
        return AbstractC1244Jb.c(c2584Vs0.i()) == 1 ? c2584Vs0.C() : c2584Vs0.z();
    }

    public static c y(C2584Vs0 c2584Vs0, SparseArray sparseArray, int i) {
        c2584Vs0.J(8);
        int iB = AbstractC1244Jb.b(c2584Vs0.i());
        int i2 = c2584Vs0.i();
        if ((i & 8) != 0) {
            i2 = 0;
        }
        c cVar = (c) sparseArray.get(i2);
        if (cVar == null) {
            return null;
        }
        if ((iB & 1) != 0) {
            long jC = c2584Vs0.C();
            X41 x41 = cVar.b;
            x41.c = jC;
            x41.d = jC;
        }
        C1539Lx c1539Lx = cVar.d;
        cVar.b.a = new C1539Lx((iB & 2) != 0 ? c2584Vs0.B() - 1 : c1539Lx.a, (iB & 8) != 0 ? c2584Vs0.B() : c1539Lx.b, (iB & 16) != 0 ? c2584Vs0.B() : c1539Lx.c, (iB & 32) != 0 ? c2584Vs0.B() : c1539Lx.d);
        return cVar;
    }

    public static void z(AbstractC1244Jb.a aVar, SparseArray sparseArray, int i, byte[] bArr) throws C3000Zs0 {
        c cVarY = y(aVar.g(AbstractC1244Jb.y).Q0, sparseArray, i);
        if (cVarY == null) {
            return;
        }
        X41 x41 = cVarY.b;
        long jX = x41.s;
        cVarY.f();
        int i2 = AbstractC1244Jb.x;
        if (aVar.g(i2) != null && (i & 2) == 0) {
            jX = x(aVar.g(i2).Q0);
        }
        C(aVar, cVarY, jX, i);
        W41 w41A = cVarY.c.a(x41.a.a);
        AbstractC1244Jb.b bVarG = aVar.g(AbstractC1244Jb.d0);
        if (bVarG != null) {
            s(w41A, bVarG.Q0, x41);
        }
        AbstractC1244Jb.b bVarG2 = aVar.g(AbstractC1244Jb.e0);
        if (bVarG2 != null) {
            r(bVarG2.Q0, x41);
        }
        AbstractC1244Jb.b bVarG3 = aVar.g(AbstractC1244Jb.i0);
        if (bVarG3 != null) {
            u(bVarG3.Q0, x41);
        }
        AbstractC1244Jb.b bVarG4 = aVar.g(AbstractC1244Jb.f0);
        AbstractC1244Jb.b bVarG5 = aVar.g(AbstractC1244Jb.g0);
        if (bVarG4 != null && bVarG5 != null) {
            v(bVarG4.Q0, bVarG5.Q0, w41A != null ? w41A.b : null, x41);
        }
        int size = aVar.R0.size();
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC1244Jb.b bVar = (AbstractC1244Jb.b) aVar.R0.get(i3);
            if (bVar.a == AbstractC1244Jb.h0) {
                D(bVar.Q0, x41, bArr);
            }
        }
    }

    public final void G(InterfaceC9001vJ interfaceC9001vJ) throws C3000Zs0 {
        int i = ((int) this.q) - this.r;
        C2584Vs0 c2584Vs0 = this.s;
        if (c2584Vs0 != null) {
            interfaceC9001vJ.g(c2584Vs0.a, 8, i);
            l(new AbstractC1244Jb.b(this.p, this.s), interfaceC9001vJ.getPosition());
        } else {
            interfaceC9001vJ.j(i);
        }
        E(interfaceC9001vJ.getPosition());
    }

    public final void H(InterfaceC9001vJ interfaceC9001vJ) throws C3000Zs0 {
        int size = this.e.size();
        c cVar = null;
        long j = Long.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            X41 x41 = ((c) this.e.valueAt(i)).b;
            if (x41.r) {
                long j2 = x41.d;
                if (j2 < j) {
                    cVar = (c) this.e.valueAt(i);
                    j = j2;
                }
            }
        }
        if (cVar == null) {
            this.o = 3;
            return;
        }
        int position = (int) (j - interfaceC9001vJ.getPosition());
        if (position < 0) {
            throw new C3000Zs0("Offset to encryption data was negative.");
        }
        interfaceC9001vJ.j(position);
        cVar.b.a(interfaceC9001vJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean I(InterfaceC9001vJ interfaceC9001vJ) throws C3000Zs0 {
        long j;
        boolean z;
        Z41.a aVar;
        ?? r1;
        int iB;
        int i = 4;
        int i2 = 1;
        if (this.o == 3) {
            if (this.y == null) {
                c cVarG = g(this.e);
                if (cVarG == null) {
                    int position = (int) (this.t - interfaceC9001vJ.getPosition());
                    if (position < 0) {
                        throw new C3000Zs0("Offset to end of mdat was negative.");
                    }
                    interfaceC9001vJ.j(position);
                    b();
                    return false;
                }
                int position2 = (int) (cVarG.b.g[cVarG.g] - interfaceC9001vJ.getPosition());
                if (position2 < 0) {
                    position2 = 0;
                }
                interfaceC9001vJ.j(position2);
                this.y = cVarG;
            }
            c cVar = this.y;
            int[] iArr = cVar.b.i;
            int i3 = cVar.e;
            int i4 = iArr[i3];
            this.z = i4;
            if (i3 < cVar.h) {
                interfaceC9001vJ.j(i4);
                this.y.h();
                if (!this.y.d()) {
                    this.y = null;
                }
                this.o = 3;
                return true;
            }
            if (cVar.c.g == 1) {
                this.z = i4 - 8;
                interfaceC9001vJ.j(8);
            }
            int iE = this.y.e();
            this.A = iE;
            this.z += iE;
            this.o = 4;
            this.B = 0;
        }
        c cVar2 = this.y;
        X41 x41 = cVar2.b;
        U41 u41 = cVar2.c;
        Z41 z41 = cVar2.a;
        int i5 = cVar2.e;
        int i6 = u41.j;
        if (i6 == 0) {
            j = 1000;
            z = true;
            while (true) {
                int i7 = this.A;
                int i8 = this.z;
                if (i7 >= i8) {
                    break;
                }
                this.A += z41.b(interfaceC9001vJ, i8 - i7, false);
            }
        } else {
            byte[] bArr = this.g.a;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i9 = i6 + 1;
            int i10 = 4 - i6;
            j = 1000;
            while (this.A < this.z) {
                int i11 = this.B;
                if (i11 == 0) {
                    interfaceC9001vJ.g(bArr, i10, i9);
                    this.g.J(0);
                    this.B = this.g.B() - i2;
                    this.f.J(0);
                    z41.c(this.f, i);
                    z41.c(this.g, i2);
                    this.C = this.F.length > 0 && AbstractC2248Sm0.g(u41.f.G, bArr[i]);
                    this.A += 5;
                    this.z += i10;
                } else {
                    if (this.C) {
                        this.h.G(i11);
                        interfaceC9001vJ.g(this.h.a, 0, this.B);
                        z41.c(this.h, this.B);
                        iB = this.B;
                        C2584Vs0 c2584Vs0 = this.h;
                        int iK = AbstractC2248Sm0.k(c2584Vs0.a, c2584Vs0.d());
                        this.h.J("video/hevc".equals(u41.f.G) ? 1 : 0);
                        this.h.I(iK);
                        AbstractC2339Tj.a(x41.c(i5) * 1000, this.h, this.F);
                    } else {
                        iB = z41.b(interfaceC9001vJ, i11, false);
                    }
                    this.A += iB;
                    this.B -= iB;
                    i = 4;
                    i2 = 1;
                }
            }
            z = true;
        }
        long jC = x41.c(i5) * j;
        R31 r31 = this.i;
        if (r31 != null) {
            jC = r31.a(jC);
        }
        long j2 = jC;
        boolean z2 = x41.l[i5];
        if (x41.m) {
            int i12 = (z2 ? 1 : 0) | 1073741824;
            W41 w41A = x41.o;
            if (w41A == null) {
                w41A = u41.a(x41.a.a);
            }
            aVar = w41A.c;
            r1 = i12;
        } else {
            aVar = null;
            r1 = z2;
        }
        z41.a(j2, r1 == true ? 1 : 0, this.z, 0, aVar);
        o(j2);
        if (!this.y.d()) {
            this.y = null;
        }
        this.o = 3;
        return z;
    }

    @Override // com.daaw.InterfaceC8715uJ
    public boolean c(InterfaceC9001vJ interfaceC9001vJ) {
        return DU0.b(interfaceC9001vJ);
    }

    @Override // com.daaw.InterfaceC8715uJ
    public int d(InterfaceC9001vJ interfaceC9001vJ, C2082Qx0 c2082Qx0) throws C3000Zs0 {
        while (true) {
            int i = this.o;
            if (i != 0) {
                if (i == 1) {
                    G(interfaceC9001vJ);
                } else if (i == 2) {
                    H(interfaceC9001vJ);
                } else if (I(interfaceC9001vJ)) {
                    return 0;
                }
            } else if (!F(interfaceC9001vJ)) {
                return -1;
            }
        }
    }

    @Override // com.daaw.InterfaceC8715uJ
    public void f(long j, long j2) {
        int size = this.e.size();
        for (int i = 0; i < size; i++) {
            ((c) this.e.valueAt(i)).f();
        }
        this.m.clear();
        this.u = 0;
        this.v = j2;
        this.l.clear();
        b();
    }

    public final void h() {
        int i;
        if (this.E == null) {
            Z41[] z41Arr = new Z41[2];
            this.E = z41Arr;
            Z41 z41 = this.n;
            if (z41 != null) {
                z41Arr[0] = z41;
                i = 1;
            } else {
                i = 0;
            }
            if ((this.a & 4) != 0) {
                z41Arr[i] = this.D.a(this.e.size(), 4);
                i++;
            }
            Z41[] z41Arr2 = (Z41[]) Arrays.copyOf(this.E, i);
            this.E = z41Arr2;
            for (Z41 z412 : z41Arr2) {
                z412.d(K);
            }
        }
        if (this.F == null) {
            this.F = new Z41[this.c.size()];
            for (int i2 = 0; i2 < this.F.length; i2++) {
                Z41 z41A = this.D.a(this.e.size() + 1 + i2, 3);
                z41A.d((Format) this.c.get(i2));
                this.F[i2] = z41A;
            }
        }
    }

    @Override // com.daaw.InterfaceC8715uJ
    public void i(InterfaceC9838yJ interfaceC9838yJ) {
        this.D = interfaceC9838yJ;
        U41 u41 = this.b;
        if (u41 != null) {
            c cVar = new c(interfaceC9838yJ.a(0, u41.b));
            cVar.c(this.b, new C1539Lx(0, 0, 0, 0));
            this.e.put(0, cVar);
            h();
            this.D.n();
        }
    }

    public final void j(AbstractC1244Jb.a aVar) throws C3000Zs0 {
        int i = aVar.a;
        if (i == AbstractC1244Jb.C) {
            n(aVar);
        } else if (i == AbstractC1244Jb.L) {
            m(aVar);
        } else {
            if (this.l.isEmpty()) {
                return;
            }
            ((AbstractC1244Jb.a) this.l.peek()).d(aVar);
        }
    }

    public final void k(C2584Vs0 c2584Vs0) {
        Z41[] z41Arr = this.E;
        if (z41Arr == null || z41Arr.length == 0) {
            return;
        }
        c2584Vs0.J(12);
        int iA = c2584Vs0.a();
        c2584Vs0.r();
        c2584Vs0.r();
        long jT = AbstractC6280lb1.T(c2584Vs0.z(), 1000000L, c2584Vs0.z());
        for (Z41 z41 : this.E) {
            c2584Vs0.J(12);
            z41.c(c2584Vs0, iA);
        }
        if (this.x == -9223372036854775807L) {
            this.m.addLast(new b(jT, iA));
            this.u += iA;
            return;
        }
        for (Z41 z412 : this.E) {
            z412.a(this.x + jT, 1, iA, 0, null);
        }
    }

    public final void l(AbstractC1244Jb.b bVar, long j) throws C3000Zs0 {
        if (!this.l.isEmpty()) {
            ((AbstractC1244Jb.a) this.l.peek()).e(bVar);
            return;
        }
        int i = bVar.a;
        if (i != AbstractC1244Jb.B) {
            if (i == AbstractC1244Jb.H0) {
                k(bVar.Q0);
            }
        } else {
            Pair pairW = w(bVar.Q0, j);
            this.x = ((Long) pairW.first).longValue();
            this.D.b((CO0) pairW.second);
            this.G = true;
        }
    }

    public final void m(AbstractC1244Jb.a aVar) throws C3000Zs0 {
        q(aVar, this.e, this.a, this.k);
        DrmInitData drmInitDataE = this.d != null ? null : e(aVar.R0);
        if (drmInitDataE != null) {
            int size = this.e.size();
            for (int i = 0; i < size; i++) {
                ((c) this.e.valueAt(i)).i(drmInitDataE);
            }
        }
        if (this.v != -9223372036854775807L) {
            int size2 = this.e.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((c) this.e.valueAt(i2)).g(this.v);
            }
            this.v = -9223372036854775807L;
        }
    }

    public final void n(AbstractC1244Jb.a aVar) {
        int i = 0;
        AbstractC7115ob.g(this.b == null, "Unexpected moov box.");
        DrmInitData drmInitDataE = this.d;
        if (drmInitDataE == null) {
            drmInitDataE = e(aVar.R0);
        }
        DrmInitData drmInitData = drmInitDataE;
        AbstractC1244Jb.a aVarF = aVar.f(AbstractC1244Jb.N);
        SparseArray sparseArray = new SparseArray();
        int size = aVarF.R0.size();
        long jP = -9223372036854775807L;
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC1244Jb.b bVar = (AbstractC1244Jb.b) aVarF.R0.get(i2);
            int i3 = bVar.a;
            if (i3 == AbstractC1244Jb.z) {
                Pair pairA = A(bVar.Q0);
                sparseArray.put(((Integer) pairA.first).intValue(), pairA.second);
            } else if (i3 == AbstractC1244Jb.O) {
                jP = p(bVar.Q0);
            }
        }
        SparseArray sparseArray2 = new SparseArray();
        int size2 = aVar.S0.size();
        for (int i4 = 0; i4 < size2; i4++) {
            AbstractC1244Jb.a aVar2 = (AbstractC1244Jb.a) aVar.S0.get(i4);
            if (aVar2.a == AbstractC1244Jb.E) {
                U41 u41U = AbstractC1348Kb.u(aVar2, aVar.g(AbstractC1244Jb.D), jP, drmInitData, (this.a & 16) != 0, false);
                if (u41U != null) {
                    sparseArray2.put(u41U.a, u41U);
                }
            }
        }
        int size3 = sparseArray2.size();
        if (this.e.size() != 0) {
            AbstractC7115ob.f(this.e.size() == size3);
            while (i < size3) {
                U41 u41 = (U41) sparseArray2.valueAt(i);
                ((c) this.e.get(u41.a)).c(u41, (C1539Lx) sparseArray.get(u41.a));
                i++;
            }
            return;
        }
        while (i < size3) {
            U41 u412 = (U41) sparseArray2.valueAt(i);
            c cVar = new c(this.D.a(i, u412.b));
            cVar.c(u412, (C1539Lx) sparseArray.get(u412.a));
            this.e.put(u412.a, cVar);
            this.w = Math.max(this.w, u412.e);
            i++;
        }
        h();
        this.D.n();
    }

    public final void o(long j) {
        while (!this.m.isEmpty()) {
            b bVar = (b) this.m.removeFirst();
            this.u -= bVar.b;
            for (Z41 z41 : this.E) {
                z41.a(bVar.a + j, 1, bVar.b, this.u, null);
            }
        }
    }

    public C6791nQ(int i) {
        this(i, null);
    }

    public C6791nQ(int i, R31 r31) {
        this(i, r31, null, null);
    }

    public C6791nQ(int i, R31 r31, U41 u41, DrmInitData drmInitData) {
        this(i, r31, u41, drmInitData, Collections.EMPTY_LIST);
    }

    public C6791nQ(int i, R31 r31, U41 u41, DrmInitData drmInitData, List list) {
        this(i, r31, u41, drmInitData, list, null);
    }

    public C6791nQ(int i, R31 r31, U41 u41, DrmInitData drmInitData, List list, Z41 z41) {
        this.a = i | (u41 != null ? 8 : 0);
        this.i = r31;
        this.b = u41;
        this.d = drmInitData;
        this.c = DesugarCollections.unmodifiableList(list);
        this.n = z41;
        this.j = new C2584Vs0(16);
        this.f = new C2584Vs0(AbstractC2248Sm0.a);
        this.g = new C2584Vs0(5);
        this.h = new C2584Vs0();
        this.k = new byte[16];
        this.l = new ArrayDeque();
        this.m = new ArrayDeque();
        this.e = new SparseArray();
        this.w = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.x = -9223372036854775807L;
        b();
    }

    @Override // com.daaw.InterfaceC8715uJ
    public void a() {
    }
}
