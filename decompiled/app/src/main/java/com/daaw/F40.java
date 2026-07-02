package com.daaw;

import com.daaw.C6607ml;
import com.daaw.YV0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class F40 implements InterfaceC5480il {
    public static final C2352Tm0 g;
    public static final C6607ml h;
    public final InterfaceC2968Zk0 a;
    public final NQ b;
    public final InterfaceC0881Fo0 c;
    public static final /* synthetic */ W60[] e = {AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(F40.class), "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"))};
    public static final a d = new a(null);
    public static final AP f = YV0.A;

    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final C6607ml a() {
            return F40.h;
        }

        public a() {
        }
    }

    static {
        BP bp = YV0.a.d;
        C2352Tm0 c2352Tm0I = bp.i();
        G10.f(c2352Tm0I, "shortName(...)");
        g = c2352Tm0I;
        C6607ml.a aVar = C6607ml.d;
        AP apL = bp.l();
        G10.f(apL, "toSafe(...)");
        h = aVar.c(apL);
    }

    public F40(InterfaceC10174zX0 interfaceC10174zX0, InterfaceC2968Zk0 interfaceC2968Zk0, NQ nq) {
        G10.g(interfaceC10174zX0, "storageManager");
        G10.g(interfaceC2968Zk0, "moduleDescriptor");
        G10.g(nq, "computeContainingDeclaration");
        this.a = interfaceC2968Zk0;
        this.b = nq;
        this.c = interfaceC10174zX0.h(new D40(this, interfaceC10174zX0));
    }

    public static final InterfaceC0748Eh d(InterfaceC2968Zk0 interfaceC2968Zk0) {
        G10.g(interfaceC2968Zk0, "module");
        List listG = interfaceC2968Zk0.r0(f).G();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listG) {
            if (obj instanceof InterfaceC0748Eh) {
                arrayList.add(obj);
            }
        }
        return (InterfaceC0748Eh) AbstractC2455Um.e0(arrayList);
    }

    public static final C5761jl h(F40 f40, InterfaceC10174zX0 interfaceC10174zX0) {
        G10.g(f40, "this$0");
        G10.g(interfaceC10174zX0, "$storageManager");
        C5761jl c5761jl = new C5761jl((InterfaceC8612tw) f40.b.invoke(f40.a), g, EnumC0336Ak0.F, EnumC6886nl.D, AbstractC1496Lm.e(f40.a.p().i()), RU0.a, false, interfaceC10174zX0);
        c5761jl.K0(new C6612mm(interfaceC10174zX0, c5761jl), AbstractC9867yQ0.d(), null);
        return c5761jl;
    }

    @Override // com.daaw.InterfaceC5480il
    public InterfaceC4923gl a(C6607ml c6607ml) {
        G10.g(c6607ml, "classId");
        if (G10.c(c6607ml, h)) {
            return i();
        }
        return null;
    }

    @Override // com.daaw.InterfaceC5480il
    public boolean b(AP ap, C2352Tm0 c2352Tm0) {
        G10.g(ap, "packageFqName");
        G10.g(c2352Tm0, "name");
        return G10.c(c2352Tm0, g) && G10.c(ap, f);
    }

    @Override // com.daaw.InterfaceC5480il
    public Collection c(AP ap) {
        G10.g(ap, "packageFqName");
        return G10.c(ap, f) ? AbstractC9588xQ0.c(i()) : AbstractC9867yQ0.d();
    }

    public final C5761jl i() {
        return (C5761jl) AbstractC9895yX0.a(this.c, this, e[0]);
    }

    public /* synthetic */ F40(InterfaceC10174zX0 interfaceC10174zX0, InterfaceC2968Zk0 interfaceC2968Zk0, NQ nq, int i, AbstractC2911Yw abstractC2911Yw) {
        this(interfaceC10174zX0, interfaceC2968Zk0, (i & 4) != 0 ? E40.B : nq);
    }
}
