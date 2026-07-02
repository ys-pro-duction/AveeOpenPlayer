package com.daaw;

import android.media.AudioAttributes;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AS2 {
    public static void a(AudioAttributes.Builder builder, int i) {
        builder.setSpatializationBehavior(i);
    }
}
