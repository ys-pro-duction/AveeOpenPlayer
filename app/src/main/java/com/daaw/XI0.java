package com.daaw;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.util.TypedValue;
import com.daaw.OO;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class XI0 {
    public static final ThreadLocal a = new ThreadLocal();
    public static final WeakHashMap b = new WeakHashMap(0);
    public static final Object c = new Object();

    public static class a {
        public static Drawable a(Resources resources, int i, Resources.Theme theme) {
            return resources.getDrawable(i, theme);
        }

        public static Drawable b(Resources resources, int i, int i2, Resources.Theme theme) {
            return resources.getDrawableForDensity(i, i2, theme);
        }
    }

    public static class b {
        public static int a(Resources resources, int i, Resources.Theme theme) {
            return resources.getColor(i, theme);
        }

        public static ColorStateList b(Resources resources, int i, Resources.Theme theme) {
            return resources.getColorStateList(i, theme);
        }
    }

    public static class c {
        public final ColorStateList a;
        public final Configuration b;
        public final int c;

        public c(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.a = colorStateList;
            this.b = configuration;
            this.c = theme == null ? 0 : theme.hashCode();
        }
    }

    public static final class d {
        public final Resources a;
        public final Resources.Theme b;

        public d(Resources resources, Resources.Theme theme) {
            this.a = resources;
            this.b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class == obj.getClass()) {
                d dVar = (d) obj;
                if (this.a.equals(dVar.a) && AbstractC8580tp0.a(this.b, dVar.b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return AbstractC8580tp0.b(this.a, this.b);
        }
    }

    public static abstract class e {
        public static Handler e(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        public final void c(final int i, Handler handler) {
            e(handler).post(new Runnable() { // from class: com.daaw.ZI0
                @Override // java.lang.Runnable
                public final void run() {
                    this.B.f(i);
                }
            });
        }

        public final void d(final Typeface typeface, Handler handler) {
            e(handler).post(new Runnable() { // from class: com.daaw.YI0
                @Override // java.lang.Runnable
                public final void run() {
                    this.B.g(typeface);
                }
            });
        }

        public abstract void f(int i);

        public abstract void g(Typeface typeface);
    }

    public static final class f {

        public static class a {
            public static final Object a = new Object();
            public static Method b;
            public static boolean c;

            public static void a(Resources.Theme theme) {
                synchronized (a) {
                    if (!c) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                            b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException unused) {
                        }
                        c = true;
                    }
                    Method method = b;
                    if (method != null) {
                        try {
                            method.invoke(theme, null);
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                            b = null;
                        }
                    }
                }
            }
        }

        public static class b {
            public static void a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        public static void a(Resources.Theme theme) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                b.a(theme);
            } else if (i >= 23) {
                a.a(theme);
            }
        }
    }

    public static void a(d dVar, int i, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (c) {
            try {
                WeakHashMap weakHashMap = b;
                SparseArray sparseArray = (SparseArray) weakHashMap.get(dVar);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    weakHashMap.put(dVar, sparseArray);
                }
                sparseArray.append(i, new c(colorStateList, dVar.a.getConfiguration(), theme));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        if (r2.c == r5.hashCode()) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.content.res.ColorStateList b(com.daaw.XI0.d r5, int r6) {
        /*
            java.lang.Object r0 = com.daaw.XI0.c
            monitor-enter(r0)
            java.util.WeakHashMap r1 = com.daaw.XI0.b     // Catch: java.lang.Throwable -> L32
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L32
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L45
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L32
            if (r2 <= 0) goto L45
            java.lang.Object r2 = r1.get(r6)     // Catch: java.lang.Throwable -> L32
            com.daaw.XI0$c r2 = (com.daaw.XI0.c) r2     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L45
            android.content.res.Configuration r3 = r2.b     // Catch: java.lang.Throwable -> L32
            android.content.res.Resources r4 = r5.a     // Catch: java.lang.Throwable -> L32
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch: java.lang.Throwable -> L32
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L42
            android.content.res.Resources$Theme r5 = r5.b     // Catch: java.lang.Throwable -> L32
            if (r5 != 0) goto L34
            int r3 = r2.c     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L3e
            goto L34
        L32:
            r5 = move-exception
            goto L48
        L34:
            if (r5 == 0) goto L42
            int r3 = r2.c     // Catch: java.lang.Throwable -> L32
            int r5 = r5.hashCode()     // Catch: java.lang.Throwable -> L32
            if (r3 != r5) goto L42
        L3e:
            android.content.res.ColorStateList r5 = r2.a     // Catch: java.lang.Throwable -> L32
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return r5
        L42:
            r1.remove(r6)     // Catch: java.lang.Throwable -> L32
        L45:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            r5 = 0
            return r5
        L48:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.XI0.b(com.daaw.XI0$d, int):android.content.res.ColorStateList");
    }

    public static Typeface c(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return m(context, i, new TypedValue(), 0, null, null, false, true);
    }

    public static ColorStateList d(Resources resources, int i, Resources.Theme theme) {
        d dVar = new d(resources, theme);
        ColorStateList colorStateListB = b(dVar, i);
        if (colorStateListB != null) {
            return colorStateListB;
        }
        ColorStateList colorStateListK = k(resources, i, theme);
        if (colorStateListK == null) {
            return Build.VERSION.SDK_INT >= 23 ? b.b(resources, i, theme) : resources.getColorStateList(i);
        }
        a(dVar, i, colorStateListK, theme);
        return colorStateListK;
    }

    public static Drawable e(Resources resources, int i, Resources.Theme theme) {
        return a.a(resources, i, theme);
    }

    public static Drawable f(Resources resources, int i, int i2, Resources.Theme theme) {
        return a.b(resources, i, i2, theme);
    }

    public static Typeface g(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return m(context, i, new TypedValue(), 0, null, null, false, false);
    }

    public static Typeface h(Context context, int i, TypedValue typedValue, int i2, e eVar) {
        if (context.isRestricted()) {
            return null;
        }
        return m(context, i, typedValue, i2, eVar, null, true, false);
    }

    public static void i(Context context, int i, e eVar, Handler handler) {
        AbstractC8621ty0.g(eVar);
        if (context.isRestricted()) {
            eVar.c(-4, handler);
        } else {
            m(context, i, new TypedValue(), 0, eVar, handler, false, false);
        }
    }

    public static TypedValue j() {
        ThreadLocal threadLocal = a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    public static ColorStateList k(Resources resources, int i, Resources.Theme theme) {
        if (l(resources, i)) {
            return null;
        }
        try {
            return AbstractC5771jn.a(resources, resources.getXml(i), theme);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean l(Resources resources, int i) {
        TypedValue typedValueJ = j();
        resources.getValue(i, typedValueJ, true);
        int i2 = typedValueJ.type;
        return i2 >= 28 && i2 <= 31;
    }

    public static Typeface m(Context context, int i, TypedValue typedValue, int i2, e eVar, Handler handler, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface typefaceN = n(context, resources, typedValue, i, i2, eVar, handler, z, z2);
        if (typefaceN != null || eVar != null || z2) {
            return typefaceN;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }

    public static Typeface n(Context context, Resources resources, TypedValue typedValue, int i, int i2, e eVar, Handler handler, boolean z, boolean z2) {
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        if (!string.startsWith("res/")) {
            if (eVar != null) {
                eVar.c(-3, handler);
            }
            return null;
        }
        Typeface typefaceF = Q81.f(resources, i, string, typedValue.assetCookie, i2);
        if (typefaceF != null) {
            if (eVar != null) {
                eVar.d(typefaceF, handler);
            }
            return typefaceF;
        }
        if (z2) {
            return null;
        }
        try {
            if (string.toLowerCase().endsWith(".xml")) {
                OO.b bVarB = OO.b(resources.getXml(i), resources);
                if (bVarB != null) {
                    return Q81.c(context, bVarB, resources, i, string, typedValue.assetCookie, i2, eVar, handler, z);
                }
                if (eVar != null) {
                    eVar.c(-3, handler);
                }
                return null;
            }
            Typeface typefaceD = Q81.d(context, resources, i, string, typedValue.assetCookie, i2);
            if (eVar != null) {
                if (typefaceD != null) {
                    eVar.d(typefaceD, handler);
                    return typefaceD;
                }
                eVar.c(-3, handler);
            }
            return typefaceD;
        } catch (IOException | XmlPullParserException unused) {
            if (eVar != null) {
                eVar.c(-3, handler);
            }
            return null;
        }
    }
}
