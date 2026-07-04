package com.daaw;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.ActionMenuView;

/* JADX INFO: renamed from: com.daaw.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3867d extends ViewGroup {
    public final a B;
    public final Context C;
    public ActionMenuView D;
    public ActionMenuPresenter E;
    public int F;
    public C1154Ie1 G;
    public boolean H;
    public boolean I;

    /* JADX INFO: renamed from: com.daaw.d$a */
    public class a implements InterfaceC1362Ke1 {
        public boolean a = false;
        public int b;

        public a() {
        }

        @Override // com.daaw.InterfaceC1362Ke1
        public void a(View view) {
            this.a = true;
        }

        @Override // com.daaw.InterfaceC1362Ke1
        public void b(View view) {
            if (this.a) {
                return;
            }
            AbstractC3867d abstractC3867d = AbstractC3867d.this;
            abstractC3867d.G = null;
            AbstractC3867d.super.setVisibility(this.b);
        }

        @Override // com.daaw.InterfaceC1362Ke1
        public void c(View view) {
            AbstractC3867d.super.setVisibility(0);
            this.a = false;
        }

        public a d(C1154Ie1 c1154Ie1, int i) {
            AbstractC3867d.this.G = c1154Ie1;
            this.b = i;
            return this;
        }
    }

    public AbstractC3867d(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.B = new a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(KC0.a, typedValue, true) || typedValue.resourceId == 0) {
            this.C = context;
        } else {
            this.C = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    public static int d(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    public int c(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    public int e(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public C1154Ie1 f(int i, long j) {
        C1154Ie1 c1154Ie1 = this.G;
        if (c1154Ie1 != null) {
            c1154Ie1.c();
        }
        if (i != 0) {
            C1154Ie1 c1154Ie1B = AbstractC2317Td1.e(this).b(0.0f);
            c1154Ie1B.e(j);
            c1154Ie1B.g(this.B.d(c1154Ie1B, i));
            return c1154Ie1B;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        C1154Ie1 c1154Ie1B2 = AbstractC2317Td1.e(this).b(1.0f);
        c1154Ie1B2.e(j);
        c1154Ie1B2.g(this.B.d(c1154Ie1B2, i));
        return c1154Ie1B2;
    }

    public int getAnimatedVisibility() {
        return this.G != null ? this.B.b : getVisibility();
    }

    public int getContentHeight() {
        return this.F;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC5060hE0.a, KC0.c, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(AbstractC5060hE0.j, 0));
        typedArrayObtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.E;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.H(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.I = false;
        }
        if (!this.I) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.I = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.I = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.H = false;
        }
        if (!this.H) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.H = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.H = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i);

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            C1154Ie1 c1154Ie1 = this.G;
            if (c1154Ie1 != null) {
                c1154Ie1.c();
            }
            super.setVisibility(i);
        }
    }
}
