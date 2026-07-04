package com.daaw;

import com.daaw.InterfaceC2968Zk0;
import com.daaw.InterfaceC5797js0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.cl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3799cl0 extends AbstractC8898uw implements InterfaceC2968Zk0 {
    public final InterfaceC10174zX0 D;
    public final AbstractC8670u80 E;
    public final C2352Tm0 F;
    public final Map G;
    public final InterfaceC5797js0 H;
    public InterfaceC2760Xk0 I;
    public InterfaceC2580Vr0 J;
    public boolean K;
    public final InterfaceC5471ij0 L;
    public final O90 M;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3799cl0(C2352Tm0 c2352Tm0, InterfaceC10174zX0 interfaceC10174zX0, AbstractC8670u80 abstractC8670u80, AbstractC6126l11 abstractC6126l11) {
        this(c2352Tm0, interfaceC10174zX0, abstractC8670u80, abstractC6126l11, null, null, 48, null);
        G10.g(c2352Tm0, "moduleName");
        G10.g(interfaceC10174zX0, "storageManager");
        G10.g(abstractC8670u80, "builtIns");
    }

    private final boolean P0() {
        return this.J != null;
    }

    public static final C0459Bp R0(C3799cl0 c3799cl0) {
        G10.g(c3799cl0, "this$0");
        InterfaceC2760Xk0 interfaceC2760Xk0 = c3799cl0.I;
        if (interfaceC2760Xk0 == null) {
            throw new AssertionError("Dependencies of module " + c3799cl0.L0() + " were not set before querying module content");
        }
        List listA = interfaceC2760Xk0.a();
        c3799cl0.K0();
        listA.contains(c3799cl0);
        List list = listA;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C3799cl0) it.next()).P0();
        }
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            InterfaceC2580Vr0 interfaceC2580Vr0 = ((C3799cl0) it2.next()).J;
            G10.d(interfaceC2580Vr0);
            arrayList.add(interfaceC2580Vr0);
        }
        return new C0459Bp(arrayList, "CompositeProvider@ModuleDescriptor for " + c3799cl0.getName());
    }

    public static final InterfaceC5516is0 S0(C3799cl0 c3799cl0, AP ap) {
        G10.g(c3799cl0, "this$0");
        G10.g(ap, "fqName");
        return c3799cl0.H.a(c3799cl0, ap, c3799cl0.D);
    }

    public void K0() {
        if (Q0()) {
            return;
        }
        O10.a(this);
    }

    public final String L0() {
        String string = getName().toString();
        G10.f(string, "toString(...)");
        return string;
    }

    public final InterfaceC2580Vr0 M0() {
        K0();
        return N0();
    }

    public final C0459Bp N0() {
        return (C0459Bp) this.M.getValue();
    }

    public final void O0(InterfaceC2580Vr0 interfaceC2580Vr0) {
        G10.g(interfaceC2580Vr0, "providerForModuleContent");
        P0();
        this.J = interfaceC2580Vr0;
    }

    public boolean Q0() {
        return this.K;
    }

    public final void T0(InterfaceC2760Xk0 interfaceC2760Xk0) {
        G10.g(interfaceC2760Xk0, "dependencies");
        this.I = interfaceC2760Xk0;
    }

    public final void U0(List list) {
        G10.g(list, "descriptors");
        V0(list, AbstractC9867yQ0.d());
    }

    public final void V0(List list, Set set) {
        G10.g(list, "descriptors");
        G10.g(set, "friends");
        T0(new C2864Yk0(list, set, AbstractC1599Mm.k(), AbstractC9867yQ0.d()));
    }

    public final void W0(C3799cl0... c3799cl0Arr) {
        G10.g(c3799cl0Arr, "descriptors");
        U0(AbstractC5431ib.h0(c3799cl0Arr));
    }

    @Override // com.daaw.InterfaceC8612tw
    public InterfaceC8612tw b() {
        return InterfaceC2968Zk0.a.b(this);
    }

    @Override // com.daaw.InterfaceC8612tw
    public Object h0(InterfaceC9735xw interfaceC9735xw, Object obj) {
        return InterfaceC2968Zk0.a.a(this, interfaceC9735xw, obj);
    }

    @Override // com.daaw.InterfaceC2968Zk0
    public boolean j0(InterfaceC2968Zk0 interfaceC2968Zk0) {
        G10.g(interfaceC2968Zk0, "targetModule");
        if (G10.c(this, interfaceC2968Zk0)) {
            return true;
        }
        InterfaceC2760Xk0 interfaceC2760Xk0 = this.I;
        G10.d(interfaceC2760Xk0);
        return AbstractC2455Um.W(interfaceC2760Xk0.b(), interfaceC2968Zk0) || q0().contains(interfaceC2968Zk0) || interfaceC2968Zk0.q0().contains(this);
    }

    @Override // com.daaw.InterfaceC2968Zk0
    public AbstractC8670u80 p() {
        return this.E;
    }

    @Override // com.daaw.InterfaceC2968Zk0
    public List q0() {
        InterfaceC2760Xk0 interfaceC2760Xk0 = this.I;
        if (interfaceC2760Xk0 != null) {
            return interfaceC2760Xk0.c();
        }
        throw new AssertionError("Dependencies of module " + L0() + " were not set");
    }

    @Override // com.daaw.InterfaceC2968Zk0
    public InterfaceC5516is0 r0(AP ap) {
        G10.g(ap, "fqName");
        K0();
        return (InterfaceC5516is0) this.L.invoke(ap);
    }

    @Override // com.daaw.AbstractC8898uw
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        if (!Q0()) {
            sb.append(" !isValid");
        }
        sb.append(" packageFragmentProvider: ");
        InterfaceC2580Vr0 interfaceC2580Vr0 = this.J;
        sb.append(interfaceC2580Vr0 != null ? interfaceC2580Vr0.getClass().getSimpleName() : null);
        String string = sb.toString();
        G10.f(string, "toString(...)");
        return string;
    }

    @Override // com.daaw.InterfaceC2968Zk0
    public Collection u(AP ap, NQ nq) {
        G10.g(ap, "fqName");
        G10.g(nq, "nameFilter");
        K0();
        return M0().u(ap, nq);
    }

    @Override // com.daaw.InterfaceC2968Zk0
    public Object z0(C2448Uk0 c2448Uk0) {
        G10.g(c2448Uk0, "capability");
        Object obj = this.G.get(c2448Uk0);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    public /* synthetic */ C3799cl0(C2352Tm0 c2352Tm0, InterfaceC10174zX0 interfaceC10174zX0, AbstractC8670u80 abstractC8670u80, AbstractC6126l11 abstractC6126l11, Map map, C2352Tm0 c2352Tm02, int i, AbstractC2911Yw abstractC2911Yw) {
        this(c2352Tm0, interfaceC10174zX0, abstractC8670u80, (i & 8) != 0 ? null : abstractC6126l11, (i & 16) != 0 ? AbstractC1473Lg0.h() : map, (i & 32) != 0 ? null : c2352Tm02);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3799cl0(C2352Tm0 c2352Tm0, InterfaceC10174zX0 interfaceC10174zX0, AbstractC8670u80 abstractC8670u80, AbstractC6126l11 abstractC6126l11, Map map, C2352Tm0 c2352Tm02) {
        super(InterfaceC3072a8.b.b(), c2352Tm0);
        G10.g(c2352Tm0, "moduleName");
        G10.g(interfaceC10174zX0, "storageManager");
        G10.g(abstractC8670u80, "builtIns");
        G10.g(map, "capabilities");
        this.D = interfaceC10174zX0;
        this.E = abstractC8670u80;
        this.F = c2352Tm02;
        if (c2352Tm0.m()) {
            this.G = map;
            InterfaceC5797js0 interfaceC5797js0 = (InterfaceC5797js0) z0(InterfaceC5797js0.a.a());
            this.H = interfaceC5797js0 == null ? InterfaceC5797js0.b.b : interfaceC5797js0;
            this.K = true;
            this.L = interfaceC10174zX0.g(new C3242al0(this));
            this.M = AbstractC3192ab0.a(new C3521bl0(this));
            return;
        }
        throw new IllegalArgumentException("Module name must be special: " + c2352Tm0);
    }
}
