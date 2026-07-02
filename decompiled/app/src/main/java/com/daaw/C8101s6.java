package com.daaw;

import android.text.TextPaint;
import com.daaw.P11;

/* JADX INFO: renamed from: com.daaw.s6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8101s6 extends TextPaint {
    public P11 a;
    public C4265eR0 b;
    public AbstractC2117Rg c;
    public C9879yT0 d;

    public C8101s6(int i, float f) {
        super(i);
        ((TextPaint) this).density = f;
        this.a = P11.b.b();
        this.b = C4265eR0.d.a();
    }

    public final void a(AbstractC2117Rg abstractC2117Rg, long j) {
        if (abstractC2117Rg == null) {
            setShader(null);
            return;
        }
        if (G10.c(this.c, abstractC2117Rg)) {
            C9879yT0 c9879yT0 = this.d;
            if (c9879yT0 == null ? false : C9879yT0.f(c9879yT0.l(), j)) {
                return;
            }
        }
        this.c = abstractC2117Rg;
        this.d = C9879yT0.c(j);
        if (abstractC2117Rg instanceof GU0) {
            setShader(null);
            b(((GU0) abstractC2117Rg).b());
        } else if (abstractC2117Rg instanceof SQ0) {
            if (j != C9879yT0.b.a()) {
                setShader(((SQ0) abstractC2117Rg).b(j));
            }
        }
    }

    public final void b(long j) {
        int i;
        if (j == C2559Vm.b.g() || getColor() == (i = AbstractC3530bn.i(j))) {
            return;
        }
        setColor(i);
    }

    public final void c(C4265eR0 c4265eR0) {
        if (c4265eR0 == null) {
            c4265eR0 = C4265eR0.d.a();
        }
        if (G10.c(this.b, c4265eR0)) {
            return;
        }
        this.b = c4265eR0;
        if (G10.c(c4265eR0, C4265eR0.d.a())) {
            clearShadowLayer();
        } else {
            setShadowLayer(this.b.b(), C9982yp0.l(this.b.d()), C9982yp0.m(this.b.d()), AbstractC3530bn.i(this.b.c()));
        }
    }

    public final void d(P11 p11) {
        if (p11 == null) {
            p11 = P11.b.b();
        }
        if (G10.c(this.a, p11)) {
            return;
        }
        this.a = p11;
        P11.a aVar = P11.b;
        setUnderlineText(p11.d(aVar.c()));
        setStrikeThruText(this.a.d(aVar.a()));
    }
}
