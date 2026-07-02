package com.daaw;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: com.daaw.yd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C9922yd0 {
    public static final AtomicReferenceFieldUpdater B = AtomicReferenceFieldUpdater.newUpdater(C9922yd0.class, Object.class, "_next");
    public static final AtomicReferenceFieldUpdater C = AtomicReferenceFieldUpdater.newUpdater(C9922yd0.class, Object.class, "_prev");
    public static final AtomicReferenceFieldUpdater D = AtomicReferenceFieldUpdater.newUpdater(C9922yd0.class, Object.class, "_removedRef");
    private volatile Object _next = this;
    private volatile Object _prev = this;
    private volatile Object _removedRef;

    /* JADX INFO: renamed from: com.daaw.yd0$a */
    public static abstract class a extends AbstractC1763Ob {
        public final C9922yd0 b;
        public C9922yd0 c;

        public a(C9922yd0 c9922yd0) {
            this.b = c9922yd0;
        }

        @Override // com.daaw.AbstractC1763Ob
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(C9922yd0 c9922yd0, Object obj) {
            boolean z = obj == null;
            C9922yd0 c9922yd02 = z ? this.b : this.c;
            if (c9922yd02 != null && AbstractC5549j0.a(C9922yd0.B, c9922yd0, this, c9922yd02) && z) {
                C9922yd0 c9922yd03 = this.b;
                C9922yd0 c9922yd04 = this.c;
                G10.d(c9922yd04);
                c9922yd03.n(c9922yd04);
            }
        }
    }

    public final boolean k(C9922yd0 c9922yd0) {
        C.lazySet(c9922yd0, this);
        B.lazySet(c9922yd0, this);
        while (o() == this) {
            if (AbstractC5549j0.a(B, this, this, c9922yd0)) {
                c9922yd0.n(this);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0041, code lost:
    
        if (com.daaw.AbstractC5549j0.a(r4, r3, r2, ((com.daaw.SG0) r5).a) != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.daaw.C9922yd0 l(com.daaw.AbstractC1720Nq0 r9) {
        /*
            r8 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = com.daaw.C9922yd0.C
            java.lang.Object r0 = r0.get(r8)
            com.daaw.yd0 r0 = (com.daaw.C9922yd0) r0
            r1 = 0
            r2 = r0
        La:
            r3 = r1
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = com.daaw.C9922yd0.B
            java.lang.Object r5 = r4.get(r2)
            if (r5 != r8) goto L1f
            if (r0 != r2) goto L16
            goto L28
        L16:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = com.daaw.C9922yd0.C
            boolean r0 = com.daaw.AbstractC5549j0.a(r1, r8, r0, r2)
            if (r0 != 0) goto L28
            goto L0
        L1f:
            boolean r6 = r8.r()
            if (r6 == 0) goto L26
            return r1
        L26:
            if (r5 != r9) goto L29
        L28:
            return r2
        L29:
            boolean r6 = r5 instanceof com.daaw.AbstractC1720Nq0
            if (r6 == 0) goto L33
            com.daaw.Nq0 r5 = (com.daaw.AbstractC1720Nq0) r5
            r5.a(r2)
            goto L0
        L33:
            boolean r6 = r5 instanceof com.daaw.SG0
            if (r6 == 0) goto L4f
            if (r3 == 0) goto L46
            com.daaw.SG0 r5 = (com.daaw.SG0) r5
            com.daaw.yd0 r5 = r5.a
            boolean r2 = com.daaw.AbstractC5549j0.a(r4, r3, r2, r5)
            if (r2 != 0) goto L44
            goto L0
        L44:
            r2 = r3
            goto La
        L46:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = com.daaw.C9922yd0.C
            java.lang.Object r2 = r4.get(r2)
            com.daaw.yd0 r2 = (com.daaw.C9922yd0) r2
            goto Lb
        L4f:
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            com.daaw.G10.e(r5, r3)
            r3 = r5
            com.daaw.yd0 r3 = (com.daaw.C9922yd0) r3
            r7 = r3
            r3 = r2
            r2 = r7
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C9922yd0.l(com.daaw.Nq0):com.daaw.yd0");
    }

    public final C9922yd0 m(C9922yd0 c9922yd0) {
        while (c9922yd0.r()) {
            c9922yd0 = (C9922yd0) C.get(c9922yd0);
        }
        return c9922yd0;
    }

    public final void n(C9922yd0 c9922yd0) {
        C9922yd0 c9922yd02;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C;
        do {
            c9922yd02 = (C9922yd0) atomicReferenceFieldUpdater.get(c9922yd0);
            if (o() != c9922yd0) {
                return;
            }
        } while (!AbstractC5549j0.a(C, c9922yd0, c9922yd02, this));
        if (r()) {
            c9922yd0.l(null);
        }
    }

    public final Object o() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = B;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof AbstractC1720Nq0)) {
                return obj;
            }
            ((AbstractC1720Nq0) obj).a(this);
        }
    }

    public final C9922yd0 p() {
        return AbstractC9643xd0.b(o());
    }

    public final C9922yd0 q() {
        C9922yd0 c9922yd0L = l(null);
        return c9922yd0L == null ? m((C9922yd0) C.get(this)) : c9922yd0L;
    }

    public boolean r() {
        return o() instanceof SG0;
    }

    public boolean s() {
        return t() == null;
    }

    public final C9922yd0 t() {
        Object objO;
        C9922yd0 c9922yd0;
        do {
            objO = o();
            if (objO instanceof SG0) {
                return ((SG0) objO).a;
            }
            if (objO == this) {
                return (C9922yd0) objO;
            }
            G10.e(objO, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            c9922yd0 = (C9922yd0) objO;
        } while (!AbstractC5549j0.a(B, this, objO, c9922yd0.u()));
        c9922yd0.l(null);
        return null;
    }

    public String toString() {
        return new AbstractC6170lA0(this) { // from class: com.daaw.yd0.b
            @Override // com.daaw.X60
            public Object get() {
                return AbstractC8054rw.a(this.receiver);
            }
        } + '@' + AbstractC8054rw.b(this);
    }

    public final SG0 u() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = D;
        SG0 sg0 = (SG0) atomicReferenceFieldUpdater.get(this);
        if (sg0 != null) {
            return sg0;
        }
        SG0 sg02 = new SG0(this);
        atomicReferenceFieldUpdater.lazySet(this, sg02);
        return sg02;
    }

    public final int v(C9922yd0 c9922yd0, C9922yd0 c9922yd02, a aVar) {
        C.lazySet(c9922yd0, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = B;
        atomicReferenceFieldUpdater.lazySet(c9922yd0, c9922yd02);
        aVar.c = c9922yd02;
        if (AbstractC5549j0.a(atomicReferenceFieldUpdater, this, c9922yd02, aVar)) {
            return aVar.a(this) == null ? 1 : 2;
        }
        return 0;
    }
}
