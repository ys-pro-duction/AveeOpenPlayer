package com.daaw;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: loaded from: classes3.dex */
public final class LJ2 extends ContentObserver {
    public final Context a;
    public final AudioManager b;
    public final JJ2 c;
    public float d;
    public final C3125aK2 e;

    public LJ2(Handler handler, Context context, JJ2 jj2, C3125aK2 c3125aK2) {
        super(handler);
        this.a = context;
        this.b = (AudioManager) context.getSystemService("audio");
        this.c = jj2;
        this.e = c3125aK2;
    }

    public final void a() {
        this.d = c();
        d();
        this.a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public final void b() {
        this.a.getContentResolver().unregisterContentObserver(this);
    }

    public final float c() {
        AudioManager audioManager = this.b;
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        float f = 0.0f;
        if (streamMaxVolume > 0) {
            if (streamVolume <= 0) {
                return 0.0f;
            }
            f = streamVolume / streamMaxVolume;
            if (f > 1.0f) {
                return 1.0f;
            }
        }
        return f;
    }

    public final void d() {
        this.e.e(this.d);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        super.onChange(z);
        float fC = c();
        if (fC != this.d) {
            this.d = fC;
            d();
        }
    }
}
