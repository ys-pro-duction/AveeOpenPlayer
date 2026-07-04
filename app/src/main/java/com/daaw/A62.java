package com.daaw;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class A62 {
    public static final String f = Integer.toString(0, 36);
    public static final String g = Integer.toString(1, 36);
    public static final InterfaceC9666xh3 h = new InterfaceC9666xh3() { // from class: com.daaw.V52
    };
    public final int a = 1;
    public final String b;
    public final int c;
    public final C2485Ut1[] d;
    public int e;

    public A62(String str, C2485Ut1... c2485Ut1Arr) {
        this.b = str;
        this.d = c2485Ut1Arr;
        int iB = AbstractC5959kT1.b(c2485Ut1Arr[0].l);
        this.c = iB == -1 ? AbstractC5959kT1.b(c2485Ut1Arr[0].k) : iB;
        d(c2485Ut1Arr[0].c);
        int i = c2485Ut1Arr[0].e;
    }

    public static String d(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    public final int a(C2485Ut1 c2485Ut1) {
        for (int i = 0; i <= 0; i++) {
            if (c2485Ut1 == this.d[i]) {
                return i;
            }
        }
        return -1;
    }

    public final C2485Ut1 b(int i) {
        return this.d[i];
    }

    public final A62 c(String str) {
        return new A62(str, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && A62.class == obj.getClass()) {
            A62 a62 = (A62) obj;
            if (this.b.equals(a62.b) && Arrays.equals(this.d, a62.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((this.b.hashCode() + 527) * 31) + Arrays.hashCode(this.d);
        this.e = iHashCode;
        return iHashCode;
    }
}
