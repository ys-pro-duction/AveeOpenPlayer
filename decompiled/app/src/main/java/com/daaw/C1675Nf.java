package com.daaw;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* JADX INFO: renamed from: com.daaw.Nf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1675Nf extends DY {
    public C1675Nf(ImageView imageView) {
        super(imageView);
    }

    @Override // com.daaw.DY
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void n(Bitmap bitmap) {
        ((ImageView) this.C).setImageBitmap(bitmap);
    }
}
