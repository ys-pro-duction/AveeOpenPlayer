package com.daaw;

import java.lang.reflect.Array;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.daaw.Dt0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0693Dt0 {
    public static int p = 5236;
    public String h;
    public long i;
    public ByteBuffer a = ByteBuffer.allocate(20000);
    public final Object b = new Object();
    public int c = -1;
    public long d = -1;
    public int l = 0;
    public C4624fh n = new C4624fh();
    public byte[][] o = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 1, 0);
    public int j = 44100;
    public int k = 2;
    public int e = 0;
    public C6744nE0 f = null;
    public int g = 0;
    public long m = 0;

    public C0693Dt0(String str, long j) {
        this.h = str;
        this.i = j;
    }

    public final void a(int i, int i2, int i3) {
        this.j = i;
        this.k = i2;
        this.e = AbstractC1869Pb1.b(this.i, i2, i3, i);
        int i4 = 0;
        this.g = 0;
        C6744nE0 c6744nE0 = this.f;
        if (c6744nE0 != null) {
            c6744nE0.a();
        }
        do {
            C6744nE0 c6744nE0B = C6744nE0.b(this.h + i4, this.e + 5120);
            this.f = c6744nE0B;
            i4++;
            if (c6744nE0B != null) {
                break;
            }
        } while (i4 < 3);
        this.m = 0L;
    }

    public void b() {
        C6744nE0 c6744nE0 = this.f;
        if (c6744nE0 != null) {
            c6744nE0.a();
        }
        this.f = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e5, code lost:
    
        if (r7 == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.daaw.avee.comp.playback.a c(long r27, com.daaw.avee.comp.playback.a.h r29, com.daaw.avee.comp.playback.a r30, int r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 421
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C0693Dt0.c(long, com.daaw.avee.comp.playback.a$h, com.daaw.avee.comp.playback.a, int):com.daaw.avee.comp.playback.a");
    }

    public void d() {
        synchronized (this.b) {
            this.g = 0;
            this.m = 0L;
        }
    }

    public void e(ByteBuffer byteBuffer, long j, int i, int i2, int i3, int i4) {
        int i5;
        long jMax = Math.max(0L, j);
        if (this.c == i && this.d == jMax) {
            return;
        }
        this.d = jMax;
        this.c = i;
        if (this.f != null && this.j == i2 && this.k == i3) {
            i5 = i4;
        } else {
            AbstractC0441Bk1.c("createRaf");
            synchronized (this.b) {
                i5 = i4;
                a(i2, i3, i5);
            }
        }
        if (this.f == null) {
            return;
        }
        int iLimit = byteBuffer.limit() - byteBuffer.position();
        int iB = AbstractC1869Pb1.b(jMax, this.k, i5, this.j) - iLimit;
        if (iB < 0) {
            AbstractC0441Bk1.c("startByte: " + iB + "; TimeUs: " + jMax);
        }
        if (iB < 0) {
            iB = 0;
        }
        int iPosition = byteBuffer.position();
        int iLimit2 = byteBuffer.limit();
        int iB2 = AbstractC1869Pb1.b(500000L, this.k, i4, this.j);
        synchronized (this.b) {
            try {
                if (this.f != null) {
                    long j2 = iB - this.g;
                    if (Math.abs(j2) < iB2) {
                        iB = this.g;
                    } else if (j2 != 0) {
                        AbstractC0441Bk1.c("newDataFillDelta: " + j2);
                    }
                    this.g = iLimit + iB;
                    this.f.d(iB, byteBuffer);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        byteBuffer.limit(iLimit2);
        byteBuffer.position(iPosition);
    }
}
