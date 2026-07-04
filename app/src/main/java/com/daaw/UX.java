package com.daaw;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;

/* JADX INFO: loaded from: classes.dex */
public final class UX {
    public int a;
    public Object[] b = new Object[4];
    public int[] c = new int[4];

    public final void a(Object obj, int i) {
        int iB;
        G10.g(obj, SubscriberAttributeKt.JSON_NAME_KEY);
        if (this.a > 0) {
            iB = b(obj);
            if (iB >= 0) {
                this.c[iB] = i;
                return;
            }
        } else {
            iB = -1;
        }
        int i2 = -(iB + 1);
        int i3 = this.a;
        Object[] objArr = this.b;
        if (i3 == objArr.length) {
            Object[] objArr2 = new Object[objArr.length * 2];
            int[] iArr = new int[objArr.length * 2];
            int i4 = i2 + 1;
            AbstractC5152hb.h(objArr, objArr2, i4, i2, i3);
            AbstractC5152hb.f(this.c, iArr, i4, i2, this.a);
            AbstractC5152hb.k(this.b, objArr2, 0, 0, i2, 6, null);
            AbstractC5152hb.j(this.c, iArr, 0, 0, i2, 6, null);
            this.b = objArr2;
            this.c = iArr;
        } else {
            int i5 = i2 + 1;
            AbstractC5152hb.h(objArr, objArr, i5, i2, i3);
            int[] iArr2 = this.c;
            AbstractC5152hb.f(iArr2, iArr2, i5, i2, this.a);
        }
        this.b[i2] = obj;
        this.c[i2] = i;
        this.a++;
    }

    public final int b(Object obj) {
        int i = this.a - 1;
        int iA = O2.a(obj);
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            Object obj2 = this.b[i3];
            int iA2 = O2.a(obj2);
            if (iA2 < iA) {
                i2 = i3 + 1;
            } else {
                if (iA2 <= iA) {
                    return obj2 == obj ? i3 : c(i3, obj, iA);
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
            java.lang.Object[] r1 = r2.b
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
            int r0 = r2.a
        L1a:
            if (r3 >= r0) goto L30
            java.lang.Object[] r1 = r2.b
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
            int r3 = r2.a
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.UX.c(int, java.lang.Object, int):int");
    }

    public final Object[] d() {
        return this.b;
    }

    public final int e() {
        return this.a;
    }

    public final int[] f() {
        return this.c;
    }

    public final void g(int i) {
        this.a = i;
    }
}
