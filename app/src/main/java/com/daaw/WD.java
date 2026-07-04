package com.daaw;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public class WD extends DY {
    public WD(ImageView imageView) {
        super(imageView);
    }

    @Override // com.daaw.DY
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void n(Drawable drawable) {
        ((ImageView) this.C).setImageDrawable(drawable);
    }
}
