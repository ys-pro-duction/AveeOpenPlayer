package com.daaw;

/* JADX INFO: renamed from: com.daaw.xs0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9718xs0 {
    public InterfaceC8595ts0 a;
    public boolean b;
    public C2871Ym c;
    public float d = 1.0f;
    public EnumC7560q90 e = EnumC7560q90.Ltr;
    public final NQ f = new a();

    /* JADX INFO: renamed from: com.daaw.xs0$a */
    public static final class a extends AbstractC4192e90 implements NQ {
        public a() {
            super(1);
        }

        public final void a(OD od) {
            G10.g(od, "$this$null");
            AbstractC9718xs0.this.j(od);
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((OD) obj);
            return G91.a;
        }
    }

    public abstract boolean a(float f);

    public abstract boolean b(C2871Ym c2871Ym);

    public boolean c(EnumC7560q90 enumC7560q90) {
        G10.g(enumC7560q90, "layoutDirection");
        return false;
    }

    public final void d(float f) {
        if (this.d == f) {
            return;
        }
        if (!a(f)) {
            if (f == 1.0f) {
                InterfaceC8595ts0 interfaceC8595ts0 = this.a;
                if (interfaceC8595ts0 != null) {
                    interfaceC8595ts0.c(f);
                }
                this.b = false;
            } else {
                i().c(f);
                this.b = true;
            }
        }
        this.d = f;
    }

    public final void e(C2871Ym c2871Ym) {
        if (G10.c(this.c, c2871Ym)) {
            return;
        }
        if (!b(c2871Ym)) {
            if (c2871Ym == null) {
                InterfaceC8595ts0 interfaceC8595ts0 = this.a;
                if (interfaceC8595ts0 != null) {
                    interfaceC8595ts0.l(null);
                }
                this.b = false;
            } else {
                i().l(c2871Ym);
                this.b = true;
            }
        }
        this.c = c2871Ym;
    }

    public final void f(EnumC7560q90 enumC7560q90) {
        if (this.e != enumC7560q90) {
            c(enumC7560q90);
            this.e = enumC7560q90;
        }
    }

    public final void g(OD od, long j, float f, C2871Ym c2871Ym) {
        G10.g(od, "$this$draw");
        d(f);
        e(c2871Ym);
        f(od.getLayoutDirection());
        float fI = C9879yT0.i(od.a()) - C9879yT0.i(j);
        float fG = C9879yT0.g(od.a()) - C9879yT0.g(j);
        od.R().b().f(0.0f, 0.0f, fI, fG);
        if (f > 0.0f && C9879yT0.i(j) > 0.0f && C9879yT0.g(j) > 0.0f) {
            if (this.b) {
                C3103aF0 c3103aF0A = AbstractC3939dF0.a(C9982yp0.b.c(), BT0.a(C9879yT0.i(j), C9879yT0.g(j)));
                InterfaceC6318lj interfaceC6318ljD = od.R().d();
                try {
                    interfaceC6318ljD.g(c3103aF0A, i());
                    j(od);
                } finally {
                    interfaceC6318ljD.o();
                }
            } else {
                j(od);
            }
        }
        od.R().b().f(-0.0f, -0.0f, -fI, -fG);
    }

    public abstract long h();

    public final InterfaceC8595ts0 i() {
        InterfaceC8595ts0 interfaceC8595ts0 = this.a;
        if (interfaceC8595ts0 != null) {
            return interfaceC8595ts0;
        }
        InterfaceC8595ts0 interfaceC8595ts0A = AbstractC3898d6.a();
        this.a = interfaceC8595ts0A;
        return interfaceC8595ts0A;
    }

    public abstract void j(OD od);
}
