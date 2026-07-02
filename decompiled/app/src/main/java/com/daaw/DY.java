package com.daaw;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.daaw.XS;

/* JADX INFO: loaded from: classes.dex */
public abstract class DY extends AbstractC1985Qe1 implements XS.a {
    public DY(ImageView imageView) {
        super(imageView);
    }

    @Override // com.daaw.InterfaceC3596c11
    public void d(Object obj, XS xs) {
        if (xs == null || !xs.a(obj, this)) {
            n(obj);
        }
    }

    @Override // com.daaw.XS.a
    public void f(Drawable drawable) {
        ((ImageView) this.C).setImageDrawable(drawable);
    }

    @Override // com.daaw.XS.a
    public Drawable g() {
        return ((ImageView) this.C).getDrawable();
    }

    @Override // com.daaw.AbstractC1256Je, com.daaw.InterfaceC3596c11
    public void h(Exception exc, Drawable drawable) {
        ((ImageView) this.C).setImageDrawable(drawable);
    }

    @Override // com.daaw.AbstractC1256Je, com.daaw.InterfaceC3596c11
    public void i(Drawable drawable) {
        ((ImageView) this.C).setImageDrawable(drawable);
    }

    @Override // com.daaw.AbstractC1256Je, com.daaw.InterfaceC3596c11
    public void k(Drawable drawable) {
        ((ImageView) this.C).setImageDrawable(drawable);
    }

    public abstract void n(Object obj);
}
