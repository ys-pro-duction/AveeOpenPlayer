package com.daaw;

import com.google.android.gms.internal.ads.zzbrj;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.ri2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7989ri2 {
    public final Map a = new HashMap();

    public final synchronized C7711qi2 a(String str) {
        return (C7711qi2) this.a.get(str);
    }

    public final C7711qi2 b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C7711qi2 c7711qi2A = a((String) it.next());
            if (c7711qi2A != null) {
                return c7711qi2A;
            }
        }
        return null;
    }

    public final String c(String str) {
        zzbrj zzbrjVar;
        C7711qi2 c7711qi2A = a(str);
        return (c7711qi2A == null || (zzbrjVar = c7711qi2A.b) == null) ? "" : zzbrjVar.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x001e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void d(java.lang.String r6, com.daaw.C4502fG2 r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.util.Map r0 = r5.a     // Catch: java.lang.Throwable -> L17
            boolean r0 = r0.containsKey(r6)     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto Lb
            monitor-exit(r5)
            return
        Lb:
            com.daaw.qi2 r0 = new com.daaw.qi2     // Catch: java.lang.Throwable -> L17
            r1 = 0
            if (r7 != 0) goto L12
        L10:
            r2 = r1
            goto L1b
        L12:
            com.google.android.gms.internal.ads.zzbrj r2 = r7.j()     // Catch: java.lang.Throwable -> L17 com.daaw.KF2 -> L19
            goto L1b
        L17:
            r6 = move-exception
            goto L48
        L19:
            goto L10
        L1b:
            if (r7 != 0) goto L1e
            goto L22
        L1e:
            com.google.android.gms.internal.ads.zzbrj r1 = r7.k()     // Catch: java.lang.Throwable -> L17 com.daaw.KF2 -> L22
        L22:
            com.daaw.qE1 r3 = com.daaw.AbstractC9820yE1.c9     // Catch: java.lang.Throwable -> L17
            com.daaw.wE1 r4 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L17
            java.lang.Object r3 = r4.b(r3)     // Catch: java.lang.Throwable -> L17
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L17
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L17
            r4 = 1
            if (r3 != 0) goto L36
            goto L3e
        L36:
            r3 = 0
            if (r7 != 0) goto L3b
        L39:
            r4 = 0
            goto L3e
        L3b:
            r7.c()     // Catch: java.lang.Throwable -> L17 com.daaw.KF2 -> L39
        L3e:
            r0.<init>(r6, r2, r1, r4)     // Catch: java.lang.Throwable -> L17
            java.util.Map r7 = r5.a     // Catch: java.lang.Throwable -> L17
            r7.put(r6, r0)     // Catch: java.lang.Throwable -> L17
            monitor-exit(r5)
            return
        L48:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L17
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C7989ri2.d(java.lang.String, com.daaw.fG2):void");
    }

    public final synchronized void e(String str, ZM1 zm1) {
        if (this.a.containsKey(str)) {
            return;
        }
        try {
            this.a.put(str, new C7711qi2(str, zm1.zzf(), zm1.zzg(), true));
        } catch (Throwable unused) {
        }
    }
}
