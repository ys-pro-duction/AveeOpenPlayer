package com.daaw;

import android.media.MediaCodec;

/* JADX INFO: renamed from: com.daaw.zo3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C10259zo3 extends B93 {
    public final Fo3 B;
    public final String C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10259zo3(Throwable th, Fo3 fo3) {
        super("Decoder failed: ".concat(String.valueOf(fo3 == null ? null : fo3.a)), th);
        String diagnosticInfo = null;
        this.B = fo3;
        if (AbstractC9004vJ2.a >= 21 && (th instanceof MediaCodec.CodecException)) {
            diagnosticInfo = ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        this.C = diagnosticInfo;
    }
}
