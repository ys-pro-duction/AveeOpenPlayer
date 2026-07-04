package com.daaw;

import com.daaw.AbstractC5347iG0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.z70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C10067z70 implements InterfaceC9509x70, InterfaceC5862k60 {
    public static final /* synthetic */ W60[] E = {AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(C10067z70.class), "upperBounds", "getUpperBounds()Ljava/util/List;"))};
    public final Z71 B;
    public final AbstractC5347iG0.a C;
    public final A70 D;

    /* JADX INFO: renamed from: com.daaw.z70$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC1042Hc1.values().length];
            try {
                iArr[EnumC1042Hc1.F.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC1042Hc1.G.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC1042Hc1.H.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public C10067z70(A70 a70, Z71 z71) {
        C4745g60 c4745g60F;
        Object objH0;
        G10.g(z71, "descriptor");
        this.B = z71;
        this.C = AbstractC5347iG0.b(new C9788y70(this));
        if (a70 == null) {
            InterfaceC8612tw interfaceC8612twB = e().b();
            G10.f(interfaceC8612twB, "getContainingDeclaration(...)");
            if (interfaceC8612twB instanceof InterfaceC4923gl) {
                objH0 = f((InterfaceC4923gl) interfaceC8612twB);
            } else {
                if (!(interfaceC8612twB instanceof InterfaceC1583Mi)) {
                    throw new E80("Unknown type parameter container: " + interfaceC8612twB);
                }
                InterfaceC8612tw interfaceC8612twB2 = ((InterfaceC1583Mi) interfaceC8612twB).b();
                G10.f(interfaceC8612twB2, "getContainingDeclaration(...)");
                if (interfaceC8612twB2 instanceof InterfaceC4923gl) {
                    c4745g60F = f((InterfaceC4923gl) interfaceC8612twB2);
                } else {
                    InterfaceC3086aB interfaceC3086aB = interfaceC8612twB instanceof InterfaceC3086aB ? (InterfaceC3086aB) interfaceC8612twB : null;
                    if (interfaceC3086aB == null) {
                        throw new E80("Non-class callable descriptor must be deserialized: " + interfaceC8612twB);
                    }
                    J50 j50E = X40.e(b(interfaceC3086aB));
                    G10.e(j50E, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
                    c4745g60F = (C4745g60) j50E;
                }
                objH0 = interfaceC8612twB.h0(new C3843cu(c4745g60F), G91.a);
            }
            a70 = (A70) objH0;
        }
        this.D = a70;
    }

    public static final List g(C10067z70 c10067z70) {
        G10.g(c10067z70, "this$0");
        List upperBounds = c10067z70.e().getUpperBounds();
        G10.f(upperBounds, "getUpperBounds(...)");
        List list = upperBounds;
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C9230w70((I80) it.next(), null, 2, null));
        }
        return arrayList;
    }

    public final Class b(InterfaceC3086aB interfaceC3086aB) {
        Class clsD;
        WA waA0 = interfaceC3086aB.a0();
        C5857k50 c5857k50 = waA0 instanceof C5857k50 ? (C5857k50) waA0 : null;
        InterfaceC10072z80 interfaceC10072z80G = c5857k50 != null ? c5857k50.g() : null;
        C3943dG0 c3943dG0 = interfaceC10072z80G instanceof C3943dG0 ? (C3943dG0) interfaceC10072z80G : null;
        if (c3943dG0 != null && (clsD = c3943dG0.d()) != null) {
            return clsD;
        }
        throw new E80("Container of deserialized member is not resolved: " + interfaceC3086aB);
    }

    @Override // com.daaw.InterfaceC5862k60
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Z71 e() {
        return this.B;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10067z70)) {
            return false;
        }
        C10067z70 c10067z70 = (C10067z70) obj;
        return G10.c(this.D, c10067z70.D) && G10.c(getName(), c10067z70.getName());
    }

    public final C4745g60 f(InterfaceC4923gl interfaceC4923gl) {
        Class clsQ = AbstractC8511tb1.q(interfaceC4923gl);
        C4745g60 c4745g60 = (C4745g60) (clsQ != null ? X40.e(clsQ) : null);
        if (c4745g60 != null) {
            return c4745g60;
        }
        throw new E80("Type parameter container is not resolved: " + interfaceC4923gl.b());
    }

    @Override // com.daaw.InterfaceC9509x70
    public String getName() {
        String strC = e().getName().c();
        G10.f(strC, "asString(...)");
        return strC;
    }

    @Override // com.daaw.InterfaceC9509x70
    public List getUpperBounds() {
        Object objC = this.C.c(this, E[0]);
        G10.f(objC, "getValue(...)");
        return (List) objC;
    }

    public int hashCode() {
        return (this.D.hashCode() * 31) + getName().hashCode();
    }

    @Override // com.daaw.InterfaceC9509x70
    public D70 o() {
        int i = a.a[e().o().ordinal()];
        if (i == 1) {
            return D70.B;
        }
        if (i == 2) {
            return D70.C;
        }
        if (i == 3) {
            return D70.D;
        }
        throw new C6902no0();
    }

    public String toString() {
        return AbstractC3910d81.B.a(this);
    }
}
