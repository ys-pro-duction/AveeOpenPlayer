package com.daaw;

import com.daaw.C1903Pk;

/* JADX INFO: renamed from: com.daaw.Ce, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0519Ce implements C1903Pk.b {
    public final int[] a;
    public final OM0[] b;

    public C0519Ce(int[] iArr, OM0[] om0Arr) {
        this.a = iArr;
        this.b = om0Arr;
    }

    @Override // com.daaw.C1903Pk.b
    public Z41 a(int i, int i2) {
        int i3 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i3 >= iArr.length) {
                return new JE();
            }
            if (i2 == iArr[i3]) {
                return this.b[i3];
            }
            i3++;
        }
    }

    public int[] b() {
        int[] iArr = new int[this.b.length];
        int i = 0;
        while (true) {
            OM0[] om0Arr = this.b;
            if (i >= om0Arr.length) {
                return iArr;
            }
            OM0 om0 = om0Arr[i];
            if (om0 != null) {
                iArr[i] = om0.t();
            }
            i++;
        }
    }

    public void c(long j) {
        for (OM0 om0 : this.b) {
            if (om0 != null) {
                om0.G(j);
            }
        }
    }
}
