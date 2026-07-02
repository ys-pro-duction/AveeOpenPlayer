package com.daaw;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import com.daaw.VR0;
import j$.util.Objects;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: com.daaw.Wb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2619Wb {
    public C8824ui0 a;
    public MediaCodec b;
    public MediaCodec.BufferInfo c = new MediaCodec.BufferInfo();
    public int d;
    public int e;

    /* JADX INFO: renamed from: com.daaw.Wb$a */
    public static class a {
        public VR0.a a = null;
        public int b = 0;
        public long c = 0;
    }

    public C2619Wb(C8824ui0 c8824ui0, int i, int i2, int i3, int i4) throws IOException {
        MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", i, i2);
        mediaFormatCreateAudioFormat.setInteger("bitrate", i3);
        mediaFormatCreateAudioFormat.setInteger("channel-count", i2);
        if (i4 > 0) {
            mediaFormatCreateAudioFormat.setInteger("max-input-size", i4 * i2 * 2);
        }
        MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(e("audio/mp4a-latm").getName());
        this.b = mediaCodecCreateByCodecName;
        mediaCodecCreateByCodecName.configure(mediaFormatCreateAudioFormat, (Surface) null, (MediaCrypto) null, 1);
        this.b.start();
        this.a = c8824ui0;
        this.e = i2;
        this.d = -1;
    }

    public static MediaCodecInfo e(String str) {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (codecInfoAt.isEncoder()) {
                for (String str2 : codecInfoAt.getSupportedTypes()) {
                    if (str2.equalsIgnoreCase(str)) {
                        return codecInfoAt;
                    }
                }
            }
        }
        return null;
    }

    public void a(boolean z, boolean z2) {
        if (z2) {
            this.b.signalEndOfInputStream();
        }
        ByteBuffer[] outputBuffers = this.b.getOutputBuffers();
        while (true) {
            int iDequeueOutputBuffer = this.b.dequeueOutputBuffer(this.c, 33333L);
            if (iDequeueOutputBuffer == -1) {
                if (!z2) {
                    return;
                }
            } else if (iDequeueOutputBuffer == -3) {
                outputBuffers = this.b.getOutputBuffers();
            } else if (iDequeueOutputBuffer == -2) {
                MediaFormat outputFormat = this.b.getOutputFormat();
                Objects.toString(outputFormat);
                this.d = this.a.a(outputFormat, "audio");
            } else if (iDequeueOutputBuffer < 0) {
                continue;
            } else if (this.a.b()) {
                ByteBuffer byteBuffer = outputBuffers[iDequeueOutputBuffer];
                if (byteBuffer == null) {
                    throw new RuntimeException("encoderOutputBuffer " + iDequeueOutputBuffer + " was null");
                }
                MediaCodec.BufferInfo bufferInfo = this.c;
                if ((bufferInfo.flags & 2) != 0) {
                    bufferInfo.size = 0;
                }
                int i = bufferInfo.size;
                if (i > 0) {
                    if (i < 0 || bufferInfo.offset < 0 || bufferInfo.presentationTimeUs < 0) {
                        MediaCodec.BufferInfo bufferInfo2 = this.c;
                        int i2 = bufferInfo2.size;
                        int i3 = bufferInfo2.offset;
                        long j = bufferInfo2.presentationTimeUs;
                    }
                    byteBuffer.position(this.c.offset);
                    MediaCodec.BufferInfo bufferInfo3 = this.c;
                    byteBuffer.limit(bufferInfo3.offset + bufferInfo3.size);
                    this.a.d(this.d, byteBuffer, this.c);
                }
                this.b.releaseOutputBuffer(iDequeueOutputBuffer, false);
                if ((this.c.flags & 4) != 0) {
                    return;
                }
            } else {
                this.b.releaseOutputBuffer(iDequeueOutputBuffer, false);
            }
        }
    }

    public boolean b(a aVar, boolean z, boolean z2) {
        int iDequeueInputBuffer;
        ByteBuffer[] inputBuffers = this.b.getInputBuffers();
        do {
            iDequeueInputBuffer = this.b.dequeueInputBuffer(33333L);
            int i = 0;
            if (iDequeueInputBuffer >= 0) {
                ByteBuffer byteBuffer = inputBuffers[iDequeueInputBuffer];
                byteBuffer.clear();
                if (aVar.a != null) {
                    int iMin = Math.min(byteBuffer.capacity() / 2, aVar.b);
                    if (byteBuffer.capacity() / 2 < aVar.b) {
                        AbstractC0441Bk1.c("inputBuffer too small: " + byteBuffer.capacity() + " encodeData.length: " + aVar.b);
                    }
                    if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
                        while (i < iMin) {
                            short s = aVar.a.a[i];
                            byteBuffer.put((byte) (s & 255));
                            byteBuffer.put((byte) ((s & 65280) >> 8));
                            i++;
                        }
                    } else {
                        while (i < iMin) {
                            short s2 = aVar.a.a[i];
                            byteBuffer.put((byte) ((s2 & 65280) >> 8));
                            byteBuffer.put((byte) (s2 & 255));
                            i++;
                        }
                    }
                    aVar.a.a();
                    aVar.a = null;
                }
                if (aVar.b <= 0 || z) {
                    this.b.queueInputBuffer(iDequeueInputBuffer, 0, 0, aVar.c, 4);
                    return true;
                }
                this.b.queueInputBuffer(iDequeueInputBuffer, 0, byteBuffer.position(), aVar.c, 0);
                return true;
            }
        } while (iDequeueInputBuffer != -1);
        return false;
    }

    public int c() {
        return this.e;
    }

    public void d() {
        MediaCodec mediaCodec = this.b;
        if (mediaCodec != null) {
            mediaCodec.stop();
            this.b.release();
            this.b = null;
        }
    }
}
