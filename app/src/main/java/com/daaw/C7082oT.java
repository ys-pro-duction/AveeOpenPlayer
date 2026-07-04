package com.daaw;

import java.util.List;

/* JADX INFO: renamed from: com.daaw.oT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7082oT extends C7729qm0 {

    /* JADX INFO: renamed from: com.daaw.oT$a */
    public static final class a extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ List B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List list) {
            super(1);
            this.B = list;
        }

        public final void a(Object obj) {
            G10.g(obj, "state");
            List list = this.B;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((NQ) list.get(i)).invoke(obj);
            }
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(obj);
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.oT$b */
    public static final class b extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ NQ B;
        public final /* synthetic */ NQ C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(NQ nq, NQ nq2) {
            super(1);
            this.B = nq;
            this.C = nq2;
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C7729qm0 invoke(C4566fU0 c4566fU0) {
            int i;
            G10.g(c4566fU0, "invalid");
            synchronized (AbstractC5124hU0.C()) {
                i = AbstractC5124hU0.e;
                AbstractC5124hU0.e = i + 1;
            }
            return new C7729qm0(i, c4566fU0, this.B, this.C);
        }
    }

    /* JADX INFO: renamed from: com.daaw.oT$c */
    public static final class c extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ NQ B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(NQ nq) {
            super(1);
            this.B = nq;
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LE0 invoke(C4566fU0 c4566fU0) {
            int i;
            G10.g(c4566fU0, "invalid");
            synchronized (AbstractC5124hU0.C()) {
                i = AbstractC5124hU0.e;
                AbstractC5124hU0.e = i + 1;
            }
            return new LE0(i, c4566fU0, this.B);
        }
    }

    public C7082oT(int i, C4566fU0 c4566fU0) {
        NQ aVar;
        G10.g(c4566fU0, "invalid");
        synchronized (AbstractC5124hU0.C()) {
            try {
                List listO0 = !AbstractC5124hU0.h.isEmpty() ? AbstractC2455Um.O0(AbstractC5124hU0.h) : null;
                if (listO0 != null) {
                    aVar = (NQ) AbstractC2455Um.E0(listO0);
                    if (aVar == null) {
                        aVar = new a(listO0);
                    }
                } else {
                    aVar = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        super(i, c4566fU0, null, aVar);
    }

    @Override // com.daaw.C7729qm0
    public AbstractC3999dU0 A() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }

    @Override // com.daaw.C7729qm0
    public C7729qm0 N(NQ nq, NQ nq2) {
        return (C7729qm0) AbstractC5124hU0.T(new b(nq, nq2));
    }

    @Override // com.daaw.C7729qm0, com.daaw.AbstractC3720cU0
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public Void l(AbstractC3720cU0 abstractC3720cU0) {
        G10.g(abstractC3720cU0, "snapshot");
        AbstractC10162zU0.b();
        throw new D80();
    }

    @Override // com.daaw.C7729qm0, com.daaw.AbstractC3720cU0
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public Void m(AbstractC3720cU0 abstractC3720cU0) {
        G10.g(abstractC3720cU0, "snapshot");
        AbstractC10162zU0.b();
        throw new D80();
    }

    @Override // com.daaw.C7729qm0, com.daaw.AbstractC3720cU0
    public void d() {
        synchronized (AbstractC5124hU0.C()) {
            p();
            G91 g91 = G91.a;
        }
    }

    @Override // com.daaw.C7729qm0, com.daaw.AbstractC3720cU0
    public void n() {
        AbstractC5124hU0.x();
    }

    @Override // com.daaw.C7729qm0, com.daaw.AbstractC3720cU0
    public AbstractC3720cU0 v(NQ nq) {
        return AbstractC5124hU0.T(new c(nq));
    }
}
