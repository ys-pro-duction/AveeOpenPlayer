package com.daaw;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.daaw.AbstractC4541fO;
import java.util.ArrayList;
import java.util.List;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: com.daaw.eJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4232eJ extends C5554j1 {
    public static final Rect n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public static final AbstractC4541fO.a o = new a();
    public static final AbstractC4541fO.b p = new b();
    public final AccessibilityManager h;
    public final View i;
    public c j;
    public final Rect d = new Rect();
    public final Rect e = new Rect();
    public final Rect f = new Rect();
    public final int[] g = new int[2];
    public int k = Integer.MIN_VALUE;
    public int l = Integer.MIN_VALUE;
    public int m = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: com.daaw.eJ$a */
    public class a implements AbstractC4541fO.a {
        @Override // com.daaw.AbstractC4541fO.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Z1 z1, Rect rect) {
            z1.m(rect);
        }
    }

    /* JADX INFO: renamed from: com.daaw.eJ$b */
    public class b implements AbstractC4541fO.b {
        @Override // com.daaw.AbstractC4541fO.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Z1 a(C3724cV0 c3724cV0, int i) {
            return (Z1) c3724cV0.n(i);
        }

        @Override // com.daaw.AbstractC4541fO.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public int b(C3724cV0 c3724cV0) {
            return c3724cV0.m();
        }
    }

    /* JADX INFO: renamed from: com.daaw.eJ$c */
    public class c extends C4156e2 {
        public c() {
        }

        @Override // com.daaw.C4156e2
        public Z1 b(int i) {
            return Z1.c0(AbstractC4232eJ.this.H(i));
        }

        @Override // com.daaw.C4156e2
        public Z1 d(int i) {
            int i2 = i == 2 ? AbstractC4232eJ.this.k : AbstractC4232eJ.this.l;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i2);
        }

        @Override // com.daaw.C4156e2
        public boolean f(int i, int i2, Bundle bundle) {
            return AbstractC4232eJ.this.P(i, i2, bundle);
        }
    }

    public AbstractC4232eJ(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.i = view;
        this.h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (AbstractC2317Td1.B(view) == 0) {
            AbstractC2317Td1.z0(view, 1);
        }
    }

    public static Rect D(View view, int i, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i == 17) {
            rect.set(width, 0, width, height);
            return rect;
        }
        if (i == 33) {
            rect.set(0, height, width, height);
            return rect;
        }
        if (i == 66) {
            rect.set(-1, 0, -1, height);
            return rect;
        }
        if (i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        rect.set(0, -1, width, -1);
        return rect;
    }

    public static int F(int i) {
        if (i == 19) {
            return 33;
        }
        if (i != 21) {
            return i != 22 ? 130 : 66;
        }
        return 17;
    }

    private boolean S(int i) {
        int i2;
        if (!this.h.isEnabled() || !this.h.isTouchExplorationEnabled() || (i2 = this.k) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            n(i2);
        }
        this.k = i;
        this.i.invalidate();
        U(i, 32768);
        return true;
    }

    private void V(int i) {
        int i2 = this.m;
        if (i2 == i) {
            return;
        }
        this.m = i;
        U(i, 128);
        U(i2, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
    }

    private boolean n(int i) {
        if (this.k != i) {
            return false;
        }
        this.k = Integer.MIN_VALUE;
        this.i.invalidate();
        U(i, 65536);
        return true;
    }

    public final int A() {
        return this.l;
    }

    public abstract int B(float f, float f2);

    public abstract void C(List list);

    public final boolean E(Rect rect) {
        if (rect == null || rect.isEmpty() || this.i.getWindowVisibility() != 0) {
            return false;
        }
        Object parent = this.i.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        return parent != null;
    }

    public final boolean G(int i, Rect rect) {
        Z1 z1;
        C3724cV0 c3724cV0Y = y();
        int i2 = this.l;
        Z1 z12 = i2 == Integer.MIN_VALUE ? null : (Z1) c3724cV0Y.g(i2);
        if (i == 1 || i == 2) {
            z1 = (Z1) AbstractC4541fO.d(c3724cV0Y, p, o, z12, i, AbstractC2317Td1.D(this.i) == 1, false);
        } else {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i3 = this.l;
            if (i3 != Integer.MIN_VALUE) {
                z(i3, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                D(this.i, i, rect2);
            }
            z1 = (Z1) AbstractC4541fO.c(c3724cV0Y, p, o, z12, rect2, i);
        }
        return T(z1 != null ? c3724cV0Y.k(c3724cV0Y.j(z1)) : Integer.MIN_VALUE);
    }

    public Z1 H(int i) {
        return i == -1 ? u() : t(i);
    }

    public final void I(boolean z, int i, Rect rect) {
        int i2 = this.l;
        if (i2 != Integer.MIN_VALUE) {
            o(i2);
        }
        if (z) {
            G(i, rect);
        }
    }

    public abstract boolean J(int i, int i2, Bundle bundle);

    public abstract void M(Z1 z1);

    public abstract void N(int i, Z1 z1);

    public abstract void O(int i, boolean z);

    public boolean P(int i, int i2, Bundle bundle) {
        return i != -1 ? Q(i, i2, bundle) : R(i2, bundle);
    }

    public final boolean Q(int i, int i2, Bundle bundle) {
        return i2 != 1 ? i2 != 2 ? i2 != 64 ? i2 != 128 ? J(i, i2, bundle) : n(i) : S(i) : o(i) : T(i);
    }

    public final boolean R(int i, Bundle bundle) {
        return AbstractC2317Td1.e0(this.i, i, bundle);
    }

    public final boolean T(int i) {
        int i2;
        if ((!this.i.isFocused() && !this.i.requestFocus()) || (i2 = this.l) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            o(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.l = i;
        O(i, true);
        U(i, 8);
        return true;
    }

    public final boolean U(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.h.isEnabled() || (parent = this.i.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.i, q(i, i2));
    }

    @Override // com.daaw.C5554j1
    public C4156e2 b(View view) {
        if (this.j == null) {
            this.j = new c();
        }
        return this.j;
    }

    @Override // com.daaw.C5554j1
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        K(accessibilityEvent);
    }

    @Override // com.daaw.C5554j1
    public void g(View view, Z1 z1) {
        super.g(view, z1);
        M(z1);
    }

    public final boolean o(int i) {
        if (this.l != i) {
            return false;
        }
        this.l = Integer.MIN_VALUE;
        O(i, false);
        U(i, 8);
        return true;
    }

    public final boolean p() {
        int i = this.l;
        return i != Integer.MIN_VALUE && J(i, 16, null);
    }

    public final AccessibilityEvent q(int i, int i2) {
        return i != -1 ? r(i, i2) : s(i2);
    }

    public final AccessibilityEvent r(int i, int i2) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
        Z1 z1H = H(i);
        accessibilityEventObtain.getText().add(z1H.C());
        accessibilityEventObtain.setContentDescription(z1H.t());
        accessibilityEventObtain.setScrollable(z1H.V());
        accessibilityEventObtain.setPassword(z1H.U());
        accessibilityEventObtain.setEnabled(z1H.O());
        accessibilityEventObtain.setChecked(z1H.L());
        L(i, accessibilityEventObtain);
        if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEventObtain.setClassName(z1H.q());
        AbstractC4435f2.c(accessibilityEventObtain, this.i, i);
        accessibilityEventObtain.setPackageName(this.i.getContext().getPackageName());
        return accessibilityEventObtain;
    }

    public final AccessibilityEvent s(int i) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i);
        this.i.onInitializeAccessibilityEvent(accessibilityEventObtain);
        return accessibilityEventObtain;
    }

    public final Z1 t(int i) {
        Z1 z1A0 = Z1.a0();
        z1A0.u0(true);
        z1A0.w0(true);
        z1A0.n0("android.view.View");
        Rect rect = n;
        z1A0.j0(rect);
        z1A0.k0(rect);
        z1A0.H0(this.i);
        N(i, z1A0);
        if (z1A0.C() == null && z1A0.t() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        z1A0.m(this.e);
        if (this.e.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int iK = z1A0.k();
        if ((iK & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((iK & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        z1A0.F0(this.i.getContext().getPackageName());
        z1A0.R0(this.i, i);
        if (this.k == i) {
            z1A0.h0(true);
            z1A0.a(128);
        } else {
            z1A0.h0(false);
            z1A0.a(64);
        }
        boolean z = this.l == i;
        if (z) {
            z1A0.a(2);
        } else if (z1A0.P()) {
            z1A0.a(1);
        }
        z1A0.x0(z);
        this.i.getLocationOnScreen(this.g);
        z1A0.n(this.d);
        if (this.d.equals(rect)) {
            z1A0.m(this.d);
            if (z1A0.b != -1) {
                Z1 z1A02 = Z1.a0();
                for (int i2 = z1A0.b; i2 != -1; i2 = z1A02.b) {
                    z1A02.I0(this.i, -1);
                    z1A02.j0(n);
                    N(i2, z1A02);
                    z1A02.m(this.e);
                    Rect rect2 = this.d;
                    Rect rect3 = this.e;
                    rect2.offset(rect3.left, rect3.top);
                }
                z1A02.e0();
            }
            this.d.offset(this.g[0] - this.i.getScrollX(), this.g[1] - this.i.getScrollY());
        }
        if (this.i.getLocalVisibleRect(this.f)) {
            this.f.offset(this.g[0] - this.i.getScrollX(), this.g[1] - this.i.getScrollY());
            if (this.d.intersect(this.f)) {
                z1A0.k0(this.d);
                if (E(this.d)) {
                    z1A0.X0(true);
                }
            }
        }
        return z1A0;
    }

    public final Z1 u() {
        Z1 z1B0 = Z1.b0(this.i);
        AbstractC2317Td1.c0(this.i, z1B0);
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        if (z1B0.p() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            z1B0.d(this.i, ((Integer) arrayList.get(i)).intValue());
        }
        return z1B0;
    }

    public final boolean v(MotionEvent motionEvent) {
        if (this.h.isEnabled() && this.h.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action != 7 && action != 9) {
                if (action != 10 || this.m == Integer.MIN_VALUE) {
                    return false;
                }
                V(Integer.MIN_VALUE);
                return true;
            }
            int iB = B(motionEvent.getX(), motionEvent.getY());
            V(iB);
            if (iB != Integer.MIN_VALUE) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean w(android.view.KeyEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getAction()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L5d
            int r0 = r7.getKeyCode()
            r3 = 61
            r4 = 0
            if (r0 == r3) goto L46
            r3 = 66
            if (r0 == r3) goto L36
            switch(r0) {
                case 19: goto L19;
                case 20: goto L19;
                case 21: goto L19;
                case 22: goto L19;
                case 23: goto L36;
                default: goto L18;
            }
        L18:
            goto L5d
        L19:
            boolean r3 = r7.hasNoModifiers()
            if (r3 == 0) goto L5d
            int r0 = F(r0)
            int r7 = r7.getRepeatCount()
            int r7 = r7 + r2
            r3 = 0
        L29:
            if (r1 >= r7) goto L35
            boolean r5 = r6.G(r0, r4)
            if (r5 == 0) goto L35
            int r1 = r1 + 1
            r3 = 1
            goto L29
        L35:
            return r3
        L36:
            boolean r0 = r7.hasNoModifiers()
            if (r0 == 0) goto L5d
            int r7 = r7.getRepeatCount()
            if (r7 != 0) goto L5d
            r6.p()
            return r2
        L46:
            boolean r0 = r7.hasNoModifiers()
            if (r0 == 0) goto L52
            r7 = 2
            boolean r7 = r6.G(r7, r4)
            return r7
        L52:
            boolean r7 = r7.hasModifiers(r2)
            if (r7 == 0) goto L5d
            boolean r7 = r6.G(r2, r4)
            return r7
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC4232eJ.w(android.view.KeyEvent):boolean");
    }

    public final int x() {
        return this.k;
    }

    public final C3724cV0 y() {
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        C3724cV0 c3724cV0 = new C3724cV0();
        for (int i = 0; i < arrayList.size(); i++) {
            c3724cV0.l(((Integer) arrayList.get(i)).intValue(), t(((Integer) arrayList.get(i)).intValue()));
        }
        return c3724cV0;
    }

    public final void z(int i, Rect rect) {
        H(i).m(rect);
    }

    public void K(AccessibilityEvent accessibilityEvent) {
    }

    public void L(int i, AccessibilityEvent accessibilityEvent) {
    }
}
