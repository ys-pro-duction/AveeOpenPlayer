package com.daaw;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.daaw.ek, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4350ek implements IR {
    public final InterfaceC4684ft B;
    public final int C;
    public final EnumC5182hh D;

    /* JADX INFO: renamed from: com.daaw.ek$a */
    public static final class a extends SZ0 implements InterfaceC3429bR {
        public int F;
        public /* synthetic */ Object G;
        public final /* synthetic */ InterfaceC7337pN H;
        public final /* synthetic */ AbstractC4350ek I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC7337pN interfaceC7337pN, AbstractC4350ek abstractC4350ek, InterfaceC1416Ks interfaceC1416Ks) {
            super(2, interfaceC1416Ks);
            this.H = interfaceC7337pN;
            this.I = abstractC4350ek;
        }

        @Override // com.daaw.AbstractC7409pe
        public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
            a aVar = new a(this.H, this.I, interfaceC1416Ks);
            aVar.G = obj;
            return aVar;
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) throws Throwable {
            Object objC = I10.c();
            int i = this.F;
            if (i == 0) {
                AbstractC4801gJ0.b(obj);
                InterfaceC7484pt interfaceC7484pt = (InterfaceC7484pt) this.G;
                InterfaceC7337pN interfaceC7337pN = this.H;
                QE0 qe0O = this.I.o(interfaceC7484pt);
                this.F = 1;
                if (AbstractC7894rN.g(interfaceC7337pN, qe0O, this) == objC) {
                    return objC;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4801gJ0.b(obj);
            }
            return G91.a;
        }

        @Override // com.daaw.InterfaceC3429bR
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC7484pt interfaceC7484pt, InterfaceC1416Ks interfaceC1416Ks) {
            return ((a) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
        }
    }

    /* JADX INFO: renamed from: com.daaw.ek$b */
    public static final class b extends SZ0 implements InterfaceC3429bR {
        public int F;
        public /* synthetic */ Object G;

        public b(InterfaceC1416Ks interfaceC1416Ks) {
            super(2, interfaceC1416Ks);
        }

        @Override // com.daaw.AbstractC7409pe
        public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
            b bVar = AbstractC4350ek.this.new b(interfaceC1416Ks);
            bVar.G = obj;
            return bVar;
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) throws Throwable {
            Object objC = I10.c();
            int i = this.F;
            if (i == 0) {
                AbstractC4801gJ0.b(obj);
                InterfaceC1237Iz0 interfaceC1237Iz0 = (InterfaceC1237Iz0) this.G;
                AbstractC4350ek abstractC4350ek = AbstractC4350ek.this;
                this.F = 1;
                if (abstractC4350ek.g(interfaceC1237Iz0, this) == objC) {
                    return objC;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4801gJ0.b(obj);
            }
            return G91.a;
        }

        @Override // com.daaw.InterfaceC3429bR
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC1237Iz0 interfaceC1237Iz0, InterfaceC1416Ks interfaceC1416Ks) {
            return ((b) a(interfaceC1237Iz0, interfaceC1416Ks)).q(G91.a);
        }
    }

    public AbstractC4350ek(InterfaceC4684ft interfaceC4684ft, int i, EnumC5182hh enumC5182hh) {
        this.B = interfaceC4684ft;
        this.C = i;
        this.D = enumC5182hh;
    }

    public static /* synthetic */ Object f(AbstractC4350ek abstractC4350ek, InterfaceC7337pN interfaceC7337pN, InterfaceC1416Ks interfaceC1416Ks) {
        Object objE = AbstractC7763qt.e(new a(interfaceC7337pN, abstractC4350ek, null), interfaceC1416Ks);
        return objE == I10.c() ? objE : G91.a;
    }

    @Override // com.daaw.InterfaceC7058oN
    public Object a(InterfaceC7337pN interfaceC7337pN, InterfaceC1416Ks interfaceC1416Ks) {
        return f(this, interfaceC7337pN, interfaceC1416Ks);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    @Override // com.daaw.IR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.daaw.InterfaceC7058oN b(com.daaw.InterfaceC4684ft r2, int r3, com.daaw.EnumC5182hh r4) {
        /*
            r1 = this;
            com.daaw.ft r0 = r1.B
            com.daaw.ft r2 = r2.U(r0)
            com.daaw.hh r0 = com.daaw.EnumC5182hh.SUSPEND
            if (r4 == r0) goto Lb
            goto L25
        Lb:
            int r4 = r1.C
            r0 = -3
            if (r4 != r0) goto L11
            goto L23
        L11:
            if (r3 != r0) goto L15
        L13:
            r3 = r4
            goto L23
        L15:
            r0 = -2
            if (r4 != r0) goto L19
            goto L23
        L19:
            if (r3 != r0) goto L1c
            goto L13
        L1c:
            int r3 = r3 + r4
            if (r3 < 0) goto L20
            goto L23
        L20:
            r3 = 2147483647(0x7fffffff, float:NaN)
        L23:
            com.daaw.hh r4 = r1.D
        L25:
            com.daaw.ft r0 = r1.B
            boolean r0 = com.daaw.G10.c(r2, r0)
            if (r0 == 0) goto L36
            int r0 = r1.C
            if (r3 != r0) goto L36
            com.daaw.hh r0 = r1.D
            if (r4 != r0) goto L36
            return r1
        L36:
            com.daaw.ek r2 = r1.h(r2, r3, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC4350ek.b(com.daaw.ft, int, com.daaw.hh):com.daaw.oN");
    }

    public String e() {
        return null;
    }

    public abstract Object g(InterfaceC1237Iz0 interfaceC1237Iz0, InterfaceC1416Ks interfaceC1416Ks);

    public abstract AbstractC4350ek h(InterfaceC4684ft interfaceC4684ft, int i, EnumC5182hh enumC5182hh);

    public InterfaceC7058oN l() {
        return null;
    }

    public final InterfaceC3429bR m() {
        return new b(null);
    }

    public final int n() {
        int i = this.C;
        if (i == -3) {
            return -2;
        }
        return i;
    }

    public QE0 o(InterfaceC7484pt interfaceC7484pt) {
        return AbstractC1029Gz0.b(interfaceC7484pt, this.B, n(), this.D, EnumC8599tt.ATOMIC, null, m(), 16, null);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strE = e();
        if (strE != null) {
            arrayList.add(strE);
        }
        if (this.B != C5905kG.B) {
            arrayList.add("context=" + this.B);
        }
        if (this.C != -3) {
            arrayList.add("capacity=" + this.C);
        }
        if (this.D != EnumC5182hh.SUSPEND) {
            arrayList.add("onBufferOverflow=" + this.D);
        }
        return AbstractC8054rw.a(this) + '[' + AbstractC2455Um.n0(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}
