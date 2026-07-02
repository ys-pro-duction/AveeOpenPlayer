package com.daaw;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.daaw.AbstractC8656u51;

/* JADX INFO: renamed from: com.daaw.Df1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0638Df1 extends AbstractC8656u51 {
    public static final String[] l0 = {"android:visibility:visibility", "android:visibility:parent"};
    public int k0 = 3;

    /* JADX INFO: renamed from: com.daaw.Df1$a */
    public class a extends AbstractC8942v51 {
        public final /* synthetic */ ViewGroup a;
        public final /* synthetic */ View b;
        public final /* synthetic */ View c;

        public a(ViewGroup viewGroup, View view, View view2) {
            this.a = viewGroup;
            this.b = view;
            this.c = view2;
        }

        @Override // com.daaw.AbstractC8656u51.f
        public void a(AbstractC8656u51 abstractC8656u51) {
            this.c.setTag(AbstractC4777gD0.a, null);
            AbstractC5169he1.a(this.a).d(this.b);
            abstractC8656u51.W(this);
        }

        @Override // com.daaw.AbstractC8942v51, com.daaw.AbstractC8656u51.f
        public void b(AbstractC8656u51 abstractC8656u51) {
            AbstractC5169he1.a(this.a).d(this.b);
        }

        @Override // com.daaw.AbstractC8942v51, com.daaw.AbstractC8656u51.f
        public void e(AbstractC8656u51 abstractC8656u51) {
            if (this.b.getParent() == null) {
                AbstractC5169he1.a(this.a).c(this.b);
            } else {
                AbstractC0638Df1.this.g();
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Df1$c */
    public static class c {
        public boolean a;
        public boolean b;
        public int c;
        public int d;
        public ViewGroup e;
        public ViewGroup f;
    }

    private void j0(B51 b51) {
        b51.a.put("android:visibility:visibility", Integer.valueOf(b51.b.getVisibility()));
        b51.a.put("android:visibility:parent", b51.b.getParent());
        int[] iArr = new int[2];
        b51.b.getLocationOnScreen(iArr);
        b51.a.put("android:visibility:screenLocation", iArr);
    }

    @Override // com.daaw.AbstractC8656u51
    public String[] G() {
        return l0;
    }

    @Override // com.daaw.AbstractC8656u51
    public boolean J(B51 b51, B51 b512) {
        if (b51 == null && b512 == null) {
            return false;
        }
        if (b51 != null && b512 != null && b512.a.containsKey("android:visibility:visibility") != b51.a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c cVarK0 = k0(b51, b512);
        return cVarK0.a && (cVarK0.c == 0 || cVarK0.d == 0);
    }

    @Override // com.daaw.AbstractC8656u51
    public void h(B51 b51) {
        j0(b51);
    }

    @Override // com.daaw.AbstractC8656u51
    public void k(B51 b51) {
        j0(b51);
    }

    public final c k0(B51 b51, B51 b512) {
        c cVar = new c();
        cVar.a = false;
        cVar.b = false;
        if (b51 == null || !b51.a.containsKey("android:visibility:visibility")) {
            cVar.c = -1;
            cVar.e = null;
        } else {
            cVar.c = ((Integer) b51.a.get("android:visibility:visibility")).intValue();
            cVar.e = (ViewGroup) b51.a.get("android:visibility:parent");
        }
        if (b512 == null || !b512.a.containsKey("android:visibility:visibility")) {
            cVar.d = -1;
            cVar.f = null;
        } else {
            cVar.d = ((Integer) b512.a.get("android:visibility:visibility")).intValue();
            cVar.f = (ViewGroup) b512.a.get("android:visibility:parent");
        }
        if (b51 != null && b512 != null) {
            int i = cVar.c;
            int i2 = cVar.d;
            if (i != i2 || cVar.e != cVar.f) {
                if (i != i2) {
                    if (i == 0) {
                        cVar.b = false;
                        cVar.a = true;
                        return cVar;
                    }
                    if (i2 == 0) {
                        cVar.b = true;
                        cVar.a = true;
                        return cVar;
                    }
                } else {
                    if (cVar.f == null) {
                        cVar.b = false;
                        cVar.a = true;
                        return cVar;
                    }
                    if (cVar.e == null) {
                        cVar.b = true;
                        cVar.a = true;
                        return cVar;
                    }
                }
            }
        } else {
            if (b51 == null && cVar.d == 0) {
                cVar.b = true;
                cVar.a = true;
                return cVar;
            }
            if (b512 == null && cVar.c == 0) {
                cVar.b = false;
                cVar.a = true;
            }
        }
        return cVar;
    }

    public abstract Animator l0(ViewGroup viewGroup, View view, B51 b51, B51 b512);

    public Animator m0(ViewGroup viewGroup, B51 b51, int i, B51 b512, int i2) {
        if ((this.k0 & 1) != 1 || b512 == null) {
            return null;
        }
        if (b51 == null) {
            View view = (View) b512.b.getParent();
            if (k0(v(view, false), H(view, false)).a) {
                return null;
            }
        }
        return l0(viewGroup, b512.b, b51, b512);
    }

    public abstract Animator n0(ViewGroup viewGroup, View view, B51 b51, B51 b512);

    @Override // com.daaw.AbstractC8656u51
    public Animator o(ViewGroup viewGroup, B51 b51, B51 b512) {
        c cVarK0 = k0(b51, b512);
        if (!cVarK0.a) {
            return null;
        }
        if (cVarK0.e == null && cVarK0.f == null) {
            return null;
        }
        return cVarK0.b ? m0(viewGroup, b51, cVarK0.c, b512, cVarK0.d) : o0(viewGroup, b51, cVarK0.c, b512, cVarK0.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0069 A[PHI: r2
  0x0069: PHI (r2v3 android.view.View) = 
  (r2v2 android.view.View)
  (r2v2 android.view.View)
  (r2v2 android.view.View)
  (r2v2 android.view.View)
  (r2v2 android.view.View)
  (r2v2 android.view.View)
  (r2v6 android.view.View)
 binds: [B:26:0x003e, B:31:0x004d, B:37:0x0076, B:39:0x0079, B:41:0x007f, B:43:0x0083, B:34:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.animation.Animator o0(android.view.ViewGroup r10, com.daaw.B51 r11, int r12, com.daaw.B51 r13, int r14) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC0638Df1.o0(android.view.ViewGroup, com.daaw.B51, int, com.daaw.B51, int):android.animation.Animator");
    }

    public void p0(int i) {
        if ((i & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.k0 = i;
    }

    /* JADX INFO: renamed from: com.daaw.Df1$b */
    public static class b extends AnimatorListenerAdapter implements AbstractC8656u51.f {
        public final View a;
        public final int b;
        public final ViewGroup c;
        public final boolean d;
        public boolean e;
        public boolean f = false;

        public b(View view, int i, boolean z) {
            this.a = view;
            this.b = i;
            this.c = (ViewGroup) view.getParent();
            this.d = z;
            g(true);
        }

        @Override // com.daaw.AbstractC8656u51.f
        public void a(AbstractC8656u51 abstractC8656u51) {
            f();
            abstractC8656u51.W(this);
        }

        @Override // com.daaw.AbstractC8656u51.f
        public void b(AbstractC8656u51 abstractC8656u51) {
            g(false);
        }

        @Override // com.daaw.AbstractC8656u51.f
        public void e(AbstractC8656u51 abstractC8656u51) {
            g(true);
        }

        public final void f() {
            if (!this.f) {
                AbstractC2841Ye1.h(this.a, this.b);
                ViewGroup viewGroup = this.c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            g(false);
        }

        public final void g(boolean z) {
            ViewGroup viewGroup;
            if (!this.d || this.e == z || (viewGroup = this.c) == null) {
                return;
            }
            this.e = z;
            AbstractC5169he1.c(viewGroup, z);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            if (this.f) {
                return;
            }
            AbstractC2841Ye1.h(this.a, this.b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (this.f) {
                return;
            }
            AbstractC2841Ye1.h(this.a, 0);
        }

        @Override // com.daaw.AbstractC8656u51.f
        public void c(AbstractC8656u51 abstractC8656u51) {
        }

        @Override // com.daaw.AbstractC8656u51.f
        public void d(AbstractC8656u51 abstractC8656u51) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }
}
