package com.daaw;

import android.media.MediaCodec;
import android.os.HandlerThread;
import android.os.Trace;

/* JADX INFO: renamed from: com.daaw.bo3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3539bo3 implements InterfaceC9701xo3 {
    public final CO2 b;
    public final CO2 c;

    public C3539bo3(int i, boolean z) {
        Xn3 xn3 = new Xn3(i);
        Zn3 zn3 = new Zn3(i);
        this.b = xn3;
        this.c = zn3;
    }

    public static /* synthetic */ HandlerThread a(int i) {
        return new HandlerThread(C4663fo3.m(i, "ExoPlayer:MediaCodecAsyncAdapter:"));
    }

    public static /* synthetic */ HandlerThread b(int i) {
        return new HandlerThread(C4663fo3.m(i, "ExoPlayer:MediaCodecQueueingThread:"));
    }

    public final C4663fo3 c(C9422wo3 c9422wo3) throws Exception {
        Exception exc;
        MediaCodec mediaCodecCreateByCodecName;
        String str = c9422wo3.a.a;
        C4663fo3 c4663fo3 = null;
        try {
            int i = AbstractC9004vJ2.a;
            Trace.beginSection("createCodec:" + str);
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                C4663fo3 c4663fo32 = new C4663fo3(mediaCodecCreateByCodecName, a(((Xn3) this.b).B), b(((Zn3) this.c).B), false, null);
                try {
                    Trace.endSection();
                    C4663fo3.l(c4663fo32, c9422wo3.b, c9422wo3.d, null, 0);
                    return c4663fo32;
                } catch (Exception e) {
                    exc = e;
                    c4663fo3 = c4663fo32;
                    if (c4663fo3 != null) {
                        c4663fo3.zzl();
                        throw exc;
                    }
                    if (mediaCodecCreateByCodecName == null) {
                        throw exc;
                    }
                    mediaCodecCreateByCodecName.release();
                    throw exc;
                }
            } catch (Exception e2) {
                exc = e2;
            }
        } catch (Exception e3) {
            exc = e3;
            mediaCodecCreateByCodecName = null;
        }
    }
}
