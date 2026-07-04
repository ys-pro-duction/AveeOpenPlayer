package com.daaw;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: renamed from: com.daaw.qk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C7718qk extends GO0 {
    public final C6587mh F;
    public final AtomicReferenceArray G;

    public C7718qk(long j, C7718qk c7718qk, C6587mh c6587mh, int i) {
        super(j, c7718qk, i);
        this.F = c6587mh;
        this.G = new AtomicReferenceArray(AbstractC6866nh.b * 2);
    }

    public final void A(int i, Object obj) {
        this.G.set((i * 2) + 1, obj);
    }

    public final void B(int i, Object obj) {
        z(i, obj);
    }

    @Override // com.daaw.GO0
    public int n() {
        return AbstractC6866nh.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0062, code lost:
    
        s(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0065, code lost:
    
        if (r0 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0067, code lost:
    
        r4 = u().C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006d, code lost:
    
        if (r4 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006f, code lost:
    
        com.daaw.AbstractC0785Eq0.b(r4, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0072, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
    
        return;
     */
    @Override // com.daaw.GO0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void o(int r4, java.lang.Throwable r5, com.daaw.InterfaceC4684ft r6) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            r3 = this;
            int r5 = com.daaw.AbstractC6866nh.b
            if (r4 < r5) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r4 = r4 - r5
        La:
            java.lang.Object r5 = r3.v(r4)
        Le:
            java.lang.Object r1 = r3.w(r4)
            boolean r2 = r1 instanceof com.daaw.InterfaceC4332eg1
            if (r2 != 0) goto L73
            boolean r2 = r1 instanceof com.daaw.C4621fg1
            if (r2 == 0) goto L1b
            goto L73
        L1b:
            com.daaw.YZ0 r2 = com.daaw.AbstractC6866nh.j()
            if (r1 == r2) goto L62
            com.daaw.YZ0 r2 = com.daaw.AbstractC6866nh.i()
            if (r1 != r2) goto L28
            goto L62
        L28:
            com.daaw.YZ0 r2 = com.daaw.AbstractC6866nh.p()
            if (r1 == r2) goto Le
            com.daaw.YZ0 r2 = com.daaw.AbstractC6866nh.q()
            if (r1 != r2) goto L35
            goto Le
        L35:
            com.daaw.YZ0 r4 = com.daaw.AbstractC6866nh.f()
            if (r1 == r4) goto L99
            com.daaw.YZ0 r4 = com.daaw.AbstractC6866nh.d
            if (r1 != r4) goto L40
            goto L99
        L40:
            com.daaw.YZ0 r4 = com.daaw.AbstractC6866nh.z()
            if (r1 != r4) goto L47
            goto L99
        L47:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "unexpected state: "
            r5.append(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L62:
            r3.s(r4)
            if (r0 == 0) goto L99
            com.daaw.mh r4 = r3.u()
            com.daaw.NQ r4 = r4.C
            if (r4 == 0) goto L99
            com.daaw.AbstractC0785Eq0.b(r4, r5, r6)
            return
        L73:
            if (r0 == 0) goto L7a
            com.daaw.YZ0 r2 = com.daaw.AbstractC6866nh.j()
            goto L7e
        L7a:
            com.daaw.YZ0 r2 = com.daaw.AbstractC6866nh.i()
        L7e:
            boolean r1 = r3.r(r4, r1, r2)
            if (r1 == 0) goto Le
            r3.s(r4)
            r1 = r0 ^ 1
            r3.x(r4, r1)
            if (r0 == 0) goto L99
            com.daaw.mh r4 = r3.u()
            com.daaw.NQ r4 = r4.C
            if (r4 == 0) goto L99
            com.daaw.AbstractC0785Eq0.b(r4, r5, r6)
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C7718qk.o(int, java.lang.Throwable, com.daaw.ft):void");
    }

    public final boolean r(int i, Object obj, Object obj2) {
        return AbstractC7439pk.a(this.G, (i * 2) + 1, obj, obj2);
    }

    public final void s(int i) {
        z(i, null);
    }

    public final Object t(int i, Object obj) {
        return this.G.getAndSet((i * 2) + 1, obj);
    }

    public final C6587mh u() {
        C6587mh c6587mh = this.F;
        G10.d(c6587mh);
        return c6587mh;
    }

    public final Object v(int i) {
        return this.G.get(i * 2);
    }

    public final Object w(int i) {
        return this.G.get((i * 2) + 1);
    }

    public final void x(int i, boolean z) {
        if (z) {
            u().F0((this.D * ((long) AbstractC6866nh.b)) + ((long) i));
        }
        p();
    }

    public final Object y(int i) {
        Object objV = v(i);
        s(i);
        return objV;
    }

    public final void z(int i, Object obj) {
        this.G.lazySet(i * 2, obj);
    }
}
