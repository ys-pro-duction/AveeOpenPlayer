package com.daaw;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;

/* JADX INFO: renamed from: com.daaw.ek3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4354ek3 {
    public static final AudioAttributes a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

    public static int a(int i, int i2) {
        for (int i3 = 10; i3 > 0; i3--) {
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(AbstractC9004vJ2.s(i3)).build(), a)) {
                return i3;
            }
        }
        return 0;
    }

    public static OP2 b() {
        LP2 lp2 = new LP2();
        UQ2 uq2Y = C4922gk3.e.keySet().y();
        while (uq2Y.hasNext()) {
            Integer num = (Integer) uq2Y.next();
            int iIntValue = num.intValue();
            if (AbstractC9004vJ2.a >= AbstractC9004vJ2.r(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), a)) {
                lp2.g(num);
            }
        }
        lp2.g(2);
        return lp2.j();
    }
}
