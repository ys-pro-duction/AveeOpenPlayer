package com.daaw;

import android.graphics.Color;
import android.graphics.PointF;
import com.daaw.AbstractC6977o40;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.v40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8936v40 {
    public static final AbstractC6977o40.a a = AbstractC6977o40.a.a("x", "y");

    /* JADX INFO: renamed from: com.daaw.v40$a */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[AbstractC6977o40.b.values().length];
            a = iArr;
            try {
                iArr[AbstractC6977o40.b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[AbstractC6977o40.b.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[AbstractC6977o40.b.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static PointF a(AbstractC6977o40 abstractC6977o40, float f) {
        abstractC6977o40.c();
        float F = (float) abstractC6977o40.F();
        float F2 = (float) abstractC6977o40.F();
        while (abstractC6977o40.W() != AbstractC6977o40.b.END_ARRAY) {
            abstractC6977o40.q0();
        }
        abstractC6977o40.j();
        return new PointF(F * f, F2 * f);
    }

    public static PointF b(AbstractC6977o40 abstractC6977o40, float f) {
        float F = (float) abstractC6977o40.F();
        float F2 = (float) abstractC6977o40.F();
        while (abstractC6977o40.o()) {
            abstractC6977o40.q0();
        }
        return new PointF(F * f, F2 * f);
    }

    public static PointF c(AbstractC6977o40 abstractC6977o40, float f) {
        abstractC6977o40.d();
        float fG = 0.0f;
        float fG2 = 0.0f;
        while (abstractC6977o40.o()) {
            int iO0 = abstractC6977o40.o0(a);
            if (iO0 == 0) {
                fG = g(abstractC6977o40);
            } else if (iO0 != 1) {
                abstractC6977o40.p0();
                abstractC6977o40.q0();
            } else {
                fG2 = g(abstractC6977o40);
            }
        }
        abstractC6977o40.l();
        return new PointF(fG * f, fG2 * f);
    }

    public static int d(AbstractC6977o40 abstractC6977o40) {
        abstractC6977o40.c();
        int iF = (int) (abstractC6977o40.F() * 255.0d);
        int iF2 = (int) (abstractC6977o40.F() * 255.0d);
        int iF3 = (int) (abstractC6977o40.F() * 255.0d);
        while (abstractC6977o40.o()) {
            abstractC6977o40.q0();
        }
        abstractC6977o40.j();
        return Color.argb(255, iF, iF2, iF3);
    }

    public static PointF e(AbstractC6977o40 abstractC6977o40, float f) {
        int i = a.a[abstractC6977o40.W().ordinal()];
        if (i == 1) {
            return b(abstractC6977o40, f);
        }
        if (i == 2) {
            return a(abstractC6977o40, f);
        }
        if (i == 3) {
            return c(abstractC6977o40, f);
        }
        throw new IllegalArgumentException("Unknown point starts with " + abstractC6977o40.W());
    }

    public static List f(AbstractC6977o40 abstractC6977o40, float f) {
        ArrayList arrayList = new ArrayList();
        abstractC6977o40.c();
        while (abstractC6977o40.W() == AbstractC6977o40.b.BEGIN_ARRAY) {
            abstractC6977o40.c();
            arrayList.add(e(abstractC6977o40, f));
            abstractC6977o40.j();
        }
        abstractC6977o40.j();
        return arrayList;
    }

    public static float g(AbstractC6977o40 abstractC6977o40) {
        AbstractC6977o40.b bVarW = abstractC6977o40.W();
        int i = a.a[bVarW.ordinal()];
        if (i == 1) {
            return (float) abstractC6977o40.F();
        }
        if (i != 2) {
            throw new IllegalArgumentException("Unknown value for token of type " + bVarW);
        }
        abstractC6977o40.c();
        float F = (float) abstractC6977o40.F();
        while (abstractC6977o40.o()) {
            abstractC6977o40.q0();
        }
        abstractC6977o40.j();
        return F;
    }
}
