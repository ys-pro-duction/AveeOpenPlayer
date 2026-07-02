package com.daaw;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class Im3 {
    public final Handler a = new Handler(Looper.myLooper());
    public final AudioTrack.StreamEventCallback b;
    public final /* synthetic */ Nm3 c;

    public Im3(Nm3 nm3) {
        this.c = nm3;
        this.b = new Em3(this, nm3);
    }

    public final void a(AudioTrack audioTrack) {
        final Handler handler = this.a;
        audioTrack.registerStreamEventCallback(new Executor() { // from class: com.daaw.Cm3
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, this.b);
    }

    public final void b(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.b);
        this.a.removeCallbacksAndMessages(null);
    }
}
