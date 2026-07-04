package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import com.daaw.AbstractC5060hE0;
import com.daaw.AbstractC6461mD0;
import com.daaw.DD0;
import com.daaw.KC0;
import com.daaw.Z31;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements j.a, AbsListView.SelectionBoundsAdjuster {
    public g B;
    public ImageView C;
    public RadioButton D;
    public TextView E;
    public CheckBox F;
    public TextView G;
    public ImageView H;
    public ImageView I;
    public LinearLayout J;
    public Drawable K;
    public int L;
    public Context M;
    public boolean N;
    public Drawable O;
    public boolean P;
    public LayoutInflater Q;
    public boolean R;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, KC0.B);
    }

    private LayoutInflater getInflater() {
        if (this.Q == null) {
            this.Q = LayoutInflater.from(getContext());
        }
        return this.Q;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.H;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    public final void a(View view) {
        b(view, -1);
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.I;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.I.getLayoutParams();
        rect.top += this.I.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public final void b(View view, int i) {
        LinearLayout linearLayout = this.J;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    public final void c() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(DD0.h, (ViewGroup) this, false);
        this.F = checkBox;
        a(checkBox);
    }

    @Override // androidx.appcompat.view.menu.j.a
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j.a
    public void e(g gVar, int i) {
        this.B = gVar;
        setVisibility(gVar.isVisible() ? 0 : 8);
        setTitle(gVar.i(this));
        setCheckable(gVar.isCheckable());
        h(gVar.A(), gVar.g());
        setIcon(gVar.getIcon());
        setEnabled(gVar.isEnabled());
        setSubMenuArrowVisible(gVar.hasSubMenu());
        setContentDescription(gVar.getContentDescription());
    }

    public final void f() {
        ImageView imageView = (ImageView) getInflater().inflate(DD0.i, (ViewGroup) this, false);
        this.C = imageView;
        b(imageView, 0);
    }

    public final void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(DD0.k, (ViewGroup) this, false);
        this.D = radioButton;
        a(radioButton);
    }

    @Override // androidx.appcompat.view.menu.j.a
    public g getItemData() {
        return this.B;
    }

    public void h(boolean z, char c) {
        int i = (z && this.B.A()) ? 0 : 8;
        if (i == 0) {
            this.G.setText(this.B.h());
        }
        if (this.G.getVisibility() != i) {
            this.G.setVisibility(i);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.K);
        TextView textView = (TextView) findViewById(AbstractC6461mD0.C);
        this.E = textView;
        int i = this.L;
        if (i != -1) {
            textView.setTextAppearance(this.M, i);
        }
        this.G = (TextView) findViewById(AbstractC6461mD0.w);
        ImageView imageView = (ImageView) findViewById(AbstractC6461mD0.z);
        this.H = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.O);
        }
        this.I = (ImageView) findViewById(AbstractC6461mD0.q);
        this.J = (LinearLayout) findViewById(AbstractC6461mD0.l);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.C != null && this.N) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.C.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        View view;
        if (!z && this.D == null && this.F == null) {
            return;
        }
        if (this.B.m()) {
            if (this.D == null) {
                g();
            }
            compoundButton = this.D;
            view = this.F;
        } else {
            if (this.F == null) {
                c();
            }
            compoundButton = this.F;
            view = this.D;
        }
        if (z) {
            compoundButton.setChecked(this.B.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.F;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.D;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.B.m()) {
            if (this.D == null) {
                g();
            }
            compoundButton = this.D;
        } else {
            if (this.F == null) {
                c();
            }
            compoundButton = this.F;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.R = z;
        this.N = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.I;
        if (imageView != null) {
            imageView.setVisibility((this.P || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.B.z() || this.R;
        if (z || this.N) {
            ImageView imageView = this.C;
            if (imageView == null && drawable == null && !this.N) {
                return;
            }
            if (imageView == null) {
                f();
            }
            if (drawable == null && !this.N) {
                this.C.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.C;
            if (!z) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.C.getVisibility() != 0) {
                this.C.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.E.getVisibility() != 8) {
                this.E.setVisibility(8);
            }
        } else {
            this.E.setText(charSequence);
            if (this.E.getVisibility() != 0) {
                this.E.setVisibility(0);
            }
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        Z31 z31V = Z31.v(getContext(), attributeSet, AbstractC5060hE0.T1, i, 0);
        this.K = z31V.g(AbstractC5060hE0.V1);
        this.L = z31V.n(AbstractC5060hE0.U1, -1);
        this.N = z31V.a(AbstractC5060hE0.W1, false);
        this.M = context;
        this.O = z31V.g(AbstractC5060hE0.X1);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, KC0.y, 0);
        this.P = typedArrayObtainStyledAttributes.hasValue(0);
        z31V.x();
        typedArrayObtainStyledAttributes.recycle();
    }
}
