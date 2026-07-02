package com.daaw;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class G02 {
    public static final String j = Integer.toString(0, 36);
    public static final String k = Integer.toString(1, 36);
    public static final String l = Integer.toString(2, 36);
    public static final String m = Integer.toString(3, 36);
    public static final String n = Integer.toString(4, 36);
    public static final String o = Integer.toString(5, 36);
    public static final String p = Integer.toString(6, 36);
    public static final InterfaceC9666xh3 q = new InterfaceC9666xh3() { // from class: com.daaw.e02
    };
    public final Object a;
    public final int b;
    public final YL1 c;
    public final Object d;
    public final int e;
    public final long f;
    public final long g;
    public final int h;
    public final int i;

    public G02(Object obj, int i, YL1 yl1, Object obj2, int i2, long j2, long j3, int i3, int i4) {
        this.a = obj;
        this.b = i;
        this.c = yl1;
        this.d = obj2;
        this.e = i2;
        this.f = j2;
        this.g = j3;
        this.h = i3;
        this.i = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && G02.class == obj.getClass()) {
            G02 g02 = (G02) obj;
            if (this.b == g02.b && this.e == g02.e && this.f == g02.f && this.g == g02.g && this.h == g02.h && this.i == g02.i && AbstractC3977dO2.a(this.a, g02.a) && AbstractC3977dO2.a(this.d, g02.d) && AbstractC3977dO2.a(this.c, g02.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), this.c, this.d, Integer.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(this.i)});
    }
}
