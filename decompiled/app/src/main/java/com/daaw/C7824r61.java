package com.daaw;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.daaw.CO0;
import com.daaw.InterfaceC8103s61;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.r61, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7824r61 implements InterfaceC8715uJ {
    public static final InterfaceC10117zJ m = new a();
    public static final long n = AbstractC6280lb1.v("AC-3");
    public static final long o = AbstractC6280lb1.v("EAC3");
    public static final long p = AbstractC6280lb1.v("HEVC");
    public final int a;
    public final List b;
    public final C2584Vs0 c;
    public final SparseIntArray d;
    public final InterfaceC8103s61.c e;
    public final SparseArray f;
    public final SparseBooleanArray g;
    public InterfaceC9838yJ h;
    public int i;
    public boolean j;
    public InterfaceC8103s61 k;
    public int l;

    /* JADX INFO: renamed from: com.daaw.r61$a */
    public static class a implements InterfaceC10117zJ {
        @Override // com.daaw.InterfaceC10117zJ
        public InterfaceC8715uJ[] a() {
            return new InterfaceC8715uJ[]{new C7824r61()};
        }
    }

    public C7824r61() {
        this(0);
    }

    public static /* synthetic */ int j(C7824r61 c7824r61) {
        int i = c7824r61.i;
        c7824r61.i = i + 1;
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
    
        r1 = r1 + 1;
     */
    @Override // com.daaw.InterfaceC8715uJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean c(com.daaw.InterfaceC9001vJ r7) {
        /*
            r6 = this;
            com.daaw.Vs0 r0 = r6.c
            byte[] r0 = r0.a
            r1 = 940(0x3ac, float:1.317E-42)
            r2 = 0
            r7.k(r0, r2, r1)
            r1 = 0
        Lb:
            r3 = 188(0xbc, float:2.63E-43)
            if (r1 >= r3) goto L27
            r3 = 0
        L10:
            r4 = 5
            if (r3 != r4) goto L18
            r7.j(r1)
            r7 = 1
            return r7
        L18:
            int r4 = r3 * 188
            int r4 = r4 + r1
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L24
            int r1 = r1 + 1
            goto Lb
        L24:
            int r3 = r3 + 1
            goto L10
        L27:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C7824r61.c(com.daaw.vJ):boolean");
    }

    @Override // com.daaw.InterfaceC8715uJ
    public int d(InterfaceC9001vJ interfaceC9001vJ, C2082Qx0 c2082Qx0) throws C3000Zs0 {
        C2584Vs0 c2584Vs0 = this.c;
        byte[] bArr = c2584Vs0.a;
        if (9400 - c2584Vs0.c() < 188) {
            int iA = this.c.a();
            if (iA > 0) {
                System.arraycopy(bArr, this.c.c(), bArr, 0, iA);
            }
            this.c.H(bArr, iA);
        }
        while (this.c.a() < 188) {
            int iD = this.c.d();
            int iC = interfaceC9001vJ.c(bArr, iD, 9400 - iD);
            if (iC == -1) {
                return -1;
            }
            this.c.I(iD + iC);
        }
        int iD2 = this.c.d();
        int iC2 = this.c.c();
        int i = iC2;
        while (i < iD2 && bArr[i] != 71) {
            i++;
        }
        this.c.J(i);
        int i2 = i + 188;
        if (i2 > iD2) {
            int i3 = this.l + (i - iC2);
            this.l = i3;
            if (this.a != 2 || i3 <= 376) {
                return 0;
            }
            throw new C3000Zs0("Cannot find sync byte. Most likely not a Transport Stream.");
        }
        this.l = 0;
        int i4 = this.c.i();
        if ((8388608 & i4) != 0) {
            this.c.J(i2);
            return 0;
        }
        boolean z = (4194304 & i4) != 0;
        int i5 = (2096896 & i4) >> 8;
        boolean z2 = (i4 & 32) != 0;
        InterfaceC8103s61 interfaceC8103s61 = (i4 & 16) != 0 ? (InterfaceC8103s61) this.f.get(i5) : null;
        if (interfaceC8103s61 == null) {
            this.c.J(i2);
            return 0;
        }
        if (this.a != 2) {
            int i6 = i4 & 15;
            int i7 = this.d.get(i5, i6 - 1);
            this.d.put(i5, i6);
            if (i7 == i6) {
                this.c.J(i2);
                return 0;
            }
            if (i6 != ((i7 + 1) & 15)) {
                interfaceC8103s61.b();
            }
        }
        if (z2) {
            this.c.K(this.c.x());
        }
        this.c.I(i2);
        interfaceC8103s61.a(this.c, z);
        this.c.I(iD2);
        this.c.J(i2);
        return 0;
    }

    @Override // com.daaw.InterfaceC8715uJ
    public void f(long j, long j2) {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            ((R31) this.b.get(i)).g();
        }
        this.c.F();
        this.d.clear();
        v();
        this.l = 0;
    }

    @Override // com.daaw.InterfaceC8715uJ
    public void i(InterfaceC9838yJ interfaceC9838yJ) {
        this.h = interfaceC9838yJ;
        interfaceC9838yJ.b(new CO0.b(-9223372036854775807L));
    }

    public final void v() {
        this.g.clear();
        this.f.clear();
        SparseArray sparseArrayB = this.e.b();
        int size = sparseArrayB.size();
        for (int i = 0; i < size; i++) {
            this.f.put(sparseArrayB.keyAt(i), sparseArrayB.valueAt(i));
        }
        this.f.put(0, new C9022vO0(new b()));
        this.k = null;
    }

    public C7824r61(int i) {
        this(1, i);
    }

    public C7824r61(int i, int i2) {
        this(i, new R31(0L), new C6389ly(i2));
    }

    public C7824r61(int i, R31 r31, InterfaceC8103s61.c cVar) {
        this.e = (InterfaceC8103s61.c) AbstractC7115ob.e(cVar);
        this.a = i;
        if (i != 1 && i != 2) {
            ArrayList arrayList = new ArrayList();
            this.b = arrayList;
            arrayList.add(r31);
        } else {
            this.b = Collections.singletonList(r31);
        }
        this.c = new C2584Vs0(new byte[9400], 0);
        this.g = new SparseBooleanArray();
        this.f = new SparseArray();
        this.d = new SparseIntArray();
        v();
    }

    @Override // com.daaw.InterfaceC8715uJ
    public void a() {
    }

    /* JADX INFO: renamed from: com.daaw.r61$b */
    public class b implements InterfaceC8736uO0 {
        public final C2480Us0 a = new C2480Us0(new byte[4]);

        public b() {
        }

        @Override // com.daaw.InterfaceC8736uO0
        public void a(C2584Vs0 c2584Vs0) {
            if (c2584Vs0.x() != 0) {
                return;
            }
            c2584Vs0.K(7);
            int iA = c2584Vs0.a() / 4;
            for (int i = 0; i < iA; i++) {
                c2584Vs0.f(this.a, 4);
                int iH = this.a.h(16);
                this.a.o(3);
                if (iH == 0) {
                    this.a.o(13);
                } else {
                    int iH2 = this.a.h(13);
                    C7824r61.this.f.put(iH2, new C9022vO0(C7824r61.this.new c(iH2)));
                    C7824r61.j(C7824r61.this);
                }
            }
            if (C7824r61.this.a != 2) {
                C7824r61.this.f.remove(0);
            }
        }

        @Override // com.daaw.InterfaceC8736uO0
        public void c(R31 r31, InterfaceC9838yJ interfaceC9838yJ, InterfaceC8103s61.d dVar) {
        }
    }

    /* JADX INFO: renamed from: com.daaw.r61$c */
    public class c implements InterfaceC8736uO0 {
        public final C2480Us0 a = new C2480Us0(new byte[5]);
        public final SparseArray b = new SparseArray();
        public final SparseIntArray c = new SparseIntArray();
        public final int d;

        public c(int i) {
            this.d = i;
        }

        @Override // com.daaw.InterfaceC8736uO0
        public void a(C2584Vs0 c2584Vs0) {
            R31 r31;
            if (c2584Vs0.x() != 2) {
                return;
            }
            if (C7824r61.this.a == 1 || C7824r61.this.a == 2 || C7824r61.this.i == 1) {
                r31 = (R31) C7824r61.this.b.get(0);
            } else {
                r31 = new R31(((R31) C7824r61.this.b.get(0)).c());
                C7824r61.this.b.add(r31);
            }
            c2584Vs0.K(2);
            int iD = c2584Vs0.D();
            int i = 5;
            c2584Vs0.K(5);
            c2584Vs0.f(this.a, 2);
            int i2 = 4;
            this.a.o(4);
            c2584Vs0.K(this.a.h(12));
            if (C7824r61.this.a == 2 && C7824r61.this.k == null) {
                InterfaceC8103s61.b bVar = new InterfaceC8103s61.b(21, null, null, new byte[0]);
                C7824r61 c7824r61 = C7824r61.this;
                c7824r61.k = c7824r61.e.a(21, bVar);
                C7824r61.this.k.c(r31, C7824r61.this.h, new InterfaceC8103s61.d(iD, 21, 8192));
            }
            this.b.clear();
            this.c.clear();
            int iA = c2584Vs0.a();
            while (iA > 0) {
                c2584Vs0.f(this.a, i);
                int iH = this.a.h(8);
                this.a.o(3);
                int iH2 = this.a.h(13);
                this.a.o(i2);
                int iH3 = this.a.h(12);
                InterfaceC8103s61.b bVarB = b(c2584Vs0, iH3);
                if (iH == 6) {
                    iH = bVarB.a;
                }
                iA -= iH3 + 5;
                int i3 = C7824r61.this.a == 2 ? iH : iH2;
                if (!C7824r61.this.g.get(i3)) {
                    InterfaceC8103s61 interfaceC8103s61A = (C7824r61.this.a == 2 && iH == 21) ? C7824r61.this.k : C7824r61.this.e.a(iH, bVarB);
                    if (C7824r61.this.a != 2 || iH2 < this.c.get(i3, 8192)) {
                        this.c.put(i3, iH2);
                        this.b.put(i3, interfaceC8103s61A);
                    }
                }
                i = 5;
                i2 = 4;
            }
            int size = this.c.size();
            for (int i4 = 0; i4 < size; i4++) {
                int iKeyAt = this.c.keyAt(i4);
                C7824r61.this.g.put(iKeyAt, true);
                InterfaceC8103s61 interfaceC8103s61 = (InterfaceC8103s61) this.b.valueAt(i4);
                if (interfaceC8103s61 != null) {
                    if (interfaceC8103s61 != C7824r61.this.k) {
                        interfaceC8103s61.c(r31, C7824r61.this.h, new InterfaceC8103s61.d(iD, iKeyAt, 8192));
                    }
                    C7824r61.this.f.put(this.c.valueAt(i4), interfaceC8103s61);
                }
            }
            if (C7824r61.this.a == 2) {
                if (C7824r61.this.j) {
                    return;
                }
                C7824r61.this.h.n();
                C7824r61.this.i = 0;
                C7824r61.this.j = true;
                return;
            }
            C7824r61.this.f.remove(this.d);
            C7824r61 c7824r612 = C7824r61.this;
            c7824r612.i = c7824r612.a != 1 ? C7824r61.this.i - 1 : 0;
            if (C7824r61.this.i == 0) {
                C7824r61.this.h.n();
                C7824r61.this.j = true;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.daaw.InterfaceC8103s61.b b(com.daaw.C2584Vs0 r13, int r14) {
            /*
                r12 = this;
                int r0 = r13.c()
                int r14 = r14 + r0
                r1 = -1
                r2 = 0
                r3 = r2
            L8:
                int r4 = r13.c()
                if (r4 >= r14) goto L9e
                int r4 = r13.x()
                int r5 = r13.x()
                int r6 = r13.c()
                int r6 = r6 + r5
                r5 = 5
                r7 = 135(0x87, float:1.89E-43)
                r8 = 129(0x81, float:1.81E-43)
                if (r4 != r5) goto L43
                long r4 = r13.z()
                long r9 = com.daaw.C7824r61.u()
                int r11 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r11 != 0) goto L2f
                goto L47
            L2f:
                long r8 = com.daaw.C7824r61.g()
                int r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
                if (r10 != 0) goto L38
                goto L4e
            L38:
                long r7 = com.daaw.C7824r61.k()
                int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
                if (r9 != 0) goto L94
                r1 = 36
                goto L94
            L43:
                r5 = 106(0x6a, float:1.49E-43)
                if (r4 != r5) goto L4a
            L47:
                r1 = 129(0x81, float:1.81E-43)
                goto L94
            L4a:
                r5 = 122(0x7a, float:1.71E-43)
                if (r4 != r5) goto L51
            L4e:
                r1 = 135(0x87, float:1.89E-43)
                goto L94
            L51:
                r5 = 123(0x7b, float:1.72E-43)
                if (r4 != r5) goto L58
                r1 = 138(0x8a, float:1.93E-43)
                goto L94
            L58:
                r5 = 10
                r7 = 3
                if (r4 != r5) goto L66
                java.lang.String r2 = r13.u(r7)
                java.lang.String r2 = r2.trim()
                goto L94
            L66:
                r5 = 89
                if (r4 != r5) goto L94
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
            L6f:
                int r3 = r13.c()
                if (r3 >= r6) goto L91
                java.lang.String r3 = r13.u(r7)
                java.lang.String r3 = r3.trim()
                int r4 = r13.x()
                r8 = 4
                byte[] r9 = new byte[r8]
                r10 = 0
                r13.g(r9, r10, r8)
                com.daaw.s61$a r8 = new com.daaw.s61$a
                r8.<init>(r3, r4, r9)
                r1.add(r8)
                goto L6f
            L91:
                r3 = r1
                r1 = 89
            L94:
                int r4 = r13.c()
                int r6 = r6 - r4
                r13.K(r6)
                goto L8
            L9e:
                r13.J(r14)
                com.daaw.s61$b r4 = new com.daaw.s61$b
                byte[] r13 = r13.a
                byte[] r13 = java.util.Arrays.copyOfRange(r13, r0, r14)
                r4.<init>(r1, r2, r3, r13)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.C7824r61.c.b(com.daaw.Vs0, int):com.daaw.s61$b");
        }

        @Override // com.daaw.InterfaceC8736uO0
        public void c(R31 r31, InterfaceC9838yJ interfaceC9838yJ, InterfaceC8103s61.d dVar) {
        }
    }
}
