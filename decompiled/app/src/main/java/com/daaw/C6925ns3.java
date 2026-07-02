package com.daaw;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.ns3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6925ns3 {
    public final Spatializer a;
    public final boolean b;
    public Handler c;
    public Spatializer.OnSpatializerStateChangedListener d;

    public C6925ns3(Spatializer spatializer) {
        this.a = spatializer;
        this.b = spatializer.getImmersiveAudioLevel() != 0;
    }

    public static C6925ns3 a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        return new C6925ns3(audioManager.getSpatializer());
    }

    public final void b(C8877us3 c8877us3, Looper looper) {
        if (this.d == null && this.c == null) {
            this.d = new C4683fs3(this, c8877us3);
            final Handler handler = new Handler(looper);
            this.c = handler;
            this.a.addOnSpatializerStateChangedListener(new Executor() { // from class: com.daaw.Xr3
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    handler.post(runnable);
                }
            }, this.d);
        }
    }

    public final void c() {
        Spatializer.OnSpatializerStateChangedListener onSpatializerStateChangedListener = this.d;
        if (onSpatializerStateChangedListener == null || this.c == null) {
            return;
        }
        this.a.removeOnSpatializerStateChangedListener(onSpatializerStateChangedListener);
        Handler handler = this.c;
        int i = AbstractC9004vJ2.a;
        handler.removeCallbacksAndMessages(null);
        this.c = null;
        this.d = null;
    }

    public final boolean d(C7965rd3 c7965rd3, C2485Ut1 c2485Ut1) {
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(AbstractC9004vJ2.s(("audio/eac3-joc".equals(c2485Ut1.l) && c2485Ut1.y == 16) ? 12 : c2485Ut1.y));
        int i = c2485Ut1.z;
        if (i != -1) {
            channelMask.setSampleRate(i);
        }
        return this.a.canBeSpatialized(c7965rd3.a().a, channelMask.build());
    }

    public final boolean e() {
        return this.a.isAvailable();
    }

    public final boolean f() {
        return this.a.isEnabled();
    }

    public final boolean g() {
        return this.b;
    }
}
