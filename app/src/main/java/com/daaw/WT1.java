package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class WT1 implements Runnable {
    public final /* synthetic */ String B;
    public final /* synthetic */ String C;
    public final /* synthetic */ TextureViewSurfaceTextureListenerC4000dU1 D;

    public WT1(TextureViewSurfaceTextureListenerC4000dU1 textureViewSurfaceTextureListenerC4000dU1, String str, String str2) {
        this.D = textureViewSurfaceTextureListenerC4000dU1;
        this.B = str;
        this.C = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextureViewSurfaceTextureListenerC4000dU1 textureViewSurfaceTextureListenerC4000dU1 = this.D;
        if (textureViewSurfaceTextureListenerC4000dU1.Q != null) {
            textureViewSurfaceTextureListenerC4000dU1.Q.a(this.B, this.C);
        }
    }
}
