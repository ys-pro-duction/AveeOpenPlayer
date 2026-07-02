package com.daaw;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public final class P5 implements InterfaceC5418iY {
    public final Bitmap b;

    public P5(Bitmap bitmap) {
        G10.g(bitmap, "bitmap");
        this.b = bitmap;
    }

    @Override // com.daaw.InterfaceC5418iY
    public void a() {
        this.b.prepareToDraw();
    }

    public final Bitmap b() {
        return this.b;
    }

    @Override // com.daaw.InterfaceC5418iY
    public int getHeight() {
        return this.b.getHeight();
    }

    @Override // com.daaw.InterfaceC5418iY
    public int getWidth() {
        return this.b.getWidth();
    }
}
