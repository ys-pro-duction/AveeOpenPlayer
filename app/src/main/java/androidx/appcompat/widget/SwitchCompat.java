package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.emoji2.text.c;
import com.daaw.AbstractC2317Td1;
import com.daaw.AbstractC2737Xe1;
import com.daaw.AbstractC4163e31;
import com.daaw.AbstractC5059hE;
import com.daaw.AbstractC5060hE0;
import com.daaw.C8674u9;
import com.daaw.G9;
import com.daaw.KC0;
import com.daaw.M3;
import com.daaw.M9;
import com.daaw.OD0;
import com.daaw.SD;
import com.daaw.X21;
import com.daaw.Z31;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {
    public static final Property w0 = new a(Float.class, "thumbPos");
    public static final int[] x0 = {R.attr.state_checked};
    public Drawable B;
    public ColorStateList C;
    public PorterDuff.Mode D;
    public boolean E;
    public boolean F;
    public Drawable G;
    public ColorStateList H;
    public PorterDuff.Mode I;
    public boolean J;
    public boolean K;
    public int L;
    public int M;
    public int N;
    public boolean O;
    public CharSequence P;
    public CharSequence Q;
    public CharSequence R;
    public CharSequence S;
    public boolean T;
    public int U;
    public int V;
    public float W;
    public float a0;
    public VelocityTracker b0;
    public int c0;
    public float d0;
    public int e0;
    public int f0;
    public int g0;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public boolean l0;
    public final TextPaint m0;
    public ColorStateList n0;
    public Layout o0;
    public Layout p0;
    public TransformationMethod q0;
    public ObjectAnimator r0;
    public final M9 s0;
    public C8674u9 t0;
    public b u0;
    public final Rect v0;

    public class a extends Property {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.d0);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(SwitchCompat switchCompat, Float f) {
            switchCompat.setThumbPosition(f.floatValue());
        }
    }

    public static class b extends c.f {
        public final Reference a;

        public b(SwitchCompat switchCompat) {
            this.a = new WeakReference(switchCompat);
        }

        @Override // androidx.emoji2.text.c.f
        public void a(Throwable th) {
            SwitchCompat switchCompat = (SwitchCompat) this.a.get();
            if (switchCompat != null) {
                switchCompat.j();
            }
        }

        @Override // androidx.emoji2.text.c.f
        public void b() {
            SwitchCompat switchCompat = (SwitchCompat) this.a.get();
            if (switchCompat != null) {
                switchCompat.j();
            }
        }
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, KC0.J);
    }

    public static float f(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    private C8674u9 getEmojiTextViewHelper() {
        if (this.t0 == null) {
            this.t0 = new C8674u9(this);
        }
        return this.t0;
    }

    private boolean getTargetCheckedState() {
        return this.d0 > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((AbstractC2737Xe1.b(this) ? 1.0f - this.d0 : this.d0) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.G;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.v0;
        drawable.getPadding(rect);
        Drawable drawable2 = this.B;
        Rect rectD = drawable2 != null ? AbstractC5059hE.d(drawable2) : AbstractC5059hE.c;
        return ((((this.e0 - this.g0) - rect.left) - rect.right) - rectD.left) - rectD.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.R = charSequence;
        this.S = g(charSequence);
        this.p0 = null;
        if (this.T) {
            p();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.P = charSequence;
        this.Q = g(charSequence);
        this.o0 = null;
        if (this.T) {
            p();
        }
    }

    public final void a(boolean z) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<SwitchCompat, Float>) w0, z ? 1.0f : 0.0f);
        this.r0 = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.r0.setAutoCancel(true);
        this.r0.start();
    }

    public final void b() {
        Drawable drawable = this.B;
        if (drawable != null) {
            if (this.E || this.F) {
                Drawable drawableMutate = SD.r(drawable).mutate();
                this.B = drawableMutate;
                if (this.E) {
                    SD.o(drawableMutate, this.C);
                }
                if (this.F) {
                    SD.p(this.B, this.D);
                }
                if (this.B.isStateful()) {
                    this.B.setState(getDrawableState());
                }
            }
        }
    }

    public final void c() {
        Drawable drawable = this.G;
        if (drawable != null) {
            if (this.J || this.K) {
                Drawable drawableMutate = SD.r(drawable).mutate();
                this.G = drawableMutate;
                if (this.J) {
                    SD.o(drawableMutate, this.H);
                }
                if (this.K) {
                    SD.p(this.G, this.I);
                }
                if (this.G.isStateful()) {
                    this.G.setState(getDrawableState());
                }
            }
        }
    }

    public final void d() {
        ObjectAnimator objectAnimator = this.r0;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i;
        int i2;
        Rect rect = this.v0;
        int i3 = this.h0;
        int i4 = this.i0;
        int i5 = this.j0;
        int i6 = this.k0;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.B;
        Rect rectD = drawable != null ? AbstractC5059hE.d(drawable) : AbstractC5059hE.c;
        Drawable drawable2 = this.G;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i7 = rect.left;
            thumbOffset += i7;
            if (rectD != null) {
                int i8 = rectD.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = rectD.top;
                int i10 = rect.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = rectD.right;
                int i12 = rect.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = rectD.bottom;
                int i14 = rect.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                }
                this.G.setBounds(i3, i, i5, i2);
            } else {
                i = i4;
            }
            i2 = i6;
            this.G.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.B;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i15 = thumbOffset - rect.left;
            int i16 = thumbOffset + this.g0 + rect.right;
            this.B.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                SD.l(background, i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.B;
        if (drawable != null) {
            SD.k(drawable, f, f2);
        }
        Drawable drawable2 = this.G;
        if (drawable2 != null) {
            SD.k(drawable2, f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.B;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.G;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    public final void e(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(3);
        super.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    public final CharSequence g(CharSequence charSequence) {
        TransformationMethod transformationMethodF = getEmojiTextViewHelper().f(this.q0);
        return transformationMethodF != null ? transformationMethodF.getTransformation(charSequence, this) : charSequence;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!AbstractC2737Xe1.b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.e0;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.N : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (AbstractC2737Xe1.b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.e0;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.N : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return X21.q(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.T;
    }

    public boolean getSplitTrack() {
        return this.O;
    }

    public int getSwitchMinWidth() {
        return this.M;
    }

    public int getSwitchPadding() {
        return this.N;
    }

    public CharSequence getTextOff() {
        return this.R;
    }

    public CharSequence getTextOn() {
        return this.P;
    }

    public Drawable getThumbDrawable() {
        return this.B;
    }

    public final float getThumbPosition() {
        return this.d0;
    }

    public int getThumbTextPadding() {
        return this.L;
    }

    public ColorStateList getThumbTintList() {
        return this.C;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.D;
    }

    public Drawable getTrackDrawable() {
        return this.G;
    }

    public ColorStateList getTrackTintList() {
        return this.H;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.I;
    }

    public final boolean h(float f, float f2) {
        if (this.B == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.B.getPadding(this.v0);
        int i = this.i0;
        int i2 = this.V;
        int i3 = i - i2;
        int i4 = (this.h0 + thumbOffset) - i2;
        int i5 = this.g0 + i4;
        Rect rect = this.v0;
        return f > ((float) i4) && f < ((float) (((i5 + rect.left) + rect.right) + i2)) && f2 > ((float) i3) && f2 < ((float) (this.k0 + i2));
    }

    public final Layout i(CharSequence charSequence) {
        return new StaticLayout(charSequence, this.m0, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, r2)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    public void j() {
        setTextOnInternal(this.P);
        setTextOffInternal(this.R);
        requestLayout();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.B;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.G;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.r0;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.r0.end();
        this.r0 = null;
    }

    public final void k() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string = this.R;
            if (string == null) {
                string = getResources().getString(OD0.b);
            }
            AbstractC2317Td1.H0(this, string);
        }
    }

    public final void l() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string = this.P;
            if (string == null) {
                string = getResources().getString(OD0.c);
            }
            AbstractC2317Td1.H0(this, string);
        }
    }

    public void m(Context context, int i) {
        Z31 z31T = Z31.t(context, i, AbstractC5060hE0.B2);
        ColorStateList colorStateListC = z31T.c(AbstractC5060hE0.F2);
        if (colorStateListC != null) {
            this.n0 = colorStateListC;
        } else {
            this.n0 = getTextColors();
        }
        int iF = z31T.f(AbstractC5060hE0.C2, 0);
        if (iF != 0) {
            float f = iF;
            if (f != this.m0.getTextSize()) {
                this.m0.setTextSize(f);
                requestLayout();
            }
        }
        o(z31T.k(AbstractC5060hE0.D2, -1), z31T.k(AbstractC5060hE0.E2, -1));
        if (z31T.a(AbstractC5060hE0.M2, false)) {
            this.q0 = new M3(getContext());
        } else {
            this.q0 = null;
        }
        setTextOnInternal(this.P);
        setTextOffInternal(this.R);
        z31T.x();
    }

    public void n(Typeface typeface, int i) {
        if (i <= 0) {
            this.m0.setFakeBoldText(false);
            this.m0.setTextSkewX(0.0f);
            setSwitchTypeface(typeface);
        } else {
            Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i) : Typeface.create(typeface, i);
            setSwitchTypeface(typefaceDefaultFromStyle);
            int i2 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i;
            this.m0.setFakeBoldText((i2 & 1) != 0);
            this.m0.setTextSkewX((i2 & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    public final void o(int i, int i2) {
        n(i != 1 ? i != 2 ? i != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF, i2);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, x0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.v0;
        Drawable drawable = this.G;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.i0;
        int i2 = this.k0;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.B;
        if (drawable != null) {
            if (!this.O || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectD = AbstractC5059hE.d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectD.left;
                rect.right -= rectD.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.o0 : this.p0;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.n0;
            if (colorStateList != null) {
                this.m0.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.m0.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i3 + i4) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.P : this.R;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iMax;
        int width;
        int paddingLeft;
        int i5;
        int paddingTop;
        int height;
        super.onLayout(z, i, i2, i3, i4);
        int iMax2 = 0;
        if (this.B != null) {
            Rect rect = this.v0;
            Drawable drawable = this.G;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectD = AbstractC5059hE.d(this.B);
            iMax = Math.max(0, rectD.left - rect.left);
            iMax2 = Math.max(0, rectD.right - rect.right);
        } else {
            iMax = 0;
        }
        if (AbstractC2737Xe1.b(this)) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.e0 + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.e0) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int paddingTop2 = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2;
            i5 = this.f0;
            paddingTop = paddingTop2 - (i5 / 2);
        } else {
            if (gravity == 80) {
                height = getHeight() - getPaddingBottom();
                paddingTop = height - this.f0;
                this.h0 = paddingLeft;
                this.i0 = paddingTop;
                this.k0 = height;
                this.j0 = width;
            }
            paddingTop = getPaddingTop();
            i5 = this.f0;
        }
        height = i5 + paddingTop;
        this.h0 = paddingLeft;
        this.i0 = paddingTop;
        this.k0 = height;
        this.j0 = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int intrinsicWidth;
        int intrinsicHeight;
        if (this.T) {
            if (this.o0 == null) {
                this.o0 = i(this.Q);
            }
            if (this.p0 == null) {
                this.p0 = i(this.S);
            }
        }
        Rect rect = this.v0;
        Drawable drawable = this.B;
        int intrinsicHeight2 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.B.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.B.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        this.g0 = Math.max(this.T ? Math.max(this.o0.getWidth(), this.p0.getWidth()) + (this.L * 2) : 0, intrinsicWidth);
        Drawable drawable2 = this.G;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.G.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax = rect.left;
        int iMax2 = rect.right;
        Drawable drawable3 = this.B;
        if (drawable3 != null) {
            Rect rectD = AbstractC5059hE.d(drawable3);
            iMax = Math.max(iMax, rectD.left);
            iMax2 = Math.max(iMax2, rectD.right);
        }
        int iMax3 = this.l0 ? Math.max(this.M, (this.g0 * 2) + iMax + iMax2) : this.M;
        int iMax4 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.e0 = iMax3;
        this.f0 = iMax4;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < iMax4) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax4);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.P : this.R;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.VelocityTracker r0 = r6.b0
            r0.addMovement(r7)
            int r0 = r7.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L9f
            r2 = 2
            if (r0 == r1) goto L8b
            if (r0 == r2) goto L16
            r3 = 3
            if (r0 == r3) goto L8b
            goto Lb9
        L16:
            int r0 = r6.U
            if (r0 == r1) goto L57
            if (r0 == r2) goto L1e
            goto Lb9
        L1e:
            float r7 = r7.getX()
            int r0 = r6.getThumbScrollRange()
            float r2 = r6.W
            float r2 = r7 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 == 0) goto L32
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L3d
        L32:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L39
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L3d
        L39:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
        L3d:
            boolean r0 = com.daaw.AbstractC2737Xe1.b(r6)
            if (r0 == 0) goto L44
            float r2 = -r2
        L44:
            float r0 = r6.d0
            float r0 = r0 + r2
            float r0 = f(r0, r4, r3)
            float r2 = r6.d0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L56
            r6.W = r7
            r6.setThumbPosition(r0)
        L56:
            return r1
        L57:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.W
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.V
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L7d
            float r4 = r6.a0
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.V
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto Lb9
        L7d:
            r6.U = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.W = r0
            r6.a0 = r3
            return r1
        L8b:
            int r0 = r6.U
            if (r0 != r2) goto L96
            r6.q(r7)
            super.onTouchEvent(r7)
            return r1
        L96:
            r0 = 0
            r6.U = r0
            android.view.VelocityTracker r0 = r6.b0
            r0.clear()
            goto Lb9
        L9f:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto Lb9
            boolean r3 = r6.h(r0, r2)
            if (r3 == 0) goto Lb9
            r6.U = r1
            r6.W = r0
            r6.a0 = r2
        Lb9:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        if (this.u0 == null && this.t0.b() && androidx.emoji2.text.c.i()) {
            androidx.emoji2.text.c cVarC = androidx.emoji2.text.c.c();
            int iE = cVarC.e();
            if (iE == 3 || iE == 0) {
                b bVar = new b(this);
                this.u0 = bVar;
                cVarC.t(bVar);
            }
        }
    }

    public final void q(MotionEvent motionEvent) {
        this.U = 0;
        boolean targetCheckedState = true;
        boolean z = motionEvent.getAction() == 1 && isEnabled();
        boolean zIsChecked = isChecked();
        if (z) {
            this.b0.computeCurrentVelocity(1000);
            float xVelocity = this.b0.getXVelocity();
            if (Math.abs(xVelocity) <= this.c0) {
                targetCheckedState = getTargetCheckedState();
            } else if (!AbstractC2737Xe1.b(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                targetCheckedState = false;
            }
        } else {
            targetCheckedState = zIsChecked;
        }
        if (targetCheckedState != zIsChecked) {
            playSoundEffect(0);
        }
        setChecked(targetCheckedState);
        e(motionEvent);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            l();
        } else {
            k();
        }
        if (getWindowToken() != null && isLaidOut()) {
            a(zIsChecked);
        } else {
            d();
            setThumbPosition(zIsChecked ? 1.0f : 0.0f);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(X21.r(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().e(z);
        setTextOnInternal(this.P);
        setTextOffInternal(this.R);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z) {
        this.l0 = z;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z) {
        if (this.T != z) {
            this.T = z;
            requestLayout();
            if (z) {
                p();
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.O = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.M = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.N = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.m0.getTypeface() == null || this.m0.getTypeface().equals(typeface)) && (this.m0.getTypeface() != null || typeface == null)) {
            return;
        }
        this.m0.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            return;
        }
        k();
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            l();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.B;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.B = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.d0 = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(G9.b(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.L = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.C = colorStateList;
        this.E = true;
        b();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.D = mode;
        this.F = true;
        b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.G;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.G = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(G9.b(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.H = colorStateList;
        this.J = true;
        c();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.I = mode;
        this.K = true;
        c();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.B || drawable == this.G;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.C = null;
        this.D = null;
        this.E = false;
        this.F = false;
        this.H = null;
        this.I = null;
        this.J = false;
        this.K = false;
        this.b0 = VelocityTracker.obtain();
        this.l0 = true;
        this.v0 = new Rect();
        AbstractC4163e31.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.m0 = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        Z31 z31V = Z31.v(context, attributeSet, AbstractC5060hE0.m2, i, 0);
        AbstractC2317Td1.n0(this, context, AbstractC5060hE0.m2, attributeSet, z31V.r(), i, 0);
        Drawable drawableG = z31V.g(AbstractC5060hE0.p2);
        this.B = drawableG;
        if (drawableG != null) {
            drawableG.setCallback(this);
        }
        Drawable drawableG2 = z31V.g(AbstractC5060hE0.y2);
        this.G = drawableG2;
        if (drawableG2 != null) {
            drawableG2.setCallback(this);
        }
        setTextOnInternal(z31V.p(AbstractC5060hE0.n2));
        setTextOffInternal(z31V.p(AbstractC5060hE0.o2));
        this.T = z31V.a(AbstractC5060hE0.q2, true);
        this.L = z31V.f(AbstractC5060hE0.v2, 0);
        this.M = z31V.f(AbstractC5060hE0.s2, 0);
        this.N = z31V.f(AbstractC5060hE0.t2, 0);
        this.O = z31V.a(AbstractC5060hE0.r2, false);
        ColorStateList colorStateListC = z31V.c(AbstractC5060hE0.w2);
        if (colorStateListC != null) {
            this.C = colorStateListC;
            this.E = true;
        }
        PorterDuff.Mode modeE = AbstractC5059hE.e(z31V.k(AbstractC5060hE0.x2, -1), null);
        if (this.D != modeE) {
            this.D = modeE;
            this.F = true;
        }
        if (this.E || this.F) {
            b();
        }
        ColorStateList colorStateListC2 = z31V.c(AbstractC5060hE0.z2);
        if (colorStateListC2 != null) {
            this.H = colorStateListC2;
            this.J = true;
        }
        PorterDuff.Mode modeE2 = AbstractC5059hE.e(z31V.k(AbstractC5060hE0.A2, -1), null);
        if (this.I != modeE2) {
            this.I = modeE2;
            this.K = true;
        }
        if (this.J || this.K) {
            c();
        }
        int iN = z31V.n(AbstractC5060hE0.u2, 0);
        if (iN != 0) {
            m(context, iN);
        }
        M9 m9 = new M9(this);
        this.s0 = m9;
        m9.m(attributeSet, i);
        z31V.x();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.V = viewConfiguration.getScaledTouchSlop();
        this.c0 = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().c(attributeSet, i);
        refreshDrawableState();
        setChecked(isChecked());
    }
}
