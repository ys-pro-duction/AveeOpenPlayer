package com.daaw;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;

/* JADX INFO: renamed from: com.daaw.yl3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9965yl3 {
    public static C6606mk3 a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z) {
        if (!AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
            return C6606mk3.d;
        }
        C5479ik3 c5479ik3 = new C5479ik3();
        c5479ik3.a(true);
        c5479ik3.c(z);
        return c5479ik3.d();
    }
}
