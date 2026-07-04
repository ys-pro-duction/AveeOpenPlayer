package com.daaw;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: com.daaw.Sf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2219Sf implements InterfaceC6983o51 {
    public InterfaceC1883Pf a;

    public AbstractC2219Sf(InterfaceC1883Pf interfaceC1883Pf) {
        this.a = interfaceC1883Pf;
    }

    @Override // com.daaw.InterfaceC6983o51
    public final KI0 a(KI0 ki0, int i, int i2) {
        if (AbstractC6559mb1.l(i, i2)) {
            Bitmap bitmap = (Bitmap) ki0.get();
            if (i == Integer.MIN_VALUE) {
                i = bitmap.getWidth();
            }
            if (i2 == Integer.MIN_VALUE) {
                i2 = bitmap.getHeight();
            }
            Bitmap bitmapB = b(this.a, bitmap, i, i2);
            return bitmap.equals(bitmapB) ? ki0 : C2113Rf.d(bitmapB, this.a);
        }
        throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i2 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
    }

    public abstract Bitmap b(InterfaceC1883Pf interfaceC1883Pf, Bitmap bitmap, int i, int i2);
}
