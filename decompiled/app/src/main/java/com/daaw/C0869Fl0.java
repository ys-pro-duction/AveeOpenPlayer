package com.daaw;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Fl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C0869Fl0 extends VK {
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public Map i;
    public int j;
    public double k;
    public String l;
    public String m;
    public String n;
    public String o;
    public int p;
    public boolean q;
    public boolean r;
    public String s;
    public SW t;
    public YW u;
    public byte[] v;
    public boolean w;

    public C0869Fl0(String str) throws IOException {
        super(str);
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.h = 0;
        this.i = new HashMap();
        this.k = 0.0d;
        h(65536, true);
    }

    public final void c(int i) {
        Integer num = new Integer(i);
        C4361em0 c4361em0 = (C4361em0) this.i.get(num);
        if (c4361em0 != null) {
            c4361em0.a();
        } else {
            this.i.put(num, new C4361em0(1));
        }
        double d = this.k;
        int i2 = this.h;
        this.k = ((d * ((double) (i2 - 1))) + ((double) i)) / ((double) i2);
    }

    public YW d() {
        return this.u;
    }

    public boolean e() {
        return this.t != null;
    }

    public boolean f() {
        return this.u != null;
    }

    public boolean g() {
        return this.e >= 0;
    }

    public final void h(int i, boolean z) throws IOException {
        if (i < 41) {
            throw new IllegalArgumentException("Buffer too small");
        }
        this.d = i;
        this.w = z;
        RandomAccessFile randomAccessFile = new RandomAccessFile(this.a.getPath(), "r");
        try {
            j(randomAccessFile);
            r(randomAccessFile);
            if (this.f < 0) {
                throw new M10("No mpegs frames found");
            }
            k(randomAccessFile);
            if (z) {
                i(randomAccessFile);
            }
            randomAccessFile.close();
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void i(RandomAccessFile randomAccessFile) throws IOException {
        int iA = (int) (a() - ((long) (this.g + 1)));
        if (e()) {
            iA -= 128;
        }
        if (iA <= 0) {
            this.v = null;
            return;
        }
        this.v = new byte[iA];
        randomAccessFile.seek(this.g + 1);
        if (randomAccessFile.read(this.v, 0, iA) < iA) {
            throw new IOException("Not enough bytes read");
        }
    }

    public final void j(RandomAccessFile randomAccessFile) throws IOException {
        byte[] bArr = new byte[128];
        randomAccessFile.seek(a() - 128);
        if (randomAccessFile.read(bArr, 0, 128) < 128) {
            throw new IOException("Not enough bytes read");
        }
        try {
            this.t = new TW(bArr);
        } catch (C6344lo0 unused) {
            this.t = null;
        }
    }

    public final void k(RandomAccessFile randomAccessFile) throws IOException {
        if (this.e == 0 || this.f == 0) {
            this.u = null;
            return;
        }
        int i = g() ? this.e : this.f;
        byte[] bArr = new byte[i];
        randomAccessFile.seek(0L);
        if (randomAccessFile.read(bArr, 0, i) < i) {
            throw new IOException("Not enough bytes read");
        }
        try {
            this.u = AbstractC4288eX.b(bArr);
        } catch (C6344lo0 unused) {
            this.u = null;
        }
    }

    public final boolean l(byte[] bArr, int i) {
        int i2 = i + 13;
        if (bArr.length < i + 16) {
            return false;
        }
        if ("Xing".equals(AbstractC6308lh.c(bArr, i2, 4)) || "Info".equals(AbstractC6308lh.c(bArr, i2, 4))) {
            return true;
        }
        int i3 = i + 21;
        if (bArr.length < i + 24) {
            return false;
        }
        if ("Xing".equals(AbstractC6308lh.c(bArr, i3, 4)) || "Info".equals(AbstractC6308lh.c(bArr, i3, 4))) {
            return true;
        }
        int i4 = i + 36;
        if (bArr.length >= i + 39) {
            return "Xing".equals(AbstractC6308lh.c(bArr, i4, 4)) || "Info".equals(AbstractC6308lh.c(bArr, i4, 4));
        }
        return false;
    }

    public final int m() {
        int iA = (int) a();
        return e() ? iA - 128 : iA;
    }

    public int n(RandomAccessFile randomAccessFile) {
        byte[] bArr = new byte[10];
        try {
            randomAccessFile.seek(0L);
            if (randomAccessFile.read(bArr, 0, 10) == 10) {
                AbstractC4288eX.c(bArr);
                return AbstractC6308lh.m(bArr[6], bArr[7], bArr[8], bArr[9]) + 10;
            }
        } catch (C5428ia1 | C6344lo0 | IOException unused) {
        }
        return 0;
    }

    public final void o(C1493Ll0 c1493Ll0, int i) throws M10 {
        if (this.p != c1493Ll0.h()) {
            throw new M10("Inconsistent frame header");
        }
        if (!this.n.equals(c1493Ll0.e())) {
            throw new M10("Inconsistent frame header");
        }
        if (!this.s.equals(c1493Ll0.i())) {
            throw new M10("Inconsistent frame header");
        }
        if (i + c1493Ll0.f() > a()) {
            throw new M10("Frame would extend beyond end of file");
        }
    }

    public final int p(byte[] bArr, int i, int i2, int i3) throws M10 {
        while (i3 < i - 40) {
            C1493Ll0 c1493Ll0 = new C1493Ll0(bArr[i3], bArr[i3 + 1], bArr[i3 + 2], bArr[i3 + 3]);
            o(c1493Ll0, i2 + i3);
            if ((c1493Ll0.f() + r1) - 1 >= m()) {
                break;
            }
            this.g = (r1 + c1493Ll0.f()) - 1;
            this.h++;
            c(c1493Ll0.b());
            i3 += c1493Ll0.f();
        }
        return i3;
    }

    public final int q(byte[] bArr, int i, int i2, int i3) {
        C1493Ll0 c1493Ll0;
        while (i3 < i - 40) {
            if (bArr[i3] == -1) {
                int i4 = i3 + 1;
                if ((bArr[i4] & (-32)) == -32) {
                    try {
                        c1493Ll0 = new C1493Ll0(bArr[i3], bArr[i4], bArr[i3 + 2], bArr[i3 + 3]);
                    } catch (M10 unused) {
                        i3 = i4;
                    }
                    if (this.e >= 0 || !l(bArr, i3)) {
                        this.f = i2 + i3;
                        this.l = c1493Ll0.c();
                        this.m = c1493Ll0.d();
                        this.n = c1493Ll0.e();
                        this.o = c1493Ll0.g();
                        this.p = c1493Ll0.h();
                        this.s = c1493Ll0.i();
                        this.q = c1493Ll0.j();
                        this.r = c1493Ll0.k();
                        this.h++;
                        c(c1493Ll0.b());
                        return i3 + c1493Ll0.f();
                    }
                    this.e = i2 + i3;
                    this.j = c1493Ll0.b();
                    i3 += c1493Ll0.f();
                }
            }
            i3++;
        }
        return i3;
    }

    public final void r(RandomAccessFile randomAccessFile) throws M10, IOException {
        int iQ;
        byte[] bArr = new byte[this.d];
        int iN = n(randomAccessFile);
        randomAccessFile.seek(iN);
        int i = iN;
        while (true) {
            boolean z = false;
            while (!z) {
                int i2 = randomAccessFile.read(bArr, 0, this.d);
                if (i2 < this.d) {
                    z = true;
                }
                if (i2 >= 40) {
                    try {
                        if (this.f < 0) {
                            iQ = q(bArr, i2, iN, 0);
                            int i3 = this.f;
                            if (i3 >= 0 && !this.w) {
                                return;
                            } else {
                                i = i3;
                            }
                        } else {
                            iQ = 0;
                        }
                        iN += p(bArr, i2, iN, iQ);
                        randomAccessFile.seek(iN);
                    } catch (M10 e) {
                        if (this.h >= 2) {
                            return;
                        }
                        this.f = -1;
                        this.e = -1;
                        this.h = 0;
                        this.i.clear();
                        int i4 = i + 1;
                        if (i4 == 0) {
                            throw new M10("Valid start of mpeg frames not found", e);
                        }
                        randomAccessFile.seek(i4);
                        iN = i4;
                    }
                }
            }
            return;
        }
    }
}
