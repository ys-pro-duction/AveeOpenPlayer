package com.daaw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class DE0 extends UM implements BE0 {
    public DE0(YS0 ys0, YS0 ys02, boolean z) {
        super(ys0, ys02);
        if (z) {
            return;
        }
        J80.a.b(ys0, ys02);
    }

    public static final CharSequence b1(String str) {
        G10.g(str, "it");
        return "(raw) " + str;
    }

    public static final boolean c1(String str, String str2) {
        return G10.c(str, BY0.b0(str2, "out ")) || G10.c(str2, "*");
    }

    public static final List d1(AbstractC2923Yz abstractC2923Yz, I80 i80) {
        List listL0 = i80.L0();
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(listL0, 10));
        Iterator it = listL0.iterator();
        while (it.hasNext()) {
            arrayList.add(abstractC2923Yz.V((InterfaceC6440m81) it.next()));
        }
        return arrayList;
    }

    public static final String e1(String str, String str2) {
        if (!BY0.y(str, '<', false, 2, null)) {
            return str;
        }
        return BY0.y0(str, '<', null, 2, null) + '<' + str2 + '>' + BY0.u0(str, '>', null, 2, null);
    }

    @Override // com.daaw.UM
    public YS0 U0() {
        return V0();
    }

    @Override // com.daaw.UM
    public String X0(AbstractC2923Yz abstractC2923Yz, InterfaceC5043hA interfaceC5043hA) {
        G10.g(abstractC2923Yz, "renderer");
        G10.g(interfaceC5043hA, "options");
        String strU = abstractC2923Yz.U(V0());
        String strU2 = abstractC2923Yz.U(W0());
        if (interfaceC5043hA.o()) {
            return "raw (" + strU + ".." + strU2 + ')';
        }
        if (W0().L0().isEmpty()) {
            return abstractC2923Yz.R(strU, strU2, H81.n(this));
        }
        List listD1 = d1(abstractC2923Yz, V0());
        List listD12 = d1(abstractC2923Yz, W0());
        List list = listD1;
        String strN0 = AbstractC2455Um.n0(list, ", ", null, null, 0, null, CE0.B, 30, null);
        List<C0576Cs0> listT0 = AbstractC2455Um.T0(list, listD12);
        if ((listT0 instanceof Collection) && listT0.isEmpty()) {
            strU2 = e1(strU2, strN0);
        } else {
            for (C0576Cs0 c0576Cs0 : listT0) {
                if (!c1((String) c0576Cs0.c(), (String) c0576Cs0.d())) {
                    break;
                }
            }
            strU2 = e1(strU2, strN0);
        }
        String strE1 = e1(strU, strN0);
        return G10.c(strE1, strU2) ? strE1 : abstractC2923Yz.R(strE1, strU2, H81.n(this));
    }

    @Override // com.daaw.AbstractC5708ja1
    /* JADX INFO: renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public DE0 R0(boolean z) {
        return new DE0(V0().R0(z), W0().R0(z));
    }

    @Override // com.daaw.AbstractC5708ja1
    /* JADX INFO: renamed from: a1, reason: merged with bridge method [inline-methods] */
    public UM X0(Q80 q80) {
        G10.g(q80, "kotlinTypeRefiner");
        I80 i80A = q80.a(V0());
        G10.e(i80A, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        I80 i80A2 = q80.a(W0());
        G10.e(i80A2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new DE0((YS0) i80A, (YS0) i80A2, true);
    }

    @Override // com.daaw.AbstractC5708ja1
    /* JADX INFO: renamed from: f1, reason: merged with bridge method [inline-methods] */
    public DE0 T0(C8387t71 c8387t71) {
        G10.g(c8387t71, "newAttributes");
        return new DE0(V0().T0(c8387t71), W0().T0(c8387t71));
    }

    @Override // com.daaw.UM, com.daaw.I80
    public InterfaceC4346ej0 q() {
        InterfaceC10240zl interfaceC10240zlC = N0().c();
        C5035h81 c5035h81 = null;
        byte b = 0;
        InterfaceC4923gl interfaceC4923gl = interfaceC10240zlC instanceof InterfaceC4923gl ? (InterfaceC4923gl) interfaceC10240zlC : null;
        if (interfaceC4923gl != null) {
            InterfaceC4346ej0 interfaceC4346ej0G0 = interfaceC4923gl.G0(new AE0(c5035h81, 1, b == true ? 1 : 0));
            G10.f(interfaceC4346ej0G0, "getMemberScope(...)");
            return interfaceC4346ej0G0;
        }
        throw new IllegalStateException(("Incorrect classifier: " + N0().c()).toString());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DE0(YS0 ys0, YS0 ys02) {
        this(ys0, ys02, false);
        G10.g(ys0, "lowerBound");
        G10.g(ys02, "upperBound");
    }
}
