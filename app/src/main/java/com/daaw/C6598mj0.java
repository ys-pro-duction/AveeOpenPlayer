package com.daaw;

import com.daaw.AbstractC0559Co;
import com.daaw.C0524Cf0;
import com.daaw.QG0;

/* JADX INFO: renamed from: com.daaw.mj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C6598mj0 extends AbstractC0559Co {

    /* JADX INFO: renamed from: com.daaw.mj0$b */
    public class b implements QG0.c {
        public b() {
        }

        @Override // com.daaw.QG0.c
        public void a(EnumC1409Kq0 enumC1409Kq0) {
            C6598mj0.this.p().a(enumC1409Kq0);
        }

        @Override // com.daaw.QG0.c
        public UY b(int i) {
            return C6598mj0.this.p().b(i);
        }

        @Override // com.daaw.QG0.c
        public void c(KG0 kg0) {
            C6598mj0.this.p().c(kg0);
        }

        @Override // com.daaw.QG0.c
        public void d(int i, C6262lX0 c6262lX0) {
            C6598mj0.this.p().d(i, c6262lX0);
        }

        @Override // com.daaw.QG0.c
        public void e(int i, C6262lX0 c6262lX0) {
            C6598mj0.this.p().e(i, c6262lX0);
        }

        @Override // com.daaw.QG0.c
        public void f(C10246zm0 c10246zm0) {
            C6598mj0.this.p().f(c10246zm0);
        }
    }

    @Override // com.daaw.AbstractC0559Co
    public SH b(AbstractC0559Co.a aVar) {
        return new SH(p());
    }

    @Override // com.daaw.AbstractC0559Co
    public InterfaceC8453tN0 c(AbstractC0559Co.a aVar) {
        return null;
    }

    @Override // com.daaw.AbstractC0559Co
    public C7106oZ d(AbstractC0559Co.a aVar) {
        return null;
    }

    @Override // com.daaw.AbstractC0559Co
    public C3481bd0 e(AbstractC0559Co.a aVar) {
        return new C3481bd0(n(), new C6457mC0(), aVar.e());
    }

    @Override // com.daaw.AbstractC0559Co
    public AbstractC1940Pt0 f(AbstractC0559Co.a aVar) {
        if (!s(aVar.g())) {
            return C8829uj0.m();
        }
        return C8829uj0.n(C0524Cf0.b.a(aVar.g().b()), new C1872Pc0(new MG0(aVar.c().a())));
    }

    @Override // com.daaw.AbstractC0559Co
    public QG0 g(AbstractC0559Co.a aVar) {
        return new QG0(new b(), m(), aVar.d(), aVar.a(), i());
    }

    @Override // com.daaw.AbstractC0559Co
    public ZZ0 h(AbstractC0559Co.a aVar) {
        return new ZZ0(m(), o(), aVar.e(), aVar.f());
    }

    @Override // com.daaw.AbstractC0559Co
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public E5 a(AbstractC0559Co.a aVar) {
        return new E5(aVar.b());
    }

    public final boolean s(com.google.firebase.firestore.d dVar) {
        dVar.a();
        return false;
    }
}
