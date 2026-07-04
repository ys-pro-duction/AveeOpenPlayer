package com.daaw;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;

/* JADX INFO: loaded from: classes.dex */
public final class VX {
    public Object[] a;
    public Object[] b;
    public int c;

    public VX(int i) {
        this.a = new Object[i];
        this.b = new Object[i];
    }

    public final boolean a(Object obj) {
        G10.g(obj, SubscriberAttributeKt.JSON_NAME_KEY);
        return b(obj) >= 0;
    }

    public final int b(Object obj) {
        int iA = O2.a(obj);
        int i = this.c - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            Object obj2 = this.a[i3];
            int iA2 = O2.a(obj2);
            if (iA2 < iA) {
                i2 = i3 + 1;
            } else {
                if (iA2 <= iA) {
                    return obj == obj2 ? i3 : c(i3, obj, iA);
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x002c, code lost:
    
        return -(r3 + 1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int c(int r3, java.lang.Object r4, int r5) {
        /*
            r2 = this;
            int r0 = r3 + (-1)
        L2:
            r1 = -1
            if (r1 >= r0) goto L16
            java.lang.Object[] r1 = r2.a
            r1 = r1[r0]
            if (r1 != r4) goto Lc
            return r0
        Lc:
            int r1 = com.daaw.O2.a(r1)
            if (r1 == r5) goto L13
            goto L16
        L13:
            int r0 = r0 + (-1)
            goto L2
        L16:
            int r3 = r3 + 1
            int r0 = r2.c
        L1a:
            if (r3 >= r0) goto L30
            java.lang.Object[] r1 = r2.a
            r1 = r1[r3]
            if (r1 != r4) goto L23
            return r3
        L23:
            int r1 = com.daaw.O2.a(r1)
            if (r1 == r5) goto L2d
        L29:
            int r3 = r3 + 1
            int r3 = -r3
            return r3
        L2d:
            int r3 = r3 + 1
            goto L1a
        L30:
            int r3 = r2.c
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.VX.c(int, java.lang.Object, int):int");
    }

    public final Object d(Object obj) {
        G10.g(obj, SubscriberAttributeKt.JSON_NAME_KEY);
        int iB = b(obj);
        if (iB >= 0) {
            return this.b[iB];
        }
        return null;
    }

    public final Object[] e() {
        return this.a;
    }

    public final int f() {
        return this.c;
    }

    public final Object[] g() {
        return this.b;
    }

    public final boolean h() {
        return this.c > 0;
    }

    public final boolean i(Object obj) {
        G10.g(obj, SubscriberAttributeKt.JSON_NAME_KEY);
        int iB = b(obj);
        if (iB < 0) {
            return false;
        }
        int i = this.c;
        Object[] objArr = this.a;
        Object[] objArr2 = this.b;
        int i2 = iB + 1;
        AbstractC5152hb.h(objArr, objArr, iB, i2, i);
        AbstractC5152hb.h(objArr2, objArr2, iB, i2, i);
        int i3 = i - 1;
        objArr[i3] = null;
        objArr2[i3] = null;
        this.c = i3;
        return true;
    }

    public final void j(Object obj, Object obj2) {
        G10.g(obj, SubscriberAttributeKt.JSON_NAME_KEY);
        int iB = b(obj);
        if (iB >= 0) {
            this.b[iB] = obj2;
            return;
        }
        int i = -(iB + 1);
        int i2 = this.c;
        Object[] objArr = this.a;
        boolean z = i2 == objArr.length;
        Object[] objArr2 = z ? new Object[i2 * 2] : objArr;
        int i3 = i + 1;
        AbstractC5152hb.h(objArr, objArr2, i3, i, i2);
        if (z) {
            AbstractC5152hb.k(this.a, objArr2, 0, 0, i, 6, null);
        }
        objArr2[i] = obj;
        this.a = objArr2;
        Object[] objArr3 = z ? new Object[this.c * 2] : this.b;
        AbstractC5152hb.h(this.b, objArr3, i3, i, this.c);
        if (z) {
            AbstractC5152hb.k(this.b, objArr3, 0, 0, i, 6, null);
        }
        objArr3[i] = obj2;
        this.b = objArr3;
        this.c++;
    }

    public /* synthetic */ VX(int i, int i2, AbstractC2911Yw abstractC2911Yw) {
        this((i2 & 1) != 0 ? 16 : i);
    }
}
