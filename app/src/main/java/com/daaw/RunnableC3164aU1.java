package com.daaw;

/* JADX INFO: renamed from: com.daaw.aU1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC3164aU1 implements Runnable {
    public final /* synthetic */ TextureViewSurfaceTextureListenerC4000dU1 B;

    public RunnableC3164aU1(TextureViewSurfaceTextureListenerC4000dU1 textureViewSurfaceTextureListenerC4000dU1) {
        this.B = textureViewSurfaceTextureListenerC4000dU1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextureViewSurfaceTextureListenerC4000dU1 textureViewSurfaceTextureListenerC4000dU1 = this.B;
        if (textureViewSurfaceTextureListenerC4000dU1.Q != null) {
            if (!textureViewSurfaceTextureListenerC4000dU1.R) {
                textureViewSurfaceTextureListenerC4000dU1.Q.zzg();
                this.B.R = true;
            }
            this.B.Q.zze();
        }
    }
}
