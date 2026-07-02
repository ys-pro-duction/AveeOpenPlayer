package com.daaw;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.daaw.oo3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7184oo3 {
    public static final ArrayDeque g = new ArrayDeque();
    public static final Object h = new Object();
    public final MediaCodec a;
    public final HandlerThread b;
    public Handler c;
    public final AtomicReference d;
    public final C5779jo2 e;
    public boolean f;

    public C7184oo3(MediaCodec mediaCodec, HandlerThread handlerThread) {
        C5779jo2 c5779jo2 = new C5779jo2(InterfaceC1810Om2.a);
        this.a = mediaCodec;
        this.b = handlerThread;
        this.e = c5779jo2;
        this.d = new AtomicReference();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* bridge */ /* synthetic */ void a(com.daaw.C7184oo3 r10, android.os.Message r11) {
        /*
            int r0 = r11.what
            r1 = 0
            if (r0 == 0) goto L44
            r2 = 1
            if (r0 == r2) goto L22
            r2 = 2
            if (r0 == r2) goto L1c
            java.util.concurrent.atomic.AtomicReference r10 = r10.d
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            int r11 = r11.what
            java.lang.String r11 = java.lang.String.valueOf(r11)
            r0.<init>(r11)
            com.daaw.AbstractC5221ho3.a(r10, r1, r0)
            goto L5e
        L1c:
            com.daaw.jo2 r10 = r10.e
            r10.e()
            goto L5e
        L22:
            java.lang.Object r11 = r11.obj
            com.daaw.lo3 r11 = (com.daaw.C6347lo3) r11
            int r3 = r11.a
            android.media.MediaCodec$CryptoInfo r5 = r11.d
            long r6 = r11.e
            int r8 = r11.f
            java.lang.Object r9 = com.daaw.C7184oo3.h     // Catch: java.lang.RuntimeException -> L3c
            monitor-enter(r9)     // Catch: java.lang.RuntimeException -> L3c
            android.media.MediaCodec r2 = r10.a     // Catch: java.lang.Throwable -> L39
            r4 = 0
            r2.queueSecureInputBuffer(r3, r4, r5, r6, r8)     // Catch: java.lang.Throwable -> L39
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L39
            goto L42
        L39:
            r0 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L39
            throw r0     // Catch: java.lang.RuntimeException -> L3c
        L3c:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicReference r10 = r10.d
            com.daaw.AbstractC5221ho3.a(r10, r1, r0)
        L42:
            r1 = r11
            goto L5e
        L44:
            java.lang.Object r11 = r11.obj
            com.daaw.lo3 r11 = (com.daaw.C6347lo3) r11
            int r3 = r11.a
            int r5 = r11.c
            long r6 = r11.e
            int r8 = r11.f
            android.media.MediaCodec r2 = r10.a     // Catch: java.lang.RuntimeException -> L57
            r4 = 0
            r2.queueInputBuffer(r3, r4, r5, r6, r8)     // Catch: java.lang.RuntimeException -> L57
            goto L42
        L57:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicReference r10 = r10.d
            com.daaw.AbstractC5221ho3.a(r10, r1, r0)
            goto L42
        L5e:
            if (r1 == 0) goto L6c
            java.util.ArrayDeque r10 = com.daaw.C7184oo3.g
            monitor-enter(r10)
            r10.add(r1)     // Catch: java.lang.Throwable -> L68
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L68
            goto L6c
        L68:
            r0 = move-exception
            r11 = r0
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L68
            throw r11
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C7184oo3.a(com.daaw.oo3, android.os.Message):void");
    }

    public static C6347lo3 h() {
        ArrayDeque arrayDeque = g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new C6347lo3();
                }
                return (C6347lo3) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static byte[] i(byte[] bArr, byte[] bArr2) {
        int length;
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < (length = bArr.length)) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public static int[] j(int[] iArr, int[] iArr2) {
        int length;
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < (length = iArr.length)) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, length);
        return iArr2;
    }

    public final void b() {
        if (this.f) {
            try {
                Handler handler = this.c;
                if (handler == null) {
                    throw null;
                }
                handler.removeCallbacksAndMessages(null);
                this.e.c();
                Handler handler2 = this.c;
                if (handler2 == null) {
                    throw null;
                }
                handler2.obtainMessage(2).sendToTarget();
                this.e.a();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    public final void c() {
        RuntimeException runtimeException = (RuntimeException) this.d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    public final void d(int i, int i2, int i3, long j, int i4) {
        c();
        C6347lo3 c6347lo3H = h();
        c6347lo3H.a(i, 0, i3, j, i4);
        Handler handler = this.c;
        int i5 = AbstractC9004vJ2.a;
        handler.obtainMessage(0, c6347lo3H).sendToTarget();
    }

    public final void e(int i, int i2, C10080z93 c10080z93, long j, int i3) {
        c();
        C6347lo3 c6347lo3H = h();
        c6347lo3H.a(i, 0, 0, j, 0);
        MediaCodec.CryptoInfo cryptoInfo = c6347lo3H.d;
        cryptoInfo.numSubSamples = c10080z93.f;
        cryptoInfo.numBytesOfClearData = j(c10080z93.d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = j(c10080z93.e, cryptoInfo.numBytesOfEncryptedData);
        byte[] bArrI = i(c10080z93.b, cryptoInfo.key);
        bArrI.getClass();
        cryptoInfo.key = bArrI;
        byte[] bArrI2 = i(c10080z93.a, cryptoInfo.iv);
        bArrI2.getClass();
        cryptoInfo.iv = bArrI2;
        cryptoInfo.mode = c10080z93.c;
        if (AbstractC9004vJ2.a >= 24) {
            AbstractC6626mo3.a();
            cryptoInfo.setPattern(AbstractC1008Gu.a(c10080z93.g, c10080z93.h));
        }
        this.c.obtainMessage(1, c6347lo3H).sendToTarget();
    }

    public final void f() {
        if (this.f) {
            b();
            this.b.quit();
        }
        this.f = false;
    }

    public final void g() {
        if (this.f) {
            return;
        }
        this.b.start();
        this.c = new HandlerC5780jo3(this, this.b.getLooper());
        this.f = true;
    }
}
