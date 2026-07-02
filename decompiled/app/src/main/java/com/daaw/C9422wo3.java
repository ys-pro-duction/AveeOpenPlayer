package com.daaw;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;

/* JADX INFO: renamed from: com.daaw.wo3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9422wo3 {
    public final Fo3 a;
    public final MediaFormat b;
    public final C2485Ut1 c;
    public final Surface d;
    public final MediaCrypto e = null;

    public C9422wo3(Fo3 fo3, MediaFormat mediaFormat, C2485Ut1 c2485Ut1, Surface surface, MediaCrypto mediaCrypto, int i) {
        this.a = fo3;
        this.b = mediaFormat;
        this.c = c2485Ut1;
        this.d = surface;
    }

    public static C9422wo3 a(Fo3 fo3, MediaFormat mediaFormat, C2485Ut1 c2485Ut1, MediaCrypto mediaCrypto) {
        return new C9422wo3(fo3, mediaFormat, c2485Ut1, null, null, 0);
    }

    public static C9422wo3 b(Fo3 fo3, MediaFormat mediaFormat, C2485Ut1 c2485Ut1, Surface surface, MediaCrypto mediaCrypto) {
        return new C9422wo3(fo3, mediaFormat, c2485Ut1, surface, null, 0);
    }
}
