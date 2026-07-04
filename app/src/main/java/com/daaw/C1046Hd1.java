package com.daaw;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.view.Surface;
import j$.util.Objects;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.daaw.Hd1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1046Hd1 {
    public Surface a;
    public C8824ui0 b;
    public MediaCodec c;
    public MediaCodec.BufferInfo d = new MediaCodec.BufferInfo();
    public int e;

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f A[PHI: r0
  0x002f: PHI (r0v5 java.lang.String) = (r0v1 java.lang.String), (r0v0 java.lang.String) binds: [B:26:0x0049, B:15:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1046Hd1(com.daaw.C8824ui0 r13, int r14, int r15, int r16, int r17, int r18, java.lang.String r19, java.lang.String r20, int r21) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C1046Hd1.<init>(com.daaw.ui0, int, int, int, int, int, java.lang.String, java.lang.String, int):void");
    }

    public static void c() {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (codecInfoAt.isEncoder()) {
                codecInfoAt.getName();
                for (String str : codecInfoAt.getSupportedTypes()) {
                }
            }
        }
    }

    public static MediaCodecInfo e(String str) {
        c();
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (codecInfoAt.isEncoder()) {
                for (String str2 : codecInfoAt.getSupportedTypes()) {
                    if (str2.equalsIgnoreCase(str)) {
                        codecInfoAt.getName();
                        return codecInfoAt;
                    }
                }
            }
        }
        return null;
    }

    public static MediaCodecInfo f(String str) {
        c();
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (codecInfoAt.isEncoder() && codecInfoAt.getName().equalsIgnoreCase(str)) {
                codecInfoAt.getName();
                return codecInfoAt;
            }
        }
        return null;
    }

    public void a(boolean z) {
        if (z) {
            this.c.signalEndOfInputStream();
        }
        ByteBuffer[] outputBuffers = this.c.getOutputBuffers();
        while (true) {
            int iDequeueOutputBuffer = this.c.dequeueOutputBuffer(this.d, 10000L);
            if (iDequeueOutputBuffer == -1) {
                if (!z) {
                    return;
                }
            } else if (iDequeueOutputBuffer == -3) {
                outputBuffers = this.c.getOutputBuffers();
            } else if (iDequeueOutputBuffer == -2) {
                MediaFormat outputFormat = this.c.getOutputFormat();
                Objects.toString(outputFormat);
                this.e = this.b.a(outputFormat, "video");
            } else if (iDequeueOutputBuffer >= 0) {
                ByteBuffer byteBuffer = outputBuffers[iDequeueOutputBuffer];
                if (byteBuffer == null) {
                    throw new RuntimeException("encoderOutputBuffer " + iDequeueOutputBuffer + " was null");
                }
                MediaCodec.BufferInfo bufferInfo = this.d;
                if ((bufferInfo.flags & 2) != 0) {
                    bufferInfo.size = 0;
                }
                int i = bufferInfo.size;
                if (i > 0) {
                    if (i < 0 || bufferInfo.offset < 0 || bufferInfo.presentationTimeUs < 0) {
                        MediaCodec.BufferInfo bufferInfo2 = this.d;
                        int i2 = bufferInfo2.size;
                        int i3 = bufferInfo2.offset;
                        long j = bufferInfo2.presentationTimeUs;
                    }
                    byteBuffer.position(this.d.offset);
                    MediaCodec.BufferInfo bufferInfo3 = this.d;
                    byteBuffer.limit(bufferInfo3.offset + bufferInfo3.size);
                    this.b.d(this.e, byteBuffer, this.d);
                }
                this.c.releaseOutputBuffer(iDequeueOutputBuffer, false);
                if ((this.d.flags & 4) != 0) {
                    return;
                }
            } else {
                continue;
            }
        }
    }

    public Surface b() {
        return this.a;
    }

    public void d() {
        MediaCodec mediaCodec = this.c;
        if (mediaCodec != null) {
            mediaCodec.stop();
            this.c.release();
            this.c = null;
        }
    }
}
