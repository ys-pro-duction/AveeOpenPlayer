package com.daaw;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class TI0 {
    public static TI0 i;
    public WeakHashMap a;
    public BS0 b;
    public C3724cV0 c;
    public final WeakHashMap d = new WeakHashMap(0);
    public TypedValue e;
    public boolean f;
    public f g;
    public static final PorterDuff.Mode h = PorterDuff.Mode.SRC_IN;
    public static final c j = new c(6);

    public static class a implements e {
        @Override // com.daaw.TI0.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C3346b7.l(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public static class b implements e {
        @Override // com.daaw.TI0.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C4181e7.b(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public static class c extends C9653xf0 {
        public c(int i) {
            super(i);
        }

        public static int j(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        public PorterDuffColorFilter k(int i, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) c(Integer.valueOf(j(i, mode)));
        }

        public PorterDuffColorFilter l(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) d(Integer.valueOf(j(i, mode)), porterDuffColorFilter);
        }
    }

    public static class d implements e {
        @Override // com.daaw.TI0.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(null).newInstance(null);
                    AbstractC1292Jn.c(drawable, context.getResources(), xmlPullParser, attributeSet, theme);
                    return drawable;
                } catch (Exception unused) {
                }
            }
            return null;
        }
    }

    public interface e {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    public interface f {
        Drawable a(TI0 ti0, Context context, int i);

        boolean b(Context context, int i, Drawable drawable);

        PorterDuff.Mode c(int i);

        ColorStateList d(Context context, int i);

        boolean e(Context context, int i, Drawable drawable);
    }

    public static class g implements e {
        @Override // com.daaw.TI0.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C2729Xc1.c(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public static long e(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    public static PorterDuffColorFilter g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return l(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized TI0 h() {
        try {
            if (i == null) {
                TI0 ti0 = new TI0();
                i = ti0;
                p(ti0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return i;
    }

    public static synchronized PorterDuffColorFilter l(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterK;
        c cVar = j;
        porterDuffColorFilterK = cVar.k(i2, mode);
        if (porterDuffColorFilterK == null) {
            porterDuffColorFilterK = new PorterDuffColorFilter(i2, mode);
            cVar.l(i2, mode, porterDuffColorFilterK);
        }
        return porterDuffColorFilterK;
    }

    public static void p(TI0 ti0) {
        if (Build.VERSION.SDK_INT < 24) {
            ti0.a("vector", new g());
            ti0.a("animated-vector", new b());
            ti0.a("animated-selector", new a());
            ti0.a("drawable", new d());
        }
    }

    public static boolean q(Drawable drawable) {
        return (drawable instanceof C2729Xc1) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    public static void w(Drawable drawable, X31 x31, int[] iArr) {
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z = x31.d;
            if (z || x31.c) {
                drawable.setColorFilter(g(z ? x31.a : null, x31.c ? x31.b : h, iArr));
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
        }
    }

    public final void a(String str, e eVar) {
        if (this.b == null) {
            this.b = new BS0();
        }
        this.b.put(str, eVar);
    }

    public final synchronized boolean b(Context context, long j2, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState == null) {
                return false;
            }
            C7131oe0 c7131oe0 = (C7131oe0) this.d.get(context);
            if (c7131oe0 == null) {
                c7131oe0 = new C7131oe0();
                this.d.put(context, c7131oe0);
            }
            c7131oe0.k(j2, new WeakReference(constantState));
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void c(Context context, int i2, ColorStateList colorStateList) {
        if (this.a == null) {
            this.a = new WeakHashMap();
        }
        C3724cV0 c3724cV0 = (C3724cV0) this.a.get(context);
        if (c3724cV0 == null) {
            c3724cV0 = new C3724cV0();
            this.a.put(context, c3724cV0);
        }
        c3724cV0.b(i2, colorStateList);
    }

    public final void d(Context context) {
        if (this.f) {
            return;
        }
        this.f = true;
        Drawable drawableJ = j(context, AbstractC3095aD0.a);
        if (drawableJ == null || !q(drawableJ)) {
            this.f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    public final Drawable f(Context context, int i2) {
        if (this.e == null) {
            this.e = new TypedValue();
        }
        TypedValue typedValue = this.e;
        context.getResources().getValue(i2, typedValue, true);
        long jE = e(typedValue);
        Drawable drawableI = i(context, jE);
        if (drawableI != null) {
            return drawableI;
        }
        f fVar = this.g;
        Drawable drawableA = fVar == null ? null : fVar.a(this, context, i2);
        if (drawableA != null) {
            drawableA.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, jE, drawableA);
        }
        return drawableA;
    }

    public final synchronized Drawable i(Context context, long j2) {
        C7131oe0 c7131oe0 = (C7131oe0) this.d.get(context);
        if (c7131oe0 == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) c7131oe0.g(j2);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            c7131oe0.l(j2);
        }
        return null;
    }

    public synchronized Drawable j(Context context, int i2) {
        return k(context, i2, false);
    }

    public synchronized Drawable k(Context context, int i2, boolean z) {
        Drawable drawableR;
        try {
            d(context);
            drawableR = r(context, i2);
            if (drawableR == null) {
                drawableR = f(context, i2);
            }
            if (drawableR == null) {
                drawableR = AbstractC9438ws.e(context, i2);
            }
            if (drawableR != null) {
                drawableR = v(context, i2, z, drawableR);
            }
            if (drawableR != null) {
                AbstractC5059hE.b(drawableR);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableR;
    }

    public synchronized ColorStateList m(Context context, int i2) {
        ColorStateList colorStateListN;
        colorStateListN = n(context, i2);
        if (colorStateListN == null) {
            f fVar = this.g;
            colorStateListN = fVar == null ? null : fVar.d(context, i2);
            if (colorStateListN != null) {
                c(context, i2, colorStateListN);
            }
        }
        return colorStateListN;
    }

    public final ColorStateList n(Context context, int i2) {
        C3724cV0 c3724cV0;
        WeakHashMap weakHashMap = this.a;
        if (weakHashMap == null || (c3724cV0 = (C3724cV0) weakHashMap.get(context)) == null) {
            return null;
        }
        return (ColorStateList) c3724cV0.g(i2);
    }

    public PorterDuff.Mode o(int i2) {
        f fVar = this.g;
        if (fVar == null) {
            return null;
        }
        return fVar.c(i2);
    }

    public final Drawable r(Context context, int i2) {
        int next;
        BS0 bs0 = this.b;
        if (bs0 == null || bs0.isEmpty()) {
            return null;
        }
        C3724cV0 c3724cV0 = this.c;
        if (c3724cV0 != null) {
            String str = (String) c3724cV0.g(i2);
            if ("appcompat_skip_skip".equals(str) || (str != null && this.b.get(str) == null)) {
                return null;
            }
        } else {
            this.c = new C3724cV0();
        }
        if (this.e == null) {
            this.e = new TypedValue();
        }
        TypedValue typedValue = this.e;
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        long jE = e(typedValue);
        Drawable drawableI = i(context, jE);
        if (drawableI != null) {
            return drawableI;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i2);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.c.b(i2, name);
                e eVar = (e) this.b.get(name);
                if (eVar != null) {
                    drawableI = eVar.a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableI != null) {
                    drawableI.setChangingConfigurations(typedValue.changingConfigurations);
                    b(context, jE, drawableI);
                }
            } catch (Exception unused) {
            }
        }
        if (drawableI == null) {
            this.c.b(i2, "appcompat_skip_skip");
        }
        return drawableI;
    }

    public synchronized void s(Context context) {
        C7131oe0 c7131oe0 = (C7131oe0) this.d.get(context);
        if (c7131oe0 != null) {
            c7131oe0.c();
        }
    }

    public synchronized Drawable t(Context context, C2833Yc1 c2833Yc1, int i2) {
        try {
            Drawable drawableR = r(context, i2);
            if (drawableR == null) {
                drawableR = c2833Yc1.a(i2);
            }
            if (drawableR == null) {
                return null;
            }
            return v(context, i2, false, drawableR);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void u(f fVar) {
        this.g = fVar;
    }

    public final Drawable v(Context context, int i2, boolean z, Drawable drawable) {
        ColorStateList colorStateListM = m(context, i2);
        if (colorStateListM != null) {
            Drawable drawableR = SD.r(drawable.mutate());
            SD.o(drawableR, colorStateListM);
            PorterDuff.Mode modeO = o(i2);
            if (modeO != null) {
                SD.p(drawableR, modeO);
            }
            return drawableR;
        }
        f fVar = this.g;
        if ((fVar == null || !fVar.e(context, i2, drawable)) && !x(context, i2, drawable) && z) {
            return null;
        }
        return drawable;
    }

    public boolean x(Context context, int i2, Drawable drawable) {
        f fVar = this.g;
        return fVar != null && fVar.b(context, i2, drawable);
    }
}
