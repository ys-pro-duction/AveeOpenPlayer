package com.daaw;

import android.graphics.Color;
import android.graphics.Paint;
import com.daaw.AbstractC9089ve;

/* JADX INFO: renamed from: com.daaw.vE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C8981vE implements AbstractC9089ve.b {
    public final AbstractC9089ve.b a;
    public final AbstractC9089ve b;
    public final AbstractC9089ve c;
    public final AbstractC9089ve d;
    public final AbstractC9089ve e;
    public final AbstractC9089ve f;
    public boolean g = true;

    /* JADX INFO: renamed from: com.daaw.vE$a */
    public class a extends C8530tf0 {
        public final /* synthetic */ C8530tf0 d;

        public a(C8530tf0 c8530tf0) {
            this.d = c8530tf0;
        }

        @Override // com.daaw.C8530tf0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Float a(C5451if0 c5451if0) {
            Float f = (Float) this.d.a(c5451if0);
            if (f == null) {
                return null;
            }
            return Float.valueOf(f.floatValue() * 2.55f);
        }
    }

    public C8981vE(AbstractC9089ve.b bVar, AbstractC9647xe abstractC9647xe, C8416tE c8416tE) {
        this.a = bVar;
        AbstractC9089ve abstractC9089veH = c8416tE.a().h();
        this.b = abstractC9089veH;
        abstractC9089veH.a(this);
        abstractC9647xe.j(abstractC9089veH);
        AbstractC9089ve abstractC9089veH2 = c8416tE.d().h();
        this.c = abstractC9089veH2;
        abstractC9089veH2.a(this);
        abstractC9647xe.j(abstractC9089veH2);
        AbstractC9089ve abstractC9089veH3 = c8416tE.b().h();
        this.d = abstractC9089veH3;
        abstractC9089veH3.a(this);
        abstractC9647xe.j(abstractC9089veH3);
        AbstractC9089ve abstractC9089veH4 = c8416tE.c().h();
        this.e = abstractC9089veH4;
        abstractC9089veH4.a(this);
        abstractC9647xe.j(abstractC9089veH4);
        AbstractC9089ve abstractC9089veH5 = c8416tE.e().h();
        this.f = abstractC9089veH5;
        abstractC9089veH5.a(this);
        abstractC9647xe.j(abstractC9089veH5);
    }

    @Override // com.daaw.AbstractC9089ve.b
    public void a() {
        this.g = true;
        this.a.a();
    }

    public void b(Paint paint) {
        if (this.g) {
            this.g = false;
            double dFloatValue = ((double) ((Float) this.d.h()).floatValue()) * 0.017453292519943295d;
            float fFloatValue = ((Float) this.e.h()).floatValue();
            float fSin = ((float) Math.sin(dFloatValue)) * fFloatValue;
            float fCos = ((float) Math.cos(dFloatValue + 3.141592653589793d)) * fFloatValue;
            int iIntValue = ((Integer) this.b.h()).intValue();
            paint.setShadowLayer(((Float) this.f.h()).floatValue(), fSin, fCos, Color.argb(Math.round(((Float) this.c.h()).floatValue()), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)));
        }
    }

    public void c(C8530tf0 c8530tf0) {
        this.b.n(c8530tf0);
    }

    public void d(C8530tf0 c8530tf0) {
        this.d.n(c8530tf0);
    }

    public void e(C8530tf0 c8530tf0) {
        this.e.n(c8530tf0);
    }

    public void f(C8530tf0 c8530tf0) {
        if (c8530tf0 == null) {
            this.c.n(null);
        } else {
            this.c.n(new a(c8530tf0));
        }
    }

    public void g(C8530tf0 c8530tf0) {
        this.f.n(c8530tf0);
    }
}
