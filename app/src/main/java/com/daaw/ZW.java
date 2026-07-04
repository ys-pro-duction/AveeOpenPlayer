package com.daaw;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class ZW {
    public String a;
    public int b = 0;
    public byte[] c = null;
    public boolean d = false;
    public boolean e = false;
    public boolean f = false;
    public boolean g = false;
    public boolean h = false;
    public boolean i = false;
    public boolean j = false;
    public boolean k = false;

    public ZW(byte[] bArr, int i) throws M10 {
        g(bArr, i);
    }

    public byte[] a() {
        return this.c;
    }

    public String b() {
        return this.a;
    }

    public int c() {
        return this.b + 10;
    }

    public void d() throws M10 {
        for (int i = 0; i < this.a.length(); i++) {
            if ((this.a.charAt(i) < 'A' || this.a.charAt(i) > 'Z') && (this.a.charAt(i) < '0' || this.a.charAt(i) > '9')) {
                throw new M10("Not a valid frame - invalid tag " + this.a);
            }
        }
    }

    public void e(byte[] bArr, int i) {
        this.b = AbstractC6308lh.l(bArr[i + 4], bArr[i + 5], bArr[i + 6], bArr[i + 7]);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ZW zw = (ZW) obj;
        if (this.h != zw.h || !Arrays.equals(this.c, zw.c) || this.b != zw.b || this.k != zw.k || this.i != zw.i || this.g != zw.g) {
            return false;
        }
        String str = this.a;
        if (str == null) {
            if (zw.a != null) {
                return false;
            }
        } else if (!str.equals(zw.a)) {
            return false;
        }
        return this.e == zw.e && this.d == zw.d && this.f == zw.f && this.j == zw.j;
    }

    public final void f(byte[] bArr, int i) {
        int i2 = i + 8;
        this.d = AbstractC6308lh.d(bArr[i2], 6);
        this.e = AbstractC6308lh.d(bArr[i2], 5);
        this.f = AbstractC6308lh.d(bArr[i2], 4);
        int i3 = i + 9;
        this.g = AbstractC6308lh.d(bArr[i3], 6);
        this.h = AbstractC6308lh.d(bArr[i3], 3);
        this.i = AbstractC6308lh.d(bArr[i3], 2);
        this.j = AbstractC6308lh.d(bArr[i3], 1);
        this.k = AbstractC6308lh.d(bArr[i3], 0);
    }

    public final void g(byte[] bArr, int i) throws M10 {
        int iH = h(bArr, i);
        d();
        this.c = AbstractC6308lh.e(bArr, iH, this.b);
    }

    public int h(byte[] bArr, int i) {
        this.a = AbstractC6308lh.c(bArr, i, 4);
        e(bArr, i);
        f(bArr, i);
        return i + 10;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.h ? 1231 : 1237) + 31) * 31) + Arrays.hashCode(this.c)) * 31) + this.b) * 31) + (this.k ? 1231 : 1237)) * 31) + (this.i ? 1231 : 1237)) * 31) + (this.g ? 1231 : 1237)) * 31;
        String str = this.a;
        return ((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + (this.e ? 1231 : 1237)) * 31) + (this.d ? 1231 : 1237)) * 31) + (this.f ? 1231 : 1237)) * 31) + (this.j ? 1231 : 1237);
    }
}
