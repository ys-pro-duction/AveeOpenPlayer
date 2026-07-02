package com.daaw;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* JADX INFO: renamed from: com.daaw.jR0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C5671jR0 {
    public static final InterfaceC2999Zs m = new C9548xG0(0.5f);
    public AbstractC3838ct a;
    public AbstractC3838ct b;
    public AbstractC3838ct c;
    public AbstractC3838ct d;
    public InterfaceC2999Zs e;
    public InterfaceC2999Zs f;
    public InterfaceC2999Zs g;
    public InterfaceC2999Zs h;
    public C6747nF i;
    public C6747nF j;
    public C6747nF k;
    public C6747nF l;

    /* JADX INFO: renamed from: com.daaw.jR0$c */
    public interface c {
        InterfaceC2999Zs a(InterfaceC2999Zs interfaceC2999Zs);
    }

    public static b a() {
        return new b();
    }

    public static b b(Context context, int i, int i2) {
        return c(context, i, i2, 0);
    }

    public static b c(Context context, int i, int i2, int i3) {
        return d(context, i, i2, new C4713g(i3));
    }

    public static b d(Context context, int i, int i2, InterfaceC2999Zs interfaceC2999Zs) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(WD0.M4);
        try {
            int i3 = typedArrayObtainStyledAttributes.getInt(WD0.N4, 0);
            int i4 = typedArrayObtainStyledAttributes.getInt(WD0.Q4, i3);
            int i5 = typedArrayObtainStyledAttributes.getInt(WD0.R4, i3);
            int i6 = typedArrayObtainStyledAttributes.getInt(WD0.P4, i3);
            int i7 = typedArrayObtainStyledAttributes.getInt(WD0.O4, i3);
            InterfaceC2999Zs interfaceC2999ZsM = m(typedArrayObtainStyledAttributes, WD0.S4, interfaceC2999Zs);
            InterfaceC2999Zs interfaceC2999ZsM2 = m(typedArrayObtainStyledAttributes, WD0.V4, interfaceC2999ZsM);
            InterfaceC2999Zs interfaceC2999ZsM3 = m(typedArrayObtainStyledAttributes, WD0.W4, interfaceC2999ZsM);
            InterfaceC2999Zs interfaceC2999ZsM4 = m(typedArrayObtainStyledAttributes, WD0.U4, interfaceC2999ZsM);
            return new b().y(i4, interfaceC2999ZsM2).C(i5, interfaceC2999ZsM3).u(i6, interfaceC2999ZsM4).q(i7, m(typedArrayObtainStyledAttributes, WD0.T4, interfaceC2999ZsM));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static b e(Context context, AttributeSet attributeSet, int i, int i2) {
        return f(context, attributeSet, i, i2, 0);
    }

    public static b f(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        return g(context, attributeSet, i, i2, new C4713g(i3));
    }

    public static b g(Context context, AttributeSet attributeSet, int i, int i2, InterfaceC2999Zs interfaceC2999Zs) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, WD0.j3, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(WD0.k3, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(WD0.l3, 0);
        typedArrayObtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, interfaceC2999Zs);
    }

    public static InterfaceC2999Zs m(TypedArray typedArray, int i, InterfaceC2999Zs interfaceC2999Zs) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue != null) {
            int i2 = typedValuePeekValue.type;
            if (i2 == 5) {
                return new C4713g(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new C9548xG0(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return interfaceC2999Zs;
    }

    public C6747nF h() {
        return this.k;
    }

    public AbstractC3838ct i() {
        return this.d;
    }

    public InterfaceC2999Zs j() {
        return this.h;
    }

    public AbstractC3838ct k() {
        return this.c;
    }

    public InterfaceC2999Zs l() {
        return this.g;
    }

    public C6747nF n() {
        return this.l;
    }

    public C6747nF o() {
        return this.j;
    }

    public C6747nF p() {
        return this.i;
    }

    public AbstractC3838ct q() {
        return this.a;
    }

    public InterfaceC2999Zs r() {
        return this.e;
    }

    public AbstractC3838ct s() {
        return this.b;
    }

    public InterfaceC2999Zs t() {
        return this.f;
    }

    public boolean u(RectF rectF) {
        boolean z = this.l.getClass().equals(C6747nF.class) && this.j.getClass().equals(C6747nF.class) && this.i.getClass().equals(C6747nF.class) && this.k.getClass().equals(C6747nF.class);
        float fA = this.e.a(rectF);
        return z && ((this.f.a(rectF) > fA ? 1 : (this.f.a(rectF) == fA ? 0 : -1)) == 0 && (this.h.a(rectF) > fA ? 1 : (this.h.a(rectF) == fA ? 0 : -1)) == 0 && (this.g.a(rectF) > fA ? 1 : (this.g.a(rectF) == fA ? 0 : -1)) == 0) && ((this.b instanceof C5084hK0) && (this.a instanceof C5084hK0) && (this.c instanceof C5084hK0) && (this.d instanceof C5084hK0));
    }

    public b v() {
        return new b(this);
    }

    public C5671jR0 w(float f) {
        return v().o(f).m();
    }

    public C5671jR0 x(InterfaceC2999Zs interfaceC2999Zs) {
        return v().p(interfaceC2999Zs).m();
    }

    public C5671jR0 y(c cVar) {
        return v().B(cVar.a(r())).F(cVar.a(t())).t(cVar.a(j())).x(cVar.a(l())).m();
    }

    public C5671jR0(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.c = bVar.c;
        this.d = bVar.d;
        this.e = bVar.e;
        this.f = bVar.f;
        this.g = bVar.g;
        this.h = bVar.h;
        this.i = bVar.i;
        this.j = bVar.j;
        this.k = bVar.k;
        this.l = bVar.l;
    }

    /* JADX INFO: renamed from: com.daaw.jR0$b */
    public static final class b {
        public AbstractC3838ct a;
        public AbstractC3838ct b;
        public AbstractC3838ct c;
        public AbstractC3838ct d;
        public InterfaceC2999Zs e;
        public InterfaceC2999Zs f;
        public InterfaceC2999Zs g;
        public InterfaceC2999Zs h;
        public C6747nF i;
        public C6747nF j;
        public C6747nF k;
        public C6747nF l;

        public b() {
            this.a = AbstractC5183hh0.b();
            this.b = AbstractC5183hh0.b();
            this.c = AbstractC5183hh0.b();
            this.d = AbstractC5183hh0.b();
            this.e = new C4713g(0.0f);
            this.f = new C4713g(0.0f);
            this.g = new C4713g(0.0f);
            this.h = new C4713g(0.0f);
            this.i = AbstractC5183hh0.c();
            this.j = AbstractC5183hh0.c();
            this.k = AbstractC5183hh0.c();
            this.l = AbstractC5183hh0.c();
        }

        public static float n(AbstractC3838ct abstractC3838ct) {
            if (abstractC3838ct instanceof C5084hK0) {
                return ((C5084hK0) abstractC3838ct).a;
            }
            if (abstractC3838ct instanceof C9731xv) {
                return ((C9731xv) abstractC3838ct).a;
            }
            return -1.0f;
        }

        public b A(float f) {
            this.e = new C4713g(f);
            return this;
        }

        public b B(InterfaceC2999Zs interfaceC2999Zs) {
            this.e = interfaceC2999Zs;
            return this;
        }

        public b C(int i, InterfaceC2999Zs interfaceC2999Zs) {
            return D(AbstractC5183hh0.a(i)).F(interfaceC2999Zs);
        }

        public b D(AbstractC3838ct abstractC3838ct) {
            this.b = abstractC3838ct;
            float fN = n(abstractC3838ct);
            if (fN != -1.0f) {
                E(fN);
            }
            return this;
        }

        public b E(float f) {
            this.f = new C4713g(f);
            return this;
        }

        public b F(InterfaceC2999Zs interfaceC2999Zs) {
            this.f = interfaceC2999Zs;
            return this;
        }

        public C5671jR0 m() {
            return new C5671jR0(this);
        }

        public b o(float f) {
            return A(f).E(f).w(f).s(f);
        }

        public b p(InterfaceC2999Zs interfaceC2999Zs) {
            return B(interfaceC2999Zs).F(interfaceC2999Zs).x(interfaceC2999Zs).t(interfaceC2999Zs);
        }

        public b q(int i, InterfaceC2999Zs interfaceC2999Zs) {
            return r(AbstractC5183hh0.a(i)).t(interfaceC2999Zs);
        }

        public b r(AbstractC3838ct abstractC3838ct) {
            this.d = abstractC3838ct;
            float fN = n(abstractC3838ct);
            if (fN != -1.0f) {
                s(fN);
            }
            return this;
        }

        public b s(float f) {
            this.h = new C4713g(f);
            return this;
        }

        public b t(InterfaceC2999Zs interfaceC2999Zs) {
            this.h = interfaceC2999Zs;
            return this;
        }

        public b u(int i, InterfaceC2999Zs interfaceC2999Zs) {
            return v(AbstractC5183hh0.a(i)).x(interfaceC2999Zs);
        }

        public b v(AbstractC3838ct abstractC3838ct) {
            this.c = abstractC3838ct;
            float fN = n(abstractC3838ct);
            if (fN != -1.0f) {
                w(fN);
            }
            return this;
        }

        public b w(float f) {
            this.g = new C4713g(f);
            return this;
        }

        public b x(InterfaceC2999Zs interfaceC2999Zs) {
            this.g = interfaceC2999Zs;
            return this;
        }

        public b y(int i, InterfaceC2999Zs interfaceC2999Zs) {
            return z(AbstractC5183hh0.a(i)).B(interfaceC2999Zs);
        }

        public b z(AbstractC3838ct abstractC3838ct) {
            this.a = abstractC3838ct;
            float fN = n(abstractC3838ct);
            if (fN != -1.0f) {
                A(fN);
            }
            return this;
        }

        public b(C5671jR0 c5671jR0) {
            this.a = AbstractC5183hh0.b();
            this.b = AbstractC5183hh0.b();
            this.c = AbstractC5183hh0.b();
            this.d = AbstractC5183hh0.b();
            this.e = new C4713g(0.0f);
            this.f = new C4713g(0.0f);
            this.g = new C4713g(0.0f);
            this.h = new C4713g(0.0f);
            this.i = AbstractC5183hh0.c();
            this.j = AbstractC5183hh0.c();
            this.k = AbstractC5183hh0.c();
            this.l = AbstractC5183hh0.c();
            this.a = c5671jR0.a;
            this.b = c5671jR0.b;
            this.c = c5671jR0.c;
            this.d = c5671jR0.d;
            this.e = c5671jR0.e;
            this.f = c5671jR0.f;
            this.g = c5671jR0.g;
            this.h = c5671jR0.h;
            this.i = c5671jR0.i;
            this.j = c5671jR0.j;
            this.k = c5671jR0.k;
            this.l = c5671jR0.l;
        }
    }

    public C5671jR0() {
        this.a = AbstractC5183hh0.b();
        this.b = AbstractC5183hh0.b();
        this.c = AbstractC5183hh0.b();
        this.d = AbstractC5183hh0.b();
        this.e = new C4713g(0.0f);
        this.f = new C4713g(0.0f);
        this.g = new C4713g(0.0f);
        this.h = new C4713g(0.0f);
        this.i = AbstractC5183hh0.c();
        this.j = AbstractC5183hh0.c();
        this.k = AbstractC5183hh0.c();
        this.l = AbstractC5183hh0.c();
    }
}
