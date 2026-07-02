package com.daaw;

import com.daaw.avee.comp.playback.a;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: com.daaw.bJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C3397bJ {
    public boolean a;
    public long b = 0;
    public Lock c = new ReentrantLock();
    public LinkedList d = new LinkedList();
    public volatile int e = 0;
    public boolean f = true;
    public int g = -1;
    public long h = -1;
    public long i = 0;
    public byte[][] j = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 1, 0);

    public final C4624fh a(int i, long j, long[] jArr, C4624fh c4624fh) {
        long j2 = Long.MAX_VALUE;
        C4624fh c4624fh2 = null;
        for (C4624fh c4624fh3 : this.d) {
            if (c4624fh != c4624fh3 && !c4624fh3.e()) {
                long j3 = j - c4624fh3.d;
                if (j3 >= -1 && j <= c4624fh3.a && j2 > j3) {
                    c4624fh2 = c4624fh3;
                    j2 = j3;
                }
            }
        }
        if (j2 < 0) {
            j2 = 0;
        }
        jArr[0] = j2;
        return c4624fh2;
    }

    public com.daaw.avee.comp.playback.a b(long j, a.h hVar, com.daaw.avee.comp.playback.a aVar, boolean z) throws Throwable {
        float[] fArr;
        char c;
        boolean zTryLock;
        float[] fArr2;
        float[] fArr3;
        long[] jArr;
        float[] fArr4;
        int i;
        float[] fArr5;
        long j2 = j + ((long) (hVar.b * 1000));
        if (!this.a) {
            aVar.a = false;
            return aVar;
        }
        aVar.k = false;
        aVar.m = j2;
        aVar.o = this.b;
        aVar.p = Long.MAX_VALUE;
        aVar.q = Long.MIN_VALUE;
        long[] jArr2 = new long[1];
        long[] jArr3 = new long[1];
        short[] sArr = new short[2];
        float[] fArr6 = {0.0f};
        try {
            zTryLock = this.c.tryLock(500L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            zTryLock = false;
        } catch (Exception e) {
            e = e;
            fArr = fArr6;
            c = 0;
            AbstractC0441Bk1.c("Exception: " + e.getMessage());
            fArr2 = fArr;
            aVar.d = sArr[c];
            aVar.e = sArr[1];
            aVar.g = (float) Math.sqrt((1.0f / aVar.b()) * fArr2[c]);
            aVar.a = true;
            return aVar;
        }
        if (zTryLock) {
            try {
                if (z) {
                    f();
                    fArr3 = fArr6;
                    c = 0;
                    fArr6 = fArr6;
                } else {
                    C4624fh c4624fhA = a(0, j2, jArr2, null);
                    if (c4624fhA != null) {
                        try {
                            int i2 = c4624fhA.b;
                            jArr = jArr3;
                            c = 0;
                            try {
                                aVar.d(i2, hVar.a, hVar.d, AbstractC1869Pb1.c(hVar.c, i2));
                            } catch (Throwable th) {
                                th = th;
                                fArr3 = fArr6;
                                this.c.unlock();
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            c = 0;
                            fArr3 = fArr6;
                            this.c.unlock();
                            throw th;
                        }
                    } else {
                        jArr = jArr3;
                        c = 0;
                    }
                    sArr[c] = aVar.d;
                    sArr[1] = aVar.e;
                    C4624fh c4624fhA2 = c4624fhA;
                    int i3 = 0;
                    int iD = 0;
                    fArr6 = fArr6;
                    while (true) {
                        if (c4624fhA2 == null) {
                            fArr4 = fArr6;
                            i = 2;
                            fArr5 = fArr6;
                            break;
                        }
                        fArr4 = fArr6;
                        try {
                            int iC = AbstractC1869Pb1.c(jArr2[c], c4624fhA2.b);
                            if (i3 > 0 && iC != 0) {
                                AbstractC0441Bk1.c("t[" + i3 + "]; startFrameOffsetBuffer != 0; totalSamplesGot: " + iD + " startFrameOffsetBuffer: " + iC + " startOffsetTime: " + jArr2[c]);
                            }
                            short[] sArr2 = aVar.c;
                            int i4 = aVar.b;
                            i = 2;
                            iD += c4624fhA2.d(sArr2, i4, iD, iC, sArr, fArr4, jArr);
                            if (iD >= aVar.b()) {
                                this.i = c4624fhA2.d + AbstractC1869Pb1.e(iC + r2, c4624fhA2.b);
                                aVar.k = true;
                                fArr5 = i4;
                                fArr4 = fArr4;
                                break;
                            }
                            AbstractC6278lb.i(jArr[c] != -1);
                            int i5 = i3 + 1;
                            if (i5 >= 9) {
                                fArr5 = i4;
                                fArr4 = fArr4;
                                break;
                            }
                            i3 = i5;
                            fArr6 = fArr4;
                            c4624fhA2 = a(i5, jArr[c], jArr2, c4624fhA2);
                        } catch (Throwable th3) {
                            th = th3;
                            fArr3 = fArr4;
                            this.c.unlock();
                            throw th;
                        }
                    }
                    if (iD >= aVar.b()) {
                        aVar.k = true;
                    } else if (aVar.b() > i) {
                        AbstractC0441Bk1.c("totalSamplesGot: " + iD + " need: " + aVar.b());
                    }
                    aVar.l = iD;
                    aVar.n = j2 + AbstractC1869Pb1.e(iD, aVar.f);
                    fArr6 = fArr5;
                    fArr3 = fArr4;
                }
                try {
                    this.c.unlock();
                    fArr2 = fArr3;
                } catch (Exception e2) {
                    e = e2;
                    fArr = fArr3;
                    AbstractC0441Bk1.c("Exception: " + e.getMessage());
                    fArr2 = fArr;
                }
            } catch (Throwable th4) {
                th = th4;
                fArr3 = fArr6;
                c = 0;
            }
        } else {
            fArr2 = fArr6;
            c = 0;
        }
        aVar.d = sArr[c];
        aVar.e = sArr[1];
        aVar.g = (float) Math.sqrt((1.0f / aVar.b()) * fArr2[c]);
        aVar.a = true;
        return aVar;
    }

    public void c() {
        this.e = 1;
    }

    public void d(ByteBuffer byteBuffer, long j, int i, int i2, int i3, int i4) {
        boolean zTryLock;
        long jMax = Math.max(0L, j);
        if (i > 0 && this.g == i && this.h == jMax) {
            return;
        }
        this.h = jMax;
        this.g = i;
        this.b = jMax;
        try {
            zTryLock = this.c.tryLock(500L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            zTryLock = false;
        }
        try {
            if (!zTryLock) {
                AbstractC0441Bk1.c("thread lock timeout 1");
                return;
            }
            try {
                if (this.e > 0) {
                    f();
                    this.e = 0;
                }
                C4624fh c4624fh = (this.d.size() <= 0 || this.d.size() < 300) ? null : (C4624fh) this.d.removeFirst();
                if (c4624fh == null) {
                    c4624fh = new C4624fh();
                }
                C4624fh c4624fh2 = c4624fh;
                c4624fh2.c(byteBuffer, jMax, i2, i3, i4, this.j);
                this.d.addLast(c4624fh2);
                this.a = true;
            } catch (Exception e) {
                AbstractC0441Bk1.c("Exception: " + e.getMessage());
                e.printStackTrace();
            }
            this.c.unlock();
        } catch (Throwable th) {
            this.c.unlock();
            throw th;
        }
    }

    public final void f() {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((C4624fh) it.next()).f();
        }
    }

    public void e() {
    }
}
