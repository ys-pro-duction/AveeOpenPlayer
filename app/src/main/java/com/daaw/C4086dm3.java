package com.daaw;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;

/* JADX INFO: renamed from: com.daaw.dm3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4086dm3 {
    public final C2485Ut1 a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final C9660xg2 i;
    public final boolean j = false;
    public final boolean k = false;

    public C4086dm3(C2485Ut1 c2485Ut1, int i, int i2, int i3, int i4, int i5, int i6, int i7, C9660xg2 c9660xg2, boolean z, boolean z2) {
        this.a = c2485Ut1;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = c9660xg2;
    }

    public final AudioTrack a(boolean z, C7965rd3 c7965rd3, int i) throws C4081dl3 {
        AudioTrack audioTrack;
        AudioTrack audioTrackBuild;
        try {
            int i2 = AbstractC9004vJ2.a;
            if (i2 >= 29) {
                AudioFormat audioFormatG = AbstractC9004vJ2.G(this.e, this.f, this.g);
                AudioAttributes audioAttributes = c7965rd3.a().a;
                AbstractC3529bm3.a();
                audioTrackBuild = AbstractC3250am3.a().setAudioAttributes(audioAttributes).setAudioFormat(audioFormatG).setTransferMode(1).setBufferSizeInBytes(this.h).setSessionId(i).setOffloadedPlayback(this.c == 1).build();
            } else {
                if (i2 >= 21) {
                    audioTrack = new AudioTrack(c7965rd3.a().a, AbstractC9004vJ2.G(this.e, this.f, this.g), this.h, 1, i);
                } else {
                    int i3 = c7965rd3.a;
                    audioTrack = i == 0 ? new AudioTrack(3, this.e, this.f, this.g, this.h, 1) : new AudioTrack(3, this.e, this.f, this.g, this.h, 1, i);
                }
                audioTrackBuild = audioTrack;
            }
            int state = audioTrackBuild.getState();
            if (state == 1) {
                return audioTrackBuild;
            }
            try {
                audioTrackBuild.release();
            } catch (Exception unused) {
            }
            throw new C4081dl3(state, this.e, this.f, this.h, this.a, b(), null);
        } catch (IllegalArgumentException e) {
            e = e;
            throw new C4081dl3(0, this.e, this.f, this.h, this.a, b(), e);
        } catch (UnsupportedOperationException e2) {
            e = e2;
            throw new C4081dl3(0, this.e, this.f, this.h, this.a, b(), e);
        }
    }

    public final boolean b() {
        return this.c == 1;
    }
}
