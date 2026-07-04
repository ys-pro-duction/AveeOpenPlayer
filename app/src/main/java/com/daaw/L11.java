package com.daaw;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import com.daaw.XI0;

/* JADX INFO: loaded from: classes3.dex */
public class L11 {
    public final ColorStateList a;
    public final ColorStateList b;
    public final ColorStateList c;
    public final String d;
    public final int e;
    public final int f;
    public final boolean g;
    public final float h;
    public final float i;
    public final float j;
    public final boolean k;
    public final float l;
    public ColorStateList m;
    public float n;
    public final int o;
    public boolean p = false;
    public Typeface q;

    public class a extends XI0.e {
        public final /* synthetic */ N11 a;

        public a(N11 n11) {
            this.a = n11;
        }

        @Override // com.daaw.XI0.e
        public void f(int i) {
            L11.this.p = true;
            this.a.a(i);
        }

        @Override // com.daaw.XI0.e
        public void g(Typeface typeface) {
            L11 l11 = L11.this;
            l11.q = Typeface.create(typeface, l11.e);
            L11.this.p = true;
            this.a.b(L11.this.q, false);
        }
    }

    public class b extends N11 {
        public final /* synthetic */ Context a;
        public final /* synthetic */ TextPaint b;
        public final /* synthetic */ N11 c;

        public b(Context context, TextPaint textPaint, N11 n11) {
            this.a = context;
            this.b = textPaint;
            this.c = n11;
        }

        @Override // com.daaw.N11
        public void a(int i) {
            this.c.a(i);
        }

        @Override // com.daaw.N11
        public void b(Typeface typeface, boolean z) {
            L11.this.p(this.a, this.b, typeface);
            this.c.b(typeface, z);
        }
    }

    public L11(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, WD0.A5);
        l(typedArrayObtainStyledAttributes.getDimension(WD0.B5, 0.0f));
        k(AbstractC4336eh0.a(context, typedArrayObtainStyledAttributes, WD0.E5));
        this.a = AbstractC4336eh0.a(context, typedArrayObtainStyledAttributes, WD0.F5);
        this.b = AbstractC4336eh0.a(context, typedArrayObtainStyledAttributes, WD0.G5);
        this.e = typedArrayObtainStyledAttributes.getInt(WD0.D5, 0);
        this.f = typedArrayObtainStyledAttributes.getInt(WD0.C5, 1);
        int iE = AbstractC4336eh0.e(typedArrayObtainStyledAttributes, WD0.M5, WD0.L5);
        this.o = typedArrayObtainStyledAttributes.getResourceId(iE, 0);
        this.d = typedArrayObtainStyledAttributes.getString(iE);
        this.g = typedArrayObtainStyledAttributes.getBoolean(WD0.N5, false);
        this.c = AbstractC4336eh0.a(context, typedArrayObtainStyledAttributes, WD0.H5);
        this.h = typedArrayObtainStyledAttributes.getFloat(WD0.I5, 0.0f);
        this.i = typedArrayObtainStyledAttributes.getFloat(WD0.J5, 0.0f);
        this.j = typedArrayObtainStyledAttributes.getFloat(WD0.K5, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i, WD0.n3);
        this.k = typedArrayObtainStyledAttributes2.hasValue(WD0.o3);
        this.l = typedArrayObtainStyledAttributes2.getFloat(WD0.o3, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    public final void d() {
        String str;
        if (this.q == null && (str = this.d) != null) {
            this.q = Typeface.create(str, this.e);
        }
        if (this.q == null) {
            int i = this.f;
            if (i == 1) {
                this.q = Typeface.SANS_SERIF;
            } else if (i == 2) {
                this.q = Typeface.SERIF;
            } else if (i != 3) {
                this.q = Typeface.DEFAULT;
            } else {
                this.q = Typeface.MONOSPACE;
            }
            this.q = Typeface.create(this.q, this.e);
        }
    }

    public Typeface e() {
        d();
        return this.q;
    }

    public Typeface f(Context context) {
        if (this.p) {
            return this.q;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceG = XI0.g(context, this.o);
                this.q = typefaceG;
                if (typefaceG != null) {
                    this.q = Typeface.create(typefaceG, this.e);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException | Exception unused) {
            }
        }
        d();
        this.p = true;
        return this.q;
    }

    public void g(Context context, TextPaint textPaint, N11 n11) {
        p(context, textPaint, e());
        h(context, new b(context, textPaint, n11));
    }

    public void h(Context context, N11 n11) {
        if (m(context)) {
            f(context);
        } else {
            d();
        }
        int i = this.o;
        if (i == 0) {
            this.p = true;
        }
        if (this.p) {
            n11.b(this.q, true);
            return;
        }
        try {
            XI0.i(context, i, new a(n11), null);
        } catch (Resources.NotFoundException unused) {
            this.p = true;
            n11.a(1);
        } catch (Exception unused2) {
            this.p = true;
            n11.a(-3);
        }
    }

    public ColorStateList i() {
        return this.m;
    }

    public float j() {
        return this.n;
    }

    public void k(ColorStateList colorStateList) {
        this.m = colorStateList;
    }

    public void l(float f) {
        this.n = f;
    }

    public final boolean m(Context context) {
        if (M11.a()) {
            return true;
        }
        int i = this.o;
        return (i != 0 ? XI0.c(context, i) : null) != null;
    }

    public void n(Context context, TextPaint textPaint, N11 n11) {
        o(context, textPaint, n11);
        ColorStateList colorStateList = this.m;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f = this.j;
        float f2 = this.h;
        float f3 = this.i;
        ColorStateList colorStateList2 = this.c;
        textPaint.setShadowLayer(f, f2, f3, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void o(Context context, TextPaint textPaint, N11 n11) {
        if (m(context)) {
            p(context, textPaint, f(context));
        } else {
            g(context, textPaint, n11);
        }
    }

    public void p(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceA = AbstractC5040h91.a(context, typeface);
        if (typefaceA != null) {
            typeface = typefaceA;
        }
        textPaint.setTypeface(typeface);
        int i = this.e & (~typeface.getStyle());
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.n);
        if (this.k) {
            textPaint.setLetterSpacing(this.l);
        }
    }
}
