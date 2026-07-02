package com.daaw;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class AE0 extends AbstractC8392t81 {
    public static final a e = new a(null);
    public static final B30 f;
    public static final B30 g;
    public final C9540xE0 c;
    public final C5035h81 d;

    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public a() {
        }
    }

    static {
        C81 c81 = C81.C;
        f = C30.b(c81, false, true, null, 5, null).l(F30.D);
        g = C30.b(c81, false, true, null, 5, null).l(F30.C);
    }

    public AE0(C5035h81 c5035h81) {
        C9540xE0 c9540xE0 = new C9540xE0();
        this.c = c9540xE0;
        if (c5035h81 == null) {
            c5035h81 = new C5035h81(c9540xE0, null, 2, 0 == true ? 1 : 0);
        }
        this.d = c5035h81;
    }

    public static final YS0 k(InterfaceC4923gl interfaceC4923gl, AE0 ae0, YS0 ys0, B30 b30, Q80 q80) {
        InterfaceC4923gl interfaceC4923glB;
        G10.g(interfaceC4923gl, "$declaration");
        G10.g(ae0, "this$0");
        G10.g(ys0, "$type");
        G10.g(b30, "$attr");
        G10.g(q80, "kotlinTypeRefiner");
        C6607ml c6607mlN = AbstractC8400tA.n(interfaceC4923gl);
        if (c6607mlN == null || (interfaceC4923glB = q80.b(c6607mlN)) == null || G10.c(interfaceC4923glB, interfaceC4923gl)) {
            return null;
        }
        return (YS0) ae0.j(ys0, interfaceC4923glB, b30).c();
    }

    public static /* synthetic */ I80 m(AE0 ae0, I80 i80, B30 b30, int i, Object obj) {
        if ((i & 2) != 0) {
            b30 = new B30(C81.C, null, false, false, null, null, 62, null);
        }
        return ae0.l(i80, b30);
    }

    @Override // com.daaw.AbstractC8392t81
    public boolean f() {
        return false;
    }

    public final C0576Cs0 j(YS0 ys0, InterfaceC4923gl interfaceC4923gl, B30 b30) {
        if (ys0.N0().getParameters().isEmpty()) {
            return D61.a(ys0, Boolean.FALSE);
        }
        if (AbstractC8670u80.c0(ys0)) {
            InterfaceC6440m81 interfaceC6440m81 = (InterfaceC6440m81) ys0.L0().get(0);
            EnumC1042Hc1 enumC1042Hc1B = interfaceC6440m81.b();
            I80 type = interfaceC6440m81.getType();
            G10.f(type, "getType(...)");
            return D61.a(M80.k(ys0.M0(), ys0.N0(), AbstractC1496Lm.e(new C6998o81(enumC1042Hc1B, l(type, b30))), ys0.O0(), null, 16, null), Boolean.FALSE);
        }
        if (N80.a(ys0)) {
            return D61.a(BH.d(AH.l0, ys0.N0().toString()), Boolean.FALSE);
        }
        InterfaceC4346ej0 interfaceC4346ej0G0 = interfaceC4923gl.G0(this);
        G10.f(interfaceC4346ej0G0, "getMemberScope(...)");
        C8387t71 c8387t71M0 = ys0.M0();
        C71 c71K = interfaceC4923gl.k();
        G10.f(c71K, "getTypeConstructor(...)");
        List parameters = interfaceC4923gl.k().getParameters();
        G10.f(parameters, "getParameters(...)");
        List<Z71> list = parameters;
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(list, 10));
        for (Z71 z71 : list) {
            C9540xE0 c9540xE0 = this.c;
            G10.d(z71);
            arrayList.add(AbstractC6197lH.b(c9540xE0, z71, b30, this.d, null, 8, null));
        }
        return D61.a(M80.n(c8387t71M0, c71K, arrayList, ys0.O0(), interfaceC4346ej0G0, new C10098zE0(interfaceC4923gl, this, ys0, b30)), Boolean.TRUE);
    }

    public final I80 l(I80 i80, B30 b30) {
        InterfaceC10240zl interfaceC10240zlC = i80.N0().c();
        if (interfaceC10240zlC instanceof Z71) {
            return l(this.d.e((Z71) interfaceC10240zlC, b30.j(true)), b30);
        }
        if (!(interfaceC10240zlC instanceof InterfaceC4923gl)) {
            throw new IllegalStateException(("Unexpected declaration kind: " + interfaceC10240zlC).toString());
        }
        InterfaceC10240zl interfaceC10240zlC2 = ZM.d(i80).N0().c();
        if (interfaceC10240zlC2 instanceof InterfaceC4923gl) {
            C0576Cs0 c0576Cs0J = j(ZM.c(i80), (InterfaceC4923gl) interfaceC10240zlC, f);
            YS0 ys0 = (YS0) c0576Cs0J.a();
            boolean zBooleanValue = ((Boolean) c0576Cs0J.b()).booleanValue();
            C0576Cs0 c0576Cs0J2 = j(ZM.d(i80), (InterfaceC4923gl) interfaceC10240zlC2, g);
            YS0 ys02 = (YS0) c0576Cs0J2.a();
            return (zBooleanValue || ((Boolean) c0576Cs0J2.b()).booleanValue()) ? new DE0(ys0, ys02) : M80.e(ys0, ys02);
        }
        throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + interfaceC10240zlC2 + "\" while for lower it's \"" + interfaceC10240zlC + '\"').toString());
    }

    @Override // com.daaw.AbstractC8392t81
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public C6998o81 e(I80 i80) {
        G10.g(i80, SubscriberAttributeKt.JSON_NAME_KEY);
        return new C6998o81(m(this, i80, null, 2, null));
    }

    public /* synthetic */ AE0(C5035h81 c5035h81, int i, AbstractC2911Yw abstractC2911Yw) {
        this((i & 1) != 0 ? null : c5035h81);
    }
}
