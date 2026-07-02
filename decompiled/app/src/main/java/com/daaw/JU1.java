package com.daaw;

import android.content.Context;
import android.media.AudioManager;

/* JADX INFO: loaded from: classes3.dex */
public final class JU1 implements AudioManager.OnAudioFocusChangeListener {
    public final AudioManager B;
    public final IU1 C;
    public boolean D;
    public boolean E;
    public boolean F;
    public float G = 1.0f;

    public JU1(Context context, IU1 iu1) {
        this.B = (AudioManager) context.getSystemService("audio");
        this.C = iu1;
    }

    public final float a() {
        float f = this.F ? 0.0f : this.G;
        if (this.D) {
            return f;
        }
        return 0.0f;
    }

    public final void b() {
        this.E = true;
        f();
    }

    public final void c() {
        this.E = false;
        f();
    }

    public final void d(boolean z) {
        this.F = z;
        f();
    }

    public final void e(float f) {
        this.G = f;
        f();
    }

    public final void f() {
        if (!this.E || this.F || this.G <= 0.0f) {
            if (this.D) {
                AudioManager audioManager = this.B;
                if (audioManager != null) {
                    this.D = audioManager.abandonAudioFocus(this) == 0;
                }
                this.C.zzn();
                return;
            }
            return;
        }
        if (this.D) {
            return;
        }
        AudioManager audioManager2 = this.B;
        if (audioManager2 != null) {
            this.D = audioManager2.requestAudioFocus(this, 3, 2) == 1;
        }
        this.C.zzn();
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        this.D = i > 0;
        this.C.zzn();
    }
}
