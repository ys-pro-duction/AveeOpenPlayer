package com.daaw;

import android.util.SparseArray;
import com.daaw.AbstractC2248Sm0;
import com.daaw.InterfaceC8103s61;
import com.google.android.exoplayer2.Format;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.uU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8759uU implements InterfaceC9543xF {
    public final C4825gP0 a;
    public final boolean b;
    public final boolean c;
    public long g;
    public String i;
    public Z41 j;
    public b k;
    public boolean l;
    public long m;
    public final boolean[] h = new boolean[3];
    public final C2142Rm0 d = new C2142Rm0(7, 128);
    public final C2142Rm0 e = new C2142Rm0(8, 128);
    public final C2142Rm0 f = new C2142Rm0(6, 128);
    public final C2584Vs0 n = new C2584Vs0();

    /* JADX INFO: renamed from: com.daaw.uU$b */
    public static final class b {
        public final Z41 a;
        public final boolean b;
        public final boolean c;
        public final SparseArray d = new SparseArray();
        public final SparseArray e = new SparseArray();
        public final C2688Ws0 f;
        public byte[] g;
        public int h;
        public int i;
        public long j;
        public boolean k;
        public long l;
        public a m;
        public a n;
        public boolean o;
        public long p;
        public long q;
        public boolean r;

        /* JADX INFO: renamed from: com.daaw.uU$b$a */
        public static final class a {
            public boolean a;
            public boolean b;
            public AbstractC2248Sm0.b c;
            public int d;
            public int e;
            public int f;
            public int g;
            public boolean h;
            public boolean i;
            public boolean j;
            public boolean k;
            public int l;
            public int m;
            public int n;
            public int o;
            public int p;

            public a() {
            }

            public void b() {
                this.b = false;
                this.a = false;
            }

            public final boolean c(a aVar) {
                int i;
                int i2;
                int i3;
                boolean z;
                boolean z2;
                if (this.a) {
                    return (aVar.a && this.f == aVar.f && this.g == aVar.g && this.h == aVar.h && (!this.i || !aVar.i || this.j == aVar.j) && (((i = this.d) == (i2 = aVar.d) || (i != 0 && i2 != 0)) && (((i3 = this.c.h) != 0 || aVar.c.h != 0 || (this.m == aVar.m && this.n == aVar.n)) && ((i3 != 1 || aVar.c.h != 1 || (this.o == aVar.o && this.p == aVar.p)) && (z = this.k) == (z2 = aVar.k) && (!z || !z2 || this.l == aVar.l))))) ? false : true;
                }
                return false;
            }

            public boolean d() {
                if (!this.b) {
                    return false;
                }
                int i = this.e;
                return i == 7 || i == 2;
            }

            public void e(AbstractC2248Sm0.b bVar, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, int i5, int i6, int i7, int i8, int i9) {
                this.c = bVar;
                this.d = i;
                this.e = i2;
                this.f = i3;
                this.g = i4;
                this.h = z;
                this.i = z2;
                this.j = z3;
                this.k = z4;
                this.l = i5;
                this.m = i6;
                this.n = i7;
                this.o = i8;
                this.p = i9;
                this.a = true;
                this.b = true;
            }

            public void f(int i) {
                this.e = i;
                this.b = true;
            }
        }

        public b(Z41 z41, boolean z, boolean z2) {
            this.a = z41;
            this.b = z;
            this.c = z2;
            this.m = new a();
            this.n = new a();
            byte[] bArr = new byte[128];
            this.g = bArr;
            this.f = new C2688Ws0(bArr, 0, 0);
            g();
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x0109  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x010c  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0110  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0123  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0129  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x015f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(byte[] r24, int r25, int r26) {
            /*
                Method dump skipped, instruction units count: 420
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.C8759uU.b.a(byte[], int, int):void");
        }

        public void b(long j, int i) {
            boolean z = false;
            if (this.i == 9 || (this.c && this.n.c(this.m))) {
                if (this.o) {
                    d(i + ((int) (j - this.j)));
                }
                this.p = this.j;
                this.q = this.l;
                this.r = false;
                this.o = true;
            }
            boolean z2 = this.r;
            int i2 = this.i;
            if (i2 == 5 || (this.b && i2 == 1 && this.n.d())) {
                z = true;
            }
            this.r = z2 | z;
        }

        public boolean c() {
            return this.c;
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
        public final void d(int i) {
            boolean z = this.r;
            this.a.a(this.q, z ? 1 : 0, (int) (this.j - this.p), i, null);
        }

        public void e(AbstractC2248Sm0.a aVar) {
            this.e.append(aVar.a, aVar);
        }

        public void f(AbstractC2248Sm0.b bVar) {
            this.d.append(bVar.a, bVar);
        }

        public void g() {
            this.k = false;
            this.o = false;
            this.n.b();
        }

        public void h(long j, int i, long j2) {
            this.i = i;
            this.l = j2;
            this.j = j;
            if (!this.b || i != 1) {
                if (!this.c) {
                    return;
                }
                if (i != 5 && i != 1 && i != 2) {
                    return;
                }
            }
            a aVar = this.m;
            this.m = this.n;
            this.n = aVar;
            aVar.b();
            this.h = 0;
            this.k = true;
        }
    }

    public C8759uU(C4825gP0 c4825gP0, boolean z, boolean z2) {
        this.a = c4825gP0;
        this.b = z;
        this.c = z2;
    }

    @Override // com.daaw.InterfaceC9543xF
    public void a(C2584Vs0 c2584Vs0) {
        int iC = c2584Vs0.c();
        int iD = c2584Vs0.d();
        byte[] bArr = c2584Vs0.a;
        this.g += (long) c2584Vs0.a();
        this.j.c(c2584Vs0, c2584Vs0.a());
        while (true) {
            int iC2 = AbstractC2248Sm0.c(bArr, iC, iD, this.h);
            if (iC2 == iD) {
                g(bArr, iC, iD);
                return;
            }
            int iF = AbstractC2248Sm0.f(bArr, iC2);
            int i = iC2 - iC;
            if (i > 0) {
                g(bArr, iC, iC2);
            }
            int i2 = iD - iC2;
            long j = this.g - ((long) i2);
            f(j, i2, i < 0 ? -i : 0, this.m);
            h(j, iF, this.m);
            iC = iC2 + 3;
        }
    }

    @Override // com.daaw.InterfaceC9543xF
    public void b() {
        AbstractC2248Sm0.a(this.h);
        this.d.d();
        this.e.d();
        this.f.d();
        this.k.g();
        this.g = 0L;
    }

    @Override // com.daaw.InterfaceC9543xF
    public void d(InterfaceC9838yJ interfaceC9838yJ, InterfaceC8103s61.d dVar) {
        dVar.a();
        this.i = dVar.b();
        Z41 z41A = interfaceC9838yJ.a(dVar.c(), 2);
        this.j = z41A;
        this.k = new b(z41A, this.b, this.c);
        this.a.b(interfaceC9838yJ, dVar);
    }

    @Override // com.daaw.InterfaceC9543xF
    public void e(long j, boolean z) {
        this.m = j;
    }

    public final void f(long j, int i, int i2, long j2) {
        if (!this.l || this.k.c()) {
            this.d.b(i2);
            this.e.b(i2);
            if (this.l) {
                if (this.d.c()) {
                    C2142Rm0 c2142Rm0 = this.d;
                    this.k.f(AbstractC2248Sm0.i(c2142Rm0.d, 3, c2142Rm0.e));
                    this.d.d();
                } else if (this.e.c()) {
                    C2142Rm0 c2142Rm02 = this.e;
                    this.k.e(AbstractC2248Sm0.h(c2142Rm02.d, 3, c2142Rm02.e));
                    this.e.d();
                }
            } else if (this.d.c() && this.e.c()) {
                ArrayList arrayList = new ArrayList();
                C2142Rm0 c2142Rm03 = this.d;
                arrayList.add(Arrays.copyOf(c2142Rm03.d, c2142Rm03.e));
                C2142Rm0 c2142Rm04 = this.e;
                arrayList.add(Arrays.copyOf(c2142Rm04.d, c2142Rm04.e));
                C2142Rm0 c2142Rm05 = this.d;
                AbstractC2248Sm0.b bVarI = AbstractC2248Sm0.i(c2142Rm05.d, 3, c2142Rm05.e);
                C2142Rm0 c2142Rm06 = this.e;
                AbstractC2248Sm0.a aVarH = AbstractC2248Sm0.h(c2142Rm06.d, 3, c2142Rm06.e);
                this.j.d(Format.A(this.i, "video/avc", null, -1, -1, bVarI.b, bVarI.c, -1.0f, arrayList, -1, bVarI.d, null));
                this.l = true;
                this.k.f(bVarI);
                this.k.e(aVarH);
                this.d.d();
                this.e.d();
            }
        }
        if (this.f.b(i2)) {
            C2142Rm0 c2142Rm07 = this.f;
            this.n.H(this.f.d, AbstractC2248Sm0.k(c2142Rm07.d, c2142Rm07.e));
            this.n.J(4);
            this.a.a(j2, this.n);
        }
        this.k.b(j, i);
    }

    public final void g(byte[] bArr, int i, int i2) {
        if (!this.l || this.k.c()) {
            this.d.a(bArr, i, i2);
            this.e.a(bArr, i, i2);
        }
        this.f.a(bArr, i, i2);
        this.k.a(bArr, i, i2);
    }

    public final void h(long j, int i, long j2) {
        if (!this.l || this.k.c()) {
            this.d.e(i);
            this.e.e(i);
        }
        this.f.e(i);
        this.k.h(j, i, j2);
    }

    @Override // com.daaw.InterfaceC9543xF
    public void c() {
    }
}
