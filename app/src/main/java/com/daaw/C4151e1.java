package com.daaw;

import com.daaw.CO0;
import com.daaw.InterfaceC8103s61;

/* JADX INFO: renamed from: com.daaw.e1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4151e1 implements InterfaceC8715uJ {
    public static final InterfaceC10117zJ e = new a();
    public static final int f = AbstractC6280lb1.v("ID3");
    public final long a;
    public final C4430f1 b;
    public final C2584Vs0 c;
    public boolean d;

    /* JADX INFO: renamed from: com.daaw.e1$a */
    public static class a implements InterfaceC10117zJ {
        @Override // com.daaw.InterfaceC10117zJ
        public InterfaceC8715uJ[] a() {
            return new InterfaceC8715uJ[]{new C4151e1()};
        }
    }

    public C4151e1() {
        this(0L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
    
        if ((r4 - r3) < 8192) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
    
        r8.i();
        r4 = r4 + 1;
     */
    @Override // com.daaw.InterfaceC8715uJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean c(com.daaw.InterfaceC9001vJ r8) {
        /*
            r7 = this;
            com.daaw.Vs0 r0 = new com.daaw.Vs0
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L9:
            byte[] r4 = r0.a
            r8.k(r4, r2, r1)
            r0.J(r2)
            int r4 = r0.A()
            int r5 = com.daaw.C4151e1.f
            if (r4 == r5) goto L58
            r8.i()
            r8.h(r3)
            r4 = r3
        L20:
            r1 = 0
        L21:
            byte[] r5 = r0.a
            r6 = 5
            r8.k(r5, r2, r6)
            r0.J(r2)
            int r5 = r0.D()
            r6 = 2935(0xb77, float:4.113E-42)
            if (r5 == r6) goto L42
            r8.i()
            int r4 = r4 + 1
            int r1 = r4 - r3
            r5 = 8192(0x2000, float:1.148E-41)
            if (r1 < r5) goto L3e
            return r2
        L3e:
            r8.h(r4)
            goto L20
        L42:
            r5 = 1
            int r1 = r1 + r5
            r6 = 4
            if (r1 < r6) goto L48
            return r5
        L48:
            byte[] r5 = r0.a
            int r5 = com.daaw.AbstractC4719g1.f(r5)
            r6 = -1
            if (r5 != r6) goto L52
            return r2
        L52:
            int r5 = r5 + (-5)
            r8.h(r5)
            goto L21
        L58:
            r4 = 3
            r0.K(r4)
            int r4 = r0.w()
            int r5 = r4 + 10
            int r3 = r3 + r5
            r8.h(r4)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C4151e1.c(com.daaw.vJ):boolean");
    }

    @Override // com.daaw.InterfaceC8715uJ
    public int d(InterfaceC9001vJ interfaceC9001vJ, C2082Qx0 c2082Qx0) {
        int iC = interfaceC9001vJ.c(this.c.a, 0, 2786);
        if (iC == -1) {
            return -1;
        }
        this.c.J(0);
        this.c.I(iC);
        if (!this.d) {
            this.b.e(this.a, true);
            this.d = true;
        }
        this.b.a(this.c);
        return 0;
    }

    @Override // com.daaw.InterfaceC8715uJ
    public void f(long j, long j2) {
        this.d = false;
        this.b.b();
    }

    @Override // com.daaw.InterfaceC8715uJ
    public void i(InterfaceC9838yJ interfaceC9838yJ) {
        this.b.d(interfaceC9838yJ, new InterfaceC8103s61.d(0, 1));
        interfaceC9838yJ.n();
        interfaceC9838yJ.b(new CO0.b(-9223372036854775807L));
    }

    public C4151e1(long j) {
        this.a = j;
        this.b = new C4430f1();
        this.c = new C2584Vs0(2786);
    }

    @Override // com.daaw.InterfaceC8715uJ
    public void a() {
    }
}
