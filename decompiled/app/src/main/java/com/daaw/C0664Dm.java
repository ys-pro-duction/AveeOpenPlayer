package com.daaw;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import com.daaw.BW0;
import com.daaw.C3231aj;

/* JADX INFO: renamed from: com.daaw.Dm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0664Dm {
    public static final boolean t0 = false;
    public static final Paint u0 = null;
    public Typeface A;
    public Typeface B;
    public Typeface C;
    public C3231aj D;
    public C3231aj E;
    public CharSequence G;
    public CharSequence H;
    public boolean I;
    public boolean K;
    public Bitmap L;
    public Paint M;
    public float N;
    public float O;
    public float P;
    public float Q;
    public float R;
    public int S;
    public int[] T;
    public boolean U;
    public final TextPaint V;
    public final TextPaint W;
    public TimeInterpolator X;
    public TimeInterpolator Y;
    public float Z;
    public final View a;
    public float a0;
    public float b;
    public float b0;
    public boolean c;
    public ColorStateList c0;
    public float d;
    public float d0;
    public float e;
    public float e0;
    public int f;
    public float f0;
    public final Rect g;
    public ColorStateList g0;
    public final Rect h;
    public float h0;
    public final RectF i;
    public float i0;
    public float j0;
    public StaticLayout k0;
    public float l0;
    public float m0;
    public ColorStateList n;
    public float n0;
    public ColorStateList o;
    public CharSequence o0;
    public int p;
    public float q;
    public float r;
    public float s;
    public float t;
    public float u;
    public float v;
    public Typeface w;
    public Typeface x;
    public Typeface y;
    public Typeface z;
    public int j = 16;
    public int k = 16;
    public float l = 15.0f;
    public float m = 15.0f;
    public TextUtils.TruncateAt F = TextUtils.TruncateAt.END;
    public boolean J = true;
    public int p0 = 1;
    public float q0 = 0.0f;
    public float r0 = 1.0f;
    public int s0 = BW0.n;

    /* JADX INFO: renamed from: com.daaw.Dm$a */
    public class a implements C3231aj.a {
        public a() {
        }

        @Override // com.daaw.C3231aj.a
        public void a(Typeface typeface) {
            C0664Dm.this.T(typeface);
        }
    }

    public C0664Dm(View view) {
        this.a = view;
        TextPaint textPaint = new TextPaint(129);
        this.V = textPaint;
        this.W = new TextPaint(textPaint);
        this.h = new Rect();
        this.g = new Rect();
        this.i = new RectF();
        this.e = e();
        H(view.getContext().getResources().getConfiguration());
    }

    public static boolean C(float f, float f2) {
        return Math.abs(f - f2) < 1.0E-5f;
    }

    public static float G(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return AbstractC6991o7.a(f, f2, f3);
    }

    public static boolean L(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    public static int a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i) * f2) + (Color.alpha(i2) * f)), Math.round((Color.red(i) * f2) + (Color.red(i2) * f)), Math.round((Color.green(i) * f2) + (Color.green(i2) * f)), Math.round((Color.blue(i) * f2) + (Color.blue(i2) * f)));
    }

    public final void A(TextPaint textPaint) {
        textPaint.setTextSize(this.l);
        textPaint.setTypeface(this.z);
        textPaint.setLetterSpacing(this.i0);
    }

    public final void B(float f) {
        if (this.c) {
            this.i.set(f < this.e ? this.g : this.h);
            return;
        }
        this.i.left = G(this.g.left, this.h.left, f, this.X);
        this.i.top = G(this.q, this.r, f, this.X);
        this.i.right = G(this.g.right, this.h.right, f, this.X);
        this.i.bottom = G(this.g.bottom, this.h.bottom, f, this.X);
    }

    public final boolean D() {
        return AbstractC2317Td1.D(this.a) == 1;
    }

    public final boolean E() {
        ColorStateList colorStateList = this.o;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.n;
        return colorStateList2 != null && colorStateList2.isStateful();
    }

    public final boolean F(CharSequence charSequence, boolean z) {
        return (z ? V11.d : V11.c).a(charSequence, 0, charSequence.length());
    }

    public void H(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.y;
            if (typeface != null) {
                this.x = AbstractC5040h91.b(configuration, typeface);
            }
            Typeface typeface2 = this.B;
            if (typeface2 != null) {
                this.A = AbstractC5040h91.b(configuration, typeface2);
            }
            Typeface typeface3 = this.x;
            if (typeface3 == null) {
                typeface3 = this.y;
            }
            this.w = typeface3;
            Typeface typeface4 = this.A;
            if (typeface4 == null) {
                typeface4 = this.B;
            }
            this.z = typeface4;
            K(true);
        }
    }

    public final float I(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    public void J() {
        K(false);
    }

    public void K(boolean z) {
        if ((this.a.getHeight() <= 0 || this.a.getWidth() <= 0) && !z) {
            return;
        }
        b(z);
        c();
    }

    public void M(ColorStateList colorStateList) {
        if (this.o == colorStateList && this.n == colorStateList) {
            return;
        }
        this.o = colorStateList;
        this.n = colorStateList;
        J();
    }

    public void N(int i, int i2, int i3, int i4) {
        if (L(this.h, i, i2, i3, i4)) {
            return;
        }
        this.h.set(i, i2, i3, i4);
        this.U = true;
    }

    public void O(Rect rect) {
        N(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void P(int i) {
        L11 l11 = new L11(this.a.getContext(), i);
        if (l11.i() != null) {
            this.o = l11.i();
        }
        if (l11.j() != 0.0f) {
            this.m = l11.j();
        }
        ColorStateList colorStateList = l11.c;
        if (colorStateList != null) {
            this.c0 = colorStateList;
        }
        this.a0 = l11.h;
        this.b0 = l11.i;
        this.Z = l11.j;
        this.h0 = l11.l;
        C3231aj c3231aj = this.E;
        if (c3231aj != null) {
            c3231aj.c();
        }
        this.E = new C3231aj(new a(), l11.e());
        l11.h(this.a.getContext(), this.E);
        J();
    }

    public final void Q(float f) {
        this.m0 = f;
        AbstractC2317Td1.g0(this.a);
    }

    public void R(ColorStateList colorStateList) {
        if (this.o != colorStateList) {
            this.o = colorStateList;
            J();
        }
    }

    public void S(int i) {
        if (this.k != i) {
            this.k = i;
            J();
        }
    }

    public void T(Typeface typeface) {
        if (U(typeface)) {
            J();
        }
    }

    public final boolean U(Typeface typeface) {
        C3231aj c3231aj = this.E;
        if (c3231aj != null) {
            c3231aj.c();
        }
        if (this.y == typeface) {
            return false;
        }
        this.y = typeface;
        Typeface typefaceB = AbstractC5040h91.b(this.a.getContext().getResources().getConfiguration(), typeface);
        this.x = typefaceB;
        if (typefaceB == null) {
            typefaceB = this.y;
        }
        this.w = typefaceB;
        return true;
    }

    public void V(int i, int i2, int i3, int i4) {
        if (L(this.g, i, i2, i3, i4)) {
            return;
        }
        this.g.set(i, i2, i3, i4);
        this.U = true;
    }

    public void W(Rect rect) {
        V(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void X(float f) {
        if (this.i0 != f) {
            this.i0 = f;
            J();
        }
    }

    public final void Y(float f) {
        this.n0 = f;
        AbstractC2317Td1.g0(this.a);
    }

    public void Z(int i) {
        if (this.j != i) {
            this.j = i;
            J();
        }
    }

    public void a0(float f) {
        if (this.l != f) {
            this.l = f;
            J();
        }
    }

    public final void b(boolean z) {
        StaticLayout staticLayout;
        i(1.0f, z);
        CharSequence charSequence = this.H;
        if (charSequence != null && (staticLayout = this.k0) != null) {
            this.o0 = TextUtils.ellipsize(charSequence, this.V, staticLayout.getWidth(), this.F);
        }
        CharSequence charSequence2 = this.o0;
        float fI = 0.0f;
        if (charSequence2 != null) {
            this.l0 = I(this.V, charSequence2);
        } else {
            this.l0 = 0.0f;
        }
        int iB = WT.b(this.k, this.I ? 1 : 0);
        int i = iB & 112;
        if (i == 48) {
            this.r = this.h.top;
        } else if (i != 80) {
            this.r = this.h.centerY() - ((this.V.descent() - this.V.ascent()) / 2.0f);
        } else {
            this.r = this.h.bottom + this.V.ascent();
        }
        int i2 = iB & 8388615;
        if (i2 == 1) {
            this.t = this.h.centerX() - (this.l0 / 2.0f);
        } else if (i2 != 5) {
            this.t = this.h.left;
        } else {
            this.t = this.h.right - this.l0;
        }
        i(0.0f, z);
        float height = this.k0 != null ? r10.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.k0;
        if (staticLayout2 == null || this.p0 <= 1) {
            CharSequence charSequence3 = this.H;
            if (charSequence3 != null) {
                fI = I(this.V, charSequence3);
            }
        } else {
            fI = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.k0;
        this.p = staticLayout3 != null ? staticLayout3.getLineCount() : 0;
        int iB2 = WT.b(this.j, this.I ? 1 : 0);
        int i3 = iB2 & 112;
        if (i3 == 48) {
            this.q = this.g.top;
        } else if (i3 != 80) {
            this.q = this.g.centerY() - (height / 2.0f);
        } else {
            this.q = (this.g.bottom - height) + this.V.descent();
        }
        int i4 = iB2 & 8388615;
        if (i4 == 1) {
            this.s = this.g.centerX() - (fI / 2.0f);
        } else if (i4 != 5) {
            this.s = this.g.left;
        } else {
            this.s = this.g.right - fI;
        }
        j();
        d0(this.b);
    }

    public final boolean b0(Typeface typeface) {
        C3231aj c3231aj = this.D;
        if (c3231aj != null) {
            c3231aj.c();
        }
        if (this.B == typeface) {
            return false;
        }
        this.B = typeface;
        Typeface typefaceB = AbstractC5040h91.b(this.a.getContext().getResources().getConfiguration(), typeface);
        this.A = typefaceB;
        if (typefaceB == null) {
            typefaceB = this.B;
        }
        this.z = typefaceB;
        return true;
    }

    public final void c() {
        g(this.b);
    }

    public void c0(float f) {
        float fA = AbstractC9105vh0.a(f, 0.0f, 1.0f);
        if (fA != this.b) {
            this.b = fA;
            c();
        }
    }

    public final float d(float f) {
        float f2 = this.e;
        return f <= f2 ? AbstractC6991o7.b(1.0f, 0.0f, this.d, f2, f) : AbstractC6991o7.b(0.0f, 1.0f, f2, 1.0f, f);
    }

    public final void d0(float f) {
        h(f);
        boolean z = t0 && this.N != 1.0f;
        this.K = z;
        if (z) {
            n();
        }
        AbstractC2317Td1.g0(this.a);
    }

    public final float e() {
        float f = this.d;
        return f + ((1.0f - f) * 0.5f);
    }

    public void e0(TimeInterpolator timeInterpolator) {
        this.X = timeInterpolator;
        J();
    }

    public final boolean f(CharSequence charSequence) {
        boolean zD = D();
        return this.J ? F(charSequence, zD) : zD;
    }

    public final boolean f0(int[] iArr) {
        this.T = iArr;
        if (!E()) {
            return false;
        }
        J();
        return true;
    }

    public final void g(float f) {
        float f2;
        B(f);
        if (!this.c) {
            this.u = G(this.s, this.t, f, this.X);
            this.v = G(this.q, this.r, f, this.X);
            d0(f);
            f2 = f;
        } else if (f < this.e) {
            this.u = this.s;
            this.v = this.q;
            d0(0.0f);
            f2 = 0.0f;
        } else {
            this.u = this.t;
            this.v = this.r - Math.max(0, this.f);
            d0(1.0f);
            f2 = 1.0f;
        }
        TimeInterpolator timeInterpolator = AbstractC6991o7.b;
        Q(1.0f - G(0.0f, 1.0f, 1.0f - f, timeInterpolator));
        Y(G(1.0f, 0.0f, f, timeInterpolator));
        if (this.o != this.n) {
            this.V.setColor(a(v(), t(), f2));
        } else {
            this.V.setColor(t());
        }
        float f3 = this.h0;
        float f4 = this.i0;
        if (f3 != f4) {
            this.V.setLetterSpacing(G(f4, f3, f, timeInterpolator));
        } else {
            this.V.setLetterSpacing(f3);
        }
        this.P = G(this.d0, this.Z, f, null);
        this.Q = G(this.e0, this.a0, f, null);
        this.R = G(this.f0, this.b0, f, null);
        int iA = a(u(this.g0), u(this.c0), f);
        this.S = iA;
        this.V.setShadowLayer(this.P, this.Q, this.R, iA);
        if (this.c) {
            this.V.setAlpha((int) (d(f) * this.V.getAlpha()));
        }
        AbstractC2317Td1.g0(this.a);
    }

    public void g0(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.G, charSequence)) {
            this.G = charSequence;
            this.H = null;
            j();
            J();
        }
    }

    public final void h(float f) {
        i(f, false);
    }

    public void h0(TimeInterpolator timeInterpolator) {
        this.Y = timeInterpolator;
        J();
    }

    public final void i(float f, boolean z) {
        float f2;
        float f3;
        Typeface typeface;
        if (this.G == null) {
            return;
        }
        float fWidth = this.h.width();
        float fWidth2 = this.g.width();
        if (C(f, 1.0f)) {
            f2 = this.m;
            f3 = this.h0;
            this.N = 1.0f;
            typeface = this.w;
        } else {
            float f4 = this.l;
            float f5 = this.i0;
            Typeface typeface2 = this.z;
            if (C(f, 0.0f)) {
                this.N = 1.0f;
            } else {
                this.N = G(this.l, this.m, f, this.Y) / this.l;
            }
            float f6 = this.m / this.l;
            fWidth = (!z && fWidth2 * f6 > fWidth) ? Math.min(fWidth / f6, fWidth2) : fWidth2;
            f2 = f4;
            f3 = f5;
            typeface = typeface2;
        }
        if (fWidth > 0.0f) {
            boolean z2 = this.O != f2;
            boolean z3 = this.j0 != f3;
            boolean z4 = this.C != typeface;
            StaticLayout staticLayout = this.k0;
            boolean z5 = z2 || z3 || (staticLayout != null && (fWidth > ((float) staticLayout.getWidth()) ? 1 : (fWidth == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z4 || this.U;
            this.O = f2;
            this.j0 = f3;
            this.C = typeface;
            this.U = false;
            this.V.setLinearText(this.N != 1.0f);
            z = z5;
        }
        if (this.H == null || z) {
            this.V.setTextSize(this.O);
            this.V.setTypeface(this.C);
            this.V.setLetterSpacing(this.j0);
            this.I = f(this.G);
            StaticLayout staticLayoutK = k(j0() ? this.p0 : 1, fWidth, this.I);
            this.k0 = staticLayoutK;
            this.H = staticLayoutK.getText();
        }
    }

    public void i0(Typeface typeface) {
        boolean zU = U(typeface);
        boolean zB0 = b0(typeface);
        if (zU || zB0) {
            J();
        }
    }

    public final void j() {
        Bitmap bitmap = this.L;
        if (bitmap != null) {
            bitmap.recycle();
            this.L = null;
        }
    }

    public final boolean j0() {
        if (this.p0 > 1) {
            return (!this.I || this.c) && !this.K;
        }
        return false;
    }

    public final StaticLayout k(int i, float f, boolean z) {
        StaticLayout staticLayoutA = null;
        try {
            staticLayoutA = BW0.c(this.G, this.V, (int) f).e(this.F).h(z).d(i == 1 ? Layout.Alignment.ALIGN_NORMAL : y()).g(false).j(i).i(this.q0, this.r0).f(this.s0).k(null).a();
        } catch (BW0.a e) {
            e.getCause().getMessage();
        }
        return (StaticLayout) AbstractC8621ty0.g(staticLayoutA);
    }

    public void l(Canvas canvas) {
        int iSave = canvas.save();
        if (this.H == null || this.i.width() <= 0.0f || this.i.height() <= 0.0f) {
            return;
        }
        this.V.setTextSize(this.O);
        float f = this.u;
        float f2 = this.v;
        boolean z = this.K && this.L != null;
        float f3 = this.N;
        if (f3 != 1.0f && !this.c) {
            canvas.scale(f3, f3, f, f2);
        }
        if (z) {
            canvas.drawBitmap(this.L, f, f2, this.M);
            canvas.restoreToCount(iSave);
            return;
        }
        if (!j0() || (this.c && this.b <= this.e)) {
            canvas.translate(f, f2);
            this.k0.draw(canvas);
        } else {
            m(canvas, this.u - this.k0.getLineStart(0), f2);
        }
        canvas.restoreToCount(iSave);
    }

    public final void m(Canvas canvas, float f, float f2) {
        int alpha = this.V.getAlpha();
        canvas.translate(f, f2);
        if (!this.c) {
            this.V.setAlpha((int) (this.n0 * alpha));
            if (Build.VERSION.SDK_INT >= 31) {
                TextPaint textPaint = this.V;
                textPaint.setShadowLayer(this.P, this.Q, this.R, AbstractC3779ch0.a(this.S, textPaint.getAlpha()));
            }
            this.k0.draw(canvas);
        }
        if (!this.c) {
            this.V.setAlpha((int) (this.m0 * alpha));
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            TextPaint textPaint2 = this.V;
            textPaint2.setShadowLayer(this.P, this.Q, this.R, AbstractC3779ch0.a(this.S, textPaint2.getAlpha()));
        }
        int lineBaseline = this.k0.getLineBaseline(0);
        CharSequence charSequence = this.o0;
        float f3 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f3, this.V);
        if (i >= 31) {
            this.V.setShadowLayer(this.P, this.Q, this.R, this.S);
        }
        if (this.c) {
            return;
        }
        String strTrim = this.o0.toString().trim();
        if (strTrim.endsWith("…")) {
            strTrim = strTrim.substring(0, strTrim.length() - 1);
        }
        String str = strTrim;
        this.V.setAlpha(alpha);
        canvas.drawText(str, 0, Math.min(this.k0.getLineEnd(0), str.length()), 0.0f, f3, (Paint) this.V);
    }

    public final void n() {
        if (this.L != null || this.g.isEmpty() || TextUtils.isEmpty(this.H)) {
            return;
        }
        g(0.0f);
        int width = this.k0.getWidth();
        int height = this.k0.getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        this.L = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        this.k0.draw(new Canvas(this.L));
        if (this.M == null) {
            this.M = new Paint(3);
        }
    }

    public void o(RectF rectF, int i, int i2) {
        this.I = f(this.G);
        rectF.left = Math.max(r(i, i2), this.h.left);
        rectF.top = this.h.top;
        rectF.right = Math.min(s(rectF, i, i2), this.h.right);
        rectF.bottom = this.h.top + q();
    }

    public ColorStateList p() {
        return this.o;
    }

    public float q() {
        z(this.W);
        return -this.W.ascent();
    }

    public final float r(int i, int i2) {
        return (i2 == 17 || (i2 & 7) == 1) ? (i / 2.0f) - (this.l0 / 2.0f) : ((i2 & 8388613) == 8388613 || (i2 & 5) == 5) ? this.I ? this.h.left : this.h.right - this.l0 : this.I ? this.h.right - this.l0 : this.h.left;
    }

    public final float s(RectF rectF, int i, int i2) {
        return (i2 == 17 || (i2 & 7) == 1) ? (i / 2.0f) + (this.l0 / 2.0f) : ((i2 & 8388613) == 8388613 || (i2 & 5) == 5) ? this.I ? rectF.left + this.l0 : this.h.right : this.I ? this.h.right : rectF.left + this.l0;
    }

    public int t() {
        return u(this.o);
    }

    public final int u(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.T;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final int v() {
        return u(this.n);
    }

    public float w() {
        A(this.W);
        return -this.W.ascent();
    }

    public float x() {
        return this.b;
    }

    public final Layout.Alignment y() {
        int iB = WT.b(this.j, this.I ? 1 : 0) & 7;
        return iB != 1 ? iB != 5 ? this.I ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.I ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
    }

    public final void z(TextPaint textPaint) {
        textPaint.setTextSize(this.m);
        textPaint.setTypeface(this.w);
        textPaint.setLetterSpacing(this.h0);
    }
}
