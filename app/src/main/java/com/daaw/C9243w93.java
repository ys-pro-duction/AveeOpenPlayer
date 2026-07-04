package com.daaw;

import android.media.MediaCodec;

/* JADX INFO: renamed from: com.daaw.w93, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9243w93 {
    public final MediaCodec.CryptoInfo a;
    public final MediaCodec.CryptoInfo.Pattern b = AbstractC1008Gu.a(0, 0);

    public static /* bridge */ /* synthetic */ void a(C9243w93 c9243w93, int i, int i2) {
        c9243w93.b.set(i, i2);
        c9243w93.a.setPattern(c9243w93.b);
    }
}
