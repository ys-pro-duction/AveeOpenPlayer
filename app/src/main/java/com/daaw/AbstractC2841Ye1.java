package com.daaw;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;

/* JADX INFO: renamed from: com.daaw.Ye1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2841Ye1 {
    public static final AbstractC5733jf1 a;
    public static final Property b;
    public static final Property c;

    /* JADX INFO: renamed from: com.daaw.Ye1$a */
    public static class a extends Property {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(AbstractC2841Ye1.c(view));
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f) {
            AbstractC2841Ye1.g(view, f.floatValue());
        }
    }

    /* JADX INFO: renamed from: com.daaw.Ye1$b */
    public static class b extends Property {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Rect get(View view) {
            return AbstractC2317Td1.v(view);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Rect rect) {
            AbstractC2317Td1.w0(view, rect);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            a = new C5452if1();
        } else if (i >= 23) {
            a = new C5174hf1();
        } else if (i >= 22) {
            a = new C4616ff1();
        } else {
            a = new C4049df1();
        }
        b = new a(Float.class, "translationAlpha");
        c = new b(Rect.class, "clipBounds");
    }

    public static void a(View view) {
        a.a(view);
    }

    public static InterfaceC0842Fe1 b(View view) {
        return new C0738Ee1(view);
    }

    public static float c(View view) {
        return a.c(view);
    }

    public static InterfaceC4059dh1 d(View view) {
        return new C3780ch1(view);
    }

    public static void e(View view) {
        a.d(view);
    }

    public static void f(View view, int i, int i2, int i3, int i4) {
        a.e(view, i, i2, i3, i4);
    }

    public static void g(View view, float f) {
        a.f(view, f);
    }

    public static void h(View view, int i) {
        a.g(view, i);
    }

    public static void i(View view, Matrix matrix) {
        a.h(view, matrix);
    }

    public static void j(View view, Matrix matrix) {
        a.i(view, matrix);
    }
}
