package com.daaw;

import com.daaw.InterfaceC4346ej0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.fb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C4595fb0 extends AbstractC8898uw implements InterfaceC5516is0 {
    public static final /* synthetic */ W60[] I = {AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(C4595fb0.class), "fragments", "getFragments()Ljava/util/List;")), AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(C4595fb0.class), "empty", "getEmpty()Z"))};
    public final C3799cl0 D;
    public final AP E;
    public final InterfaceC0881Fo0 F;
    public final InterfaceC0881Fo0 G;
    public final InterfaceC4346ej0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4595fb0(C3799cl0 c3799cl0, AP ap, InterfaceC10174zX0 interfaceC10174zX0) {
        super(InterfaceC3072a8.b.b(), ap.h());
        G10.g(c3799cl0, "module");
        G10.g(ap, "fqName");
        G10.g(interfaceC10174zX0, "storageManager");
        this.D = c3799cl0;
        this.E = ap;
        this.F = interfaceC10174zX0.h(new C3749cb0(this));
        this.G = interfaceC10174zX0.h(new C4028db0(this));
        this.H = new C5153hb0(interfaceC10174zX0, new C4306eb0(this));
    }

    public static final boolean L0(C4595fb0 c4595fb0) {
        G10.g(c4595fb0, "this$0");
        return AbstractC2996Zr0.b(c4595fb0.t0().M0(), c4595fb0.d());
    }

    public static final List M0(C4595fb0 c4595fb0) {
        G10.g(c4595fb0, "this$0");
        return AbstractC2996Zr0.c(c4595fb0.t0().M0(), c4595fb0.d());
    }

    public static final InterfaceC4346ej0 Q0(C4595fb0 c4595fb0) {
        G10.g(c4595fb0, "this$0");
        if (c4595fb0.isEmpty()) {
            return InterfaceC4346ej0.b.b;
        }
        List listG = c4595fb0.G();
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(listG, 10));
        Iterator it = listG.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC2372Tr0) it.next()).q());
        }
        List listA0 = AbstractC2455Um.A0(arrayList, new ZY0(c4595fb0.t0(), c4595fb0.d()));
        return C2859Yj.d.a("package view scope for " + c4595fb0.d() + " in " + c4595fb0.t0().getName(), listA0);
    }

    @Override // com.daaw.InterfaceC5516is0
    public List G() {
        return (List) AbstractC9895yX0.a(this.F, this, I[0]);
    }

    @Override // com.daaw.InterfaceC8612tw
    /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] */
    public InterfaceC5516is0 b() {
        if (d().d()) {
            return null;
        }
        C3799cl0 c3799cl0T0 = t0();
        AP apE = d().e();
        G10.f(apE, "parent(...)");
        return c3799cl0T0.r0(apE);
    }

    public final boolean O0() {
        return ((Boolean) AbstractC9895yX0.a(this.G, this, I[1])).booleanValue();
    }

    @Override // com.daaw.InterfaceC5516is0
    /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
    public C3799cl0 t0() {
        return this.D;
    }

    @Override // com.daaw.InterfaceC5516is0
    public AP d() {
        return this.E;
    }

    public boolean equals(Object obj) {
        InterfaceC5516is0 interfaceC5516is0 = obj instanceof InterfaceC5516is0 ? (InterfaceC5516is0) obj : null;
        return interfaceC5516is0 != null && G10.c(d(), interfaceC5516is0.d()) && G10.c(t0(), interfaceC5516is0.t0());
    }

    @Override // com.daaw.InterfaceC8612tw
    public Object h0(InterfaceC9735xw interfaceC9735xw, Object obj) {
        G10.g(interfaceC9735xw, "visitor");
        return interfaceC9735xw.k(this, obj);
    }

    public int hashCode() {
        return (t0().hashCode() * 31) + d().hashCode();
    }

    @Override // com.daaw.InterfaceC5516is0
    public boolean isEmpty() {
        return O0();
    }

    @Override // com.daaw.InterfaceC5516is0
    public InterfaceC4346ej0 q() {
        return this.H;
    }
}
