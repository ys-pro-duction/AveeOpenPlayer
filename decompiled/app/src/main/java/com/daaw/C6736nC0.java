package com.daaw;

import com.daaw.SH;

/* JADX INFO: renamed from: com.daaw.nC0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C6736nC0 {
    public final C5890kC0 a;
    public final SH.a b;
    public final LH c;
    public boolean d = false;
    public EnumC1409Kq0 e = EnumC1409Kq0.UNKNOWN;
    public C1881Pe1 f;

    public C6736nC0(C5890kC0 c5890kC0, SH.a aVar, LH lh) {
        this.a = c5890kC0;
        this.c = lh;
        this.b = aVar;
    }

    public C5890kC0 a() {
        return this.a;
    }

    public void b(com.google.firebase.firestore.c cVar) {
        this.c.a(null, cVar);
    }

    public boolean c(EnumC1409Kq0 enumC1409Kq0) {
        this.e = enumC1409Kq0;
        C1881Pe1 c1881Pe1 = this.f;
        if (c1881Pe1 == null || this.d || !g(c1881Pe1, enumC1409Kq0)) {
            return false;
        }
        e(this.f);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean d(com.daaw.C1881Pe1 r14) {
        /*
            r13 = this;
            java.util.List r0 = r14.d()
            boolean r0 = r0.isEmpty()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L15
            boolean r0 = r14.a()
            if (r0 == 0) goto L13
            goto L15
        L13:
            r0 = 0
            goto L16
        L15:
            r0 = 1
        L16:
            java.lang.String r3 = "We got a new snapshot with no changes?"
            java.lang.Object[] r4 = new java.lang.Object[r2]
            com.daaw.AbstractC6557mb.d(r0, r3, r4)
            com.daaw.SH$a r0 = r13.b
            boolean r0 = r0.a
            if (r0 != 0) goto L6b
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.List r0 = r14.d()
            java.util.Iterator r0 = r0.iterator()
        L30:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L48
            java.lang.Object r3 = r0.next()
            com.daaw.eD r3 = (com.daaw.C4208eD) r3
            com.daaw.eD$a r4 = r3.c()
            com.daaw.eD$a r5 = com.daaw.C4208eD.a.METADATA
            if (r4 == r5) goto L30
            r7.add(r3)
            goto L30
        L48:
            com.daaw.Pe1 r3 = new com.daaw.Pe1
            com.daaw.kC0 r4 = r14.h()
            com.daaw.bD r5 = r14.e()
            com.daaw.bD r6 = r14.g()
            boolean r8 = r14.k()
            com.daaw.UY r9 = r14.f()
            boolean r10 = r14.a()
            r11 = 1
            boolean r12 = r14.i()
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r14 = r3
        L6b:
            boolean r0 = r13.d
            if (r0 != 0) goto L7b
            com.daaw.Kq0 r0 = r13.e
            boolean r0 = r13.g(r14, r0)
            if (r0 == 0) goto L88
            r13.e(r14)
            goto L89
        L7b:
            boolean r0 = r13.f(r14)
            if (r0 == 0) goto L88
            com.daaw.LH r0 = r13.c
            r2 = 0
            r0.a(r14, r2)
            goto L89
        L88:
            r1 = 0
        L89:
            r13.f = r14
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C6736nC0.d(com.daaw.Pe1):boolean");
    }

    public final void e(C1881Pe1 c1881Pe1) {
        AbstractC6557mb.d(!this.d, "Trying to raise initial event for second time", new Object[0]);
        C1881Pe1 c1881Pe1C = C1881Pe1.c(c1881Pe1.h(), c1881Pe1.e(), c1881Pe1.f(), c1881Pe1.k(), c1881Pe1.b(), c1881Pe1.i());
        this.d = true;
        this.c.a(c1881Pe1C, null);
    }

    public final boolean f(C1881Pe1 c1881Pe1) {
        if (!c1881Pe1.d().isEmpty()) {
            return true;
        }
        C1881Pe1 c1881Pe12 = this.f;
        boolean z = (c1881Pe12 == null || c1881Pe12.j() == c1881Pe1.j()) ? false : true;
        if (c1881Pe1.a() || z) {
            return this.b.b;
        }
        return false;
    }

    public final boolean g(C1881Pe1 c1881Pe1, EnumC1409Kq0 enumC1409Kq0) {
        AbstractC6557mb.d(!this.d, "Determining whether to raise first event but already had first event.", new Object[0]);
        if (!c1881Pe1.k()) {
            return true;
        }
        EnumC1409Kq0 enumC1409Kq02 = EnumC1409Kq0.OFFLINE;
        boolean zEquals = enumC1409Kq0.equals(enumC1409Kq02);
        if (!this.b.c || zEquals) {
            return !c1881Pe1.e().isEmpty() || c1881Pe1.i() || enumC1409Kq0.equals(enumC1409Kq02);
        }
        AbstractC6557mb.d(c1881Pe1.k(), "Waiting for sync, but snapshot is not from cache", new Object[0]);
        return false;
    }
}
