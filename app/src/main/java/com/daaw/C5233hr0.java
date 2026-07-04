package com.daaw;

import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.hr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C5233hr0 {
    public static final byte[][] c = {new byte[]{0, 0}, new byte[]{-128, 0}, new byte[]{-64, 0}, new byte[]{-32, 0}, new byte[]{-16, 0}, new byte[]{-8, 0}, new byte[]{-4, 0}, new byte[]{-2, 0}, new byte[]{-1, 0}, new byte[]{-1, -128}, new byte[]{-1, -64}};
    public int b = 0;
    public byte[] a = new byte[1024];

    public byte[] a() {
        return Arrays.copyOf(this.a, this.b);
    }

    public final void b(int i) {
        int i2 = i + this.b;
        byte[] bArr = this.a;
        if (i2 <= bArr.length) {
            return;
        }
        int length = bArr.length * 2;
        if (length >= i2) {
            i2 = length;
        }
        this.a = Arrays.copyOf(bArr, i2);
    }

    public void c(byte[] bArr) {
        b(bArr.length);
        for (byte b : bArr) {
            byte[] bArr2 = this.a;
            int i = this.b;
            this.b = i + 1;
            bArr2[i] = b;
        }
    }

    public final int d(long j) {
        if (j < 0) {
            j = ~j;
        }
        return C00.a(65 - Long.numberOfLeadingZeros(j), 7, RoundingMode.UP);
    }

    public final int e(long j) {
        return C00.a(64 - Long.numberOfLeadingZeros(j), 8, RoundingMode.UP);
    }

    public final void f(byte b) {
        if (b == 0) {
            l((byte) 0);
            l((byte) -1);
        } else if (b != -1) {
            l(b);
        } else {
            l((byte) -1);
            l((byte) 0);
        }
    }

    public final void g(byte b) {
        if (b == 0) {
            m((byte) 0);
            m((byte) -1);
        } else if (b != -1) {
            m(b);
        } else {
            m((byte) -1);
            m((byte) 0);
        }
    }

    public void h(AbstractC4340ei abstractC4340ei) {
        for (int i = 0; i < abstractC4340ei.size(); i++) {
            f(abstractC4340ei.w(i));
        }
        p();
    }

    public void i(AbstractC4340ei abstractC4340ei) {
        for (int i = 0; i < abstractC4340ei.size(); i++) {
            g(abstractC4340ei.w(i));
        }
        q();
    }

    public void j(double d) {
        long jDoubleToLongBits = Double.doubleToLongBits(d);
        t(jDoubleToLongBits ^ (jDoubleToLongBits < 0 ? -1L : Long.MIN_VALUE));
    }

    public void k(double d) {
        long jDoubleToLongBits = Double.doubleToLongBits(d);
        u(jDoubleToLongBits ^ (jDoubleToLongBits < 0 ? -1L : Long.MIN_VALUE));
    }

    public final void l(byte b) {
        b(1);
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        bArr[i] = b;
    }

    public final void m(byte b) {
        b(1);
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        bArr[i] = (byte) (~b);
    }

    public void n() {
        l((byte) -1);
        l((byte) -1);
    }

    public void o() {
        m((byte) -1);
        m((byte) -1);
    }

    public final void p() {
        l((byte) 0);
        l((byte) 1);
    }

    public final void q() {
        m((byte) 0);
        m((byte) 1);
    }

    public void r(long j) {
        int i;
        long j2 = j < 0 ? ~j : j;
        if (j2 < 64) {
            b(1);
            byte[] bArr = this.a;
            int i2 = this.b;
            this.b = i2 + 1;
            bArr[i2] = (byte) (j ^ ((long) c[1][0]));
            return;
        }
        int iD = d(j2);
        b(iD);
        if (iD < 2) {
            throw new AssertionError(String.format("Invalid length (%d) returned by signedNumLength", Integer.valueOf(iD)));
        }
        byte b = j < 0 ? (byte) -1 : (byte) 0;
        int i3 = this.b;
        if (iD == 10) {
            i = 2 + i3;
            byte[] bArr2 = this.a;
            bArr2[i3] = b;
            bArr2[i3 + 1] = b;
        } else if (iD == 9) {
            i = i3 + 1;
            this.a[i3] = b;
        } else {
            i = i3;
        }
        for (int i4 = (iD - 1) + i3; i4 >= i; i4--) {
            this.a[i4] = (byte) (255 & j);
            j >>= 8;
        }
        byte[] bArr3 = this.a;
        int i5 = this.b;
        byte b2 = bArr3[i5];
        byte[] bArr4 = c[iD];
        bArr3[i5] = (byte) (b2 ^ bArr4[0]);
        int i6 = i5 + 1;
        bArr3[i6] = (byte) (bArr4[1] ^ bArr3[i6]);
        this.b = i5 + iD;
    }

    public void s(long j) {
        r(~j);
    }

    public void t(long j) {
        int iE = e(j);
        b(iE + 1);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        bArr[i] = (byte) iE;
        int i3 = i2 + iE;
        while (true) {
            i3--;
            int i4 = this.b;
            if (i3 < i4) {
                this.b = i4 + iE;
                return;
            } else {
                this.a[i3] = (byte) (255 & j);
                j >>>= 8;
            }
        }
    }

    public void u(long j) {
        int iE = e(j);
        b(iE + 1);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        bArr[i] = (byte) (~iE);
        int i3 = i2 + iE;
        while (true) {
            i3--;
            int i4 = this.b;
            if (i3 < i4) {
                this.b = i4 + iE;
                return;
            } else {
                this.a[i3] = (byte) (~(255 & j));
                j >>>= 8;
            }
        }
    }

    public void v(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt < 128) {
                f((byte) cCharAt);
            } else if (cCharAt < 2048) {
                f((byte) ((cCharAt >>> 6) | 960));
                f((byte) ((cCharAt & '?') | 128));
            } else if (cCharAt < 55296 || 57343 < cCharAt) {
                f((byte) ((cCharAt >>> '\f') | 480));
                f((byte) (((cCharAt >>> 6) & 63) | 128));
                f((byte) ((cCharAt & '?') | 128));
            } else {
                int iCodePointAt = Character.codePointAt(charSequence, i);
                i++;
                f((byte) ((iCodePointAt >>> 18) | 240));
                f((byte) (((iCodePointAt >>> 12) & 63) | 128));
                f((byte) (((iCodePointAt >>> 6) & 63) | 128));
                f((byte) ((iCodePointAt & 63) | 128));
            }
            i++;
        }
        p();
    }

    public void w(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt < 128) {
                g((byte) cCharAt);
            } else if (cCharAt < 2048) {
                g((byte) ((cCharAt >>> 6) | 960));
                g((byte) ((cCharAt & '?') | 128));
            } else if (cCharAt < 55296 || 57343 < cCharAt) {
                g((byte) ((cCharAt >>> '\f') | 480));
                g((byte) (((cCharAt >>> 6) & 63) | 128));
                g((byte) ((cCharAt & '?') | 128));
            } else {
                int iCodePointAt = Character.codePointAt(charSequence, i);
                i++;
                g((byte) ((iCodePointAt >>> 18) | 240));
                g((byte) (((iCodePointAt >>> 12) & 63) | 128));
                g((byte) (((iCodePointAt >>> 6) & 63) | 128));
                g((byte) ((iCodePointAt & 63) | 128));
            }
            i++;
        }
        q();
    }
}
