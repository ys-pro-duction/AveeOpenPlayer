package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.daaw.C5510ir;
import com.daaw.C5726je;
import com.daaw.ZD0;

/* JADX INFO: loaded from: classes.dex */
public class Barrier extends b {
    public int J;
    public int K;
    public C5726je L;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // androidx.constraintlayout.widget.b
    public void g(AttributeSet attributeSet) {
        super.g(attributeSet);
        this.L = new C5726je();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, ZD0.a1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == ZD0.q1) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == ZD0.p1) {
                    this.L.O0(typedArrayObtainStyledAttributes.getBoolean(index, true));
                } else if (index == ZD0.r1) {
                    this.L.Q0(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
        }
        this.E = this.L;
        m();
    }

    public int getMargin() {
        return this.L.M0();
    }

    public int getType() {
        return this.J;
    }

    @Override // androidx.constraintlayout.widget.b
    public void h(C5510ir c5510ir, boolean z) {
        o(c5510ir, this.J, z);
    }

    public boolean n() {
        return this.L.K0();
    }

    public final void o(C5510ir c5510ir, int i, boolean z) {
        this.K = i;
        if (z) {
            int i2 = this.J;
            if (i2 == 5) {
                this.K = 1;
            } else if (i2 == 6) {
                this.K = 0;
            }
        } else {
            int i3 = this.J;
            if (i3 == 5) {
                this.K = 0;
            } else if (i3 == 6) {
                this.K = 1;
            }
        }
        if (c5510ir instanceof C5726je) {
            ((C5726je) c5510ir).P0(this.K);
        }
    }

    public void setAllowsGoneWidget(boolean z) {
        this.L.O0(z);
    }

    public void setDpMargin(int i) {
        this.L.Q0((int) ((i * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i) {
        this.L.Q0(i);
    }

    public void setType(int i) {
        this.J = i;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
