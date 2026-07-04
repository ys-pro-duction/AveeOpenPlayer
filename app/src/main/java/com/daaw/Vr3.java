package com.daaw;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class Vr3 extends R92 {
    public static final String A0;
    public static final String B0;
    public static final String C0;
    public static final String D0;
    public static final String E0;
    public static final String F0;
    public static final String G0;
    public static final String H0;
    public static final String I0;
    public static final String J0;
    public static final String K0;
    public static final String L0;
    public static final String M0;
    public static final String N0;
    public static final String O0;
    public static final String P0;
    public static final InterfaceC9666xh3 Q0;
    public static final Vr3 w0;
    public static final Vr3 x0;
    public static final String y0;
    public static final String z0;
    public final boolean h0;
    public final boolean i0;
    public final boolean j0;
    public final boolean k0;
    public final boolean l0;
    public final boolean m0;
    public final boolean n0;
    public final boolean o0;
    public final boolean p0;
    public final boolean q0;
    public final boolean r0;
    public final boolean s0;
    public final boolean t0;
    public final SparseArray u0;
    public final SparseBooleanArray v0;

    static {
        Vr3 vr3 = new Vr3(new Tr3());
        w0 = vr3;
        x0 = vr3;
        y0 = Integer.toString(1000, 36);
        z0 = Integer.toString(1001, 36);
        A0 = Integer.toString(1002, 36);
        B0 = Integer.toString(1003, 36);
        C0 = Integer.toString(1004, 36);
        D0 = Integer.toString(1005, 36);
        E0 = Integer.toString(1006, 36);
        F0 = Integer.toString(1007, 36);
        G0 = Integer.toString(1008, 36);
        H0 = Integer.toString(1009, 36);
        I0 = Integer.toString(1010, 36);
        J0 = Integer.toString(1011, 36);
        K0 = Integer.toString(1012, 36);
        L0 = Integer.toString(1013, 36);
        M0 = Integer.toString(1014, 36);
        N0 = Integer.toString(1015, 36);
        O0 = Integer.toString(1016, 36);
        P0 = Integer.toString(1017, 36);
        Q0 = new InterfaceC9666xh3() { // from class: com.daaw.Rr3
        };
    }

    public static Vr3 d(Context context) {
        return new Vr3(new Tr3(context));
    }

    public final Tr3 c() {
        return new Tr3(this, null);
    }

    public final Wr3 e(int i, C6362lr3 c6362lr3) {
        Map map = (Map) this.u0.get(i);
        if (map != null) {
            AbstractC6314li0.a(map.get(c6362lr3));
        }
        return null;
    }

    @Override // com.daaw.R92
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Vr3.class == obj.getClass()) {
            Vr3 vr3 = (Vr3) obj;
            if (super.equals(vr3) && this.h0 == vr3.h0 && this.j0 == vr3.j0 && this.l0 == vr3.l0 && this.q0 == vr3.q0 && this.r0 == vr3.r0 && this.t0 == vr3.t0) {
                SparseBooleanArray sparseBooleanArray = this.v0;
                SparseBooleanArray sparseBooleanArray2 = vr3.v0;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            SparseArray sparseArray = this.u0;
                            SparseArray sparseArray2 = vr3.u0;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                for (int i2 = 0; i2 < size2; i2++) {
                                    int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                                    if (iIndexOfKey >= 0) {
                                        Map map = (Map) sparseArray.valueAt(i2);
                                        Map map2 = (Map) sparseArray2.valueAt(iIndexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                C6362lr3 c6362lr3 = (C6362lr3) entry.getKey();
                                                if (!map2.containsKey(c6362lr3) || !AbstractC9004vJ2.e(entry.getValue(), map2.get(c6362lr3))) {
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        } else {
                            if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean f(int i) {
        return this.v0.get(i);
    }

    public final boolean g(int i, C6362lr3 c6362lr3) {
        Map map = (Map) this.u0.get(i);
        return map != null && map.containsKey(c6362lr3);
    }

    @Override // com.daaw.R92
    public final int hashCode() {
        return (((((((((((((super.hashCode() + 31) * 31) + (this.h0 ? 1 : 0)) * 961) + (this.j0 ? 1 : 0)) * 961) + (this.l0 ? 1 : 0)) * 28629151) + (this.q0 ? 1 : 0)) * 31) + (this.r0 ? 1 : 0)) * 961) + (this.t0 ? 1 : 0)) * 31;
    }

    public Vr3(Tr3 tr3) {
        super(tr3);
        this.h0 = tr3.q;
        this.i0 = false;
        this.j0 = tr3.r;
        this.k0 = false;
        this.l0 = tr3.s;
        this.m0 = false;
        this.n0 = false;
        this.o0 = false;
        this.p0 = false;
        this.q0 = tr3.t;
        this.r0 = tr3.u;
        this.s0 = false;
        this.t0 = tr3.v;
        this.u0 = tr3.w;
        this.v0 = tr3.x;
    }
}
