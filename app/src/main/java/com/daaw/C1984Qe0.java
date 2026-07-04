package com.daaw;

/* JADX INFO: renamed from: com.daaw.Qe0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1984Qe0 implements InterfaceC1880Pe0 {
    public final InterfaceC1396Kn B = AbstractC1603Mn.b(null, 1, null);
    public final InterfaceC8007rm0 C = AbstractC9046vU0.d(null, null, 2, null);
    public final InterfaceC8007rm0 D = AbstractC9046vU0.d(null, null, 2, null);
    public final InterfaceC6258lW0 E = AbstractC7923rU0.a(new c());
    public final InterfaceC6258lW0 F = AbstractC7923rU0.a(new a());
    public final InterfaceC6258lW0 G = AbstractC7923rU0.a(new b());
    public final InterfaceC6258lW0 H = AbstractC7923rU0.a(new d());

    /* JADX INFO: renamed from: com.daaw.Qe0$a */
    public static final class a extends AbstractC4192e90 implements LQ {
        public a() {
            super(0);
        }

        @Override // com.daaw.LQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf((C1984Qe0.this.getValue() == null && C1984Qe0.this.o() == null) ? false : true);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Qe0$b */
    public static final class b extends AbstractC4192e90 implements LQ {
        public b() {
            super(0);
        }

        @Override // com.daaw.LQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(C1984Qe0.this.o() != null);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Qe0$c */
    public static final class c extends AbstractC4192e90 implements LQ {
        public c() {
            super(0);
        }

        @Override // com.daaw.LQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(C1984Qe0.this.getValue() == null && C1984Qe0.this.o() == null);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Qe0$d */
    public static final class d extends AbstractC4192e90 implements LQ {
        public d() {
            super(0);
        }

        @Override // com.daaw.LQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(C1984Qe0.this.getValue() != null);
        }
    }

    public final synchronized void e(C0737Ee0 c0737Ee0) {
        G10.g(c0737Ee0, "composition");
        if (q()) {
            return;
        }
        t(c0737Ee0);
        this.B.B0(c0737Ee0);
    }

    public final synchronized void m(Throwable th) {
        G10.g(th, "error");
        if (q()) {
            return;
        }
        s(th);
        this.B.c(th);
    }

    public Throwable o() {
        return (Throwable) this.D.getValue();
    }

    @Override // com.daaw.InterfaceC6258lW0
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public C0737Ee0 getValue() {
        return (C0737Ee0) this.C.getValue();
    }

    public boolean q() {
        return ((Boolean) this.F.getValue()).booleanValue();
    }

    public boolean r() {
        return ((Boolean) this.H.getValue()).booleanValue();
    }

    public final void s(Throwable th) {
        this.D.setValue(th);
    }

    public final void t(C0737Ee0 c0737Ee0) {
        this.C.setValue(c0737Ee0);
    }
}
