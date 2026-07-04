package com.daaw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.zc1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C10197zc1 extends AbstractC0730Ec1 implements InterfaceC9918yc1 {
    public static final a M = new a(null);
    public final int G;
    public final boolean H;
    public final boolean I;
    public final boolean J;
    public final I80 K;
    public final InterfaceC9918yc1 L;

    /* JADX INFO: renamed from: com.daaw.zc1$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final C10197zc1 a(InterfaceC1376Ki interfaceC1376Ki, InterfaceC9918yc1 interfaceC9918yc1, int i, InterfaceC3072a8 interfaceC3072a8, C2352Tm0 c2352Tm0, I80 i80, boolean z, boolean z2, boolean z3, I80 i802, RU0 ru0, LQ lq) {
            G10.g(interfaceC1376Ki, "containingDeclaration");
            G10.g(interfaceC3072a8, "annotations");
            G10.g(c2352Tm0, "name");
            G10.g(i80, "outType");
            G10.g(ru0, "source");
            return lq == null ? new C10197zc1(interfaceC1376Ki, interfaceC9918yc1, i, interfaceC3072a8, c2352Tm0, i80, z, z2, z3, i802, ru0) : new b(interfaceC1376Ki, interfaceC9918yc1, i, interfaceC3072a8, c2352Tm0, i80, z, z2, z3, i802, ru0, lq);
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: com.daaw.zc1$b */
    public static final class b extends C10197zc1 {
        public final O90 N;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC1376Ki interfaceC1376Ki, InterfaceC9918yc1 interfaceC9918yc1, int i, InterfaceC3072a8 interfaceC3072a8, C2352Tm0 c2352Tm0, I80 i80, boolean z, boolean z2, boolean z3, I80 i802, RU0 ru0, LQ lq) {
            super(interfaceC1376Ki, interfaceC9918yc1, i, interfaceC3072a8, c2352Tm0, i80, z, z2, z3, i802, ru0);
            G10.g(interfaceC1376Ki, "containingDeclaration");
            G10.g(interfaceC3072a8, "annotations");
            G10.g(c2352Tm0, "name");
            G10.g(i80, "outType");
            G10.g(ru0, "source");
            G10.g(lq, "destructuringVariables");
            this.N = AbstractC3192ab0.a(lq);
        }

        public static final List O0(b bVar) {
            G10.g(bVar, "this$0");
            return bVar.P0();
        }

        public final List P0() {
            return (List) this.N.getValue();
        }

        @Override // com.daaw.C10197zc1, com.daaw.InterfaceC9918yc1
        public InterfaceC9918yc1 W(InterfaceC1376Ki interfaceC1376Ki, C2352Tm0 c2352Tm0, int i) {
            G10.g(interfaceC1376Ki, "newOwner");
            G10.g(c2352Tm0, "newName");
            InterfaceC3072a8 annotations = getAnnotations();
            G10.f(annotations, "<get-annotations>(...)");
            I80 type = getType();
            G10.f(type, "getType(...)");
            boolean zS0 = s0();
            boolean Z = Z();
            boolean zV = V();
            I80 i80G0 = g0();
            RU0 ru0 = RU0.a;
            G10.f(ru0, "NO_SOURCE");
            return new b(interfaceC1376Ki, null, i, annotations, c2352Tm0, type, zS0, Z, zV, i80G0, ru0, new C0305Ac1(this));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10197zc1(InterfaceC1376Ki interfaceC1376Ki, InterfaceC9918yc1 interfaceC9918yc1, int i, InterfaceC3072a8 interfaceC3072a8, C2352Tm0 c2352Tm0, I80 i80, boolean z, boolean z2, boolean z3, I80 i802, RU0 ru0) {
        super(interfaceC1376Ki, interfaceC3072a8, c2352Tm0, i80, ru0);
        G10.g(interfaceC1376Ki, "containingDeclaration");
        G10.g(interfaceC3072a8, "annotations");
        G10.g(c2352Tm0, "name");
        G10.g(i80, "outType");
        G10.g(ru0, "source");
        this.G = i;
        this.H = z;
        this.I = z2;
        this.J = z3;
        this.K = i802;
        this.L = interfaceC9918yc1 == null ? this : interfaceC9918yc1;
    }

    public static final C10197zc1 K0(InterfaceC1376Ki interfaceC1376Ki, InterfaceC9918yc1 interfaceC9918yc1, int i, InterfaceC3072a8 interfaceC3072a8, C2352Tm0 c2352Tm0, I80 i80, boolean z, boolean z2, boolean z3, I80 i802, RU0 ru0, LQ lq) {
        return M.a(interfaceC1376Ki, interfaceC9918yc1, i, interfaceC3072a8, c2352Tm0, i80, z, z2, z3, i802, ru0, lq);
    }

    public Void L0() {
        return null;
    }

    @Override // com.daaw.InterfaceC4297eZ0
    /* JADX INFO: renamed from: M0, reason: merged with bridge method [inline-methods] */
    public InterfaceC9918yc1 c(C8957v81 c8957v81) {
        G10.g(c8957v81, "substitutor");
        if (c8957v81.k()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    @Override // com.daaw.InterfaceC0626Dc1
    public /* bridge */ /* synthetic */ AbstractC2887Yq T() {
        return (AbstractC2887Yq) L0();
    }

    @Override // com.daaw.InterfaceC9918yc1
    public boolean V() {
        return this.J;
    }

    @Override // com.daaw.InterfaceC9918yc1
    public InterfaceC9918yc1 W(InterfaceC1376Ki interfaceC1376Ki, C2352Tm0 c2352Tm0, int i) {
        G10.g(interfaceC1376Ki, "newOwner");
        G10.g(c2352Tm0, "newName");
        InterfaceC3072a8 annotations = getAnnotations();
        G10.f(annotations, "<get-annotations>(...)");
        I80 type = getType();
        G10.f(type, "getType(...)");
        boolean zS0 = s0();
        boolean Z = Z();
        boolean zV = V();
        I80 i80G0 = g0();
        RU0 ru0 = RU0.a;
        G10.f(ru0, "NO_SOURCE");
        return new C10197zc1(interfaceC1376Ki, null, i, annotations, c2352Tm0, type, zS0, Z, zV, i80G0, ru0);
    }

    @Override // com.daaw.InterfaceC9918yc1
    public boolean Z() {
        return this.I;
    }

    @Override // com.daaw.InterfaceC1376Ki
    public Collection e() {
        Collection collectionE = b().e();
        G10.f(collectionE, "getOverriddenDescriptors(...)");
        Collection collection = collectionE;
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((InterfaceC9918yc1) ((InterfaceC1376Ki) it.next()).h().get(getIndex()));
        }
        return arrayList;
    }

    @Override // com.daaw.InterfaceC0626Dc1
    public boolean f0() {
        return false;
    }

    @Override // com.daaw.InterfaceC9918yc1
    public I80 g0() {
        return this.K;
    }

    @Override // com.daaw.InterfaceC9918yc1
    public int getIndex() {
        return this.G;
    }

    @Override // com.daaw.InterfaceC0383Aw
    public AbstractC8965vA getVisibility() {
        AbstractC8965vA abstractC8965vA = AbstractC8679uA.f;
        G10.f(abstractC8965vA, "LOCAL");
        return abstractC8965vA;
    }

    @Override // com.daaw.InterfaceC8612tw
    public Object h0(InterfaceC9735xw interfaceC9735xw, Object obj) {
        G10.g(interfaceC9735xw, "visitor");
        return interfaceC9735xw.g(this, obj);
    }

    @Override // com.daaw.InterfaceC9918yc1
    public boolean s0() {
        if (!this.H) {
            return false;
        }
        InterfaceC1376Ki interfaceC1376KiB = b();
        G10.e(interfaceC1376KiB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableMemberDescriptor");
        return ((InterfaceC1583Mi) interfaceC1376KiB).i().a();
    }

    @Override // com.daaw.AbstractC9456ww, com.daaw.InterfaceC8612tw
    public InterfaceC1376Ki b() {
        InterfaceC8612tw interfaceC8612twB = super.b();
        G10.e(interfaceC8612twB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        return (InterfaceC1376Ki) interfaceC8612twB;
    }

    @Override // com.daaw.AbstractC9456ww
    public InterfaceC9918yc1 a() {
        InterfaceC9918yc1 interfaceC9918yc1 = this.L;
        return interfaceC9918yc1 == this ? this : interfaceC9918yc1.a();
    }
}
