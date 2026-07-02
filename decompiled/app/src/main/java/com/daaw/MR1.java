package com.daaw;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class MR1 extends AbstractBinderC4571fV1 {
    public final AtomicReference B = new AtomicReference();
    public boolean C;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0003, code lost:
    
        r3 = r3.get("r");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a3(android.os.Bundle r3, java.lang.Class r4) {
        /*
            r0 = 0
            if (r3 == 0) goto L2c
            java.lang.String r1 = "r"
            java.lang.Object r3 = r3.get(r1)
            if (r3 == 0) goto L2c
            java.lang.Object r3 = r4.cast(r3)     // Catch: java.lang.ClassCastException -> L10
            return r3
        L10:
            r0 = move-exception
            java.lang.String r4 = r4.getCanonicalName()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getCanonicalName()
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r4 = 1
            r1[r4] = r3
            java.lang.String r3 = "Unexpected object type. Expected, Received: %s, %s"
            java.lang.String.format(r3, r1)
            throw r0
        L2c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.MR1.a3(android.os.Bundle, java.lang.Class):java.lang.Object");
    }

    public final Bundle G(long j) {
        Bundle bundle;
        synchronized (this.B) {
            if (!this.C) {
                try {
                    this.B.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.B.get();
        }
        return bundle;
    }

    public final Long I(long j) {
        return (Long) a3(G(j), Long.class);
    }

    @Override // com.daaw.LV1
    public final void J0(Bundle bundle) {
        synchronized (this.B) {
            try {
                try {
                    this.B.set(bundle);
                    this.C = true;
                } finally {
                    this.B.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String Z2(long j) {
        return (String) a3(G(j), String.class);
    }
}
