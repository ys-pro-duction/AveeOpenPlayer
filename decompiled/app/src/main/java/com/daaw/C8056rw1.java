package com.daaw;

import android.app.Application;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.rw1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8056rw1 implements InterfaceC9817yD2 {
    public final Application a;
    public final C0814Ex1 b;
    public final Executor c;

    public C8056rw1(Application application, C0814Ex1 c0814Ex1, Executor executor) {
        this.a = application;
        this.b = c0814Ex1;
        this.c = executor;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    @Override // com.daaw.InterfaceC9817yD2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(java.lang.String r6, org.json.JSONObject r7) {
        /*
            r5 = this;
            int r0 = r6.hashCode()
            r1 = 94746189(0x5a5b64d, float:1.5583492E-35)
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L1b
            r1 = 113399775(0x6c257df, float:7.3103804E-35)
            if (r0 == r1) goto L11
            goto L25
        L11:
            java.lang.String r0 = "write"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L25
            r6 = 0
            goto L26
        L1b:
            java.lang.String r0 = "clear"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L25
            r6 = 1
            goto L26
        L25:
            r6 = -1
        L26:
            if (r6 == 0) goto L6a
            if (r6 == r3) goto L2b
            return r2
        L2b:
            java.lang.String r6 = "keys"
            org.json.JSONArray r6 = r7.optJSONArray(r6)
            if (r6 == 0) goto L5c
            int r0 = r6.length()
            if (r0 != 0) goto L3a
            goto L5c
        L3a:
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            int r0 = r6.length()
        L43:
            if (r2 >= r0) goto L56
            java.lang.String r1 = r6.optString(r2)
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 == 0) goto L50
            goto L53
        L50:
            r7.add(r1)
        L53:
            int r2 = r2 + 1
            goto L43
        L56:
            android.app.Application r6 = r5.a
            com.daaw.AbstractC9207w22.b(r6, r7)
            goto L69
        L5c:
            java.lang.String r6 = r7.toString()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r7 = "Action[clear]: wrong args."
            r7.concat(r6)
        L69:
            return r3
        L6a:
            com.daaw.S12 r6 = new com.daaw.S12
            android.app.Application r0 = r5.a
            r6.<init>(r0)
            java.util.Iterator r0 = r7.keys()
        L75:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto La2
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r7.opt(r1)
            java.lang.String.valueOf(r2)
            boolean r2 = r6.c(r1, r2)
            if (r2 == 0) goto L98
            com.daaw.Ex1 r2 = r5.b
            java.util.Set r2 = r2.c()
            r2.add(r1)
            goto L75
        L98:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Failed writing key: "
            r2.concat(r1)
            goto L75
        La2:
            com.daaw.Ex1 r7 = r5.b
            r7.d()
            r6.b()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C8056rw1.a(java.lang.String, org.json.JSONObject):boolean");
    }

    @Override // com.daaw.InterfaceC9817yD2
    public final Executor zza() {
        return this.c;
    }
}
