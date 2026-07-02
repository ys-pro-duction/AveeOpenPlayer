package com.daaw;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import com.daaw.TD;

/* JADX INFO: renamed from: com.daaw.rW0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7931rW0 extends TD {
    public a N;
    public boolean O;

    /* JADX INFO: renamed from: com.daaw.rW0$a */
    public static class a extends TD.d {
        public int[][] J;

        public a(a aVar, AbstractC7931rW0 abstractC7931rW0, Resources resources) {
            super(aVar, abstractC7931rW0, resources);
            if (aVar != null) {
                this.J = aVar.J;
            } else {
                this.J = new int[f()][];
            }
        }

        public int A(int[] iArr) {
            int[][] iArr2 = this.J;
            int iH = h();
            for (int i = 0; i < iH; i++) {
                if (StateSet.stateSetMatches(iArr2[i], iArr)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // com.daaw.TD.d
        public void o(int i, int i2) {
            super.o(i, i2);
            int[][] iArr = new int[i2][];
            System.arraycopy(this.J, 0, iArr, 0, i);
            this.J = iArr;
        }

        @Override // com.daaw.TD.d
        public abstract void r();

        public int z(int[] iArr, Drawable drawable) {
            int iA = a(drawable);
            this.J[iA] = iArr;
            return iA;
        }
    }

    public AbstractC7931rW0(a aVar) {
        if (aVar != null) {
            h(aVar);
        }
    }

    @Override // com.daaw.TD, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // com.daaw.TD
    public void h(TD.d dVar) {
        super.h(dVar);
        if (dVar instanceof a) {
            this.N = (a) dVar;
        }
    }

    public int[] j(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i = 0;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i2);
            if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                int i3 = i + 1;
                if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i] = attributeNameResource;
                i = i3;
            }
        }
        return StateSet.trimStateSet(iArr, i);
    }

    @Override // com.daaw.TD, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.O && super.mutate() == this) {
            this.N.r();
            this.O = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public abstract boolean onStateChange(int[] iArr);
}
