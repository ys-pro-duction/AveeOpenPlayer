package com.daaw;

import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: com.daaw.tn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C8570tn0 {
    public ViewParent a;
    public ViewParent b;
    public final View c;
    public boolean d;
    public int[] e;

    public C8570tn0(View view) {
        this.c = view;
    }

    public boolean a(float f, float f2, boolean z) {
        ViewParent viewParentH;
        if (!l() || (viewParentH = h(0)) == null) {
            return false;
        }
        return AbstractC0946Ge1.a(viewParentH, this.c, f, f2, z);
    }

    public boolean b(float f, float f2) {
        ViewParent viewParentH;
        if (!l() || (viewParentH = h(0)) == null) {
            return false;
        }
        return AbstractC0946Ge1.b(viewParentH, this.c, f, f2);
    }

    public boolean c(int i, int i2, int[] iArr, int[] iArr2) {
        return d(i, i2, iArr, iArr2, 0);
    }

    public boolean d(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent viewParentH;
        int i4;
        int i5;
        if (!l() || (viewParentH = h(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
            return false;
        }
        if (iArr2 != null) {
            this.c.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            iArr = i();
        }
        int[] iArr3 = iArr;
        iArr3[0] = 0;
        iArr3[1] = 0;
        AbstractC0946Ge1.c(viewParentH, this.c, i, i2, iArr3, i3);
        if (iArr2 != null) {
            this.c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public void e(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        g(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public boolean f(int i, int i2, int i3, int i4, int[] iArr) {
        return g(i, i2, i3, i4, iArr, 0, null);
    }

    public final boolean g(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent viewParentH;
        int i6;
        int i7;
        int[] iArr3;
        if (!l() || (viewParentH = h(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.c.getLocationInWindow(iArr);
            i6 = iArr[0];
            i7 = iArr[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (iArr2 == null) {
            int[] iArrI = i();
            iArrI[0] = 0;
            iArrI[1] = 0;
            iArr3 = iArrI;
        } else {
            iArr3 = iArr2;
        }
        AbstractC0946Ge1.d(viewParentH, this.c, i, i2, i3, i4, i5, iArr3);
        if (iArr != null) {
            this.c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i6;
            iArr[1] = iArr[1] - i7;
        }
        return true;
    }

    public final ViewParent h(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i != 1) {
            return null;
        }
        return this.b;
    }

    public final int[] i() {
        if (this.e == null) {
            this.e = new int[2];
        }
        return this.e;
    }

    public boolean j() {
        return k(0);
    }

    public boolean k(int i) {
        return h(i) != null;
    }

    public boolean l() {
        return this.d;
    }

    public void m(boolean z) {
        if (this.d) {
            AbstractC2317Td1.L0(this.c);
        }
        this.d = z;
    }

    public final void n(int i, ViewParent viewParent) {
        if (i == 0) {
            this.a = viewParent;
        } else {
            if (i != 1) {
                return;
            }
            this.b = viewParent;
        }
    }

    public boolean o(int i) {
        return p(i, 0);
    }

    public boolean p(int i, int i2) {
        if (k(i2)) {
            return true;
        }
        if (!l()) {
            return false;
        }
        View view = this.c;
        for (ViewParent parent = this.c.getParent(); parent != null; parent = parent.getParent()) {
            if (AbstractC0946Ge1.f(parent, view, this.c, i, i2)) {
                n(i2, parent);
                AbstractC0946Ge1.e(parent, view, this.c, i, i2);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    public void q() {
        r(0);
    }

    public void r(int i) {
        ViewParent viewParentH = h(i);
        if (viewParentH != null) {
            AbstractC0946Ge1.g(viewParentH, this.c, i);
            n(i, null);
        }
    }
}
