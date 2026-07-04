package com.daaw;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class LP1 implements Callable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ NP1 b;

    public LP1(NP1 np1, Context context) {
        this.b = np1;
        this.a = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x003a  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r6 = this;
            com.daaw.NP1 r0 = r6.b
            java.util.WeakHashMap r0 = com.daaw.NP1.a(r0)
            android.content.Context r1 = r6.a
            java.lang.Object r0 = r0.get(r1)
            com.daaw.MP1 r0 = (com.daaw.MP1) r0
            if (r0 == 0) goto L3a
            com.daaw.iF1 r1 = com.daaw.AbstractC6470mF1.a
            java.lang.Object r1 = r1.e()
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r3 = r0.a
            long r3 = r3 + r1
            com.daaw.im r1 = com.google.android.gms.ads.internal.zzt.zzB()
            long r1 = r1.a()
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 >= 0) goto L2c
            goto L3a
        L2c:
            android.content.Context r1 = r6.a
            com.daaw.KP1 r0 = r0.b
            com.daaw.JP1 r2 = new com.daaw.JP1
            r2.<init>(r1, r0)
            com.daaw.KP1 r0 = r2.a()
            goto L45
        L3a:
            android.content.Context r0 = r6.a
            com.daaw.JP1 r1 = new com.daaw.JP1
            r1.<init>(r0)
            com.daaw.KP1 r0 = r1.a()
        L45:
            com.daaw.NP1 r1 = r6.b
            android.content.Context r2 = r6.a
            java.util.WeakHashMap r3 = com.daaw.NP1.a(r1)
            com.daaw.MP1 r4 = new com.daaw.MP1
            r4.<init>(r1, r0)
            r3.put(r2, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.LP1.call():java.lang.Object");
    }
}
