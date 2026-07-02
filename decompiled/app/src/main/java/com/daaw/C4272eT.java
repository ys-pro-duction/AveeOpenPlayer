package com.daaw;

import android.widget.ImageView;

/* JADX INFO: renamed from: com.daaw.eT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C4272eT extends DY {
    public int G;
    public AbstractC3994dT H;

    public C4272eT(ImageView imageView) {
        this(imageView, -1);
    }

    @Override // com.daaw.AbstractC1256Je, com.daaw.InterfaceC1556Mb0
    public void a() {
        AbstractC3994dT abstractC3994dT = this.H;
        if (abstractC3994dT != null) {
            abstractC3994dT.stop();
        }
    }

    @Override // com.daaw.AbstractC1256Je, com.daaw.InterfaceC1556Mb0
    public void b() {
        AbstractC3994dT abstractC3994dT = this.H;
        if (abstractC3994dT != null) {
            abstractC3994dT.start();
        }
    }

    @Override // com.daaw.DY, com.daaw.InterfaceC3596c11
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void d(AbstractC3994dT abstractC3994dT, XS xs) {
        if (!abstractC3994dT.b()) {
            float intrinsicWidth = abstractC3994dT.getIntrinsicWidth() / abstractC3994dT.getIntrinsicHeight();
            if (Math.abs((((ImageView) this.C).getWidth() / ((ImageView) this.C).getHeight()) - 1.0f) <= 0.05f && Math.abs(intrinsicWidth - 1.0f) <= 0.05f) {
                abstractC3994dT = new EV0(abstractC3994dT, ((ImageView) this.C).getWidth());
            }
        }
        super.d(abstractC3994dT, xs);
        this.H = abstractC3994dT;
        abstractC3994dT.c(this.G);
        abstractC3994dT.start();
    }

    @Override // com.daaw.DY
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void n(AbstractC3994dT abstractC3994dT) {
        ((ImageView) this.C).setImageDrawable(abstractC3994dT);
    }

    public C4272eT(ImageView imageView, int i) {
        super(imageView);
        this.G = i;
    }
}
