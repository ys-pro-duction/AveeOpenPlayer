package com.daaw;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public class EY {
    public InterfaceC3596c11 a(ImageView imageView, Class cls) {
        if (AbstractC3994dT.class.isAssignableFrom(cls)) {
            return new C4272eT(imageView);
        }
        if (Bitmap.class.equals(cls)) {
            return new C1675Nf(imageView);
        }
        if (Drawable.class.isAssignableFrom(cls)) {
            return new WD(imageView);
        }
        throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
    }
}
