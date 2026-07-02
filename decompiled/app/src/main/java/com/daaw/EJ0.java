package com.daaw;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class EJ0 extends ViewGroup {
    public final int B;
    public final List C;
    public final List D;
    public final GJ0 E;
    public int F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EJ0(Context context) {
        super(context);
        G10.g(context, "context");
        this.B = 5;
        ArrayList arrayList = new ArrayList();
        this.C = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.D = arrayList2;
        this.E = new GJ0();
        setClipChildren(false);
        IJ0 ij0 = new IJ0(context);
        addView(ij0);
        arrayList.add(ij0);
        arrayList2.add(ij0);
        this.F = 1;
        setTag(AbstractC6740nD0.J, Boolean.TRUE);
    }

    public final void a(C7822r6 c7822r6) {
        G10.g(c7822r6, "<this>");
        c7822r6.n();
        IJ0 ij0B = this.E.b(c7822r6);
        if (ij0B != null) {
            ij0B.d();
            this.E.c(c7822r6);
            this.D.add(ij0B);
        }
    }

    public final IJ0 b(C7822r6 c7822r6) {
        G10.g(c7822r6, "<this>");
        IJ0 ij0B = this.E.b(c7822r6);
        if (ij0B != null) {
            return ij0B;
        }
        IJ0 ij0 = (IJ0) AbstractC2141Rm.I(this.D);
        if (ij0 == null) {
            if (this.F > AbstractC1599Mm.m(this.C)) {
                Context context = getContext();
                G10.f(context, "context");
                ij0 = new IJ0(context);
                addView(ij0);
                this.C.add(ij0);
            } else {
                ij0 = (IJ0) this.C.get(this.F);
                C7822r6 c7822r6A = this.E.a(ij0);
                if (c7822r6A != null) {
                    c7822r6A.n();
                    this.E.c(c7822r6A);
                    ij0.d();
                }
            }
            int i = this.F;
            if (i < this.B - 1) {
                this.F = i + 1;
            } else {
                this.F = 0;
            }
        }
        this.E.d(c7822r6, ij0);
        return ij0;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
