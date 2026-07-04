package com.daaw;

import android.media.MediaPlayer;

/* JADX INFO: loaded from: classes3.dex */
public final class OT1 implements Runnable {
    public final /* synthetic */ MediaPlayer B;
    public final /* synthetic */ TextureViewSurfaceTextureListenerC4000dU1 C;

    public OT1(TextureViewSurfaceTextureListenerC4000dU1 textureViewSurfaceTextureListenerC4000dU1, MediaPlayer mediaPlayer) {
        this.C = textureViewSurfaceTextureListenerC4000dU1;
        this.B = mediaPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextureViewSurfaceTextureListenerC4000dU1.J(this.C, this.B);
        TextureViewSurfaceTextureListenerC4000dU1 textureViewSurfaceTextureListenerC4000dU1 = this.C;
        if (textureViewSurfaceTextureListenerC4000dU1.Q != null) {
            textureViewSurfaceTextureListenerC4000dU1.Q.zzf();
        }
    }
}
