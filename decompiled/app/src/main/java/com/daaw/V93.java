package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class V93 implements Runnable {
    public final /* synthetic */ LV1 B;
    public final /* synthetic */ Oa3 C;

    public V93(Oa3 oa3, LV1 lv1) {
        this.C = oa3;
        this.B = lv1;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r7 = this;
            com.daaw.Oa3 r0 = r7.C
            com.daaw.wU2 r0 = r0.a
            com.daaw.oe3 r0 = r0.M()
            com.daaw.C4658fn3.b()
            com.daaw.wU2 r1 = r0.a
            com.daaw.jq1 r1 = r1.z()
            com.daaw.er2 r2 = com.daaw.AbstractC1311Jr2.w0
            r3 = 0
            boolean r1 = r1.B(r3, r2)
            if (r1 == 0) goto L77
            com.daaw.wU2 r1 = r0.a
            com.daaw.jI2 r1 = r1.F()
            com.daaw.c83 r1 = r1.m()
            com.daaw.x73 r2 = com.daaw.EnumC9512x73.ANALYTICS_STORAGE
            boolean r1 = r1.j(r2)
            if (r1 != 0) goto L3d
            com.daaw.wU2 r0 = r0.a
            com.daaw.mz2 r0 = r0.w()
            com.daaw.dy2 r0 = r0.u()
            java.lang.String r1 = "Analytics storage consent denied; will not get session id"
            r0.a(r1)
        L3b:
            r0 = r3
            goto L87
        L3d:
            com.daaw.wU2 r1 = r0.a
            com.daaw.jI2 r1 = r1.F()
            com.daaw.wU2 r2 = r0.a
            com.daaw.im r2 = r2.p()
            long r4 = r2.a()
            boolean r1 = r1.s(r4)
            if (r1 != 0) goto L3b
            com.daaw.wU2 r1 = r0.a
            com.daaw.jI2 r1 = r1.F()
            com.daaw.UF2 r1 = r1.p
            long r1 = r1.a()
            r4 = 0
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 != 0) goto L66
            goto L3b
        L66:
            com.daaw.wU2 r0 = r0.a
            com.daaw.jI2 r0 = r0.F()
            com.daaw.UF2 r0 = r0.p
            long r0 = r0.a()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L87
        L77:
            com.daaw.wU2 r0 = r0.a
            com.daaw.mz2 r0 = r0.w()
            com.daaw.dy2 r0 = r0.u()
            java.lang.String r1 = "getSessionId has been disabled."
            r0.a(r1)
            goto L3b
        L87:
            if (r0 == 0) goto L9b
            com.daaw.Oa3 r1 = r7.C
            com.daaw.wU2 r1 = r1.a
            com.daaw.Pf3 r1 = r1.N()
            com.daaw.LV1 r2 = r7.B
            long r3 = r0.longValue()
            r1.J(r2, r3)
            return
        L9b:
            com.daaw.LV1 r0 = r7.B     // Catch: android.os.RemoteException -> La1
            r0.J0(r3)     // Catch: android.os.RemoteException -> La1
            return
        La1:
            r0 = move-exception
            com.daaw.Oa3 r1 = r7.C
            com.daaw.wU2 r1 = r1.a
            com.daaw.mz2 r1 = r1.w()
            com.daaw.dy2 r1 = r1.n()
            java.lang.String r2 = "getSessionId failed with exception"
            r1.b(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.V93.run():void");
    }
}
