package com.daaw;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* JADX INFO: renamed from: com.daaw.nl3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6890nl3 {
    public final AudioTrack a;
    public final AudioTimestamp b = new AudioTimestamp();
    public long c;
    public long d;
    public long e;

    public C6890nl3(AudioTrack audioTrack) {
        this.a = audioTrack;
    }

    public final long a() {
        return this.e;
    }

    public final long b() {
        return this.b.nanoTime / 1000;
    }

    public final boolean c() {
        boolean timestamp = this.a.getTimestamp(this.b);
        if (timestamp) {
            long j = this.b.framePosition;
            if (this.d > j) {
                this.c++;
            }
            this.d = j;
            this.e = j + (this.c << 32);
        }
        return timestamp;
    }
}
