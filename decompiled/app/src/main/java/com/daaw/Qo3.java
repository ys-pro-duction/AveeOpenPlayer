package com.daaw;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes3.dex */
public final class Qo3 extends Exception {
    public final String B;
    public final boolean C;
    public final Fo3 D;
    public final String E;
    public final Qo3 F;

    public Qo3(C2485Ut1 c2485Ut1, Throwable th, boolean z, int i) {
        this("Decoder init failed: [" + i + "], " + String.valueOf(c2485Ut1), th, c2485Ut1.l, false, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_" + Math.abs(i), null);
    }

    public static /* bridge */ /* synthetic */ Qo3 a(Qo3 qo3, Qo3 qo32) {
        return new Qo3(qo3.getMessage(), qo3.getCause(), qo3.B, false, qo3.D, qo3.E, qo32);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Qo3(C2485Ut1 c2485Ut1, Throwable th, boolean z, Fo3 fo3) {
        String str = "Decoder init failed: " + fo3.a + ", " + String.valueOf(c2485Ut1);
        String str2 = c2485Ut1.l;
        String diagnosticInfo = null;
        if (AbstractC9004vJ2.a >= 21 && (th instanceof MediaCodec.CodecException)) {
            diagnosticInfo = ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        this(str, th, str2, false, fo3, diagnosticInfo, null);
    }

    public Qo3(String str, Throwable th, String str2, boolean z, Fo3 fo3, String str3, Qo3 qo3) {
        super(str, th);
        this.B = str2;
        this.C = false;
        this.D = fo3;
        this.E = str3;
        this.F = qo3;
    }
}
