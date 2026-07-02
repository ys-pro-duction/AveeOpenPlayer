package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class YT1 implements Runnable {
    public final /* synthetic */ int B;
    public final /* synthetic */ int C;
    public final /* synthetic */ TextureViewSurfaceTextureListenerC4000dU1 D;

    public YT1(TextureViewSurfaceTextureListenerC4000dU1 textureViewSurfaceTextureListenerC4000dU1, int i, int i2) {
        this.D = textureViewSurfaceTextureListenerC4000dU1;
        this.B = i;
        this.C = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextureViewSurfaceTextureListenerC4000dU1 textureViewSurfaceTextureListenerC4000dU1 = this.D;
        if (textureViewSurfaceTextureListenerC4000dU1.Q != null) {
            textureViewSurfaceTextureListenerC4000dU1.Q.b(this.B, this.C);
        }
    }
}
