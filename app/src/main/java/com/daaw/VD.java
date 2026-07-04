package com.daaw;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import com.daaw.XS;

/* JADX INFO: loaded from: classes.dex */
public class VD implements XS {
    public final XS a;
    public final int b;

    public VD(XS xs, int i) {
        this.a = xs;
        this.b = i;
    }

    @Override // com.daaw.XS
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean a(Drawable drawable, XS.a aVar) {
        Drawable drawableG = aVar.g();
        if (drawableG == null) {
            this.a.a(drawable, aVar);
            return false;
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawableG, drawable});
        transitionDrawable.setCrossFadeEnabled(true);
        transitionDrawable.startTransition(this.b);
        aVar.f(transitionDrawable);
        return true;
    }
}
