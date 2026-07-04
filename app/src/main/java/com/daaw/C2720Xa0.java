package com.daaw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Xa0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2720Xa0 extends I {
    public final C0504Ca0 L;
    public final G30 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2720Xa0(C0504Ca0 c0504Ca0, G30 g30, int i, InterfaceC8612tw interfaceC8612tw) {
        super(c0504Ca0.e(), interfaceC8612tw, new C3466ba0(c0504Ca0, g30, false, 4, null), g30.getName(), EnumC1042Hc1.F, false, i, RU0.a, c0504Ca0.a().v());
        G10.g(c0504Ca0, "c");
        G10.g(g30, "javaTypeParameter");
        G10.g(interfaceC8612tw, "containingDeclaration");
        this.L = c0504Ca0;
        this.M = g30;
    }

    @Override // com.daaw.X0
    public List F0(List list) {
        G10.g(list, "bounds");
        return this.L.a().r().r(this, list, this.L);
    }

    @Override // com.daaw.X0
    public void K0(I80 i80) {
        G10.g(i80, "type");
    }

    @Override // com.daaw.X0
    public List L0() {
        return M0();
    }

    public final List M0() {
        Collection upperBounds = this.M.getUpperBounds();
        if (upperBounds.isEmpty()) {
            YS0 ys0I = this.L.d().p().i();
            G10.f(ys0I, "getAnyType(...)");
            YS0 ys0I2 = this.L.d().p().I();
            G10.f(ys0I2, "getNullableAnyType(...)");
            return AbstractC1496Lm.e(M80.e(ys0I, ys0I2));
        }
        Collection collection = upperBounds;
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(this.L.g().p((L20) it.next(), C30.b(C81.C, false, false, this, 3, null)));
        }
        return arrayList;
    }
}
