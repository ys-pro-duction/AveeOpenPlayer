package com.daaw;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: renamed from: com.daaw.xJ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9560xJ0 extends TR0 {
    public final SideSheetBehavior a;

    public C9560xJ0(SideSheetBehavior sideSheetBehavior) {
        this.a = sideSheetBehavior;
    }

    @Override // com.daaw.TR0
    public int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // com.daaw.TR0
    public float b(int i) {
        float fE = e();
        return (fE - i) / (fE - d());
    }

    @Override // com.daaw.TR0
    public int c(View view, float f, float f2) {
        if (f < 0.0f) {
            return 3;
        }
        if (l(view, f)) {
            return (k(f, f2) || j(view)) ? 5 : 3;
        }
        if (f != 0.0f && UR0.a(f, f2)) {
            return 5;
        }
        int left = view.getLeft();
        return Math.abs(left - d()) < Math.abs(left - e()) ? 3 : 5;
    }

    @Override // com.daaw.TR0
    public int d() {
        return Math.max(0, (e() - this.a.W()) - this.a.c0());
    }

    @Override // com.daaw.TR0
    public int e() {
        return this.a.e0();
    }

    @Override // com.daaw.TR0
    public int f(View view) {
        return view.getLeft() - this.a.c0();
    }

    @Override // com.daaw.TR0
    public int g() {
        return 0;
    }

    @Override // com.daaw.TR0
    public boolean h(View view, int i, boolean z) {
        int iD0 = this.a.d0(i);
        C3487be1 c3487be1G0 = this.a.g0();
        if (c3487be1G0 != null) {
            return z ? c3487be1G0.O(iD0, view.getTop()) : c3487be1G0.Q(view, iD0, view.getTop());
        }
        return false;
    }

    @Override // com.daaw.TR0
    public void i(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        int iE0 = this.a.e0();
        if (i <= iE0) {
            marginLayoutParams.rightMargin = iE0 - i;
        }
    }

    public final boolean j(View view) {
        return view.getLeft() > (e() - d()) / 2;
    }

    public final boolean k(float f, float f2) {
        return UR0.a(f, f2) && f2 > ((float) this.a.f0());
    }

    public boolean l(View view, float f) {
        return Math.abs(((float) view.getRight()) + (f * this.a.a0())) > this.a.b0();
    }
}
