package com.daaw;

import android.graphics.Typeface;
import android.os.Build;
import com.daaw.C2559Vm;
import com.daaw.U21;

/* JADX INFO: loaded from: classes.dex */
public abstract class D21 {
    public static final XU0 a(C8101s6 c8101s6, XU0 xu0, InterfaceC4553fR interfaceC4553fR, InterfaceC4988gz interfaceC4988gz) {
        G10.g(c8101s6, "<this>");
        G10.g(xu0, "style");
        G10.g(interfaceC4553fR, "resolveTypeface");
        G10.g(interfaceC4988gz, "density");
        long jG = S21.g(xu0.i());
        U21.a aVar = U21.b;
        if (U21.g(jG, aVar.b())) {
            c8101s6.setTextSize(interfaceC4988gz.e0(xu0.i()));
        } else if (U21.g(jG, aVar.a())) {
            c8101s6.setTextSize(c8101s6.getTextSize() * S21.h(xu0.i()));
        }
        if (b(xu0)) {
            AbstractC7898rO abstractC7898rOG = xu0.g();
            SO soL = xu0.l();
            if (soL == null) {
                soL = SO.C.d();
            }
            PO poJ = xu0.j();
            PO poC = PO.c(poJ != null ? poJ.i() : PO.b.b());
            QO qoK = xu0.k();
            c8101s6.setTypeface((Typeface) interfaceC4553fR.b(abstractC7898rOG, soL, poC, QO.b(qoK != null ? qoK.j() : QO.b.a())));
        }
        if (xu0.n() != null && !G10.c(xu0.n(), C4884gd0.D.a())) {
            if (Build.VERSION.SDK_INT >= 24) {
                C6568md0.a.b(c8101s6, xu0.n());
            } else {
                c8101s6.setTextLocale(AbstractC4605fd0.a(xu0.n().isEmpty() ? C4316ed0.b.a() : xu0.n().m(0)));
            }
        }
        long jG2 = S21.g(xu0.m());
        if (U21.g(jG2, aVar.a())) {
            c8101s6.setLetterSpacing(S21.h(xu0.m()));
        } else {
            U21.g(jG2, aVar.b());
        }
        if (xu0.h() != null && !G10.c(xu0.h(), "")) {
            c8101s6.setFontFeatureSettings(xu0.h());
        }
        if (xu0.s() != null && !G10.c(xu0.s(), C4437f21.c.a())) {
            c8101s6.setTextScaleX(c8101s6.getTextScaleX() * xu0.s().b());
            c8101s6.setTextSkewX(c8101s6.getTextSkewX() + xu0.s().c());
        }
        c8101s6.b(xu0.f());
        c8101s6.a(xu0.e(), C9879yT0.b.a());
        c8101s6.c(xu0.p());
        c8101s6.d(xu0.q());
        long jA = (!U21.g(S21.g(xu0.m()), aVar.b()) || S21.h(xu0.m()) == 0.0f) ? S21.b.a() : xu0.m();
        long jC = xu0.c();
        C2559Vm.a aVar2 = C2559Vm.b;
        long jG3 = C2559Vm.o(jC, aVar2.f()) ? aVar2.g() : xu0.c();
        C1671Ne c1671NeD = xu0.d();
        return new XU0(0L, 0L, (SO) null, (PO) null, (QO) null, (AbstractC7898rO) null, (String) null, jA, c1671NeD != null ? C1671Ne.e(c1671NeD.h(), C1671Ne.b.a()) : false ? null : xu0.d(), (C4437f21) null, (C4884gd0) null, jG3, (P11) null, (C4265eR0) null, 13951, (AbstractC2911Yw) null);
    }

    public static final boolean b(XU0 xu0) {
        G10.g(xu0, "<this>");
        return (xu0.g() == null && xu0.j() == null && xu0.l() == null) ? false : true;
    }
}
