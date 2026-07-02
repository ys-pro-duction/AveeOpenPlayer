package com.daaw;

import android.graphics.Canvas;
import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.gms.ads.AdRequest;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: com.daaw.w21, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C9206w21 {
    public final boolean a;
    public final boolean b;
    public final C9798y90 c;
    public final boolean d;
    public final Layout e;
    public final int f;
    public final int g;
    public final int h;
    public final boolean i;
    public final O90 j;

    /* JADX INFO: renamed from: com.daaw.w21$a */
    public static final class a extends AbstractC4192e90 implements LQ {
        public a() {
            super(0);
        }

        @Override // com.daaw.LQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C7838r90 invoke() {
            return new C7838r90(C9206w21.this.d());
        }
    }

    public C9206w21(CharSequence charSequence, float f, TextPaint textPaint, int i, TextUtils.TruncateAt truncateAt, int i2, float f2, float f3, boolean z, boolean z2, int i3, int i4, int i5, int i6, int[] iArr, int[] iArr2, C9798y90 c9798y90) {
        int i7;
        Layout layoutA;
        G10.g(charSequence, "charSequence");
        G10.g(textPaint, "textPaint");
        G10.g(c9798y90, "layoutIntrinsics");
        this.a = z;
        this.b = z2;
        this.c = c9798y90;
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristicE = AbstractC10043z21.e(i2);
        Layout.Alignment alignmentA = K11.a.a(i);
        boolean z3 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, C1775Oe.class) < length;
        BoringLayout.Metrics metricsA = c9798y90.a();
        double d = f;
        int iCeil = (int) Math.ceil(d);
        if (metricsA == null || c9798y90.b() > f || z3) {
            this.i = false;
            i7 = i3;
            layoutA = TW0.a.a(charSequence, 0, charSequence.length(), textPaint, iCeil, textDirectionHeuristicE, alignmentA, i7, truncateAt, (int) Math.ceil(d), f2, f3, i6, z, z2, i4, i5, iArr, iArr2);
        } else {
            this.i = true;
            layoutA = C7698qg.a.a(charSequence, textPaint, iCeil, metricsA, alignmentA, z, truncateAt, iCeil);
            i7 = i3;
        }
        this.e = layoutA;
        int iMin = Math.min(layoutA.getLineCount(), i7);
        this.f = iMin;
        this.d = iMin >= i7 && (layoutA.getEllipsisCount(iMin + (-1)) > 0 || layoutA.getLineEnd(iMin + (-1)) != charSequence.length());
        C0576Cs0 c0576Cs0F = AbstractC10043z21.f(this);
        C0576Cs0 c0576Cs0C = AbstractC10043z21.c(this);
        this.g = Math.max(((Number) c0576Cs0F.c()).intValue(), ((Number) c0576Cs0C.c()).intValue());
        this.h = Math.max(((Number) c0576Cs0F.d()).intValue(), ((Number) c0576Cs0C.d()).intValue());
        this.j = AbstractC3192ab0.b(EnumC7395pb0.D, new a());
    }

    public static /* synthetic */ float t(C9206w21 c9206w21, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return c9206w21.s(i, z);
    }

    public static /* synthetic */ float v(C9206w21 c9206w21, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return c9206w21.u(i, z);
    }

    public final boolean a() {
        return this.d;
    }

    public final int b() {
        return (this.d ? this.e.getLineBottom(this.f - 1) : this.e.getHeight()) + this.g + this.h;
    }

    public final boolean c() {
        return this.a;
    }

    public final Layout d() {
        return this.e;
    }

    public final C7838r90 e() {
        return (C7838r90) this.j.getValue();
    }

    public final float f(int i) {
        return this.g + this.e.getLineBaseline(i);
    }

    public final float g(int i) {
        return this.g + this.e.getLineBottom(i) + (i == this.f + (-1) ? this.h : 0);
    }

    public final int h() {
        return this.f;
    }

    public final int i(int i) {
        return this.e.getEllipsisCount(i);
    }

    public final int j(int i) {
        return this.e.getEllipsisStart(i);
    }

    public final int k(int i) {
        return this.e.getEllipsisStart(i) == 0 ? this.e.getLineEnd(i) : this.e.getText().length();
    }

    public final int l(int i) {
        return this.e.getLineForOffset(i);
    }

    public final int m(int i) {
        return this.e.getLineForVertical(this.g + i);
    }

    public final int n(int i) {
        return this.e.getLineStart(i);
    }

    public final float o(int i) {
        return this.e.getLineTop(i) + (i == 0 ? 0 : this.g);
    }

    public final int p(int i) {
        return this.e.getEllipsisStart(i) == 0 ? this.e.getLineVisibleEnd(i) : this.e.getLineStart(i) + this.e.getEllipsisStart(i);
    }

    public final int q(int i, float f) {
        return this.e.getOffsetForHorizontal(i, f);
    }

    public final int r(int i) {
        return this.e.getParagraphDirection(i);
    }

    public final float s(int i, boolean z) {
        return e().c(i, true, z);
    }

    public final float u(int i, boolean z) {
        return e().c(i, false, z);
    }

    public final CharSequence w() {
        CharSequence text = this.e.getText();
        G10.f(text, "layout.text");
        return text;
    }

    public final boolean x() {
        return this.b && !this.i && Build.VERSION.SDK_INT >= 28;
    }

    public final boolean y(int i) {
        return this.e.isRtlCharAt(i);
    }

    public final void z(Canvas canvas) {
        G10.g(canvas, "canvas");
        int i = this.g;
        if (i != 0) {
            canvas.translate(0.0f, i);
        }
        this.e.draw(canvas);
        int i2 = this.g;
        if (i2 != 0) {
            canvas.translate(0.0f, (-1) * i2);
        }
    }

    public /* synthetic */ C9206w21(CharSequence charSequence, float f, TextPaint textPaint, int i, TextUtils.TruncateAt truncateAt, int i2, float f2, float f3, boolean z, boolean z2, int i3, int i4, int i5, int i6, int[] iArr, int[] iArr2, C9798y90 c9798y90, int i7, AbstractC2911Yw abstractC2911Yw) {
        CharSequence charSequence2;
        TextPaint textPaint2;
        C9798y90 c9798y902;
        float f4 = (i7 & 2) != 0 ? 0.0f : f;
        int i8 = (i7 & 8) != 0 ? 0 : i;
        TextUtils.TruncateAt truncateAt2 = (i7 & 16) != 0 ? null : truncateAt;
        int i9 = (i7 & 32) != 0 ? 2 : i2;
        float f5 = (i7 & 64) != 0 ? 1.0f : f2;
        float f6 = (i7 & 128) != 0 ? 0.0f : f3;
        boolean z3 = (i7 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? false : z;
        boolean z4 = (i7 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? true : z2;
        int i10 = (i7 & 1024) != 0 ? Integer.MAX_VALUE : i3;
        int i11 = (i7 & 2048) != 0 ? 0 : i4;
        int i12 = (i7 & 4096) != 0 ? 0 : i5;
        int i13 = (i7 & 8192) != 0 ? 0 : i6;
        int[] iArr3 = (i7 & 16384) != 0 ? null : iArr;
        int[] iArr4 = (32768 & i7) != 0 ? null : iArr2;
        if ((i7 & 65536) != 0) {
            charSequence2 = charSequence;
            textPaint2 = textPaint;
            c9798y902 = new C9798y90(charSequence2, textPaint2, i9);
        } else {
            charSequence2 = charSequence;
            textPaint2 = textPaint;
            c9798y902 = c9798y90;
        }
        this(charSequence2, f4, textPaint2, i8, truncateAt2, i9, f5, f6, z3, z4, i10, i11, i12, i13, iArr3, iArr4, c9798y902);
    }
}
