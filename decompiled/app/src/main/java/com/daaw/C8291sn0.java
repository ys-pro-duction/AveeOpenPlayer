package com.daaw;

/* JADX INFO: renamed from: com.daaw.sn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8291sn0 extends AbstractC3720cU0 {
    public final AbstractC3720cU0 g;
    public final NQ h;

    /* JADX INFO: renamed from: com.daaw.sn0$a */
    public static final class a extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ NQ B;
        public final /* synthetic */ NQ C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(NQ nq, NQ nq2) {
            super(1);
            this.B = nq;
            this.C = nq2;
        }

        public final void a(Object obj) {
            G10.g(obj, "state");
            this.B.invoke(obj);
            this.C.invoke(obj);
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(obj);
            return G91.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8291sn0(int i, C4566fU0 c4566fU0, NQ nq, AbstractC3720cU0 abstractC3720cU0) {
        super(i, c4566fU0, null);
        G10.g(c4566fU0, "invalid");
        G10.g(abstractC3720cU0, "parent");
        this.g = abstractC3720cU0;
        abstractC3720cU0.l(this);
        if (nq != null) {
            NQ nqH = abstractC3720cU0.h();
            if (nqH != null) {
                nq = new a(nq, nqH);
            }
        } else {
            nq = abstractC3720cU0.h();
        }
        this.h = nq;
    }

    @Override // com.daaw.AbstractC3720cU0
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public Void o(InterfaceC10170zW0 interfaceC10170zW0) {
        G10.g(interfaceC10170zW0, "state");
        AbstractC5124hU0.R();
        throw new D80();
    }

    @Override // com.daaw.AbstractC3720cU0
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public C8291sn0 v(NQ nq) {
        return new C8291sn0(f(), g(), nq, this.g);
    }

    @Override // com.daaw.AbstractC3720cU0
    public void d() {
        if (e()) {
            return;
        }
        if (f() != this.g.f()) {
            b();
        }
        this.g.m(this);
        super.d();
    }

    @Override // com.daaw.AbstractC3720cU0
    public NQ h() {
        return this.h;
    }

    @Override // com.daaw.AbstractC3720cU0
    public boolean i() {
        return true;
    }

    @Override // com.daaw.AbstractC3720cU0
    public NQ j() {
        return null;
    }

    @Override // com.daaw.AbstractC3720cU0
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public Void l(AbstractC3720cU0 abstractC3720cU0) {
        G10.g(abstractC3720cU0, "snapshot");
        AbstractC10162zU0.b();
        throw new D80();
    }

    @Override // com.daaw.AbstractC3720cU0
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public Void m(AbstractC3720cU0 abstractC3720cU0) {
        G10.g(abstractC3720cU0, "snapshot");
        AbstractC10162zU0.b();
        throw new D80();
    }

    @Override // com.daaw.AbstractC3720cU0
    public void n() {
    }
}
