package com.daaw;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.daaw.fo3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4663fo3 implements InterfaceC9980yo3 {
    public final MediaCodec a;
    public final C8578to3 b;
    public final C7184oo3 c;
    public boolean d;
    public int e = 0;

    public /* synthetic */ C4663fo3(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z, AbstractC4095do3 abstractC4095do3) {
        this.a = mediaCodec;
        this.b = new C8578to3(handlerThread);
        this.c = new C7184oo3(mediaCodec, handlerThread2);
    }

    public static /* synthetic */ void l(C4663fo3 c4663fo3, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        c4663fo3.b.f(c4663fo3.a);
        int i2 = AbstractC9004vJ2.a;
        Trace.beginSection("configureCodec");
        c4663fo3.a.configure(mediaFormat, surface, (MediaCrypto) null, 0);
        Trace.endSection();
        c4663fo3.c.g();
        Trace.beginSection("startCodec");
        c4663fo3.a.start();
        Trace.endSection();
        c4663fo3.e = 1;
    }

    public static String m(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // com.daaw.InterfaceC9980yo3
    public final void a(int i, long j) {
        this.a.releaseOutputBuffer(i, j);
    }

    @Override // com.daaw.InterfaceC9980yo3
    public final ByteBuffer b(int i) {
        return this.a.getOutputBuffer(i);
    }

    @Override // com.daaw.InterfaceC9980yo3
    public final void c(int i, int i2, int i3, long j, int i4) {
        this.c.d(i, 0, i3, j, i4);
    }

    @Override // com.daaw.InterfaceC9980yo3
    public final ByteBuffer d(int i) {
        return this.a.getInputBuffer(i);
    }

    @Override // com.daaw.InterfaceC9980yo3
    public final void e(int i, int i2, C10080z93 c10080z93, long j, int i3) {
        this.c.e(i, 0, c10080z93, j, 0);
    }

    @Override // com.daaw.InterfaceC9980yo3
    public final void f(Surface surface) {
        this.a.setOutputSurface(surface);
    }

    @Override // com.daaw.InterfaceC9980yo3
    public final void g(int i) {
        this.a.setVideoScalingMode(i);
    }

    @Override // com.daaw.InterfaceC9980yo3
    public final void h(int i, boolean z) {
        this.a.releaseOutputBuffer(i, z);
    }

    @Override // com.daaw.InterfaceC9980yo3
    public final int i(MediaCodec.BufferInfo bufferInfo) {
        this.c.c();
        return this.b.b(bufferInfo);
    }

    @Override // com.daaw.InterfaceC9980yo3
    public final void q(Bundle bundle) {
        this.a.setParameters(bundle);
    }

    @Override // com.daaw.InterfaceC9980yo3
    public final int zza() {
        this.c.c();
        return this.b.a();
    }

    @Override // com.daaw.InterfaceC9980yo3
    public final MediaFormat zzc() {
        return this.b.c();
    }

    @Override // com.daaw.InterfaceC9980yo3
    public final void zzi() {
        this.c.b();
        this.a.flush();
        this.b.e();
        this.a.start();
    }

    @Override // com.daaw.InterfaceC9980yo3
    public final void zzl() {
        try {
            if (this.e == 1) {
                this.c.f();
                this.b.g();
            }
            this.e = 2;
            if (this.d) {
                return;
            }
            this.a.release();
            this.d = true;
        } catch (Throwable th) {
            if (!this.d) {
                this.a.release();
                this.d = true;
            }
            throw th;
        }
    }

    @Override // com.daaw.InterfaceC9980yo3
    public final boolean zzr() {
        return false;
    }
}
