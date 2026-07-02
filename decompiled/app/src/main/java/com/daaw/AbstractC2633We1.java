package com.daaw;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: renamed from: com.daaw.We1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2633We1 {

    /* JADX INFO: renamed from: com.daaw.We1$a */
    public class a implements Runnable {
        public final /* synthetic */ View B;

        public a(View view) {
            this.B = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((InputMethodManager) this.B.getContext().getSystemService("input_method")).showSoftInput(this.B, 1);
        }
    }

    /* JADX INFO: renamed from: com.daaw.We1$b */
    public class b implements InterfaceC2780Xp0 {
        public final /* synthetic */ d B;
        public final /* synthetic */ e C;

        public b(d dVar, e eVar) {
            this.B = dVar;
            this.C = eVar;
        }

        @Override // com.daaw.InterfaceC2780Xp0
        public C8820uh1 a(View view, C8820uh1 c8820uh1) {
            return this.B.a(view, c8820uh1, new e(this.C));
        }
    }

    /* JADX INFO: renamed from: com.daaw.We1$d */
    public interface d {
        C8820uh1 a(View view, C8820uh1 c8820uh1, e eVar);
    }

    public static void a(View view, d dVar) {
        AbstractC2317Td1.D0(view, new b(dVar, new e(AbstractC2317Td1.I(view), view.getPaddingTop(), AbstractC2317Td1.H(view), view.getPaddingBottom())));
        g(view);
    }

    public static float b(Context context, int i) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static Integer c(View view) {
        if (view.getBackground() instanceof ColorDrawable) {
            return Integer.valueOf(((ColorDrawable) view.getBackground()).getColor());
        }
        return null;
    }

    public static float d(View view) {
        float fX = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            fX += AbstractC2317Td1.x((View) parent);
        }
        return fX;
    }

    public static boolean e(View view) {
        return AbstractC2317Td1.D(view) == 1;
    }

    public static PorterDuff.Mode f(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void g(View view) {
        if (AbstractC2317Td1.T(view)) {
            AbstractC2317Td1.m0(view);
        } else {
            view.addOnAttachStateChangeListener(new c());
        }
    }

    public static void h(View view) {
        view.requestFocus();
        view.post(new a(view));
    }

    /* JADX INFO: renamed from: com.daaw.We1$e */
    public static class e {
        public int a;
        public int b;
        public int c;
        public int d;

        public e(int i, int i2, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }

        public e(e eVar) {
            this.a = eVar.a;
            this.b = eVar.b;
            this.c = eVar.c;
            this.d = eVar.d;
        }
    }

    /* JADX INFO: renamed from: com.daaw.We1$c */
    public class c implements View.OnAttachStateChangeListener {
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            AbstractC2317Td1.m0(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }
}
