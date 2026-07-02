package com.daaw;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: com.daaw.e6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4176e6 implements InterfaceC0793Es0 {
    public final C4744g6 a;
    public final int b;
    public final boolean c;
    public final long d;
    public final C9206w21 e;
    public final List f;
    public final O90 g;

    /* JADX INFO: renamed from: com.daaw.e6$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[II0.values().length];
            iArr[II0.Ltr.ordinal()] = 1;
            iArr[II0.Rtl.ordinal()] = 2;
            a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.daaw.e6$b */
    public static final class b extends AbstractC4192e90 implements LQ {
        public b() {
            super(0);
        }

        @Override // com.daaw.LQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6594mi1 invoke() {
            return new C6594mi1(C4176e6.this.v(), C4176e6.this.e.w());
        }
    }

    public /* synthetic */ C4176e6(C4744g6 c4744g6, int i, boolean z, long j, AbstractC2911Yw abstractC2911Yw) {
        this(c4744g6, i, z, j);
    }

    @Override // com.daaw.InterfaceC0793Es0
    public II0 a(int i) {
        return this.e.r(this.e.l(i)) == 1 ? II0.Ltr : II0.Rtl;
    }

    @Override // com.daaw.InterfaceC0793Es0
    public float b(int i) {
        return this.e.o(i);
    }

    @Override // com.daaw.InterfaceC0793Es0
    public float c() {
        return this.b < k() ? t(this.b - 1) : t(k() - 1);
    }

    @Override // com.daaw.InterfaceC0793Es0
    public int d(int i) {
        return this.e.l(i);
    }

    @Override // com.daaw.InterfaceC0793Es0
    public float e() {
        return t(0);
    }

    @Override // com.daaw.InterfaceC0793Es0
    public int f(long j) {
        return this.e.q(this.e.m((int) C9982yp0.m(j)), C9982yp0.l(j));
    }

    @Override // com.daaw.InterfaceC0793Es0
    public C3103aF0 g(int i) {
        float fT = C9206w21.t(this.e, i, false, 2, null);
        float fT2 = C9206w21.t(this.e, i + 1, false, 2, null);
        int iL = this.e.l(i);
        return new C3103aF0(fT, this.e.o(iL), fT2, this.e.g(iL));
    }

    @Override // com.daaw.InterfaceC0793Es0
    public float getHeight() {
        return this.e.b();
    }

    @Override // com.daaw.InterfaceC0793Es0
    public float getWidth() {
        return C6079kr.n(this.d);
    }

    @Override // com.daaw.InterfaceC0793Es0
    public List h() {
        return this.f;
    }

    @Override // com.daaw.InterfaceC0793Es0
    public int i(int i) {
        return this.e.n(i);
    }

    @Override // com.daaw.InterfaceC0793Es0
    public int j(int i, boolean z) {
        return z ? this.e.p(i) : this.e.k(i);
    }

    @Override // com.daaw.InterfaceC0793Es0
    public int k() {
        return this.e.h();
    }

    @Override // com.daaw.InterfaceC0793Es0
    public boolean l() {
        return this.e.a();
    }

    @Override // com.daaw.InterfaceC0793Es0
    public int m(float f) {
        return this.e.m((int) f);
    }

    @Override // com.daaw.InterfaceC0793Es0
    public void n(InterfaceC6318lj interfaceC6318lj, long j, C4265eR0 c4265eR0, P11 p11) {
        G10.g(interfaceC6318lj, "canvas");
        C8101s6 c8101s6W = w();
        c8101s6W.b(j);
        c8101s6W.c(c4265eR0);
        c8101s6W.d(p11);
        Canvas canvasC = AbstractC3614c5.c(interfaceC6318lj);
        if (l()) {
            canvasC.save();
            canvasC.clipRect(0.0f, 0.0f, getWidth(), getHeight());
        }
        this.e.z(canvasC);
        if (l()) {
            canvasC.restore();
        }
    }

    @Override // com.daaw.InterfaceC0793Es0
    public void o(InterfaceC6318lj interfaceC6318lj, AbstractC2117Rg abstractC2117Rg, C4265eR0 c4265eR0, P11 p11) {
        G10.g(interfaceC6318lj, "canvas");
        G10.g(abstractC2117Rg, "brush");
        C8101s6 c8101s6W = w();
        c8101s6W.a(abstractC2117Rg, BT0.a(getWidth(), getHeight()));
        c8101s6W.c(c4265eR0);
        c8101s6W.d(p11);
        Canvas canvasC = AbstractC3614c5.c(interfaceC6318lj);
        if (l()) {
            canvasC.save();
            canvasC.clipRect(0.0f, 0.0f, getWidth(), getHeight());
        }
        this.e.z(canvasC);
        if (l()) {
            canvasC.restore();
        }
    }

    public final C9206w21 q(int i, int i2, TextUtils.TruncateAt truncateAt, int i3) {
        return new C9206w21(this.a.e(), getWidth(), w(), i, truncateAt, this.a.i(), 1.0f, 0.0f, AbstractC4455f6.b(this.a.h()), true, i3, 0, 0, i2, null, null, this.a.g(), 55424, null);
    }

    public II0 r(int i) {
        return this.e.y(i) ? II0.Rtl : II0.Ltr;
    }

    public float s(int i, boolean z) {
        return z ? C9206w21.t(this.e, i, false, 2, null) : C9206w21.v(this.e, i, false, 2, null);
    }

    public final float t(int i) {
        return this.e.f(i);
    }

    public final TQ0[] u(C9206w21 c9206w21) {
        if (!(c9206w21.w() instanceof Spanned)) {
            return new TQ0[0];
        }
        TQ0[] tq0Arr = (TQ0[]) ((Spanned) c9206w21.w()).getSpans(0, c9206w21.w().length(), TQ0.class);
        G10.f(tq0Arr, "brushSpans");
        return tq0Arr.length == 0 ? new TQ0[0] : tq0Arr;
    }

    public final Locale v() {
        Locale textLocale = this.a.j().getTextLocale();
        G10.f(textLocale, "paragraphIntrinsics.textPaint.textLocale");
        return textLocale;
    }

    public final C8101s6 w() {
        return this.a.j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [com.daaw.e6] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v3, types: [int] */
    /* JADX WARN: Type inference failed for: r8v9 */
    public C4176e6(C4744g6 c4744g6, int i, boolean z, long j) {
        List listK;
        C3103aF0 c3103aF0;
        float fS;
        float f;
        int iB;
        float fO;
        float fB;
        float f2;
        this.a = c4744g6;
        this.b = i;
        this.c = z;
        this.d = j;
        if (C6079kr.o(j) != 0 || C6079kr.p(j) != 0) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        boolean z2 = true;
        if (i < 1) {
            throw new IllegalArgumentException("maxLines should be greater than 0");
        }
        O21 o21H = c4744g6.h();
        int iE = AbstractC5302i6.e(o21H.v());
        J11 j11V = o21H.v();
        ?? J = j11V == null ? 0 : J11.j(j11V.m(), J11.b.c());
        TextUtils.TruncateAt truncateAt = z ? TextUtils.TruncateAt.END : null;
        C9206w21 c9206w21Q = q(iE, J, truncateAt, i);
        if (!z || c9206w21Q.b() <= C6079kr.m(j) || i <= 1) {
            this.e = c9206w21Q;
        } else {
            int iD = AbstractC5302i6.d(c9206w21Q, C6079kr.m(j));
            if (iD > 0 && iD != i) {
                c9206w21Q = q(iE, J, truncateAt, iD);
            }
            this.e = c9206w21Q;
        }
        w().a(o21H.f(), BT0.a(getWidth(), getHeight()));
        for (TQ0 tq0 : u(this.e)) {
            tq0.a(C9879yT0.c(BT0.a(getWidth(), getHeight())));
        }
        CharSequence charSequenceE = this.a.e();
        if (charSequenceE instanceof Spanned) {
            Spanned spanned = (Spanned) charSequenceE;
            Object[] spans = spanned.getSpans(0, charSequenceE.length(), C1009Gu0.class);
            G10.f(spans, "getSpans(0, length, PlaceholderSpan::class.java)");
            ArrayList arrayList = new ArrayList(spans.length);
            int length = spans.length;
            int i2 = 0;
            while (i2 < length) {
                C1009Gu0 c1009Gu0 = (C1009Gu0) spans[i2];
                int spanStart = spanned.getSpanStart(c1009Gu0);
                int spanEnd = spanned.getSpanEnd(c1009Gu0);
                int iL = this.e.l(spanStart);
                boolean z3 = this.e.i(iL) > 0 && spanEnd > this.e.j(iL);
                boolean z4 = spanEnd > this.e.k(iL);
                if (z3 || z4) {
                    c3103aF0 = null;
                } else {
                    int i3 = a.a[r(spanStart).ordinal()];
                    if (i3 == z2) {
                        fS = s(spanStart, z2);
                    } else {
                        if (i3 != 2) {
                            throw new C6902no0();
                        }
                        fS = s(spanStart, z2) - c1009Gu0.d();
                    }
                    float fD = c1009Gu0.d() + fS;
                    C9206w21 c9206w21 = this.e;
                    switch (c1009Gu0.c()) {
                        case 0:
                            f = c9206w21.f(iL);
                            iB = c1009Gu0.b();
                            fO = f - iB;
                            c3103aF0 = new C3103aF0(fS, fO, fD, c1009Gu0.b() + fO);
                            break;
                        case 1:
                            fO = c9206w21.o(iL);
                            c3103aF0 = new C3103aF0(fS, fO, fD, c1009Gu0.b() + fO);
                            break;
                        case 2:
                            f = c9206w21.g(iL);
                            iB = c1009Gu0.b();
                            fO = f - iB;
                            c3103aF0 = new C3103aF0(fS, fO, fD, c1009Gu0.b() + fO);
                            break;
                        case 3:
                            fO = ((c9206w21.o(iL) + c9206w21.g(iL)) - c1009Gu0.b()) / 2;
                            c3103aF0 = new C3103aF0(fS, fO, fD, c1009Gu0.b() + fO);
                            break;
                        case 4:
                            fB = c1009Gu0.a().ascent;
                            f2 = c9206w21.f(iL);
                            fO = fB + f2;
                            c3103aF0 = new C3103aF0(fS, fO, fD, c1009Gu0.b() + fO);
                            break;
                        case 5:
                            f = c1009Gu0.a().descent + c9206w21.f(iL);
                            iB = c1009Gu0.b();
                            fO = f - iB;
                            c3103aF0 = new C3103aF0(fS, fO, fD, c1009Gu0.b() + fO);
                            break;
                        case 6:
                            Paint.FontMetricsInt fontMetricsIntA = c1009Gu0.a();
                            fB = ((fontMetricsIntA.ascent + fontMetricsIntA.descent) - c1009Gu0.b()) / 2;
                            f2 = c9206w21.f(iL);
                            fO = fB + f2;
                            c3103aF0 = new C3103aF0(fS, fO, fD, c1009Gu0.b() + fO);
                            break;
                        default:
                            throw new IllegalStateException("unexpected verticalAlignment");
                    }
                }
                arrayList.add(c3103aF0);
                i2++;
                z2 = true;
            }
            listK = arrayList;
        } else {
            listK = AbstractC1599Mm.k();
        }
        this.f = listK;
        this.g = AbstractC3192ab0.b(EnumC7395pb0.D, new b());
    }
}
