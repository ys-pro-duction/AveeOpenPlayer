package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.daaw.AbstractC2317Td1;
import com.daaw.C3487be1;
import com.daaw.InterfaceC4724g2;
import com.daaw.Z1;

/* JADX INFO: loaded from: classes3.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.b {
    public C3487be1 a;
    public boolean b;
    public boolean c;
    public boolean e;
    public float d = 0.0f;
    public int f = 2;
    public float g = 0.5f;
    public float h = 0.0f;
    public float i = 0.5f;
    public final C3487be1.c j = new a();

    public class a extends C3487be1.c {
        public int a;
        public int b = -1;

        public a() {
        }

        @Override // com.daaw.C3487be1.c
        public int a(View view, int i, int i2) {
            int width;
            int width2;
            int width3;
            boolean z = AbstractC2317Td1.D(view) == 1;
            int i3 = SwipeDismissBehavior.this.f;
            if (i3 == 0) {
                if (z) {
                    width = this.a - view.getWidth();
                    width2 = this.a;
                } else {
                    width = this.a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i3 != 1) {
                width = this.a - view.getWidth();
                width2 = view.getWidth() + this.a;
            } else if (z) {
                width = this.a;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.a - view.getWidth();
                width2 = this.a;
            }
            return SwipeDismissBehavior.H(width, i, width2);
        }

        @Override // com.daaw.C3487be1.c
        public int b(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // com.daaw.C3487be1.c
        public int d(View view) {
            return view.getWidth();
        }

        @Override // com.daaw.C3487be1.c
        public void i(View view, int i) {
            this.b = i;
            this.a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior.this.c = true;
                parent.requestDisallowInterceptTouchEvent(true);
                SwipeDismissBehavior.this.c = false;
            }
        }

        @Override // com.daaw.C3487be1.c
        public void j(int i) {
            SwipeDismissBehavior.this.getClass();
        }

        @Override // com.daaw.C3487be1.c
        public void k(View view, int i, int i2, int i3, int i4) {
            float width = view.getWidth() * SwipeDismissBehavior.this.h;
            float width2 = view.getWidth() * SwipeDismissBehavior.this.i;
            float fAbs = Math.abs(i - this.a);
            if (fAbs <= width) {
                view.setAlpha(1.0f);
            } else if (fAbs >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.G(0.0f, 1.0f - SwipeDismissBehavior.J(width, width2, fAbs), 1.0f));
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
        @Override // com.daaw.C3487be1.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void l(android.view.View r3, float r4, float r5) {
            /*
                r2 = this;
                r5 = -1
                r2.b = r5
                int r5 = r3.getWidth()
                boolean r0 = r2.n(r3, r4)
                if (r0 == 0) goto L23
                r0 = 0
                int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r4 < 0) goto L1d
                int r4 = r3.getLeft()
                int r0 = r2.a
                if (r4 >= r0) goto L1b
                goto L1d
            L1b:
                int r0 = r0 + r5
                goto L21
            L1d:
                int r4 = r2.a
                int r0 = r4 - r5
            L21:
                r4 = 1
                goto L26
            L23:
                int r0 = r2.a
                r4 = 0
            L26:
                com.google.android.material.behavior.SwipeDismissBehavior r5 = com.google.android.material.behavior.SwipeDismissBehavior.this
                com.daaw.be1 r5 = r5.a
                int r1 = r3.getTop()
                boolean r5 = r5.O(r0, r1)
                if (r5 == 0) goto L3f
                com.google.android.material.behavior.SwipeDismissBehavior$c r5 = new com.google.android.material.behavior.SwipeDismissBehavior$c
                com.google.android.material.behavior.SwipeDismissBehavior r0 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r5.<init>(r3, r4)
                com.daaw.AbstractC2317Td1.h0(r3, r5)
                return
            L3f:
                if (r4 == 0) goto L46
                com.google.android.material.behavior.SwipeDismissBehavior r3 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r3.getClass()
            L46:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.l(android.view.View, float, float):void");
        }

        @Override // com.daaw.C3487be1.c
        public boolean m(View view, int i) {
            int i2 = this.b;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.F(view);
        }

        public final boolean n(View view, float f) {
            if (f == 0.0f) {
                return Math.abs(view.getLeft() - this.a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.g);
            }
            boolean z = AbstractC2317Td1.D(view) == 1;
            int i = SwipeDismissBehavior.this.f;
            if (i == 2) {
                return true;
            }
            if (i == 0) {
                return z ? f < 0.0f : f > 0.0f;
            }
            if (i == 1) {
                if (z) {
                    return f > 0.0f;
                }
                if (f < 0.0f) {
                    return true;
                }
            }
            return false;
        }
    }

    public class b implements InterfaceC4724g2 {
        public b() {
        }

        @Override // com.daaw.InterfaceC4724g2
        public boolean a(View view, InterfaceC4724g2.a aVar) {
            if (!SwipeDismissBehavior.this.F(view)) {
                return false;
            }
            boolean z = AbstractC2317Td1.D(view) == 1;
            int i = SwipeDismissBehavior.this.f;
            AbstractC2317Td1.Z(view, (!(i == 0 && z) && (i != 1 || z)) ? view.getWidth() : -view.getWidth());
            view.setAlpha(0.0f);
            SwipeDismissBehavior.this.getClass();
            return true;
        }
    }

    public class c implements Runnable {
        public final View B;
        public final boolean C;

        public c(View view, boolean z) {
            this.B = view;
            this.C = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3487be1 c3487be1 = SwipeDismissBehavior.this.a;
            if (c3487be1 != null && c3487be1.m(true)) {
                AbstractC2317Td1.h0(this.B, this);
            } else if (this.C) {
                SwipeDismissBehavior.this.getClass();
            }
        }
    }

    public static float G(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    public static int H(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    public static float J(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.a == null) {
            return false;
        }
        if (this.c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.a.F(motionEvent);
        return true;
    }

    public boolean F(View view) {
        return true;
    }

    public final void I(ViewGroup viewGroup) {
        if (this.a == null) {
            this.a = this.e ? C3487be1.n(viewGroup, this.d, this.j) : C3487be1.o(viewGroup, this.j);
        }
    }

    public void K(float f) {
        this.i = G(0.0f, f, 1.0f);
    }

    public void L(float f) {
        this.h = G(0.0f, f, 1.0f);
    }

    public void M(int i) {
        this.f = i;
    }

    public final void N(View view) {
        AbstractC2317Td1.j0(view, 1048576);
        if (F(view)) {
            AbstractC2317Td1.l0(view, Z1.a.y, null, new b());
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z = this.b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.z(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.b = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.b = false;
        }
        if (z) {
            I(coordinatorLayout);
            if (!this.c && this.a.P(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        boolean zL = super.l(coordinatorLayout, view, i);
        if (AbstractC2317Td1.B(view) == 0) {
            AbstractC2317Td1.z0(view, 1);
            N(view);
        }
        return zL;
    }
}
