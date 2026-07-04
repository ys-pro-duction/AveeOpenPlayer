package com.daaw;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: com.daaw.Gm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C0977Gm0 extends EP0 implements InterfaceC0873Fm0 {
    public static final AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(C0977Gm0.class, Object.class, "owner");
    public final InterfaceC3986dR h;
    private volatile Object owner;

    /* JADX INFO: renamed from: com.daaw.Gm0$a */
    public final class a implements InterfaceC3788cj, InterfaceC4332eg1 {
        public final C4067dj B;
        public final Object C;

        /* JADX INFO: renamed from: com.daaw.Gm0$a$a, reason: collision with other inner class name */
        public static final class C0065a extends AbstractC4192e90 implements NQ {
            public final /* synthetic */ C0977Gm0 B;
            public final /* synthetic */ a C;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0065a(C0977Gm0 c0977Gm0, a aVar) {
                super(1);
                this.B = c0977Gm0;
                this.C = aVar;
            }

            public final void a(Throwable th) {
                this.B.c(this.C.C);
            }

            @Override // com.daaw.NQ
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Throwable) obj);
                return G91.a;
            }
        }

        /* JADX INFO: renamed from: com.daaw.Gm0$a$b */
        public static final class b extends AbstractC4192e90 implements NQ {
            public final /* synthetic */ C0977Gm0 B;
            public final /* synthetic */ a C;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C0977Gm0 c0977Gm0, a aVar) {
                super(1);
                this.B = c0977Gm0;
                this.C = aVar;
            }

            public final void a(Throwable th) {
                C0977Gm0.i.set(this.B, this.C.C);
                this.B.c(this.C.C);
            }

            @Override // com.daaw.NQ
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Throwable) obj);
                return G91.a;
            }
        }

        public a(C4067dj c4067dj, Object obj) {
            this.B = c4067dj;
            this.C = obj;
        }

        @Override // com.daaw.InterfaceC3788cj
        public boolean L(Throwable th) {
            return this.B.L(th);
        }

        @Override // com.daaw.InterfaceC3788cj
        public void M(Object obj) {
            this.B.M(obj);
        }

        @Override // com.daaw.InterfaceC3788cj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void K(G91 g91, NQ nq) {
            C0977Gm0.i.set(C0977Gm0.this, this.C);
            this.B.K(g91, new C0065a(C0977Gm0.this, this));
        }

        @Override // com.daaw.InterfaceC4332eg1
        public void b(GO0 go0, int i) {
            this.B.b(go0, i);
        }

        @Override // com.daaw.InterfaceC3788cj
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void C(AbstractC5801jt abstractC5801jt, G91 g91) {
            this.B.C(abstractC5801jt, g91);
        }

        @Override // com.daaw.InterfaceC3788cj
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Object G(G91 g91, Object obj, NQ nq) {
            Object objG = this.B.G(g91, obj, new b(C0977Gm0.this, this));
            if (objG != null) {
                C0977Gm0.i.set(C0977Gm0.this, this.C);
            }
            return objG;
        }

        @Override // com.daaw.InterfaceC1416Ks
        public InterfaceC4684ft getContext() {
            return this.B.getContext();
        }

        @Override // com.daaw.InterfaceC3788cj
        public boolean o() {
            return this.B.o();
        }

        @Override // com.daaw.InterfaceC3788cj
        public void r(NQ nq) {
            this.B.r(nq);
        }

        @Override // com.daaw.InterfaceC1416Ks
        public void x(Object obj) {
            this.B.x(obj);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Gm0$b */
    public static final class b extends AbstractC4192e90 implements InterfaceC3986dR {

        /* JADX INFO: renamed from: com.daaw.Gm0$b$a */
        public static final class a extends AbstractC4192e90 implements NQ {
            public final /* synthetic */ C0977Gm0 B;
            public final /* synthetic */ Object C;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C0977Gm0 c0977Gm0, Object obj) {
                super(1);
                this.B = c0977Gm0;
                this.C = obj;
            }

            public final void a(Throwable th) {
                this.B.c(this.C);
            }

            @Override // com.daaw.NQ
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Throwable) obj);
                return G91.a;
            }
        }

        public b() {
            super(3);
        }

        public final NQ a(InterfaceC5104hP0 interfaceC5104hP0, Object obj, Object obj2) {
            return new a(C0977Gm0.this, obj);
        }

        @Override // com.daaw.InterfaceC3986dR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            AbstractC6314li0.a(obj);
            return a(null, obj2, obj3);
        }
    }

    public C0977Gm0(boolean z) {
        super(1, z ? 1 : 0);
        this.owner = z ? null : AbstractC1081Hm0.a;
        this.h = new b();
    }

    public static /* synthetic */ Object p(C0977Gm0 c0977Gm0, Object obj, InterfaceC1416Ks interfaceC1416Ks) {
        if (c0977Gm0.b(obj)) {
            return G91.a;
        }
        Object objQ = c0977Gm0.q(obj, interfaceC1416Ks);
        return objQ == I10.c() ? objQ : G91.a;
    }

    @Override // com.daaw.InterfaceC0873Fm0
    public Object a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
        return p(this, obj, interfaceC1416Ks);
    }

    @Override // com.daaw.InterfaceC0873Fm0
    public boolean b(Object obj) {
        int iR = r(obj);
        if (iR == 0) {
            return true;
        }
        if (iR == 1) {
            return false;
        }
        if (iR != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    @Override // com.daaw.InterfaceC0873Fm0
    public void c(Object obj) {
        while (o()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 != AbstractC1081Hm0.a) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                if (AbstractC5549j0.a(atomicReferenceFieldUpdater, this, obj2, AbstractC1081Hm0.a)) {
                    i();
                    return;
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final int n(Object obj) {
        while (o()) {
            Object obj2 = i.get(this);
            if (obj2 != AbstractC1081Hm0.a) {
                return obj2 == obj ? 1 : 2;
            }
        }
        return 0;
    }

    public boolean o() {
        return h() == 0;
    }

    public final Object q(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
        C4067dj c4067djB = AbstractC4634fj.b(H10.b(interfaceC1416Ks));
        try {
            d(new a(c4067djB, obj));
            Object objU = c4067djB.u();
            if (objU == I10.c()) {
                AbstractC7497pw.c(interfaceC1416Ks);
            }
            return objU == I10.c() ? objU : G91.a;
        } catch (Throwable th) {
            c4067djB.I();
            throw th;
        }
    }

    public final int r(Object obj) {
        while (!j()) {
            if (obj == null) {
                return 1;
            }
            int iN = n(obj);
            if (iN == 1) {
                return 2;
            }
            if (iN == 2) {
                return 1;
            }
        }
        i.set(this, obj);
        return 0;
    }

    public String toString() {
        return "Mutex@" + AbstractC8054rw.b(this) + "[isLocked=" + o() + ",owner=" + i.get(this) + ']';
    }
}
