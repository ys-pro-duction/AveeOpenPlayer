package com.daaw;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.An, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0347An extends JJ0 implements AG0 {
    public final boolean b;
    public final float c;
    public final InterfaceC6258lW0 d;
    public final InterfaceC6258lW0 e;
    public final C9883yU0 f;

    /* JADX INFO: renamed from: com.daaw.An$a */
    public static final class a extends SZ0 implements InterfaceC3429bR {
        public int F;
        public final /* synthetic */ CJ0 G;
        public final /* synthetic */ C0347An H;
        public final /* synthetic */ C6115kz0 I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CJ0 cj0, C0347An c0347An, C6115kz0 c6115kz0, InterfaceC1416Ks interfaceC1416Ks) {
            super(2, interfaceC1416Ks);
            this.G = cj0;
            this.H = c0347An;
            this.I = c6115kz0;
        }

        @Override // com.daaw.AbstractC7409pe
        public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
            return new a(this.G, this.H, this.I, interfaceC1416Ks);
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) throws Throwable {
            Object objC = I10.c();
            int i = this.F;
            try {
                if (i == 0) {
                    AbstractC4801gJ0.b(obj);
                    CJ0 cj0 = this.G;
                    this.F = 1;
                    if (cj0.d(this) == objC) {
                        return objC;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC4801gJ0.b(obj);
                }
                this.H.f.remove(this.I);
                return G91.a;
            } catch (Throwable th) {
                this.H.f.remove(this.I);
                throw th;
            }
        }

        @Override // com.daaw.InterfaceC3429bR
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC7484pt interfaceC7484pt, InterfaceC1416Ks interfaceC1416Ks) {
            return ((a) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
        }
    }

    public /* synthetic */ C0347An(boolean z, float f, InterfaceC6258lW0 interfaceC6258lW0, InterfaceC6258lW0 interfaceC6258lW02, AbstractC2911Yw abstractC2911Yw) {
        this(z, f, interfaceC6258lW0, interfaceC6258lW02);
    }

    @Override // com.daaw.InterfaceC9623xZ
    public void a(InterfaceC2995Zr interfaceC2995Zr) {
        G10.g(interfaceC2995Zr, "<this>");
        long jW = ((C2559Vm) this.d.getValue()).w();
        interfaceC2995Zr.g0();
        f(interfaceC2995Zr, this.c, jW);
        j(interfaceC2995Zr, jW);
    }

    @Override // com.daaw.AG0
    public void b() {
        this.f.clear();
    }

    @Override // com.daaw.AG0
    public void c() {
        this.f.clear();
    }

    @Override // com.daaw.JJ0
    public void e(C6115kz0 c6115kz0, InterfaceC7484pt interfaceC7484pt) {
        G10.g(c6115kz0, "interaction");
        G10.g(interfaceC7484pt, "scope");
        Iterator it = this.f.entrySet().iterator();
        while (it.hasNext()) {
            ((CJ0) ((Map.Entry) it.next()).getValue()).h();
        }
        CJ0 cj0 = new CJ0(this.b ? C9982yp0.d(c6115kz0.a()) : null, this.c, this.b, null);
        this.f.put(c6115kz0, cj0);
        AbstractC9104vh.d(interfaceC7484pt, null, null, new a(cj0, this, c6115kz0, null), 3, null);
    }

    @Override // com.daaw.JJ0
    public void g(C6115kz0 c6115kz0) {
        G10.g(c6115kz0, "interaction");
        CJ0 cj0 = (CJ0) this.f.get(c6115kz0);
        if (cj0 != null) {
            cj0.h();
        }
    }

    public final void j(OD od, long j) {
        long j2;
        Iterator it = this.f.entrySet().iterator();
        while (it.hasNext()) {
            CJ0 cj0 = (CJ0) ((Map.Entry) it.next()).getValue();
            float fD = ((BJ0) this.e.getValue()).d();
            if (fD == 0.0f) {
                j2 = j;
            } else {
                j2 = j;
                cj0.e(od, C2559Vm.m(j2, fD, 0.0f, 0.0f, 0.0f, 14, null));
            }
            j = j2;
        }
    }

    public C0347An(boolean z, float f, InterfaceC6258lW0 interfaceC6258lW0, InterfaceC6258lW0 interfaceC6258lW02) {
        super(z, interfaceC6258lW02);
        this.b = z;
        this.c = f;
        this.d = interfaceC6258lW0;
        this.e = interfaceC6258lW02;
        this.f = AbstractC7923rU0.c();
    }

    @Override // com.daaw.AG0
    public void d() {
    }
}
