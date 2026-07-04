package com.daaw;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: com.daaw.to3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8578to3 extends MediaCodec.Callback {
    public final HandlerThread b;
    public Handler c;
    public MediaFormat h;
    public MediaFormat i;
    public MediaCodec.CodecException j;
    public long k;
    public boolean l;
    public IllegalStateException m;
    public final Object a = new Object();
    public final C2863Yk d = new C2863Yk();
    public final C2863Yk e = new C2863Yk();
    public final ArrayDeque f = new ArrayDeque();
    public final ArrayDeque g = new ArrayDeque();

    public C8578to3(HandlerThread handlerThread) {
        this.b = handlerThread;
    }

    public static /* synthetic */ void d(C8578to3 c8578to3) {
        synchronized (c8578to3.a) {
            try {
                if (c8578to3.l) {
                    return;
                }
                long j = c8578to3.k - 1;
                c8578to3.k = j;
                if (j > 0) {
                    return;
                }
                if (j >= 0) {
                    c8578to3.i();
                    return;
                }
                IllegalStateException illegalStateException = new IllegalStateException();
                synchronized (c8578to3.a) {
                    c8578to3.m = illegalStateException;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int a() {
        synchronized (this.a) {
            try {
                j();
                k();
                int iE = -1;
                if (l()) {
                    return -1;
                }
                if (!this.d.d()) {
                    iE = this.d.e();
                }
                return iE;
            } finally {
            }
        }
    }

    public final int b(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.a) {
            try {
                j();
                k();
                if (l()) {
                    return -1;
                }
                if (this.e.d()) {
                    return -1;
                }
                int iE = this.e.e();
                if (iE >= 0) {
                    AbstractC6048km2.b(this.h);
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (iE == -2) {
                    this.h = (MediaFormat) this.g.remove();
                    iE = -2;
                }
                return iE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final MediaFormat c() {
        MediaFormat mediaFormat;
        synchronized (this.a) {
            try {
                mediaFormat = this.h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    public final void e() {
        synchronized (this.a) {
            this.k++;
            Handler handler = this.c;
            int i = AbstractC9004vJ2.a;
            handler.post(new Runnable() { // from class: com.daaw.qo3
                @Override // java.lang.Runnable
                public final void run() {
                    C8578to3.d(this.B);
                }
            });
        }
    }

    public final void f(MediaCodec mediaCodec) {
        AbstractC6048km2.f(this.c == null);
        this.b.start();
        Handler handler = new Handler(this.b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.c = handler;
    }

    public final void g() {
        synchronized (this.a) {
            this.l = true;
            this.b.quit();
            i();
        }
    }

    public final void h(MediaFormat mediaFormat) {
        this.e.a(-2);
        this.g.add(mediaFormat);
    }

    public final void i() {
        if (!this.g.isEmpty()) {
            this.i = (MediaFormat) this.g.getLast();
        }
        this.d.b();
        this.e.b();
        this.f.clear();
        this.g.clear();
    }

    public final void j() {
        IllegalStateException illegalStateException = this.m;
        if (illegalStateException == null) {
            return;
        }
        this.m = null;
        throw illegalStateException;
    }

    public final void k() {
        MediaCodec.CodecException codecException = this.j;
        if (codecException == null) {
            return;
        }
        this.j = null;
        throw codecException;
    }

    public final boolean l() {
        return this.k > 0 || this.l;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.a) {
            this.j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.a) {
            this.d.a(i);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.a) {
            try {
                MediaFormat mediaFormat = this.i;
                if (mediaFormat != null) {
                    h(mediaFormat);
                    this.i = null;
                }
                this.e.a(i);
                this.f.add(bufferInfo);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.a) {
            h(mediaFormat);
            this.i = null;
        }
    }
}
