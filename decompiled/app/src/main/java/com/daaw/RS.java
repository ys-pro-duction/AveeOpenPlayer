package com.daaw;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes.dex */
public class RS {
    public ByteBuffer b;
    public QS c;
    public final byte[] a = new byte[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
    public int d = 0;

    public void a() {
        this.b = null;
        this.c = null;
    }

    public final boolean b() {
        return this.c.b != 0;
    }

    public QS c() {
        if (this.b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (b()) {
            return this.c;
        }
        j();
        if (!b()) {
            h();
            QS qs = this.c;
            if (qs.c < 0) {
                qs.b = 1;
            }
        }
        return this.c;
    }

    public final int d() {
        try {
            return this.b.get() & 255;
        } catch (Exception unused) {
            this.c.b = 1;
            return 0;
        }
    }

    public final void e() {
        this.c.d.a = m();
        this.c.d.b = m();
        this.c.d.c = m();
        this.c.d.d = m();
        int iD = d();
        boolean z = (iD & 128) != 0;
        int iPow = (int) Math.pow(2.0d, (iD & 7) + 1);
        MS ms = this.c.d;
        ms.e = (iD & 64) != 0;
        if (z) {
            ms.k = g(iPow);
        } else {
            ms.k = null;
        }
        this.c.d.j = this.b.position();
        q();
        if (b()) {
            return;
        }
        QS qs = this.c;
        qs.c++;
        qs.e.add(qs.d);
    }

    public final int f() {
        int iD = d();
        this.d = iD;
        int i = 0;
        if (iD > 0) {
            while (true) {
                try {
                    int i2 = this.d;
                    if (i >= i2) {
                        break;
                    }
                    int i3 = i2 - i;
                    this.b.get(this.a, i, i3);
                    i += i3;
                } catch (Exception unused) {
                    this.c.b = 1;
                }
            }
        }
        return i;
    }

    public final int[] g(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.b.get(bArr);
            iArr = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = bArr[i3] & 255;
                int i5 = i3 + 2;
                int i6 = bArr[i3 + 1] & 255;
                i3 += 3;
                int i7 = i2 + 1;
                iArr[i2] = (i6 << 8) | (i4 << 16) | (-16777216) | (bArr[i5] & 255);
                i2 = i7;
            }
            return iArr;
        } catch (BufferUnderflowException unused) {
            this.c.b = 1;
            return iArr;
        }
    }

    public final void h() {
        boolean z = false;
        while (!z && !b()) {
            int iD = d();
            if (iD == 33) {
                int iD2 = d();
                if (iD2 == 1) {
                    p();
                } else if (iD2 == 249) {
                    this.c.d = new MS();
                    i();
                } else if (iD2 == 254) {
                    p();
                } else if (iD2 != 255) {
                    p();
                } else {
                    f();
                    String str = "";
                    for (int i = 0; i < 11; i++) {
                        str = str + ((char) this.a[i]);
                    }
                    if (str.equals("NETSCAPE2.0")) {
                        l();
                    } else {
                        p();
                    }
                }
            } else if (iD == 44) {
                QS qs = this.c;
                if (qs.d == null) {
                    qs.d = new MS();
                }
                e();
            } else if (iD != 59) {
                this.c.b = 1;
            } else {
                z = true;
            }
        }
    }

    public final void i() {
        d();
        int iD = d();
        MS ms = this.c.d;
        int i = (iD & 28) >> 2;
        ms.g = i;
        if (i == 0) {
            ms.g = 1;
        }
        ms.f = (iD & 1) != 0;
        int iM = m();
        if (iM < 3) {
            iM = 10;
        }
        MS ms2 = this.c.d;
        ms2.i = iM * 10;
        ms2.h = d();
        d();
    }

    public final void j() {
        String str = "";
        for (int i = 0; i < 6; i++) {
            str = str + ((char) d());
        }
        if (!str.startsWith("GIF")) {
            this.c.b = 1;
            return;
        }
        k();
        if (!this.c.h || b()) {
            return;
        }
        QS qs = this.c;
        qs.a = g(qs.i);
        QS qs2 = this.c;
        qs2.l = qs2.a[qs2.j];
    }

    public final void k() {
        this.c.f = m();
        this.c.g = m();
        int iD = d();
        QS qs = this.c;
        qs.h = (iD & 128) != 0;
        qs.i = 2 << (iD & 7);
        qs.j = d();
        this.c.k = d();
    }

    public final void l() {
        do {
            f();
            byte[] bArr = this.a;
            if (bArr[0] == 1) {
                this.c.m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.d <= 0) {
                return;
            }
        } while (!b());
    }

    public final int m() {
        return this.b.getShort();
    }

    public final void n() {
        this.b = null;
        Arrays.fill(this.a, (byte) 0);
        this.c = new QS();
        this.d = 0;
    }

    public RS o(byte[] bArr) {
        n();
        if (bArr == null) {
            this.b = null;
            this.c.b = 2;
            return this;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        this.b = byteBufferWrap;
        byteBufferWrap.rewind();
        this.b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public final void p() {
        int iD;
        do {
            iD = d();
            ByteBuffer byteBuffer = this.b;
            byteBuffer.position(byteBuffer.position() + iD);
        } while (iD > 0);
    }

    public final void q() {
        d();
        p();
    }
}
