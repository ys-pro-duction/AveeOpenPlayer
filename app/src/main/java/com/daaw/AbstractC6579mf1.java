package com.daaw;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: com.daaw.mf1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6579mf1 extends androidx.constraintlayout.widget.b {
    public boolean J;
    public boolean K;

    public AbstractC6579mf1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.b
    public void g(AttributeSet attributeSet) {
        super.g(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, ZD0.a1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == ZD0.h1) {
                    this.J = true;
                } else if (index == ZD0.o1) {
                    this.K = true;
                }
            }
        }
    }

    public abstract void n(AbstractC6858nf1 abstractC6858nf1, int i, int i2);

    @Override // androidx.constraintlayout.widget.b, android.view.View
    public void onAttachedToWindow() {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.J || this.K) && (parent = getParent()) != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i = 0; i < this.C; i++) {
                View viewH = constraintLayout.h(this.B[i]);
                if (viewH != null) {
                    if (this.J) {
                        viewH.setVisibility(visibility);
                    }
                    if (this.K && elevation > 0.0f) {
                        viewH.setTranslationZ(viewH.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        c();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        c();
    }
}
