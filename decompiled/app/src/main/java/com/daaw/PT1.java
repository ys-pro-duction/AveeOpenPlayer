package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class PT1 implements Runnable {
    public final /* synthetic */ TextureViewSurfaceTextureListenerC4000dU1 B;

    public PT1(TextureViewSurfaceTextureListenerC4000dU1 textureViewSurfaceTextureListenerC4000dU1) {
        this.B = textureViewSurfaceTextureListenerC4000dU1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextureViewSurfaceTextureListenerC4000dU1 textureViewSurfaceTextureListenerC4000dU1 = this.B;
        if (textureViewSurfaceTextureListenerC4000dU1.Q != null) {
            textureViewSurfaceTextureListenerC4000dU1.Q.zza();
        }
    }
}
