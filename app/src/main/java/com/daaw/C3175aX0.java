package com.daaw;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.aX0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3175aX0 extends AbstractC4635fj0 {
    public static final /* synthetic */ W60[] f = {AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(C3175aX0.class), "functions", "getFunctions()Ljava/util/List;")), AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(C3175aX0.class), DiagnosticsEntry.Event.PROPERTIES_KEY, "getProperties()Ljava/util/List;"))};
    public final InterfaceC4923gl b;
    public final boolean c;
    public final InterfaceC0881Fo0 d;
    public final InterfaceC0881Fo0 e;

    public C3175aX0(InterfaceC10174zX0 interfaceC10174zX0, InterfaceC4923gl interfaceC4923gl, boolean z) {
        G10.g(interfaceC10174zX0, "storageManager");
        G10.g(interfaceC4923gl, "containingClass");
        this.b = interfaceC4923gl;
        this.c = z;
        interfaceC4923gl.i();
        EnumC6886nl enumC6886nl = EnumC6886nl.C;
        this.d = interfaceC10174zX0.h(new YW0(this));
        this.e = interfaceC10174zX0.h(new ZW0(this));
    }

    public static final List j(C3175aX0 c3175aX0) {
        G10.g(c3175aX0, "this$0");
        return AbstractC1599Mm.n(AbstractC1444Kz.g(c3175aX0.b), AbstractC1444Kz.h(c3175aX0.b));
    }

    public static final List p(C3175aX0 c3175aX0) {
        G10.g(c3175aX0, "this$0");
        return c3175aX0.c ? AbstractC1599Mm.o(AbstractC1444Kz.f(c3175aX0.b)) : AbstractC1599Mm.k();
    }

    @Override // com.daaw.AbstractC4635fj0, com.daaw.InterfaceC4346ej0
    public Collection a(C2352Tm0 c2352Tm0, InterfaceC7689qe0 interfaceC7689qe0) {
        G10.g(c2352Tm0, "name");
        G10.g(interfaceC7689qe0, "location");
        List listO = o();
        UT0 ut0 = new UT0();
        for (Object obj : listO) {
            if (G10.c(((InterfaceC4476fA0) obj).getName(), c2352Tm0)) {
                ut0.add(obj);
            }
        }
        return ut0;
    }

    @Override // com.daaw.AbstractC4635fj0, com.daaw.FI0
    public /* bridge */ /* synthetic */ InterfaceC10240zl g(C2352Tm0 c2352Tm0, InterfaceC7689qe0 interfaceC7689qe0) {
        return (InterfaceC10240zl) k(c2352Tm0, interfaceC7689qe0);
    }

    public Void k(C2352Tm0 c2352Tm0, InterfaceC7689qe0 interfaceC7689qe0) {
        G10.g(c2352Tm0, "name");
        G10.g(interfaceC7689qe0, "location");
        return null;
    }

    @Override // com.daaw.AbstractC4635fj0, com.daaw.FI0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public List f(C1651Mz c1651Mz, NQ nq) {
        G10.g(c1651Mz, "kindFilter");
        G10.g(nq, "nameFilter");
        return AbstractC2455Um.z0(n(), o());
    }

    @Override // com.daaw.AbstractC4635fj0, com.daaw.InterfaceC4346ej0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public UT0 c(C2352Tm0 c2352Tm0, InterfaceC7689qe0 interfaceC7689qe0) {
        G10.g(c2352Tm0, "name");
        G10.g(interfaceC7689qe0, "location");
        List listN = n();
        UT0 ut0 = new UT0();
        for (Object obj : listN) {
            if (G10.c(((IS0) obj).getName(), c2352Tm0)) {
                ut0.add(obj);
            }
        }
        return ut0;
    }

    public final List n() {
        return (List) AbstractC9895yX0.a(this.d, this, f[0]);
    }

    public final List o() {
        return (List) AbstractC9895yX0.a(this.e, this, f[1]);
    }
}
