package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.daaw.AbstractC5060hE0;
import com.daaw.AbstractC6461mD0;
import com.daaw.C6966o2;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {
    public boolean B;
    public View C;
    public View D;
    public View E;
    public Drawable F;
    public Drawable G;
    public Drawable H;
    public boolean I;
    public boolean J;
    public int K;

    public static class a {
        public static void a(ActionBarContainer actionBarContainer) {
            actionBarContainer.invalidateOutline();
        }
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C6966o2(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC5060hE0.a);
        this.F = typedArrayObtainStyledAttributes.getDrawable(AbstractC5060hE0.b);
        this.G = typedArrayObtainStyledAttributes.getDrawable(AbstractC5060hE0.d);
        this.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC5060hE0.j, -1);
        boolean z = true;
        if (getId() == AbstractC6461mD0.y) {
            this.I = true;
            this.H = typedArrayObtainStyledAttributes.getDrawable(AbstractC5060hE0.c);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.I ? this.F != null || this.G != null : this.H != null) {
            z = false;
        }
        setWillNotDraw(z);
    }

    public final int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public final boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.F;
        if (drawable != null && drawable.isStateful()) {
            this.F.setState(getDrawableState());
        }
        Drawable drawable2 = this.G;
        if (drawable2 != null && drawable2.isStateful()) {
            this.G.setState(getDrawableState());
        }
        Drawable drawable3 = this.H;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.H.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.C;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.F;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.G;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.H;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.D = findViewById(AbstractC6461mD0.a);
        this.E = findViewById(AbstractC6461mD0.f);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.B || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        View view = this.C;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = (view == null || view.getVisibility() == 8) ? false : true;
        if (view != null && view.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int measuredHeight2 = measuredHeight - view.getMeasuredHeight();
            int i5 = layoutParams.bottomMargin;
            view.layout(i, measuredHeight2 - i5, i3, measuredHeight - i5);
        }
        if (this.I) {
            Drawable drawable2 = this.H;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.F != null) {
                if (this.D.getVisibility() == 0) {
                    this.F.setBounds(this.D.getLeft(), this.D.getTop(), this.D.getRight(), this.D.getBottom());
                } else {
                    View view2 = this.E;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.F.setBounds(0, 0, 0, 0);
                    } else {
                        this.F.setBounds(this.E.getLeft(), this.E.getTop(), this.E.getRight(), this.E.getBottom());
                    }
                }
                z3 = true;
            }
            this.J = z4;
            if (!z4 || (drawable = this.G) == null) {
                z2 = z3;
            } else {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
        }
        if (z2) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        if (this.D == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.K) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.D == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        View view = this.C;
        if (view == null || view.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min((!b(this.D) ? a(this.D) : !b(this.E) ? a(this.E) : 0) + a(this.C), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i2) : Integer.MAX_VALUE));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.F;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.F);
        }
        this.F = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.D;
            if (view != null) {
                this.F.setBounds(view.getLeft(), this.D.getTop(), this.D.getRight(), this.D.getBottom());
            }
        }
        boolean z = false;
        if (!this.I ? !(this.F != null || this.G != null) : this.H == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        a.a(this);
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.H;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.H);
        }
        this.H = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.I && (drawable2 = this.H) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.I ? !(this.F != null || this.G != null) : this.H == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        a.a(this);
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.G;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.G);
        }
        this.G = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.J && (drawable2 = this.G) != null) {
                drawable2.setBounds(this.C.getLeft(), this.C.getTop(), this.C.getRight(), this.C.getBottom());
            }
        }
        boolean z = false;
        if (!this.I ? !(this.F != null || this.G != null) : this.H == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        a.a(this);
    }

    public void setTabContainer(b bVar) {
        View view = this.C;
        if (view != null) {
            removeView(view);
        }
        this.C = bVar;
    }

    public void setTransitioning(boolean z) {
        this.B = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.F;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.G;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.H;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        if (drawable == this.F && !this.I) {
            return true;
        }
        if (drawable == this.G && this.J) {
            return true;
        }
        return (drawable == this.H && this.I) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }
}
