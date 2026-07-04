package com.daaw;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;

/* JADX INFO: renamed from: com.daaw.sZ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8222sZ0 {
    public float A;
    public float B;
    public int C;
    public int D;
    public int E;
    public int F;
    public StaticLayout G;
    public int H;
    public int I;
    public int J;
    public Rect K;
    public final RectF a = new RectF();
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final TextPaint h;
    public final Paint i;
    public CharSequence j;
    public Layout.Alignment k;
    public Bitmap l;
    public float m;
    public int n;
    public int o;
    public float p;
    public int q;
    public float r;
    public float s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    public C8222sZ0(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.g = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float fRound = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.b = fRound;
        this.c = fRound;
        this.d = fRound;
        this.e = fRound;
        TextPaint textPaint = new TextPaint();
        this.h = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.i = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
    }

    public static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence != charSequence2) {
            return charSequence != null && charSequence.equals(charSequence2);
        }
        return true;
    }

    public void b(C1631Mu c1631Mu, boolean z, boolean z2, C9672xj c9672xj, float f, float f2, Canvas canvas, int i, int i2, int i3, int i4) {
        int i5;
        boolean z3 = c1631Mu.D == null;
        if (!z3) {
            i5 = -16777216;
        } else if (TextUtils.isEmpty(c1631Mu.B)) {
            return;
        } else {
            i5 = (c1631Mu.L && z) ? c1631Mu.M : c9672xj.c;
        }
        if (a(this.j, c1631Mu.B) && AbstractC6280lb1.b(this.k, c1631Mu.C) && this.l == c1631Mu.D && this.m == c1631Mu.E && this.n == c1631Mu.F && AbstractC6280lb1.b(Integer.valueOf(this.o), Integer.valueOf(c1631Mu.G)) && this.p == c1631Mu.H && AbstractC6280lb1.b(Integer.valueOf(this.q), Integer.valueOf(c1631Mu.I)) && this.r == c1631Mu.J && this.s == c1631Mu.K && this.t == z && this.u == z2 && this.v == c9672xj.a && this.w == c9672xj.b && this.x == i5 && this.z == c9672xj.d && this.y == c9672xj.e && AbstractC6280lb1.b(this.h.getTypeface(), c9672xj.f) && this.A == f && this.B == f2 && this.C == i && this.D == i2 && this.E == i3 && this.F == i4) {
            d(canvas, z3);
            return;
        }
        this.j = c1631Mu.B;
        this.k = c1631Mu.C;
        this.l = c1631Mu.D;
        this.m = c1631Mu.E;
        this.n = c1631Mu.F;
        this.o = c1631Mu.G;
        this.p = c1631Mu.H;
        this.q = c1631Mu.I;
        this.r = c1631Mu.J;
        this.s = c1631Mu.K;
        this.t = z;
        this.u = z2;
        this.v = c9672xj.a;
        this.w = c9672xj.b;
        this.x = i5;
        this.z = c9672xj.d;
        this.y = c9672xj.e;
        this.h.setTypeface(c9672xj.f);
        this.A = f;
        this.B = f2;
        this.C = i;
        this.D = i2;
        this.E = i3;
        this.F = i4;
        if (z3) {
            g();
        } else {
            f();
        }
        d(canvas, z3);
    }

    public final void c(Canvas canvas) {
        canvas.drawBitmap(this.l, (Rect) null, this.K, (Paint) null);
    }

    public final void d(Canvas canvas, boolean z) {
        if (z) {
            e(canvas);
        } else {
            c(canvas);
        }
    }

    public final void e(Canvas canvas) {
        Canvas canvas2;
        StaticLayout staticLayout = this.G;
        if (staticLayout == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.H, this.I);
        if (Color.alpha(this.x) > 0) {
            this.i.setColor(this.x);
            canvas2 = canvas;
            canvas2.drawRect(-this.J, 0.0f, staticLayout.getWidth() + this.J, staticLayout.getHeight(), this.i);
        } else {
            canvas2 = canvas;
        }
        if (Color.alpha(this.w) > 0) {
            this.i.setColor(this.w);
            float lineTop = staticLayout.getLineTop(0);
            int lineCount = staticLayout.getLineCount();
            int i = 0;
            while (i < lineCount) {
                float lineLeft = staticLayout.getLineLeft(i);
                float lineRight = staticLayout.getLineRight(i);
                RectF rectF = this.a;
                int i2 = this.J;
                rectF.left = lineLeft - i2;
                rectF.right = i2 + lineRight;
                rectF.top = lineTop;
                rectF.bottom = staticLayout.getLineBottom(i);
                RectF rectF2 = this.a;
                float f = rectF2.bottom;
                if (lineRight - lineLeft > 0.0f) {
                    float f2 = this.b;
                    canvas2.drawRoundRect(rectF2, f2, f2, this.i);
                }
                i++;
                lineTop = f;
            }
        }
        int i3 = this.z;
        if (i3 == 1) {
            this.h.setStrokeJoin(Paint.Join.ROUND);
            this.h.setStrokeWidth(this.c);
            this.h.setColor(this.y);
            this.h.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout.draw(canvas2);
        } else if (i3 == 2) {
            TextPaint textPaint = this.h;
            float f3 = this.d;
            float f4 = this.e;
            textPaint.setShadowLayer(f3, f4, f4, this.y);
        } else if (i3 == 3 || i3 == 4) {
            boolean z = i3 == 3;
            int i4 = z ? -1 : this.y;
            int i5 = z ? this.y : -1;
            float f5 = this.d / 2.0f;
            this.h.setColor(this.v);
            this.h.setStyle(Paint.Style.FILL);
            float f6 = -f5;
            this.h.setShadowLayer(this.d, f6, f6, i4);
            staticLayout.draw(canvas2);
            this.h.setShadowLayer(this.d, f5, f5, i5);
        }
        this.h.setColor(this.v);
        this.h.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas2);
        this.h.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas2.restoreToCount(iSave);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            r7 = this;
            int r0 = r7.E
            int r1 = r7.C
            int r0 = r0 - r1
            int r2 = r7.F
            int r3 = r7.D
            int r2 = r2 - r3
            float r1 = (float) r1
            float r0 = (float) r0
            float r4 = r7.p
            float r4 = r4 * r0
            float r1 = r1 + r4
            float r3 = (float) r3
            float r2 = (float) r2
            float r4 = r7.m
            float r4 = r4 * r2
            float r3 = r3 + r4
            float r4 = r7.r
            float r0 = r0 * r4
            int r0 = java.lang.Math.round(r0)
            float r4 = r7.s
            r5 = 1
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 == 0) goto L2e
            float r2 = r2 * r4
            int r2 = java.lang.Math.round(r2)
            goto L44
        L2e:
            float r2 = (float) r0
            android.graphics.Bitmap r4 = r7.l
            int r4 = r4.getHeight()
            float r4 = (float) r4
            android.graphics.Bitmap r5 = r7.l
            int r5 = r5.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            float r2 = r2 * r4
            int r2 = java.lang.Math.round(r2)
        L44:
            int r4 = r7.o
            r5 = 1
            r6 = 2
            if (r4 != r6) goto L4d
            float r4 = (float) r0
        L4b:
            float r1 = r1 - r4
            goto L53
        L4d:
            if (r4 != r5) goto L53
            int r4 = r0 / 2
            float r4 = (float) r4
            goto L4b
        L53:
            int r1 = java.lang.Math.round(r1)
            int r4 = r7.q
            if (r4 != r6) goto L5e
            float r4 = (float) r2
        L5c:
            float r3 = r3 - r4
            goto L64
        L5e:
            if (r4 != r5) goto L64
            int r4 = r2 / 2
            float r4 = (float) r4
            goto L5c
        L64:
            int r3 = java.lang.Math.round(r3)
            android.graphics.Rect r4 = new android.graphics.Rect
            int r0 = r0 + r1
            int r2 = r2 + r3
            r4.<init>(r1, r3, r0, r2)
            r7.K = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C8222sZ0.f():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v4, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.CharSequence] */
    public final void g() {
        ?? spannableStringBuilder;
        int iMax;
        int iMin;
        int i;
        int iRound;
        int i2;
        int i3 = this.E - this.C;
        int i4 = this.F - this.D;
        this.h.setTextSize(this.A);
        int i5 = (int) ((this.A * 0.125f) + 0.5f);
        int i6 = i5 * 2;
        int i7 = i3 - i6;
        float f = this.r;
        if (f != Float.MIN_VALUE) {
            i7 = (int) (i7 * f);
        }
        int i8 = i7;
        if (i8 <= 0) {
            return;
        }
        if (this.u && this.t) {
            spannableStringBuilder = this.j;
        } else if (this.t) {
            spannableStringBuilder = new SpannableStringBuilder(this.j);
            int length = spannableStringBuilder.length();
            AbsoluteSizeSpan[] absoluteSizeSpanArr = (AbsoluteSizeSpan[]) spannableStringBuilder.getSpans(0, length, AbsoluteSizeSpan.class);
            RelativeSizeSpan[] relativeSizeSpanArr = (RelativeSizeSpan[]) spannableStringBuilder.getSpans(0, length, RelativeSizeSpan.class);
            for (AbsoluteSizeSpan absoluteSizeSpan : absoluteSizeSpanArr) {
                spannableStringBuilder.removeSpan(absoluteSizeSpan);
            }
            for (RelativeSizeSpan relativeSizeSpan : relativeSizeSpanArr) {
                spannableStringBuilder.removeSpan(relativeSizeSpan);
            }
        } else {
            spannableStringBuilder = this.j.toString();
        }
        ?? r9 = spannableStringBuilder;
        Layout.Alignment alignment = this.k;
        if (alignment == null) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        }
        Layout.Alignment alignment2 = alignment;
        StaticLayout staticLayout = new StaticLayout(r9, this.h, i8, alignment2, this.f, this.g, true);
        this.G = staticLayout;
        int height = staticLayout.getHeight();
        int lineCount = this.G.getLineCount();
        int iMax2 = 0;
        for (int i9 = 0; i9 < lineCount; i9++) {
            iMax2 = Math.max((int) Math.ceil(this.G.getLineWidth(i9)), iMax2);
        }
        if (this.r == Float.MIN_VALUE || iMax2 >= i8) {
            i8 = iMax2;
        }
        int i10 = i8 + i6;
        float f2 = this.p;
        if (f2 != Float.MIN_VALUE) {
            int iRound2 = Math.round(i3 * f2);
            int i11 = this.C;
            int i12 = iRound2 + i11;
            int i13 = this.q;
            if (i13 == 2) {
                i12 -= i10;
            } else if (i13 == 1) {
                i12 = ((i12 * 2) - i10) / 2;
            }
            iMax = Math.max(i12, i11);
            iMin = Math.min(i10 + iMax, this.E);
        } else {
            iMax = (i3 - i10) / 2;
            iMin = iMax + i10;
        }
        int i14 = iMin - iMax;
        if (i14 <= 0) {
            return;
        }
        float f3 = this.m;
        if (f3 != Float.MIN_VALUE) {
            if (this.n == 0) {
                iRound = Math.round(i4 * f3);
                i2 = this.D;
            } else {
                int lineBottom = this.G.getLineBottom(0) - this.G.getLineTop(0);
                float f4 = this.m;
                if (f4 >= 0.0f) {
                    iRound = Math.round(f4 * lineBottom);
                    i2 = this.D;
                } else {
                    iRound = Math.round((f4 + 1.0f) * lineBottom);
                    i2 = this.F;
                }
            }
            i = iRound + i2;
            int i15 = this.o;
            if (i15 == 2) {
                i -= height;
            } else if (i15 == 1) {
                i = ((i * 2) - height) / 2;
            }
            int i16 = i + height;
            int i17 = this.F;
            if (i16 > i17) {
                i = i17 - height;
            } else {
                int i18 = this.D;
                if (i < i18) {
                    i = i18;
                }
            }
        } else {
            i = (this.F - height) - ((int) (i4 * this.B));
        }
        this.G = new StaticLayout(r9, this.h, i14, alignment2, this.f, this.g, true);
        this.H = iMax;
        this.I = i;
        this.J = i5;
    }
}
