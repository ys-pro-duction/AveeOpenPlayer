package com.daaw;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class W91 extends RippleDrawable {
    public static final a F = new a(null);
    public static Method G;
    public static boolean H;
    public final boolean B;
    public C2559Vm C;
    public Integer D;
    public boolean E;

    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public a() {
        }
    }

    public static final class b {
        public static final b a = new b();

        public final void a(RippleDrawable rippleDrawable, int i) {
            G10.g(rippleDrawable, "ripple");
            rippleDrawable.setRadius(i);
        }
    }

    public W91(boolean z) {
        super(ColorStateList.valueOf(-16777216), null, z ? new ColorDrawable(-1) : null);
        this.B = z;
    }

    public final long a(long j, float f) {
        if (Build.VERSION.SDK_INT < 28) {
            f *= 2;
        }
        return C2559Vm.m(j, AbstractC8417tE0.g(f, 1.0f), 0.0f, 0.0f, 0.0f, 14, null);
    }

    public final void b(long j, float f) {
        long jA = a(j, f);
        C2559Vm c2559Vm = this.C;
        if (c2559Vm == null ? false : C2559Vm.o(c2559Vm.w(), jA)) {
            return;
        }
        this.C = C2559Vm.i(jA);
        setColor(ColorStateList.valueOf(AbstractC3530bn.i(jA)));
    }

    public final void c(int i) {
        Integer num = this.D;
        if (num != null && num.intValue() == i) {
            return;
        }
        this.D = Integer.valueOf(i);
        if (Build.VERSION.SDK_INT >= 23) {
            b.a.a(this, i);
            return;
        }
        try {
            if (!H) {
                H = true;
                G = RippleDrawable.class.getDeclaredMethod("setMaxRadius", Integer.TYPE);
            }
            Method method = G;
            if (method != null) {
                method.invoke(this, Integer.valueOf(i));
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        if (!this.B) {
            this.E = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        G10.f(dirtyBounds, "super.getDirtyBounds()");
        this.E = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public boolean isProjected() {
        return this.E;
    }
}
