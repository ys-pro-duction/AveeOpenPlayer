package com.daaw;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

/* JADX INFO: loaded from: classes3.dex */
public final class au3 implements Choreographer.FrameCallback, Handler.Callback {
    public static final au3 G = new au3();
    public volatile long B = -9223372036854775807L;
    public final Handler C;
    public final HandlerThread D;
    public Choreographer E;
    public int F;

    public au3() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        this.D = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), this);
        this.C = handler;
        handler.sendEmptyMessage(0);
    }

    public static au3 a() {
        return G;
    }

    public final void b() {
        this.C.sendEmptyMessage(1);
    }

    public final void c() {
        this.C.sendEmptyMessage(2);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.B = j;
        Choreographer choreographer = this.E;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            try {
                this.E = Choreographer.getInstance();
            } catch (RuntimeException e) {
                AbstractC3305ay2.g("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e);
            }
            return true;
        }
        if (i == 1) {
            Choreographer choreographer = this.E;
            if (choreographer != null) {
                int i2 = this.F + 1;
                this.F = i2;
                if (i2 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
            return true;
        }
        if (i != 2) {
            return false;
        }
        Choreographer choreographer2 = this.E;
        if (choreographer2 != null) {
            int i3 = this.F - 1;
            this.F = i3;
            if (i3 == 0) {
                choreographer2.removeFrameCallback(this);
                this.B = -9223372036854775807L;
            }
        }
        return true;
    }
}
