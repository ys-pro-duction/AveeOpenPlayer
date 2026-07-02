package com.daaw;

import com.daaw.AbstractC0584Cu0;
import com.daaw.C9982yp0;
import com.daaw.InterfaceC1073Hk0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class O11 implements AG0 {
    public final M21 a;
    public W11 b;
    public final InterfaceC0957Gh0 c;
    public final InterfaceC1073Hk0 d;
    public InterfaceC1073Hk0 e;
    public InterfaceC1073Hk0 f;

    public static final class a extends AbstractC4192e90 implements NQ {
        public a() {
            super(1);
        }

        public final void a(InterfaceC7002o90 interfaceC7002o90) {
            G10.g(interfaceC7002o90, "it");
            O11.this.k().j(interfaceC7002o90);
            O11.a(O11.this);
            if (AbstractC6230lP0.b(null, O11.this.k().g())) {
                long jE = AbstractC7281p90.e(interfaceC7002o90);
                if (!C9982yp0.i(jE, O11.this.k().e())) {
                    O11.a(O11.this);
                }
                O11.this.k().m(jE);
            }
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC7002o90) obj);
            return G91.a;
        }
    }

    public static final class b extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ D7 B;
        public final /* synthetic */ O11 C;

        public static final class a extends AbstractC4192e90 implements NQ {
            public final /* synthetic */ O11 B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(O11 o11) {
                super(1);
                this.B = o11;
            }

            @Override // com.daaw.NQ
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(List list) {
                boolean z;
                G10.g(list, "it");
                if (this.B.k().c() != null) {
                    A21 a21C = this.B.k().c();
                    G10.d(a21C);
                    list.add(a21C);
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(D7 d7, O11 o11) {
            super(1);
            this.B = d7;
            this.C = o11;
        }

        public final void a(CP0 cp0) {
            G10.g(cp0, "$this$semantics");
            AP0.q(cp0, this.B);
            AP0.f(cp0, null, new a(this.C), 1, null);
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((CP0) obj);
            return G91.a;
        }
    }

    public static final class c extends AbstractC4192e90 implements NQ {
        public c() {
            super(1);
        }

        public final void a(OD od) throws Throwable {
            G10.g(od, "$this$drawBehind");
            A21 a21C = O11.this.k().c();
            if (a21C != null) {
                O11 o11 = O11.this;
                o11.k().a();
                O11.a(o11);
                R11.k.a(od.R().d(), a21C);
            }
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
            a((OD) obj);
            return G91.a;
        }
    }

    public static final class d implements InterfaceC0957Gh0 {

        public static final class a extends AbstractC4192e90 implements NQ {
            public final /* synthetic */ List B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List list) {
                super(1);
                this.B = list;
            }

            public final void a(AbstractC0584Cu0.a aVar) {
                G10.g(aVar, "$this$layout");
                List list = this.B;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    C0576Cs0 c0576Cs0 = (C0576Cs0) list.get(i);
                    AbstractC0584Cu0.a.l(aVar, (AbstractC0584Cu0) c0576Cs0.a(), ((D00) c0576Cs0.b()).j(), 0.0f, 2, null);
                }
            }

            @Override // com.daaw.NQ
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((AbstractC0584Cu0.a) obj);
                return G91.a;
            }
        }

        public d() {
        }

        @Override // com.daaw.InterfaceC0957Gh0
        public InterfaceC1061Hh0 a(InterfaceC1269Jh0 interfaceC1269Jh0, List list, long j) {
            G10.g(interfaceC1269Jh0, "$this$measure");
            G10.g(list, "measurables");
            A21 a21C = O11.this.k().c();
            A21 a21K = O11.this.k().h().k(j, interfaceC1269Jh0.getLayoutDirection(), a21C);
            if (!G10.c(a21C, a21K)) {
                O11.this.k().d().invoke(a21K);
                if (a21C != null) {
                    O11 o11 = O11.this;
                    if (!G10.c(a21C.h().j(), a21K.h().j())) {
                        O11.a(o11);
                    }
                }
            }
            O11.this.k().k(a21K);
            if (list.size() < a21K.s().size()) {
                throw new IllegalStateException("Check failed.");
            }
            List listS = a21K.s();
            ArrayList arrayList = new ArrayList(listS.size());
            int size = listS.size();
            for (int i = 0; i < size; i++) {
                C3103aF0 c3103aF0 = (C3103aF0) listS.get(i);
                C0576Cs0 c0576Cs0 = c3103aF0 != null ? new C0576Cs0(((InterfaceC0645Dh0) list.get(i)).G(AbstractC6916nr.b(0, (int) Math.floor(c3103aF0.j()), 0, (int) Math.floor(c3103aF0.e()), 5, null)), D00.b(E00.a(AbstractC8261sh0.b(c3103aF0.f()), AbstractC8261sh0.b(c3103aF0.i())))) : null;
                if (c0576Cs0 != null) {
                    arrayList.add(c0576Cs0);
                }
            }
            return interfaceC1269Jh0.s(I00.g(a21K.t()), I00.f(a21K.t()), AbstractC1473Lg0.k(D61.a(K3.a(), Integer.valueOf(AbstractC8261sh0.b(a21K.e()))), D61.a(K3.b(), Integer.valueOf(AbstractC8261sh0.b(a21K.g())))), new a(arrayList));
        }
    }

    public static final class e implements W11 {
        public long a;
        public long b;

        public e(InterfaceC5942kP0 interfaceC5942kP0) {
            C9982yp0.a aVar = C9982yp0.b;
            this.a = aVar.c();
            this.b = aVar.c();
        }

        @Override // com.daaw.W11
        public void a() {
            if (AbstractC6230lP0.b(null, O11.this.k().g())) {
                throw null;
            }
        }

        @Override // com.daaw.W11
        public void b(long j) {
            InterfaceC7002o90 interfaceC7002o90B = O11.this.k().b();
            if (interfaceC7002o90B == null) {
                if (AbstractC6230lP0.b(null, O11.this.k().g())) {
                    this.b = C9982yp0.b.c();
                    return;
                }
                return;
            }
            O11 o11 = O11.this;
            if (interfaceC7002o90B.C()) {
                if (o11.l(j, j)) {
                    o11.k().g();
                    throw null;
                }
                InterfaceC5663jP0.a.d();
                throw null;
            }
        }

        @Override // com.daaw.W11
        public void c() {
            if (AbstractC6230lP0.b(null, O11.this.k().g())) {
                throw null;
            }
        }

        @Override // com.daaw.W11
        public void d(long j) {
            InterfaceC7002o90 interfaceC7002o90B = O11.this.k().b();
            if (interfaceC7002o90B != null) {
                O11 o11 = O11.this;
                if (interfaceC7002o90B.C() && AbstractC6230lP0.b(null, o11.k().g())) {
                    long jQ = C9982yp0.q(this.b, j);
                    this.b = jQ;
                    if (o11.l(this.a, C9982yp0.q(this.a, jQ))) {
                        return;
                    }
                    InterfaceC5663jP0.a.a();
                    throw null;
                }
            }
        }
    }

    public static final class f extends SZ0 implements InterfaceC3429bR {
        public int F;
        public /* synthetic */ Object G;

        public f(InterfaceC1416Ks interfaceC1416Ks) {
            super(2, interfaceC1416Ks);
        }

        @Override // com.daaw.AbstractC7409pe
        public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
            f fVar = O11.this.new f(interfaceC1416Ks);
            fVar.G = obj;
            return fVar;
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) throws Throwable {
            Object objC = I10.c();
            int i = this.F;
            if (i == 0) {
                AbstractC4801gJ0.b(obj);
                InterfaceC9740xx0 interfaceC9740xx0 = (InterfaceC9740xx0) this.G;
                W11 w11H = O11.this.h();
                this.F = 1;
                if (AbstractC5727je0.a(interfaceC9740xx0, w11H, this) == objC) {
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
        public final Object invoke(InterfaceC9740xx0 interfaceC9740xx0, InterfaceC1416Ks interfaceC1416Ks) {
            return ((f) a(interfaceC9740xx0, interfaceC1416Ks)).q(G91.a);
        }
    }

    public static final class g extends SZ0 implements InterfaceC3429bR {
        public int F;
        public /* synthetic */ Object G;
        public final /* synthetic */ h H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(h hVar, InterfaceC1416Ks interfaceC1416Ks) {
            super(2, interfaceC1416Ks);
            this.H = hVar;
        }

        @Override // com.daaw.AbstractC7409pe
        public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
            g gVar = new g(this.H, interfaceC1416Ks);
            gVar.G = obj;
            return gVar;
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) throws Throwable {
            Object objC = I10.c();
            int i = this.F;
            if (i == 0) {
                AbstractC4801gJ0.b(obj);
                InterfaceC9740xx0 interfaceC9740xx0 = (InterfaceC9740xx0) this.G;
                h hVar = this.H;
                this.F = 1;
                if (L21.c(interfaceC9740xx0, hVar, this) == objC) {
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
        public final Object invoke(InterfaceC9740xx0 interfaceC9740xx0, InterfaceC1416Ks interfaceC1416Ks) {
            return ((g) a(interfaceC9740xx0, interfaceC1416Ks)).q(G91.a);
        }
    }

    public static final class h implements InterfaceC0340Al0 {
        public long a = C9982yp0.b.c();

        public h(InterfaceC5942kP0 interfaceC5942kP0) {
        }

        @Override // com.daaw.InterfaceC0340Al0
        public boolean a(long j) {
            InterfaceC7002o90 interfaceC7002o90B = O11.this.k().b();
            if (interfaceC7002o90B == null) {
                return true;
            }
            O11 o11 = O11.this;
            if (!interfaceC7002o90B.C() || !AbstractC6230lP0.b(null, o11.k().g())) {
                return false;
            }
            InterfaceC5663jP0.a.b();
            throw null;
        }

        @Override // com.daaw.InterfaceC0340Al0
        public boolean b(long j, InterfaceC5663jP0 interfaceC5663jP0) {
            G10.g(interfaceC5663jP0, "adjustment");
            InterfaceC7002o90 interfaceC7002o90B = O11.this.k().b();
            if (interfaceC7002o90B == null || !interfaceC7002o90B.C()) {
                return false;
            }
            throw null;
        }

        @Override // com.daaw.InterfaceC0340Al0
        public boolean c(long j, InterfaceC5663jP0 interfaceC5663jP0) {
            G10.g(interfaceC5663jP0, "adjustment");
            InterfaceC7002o90 interfaceC7002o90B = O11.this.k().b();
            if (interfaceC7002o90B == null) {
                return true;
            }
            O11 o11 = O11.this;
            if (interfaceC7002o90B.C() && AbstractC6230lP0.b(null, o11.k().g())) {
                throw null;
            }
            return false;
        }

        @Override // com.daaw.InterfaceC0340Al0
        public boolean d(long j) {
            InterfaceC7002o90 interfaceC7002o90B = O11.this.k().b();
            if (interfaceC7002o90B == null || !interfaceC7002o90B.C()) {
                return false;
            }
            InterfaceC5663jP0.a.b();
            throw null;
        }
    }

    public O11(M21 m21) {
        G10.g(m21, "state");
        this.a = m21;
        this.c = new d();
        InterfaceC1073Hk0.a aVar = InterfaceC1073Hk0.m;
        this.d = AbstractC8585tq0.a(g(aVar), new a());
        this.e = f(m21.h().j());
        this.f = aVar;
    }

    public static final /* synthetic */ InterfaceC5942kP0 a(O11 o11) {
        o11.getClass();
        return null;
    }

    @Override // com.daaw.AG0
    public void b() {
        this.a.f();
    }

    @Override // com.daaw.AG0
    public void c() {
        this.a.f();
    }

    public final InterfaceC1073Hk0 f(D7 d7) {
        return AbstractC8182sP0.b(InterfaceC1073Hk0.m, false, new b(d7, this), 1, null);
    }

    public final InterfaceC1073Hk0 g(InterfaceC1073Hk0 interfaceC1073Hk0) {
        return LD.a(ST.c(interfaceC1073Hk0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 65535, null), new c());
    }

    public final W11 h() {
        W11 w11 = this.b;
        if (w11 != null) {
            return w11;
        }
        G10.u("longPressDragObserver");
        return null;
    }

    public final InterfaceC0957Gh0 i() {
        return this.c;
    }

    public final InterfaceC1073Hk0 j() {
        return this.d.g(this.e).g(this.f);
    }

    public final M21 k() {
        return this.a;
    }

    public final boolean l(long j, long j2) {
        A21 a21C = this.a.c();
        if (a21C != null) {
            int length = a21C.h().j().g().length();
            int iQ = a21C.q(j);
            int iQ2 = a21C.q(j2);
            int i = length - 1;
            if ((iQ >= i && iQ2 >= i) || (iQ < 0 && iQ2 < 0)) {
                return true;
            }
        }
        return false;
    }

    public final void m(W11 w11) {
        G10.g(w11, "<set-?>");
        this.b = w11;
    }

    public final void n(R11 r11) {
        G10.g(r11, "textDelegate");
        if (this.a.h() == r11) {
            return;
        }
        this.a.o(r11);
        this.e = f(this.a.h().j());
    }

    public final void o(InterfaceC5942kP0 interfaceC5942kP0) {
        InterfaceC1073Hk0 interfaceC1073Hk0B;
        if (interfaceC5942kP0 == null) {
            interfaceC1073Hk0B = InterfaceC1073Hk0.m;
        } else if (M41.a()) {
            m(new e(interfaceC5942kP0));
            interfaceC1073Hk0B = UZ0.b(InterfaceC1073Hk0.m, h(), new f(null));
        } else {
            h hVar = new h(interfaceC5942kP0);
            interfaceC1073Hk0B = AbstractC6107kx0.b(UZ0.b(InterfaceC1073Hk0.m, hVar, new g(hVar, null)), F21.a(), false, 2, null);
        }
        this.f = interfaceC1073Hk0B;
    }

    @Override // com.daaw.AG0
    public void d() {
    }
}
