package com.daaw;

import android.media.AudioTrack;

/* JADX INFO: loaded from: classes3.dex */
public final class Em3 extends AudioTrack.StreamEventCallback {
    public final /* synthetic */ Nm3 a;
    public final /* synthetic */ Im3 b;

    public Em3(Im3 im3, Nm3 nm3) {
        this.b = im3;
        this.a = nm3;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack, int i) {
        if (audioTrack.equals(this.b.c.q)) {
            Nm3 nm3 = this.b.c;
            if (nm3.m == null || !nm3.N) {
                return;
            }
            nm3.m.zzb();
        }
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onTearDown(AudioTrack audioTrack) {
        if (audioTrack.equals(this.b.c.q)) {
            Nm3 nm3 = this.b.c;
            if (nm3.m == null || !nm3.N) {
                return;
            }
            nm3.m.zzb();
        }
    }
}
