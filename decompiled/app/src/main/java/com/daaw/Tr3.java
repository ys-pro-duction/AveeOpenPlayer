package com.daaw;

import android.content.Context;
import android.graphics.Point;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class Tr3 extends C7562q92 {
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public final SparseArray w;
    public final SparseBooleanArray x;

    public Tr3() {
        this.w = new SparseArray();
        this.x = new SparseBooleanArray();
        v();
    }

    @Override // com.daaw.C7562q92
    public final /* synthetic */ C7562q92 e(int i, int i2, boolean z) {
        super.e(i, i2, true);
        return this;
    }

    public final Tr3 o(int i, boolean z) {
        if (this.x.get(i) == z) {
            return this;
        }
        if (z) {
            this.x.put(i, true);
            return this;
        }
        this.x.delete(i);
        return this;
    }

    public final void v() {
        this.q = true;
        this.r = true;
        this.s = true;
        this.t = true;
        this.u = true;
        this.v = true;
    }

    public Tr3(Context context) {
        super.d(context);
        Point pointF = AbstractC9004vJ2.F(context);
        e(pointF.x, pointF.y, true);
        this.w = new SparseArray();
        this.x = new SparseBooleanArray();
        v();
    }

    public /* synthetic */ Tr3(Vr3 vr3, Sr3 sr3) {
        super(vr3);
        this.q = vr3.h0;
        this.r = vr3.j0;
        this.s = vr3.l0;
        this.t = vr3.q0;
        this.u = vr3.r0;
        this.v = vr3.t0;
        SparseArray sparseArray = vr3.u0;
        SparseArray sparseArray2 = new SparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), new HashMap((Map) sparseArray.valueAt(i)));
        }
        this.w = sparseArray2;
        this.x = vr3.v0.clone();
    }
}
