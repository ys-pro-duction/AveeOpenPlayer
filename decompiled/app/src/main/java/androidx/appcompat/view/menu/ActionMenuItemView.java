package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionMenuView;
import com.daaw.AbstractC5060hE0;
import com.daaw.AbstractC6978o41;
import com.daaw.AbstractViewOnTouchListenerC7624qP;
import com.daaw.InterfaceC4269eS0;
import com.daaw.N9;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends N9 implements j.a, View.OnClickListener, ActionMenuView.a {
    public g I;
    public CharSequence J;
    public Drawable K;
    public e.b L;
    public AbstractViewOnTouchListenerC7624qP M;
    public b N;
    public boolean O;
    public boolean P;
    public int Q;
    public int R;
    public int S;

    public class a extends AbstractViewOnTouchListenerC7624qP {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // com.daaw.AbstractViewOnTouchListenerC7624qP
        public InterfaceC4269eS0 b() {
            b bVar = ActionMenuItemView.this.N;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        @Override // com.daaw.AbstractViewOnTouchListenerC7624qP
        public boolean c() {
            InterfaceC4269eS0 interfaceC4269eS0B;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            e.b bVar = actionMenuItemView.L;
            return bVar != null && bVar.a(actionMenuItemView.I) && (interfaceC4269eS0B = b()) != null && interfaceC4269eS0B.a();
        }
    }

    public static abstract class b {
        public abstract InterfaceC4269eS0 a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean a() {
        return s();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean b() {
        return s() && this.I.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.j.a
    public boolean d() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.j.a
    public void e(g gVar, int i) {
        this.I = gVar;
        setIcon(gVar.getIcon());
        setTitle(gVar.i(this));
        setId(gVar.getItemId());
        setVisibility(gVar.isVisible() ? 0 : 8);
        setEnabled(gVar.isEnabled());
        if (gVar.hasSubMenu() && this.M == null) {
            this.M = new a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.j.a
    public g getItemData() {
        return this.I;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        e.b bVar = this.L;
        if (bVar != null) {
            bVar.a(this.I);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.O = u();
        v();
    }

    @Override // com.daaw.N9, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        boolean zS = s();
        if (zS && (i3 = this.R) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, this.Q) : this.Q;
        if (mode != 1073741824 && this.Q > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (zS || this.K == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.K.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractViewOnTouchListenerC7624qP abstractViewOnTouchListenerC7624qP;
        if (this.I.hasSubMenu() && (abstractViewOnTouchListenerC7624qP = this.M) != null && abstractViewOnTouchListenerC7624qP.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public boolean s() {
        return !TextUtils.isEmpty(getText());
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.P != z) {
            this.P = z;
            g gVar = this.I;
            if (gVar != null) {
                gVar.c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.K = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.S;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        v();
    }

    public void setItemInvoker(e.b bVar) {
        this.L = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        this.R = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(b bVar) {
        this.N = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.J = charSequence;
        v();
    }

    public final boolean u() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i < 480) {
            return (i >= 640 && i2 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    public final void v() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.J);
        if (this.K != null && (!this.I.B() || (!this.O && !this.P))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.J : null);
        CharSequence contentDescription = this.I.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z3 ? null : this.I.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.I.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            AbstractC6978o41.a(this, z3 ? null : this.I.getTitle());
        } else {
            AbstractC6978o41.a(this, tooltipText);
        }
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.O = u();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC5060hE0.v, i, 0);
        this.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC5060hE0.w, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.S = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.R = -1;
        setSaveEnabled(false);
    }
}
