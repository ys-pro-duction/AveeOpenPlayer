package com.daaw;

import android.media.AudioTrack;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Il3 {
    public static void a(AudioTrack audioTrack, Ol3 ol3) {
        audioTrack.setPreferredDevice(ol3 == null ? null : ol3.a);
    }
}
