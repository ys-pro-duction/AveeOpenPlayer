package com.daaw;

import com.daaw.C0833Fc0;
import com.daaw.InterfaceC1896Pi0;
import com.daaw.PP0;
import com.google.android.exoplayer2.Format;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Sk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2239Sk implements QM0, PP0, C0833Fc0.a, C0833Fc0.d {
    public final int B;
    public final int[] C;
    public final Format[] D;
    public final boolean[] E;
    public final InterfaceC2343Tk F;
    public final PP0.a G;
    public final InterfaceC1896Pi0.a H;
    public final int I;
    public final C0833Fc0 J = new C0833Fc0("Loader:ChunkSampleStream");
    public final C2029Qk K = new C2029Qk();
    public final ArrayList L;
    public final List M;
    public final OM0 N;
    public final OM0[] O;
    public final C0519Ce P;
    public Format Q;
    public b R;
    public long S;
    public long T;
    public long U;
    public boolean V;

    /* JADX INFO: renamed from: com.daaw.Sk$b */
    public interface b {
        void b(C2239Sk c2239Sk);
    }

    public C2239Sk(int i, int[] iArr, Format[] formatArr, InterfaceC2343Tk interfaceC2343Tk, PP0.a aVar, O3 o3, long j, int i2, InterfaceC1896Pi0.a aVar2) {
        this.B = i;
        this.C = iArr;
        this.D = formatArr;
        this.F = interfaceC2343Tk;
        this.G = aVar;
        this.H = aVar2;
        this.I = i2;
        ArrayList arrayList = new ArrayList();
        this.L = arrayList;
        this.M = DesugarCollections.unmodifiableList(arrayList);
        int i3 = 0;
        int length = iArr == null ? 0 : iArr.length;
        this.O = new OM0[length];
        this.E = new boolean[length];
        int i4 = length + 1;
        int[] iArr2 = new int[i4];
        OM0[] om0Arr = new OM0[i4];
        OM0 om0 = new OM0(o3);
        this.N = om0;
        iArr2[0] = i;
        om0Arr[0] = om0;
        while (i3 < length) {
            OM0 om02 = new OM0(o3);
            this.O[i3] = om02;
            int i5 = i3 + 1;
            om0Arr[i5] = om02;
            iArr2[i5] = iArr[i3];
            i3 = i5;
        }
        this.P = new C0519Ce(iArr2, om0Arr);
        this.S = j;
        this.T = j;
    }

    public final AbstractC0415Be A(int i) {
        AbstractC0415Be abstractC0415Be = (AbstractC0415Be) this.L.get(i);
        ArrayList arrayList = this.L;
        AbstractC6280lb1.R(arrayList, i, arrayList.size());
        int i2 = 0;
        this.N.m(abstractC0415Be.g(0));
        while (true) {
            OM0[] om0Arr = this.O;
            if (i2 >= om0Arr.length) {
                return abstractC0415Be;
            }
            OM0 om0 = om0Arr[i2];
            i2++;
            om0.m(abstractC0415Be.g(i2));
        }
    }

    public InterfaceC2343Tk B() {
        return this.F;
    }

    public final AbstractC0415Be C() {
        return (AbstractC0415Be) this.L.get(r0.size() - 1);
    }

    public final boolean D(int i) {
        int iR;
        AbstractC0415Be abstractC0415Be = (AbstractC0415Be) this.L.get(i);
        if (this.N.r() > abstractC0415Be.g(0)) {
            return true;
        }
        int i2 = 0;
        do {
            OM0[] om0Arr = this.O;
            if (i2 >= om0Arr.length) {
                return false;
            }
            iR = om0Arr[i2].r();
            i2++;
        } while (iR <= abstractC0415Be.g(i2));
        return true;
    }

    public final boolean E(AbstractC1799Ok abstractC1799Ok) {
        return abstractC1799Ok instanceof AbstractC0415Be;
    }

    public boolean F() {
        return this.S != -9223372036854775807L;
    }

    public final void G(int i) {
        AbstractC0415Be abstractC0415Be = (AbstractC0415Be) this.L.get(i);
        Format format = abstractC0415Be.c;
        if (!format.equals(this.Q)) {
            this.H.c(this.B, format, abstractC0415Be.d, abstractC0415Be.e, abstractC0415Be.f);
        }
        this.Q = format;
    }

    public final void H(int i, int i2) {
        int iL = L(i - i2, 0);
        int iL2 = i2 == 1 ? iL : L(i - 1, iL);
        while (iL <= iL2) {
            G(iL);
            iL++;
        }
    }

    @Override // com.daaw.C0833Fc0.a
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void p(AbstractC1799Ok abstractC1799Ok, long j, long j2, boolean z) {
        this.H.e(abstractC1799Ok.a, abstractC1799Ok.b, this.B, abstractC1799Ok.c, abstractC1799Ok.d, abstractC1799Ok.e, abstractC1799Ok.f, abstractC1799Ok.g, j, j2, abstractC1799Ok.c());
        if (z) {
            return;
        }
        this.N.C();
        for (OM0 om0 : this.O) {
            om0.C();
        }
        this.G.n(this);
    }

    @Override // com.daaw.C0833Fc0.a
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void s(AbstractC1799Ok abstractC1799Ok, long j, long j2) {
        this.F.f(abstractC1799Ok);
        this.H.h(abstractC1799Ok.a, abstractC1799Ok.b, this.B, abstractC1799Ok.c, abstractC1799Ok.d, abstractC1799Ok.e, abstractC1799Ok.f, abstractC1799Ok.g, j, j2, abstractC1799Ok.c());
        this.G.n(this);
    }

    @Override // com.daaw.C0833Fc0.a
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public int k(AbstractC1799Ok abstractC1799Ok, long j, long j2, IOException iOException) {
        boolean z;
        long jC = abstractC1799Ok.c();
        boolean zE = E(abstractC1799Ok);
        int size = this.L.size() - 1;
        boolean z2 = (jC != 0 && zE && D(size)) ? false : true;
        if (this.F.g(abstractC1799Ok, z2, iOException) && z2) {
            if (zE) {
                AbstractC7115ob.f(A(size) == abstractC1799Ok);
                if (this.L.isEmpty()) {
                    this.S = this.T;
                }
            }
            z = true;
        } else {
            z = false;
        }
        this.H.k(abstractC1799Ok.a, abstractC1799Ok.b, this.B, abstractC1799Ok.c, abstractC1799Ok.d, abstractC1799Ok.e, abstractC1799Ok.f, abstractC1799Ok.g, j, j2, jC, iOException, z);
        if (!z) {
            return 0;
        }
        this.G.n(this);
        return 2;
    }

    public final int L(int i, int i2) {
        do {
            i2++;
            if (i2 >= this.L.size()) {
                return this.L.size() - 1;
            }
        } while (((AbstractC0415Be) this.L.get(i2)).g(0) <= i);
        return i2 - 1;
    }

    public void M() {
        N(null);
    }

    public void N(b bVar) {
        this.R = bVar;
        this.N.k();
        for (OM0 om0 : this.O) {
            om0.k();
        }
        this.J.j(this);
    }

    public void O(long j) {
        AbstractC0415Be abstractC0415Be;
        boolean zF;
        this.T = j;
        this.N.E();
        if (F()) {
            zF = false;
        } else {
            for (int i = 0; i < this.L.size(); i++) {
                abstractC0415Be = (AbstractC0415Be) this.L.get(i);
                long j2 = abstractC0415Be.f;
                if (j2 == j && abstractC0415Be.j == -9223372036854775807L) {
                    break;
                } else {
                    if (j2 > j) {
                        break;
                    }
                }
            }
            abstractC0415Be = null;
            if (abstractC0415Be != null) {
                zF = this.N.F(abstractC0415Be.g(0));
                this.U = Long.MIN_VALUE;
            } else {
                zF = this.N.f(j, true, (j > c() ? 1 : (j == c() ? 0 : -1)) < 0) != -1;
                this.U = this.T;
            }
        }
        if (zF) {
            for (OM0 om0 : this.O) {
                om0.E();
                om0.f(j, true, false);
            }
            return;
        }
        this.S = j;
        this.V = false;
        this.L.clear();
        if (this.J.g()) {
            this.J.f();
            return;
        }
        this.N.C();
        for (OM0 om02 : this.O) {
            om02.C();
        }
    }

    public a P(long j, int i) {
        for (int i2 = 0; i2 < this.O.length; i2++) {
            if (this.C[i2] == i) {
                AbstractC7115ob.f(!this.E[i2]);
                this.E[i2] = true;
                this.O[i2].E();
                this.O[i2].f(j, true, true);
                return new a(this, this.O[i2], i2);
            }
        }
        throw new IllegalStateException();
    }

    @Override // com.daaw.QM0
    public boolean a() {
        if (this.V) {
            return true;
        }
        return !F() && this.N.u();
    }

    @Override // com.daaw.QM0
    public void b() throws IOException {
        this.J.b();
        if (this.J.g()) {
            return;
        }
        this.F.b();
    }

    @Override // com.daaw.PP0
    public long c() {
        if (F()) {
            return this.S;
        }
        if (this.V) {
            return Long.MIN_VALUE;
        }
        return C().g;
    }

    @Override // com.daaw.PP0
    public boolean d(long j) {
        AbstractC0415Be abstractC0415BeC;
        long j2;
        if (this.V || this.J.g()) {
            return false;
        }
        boolean zF = F();
        if (zF) {
            j2 = this.S;
            abstractC0415BeC = null;
        } else {
            abstractC0415BeC = C();
            j2 = abstractC0415BeC.g;
        }
        this.F.i(abstractC0415BeC, j, j2, this.K);
        C2029Qk c2029Qk = this.K;
        boolean z = c2029Qk.b;
        AbstractC1799Ok abstractC1799Ok = c2029Qk.a;
        c2029Qk.a();
        if (z) {
            this.S = -9223372036854775807L;
            this.V = true;
            return true;
        }
        if (abstractC1799Ok == null) {
            return false;
        }
        if (E(abstractC1799Ok)) {
            AbstractC0415Be abstractC0415Be = (AbstractC0415Be) abstractC1799Ok;
            if (zF) {
                long j3 = abstractC0415Be.f;
                long j4 = this.S;
                if (j3 == j4) {
                    j4 = Long.MIN_VALUE;
                }
                this.U = j4;
                this.S = -9223372036854775807L;
            }
            abstractC0415Be.i(this.P);
            this.L.add(abstractC0415Be);
        }
        this.H.n(abstractC1799Ok.a, abstractC1799Ok.b, this.B, abstractC1799Ok.c, abstractC1799Ok.d, abstractC1799Ok.e, abstractC1799Ok.f, abstractC1799Ok.g, this.J.k(abstractC1799Ok, this, this.I));
        return true;
    }

    public long e(long j, DO0 do0) {
        return this.F.e(j, do0);
    }

    @Override // com.daaw.PP0
    public long f() {
        if (this.V) {
            return Long.MIN_VALUE;
        }
        if (F()) {
            return this.S;
        }
        long jMax = this.T;
        AbstractC0415Be abstractC0415BeC = C();
        if (!abstractC0415BeC.f()) {
            if (this.L.size() > 1) {
                abstractC0415BeC = (AbstractC0415Be) this.L.get(r2.size() - 2);
            } else {
                abstractC0415BeC = null;
            }
        }
        if (abstractC0415BeC != null) {
            jMax = Math.max(jMax, abstractC0415BeC.g);
        }
        return Math.max(jMax, this.N.q());
    }

    @Override // com.daaw.PP0
    public void g(long j) {
        int size;
        int iH;
        if (this.J.g() || F() || (size = this.L.size()) <= (iH = this.F.h(j, this.M))) {
            return;
        }
        while (true) {
            if (iH >= size) {
                iH = size;
                break;
            } else if (!D(iH)) {
                break;
            } else {
                iH++;
            }
        }
        if (iH == size) {
            return;
        }
        long j2 = C().g;
        AbstractC0415Be abstractC0415BeA = A(iH);
        if (this.L.isEmpty()) {
            this.S = this.T;
        }
        this.V = false;
        this.H.v(this.B, abstractC0415BeA.f, j2);
    }

    @Override // com.daaw.C0833Fc0.d
    public void h() {
        this.N.C();
        for (OM0 om0 : this.O) {
            om0.C();
        }
        b bVar = this.R;
        if (bVar != null) {
            bVar.b(this);
        }
    }

    @Override // com.daaw.QM0
    public int j(C5103hP c5103hP, C1016Gw c1016Gw, boolean z) {
        if (F()) {
            return -3;
        }
        int iY = this.N.y(c5103hP, c1016Gw, z, this.V, this.U);
        if (iY == -4) {
            H(this.N.r(), 1);
        }
        return iY;
    }

    @Override // com.daaw.QM0
    public int n(long j) {
        int iG = 0;
        if (F()) {
            return 0;
        }
        if (!this.V || j <= this.N.q()) {
            int iF = this.N.f(j, true, true);
            if (iF != -1) {
                iG = iF;
            }
        } else {
            iG = this.N.g();
        }
        if (iG > 0) {
            H(this.N.r(), iG);
        }
        return iG;
    }

    public void t(long j, boolean z) {
        int iO = this.N.o();
        this.N.j(j, z, true);
        int iO2 = this.N.o();
        if (iO2 <= iO) {
            return;
        }
        long jP = this.N.p();
        int i = 0;
        while (true) {
            OM0[] om0Arr = this.O;
            if (i >= om0Arr.length) {
                z(iO2);
                return;
            } else {
                om0Arr[i].j(jP, z, this.E[i]);
                i++;
            }
        }
    }

    public final void z(int i) {
        int iL = L(i, 0);
        if (iL > 0) {
            AbstractC6280lb1.R(this.L, 0, iL);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Sk$a */
    public final class a implements QM0 {
        public final C2239Sk B;
        public final OM0 C;
        public final int D;
        public boolean E;

        public a(C2239Sk c2239Sk, OM0 om0, int i) {
            this.B = c2239Sk;
            this.C = om0;
            this.D = i;
        }

        @Override // com.daaw.QM0
        public boolean a() {
            C2239Sk c2239Sk = C2239Sk.this;
            if (c2239Sk.V) {
                return true;
            }
            return !c2239Sk.F() && this.C.u();
        }

        public final void c() {
            if (this.E) {
                return;
            }
            C2239Sk.this.H.c(C2239Sk.this.C[this.D], C2239Sk.this.D[this.D], 0, null, C2239Sk.this.T);
            this.E = true;
        }

        public void d() {
            AbstractC7115ob.f(C2239Sk.this.E[this.D]);
            C2239Sk.this.E[this.D] = false;
        }

        @Override // com.daaw.QM0
        public int j(C5103hP c5103hP, C1016Gw c1016Gw, boolean z) {
            if (C2239Sk.this.F()) {
                return -3;
            }
            OM0 om0 = this.C;
            C2239Sk c2239Sk = C2239Sk.this;
            int iY = om0.y(c5103hP, c1016Gw, z, c2239Sk.V, c2239Sk.U);
            if (iY == -4) {
                c();
            }
            return iY;
        }

        @Override // com.daaw.QM0
        public int n(long j) {
            int iF;
            if (!C2239Sk.this.V || j <= this.C.q()) {
                iF = this.C.f(j, true, true);
                if (iF == -1) {
                    iF = 0;
                }
            } else {
                iF = this.C.g();
            }
            if (iF > 0) {
                c();
            }
            return iF;
        }

        @Override // com.daaw.QM0
        public void b() {
        }
    }
}
