package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class UV {
    public final InterfaceC7002o90 a;
    public final C8017ro0 b;

    public UV(InterfaceC7002o90 interfaceC7002o90) {
        G10.g(interfaceC7002o90, "rootCoordinates");
        this.a = interfaceC7002o90;
        this.b = new C8017ro0();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(long r12, java.util.List r14) {
        /*
            r11 = this;
            java.lang.String r0 = "pointerInputFilters"
            com.daaw.G10.g(r14, r0)
            com.daaw.ro0 r0 = r11.b
            int r1 = r14.size()
            r2 = 1
            r3 = 0
            r4 = 0
        Le:
            if (r4 >= r1) goto L7a
            java.lang.Object r5 = r14.get(r4)
            com.daaw.vx0 r5 = (com.daaw.AbstractC9182vx0) r5
            if (r2 == 0) goto L5f
            com.daaw.tm0 r6 = r0.g()
            int r7 = r6.r()
            if (r7 <= 0) goto L3b
            java.lang.Object[] r6 = r6.q()
            r8 = 0
        L27:
            r9 = r6[r8]
            r10 = r9
            com.daaw.oo0 r10 = (com.daaw.C7181oo0) r10
            com.daaw.vx0 r10 = r10.k()
            boolean r10 = com.daaw.G10.c(r10, r5)
            if (r10 == 0) goto L37
            goto L3c
        L37:
            int r8 = r8 + 1
            if (r8 < r7) goto L27
        L3b:
            r9 = 0
        L3c:
            com.daaw.oo0 r9 = (com.daaw.C7181oo0) r9
            if (r9 == 0) goto L5e
            r9.m()
            com.daaw.tm0 r0 = r9.j()
            com.daaw.nx0 r5 = com.daaw.C6944nx0.a(r12)
            boolean r0 = r0.m(r5)
            if (r0 != 0) goto L5c
            com.daaw.tm0 r0 = r9.j()
            com.daaw.nx0 r5 = com.daaw.C6944nx0.a(r12)
            r0.d(r5)
        L5c:
            r0 = r9
            goto L77
        L5e:
            r2 = 0
        L5f:
            com.daaw.oo0 r6 = new com.daaw.oo0
            r6.<init>(r5)
            com.daaw.tm0 r5 = r6.j()
            com.daaw.nx0 r7 = com.daaw.C6944nx0.a(r12)
            r5.d(r7)
            com.daaw.tm0 r0 = r0.g()
            r0.d(r6)
            r0 = r6
        L77:
            int r4 = r4 + 1
            goto Le
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.UV.a(long, java.util.List):void");
    }

    public final boolean b(C7241p10 c7241p10, boolean z) {
        G10.g(c7241p10, "internalPointerEvent");
        if (this.b.a(c7241p10.a(), this.a, c7241p10, z)) {
            return this.b.e(c7241p10) || this.b.f(c7241p10.a(), this.a, c7241p10, z);
        }
        return false;
    }

    public final void c() {
        this.b.d();
        this.b.c();
    }

    public final void d() {
        this.b.h();
    }
}
