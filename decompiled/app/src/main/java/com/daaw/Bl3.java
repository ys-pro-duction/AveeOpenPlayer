package com.daaw;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Bl3 {
    public static C6606mk3 a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z) {
        int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        if (playbackOffloadSupport == 0) {
            return C6606mk3.d;
        }
        C5479ik3 c5479ik3 = new C5479ik3();
        boolean z2 = false;
        if (AbstractC9004vJ2.a > 32 && playbackOffloadSupport == 2) {
            z2 = true;
        }
        c5479ik3.a(true);
        c5479ik3.b(z2);
        c5479ik3.c(z);
        return c5479ik3.d();
    }
}
