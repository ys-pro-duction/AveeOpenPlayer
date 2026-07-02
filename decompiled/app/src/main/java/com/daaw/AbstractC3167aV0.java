package com.daaw;

import android.graphics.Typeface;
import android.os.Build;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.LocaleSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import com.daaw.C3197ac0;
import com.daaw.D7;
import com.daaw.P11;
import com.daaw.U21;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.aV0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3167aV0 {

    /* JADX INFO: renamed from: com.daaw.aV0$a */
    public static final class a extends AbstractC4192e90 implements InterfaceC3986dR {
        public final /* synthetic */ Spannable B;
        public final /* synthetic */ InterfaceC4553fR C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Spannable spannable, InterfaceC4553fR interfaceC4553fR) {
            super(3);
            this.B = spannable;
            this.C = interfaceC4553fR;
        }

        public final void a(XU0 xu0, int i, int i2) {
            G10.g(xu0, "spanStyle");
            Spannable spannable = this.B;
            InterfaceC4553fR interfaceC4553fR = this.C;
            AbstractC7898rO abstractC7898rOG = xu0.g();
            SO soL = xu0.l();
            if (soL == null) {
                soL = SO.C.d();
            }
            PO poJ = xu0.j();
            PO poC = PO.c(poJ != null ? poJ.i() : PO.b.b());
            QO qoK = xu0.k();
            spannable.setSpan(new C4472f91((Typeface) interfaceC4553fR.b(abstractC7898rOG, soL, poC, QO.b(qoK != null ? qoK.j() : QO.b.a()))), i, i2, 33);
        }

        @Override // com.daaw.InterfaceC3986dR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((XU0) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
            return G91.a;
        }
    }

    public static final MetricAffectingSpan a(long j, InterfaceC4988gz interfaceC4988gz) {
        long jG = S21.g(j);
        U21.a aVar = U21.b;
        if (U21.g(jG, aVar.b())) {
            return new C9354wb0(interfaceC4988gz.e0(j));
        }
        if (U21.g(jG, aVar.a())) {
            return new C9075vb0(S21.h(j));
        }
        return null;
    }

    public static final void b(XU0 xu0, List list, InterfaceC3986dR interfaceC3986dR) {
        G10.g(list, "spanStyles");
        G10.g(interfaceC3986dR, "block");
        if (list.size() <= 1) {
            if (list.isEmpty()) {
                return;
            }
            interfaceC3986dR.invoke(d(xu0, (XU0) ((D7.b) list.get(0)).e()), Integer.valueOf(((D7.b) list.get(0)).f()), Integer.valueOf(((D7.b) list.get(0)).d()));
            return;
        }
        int size = list.size();
        int i = size * 2;
        Integer[] numArr = new Integer[i];
        for (int i2 = 0; i2 < i; i2++) {
            numArr[i2] = 0;
        }
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            D7.b bVar = (D7.b) list.get(i3);
            numArr[i3] = Integer.valueOf(bVar.f());
            numArr[i3 + size] = Integer.valueOf(bVar.d());
        }
        AbstractC5152hb.v(numArr);
        int iIntValue = ((Number) AbstractC5431ib.F(numArr)).intValue();
        for (int i4 = 0; i4 < i; i4++) {
            Integer num = numArr[i4];
            int iIntValue2 = num.intValue();
            if (iIntValue2 != iIntValue) {
                int size3 = list.size();
                XU0 xu0D = xu0;
                for (int i5 = 0; i5 < size3; i5++) {
                    D7.b bVar2 = (D7.b) list.get(i5);
                    if (bVar2.f() != bVar2.d() && E7.f(iIntValue, iIntValue2, bVar2.f(), bVar2.d())) {
                        xu0D = d(xu0D, (XU0) bVar2.e());
                    }
                }
                if (xu0D != null) {
                    interfaceC3986dR.invoke(xu0D, Integer.valueOf(iIntValue), num);
                }
                iIntValue = iIntValue2;
            }
        }
    }

    public static final boolean c(O21 o21) {
        return D21.b(o21.E()) || o21.l() != null;
    }

    public static final XU0 d(XU0 xu0, XU0 xu02) {
        return xu0 == null ? xu02 : xu0.v(xu02);
    }

    public static final float e(long j, float f, InterfaceC4988gz interfaceC4988gz) {
        long jG = S21.g(j);
        U21.a aVar = U21.b;
        if (U21.g(jG, aVar.b())) {
            return interfaceC4988gz.e0(j);
        }
        if (U21.g(jG, aVar.a())) {
            return S21.h(j) * f;
        }
        return Float.NaN;
    }

    public static final void f(Spannable spannable, long j, int i, int i2) {
        G10.g(spannable, "$this$setBackground");
        if (j != C2559Vm.b.g()) {
            r(spannable, new BackgroundColorSpan(AbstractC3530bn.i(j)), i, i2);
        }
    }

    public static final void g(Spannable spannable, C1671Ne c1671Ne, int i, int i2) {
        if (c1671Ne != null) {
            r(spannable, new C1775Oe(c1671Ne.h()), i, i2);
        }
    }

    public static final void h(Spannable spannable, AbstractC2117Rg abstractC2117Rg, int i, int i2) {
        if (abstractC2117Rg != null) {
            if (abstractC2117Rg instanceof GU0) {
                i(spannable, ((GU0) abstractC2117Rg).b(), i, i2);
            } else if (abstractC2117Rg instanceof SQ0) {
                r(spannable, new TQ0((SQ0) abstractC2117Rg), i, i2);
            }
        }
    }

    public static final void i(Spannable spannable, long j, int i, int i2) {
        G10.g(spannable, "$this$setColor");
        if (j != C2559Vm.b.g()) {
            r(spannable, new ForegroundColorSpan(AbstractC3530bn.i(j)), i, i2);
        }
    }

    public static final void j(Spannable spannable, O21 o21, List list, InterfaceC4553fR interfaceC4553fR) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            D7.b bVar = (D7.b) obj;
            if (D21.b((XU0) bVar.e()) || ((XU0) bVar.e()).k() != null) {
                arrayList.add(obj);
            }
        }
        b(c(o21) ? new XU0(0L, 0L, o21.m(), o21.k(), o21.l(), o21.h(), (String) null, 0L, (C1671Ne) null, (C4437f21) null, (C4884gd0) null, 0L, (P11) null, (C4265eR0) null, 16323, (AbstractC2911Yw) null) : null, arrayList, new a(spannable, interfaceC4553fR));
    }

    public static final void k(Spannable spannable, String str, int i, int i2) {
        if (str != null) {
            r(spannable, new C9579xO(str), i, i2);
        }
    }

    public static final void l(Spannable spannable, long j, InterfaceC4988gz interfaceC4988gz, int i, int i2) {
        G10.g(spannable, "$this$setFontSize");
        G10.g(interfaceC4988gz, "density");
        long jG = S21.g(j);
        U21.a aVar = U21.b;
        if (U21.g(jG, aVar.b())) {
            r(spannable, new AbsoluteSizeSpan(AbstractC8261sh0.b(interfaceC4988gz.e0(j)), false), i, i2);
        } else if (U21.g(jG, aVar.a())) {
            r(spannable, new RelativeSizeSpan(S21.h(j)), i, i2);
        }
    }

    public static final void m(Spannable spannable, C4437f21 c4437f21, int i, int i2) {
        if (c4437f21 != null) {
            r(spannable, new ScaleXSpan(c4437f21.b()), i, i2);
            r(spannable, new FT0(c4437f21.c()), i, i2);
        }
    }

    public static final void n(Spannable spannable, long j, float f, InterfaceC4988gz interfaceC4988gz, C3197ac0 c3197ac0) {
        G10.g(spannable, "$this$setLineHeight");
        G10.g(interfaceC4988gz, "density");
        G10.g(c3197ac0, "lineHeightStyle");
        float fE = e(j, f, interfaceC4988gz);
        if (Float.isNaN(fE)) {
            return;
        }
        r(spannable, new C3476bc0(fE, 0, spannable.length(), C3197ac0.c.e(c3197ac0.c()), C3197ac0.c.f(c3197ac0.c()), c3197ac0.b()), 0, spannable.length());
    }

    public static final void o(Spannable spannable, long j, float f, InterfaceC4988gz interfaceC4988gz) {
        G10.g(spannable, "$this$setLineHeight");
        G10.g(interfaceC4988gz, "density");
        float fE = e(j, f, interfaceC4988gz);
        if (Float.isNaN(fE)) {
            return;
        }
        r(spannable, new C2932Zb0(fE), 0, spannable.length());
    }

    public static final void p(Spannable spannable, C4884gd0 c4884gd0, int i, int i2) {
        Object localeSpan;
        G10.g(spannable, "<this>");
        if (c4884gd0 != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                localeSpan = C6568md0.a.a(c4884gd0);
            } else {
                localeSpan = new LocaleSpan(AbstractC4605fd0.a(c4884gd0.isEmpty() ? C4316ed0.b.a() : c4884gd0.m(0)));
            }
            r(spannable, localeSpan, i, i2);
        }
    }

    public static final void q(Spannable spannable, C4265eR0 c4265eR0, int i, int i2) {
        if (c4265eR0 != null) {
            r(spannable, new C5112hR0(AbstractC3530bn.i(c4265eR0.c()), C9982yp0.l(c4265eR0.d()), C9982yp0.m(c4265eR0.d()), c4265eR0.b()), i, i2);
        }
    }

    public static final void r(Spannable spannable, Object obj, int i, int i2) {
        G10.g(spannable, "<this>");
        G10.g(obj, "span");
        spannable.setSpan(obj, i, i2, 33);
    }

    public static final void s(Spannable spannable, D7.b bVar, InterfaceC4988gz interfaceC4988gz, ArrayList arrayList) {
        int iF = bVar.f();
        int iD = bVar.d();
        XU0 xu0 = (XU0) bVar.e();
        g(spannable, xu0.d(), iF, iD);
        i(spannable, xu0.f(), iF, iD);
        h(spannable, xu0.e(), iF, iD);
        u(spannable, xu0.q(), iF, iD);
        l(spannable, xu0.i(), interfaceC4988gz, iF, iD);
        k(spannable, xu0.h(), iF, iD);
        m(spannable, xu0.s(), iF, iD);
        p(spannable, xu0.n(), iF, iD);
        f(spannable, xu0.c(), iF, iD);
        q(spannable, xu0.p(), iF, iD);
        MetricAffectingSpan metricAffectingSpanA = a(xu0.m(), interfaceC4988gz);
        if (metricAffectingSpanA != null) {
            arrayList.add(new WU0(metricAffectingSpanA, iF, iD));
        }
    }

    public static final void t(Spannable spannable, O21 o21, List list, InterfaceC4988gz interfaceC4988gz, InterfaceC4553fR interfaceC4553fR) {
        G10.g(spannable, "<this>");
        G10.g(o21, "contextTextStyle");
        G10.g(list, "spanStyles");
        G10.g(interfaceC4988gz, "density");
        G10.g(interfaceC4553fR, "resolveTypeface");
        j(spannable, o21, list, interfaceC4553fR);
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            D7.b bVar = (D7.b) list.get(i);
            int iF = bVar.f();
            int iD = bVar.d();
            if (iF >= 0 && iF < spannable.length() && iD > iF && iD <= spannable.length()) {
                s(spannable, bVar, interfaceC4988gz, arrayList);
            }
        }
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            WU0 wu0 = (WU0) arrayList.get(i2);
            r(spannable, wu0.a(), wu0.b(), wu0.c());
        }
    }

    public static final void u(Spannable spannable, P11 p11, int i, int i2) {
        G10.g(spannable, "<this>");
        if (p11 != null) {
            P11.a aVar = P11.b;
            r(spannable, new Q11(p11.d(aVar.c()), p11.d(aVar.a())), i, i2);
        }
    }

    public static final void v(Spannable spannable, C4726g21 c4726g21, float f, InterfaceC4988gz interfaceC4988gz) {
        G10.g(spannable, "<this>");
        G10.g(interfaceC4988gz, "density");
        if (c4726g21 != null) {
            if ((S21.e(c4726g21.b(), T21.d(0)) && S21.e(c4726g21.c(), T21.d(0))) || T21.e(c4726g21.b()) || T21.e(c4726g21.c())) {
                return;
            }
            long jG = S21.g(c4726g21.b());
            U21.a aVar = U21.b;
            float fH = 0.0f;
            float fE0 = U21.g(jG, aVar.b()) ? interfaceC4988gz.e0(c4726g21.b()) : U21.g(jG, aVar.a()) ? S21.h(c4726g21.b()) * f : 0.0f;
            long jG2 = S21.g(c4726g21.c());
            if (U21.g(jG2, aVar.b())) {
                fH = interfaceC4988gz.e0(c4726g21.c());
            } else if (U21.g(jG2, aVar.a())) {
                fH = S21.h(c4726g21.c()) * f;
            }
            r(spannable, new LeadingMarginSpan.Standard((int) Math.ceil(fE0), (int) Math.ceil(fH)), 0, spannable.length());
        }
    }
}
