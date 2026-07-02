package com.daaw;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.qW0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7653qW0 {
    public final boolean a;
    public final InterfaceC6258lW0 b;
    public final F6 c;
    public final List d;
    public Y00 e;

    /* JADX INFO: renamed from: com.daaw.qW0$a */
    public static final class a extends SZ0 implements InterfaceC3429bR {
        public int F;
        public final /* synthetic */ float H;
        public final /* synthetic */ InterfaceC5866k7 I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f, InterfaceC5866k7 interfaceC5866k7, InterfaceC1416Ks interfaceC1416Ks) {
            super(2, interfaceC1416Ks);
            this.H = f;
            this.I = interfaceC5866k7;
        }

        @Override // com.daaw.AbstractC7409pe
        public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
            return C7653qW0.this.new a(this.H, this.I, interfaceC1416Ks);
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) throws Throwable {
            Object objC = I10.c();
            int i = this.F;
            if (i == 0) {
                AbstractC4801gJ0.b(obj);
                F6 f6 = C7653qW0.this.c;
                Float fB = AbstractC0527Cg.b(this.H);
                InterfaceC5866k7 interfaceC5866k7 = this.I;
                this.F = 1;
                if (F6.f(f6, fB, interfaceC5866k7, null, null, this, 12, null) == objC) {
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

    /* JADX INFO: renamed from: com.daaw.qW0$b */
    public static final class b extends SZ0 implements InterfaceC3429bR {
        public int F;
        public final /* synthetic */ InterfaceC5866k7 H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC5866k7 interfaceC5866k7, InterfaceC1416Ks interfaceC1416Ks) {
            super(2, interfaceC1416Ks);
            this.H = interfaceC5866k7;
        }

        @Override // com.daaw.AbstractC7409pe
        public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
            return C7653qW0.this.new b(this.H, interfaceC1416Ks);
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) throws Throwable {
            Object objC = I10.c();
            int i = this.F;
            if (i == 0) {
                AbstractC4801gJ0.b(obj);
                F6 f6 = C7653qW0.this.c;
                Float fB = AbstractC0527Cg.b(0.0f);
                InterfaceC5866k7 interfaceC5866k7 = this.H;
                this.F = 1;
                if (F6.f(f6, fB, interfaceC5866k7, null, null, this, 12, null) == objC) {
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
            return ((b) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
        }
    }

    public C7653qW0(boolean z, InterfaceC6258lW0 interfaceC6258lW0) {
        G10.g(interfaceC6258lW0, "rippleAlpha");
        this.a = z;
        this.b = interfaceC6258lW0;
        this.c = L6.b(0.0f, 0.0f, 2, null);
        this.d = new ArrayList();
    }

    public final void b(OD od, float f, long j) {
        G10.g(od, "$this$drawStateLayer");
        float fA = Float.isNaN(f) ? DJ0.a(od, this.a, od.a()) : od.O(f);
        float fFloatValue = ((Number) this.c.o()).floatValue();
        if (fFloatValue > 0.0f) {
            long jM = C2559Vm.m(j, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
            if (!this.a) {
                ND.d(od, jM, fA, 0L, 0.0f, null, null, 0, 124, null);
                return;
            }
            float fI = C9879yT0.i(od.a());
            float fG = C9879yT0.g(od.a());
            int iB = AbstractC4360em.a.b();
            ID idR = od.R();
            long jA = idR.a();
            idR.d().i();
            idR.b().b(0.0f, 0.0f, fI, fG, iB);
            ND.d(od, jM, fA, 0L, 0.0f, null, null, 0, 124, null);
            idR.d().o();
            idR.c(jA);
        }
    }

    public final void c(Y00 y00, InterfaceC7484pt interfaceC7484pt) {
        G10.g(y00, "interaction");
        G10.g(interfaceC7484pt, "scope");
        boolean z = y00 instanceof C7094oW;
        if (z) {
            this.d.add(y00);
        } else if (y00 instanceof C7373pW) {
            this.d.remove(((C7373pW) y00).a());
        } else if (y00 instanceof LN) {
            this.d.add(y00);
        } else if (y00 instanceof MN) {
            this.d.remove(((MN) y00).a());
        } else if (y00 instanceof C8691uD) {
            this.d.add(y00);
        } else if (y00 instanceof C8977vD) {
            this.d.remove(((C8977vD) y00).a());
        } else if (!(y00 instanceof C8412tD)) {
            return;
        } else {
            this.d.remove(((C8412tD) y00).a());
        }
        Y00 y002 = (Y00) AbstractC2455Um.r0(this.d);
        if (G10.c(this.e, y002)) {
            return;
        }
        if (y002 != null) {
            AbstractC9104vh.d(interfaceC7484pt, null, null, new a(z ? ((BJ0) this.b.getValue()).c() : y00 instanceof LN ? ((BJ0) this.b.getValue()).b() : y00 instanceof C8691uD ? ((BJ0) this.b.getValue()).a() : 0.0f, KJ0.c(y002), null), 3, null);
        } else {
            AbstractC9104vh.d(interfaceC7484pt, null, null, new b(KJ0.d(this.e), null), 3, null);
        }
        this.e = y002;
    }
}
