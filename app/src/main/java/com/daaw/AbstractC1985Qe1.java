package com.daaw;

import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Qe1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1985Qe1 extends AbstractC1256Je {
    public static boolean E = false;
    public static Integer F;
    public final View C;
    public final a D;

    /* JADX INFO: renamed from: com.daaw.Qe1$a */
    public static class a {
        public final View a;
        public final List b = new ArrayList();
        public ViewTreeObserverOnPreDrawListenerC0112a c;
        public Point d;

        /* JADX INFO: renamed from: com.daaw.Qe1$a$a, reason: collision with other inner class name */
        public static class ViewTreeObserverOnPreDrawListenerC0112a implements ViewTreeObserver.OnPreDrawListener {
            public final WeakReference B;

            public ViewTreeObserverOnPreDrawListenerC0112a(a aVar) {
                this.B = new WeakReference(aVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    toString();
                }
                a aVar = (a) this.B.get();
                if (aVar == null) {
                    return true;
                }
                aVar.b();
                return true;
            }
        }

        public a(View view) {
            this.a = view;
        }

        public final void b() {
            if (this.b.isEmpty()) {
                return;
            }
            int iG = g();
            int iF = f();
            if (h(iG) && h(iF)) {
                i(iG, iF);
                ViewTreeObserver viewTreeObserver = this.a.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(this.c);
                }
                this.c = null;
            }
        }

        public final Point c() {
            Point point = this.d;
            if (point != null) {
                return point;
            }
            Display defaultDisplay = ((WindowManager) this.a.getContext().getSystemService("window")).getDefaultDisplay();
            Point point2 = new Point();
            this.d = point2;
            defaultDisplay.getSize(point2);
            return this.d;
        }

        public void d(ET0 et0) {
            int iG = g();
            int iF = f();
            if (h(iG) && h(iF)) {
                et0.f(iG, iF);
                return;
            }
            if (!this.b.contains(et0)) {
                this.b.add(et0);
            }
            if (this.c == null) {
                ViewTreeObserver viewTreeObserver = this.a.getViewTreeObserver();
                ViewTreeObserverOnPreDrawListenerC0112a viewTreeObserverOnPreDrawListenerC0112a = new ViewTreeObserverOnPreDrawListenerC0112a(this);
                this.c = viewTreeObserverOnPreDrawListenerC0112a;
                viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0112a);
            }
        }

        public final int e(int i, boolean z) {
            if (i != -2) {
                return i;
            }
            Point pointC = c();
            return z ? pointC.y : pointC.x;
        }

        public final int f() {
            ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
            if (h(this.a.getHeight())) {
                return this.a.getHeight();
            }
            if (layoutParams != null) {
                return e(layoutParams.height, true);
            }
            return 0;
        }

        public final int g() {
            ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
            if (h(this.a.getWidth())) {
                return this.a.getWidth();
            }
            if (layoutParams != null) {
                return e(layoutParams.width, false);
            }
            return 0;
        }

        public final boolean h(int i) {
            return i > 0 || i == -2;
        }

        public final void i(int i, int i2) {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((ET0) it.next()).f(i, i2);
            }
            this.b.clear();
        }
    }

    public AbstractC1985Qe1(View view) {
        if (view == null) {
            throw new NullPointerException("View must not be null!");
        }
        this.C = view;
        this.D = new a(view);
    }

    @Override // com.daaw.AbstractC1256Je, com.daaw.InterfaceC3596c11
    public void c(InterfaceC7039oI0 interfaceC7039oI0) {
        m(interfaceC7039oI0);
    }

    @Override // com.daaw.InterfaceC3596c11
    public void e(ET0 et0) {
        this.D.d(et0);
    }

    public View getView() {
        return this.C;
    }

    @Override // com.daaw.AbstractC1256Je, com.daaw.InterfaceC3596c11
    public InterfaceC7039oI0 j() {
        Object objL = l();
        if (objL == null) {
            return null;
        }
        if (objL instanceof InterfaceC7039oI0) {
            return (InterfaceC7039oI0) objL;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    public final Object l() {
        Integer num = F;
        return num == null ? this.C.getTag() : this.C.getTag(num.intValue());
    }

    public final void m(Object obj) {
        Integer num = F;
        if (num != null) {
            this.C.setTag(num.intValue(), obj);
        } else {
            E = true;
            this.C.setTag(obj);
        }
    }

    public String toString() {
        return "Target for: " + this.C;
    }
}
