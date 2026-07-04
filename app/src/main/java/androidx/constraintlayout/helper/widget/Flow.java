package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.daaw.AbstractC6579mf1;
import com.daaw.AbstractC6858nf1;
import com.daaw.C5510ir;
import com.daaw.C6779nN;
import com.daaw.ZD0;

/* JADX INFO: loaded from: classes.dex */
public class Flow extends AbstractC6579mf1 {
    public C6779nN L;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.daaw.AbstractC6579mf1, androidx.constraintlayout.widget.b
    public void g(AttributeSet attributeSet) {
        super.g(attributeSet);
        this.L = new C6779nN();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, ZD0.a1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == ZD0.b1) {
                    this.L.S1(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == ZD0.c1) {
                    this.L.Y0(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == ZD0.m1) {
                    this.L.d1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == ZD0.n1) {
                    this.L.a1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == ZD0.d1) {
                    this.L.b1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == ZD0.e1) {
                    this.L.e1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == ZD0.f1) {
                    this.L.c1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == ZD0.g1) {
                    this.L.Z0(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == ZD0.L1) {
                    this.L.X1(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == ZD0.B1) {
                    this.L.M1(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == ZD0.K1) {
                    this.L.W1(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == ZD0.v1) {
                    this.L.G1(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == ZD0.D1) {
                    this.L.O1(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == ZD0.x1) {
                    this.L.I1(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == ZD0.F1) {
                    this.L.Q1(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == ZD0.z1) {
                    this.L.K1(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == ZD0.u1) {
                    this.L.F1(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == ZD0.C1) {
                    this.L.N1(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == ZD0.w1) {
                    this.L.H1(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == ZD0.E1) {
                    this.L.P1(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == ZD0.I1) {
                    this.L.U1(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == ZD0.y1) {
                    this.L.J1(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == ZD0.H1) {
                    this.L.T1(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == ZD0.A1) {
                    this.L.L1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == ZD0.J1) {
                    this.L.V1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == ZD0.G1) {
                    this.L.R1(typedArrayObtainStyledAttributes.getInt(index, -1));
                }
            }
        }
        this.E = this.L;
        m();
    }

    @Override // androidx.constraintlayout.widget.b
    public void h(C5510ir c5510ir, boolean z) {
        this.L.K0(z);
    }

    @Override // com.daaw.AbstractC6579mf1
    public void n(AbstractC6858nf1 abstractC6858nf1, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (abstractC6858nf1 == null) {
            setMeasuredDimension(0, 0);
        } else {
            abstractC6858nf1.S0(mode, size, mode2, size2);
            setMeasuredDimension(abstractC6858nf1.N0(), abstractC6858nf1.M0());
        }
    }

    @Override // androidx.constraintlayout.widget.b, android.view.View
    public void onMeasure(int i, int i2) {
        n(this.L, i, i2);
    }

    public void setFirstHorizontalBias(float f) {
        this.L.F1(f);
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.L.G1(i);
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.L.H1(f);
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.L.I1(i);
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.L.J1(i);
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.L.K1(f);
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.L.L1(i);
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.L.M1(i);
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.L.R1(i);
        requestLayout();
    }

    public void setOrientation(int i) {
        this.L.S1(i);
        requestLayout();
    }

    public void setPadding(int i) {
        this.L.Y0(i);
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.L.Z0(i);
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.L.b1(i);
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.L.c1(i);
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.L.e1(i);
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.L.T1(i);
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.L.U1(f);
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.L.V1(i);
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.L.W1(i);
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.L.X1(i);
        requestLayout();
    }
}
