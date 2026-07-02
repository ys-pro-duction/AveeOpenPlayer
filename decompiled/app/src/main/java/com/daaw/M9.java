package com.daaw;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import com.daaw.XI0;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class M9 {
    public final TextView a;
    public X31 b;
    public X31 c;
    public X31 d;
    public X31 e;
    public X31 f;
    public X31 g;
    public X31 h;
    public final O9 i;
    public int j = 0;
    public int k = -1;
    public Typeface l;
    public boolean m;

    public class b implements Runnable {
        public final /* synthetic */ TextView B;
        public final /* synthetic */ Typeface C;
        public final /* synthetic */ int D;

        public b(TextView textView, Typeface typeface, int i) {
            this.B = textView;
            this.C = typeface;
            this.D = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.B.setTypeface(this.C, this.D);
        }
    }

    public static class c {
        public static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    public static class d {
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        public static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    public static class e {
        public static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        public static void b(TextView textView, int i, int i2, int i3, int i4) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        public static void c(TextView textView, int[] iArr, int i) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        public static boolean d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    public static class f {
        public static Typeface a(Typeface typeface, int i, boolean z) {
            return Typeface.create(typeface, i, z);
        }
    }

    public M9(TextView textView) {
        this.a = textView;
        this.i = new O9(textView);
    }

    public static X31 d(Context context, C8116s9 c8116s9, int i) {
        ColorStateList colorStateListF = c8116s9.f(context, i);
        if (colorStateListF == null) {
            return null;
        }
        X31 x31 = new X31();
        x31.d = true;
        x31.a = colorStateListF;
        return x31;
    }

    public void A(int i, float f2) {
        if (AbstractC2737Xe1.c || l()) {
            return;
        }
        B(i, f2);
    }

    public final void B(int i, float f2) {
        this.i.t(i, f2);
    }

    public final void C(Context context, Z31 z31) {
        String strO;
        this.j = z31.k(AbstractC5060hE0.E2, this.j);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            int iK = z31.k(AbstractC5060hE0.J2, -1);
            this.k = iK;
            if (iK != -1) {
                this.j &= 2;
            }
        }
        if (!z31.s(AbstractC5060hE0.I2) && !z31.s(AbstractC5060hE0.K2)) {
            if (z31.s(AbstractC5060hE0.D2)) {
                this.m = false;
                int iK2 = z31.k(AbstractC5060hE0.D2, 1);
                if (iK2 == 1) {
                    this.l = Typeface.SANS_SERIF;
                    return;
                } else if (iK2 == 2) {
                    this.l = Typeface.SERIF;
                    return;
                } else {
                    if (iK2 != 3) {
                        return;
                    }
                    this.l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.l = null;
        int i2 = z31.s(AbstractC5060hE0.K2) ? AbstractC5060hE0.K2 : AbstractC5060hE0.I2;
        int i3 = this.k;
        int i4 = this.j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceJ = z31.j(i2, this.j, new a(i3, i4, new WeakReference(this.a)));
                if (typefaceJ != null) {
                    if (i < 28 || this.k == -1) {
                        this.l = typefaceJ;
                    } else {
                        this.l = f.a(Typeface.create(typefaceJ, 0), this.k, (this.j & 2) != 0);
                    }
                }
                this.m = this.l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.l != null || (strO = z31.o(i2)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.k == -1) {
            this.l = Typeface.create(strO, this.j);
        } else {
            this.l = f.a(Typeface.create(strO, 0), this.k, (this.j & 2) != 0);
        }
    }

    public final void a(Drawable drawable, X31 x31) {
        if (drawable == null || x31 == null) {
            return;
        }
        C8116s9.i(drawable, x31, this.a.getDrawableState());
    }

    public void b() {
        if (this.b != null || this.c != null || this.d != null || this.e != null) {
            Drawable[] compoundDrawables = this.a.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f == null && this.g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.a.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f);
        a(compoundDrawablesRelative[2], this.g);
    }

    public void c() {
        this.i.a();
    }

    public int e() {
        return this.i.f();
    }

    public int f() {
        return this.i.g();
    }

    public int g() {
        return this.i.h();
    }

    public int[] h() {
        return this.i.i();
    }

    public int i() {
        return this.i.j();
    }

    public ColorStateList j() {
        X31 x31 = this.h;
        if (x31 != null) {
            return x31.a;
        }
        return null;
    }

    public PorterDuff.Mode k() {
        X31 x31 = this.h;
        if (x31 != null) {
            return x31.b;
        }
        return null;
    }

    public boolean l() {
        return this.i.n();
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m(android.util.AttributeSet r21, int r22) {
        /*
            Method dump skipped, instruction units count: 873
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.M9.m(android.util.AttributeSet, int):void");
    }

    public void n(WeakReference weakReference, Typeface typeface) {
        if (this.m) {
            this.l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new b(textView, typeface, this.j));
                } else {
                    textView.setTypeface(typeface, this.j);
                }
            }
        }
    }

    public void o(boolean z, int i, int i2, int i3, int i4) {
        if (AbstractC2737Xe1.c) {
            return;
        }
        c();
    }

    public void p() {
        b();
    }

    public void q(Context context, int i) {
        String strO;
        ColorStateList colorStateListC;
        ColorStateList colorStateListC2;
        ColorStateList colorStateListC3;
        Z31 z31T = Z31.t(context, i, AbstractC5060hE0.B2);
        if (z31T.s(AbstractC5060hE0.M2)) {
            s(z31T.a(AbstractC5060hE0.M2, false));
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 23) {
            if (z31T.s(AbstractC5060hE0.F2) && (colorStateListC3 = z31T.c(AbstractC5060hE0.F2)) != null) {
                this.a.setTextColor(colorStateListC3);
            }
            if (z31T.s(AbstractC5060hE0.H2) && (colorStateListC2 = z31T.c(AbstractC5060hE0.H2)) != null) {
                this.a.setLinkTextColor(colorStateListC2);
            }
            if (z31T.s(AbstractC5060hE0.G2) && (colorStateListC = z31T.c(AbstractC5060hE0.G2)) != null) {
                this.a.setHintTextColor(colorStateListC);
            }
        }
        if (z31T.s(AbstractC5060hE0.C2) && z31T.f(AbstractC5060hE0.C2, -1) == 0) {
            this.a.setTextSize(0, 0.0f);
        }
        C(context, z31T);
        if (i2 >= 26 && z31T.s(AbstractC5060hE0.L2) && (strO = z31T.o(AbstractC5060hE0.L2)) != null) {
            e.d(this.a, strO);
        }
        z31T.x();
        Typeface typeface = this.l;
        if (typeface != null) {
            this.a.setTypeface(typeface, this.j);
        }
    }

    public void r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        AbstractC8141sF.f(editorInfo, textView.getText());
    }

    public void s(boolean z) {
        this.a.setAllCaps(z);
    }

    public void t(int i, int i2, int i3, int i4) {
        this.i.p(i, i2, i3, i4);
    }

    public void u(int[] iArr, int i) {
        this.i.q(iArr, i);
    }

    public void v(int i) {
        this.i.r(i);
    }

    public void w(ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new X31();
        }
        X31 x31 = this.h;
        x31.a = colorStateList;
        x31.d = colorStateList != null;
        z();
    }

    public void x(PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new X31();
        }
        X31 x31 = this.h;
        x31.b = mode;
        x31.c = mode != null;
        z();
    }

    public final void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = this.a.getCompoundDrawablesRelative();
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            TextView textView = this.a;
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative2 = this.a.getCompoundDrawablesRelative();
        Drawable drawable7 = compoundDrawablesRelative2[0];
        if (drawable7 != null || compoundDrawablesRelative2[2] != null) {
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            this.a.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, compoundDrawablesRelative2[2], drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.a.getCompoundDrawables();
        TextView textView2 = this.a;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    public final void z() {
        X31 x31 = this.h;
        this.b = x31;
        this.c = x31;
        this.d = x31;
        this.e = x31;
        this.f = x31;
        this.g = x31;
    }

    public class a extends XI0.e {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ WeakReference c;

        public a(int i, int i2, WeakReference weakReference) {
            this.a = i;
            this.b = i2;
            this.c = weakReference;
        }

        @Override // com.daaw.XI0.e
        public void g(Typeface typeface) {
            int i;
            if (Build.VERSION.SDK_INT >= 28 && (i = this.a) != -1) {
                typeface = f.a(typeface, i, (this.b & 2) != 0);
            }
            M9.this.n(this.c, typeface);
        }

        @Override // com.daaw.XI0.e
        public void f(int i) {
        }
    }
}
