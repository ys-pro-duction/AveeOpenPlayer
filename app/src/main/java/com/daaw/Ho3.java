package com.daaw;

import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class Ho3 {
    public static final Ho3 f = new Ho3(1, 2, 3, null);
    public static final Ho3 g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final InterfaceC9666xh3 l;
    public final int a;
    public final int b;
    public final int c;
    public final byte[] d;
    public int e;

    static {
        Cn3 cn3 = new Cn3();
        cn3.b(1);
        cn3.a(1);
        cn3.c(2);
        g = cn3.d();
        h = Integer.toString(0, 36);
        i = Integer.toString(1, 36);
        j = Integer.toString(2, 36);
        k = Integer.toString(3, 36);
        l = new InterfaceC9666xh3() { // from class: com.daaw.Ok3
        };
    }

    public Ho3(int i2, int i3, int i4, byte[] bArr) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = bArr;
    }

    public static int a(int i2) {
        if (i2 == 1) {
            return 1;
        }
        if (i2 != 9) {
            return (i2 == 4 || i2 == 5 || i2 == 6 || i2 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int b(int i2) {
        if (i2 == 1) {
            return 3;
        }
        if (i2 == 4) {
            return 10;
        }
        if (i2 == 13) {
            return 2;
        }
        if (i2 == 16) {
            return 6;
        }
        if (i2 != 18) {
            return (i2 == 6 || i2 == 7) ? 3 : -1;
        }
        return 7;
    }

    public static String f(int i2) {
        return i2 != -1 ? i2 != 1 ? i2 != 2 ? "Undefined color range" : "Limited range" : "Full range" : "Unset color range";
    }

    public static String g(int i2) {
        return i2 != -1 ? i2 != 6 ? i2 != 1 ? i2 != 2 ? "Undefined color space" : "BT601" : "BT709" : "BT2020" : "Unset color space";
    }

    public static String h(int i2) {
        return i2 != -1 ? i2 != 10 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 6 ? i2 != 7 ? "Undefined color transfer" : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    public final Cn3 c() {
        return new Cn3(this, null);
    }

    public final String d() {
        return !e() ? "NA" : String.format(Locale.US, "%s/%s/%s", g(this.a), f(this.b), h(this.c));
    }

    public final boolean e() {
        return (this.a == -1 || this.b == -1 || this.c == -1) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Ho3.class == obj.getClass()) {
            Ho3 ho3 = (Ho3) obj;
            if (this.a == ho3.a && this.b == ho3.b && this.c == ho3.c && Arrays.equals(this.d, ho3.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.e;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = ((((((this.a + 527) * 31) + this.b) * 31) + this.c) * 31) + Arrays.hashCode(this.d);
        this.e = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ColorInfo(");
        sb.append(g(this.a));
        sb.append(", ");
        sb.append(f(this.b));
        sb.append(", ");
        sb.append(h(this.c));
        sb.append(", ");
        sb.append(this.d != null);
        sb.append(")");
        return sb.toString();
    }
}
