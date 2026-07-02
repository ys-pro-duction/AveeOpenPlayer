package com.daaw;

import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.Ib2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1143Ib2 {
    public static final String e = Integer.toString(0, 36);
    public static final String f = Integer.toString(1, 36);
    public static final String g = Integer.toString(3, 36);
    public static final String h = Integer.toString(4, 36);
    public static final InterfaceC9666xh3 i = new InterfaceC9666xh3() { // from class: com.daaw.db2
    };
    public final int a;
    public final A62 b;
    public final int[] c;
    public final boolean[] d;

    public C1143Ib2(A62 a62, boolean z, int[] iArr, boolean[] zArr) {
        int i2 = a62.a;
        this.a = 1;
        this.b = a62;
        this.c = (int[]) iArr.clone();
        this.d = (boolean[]) zArr.clone();
    }

    public final int a() {
        return this.b.c;
    }

    public final C2485Ut1 b(int i2) {
        return this.b.b(0);
    }

    public final boolean c() {
        for (boolean z : this.d) {
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final boolean d(int i2) {
        return this.d[0];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1143Ib2.class == obj.getClass()) {
            C1143Ib2 c1143Ib2 = (C1143Ib2) obj;
            if (this.b.equals(c1143Ib2.b) && Arrays.equals(this.c, c1143Ib2.c) && Arrays.equals(this.d, c1143Ib2.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.b.hashCode() * 961) + Arrays.hashCode(this.c)) * 31) + Arrays.hashCode(this.d);
    }
}
