package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public abstract class RO {
    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(int r5, java.lang.Object r6, com.daaw.InterfaceC6225lO r7, com.daaw.SO r8, int r9) {
        /*
            java.lang.String r0 = "typeface"
            com.daaw.G10.g(r6, r0)
            java.lang.String r0 = "font"
            com.daaw.G10.g(r7, r0)
            java.lang.String r0 = "requestedWeight"
            com.daaw.G10.g(r8, r0)
            boolean r0 = r6 instanceof android.graphics.Typeface
            if (r0 != 0) goto L14
            return r6
        L14:
            boolean r0 = com.daaw.QO.h(r5)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L42
            com.daaw.SO r0 = r7.b()
            boolean r0 = com.daaw.G10.c(r0, r8)
            if (r0 != 0) goto L42
            com.daaw.SO$a r0 = com.daaw.SO.C
            com.daaw.SO r3 = com.daaw.O5.a(r0)
            int r3 = r8.compareTo(r3)
            if (r3 < 0) goto L42
            com.daaw.SO r3 = r7.b()
            com.daaw.SO r0 = com.daaw.O5.a(r0)
            int r0 = r3.compareTo(r0)
            if (r0 >= 0) goto L42
            r0 = 1
            goto L43
        L42:
            r0 = 0
        L43:
            boolean r5 = com.daaw.QO.g(r5)
            if (r5 == 0) goto L55
            int r5 = r7.c()
            boolean r5 = com.daaw.PO.f(r9, r5)
            if (r5 != 0) goto L55
            r5 = 1
            goto L56
        L55:
            r5 = 0
        L56:
            if (r5 != 0) goto L5b
            if (r0 != 0) goto L5b
            return r6
        L5b:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r3 >= r4) goto L7b
            if (r5 == 0) goto L70
            com.daaw.PO$a r5 = com.daaw.PO.b
            int r5 = r5.a()
            boolean r5 = com.daaw.PO.f(r9, r5)
            if (r5 == 0) goto L70
            r1 = 1
        L70:
            int r5 = com.daaw.O5.b(r0, r1)
            android.graphics.Typeface r6 = (android.graphics.Typeface) r6
            android.graphics.Typeface r5 = android.graphics.Typeface.create(r6, r5)
            goto Lad
        L7b:
            if (r0 == 0) goto L82
            int r8 = r8.o()
            goto L8a
        L82:
            com.daaw.SO r8 = r7.b()
            int r8 = r8.o()
        L8a:
            if (r5 == 0) goto L97
            com.daaw.PO$a r5 = com.daaw.PO.b
            int r5 = r5.a()
            boolean r5 = com.daaw.PO.f(r9, r5)
            goto La5
        L97:
            int r5 = r7.c()
            com.daaw.PO$a r7 = com.daaw.PO.b
            int r7 = r7.a()
            boolean r5 = com.daaw.PO.f(r5, r7)
        La5:
            com.daaw.b91 r7 = com.daaw.C3358b91.a
            android.graphics.Typeface r6 = (android.graphics.Typeface) r6
            android.graphics.Typeface r5 = r7.a(r6, r8, r5)
        Lad:
            java.lang.String r6 = "if (Build.VERSION.SDK_IN…ht, finalFontStyle)\n    }"
            com.daaw.G10.f(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.RO.a(int, java.lang.Object, com.daaw.lO, com.daaw.SO, int):java.lang.Object");
    }
}
