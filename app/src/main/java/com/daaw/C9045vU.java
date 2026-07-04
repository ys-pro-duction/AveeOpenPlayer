package com.daaw;

import com.daaw.InterfaceC8103s61;
import com.google.android.exoplayer2.Format;
import java.util.Collections;

/* JADX INFO: renamed from: com.daaw.vU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C9045vU implements InterfaceC9543xF {
    public final C4825gP0 a;
    public String b;
    public Z41 c;
    public a d;
    public boolean e;
    public long l;
    public long m;
    public final boolean[] f = new boolean[3];
    public final C2142Rm0 g = new C2142Rm0(32, 128);
    public final C2142Rm0 h = new C2142Rm0(33, 128);
    public final C2142Rm0 i = new C2142Rm0(34, 128);
    public final C2142Rm0 j = new C2142Rm0(39, 128);
    public final C2142Rm0 k = new C2142Rm0(40, 128);
    public final C2584Vs0 n = new C2584Vs0();

    /* JADX INFO: renamed from: com.daaw.vU$a */
    public static final class a {
        public final Z41 a;
        public long b;
        public boolean c;
        public int d;
        public long e;
        public boolean f;
        public boolean g;
        public boolean h;
        public boolean i;
        public boolean j;
        public long k;
        public long l;
        public boolean m;

        public a(Z41 z41) {
            this.a = z41;
        }

        public void a(long j, int i) {
            if (this.j && this.g) {
                this.m = this.c;
                this.j = false;
            } else if (this.h || this.g) {
                if (this.i) {
                    b(i + ((int) (j - this.b)));
                }
                this.k = this.b;
                this.l = this.e;
                this.i = true;
                this.m = this.c;
            }
        }

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
        public final void b(int i) {
            boolean z = this.m;
            this.a.a(this.l, z ? 1 : 0, (int) (this.b - this.k), i, null);
        }

        public void c(byte[] bArr, int i, int i2) {
            if (this.f) {
                int i3 = this.d;
                int i4 = (i + 2) - i3;
                if (i4 >= i2) {
                    this.d = i3 + (i2 - i);
                } else {
                    this.g = (bArr[i4] & 128) != 0;
                    this.f = false;
                }
            }
        }

        public void d() {
            this.f = false;
            this.g = false;
            this.h = false;
            this.i = false;
            this.j = false;
        }

        public void e(long j, int i, int i2, long j2) {
            this.g = false;
            this.h = false;
            this.e = j2;
            this.d = 0;
            this.b = j;
            if (i2 >= 32) {
                if (!this.j && this.i) {
                    b(i);
                    this.i = false;
                }
                if (i2 <= 34) {
                    this.h = !this.j;
                    this.j = true;
                }
            }
            boolean z = i2 >= 16 && i2 <= 21;
            this.c = z;
            this.f = z || i2 <= 9;
        }
    }

    public C9045vU(C4825gP0 c4825gP0) {
        this.a = c4825gP0;
    }

    private void f(long j, int i, int i2, long j2) {
        if (this.e) {
            this.d.a(j, i);
        } else {
            this.g.b(i2);
            this.h.b(i2);
            this.i.b(i2);
            if (this.g.c() && this.h.c() && this.i.c()) {
                this.c.d(h(this.b, this.g, this.h, this.i));
                this.e = true;
            }
        }
        if (this.j.b(i2)) {
            C2142Rm0 c2142Rm0 = this.j;
            this.n.H(this.j.d, AbstractC2248Sm0.k(c2142Rm0.d, c2142Rm0.e));
            this.n.K(5);
            this.a.a(j2, this.n);
        }
        if (this.k.b(i2)) {
            C2142Rm0 c2142Rm02 = this.k;
            this.n.H(this.k.d, AbstractC2248Sm0.k(c2142Rm02.d, c2142Rm02.e));
            this.n.K(5);
            this.a.a(j2, this.n);
        }
    }

    private void g(byte[] bArr, int i, int i2) {
        if (this.e) {
            this.d.c(bArr, i, i2);
        } else {
            this.g.a(bArr, i, i2);
            this.h.a(bArr, i, i2);
            this.i.a(bArr, i, i2);
        }
        this.j.a(bArr, i, i2);
        this.k.a(bArr, i, i2);
    }

    public static Format h(String str, C2142Rm0 c2142Rm0, C2142Rm0 c2142Rm02, C2142Rm0 c2142Rm03) {
        float f;
        int i = c2142Rm0.e;
        byte[] bArr = new byte[c2142Rm02.e + i + c2142Rm03.e];
        System.arraycopy(c2142Rm0.d, 0, bArr, 0, i);
        System.arraycopy(c2142Rm02.d, 0, bArr, c2142Rm0.e, c2142Rm02.e);
        System.arraycopy(c2142Rm03.d, 0, bArr, c2142Rm0.e + c2142Rm02.e, c2142Rm03.e);
        C2688Ws0 c2688Ws0 = new C2688Ws0(c2142Rm02.d, 0, c2142Rm02.e);
        c2688Ws0.l(44);
        int iE = c2688Ws0.e(3);
        c2688Ws0.k();
        c2688Ws0.l(88);
        c2688Ws0.l(8);
        int i2 = 0;
        for (int i3 = 0; i3 < iE; i3++) {
            if (c2688Ws0.d()) {
                i2 += 89;
            }
            if (c2688Ws0.d()) {
                i2 += 8;
            }
        }
        c2688Ws0.l(i2);
        if (iE > 0) {
            c2688Ws0.l((8 - iE) * 2);
        }
        c2688Ws0.h();
        int iH = c2688Ws0.h();
        if (iH == 3) {
            c2688Ws0.k();
        }
        int iH2 = c2688Ws0.h();
        int iH3 = c2688Ws0.h();
        if (c2688Ws0.d()) {
            int iH4 = c2688Ws0.h();
            int iH5 = c2688Ws0.h();
            int iH6 = c2688Ws0.h();
            int iH7 = c2688Ws0.h();
            iH2 -= ((iH == 1 || iH == 2) ? 2 : 1) * (iH4 + iH5);
            iH3 -= (iH == 1 ? 2 : 1) * (iH6 + iH7);
        }
        int i4 = iH2;
        int i5 = iH3;
        c2688Ws0.h();
        c2688Ws0.h();
        int iH8 = c2688Ws0.h();
        for (int i6 = c2688Ws0.d() ? 0 : iE; i6 <= iE; i6++) {
            c2688Ws0.h();
            c2688Ws0.h();
            c2688Ws0.h();
        }
        c2688Ws0.h();
        c2688Ws0.h();
        c2688Ws0.h();
        c2688Ws0.h();
        c2688Ws0.h();
        c2688Ws0.h();
        if (c2688Ws0.d() && c2688Ws0.d()) {
            i(c2688Ws0);
        }
        c2688Ws0.l(2);
        if (c2688Ws0.d()) {
            c2688Ws0.l(8);
            c2688Ws0.h();
            c2688Ws0.h();
            c2688Ws0.k();
        }
        j(c2688Ws0);
        if (c2688Ws0.d()) {
            for (int i7 = 0; i7 < c2688Ws0.h(); i7++) {
                c2688Ws0.l(iH8 + 5);
            }
        }
        c2688Ws0.l(2);
        float f2 = 1.0f;
        if (c2688Ws0.d() && c2688Ws0.d()) {
            int iE2 = c2688Ws0.e(8);
            if (iE2 == 255) {
                int iE3 = c2688Ws0.e(16);
                int iE4 = c2688Ws0.e(16);
                if (iE3 != 0 && iE4 != 0) {
                    f2 = iE3 / iE4;
                }
            } else {
                float[] fArr = AbstractC2248Sm0.b;
                if (iE2 < fArr.length) {
                    f2 = fArr[iE2];
                }
                f = 1.0f;
            }
            f = f2;
        } else {
            f = 1.0f;
        }
        return Format.A(str, "video/hevc", null, -1, -1, i4, i5, -1.0f, Collections.singletonList(bArr), -1, f, null);
    }

    public static void i(C2688Ws0 c2688Ws0) {
        for (int i = 0; i < 4; i++) {
            int i2 = 0;
            while (i2 < 6) {
                int i3 = 1;
                if (c2688Ws0.d()) {
                    int iMin = Math.min(64, 1 << ((i << 1) + 4));
                    if (i > 1) {
                        c2688Ws0.g();
                    }
                    for (int i4 = 0; i4 < iMin; i4++) {
                        c2688Ws0.g();
                    }
                } else {
                    c2688Ws0.h();
                }
                if (i == 3) {
                    i3 = 3;
                }
                i2 += i3;
            }
        }
    }

    public static void j(C2688Ws0 c2688Ws0) {
        int iH = c2688Ws0.h();
        boolean zD = false;
        int i = 0;
        for (int i2 = 0; i2 < iH; i2++) {
            if (i2 != 0) {
                zD = c2688Ws0.d();
            }
            if (zD) {
                c2688Ws0.k();
                c2688Ws0.h();
                for (int i3 = 0; i3 <= i; i3++) {
                    if (c2688Ws0.d()) {
                        c2688Ws0.k();
                    }
                }
            } else {
                int iH2 = c2688Ws0.h();
                int iH3 = c2688Ws0.h();
                int i4 = iH2 + iH3;
                for (int i5 = 0; i5 < iH2; i5++) {
                    c2688Ws0.h();
                    c2688Ws0.k();
                }
                for (int i6 = 0; i6 < iH3; i6++) {
                    c2688Ws0.h();
                    c2688Ws0.k();
                }
                i = i4;
            }
        }
    }

    @Override // com.daaw.InterfaceC9543xF
    public void a(C2584Vs0 c2584Vs0) {
        while (c2584Vs0.a() > 0) {
            int iC = c2584Vs0.c();
            int iD = c2584Vs0.d();
            byte[] bArr = c2584Vs0.a;
            this.l += (long) c2584Vs0.a();
            this.c.c(c2584Vs0, c2584Vs0.a());
            while (iC < iD) {
                int iC2 = AbstractC2248Sm0.c(bArr, iC, iD, this.f);
                if (iC2 == iD) {
                    g(bArr, iC, iD);
                    return;
                }
                int iE = AbstractC2248Sm0.e(bArr, iC2);
                int i = iC2 - iC;
                if (i > 0) {
                    g(bArr, iC, iC2);
                }
                int i2 = iD - iC2;
                long j = this.l - ((long) i2);
                f(j, i2, i < 0 ? -i : 0, this.m);
                k(j, i2, iE, this.m);
                iC = iC2 + 3;
            }
        }
    }

    @Override // com.daaw.InterfaceC9543xF
    public void b() {
        AbstractC2248Sm0.a(this.f);
        this.g.d();
        this.h.d();
        this.i.d();
        this.j.d();
        this.k.d();
        this.d.d();
        this.l = 0L;
    }

    @Override // com.daaw.InterfaceC9543xF
    public void d(InterfaceC9838yJ interfaceC9838yJ, InterfaceC8103s61.d dVar) {
        dVar.a();
        this.b = dVar.b();
        Z41 z41A = interfaceC9838yJ.a(dVar.c(), 2);
        this.c = z41A;
        this.d = new a(z41A);
        this.a.b(interfaceC9838yJ, dVar);
    }

    @Override // com.daaw.InterfaceC9543xF
    public void e(long j, boolean z) {
        this.m = j;
    }

    public final void k(long j, int i, int i2, long j2) {
        int i3;
        if (this.e) {
            i3 = i2;
            this.d.e(j, i, i3, j2);
        } else {
            i3 = i2;
            this.g.e(i3);
            this.h.e(i3);
            this.i.e(i3);
        }
        this.j.e(i3);
        this.k.e(i3);
    }

    @Override // com.daaw.InterfaceC9543xF
    public void c() {
    }
}
