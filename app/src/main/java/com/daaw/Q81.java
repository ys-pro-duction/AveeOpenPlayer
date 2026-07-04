package com.daaw;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import com.daaw.OO;
import com.daaw.TO;
import com.daaw.XI0;

/* JADX INFO: loaded from: classes.dex */
public abstract class Q81 {
    public static final W81 a;
    public static final C9653xf0 b;

    public static class a extends TO.c {
        public XI0.e a;

        public a(XI0.e eVar) {
            this.a = eVar;
        }

        @Override // com.daaw.TO.c
        public void a(int i) {
            XI0.e eVar = this.a;
            if (eVar != null) {
                eVar.f(i);
            }
        }

        @Override // com.daaw.TO.c
        public void b(Typeface typeface) {
            XI0.e eVar = this.a;
            if (eVar != null) {
                eVar.g(typeface);
            }
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            a = new V81();
        } else if (i >= 28) {
            a = new U81();
        } else if (i >= 26) {
            a = new T81();
        } else if (i < 24 || !S81.j()) {
            a = new R81();
        } else {
            a = new S81();
        }
        b = new C9653xf0(16);
    }

    public static Typeface a(Context context, Typeface typeface, int i) {
        if (context != null) {
            return Typeface.create(typeface, i);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, TO.b[] bVarArr, int i) {
        return a.b(context, cancellationSignal, bVarArr, i);
    }

    public static Typeface c(Context context, OO.b bVar, Resources resources, int i, String str, int i2, int i3, XI0.e eVar, Handler handler, boolean z) {
        Typeface typefaceA;
        if (bVar instanceof OO.e) {
            OO.e eVar2 = (OO.e) bVar;
            Typeface typefaceG = g(eVar2.c());
            if (typefaceG != null) {
                if (eVar != null) {
                    eVar.d(typefaceG, handler);
                }
                return typefaceG;
            }
            typefaceA = TO.c(context, eVar2.b(), i3, !z ? eVar != null : eVar2.a() != 0, z ? eVar2.d() : -1, XI0.e.e(handler), new a(eVar));
        } else {
            typefaceA = a.a(context, (OO.c) bVar, resources, i3);
            if (eVar != null) {
                if (typefaceA != null) {
                    eVar.d(typefaceA, handler);
                } else {
                    eVar.c(-3, handler);
                }
            }
        }
        if (typefaceA != null) {
            b.d(e(resources, i, str, i2, i3), typefaceA);
        }
        return typefaceA;
    }

    public static Typeface d(Context context, Resources resources, int i, String str, int i2, int i3) {
        Typeface typefaceD = a.d(context, resources, i, str, i3);
        if (typefaceD != null) {
            b.d(e(resources, i, str, i2, i3), typefaceD);
        }
        return typefaceD;
    }

    public static String e(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    public static Typeface f(Resources resources, int i, String str, int i2, int i3) {
        return (Typeface) b.c(e(resources, i, str, i2, i3));
    }

    public static Typeface g(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                return typefaceCreate;
            }
        }
        return null;
    }
}
