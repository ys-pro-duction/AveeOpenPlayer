package com.daaw;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: com.daaw.Uj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2443Uj extends AbstractC2219Sf {
    public C2443Uj(InterfaceC1883Pf interfaceC1883Pf) {
        super(interfaceC1883Pf);
    }

    @Override // com.daaw.AbstractC2219Sf
    public Bitmap b(InterfaceC1883Pf interfaceC1883Pf, Bitmap bitmap, int i, int i2) {
        Bitmap bitmapB = interfaceC1883Pf.b(i, i2, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        Bitmap bitmapA = AbstractC7262p51.a(bitmapB, bitmap, i, i2);
        if (bitmapB != null && bitmapB != bitmapA && !interfaceC1883Pf.a(bitmapB)) {
            bitmapB.recycle();
        }
        return bitmapA;
    }

    @Override // com.daaw.InterfaceC6983o51
    public String getId() {
        return "CenterCrop.com.bumptech.glide.load.resource.bitmap";
    }
}
