package com.daaw;

import com.google.android.exoplayer2.source.TrackGroup;

/* JADX INFO: loaded from: classes.dex */
public final class PM extends AbstractC1360Ke {
    public final int g;
    public final Object h;

    public PM(TrackGroup trackGroup, int i) {
        this(trackGroup, i, 0, null);
    }

    @Override // com.google.android.exoplayer2.trackselection.c
    public int b() {
        return 0;
    }

    @Override // com.google.android.exoplayer2.trackselection.c
    public int l() {
        return this.g;
    }

    @Override // com.google.android.exoplayer2.trackselection.c
    public Object o() {
        return this.h;
    }

    public PM(TrackGroup trackGroup, int i, int i2, Object obj) {
        super(trackGroup, i);
        this.g = i2;
        this.h = obj;
    }

    @Override // com.google.android.exoplayer2.trackselection.c
    public void n(long j, long j2, long j3) {
    }
}
