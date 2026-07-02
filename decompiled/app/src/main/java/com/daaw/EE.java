package com.daaw;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.daaw.AbstractC8355t1;

/* JADX INFO: loaded from: classes3.dex */
public class EE extends IG {
    public static final boolean s = true;
    public final int e;
    public final int f;
    public final TimeInterpolator g;
    public AutoCompleteTextView h;
    public final View.OnClickListener i;
    public final View.OnFocusChangeListener j;
    public final AbstractC8355t1.a k;
    public boolean l;
    public boolean m;
    public boolean n;
    public long o;
    public AccessibilityManager p;
    public ValueAnimator q;
    public ValueAnimator r;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            EE.this.r();
            EE.this.r.start();
        }
    }

    public EE(com.google.android.material.textfield.a aVar) {
        super(aVar);
        this.i = new View.OnClickListener() { // from class: com.daaw.AE
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.B.J();
            }
        };
        this.j = new View.OnFocusChangeListener() { // from class: com.daaw.BE
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                EE.y(this.a, view, z);
            }
        };
        this.k = new AbstractC8355t1.a() { // from class: com.daaw.CE
            @Override // com.daaw.AbstractC8355t1.a
            public final void onTouchExplorationStateChanged(boolean z) {
                EE.w(this.a, z);
            }
        };
        this.o = Long.MAX_VALUE;
        this.f = AbstractC10241zl0.f(aVar.getContext(), JC0.z, 67);
        this.e = AbstractC10241zl0.f(aVar.getContext(), JC0.z, 50);
        this.g = AbstractC10241zl0.g(aVar.getContext(), JC0.D, AbstractC6991o7.a);
    }

    public static /* synthetic */ void A(EE ee) {
        ee.K();
        ee.H(false);
    }

    public static AutoCompleteTextView D(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    private void F() {
        this.r = E(this.f, 0.0f, 1.0f);
        ValueAnimator valueAnimatorE = E(this.e, 1.0f, 0.0f);
        this.q = valueAnimatorE;
        valueAnimatorE.addListener(new a());
    }

    public static /* synthetic */ void v(EE ee) {
        boolean zIsPopupShowing = ee.h.isPopupShowing();
        ee.H(zIsPopupShowing);
        ee.m = zIsPopupShowing;
    }

    public static /* synthetic */ void w(EE ee, boolean z) {
        AutoCompleteTextView autoCompleteTextView = ee.h;
        if (autoCompleteTextView == null || AbstractC7305pF.a(autoCompleteTextView)) {
            return;
        }
        AbstractC2317Td1.z0(ee.d, z ? 2 : 1);
    }

    public static /* synthetic */ void x(EE ee, ValueAnimator valueAnimator) {
        ee.getClass();
        ee.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static /* synthetic */ void y(EE ee, View view, boolean z) {
        ee.l = z;
        ee.r();
        if (z) {
            return;
        }
        ee.H(false);
        ee.m = false;
    }

    public static /* synthetic */ boolean z(EE ee, View view, MotionEvent motionEvent) {
        ee.getClass();
        if (motionEvent.getAction() == 1) {
            if (ee.G()) {
                ee.m = false;
            }
            ee.J();
            ee.K();
        }
        return false;
    }

    public final ValueAnimator E(int i, float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.g);
        valueAnimatorOfFloat.setDuration(i);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.daaw.xE
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                EE.x(this.a, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    public final boolean G() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.o;
        return jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300;
    }

    public final void H(boolean z) {
        if (this.n != z) {
            this.n = z;
            this.r.cancel();
            this.q.start();
        }
    }

    public final void I() {
        this.h.setOnTouchListener(new View.OnTouchListener() { // from class: com.daaw.yE
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return EE.z(this.B, view, motionEvent);
            }
        });
        if (s) {
            this.h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: com.daaw.zE
                @Override // android.widget.AutoCompleteTextView.OnDismissListener
                public final void onDismiss() {
                    EE.A(this.a);
                }
            });
        }
        this.h.setThreshold(0);
    }

    public final void J() {
        if (this.h == null) {
            return;
        }
        if (G()) {
            this.m = false;
        }
        if (this.m) {
            this.m = false;
            return;
        }
        if (s) {
            H(!this.n);
        } else {
            this.n = !this.n;
            r();
        }
        if (!this.n) {
            this.h.dismissDropDown();
        } else {
            this.h.requestFocus();
            this.h.showDropDown();
        }
    }

    public final void K() {
        this.m = true;
        this.o = System.currentTimeMillis();
    }

    @Override // com.daaw.IG
    public void a(Editable editable) {
        if (this.p.isTouchExplorationEnabled() && AbstractC7305pF.a(this.h) && !this.d.hasFocus()) {
            this.h.dismissDropDown();
        }
        this.h.post(new Runnable() { // from class: com.daaw.DE
            @Override // java.lang.Runnable
            public final void run() {
                EE.v(this.B);
            }
        });
    }

    @Override // com.daaw.IG
    public int c() {
        return ND0.g;
    }

    @Override // com.daaw.IG
    public int d() {
        return s ? AbstractC3931dD0.g : AbstractC3931dD0.h;
    }

    @Override // com.daaw.IG
    public View.OnFocusChangeListener e() {
        return this.j;
    }

    @Override // com.daaw.IG
    public View.OnClickListener f() {
        return this.i;
    }

    @Override // com.daaw.IG
    public AbstractC8355t1.a h() {
        return this.k;
    }

    @Override // com.daaw.IG
    public boolean i(int i) {
        return i != 0;
    }

    @Override // com.daaw.IG
    public boolean j() {
        return true;
    }

    @Override // com.daaw.IG
    public boolean k() {
        return this.l;
    }

    @Override // com.daaw.IG
    public boolean l() {
        return true;
    }

    @Override // com.daaw.IG
    public boolean m() {
        return this.n;
    }

    @Override // com.daaw.IG
    public void n(EditText editText) {
        this.h = D(editText);
        I();
        this.a.setErrorIconDrawable((Drawable) null);
        if (!AbstractC7305pF.a(editText) && this.p.isTouchExplorationEnabled()) {
            AbstractC2317Td1.z0(this.d, 2);
        }
        this.a.setEndIconVisible(true);
    }

    @Override // com.daaw.IG
    public void o(View view, Z1 z1) {
        if (!AbstractC7305pF.a(this.h)) {
            z1.n0(Spinner.class.getName());
        }
        if (z1.X()) {
            z1.z0(null);
        }
    }

    @Override // com.daaw.IG
    public void p(View view, AccessibilityEvent accessibilityEvent) {
        if (!this.p.isEnabled() || AbstractC7305pF.a(this.h)) {
            return;
        }
        boolean z = accessibilityEvent.getEventType() == 32768 && this.n && !this.h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z) {
            J();
            K();
        }
    }

    @Override // com.daaw.IG
    public void s() {
        F();
        this.p = (AccessibilityManager) this.c.getSystemService("accessibility");
    }

    @Override // com.daaw.IG
    public boolean t() {
        return true;
    }

    @Override // com.daaw.IG
    public void u() {
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            if (s) {
                this.h.setOnDismissListener(null);
            }
        }
    }
}
