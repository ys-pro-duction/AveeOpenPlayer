package com.daaw;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import java.io.IOException;
import java.io.OutputStream;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: com.daaw.a7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C3067a7 {
    public int a;
    public int b;
    public int d;
    public OutputStream h;
    public Bitmap i;
    public byte[] j;
    public byte[] k;
    public int l;
    public byte[] m;
    public boolean u;
    public Integer c = null;
    public int e = -1;
    public int f = 0;
    public boolean g = false;
    public boolean[] n = new boolean[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
    public int o = 7;
    public int p = -1;
    public boolean q = false;
    public boolean r = true;
    public boolean s = false;
    public int t = 10;

    public boolean a(Bitmap bitmap) {
        if (bitmap != null && this.g) {
            try {
                if (!this.s) {
                    g(bitmap.getWidth(), bitmap.getHeight());
                }
                this.i = bitmap;
                e();
                b();
                if (this.r) {
                    k();
                    m();
                    if (this.e >= 0) {
                        l();
                    }
                }
                i();
                j();
                if (!this.r) {
                    m();
                }
                n();
                this.r = false;
                return true;
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public final void b() {
        byte[] bArr = this.j;
        int length = bArr.length;
        int i = length / 3;
        this.k = new byte[i];
        C1397Kn0 c1397Kn0 = new C1397Kn0(bArr, length, this.t);
        this.m = c1397Kn0.h();
        int i2 = 0;
        while (true) {
            byte[] bArr2 = this.m;
            if (i2 >= bArr2.length) {
                break;
            }
            byte b = bArr2[i2];
            int i3 = i2 + 2;
            bArr2[i2] = bArr2[i3];
            bArr2[i3] = b;
            this.n[i2 / 3] = false;
            i2 += 3;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            byte[] bArr3 = this.j;
            int i6 = bArr3[i4] & 255;
            int i7 = i4 + 2;
            int i8 = bArr3[i4 + 1] & 255;
            i4 += 3;
            int iG = c1397Kn0.g(i6, i8, bArr3[i7] & 255);
            this.n[iG] = true;
            this.k[i5] = (byte) iG;
        }
        this.j = null;
        this.l = 8;
        this.o = 7;
        Integer num = this.c;
        if (num != null) {
            this.d = c(num.intValue());
        } else if (this.u) {
            this.d = c(0);
        }
    }

    public final int c(int i) {
        if (this.m == null) {
            return -1;
        }
        int iRed = Color.red(i);
        int iGreen = Color.green(i);
        int iBlue = Color.blue(i);
        int length = this.m.length;
        int i2 = 0;
        int i3 = 16777216;
        for (int i4 = 0; i4 < length; i4 += 3) {
            byte[] bArr = this.m;
            int i5 = iRed - (bArr[i4] & 255);
            int i6 = i4 + 2;
            int i7 = iGreen - (bArr[i4 + 1] & 255);
            int i8 = iBlue - (bArr[i6] & 255);
            int i9 = (i5 * i5) + (i7 * i7) + (i8 * i8);
            int i10 = i6 / 3;
            if (this.n[i10] && i9 < i3) {
                i3 = i9;
                i2 = i10;
            }
        }
        return i2;
    }

    public boolean d() {
        boolean z;
        if (!this.g) {
            return false;
        }
        this.g = false;
        try {
            this.h.write(59);
            this.h.flush();
            if (this.q) {
                this.h.close();
            }
            z = true;
        } catch (IOException unused) {
            z = false;
        }
        this.d = 0;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.m = null;
        this.q = false;
        this.r = true;
        return z;
    }

    public final void e() {
        int width = this.i.getWidth();
        int height = this.i.getHeight();
        int i = this.a;
        if (width != i || height != this.b) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, this.b, Bitmap.Config.ARGB_8888);
            new Canvas(bitmapCreateBitmap).drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, (Paint) null);
            this.i = bitmapCreateBitmap;
        }
        int i2 = width * height;
        int[] iArr = new int[i2];
        this.i.getPixels(iArr, 0, width, 0, 0, width, height);
        this.j = new byte[i2 * 3];
        this.u = false;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = iArr[i5];
            if (i6 == 0) {
                i3++;
            }
            byte[] bArr = this.j;
            bArr[i4] = (byte) (i6 & 255);
            int i7 = i4 + 2;
            bArr[i4 + 1] = (byte) ((i6 >> 8) & 255);
            i4 += 3;
            bArr[i7] = (byte) ((i6 >> 16) & 255);
        }
        this.u = ((double) (i3 * 100)) / ((double) i2) > 4.0d;
    }

    public void f(int i) {
        this.f = Math.round(i / 10.0f);
    }

    public void g(int i, int i2) {
        if (!this.g || this.r) {
            this.a = i;
            this.b = i2;
            if (i < 1) {
                this.a = 320;
            }
            if (i2 < 1) {
                this.b = 240;
            }
            this.s = true;
        }
    }

    public boolean h(OutputStream outputStream) {
        boolean z = false;
        if (outputStream == null) {
            return false;
        }
        this.q = false;
        this.h = outputStream;
        try {
            p("GIF89a");
            z = true;
        } catch (IOException unused) {
        }
        this.g = z;
        return z;
    }

    public final void i() throws IOException {
        int i;
        int i2;
        this.h.write(33);
        this.h.write(249);
        this.h.write(4);
        if (this.c != null || this.u) {
            i = 1;
            i2 = 2;
        } else {
            i = 0;
            i2 = 0;
        }
        int i3 = this.p;
        if (i3 >= 0) {
            i2 = i3 & 7;
        }
        this.h.write(i | (i2 << 2));
        o(this.f);
        this.h.write(this.d);
        this.h.write(0);
    }

    public final void j() throws IOException {
        this.h.write(44);
        o(0);
        o(0);
        o(this.a);
        o(this.b);
        if (this.r) {
            this.h.write(0);
        } else {
            this.h.write(this.o | 128);
        }
    }

    public final void k() throws IOException {
        o(this.a);
        o(this.b);
        this.h.write(this.o | 240);
        this.h.write(0);
        this.h.write(0);
    }

    public final void l() throws IOException {
        this.h.write(33);
        this.h.write(255);
        this.h.write(11);
        p("NETSCAPE2.0");
        this.h.write(3);
        this.h.write(1);
        o(this.e);
        this.h.write(0);
    }

    public final void m() throws IOException {
        OutputStream outputStream = this.h;
        byte[] bArr = this.m;
        outputStream.write(bArr, 0, bArr.length);
        int length = 768 - this.m.length;
        for (int i = 0; i < length; i++) {
            this.h.write(0);
        }
    }

    public final void n() throws IOException {
        new C3635c90(this.a, this.b, this.k, this.l).f(this.h);
    }

    public final void o(int i) throws IOException {
        this.h.write(i & 255);
        this.h.write((i >> 8) & 255);
    }

    public final void p(String str) throws IOException {
        for (int i = 0; i < str.length(); i++) {
            this.h.write((byte) str.charAt(i));
        }
    }
}
