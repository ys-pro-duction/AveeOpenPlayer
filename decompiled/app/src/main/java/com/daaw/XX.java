package com.daaw;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class XX {
    public int[] a;
    public Object[] b;
    public WX[] c;
    public int d;

    public XX() {
        int[] iArr = new int[50];
        for (int i = 0; i < 50; i++) {
            iArr[i] = i;
        }
        this.a = iArr;
        this.b = new Object[50];
        this.c = new WX[50];
    }

    public final boolean c(Object obj, Object obj2) {
        G10.g(obj, "value");
        G10.g(obj2, "scope");
        return h(obj).add(obj2);
    }

    public final void d() {
        int length = this.c.length;
        for (int i = 0; i < length; i++) {
            WX wx = this.c[i];
            if (wx != null) {
                wx.clear();
            }
            this.a[i] = i;
            this.b[i] = null;
        }
        this.d = 0;
    }

    public final boolean e(Object obj) {
        G10.g(obj, "element");
        return f(obj) >= 0;
    }

    public final int f(Object obj) {
        int iA = O2.a(obj);
        int i = this.d - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            Object obj2 = this.b[this.a[i3]];
            G10.d(obj2);
            int iA2 = O2.a(obj2);
            if (iA2 < iA) {
                i2 = i3 + 1;
            } else {
                if (iA2 <= iA) {
                    return obj == obj2 ? i3 : g(i3, obj, iA);
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        return -(r4 + 1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(int r4, java.lang.Object r5, int r6) {
        /*
            r3 = this;
            int r0 = r4 + (-1)
        L2:
            r1 = -1
            if (r1 >= r0) goto L1d
            java.lang.Object[] r1 = r3.b
            int[] r2 = r3.a
            r2 = r2[r0]
            r1 = r1[r2]
            com.daaw.G10.d(r1)
            if (r1 != r5) goto L13
            return r0
        L13:
            int r1 = com.daaw.O2.a(r1)
            if (r1 == r6) goto L1a
            goto L1d
        L1a:
            int r0 = r0 + (-1)
            goto L2
        L1d:
            int r4 = r4 + 1
            int r0 = r3.d
        L21:
            if (r4 >= r0) goto L3e
            java.lang.Object[] r1 = r3.b
            int[] r2 = r3.a
            r2 = r2[r4]
            r1 = r1[r2]
            com.daaw.G10.d(r1)
            if (r1 != r5) goto L31
            return r4
        L31:
            int r1 = com.daaw.O2.a(r1)
            if (r1 == r6) goto L3b
        L37:
            int r4 = r4 + 1
            int r4 = -r4
            return r4
        L3b:
            int r4 = r4 + 1
            goto L21
        L3e:
            int r4 = r3.d
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.XX.g(int, java.lang.Object, int):int");
    }

    public final WX h(Object obj) {
        int iF;
        if (this.d > 0) {
            iF = f(obj);
            if (iF >= 0) {
                return o(iF);
            }
        } else {
            iF = -1;
        }
        int i = -(iF + 1);
        int i2 = this.d;
        int[] iArr = this.a;
        if (i2 < iArr.length) {
            int i3 = iArr[i2];
            this.b[i3] = obj;
            WX wx = this.c[i3];
            if (wx == null) {
                wx = new WX();
                this.c[i3] = wx;
            }
            int i4 = this.d;
            if (i < i4) {
                int[] iArr2 = this.a;
                AbstractC5152hb.f(iArr2, iArr2, i + 1, i, i4);
            }
            this.a[i] = i3;
            this.d++;
            return wx;
        }
        int length = iArr.length * 2;
        Object[] objArrCopyOf = Arrays.copyOf(this.c, length);
        G10.f(objArrCopyOf, "copyOf(this, newSize)");
        this.c = (WX[]) objArrCopyOf;
        WX wx2 = new WX();
        this.c[i2] = wx2;
        Object[] objArrCopyOf2 = Arrays.copyOf(this.b, length);
        G10.f(objArrCopyOf2, "copyOf(this, newSize)");
        this.b = objArrCopyOf2;
        objArrCopyOf2[i2] = obj;
        int[] iArr3 = new int[length];
        int i5 = this.d;
        while (true) {
            i5++;
            if (i5 >= length) {
                break;
            }
            iArr3[i5] = i5;
        }
        int i6 = this.d;
        if (i < i6) {
            AbstractC5152hb.f(this.a, iArr3, i + 1, i, i6);
        }
        iArr3[i] = i2;
        if (i > 0) {
            AbstractC5152hb.j(this.a, iArr3, 0, 0, i, 6, null);
        }
        this.a = iArr3;
        this.d++;
        return wx2;
    }

    public final WX[] i() {
        return this.c;
    }

    public final int j() {
        return this.d;
    }

    public final int[] k() {
        return this.a;
    }

    public final Object[] l() {
        return this.b;
    }

    public final boolean m(Object obj, Object obj2) {
        int i;
        WX wx;
        G10.g(obj, "value");
        G10.g(obj2, "scope");
        int iF = f(obj);
        if (iF < 0 || (wx = this.c[(i = this.a[iF])]) == null) {
            return false;
        }
        boolean zRemove = wx.remove(obj2);
        if (wx.size() == 0) {
            int i2 = iF + 1;
            int i3 = this.d;
            if (i2 < i3) {
                int[] iArr = this.a;
                AbstractC5152hb.f(iArr, iArr, iF, i2, i3);
            }
            int[] iArr2 = this.a;
            int i4 = this.d;
            iArr2[i4 - 1] = i;
            this.b[i] = null;
            this.d = i4 - 1;
        }
        return zRemove;
    }

    public final void n(Object obj) {
        G10.g(obj, "scope");
        int iJ = j();
        int i = 0;
        for (int i2 = 0; i2 < iJ; i2++) {
            int i3 = k()[i2];
            WX wx = i()[i3];
            G10.d(wx);
            wx.remove(obj);
            if (wx.size() > 0) {
                if (i != i2) {
                    int i4 = k()[i];
                    k()[i] = i3;
                    k()[i2] = i4;
                }
                i++;
            }
        }
        int iJ2 = j();
        for (int i5 = i; i5 < iJ2; i5++) {
            l()[k()[i5]] = null;
        }
        p(i);
    }

    public final WX o(int i) {
        WX wx = this.c[this.a[i]];
        G10.d(wx);
        return wx;
    }

    public final void p(int i) {
        this.d = i;
    }
}
