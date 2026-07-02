package com.daaw;

import com.daaw.InterfaceC1583Mi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.i71, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5309i71 extends AbstractC8747uR implements InterfaceC4751g71 {
    public final InterfaceC10174zX0 f0;
    public final InterfaceC5586j71 g0;
    public final InterfaceC4097dp0 h0;
    public InterfaceC3241al i0;
    public static final /* synthetic */ W60[] k0 = {AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(C5309i71.class), "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;"))};
    public static final a j0 = new a(null);

    /* JADX INFO: renamed from: com.daaw.i71$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final InterfaceC4751g71 b(InterfaceC10174zX0 interfaceC10174zX0, InterfaceC5586j71 interfaceC5586j71, InterfaceC3241al interfaceC3241al) {
            InterfaceC3241al interfaceC3241alC;
            List listK;
            G10.g(interfaceC10174zX0, "storageManager");
            G10.g(interfaceC5586j71, "typeAliasDescriptor");
            G10.g(interfaceC3241al, "constructor");
            C8957v81 c8957v81C = c(interfaceC5586j71);
            if (c8957v81C == null || (interfaceC3241alC = interfaceC3241al.c(c8957v81C)) == null) {
                return null;
            }
            InterfaceC3072a8 annotations = interfaceC3241al.getAnnotations();
            InterfaceC1583Mi.a aVarI = interfaceC3241al.i();
            G10.f(aVarI, "getKind(...)");
            RU0 ru0J = interfaceC5586j71.j();
            G10.f(ru0J, "getSource(...)");
            C5309i71 c5309i71 = new C5309i71(interfaceC10174zX0, interfaceC5586j71, interfaceC3241alC, null, annotations, aVarI, ru0J, null);
            List listO0 = AbstractC8747uR.O0(c5309i71, interfaceC3241al.h(), c8957v81C);
            if (listO0 == null) {
                return null;
            }
            YS0 ys0C = ZM.c(interfaceC3241alC.getReturnType().Q0());
            YS0 ys0S = interfaceC5586j71.s();
            G10.f(ys0S, "getDefaultType(...)");
            YS0 ys0J = AbstractC7370pV0.j(ys0C, ys0S);
            RE0 re0C0 = interfaceC3241al.c0();
            RE0 re0I = re0C0 != null ? AbstractC1444Kz.i(c5309i71, c8957v81C.n(re0C0.getType(), EnumC1042Hc1.F), InterfaceC3072a8.b.b()) : null;
            InterfaceC4923gl interfaceC4923glR = interfaceC5586j71.r();
            if (interfaceC4923glR != null) {
                List listO02 = interfaceC3241al.o0();
                G10.f(listO02, "getContextReceiverParameters(...)");
                List list = listO02;
                listK = new ArrayList(AbstractC1703Nm.v(list, 10));
                int i = 0;
                for (Object obj : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        AbstractC1599Mm.u();
                    }
                    RE0 re0 = (RE0) obj;
                    I80 i80N = c8957v81C.n(re0.getType(), EnumC1042Hc1.F);
                    TE0 value = re0.getValue();
                    G10.e(value, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitContextReceiver");
                    listK.add(AbstractC1444Kz.c(interfaceC4923glR, i80N, ((XY) value).a(), InterfaceC3072a8.b.b(), i));
                    i = i2;
                }
            } else {
                listK = AbstractC1599Mm.k();
            }
            c5309i71.R0(re0I, null, listK, interfaceC5586j71.v(), listO0, ys0J, EnumC0336Ak0.C, interfaceC5586j71.getVisibility());
            return c5309i71;
        }

        public final C8957v81 c(InterfaceC5586j71 interfaceC5586j71) {
            if (interfaceC5586j71.r() == null) {
                return null;
            }
            return C8957v81.f(interfaceC5586j71.S());
        }

        public a() {
        }
    }

    public /* synthetic */ C5309i71(InterfaceC10174zX0 interfaceC10174zX0, InterfaceC5586j71 interfaceC5586j71, InterfaceC3241al interfaceC3241al, InterfaceC4751g71 interfaceC4751g71, InterfaceC3072a8 interfaceC3072a8, InterfaceC1583Mi.a aVar, RU0 ru0, AbstractC2911Yw abstractC2911Yw) {
        this(interfaceC10174zX0, interfaceC5586j71, interfaceC3241al, interfaceC4751g71, interfaceC3072a8, aVar, ru0);
    }

    public static final C5309i71 r1(C5309i71 c5309i71, InterfaceC3241al interfaceC3241al) {
        G10.g(c5309i71, "this$0");
        G10.g(interfaceC3241al, "$underlyingConstructorDescriptor");
        InterfaceC10174zX0 interfaceC10174zX0 = c5309i71.f0;
        InterfaceC5586j71 interfaceC5586j71P1 = c5309i71.p1();
        InterfaceC3072a8 annotations = interfaceC3241al.getAnnotations();
        InterfaceC1583Mi.a aVarI = interfaceC3241al.i();
        G10.f(aVarI, "getKind(...)");
        RU0 ru0J = c5309i71.p1().j();
        G10.f(ru0J, "getSource(...)");
        C5309i71 c5309i712 = new C5309i71(interfaceC10174zX0, interfaceC5586j71P1, interfaceC3241al, c5309i71, annotations, aVarI, ru0J);
        C8957v81 c8957v81C = j0.c(c5309i71.p1());
        if (c8957v81C == null) {
            return null;
        }
        RE0 re0C0 = interfaceC3241al.c0();
        RE0 re0C = re0C0 != null ? re0C0.c(c8957v81C) : null;
        List listO0 = interfaceC3241al.o0();
        G10.f(listO0, "getContextReceiverParameters(...)");
        List list = listO0;
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((RE0) it.next()).c(c8957v81C));
        }
        c5309i712.R0(null, re0C, arrayList, c5309i71.p1().v(), c5309i71.h(), c5309i71.getReturnType(), EnumC0336Ak0.C, c5309i71.p1().getVisibility());
        return c5309i712;
    }

    @Override // com.daaw.InterfaceC7195or
    public InterfaceC4923gl A() {
        InterfaceC4923gl interfaceC4923glA = m0().A();
        G10.f(interfaceC4923glA, "getConstructedClass(...)");
        return interfaceC4923glA;
    }

    @Override // com.daaw.AbstractC8747uR, com.daaw.InterfaceC1376Ki
    public I80 getReturnType() {
        I80 returnType = super.getReturnType();
        G10.d(returnType);
        return returnType;
    }

    @Override // com.daaw.InterfaceC1583Mi
    /* JADX INFO: renamed from: l1, reason: merged with bridge method [inline-methods] */
    public InterfaceC4751g71 I(InterfaceC8612tw interfaceC8612tw, EnumC0336Ak0 enumC0336Ak0, AbstractC8965vA abstractC8965vA, InterfaceC1583Mi.a aVar, boolean z) {
        G10.g(interfaceC8612tw, "newOwner");
        G10.g(enumC0336Ak0, "modality");
        G10.g(abstractC8965vA, "visibility");
        G10.g(aVar, "kind");
        InterfaceC8468tR interfaceC8468tRA = t().d(interfaceC8612tw).f(enumC0336Ak0).e(abstractC8965vA).g(aVar).k(z).a();
        G10.e(interfaceC8468tRA, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (InterfaceC4751g71) interfaceC8468tRA;
    }

    @Override // com.daaw.InterfaceC4751g71
    public InterfaceC3241al m0() {
        return this.i0;
    }

    @Override // com.daaw.AbstractC8747uR
    /* JADX INFO: renamed from: m1, reason: merged with bridge method [inline-methods] */
    public C5309i71 L0(InterfaceC8612tw interfaceC8612tw, InterfaceC8468tR interfaceC8468tR, InterfaceC1583Mi.a aVar, C2352Tm0 c2352Tm0, InterfaceC3072a8 interfaceC3072a8, RU0 ru0) {
        G10.g(interfaceC8612tw, "newOwner");
        G10.g(aVar, "kind");
        G10.g(interfaceC3072a8, "annotations");
        G10.g(ru0, "source");
        InterfaceC1583Mi.a aVar2 = InterfaceC1583Mi.a.DECLARATION;
        if (aVar != aVar2) {
            InterfaceC1583Mi.a aVar3 = InterfaceC1583Mi.a.SYNTHESIZED;
        }
        return new C5309i71(this.f0, p1(), m0(), this, interfaceC3072a8, aVar2, ru0);
    }

    @Override // com.daaw.AbstractC9456ww, com.daaw.InterfaceC8612tw
    /* JADX INFO: renamed from: n1, reason: merged with bridge method [inline-methods] */
    public InterfaceC5586j71 b() {
        return p1();
    }

    @Override // com.daaw.AbstractC9456ww
    /* JADX INFO: renamed from: o1, reason: merged with bridge method [inline-methods] */
    public InterfaceC4751g71 a() {
        InterfaceC8468tR interfaceC8468tRA = super.a();
        G10.e(interfaceC8468tRA, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (InterfaceC4751g71) interfaceC8468tRA;
    }

    public InterfaceC5586j71 p1() {
        return this.g0;
    }

    @Override // com.daaw.AbstractC8747uR, com.daaw.InterfaceC4297eZ0
    /* JADX INFO: renamed from: q1, reason: merged with bridge method [inline-methods] */
    public InterfaceC4751g71 c(C8957v81 c8957v81) {
        G10.g(c8957v81, "substitutor");
        InterfaceC8468tR interfaceC8468tRC = super.c(c8957v81);
        G10.e(interfaceC8468tRC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl");
        C5309i71 c5309i71 = (C5309i71) interfaceC8468tRC;
        C8957v81 c8957v81F = C8957v81.f(c5309i71.getReturnType());
        G10.f(c8957v81F, "create(...)");
        InterfaceC3241al interfaceC3241alC = m0().a().c(c8957v81F);
        if (interfaceC3241alC == null) {
            return null;
        }
        c5309i71.i0 = interfaceC3241alC;
        return c5309i71;
    }

    @Override // com.daaw.InterfaceC7195or
    public boolean z() {
        return m0().z();
    }

    public C5309i71(InterfaceC10174zX0 interfaceC10174zX0, InterfaceC5586j71 interfaceC5586j71, InterfaceC3241al interfaceC3241al, InterfaceC4751g71 interfaceC4751g71, InterfaceC3072a8 interfaceC3072a8, InterfaceC1583Mi.a aVar, RU0 ru0) {
        super(interfaceC5586j71, interfaceC4751g71, interfaceC3072a8, C7091oV0.j, aVar, ru0);
        this.f0 = interfaceC10174zX0;
        this.g0 = interfaceC5586j71;
        V0(p1().E0());
        this.h0 = interfaceC10174zX0.a(new C5030h71(this, interfaceC3241al));
        this.i0 = interfaceC3241al;
    }
}
