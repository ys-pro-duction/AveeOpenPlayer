package com.google.android.material.carousel;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.AbstractC1380Kj;
import com.daaw.AbstractC9105vh0;
import com.daaw.InterfaceC1276Jj;
import com.daaw.YC0;
import com.google.android.material.carousel.a;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends AbstractC1380Kj {
    public static final int[] b = {1};
    public static final int[] c = {1, 0};
    public static final int[] d = {0};
    public final boolean a;

    public static final class a {
        public final int a;
        public float b;
        public final int c;
        public final int d;
        public float e;
        public float f;
        public final int g;
        public final float h;

        public a(int i, float f, float f2, float f3, int i2, float f4, int i3, float f5, int i4, float f6) {
            this.a = i;
            this.b = AbstractC9105vh0.a(f, f2, f3);
            this.c = i2;
            this.e = f4;
            this.d = i3;
            this.f = f5;
            this.g = i4;
            c(f6, f2, f3, f5);
            this.h = b(f5);
        }

        public final float a(float f, int i, float f2, int i2, int i3) {
            if (i <= 0) {
                f2 = 0.0f;
            }
            float f3 = i2 / 2.0f;
            return (f - ((i + f3) * f2)) / (i3 + f3);
        }

        public final float b(float f) {
            if (e()) {
                return Math.abs(f - this.f) * this.a;
            }
            return Float.MAX_VALUE;
        }

        public final void c(float f, float f2, float f3, float f4) {
            float fD = f - d();
            int i = this.c;
            if (i > 0 && fD > 0.0f) {
                float f5 = this.b;
                this.b = f5 + Math.min(fD / i, f3 - f5);
            } else if (i > 0 && fD < 0.0f) {
                float f6 = this.b;
                this.b = f6 + Math.max(fD / i, f2 - f6);
            }
            float fA = a(f, this.c, this.b, this.d, this.g);
            this.f = fA;
            float f7 = (this.b + fA) / 2.0f;
            this.e = f7;
            int i2 = this.d;
            if (i2 <= 0 || fA == f4) {
                return;
            }
            float f8 = (f4 - fA) * this.g;
            float fMin = Math.min(Math.abs(f8), f7 * 0.1f * i2);
            if (f8 > 0.0f) {
                this.e -= fMin / this.d;
                this.f += fMin / this.g;
            } else {
                this.e += fMin / this.d;
                this.f -= fMin / this.g;
            }
        }

        public final float d() {
            return (this.f * this.g) + (this.e * this.d) + (this.b * this.c);
        }

        public final boolean e() {
            int i = this.g;
            if (i <= 0 || this.c <= 0 || this.d <= 0) {
                return i <= 0 || this.c <= 0 || this.f > this.b;
            }
            float f = this.f;
            float f2 = this.e;
            return f > f2 && f2 > this.b;
        }

        public String toString() {
            return "Arrangement [priority=" + this.a + ", smallCount=" + this.c + ", smallSize=" + this.b + ", mediumCount=" + this.d + ", mediumSize=" + this.e + ", largeCount=" + this.g + ", largeSize=" + this.f + ", cost=" + this.h + "]";
        }
    }

    public c() {
        this(false);
    }

    public static a c(float f, float f2, float f3, float f4, int[] iArr, float f5, int[] iArr2, float f6, int[] iArr3) {
        a aVar = null;
        int i = 1;
        for (int i2 : iArr3) {
            int length = iArr2.length;
            int i3 = 0;
            while (i3 < length) {
                int i4 = iArr2[i3];
                int length2 = iArr.length;
                int i5 = 0;
                while (i5 < length2) {
                    int i6 = length;
                    int i7 = i3;
                    int i8 = i;
                    int i9 = length2;
                    int i10 = i5;
                    a aVar2 = new a(i8, f2, f3, f4, iArr[i5], f5, i4, f6, i2, f);
                    if (aVar == null || aVar2.h < aVar.h) {
                        if (aVar2.h == 0.0f) {
                            return aVar2;
                        }
                        aVar = aVar2;
                    }
                    int i11 = i8 + 1;
                    i5 = i10 + 1;
                    i3 = i7;
                    i = i11;
                    length = i6;
                    length2 = i9;
                }
                i3++;
                i = i;
                length = length;
            }
        }
        return aVar;
    }

    public static int g(int[] iArr) {
        int i = Integer.MIN_VALUE;
        for (int i2 : iArr) {
            if (i2 > i) {
                i = i2;
            }
        }
        return i;
    }

    @Override // com.daaw.AbstractC1380Kj
    public com.google.android.material.carousel.a b(InterfaceC1276Jj interfaceC1276Jj, View view) {
        float fA = interfaceC1276Jj.a();
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        float f = ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        float f2 = f(view.getContext()) + f;
        float fE = e(view.getContext()) + f;
        float measuredWidth = view.getMeasuredWidth();
        float fMin = Math.min(measuredWidth + f, fA);
        float fA2 = AbstractC9105vh0.a((measuredWidth / 3.0f) + f, f(view.getContext()) + f, e(view.getContext()) + f);
        float f3 = (fMin + fA2) / 2.0f;
        int[] iArr = b;
        int[] iArr2 = this.a ? d : c;
        int iMax = (int) Math.max(1.0d, Math.floor(((fA - (g(iArr2) * f3)) - (g(iArr) * fE)) / fMin));
        int iCeil = (int) Math.ceil(fA / fMin);
        int i = (iCeil - iMax) + 1;
        int[] iArr3 = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr3[i2] = iCeil - i2;
        }
        a aVarC = c(fA, fA2, f2, fE, iArr, f3, iArr2, fMin, iArr3);
        float fD = d(view.getContext()) + f;
        float f4 = fD / 2.0f;
        float f5 = 0.0f - f4;
        float f6 = (aVarC.f / 2.0f) + 0.0f;
        float fMax = Math.max(0, aVarC.g - 1);
        float f7 = aVarC.f;
        float f8 = f6 + (fMax * f7);
        float f9 = (f7 / 2.0f) + f8;
        int i3 = aVarC.d;
        if (i3 > 0) {
            f8 = (aVarC.e / 2.0f) + f9;
        }
        if (i3 > 0) {
            f9 = (aVarC.e / 2.0f) + f8;
        }
        float f10 = aVarC.c > 0 ? f9 + (aVarC.b / 2.0f) : f8;
        float fA3 = interfaceC1276Jj.a() + f4;
        float fA4 = AbstractC1380Kj.a(fD, aVarC.f, f);
        float fA5 = AbstractC1380Kj.a(aVarC.b, aVarC.f, f);
        float fA6 = AbstractC1380Kj.a(aVarC.e, aVarC.f, f);
        a.b bVarD = new a.b(aVarC.f).a(f5, fA4, fD).d(f6, 0.0f, aVarC.f, aVarC.g, true);
        if (aVarC.d > 0) {
            bVarD.a(f8, fA6, aVarC.e);
        }
        int i4 = aVarC.c;
        if (i4 > 0) {
            bVarD.c(f10, fA5, aVarC.b, i4);
        }
        bVarD.a(fA3, fA4, fD);
        return bVarD.e();
    }

    public final float d(Context context) {
        return context.getResources().getDimension(YC0.h);
    }

    public final float e(Context context) {
        return context.getResources().getDimension(YC0.i);
    }

    public final float f(Context context) {
        return context.getResources().getDimension(YC0.j);
    }

    public c(boolean z) {
        this.a = z;
    }
}
