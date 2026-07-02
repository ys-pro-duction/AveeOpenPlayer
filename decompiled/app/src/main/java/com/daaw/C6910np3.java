package com.daaw;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.daaw.np3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6910np3 implements InterfaceC9980yo3 {
    public final MediaCodec a;
    public ByteBuffer[] b;
    public ByteBuffer[] c;

    public /* synthetic */ C6910np3(MediaCodec mediaCodec, AbstractC6631mp3 abstractC6631mp3) {
        this.a = mediaCodec;
        if (AbstractC9004vJ2.a < 21) {
            this.b = mediaCodec.getInputBuffers();
            this.c = mediaCodec.getOutputBuffers();
        }
    }

    @Override // com.daaw.InterfaceC9980yo3
    public final void a(int i, long j) {
        this.a.releaseOutputBuffer(i, j);
    }

    @Override // com.daaw.InterfaceC9980yo3
    public final ByteBuffer b(int i) {
        return AbstractC9004vJ2.a >= 21 ? this.a.getOutputBuffer(i) : this.c[i];
    }

    @Override // com.daaw.InterfaceC9980yo3
    public final void c(int i, int i2, int i3, long j, int i4) {
        this.a.queueInputBuffer(i, 0, i3, j, i4);
    }

    @Override // com.daaw.InterfaceC9980yo3
    public final ByteBuffer d(int i) {
        return AbstractC9004vJ2.a >= 21 ? this.a.getInputBuffer(i) : this.b[i];
    }

    @Override // com.daaw.InterfaceC9980yo3
    public final void e(int i, int i2, C10080z93 c10080z93, long j, int i3) {
        this.a.queueSecureInputBuffer(i, 0, c10080z93.a(), j, 0);
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
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.a.dequeueOutputBuffer(bufferInfo, 0L);
            if (iDequeueOutputBuffer == -3) {
                if (AbstractC9004vJ2.a < 21) {
                    this.c = this.a.getOutputBuffers();
                }
                iDequeueOutputBuffer = -3;
            }
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // com.daaw.InterfaceC9980yo3
    public final void q(Bundle bundle) {
        this.a.setParameters(bundle);
    }

    @Override // com.daaw.InterfaceC9980yo3
    public final int zza() {
        return this.a.dequeueInputBuffer(0L);
    }

    @Override // com.daaw.InterfaceC9980yo3
    public final MediaFormat zzc() {
        return this.a.getOutputFormat();
    }

    @Override // com.daaw.InterfaceC9980yo3
    public final void zzi() {
        this.a.flush();
    }

    @Override // com.daaw.InterfaceC9980yo3
    public final void zzl() {
        this.b = null;
        this.c = null;
        this.a.release();
    }

    @Override // com.daaw.InterfaceC9980yo3
    public final boolean zzr() {
        return false;
    }
}
