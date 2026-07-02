package com.daaw;

import com.daaw.AbstractC1864Pa0;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Wa0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2616Wa0 extends AbstractC1864Pa0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2616Wa0(C0504Ca0 c0504Ca0) {
        super(c0504Ca0, null, 2, 0 == true ? 1 : 0);
        G10.g(c0504Ca0, "c");
    }

    @Override // com.daaw.AbstractC1864Pa0
    public void C(C2352Tm0 c2352Tm0, Collection collection) {
        G10.g(c2352Tm0, "name");
        G10.g(collection, "result");
    }

    @Override // com.daaw.AbstractC1864Pa0
    public RE0 O() {
        return null;
    }

    @Override // com.daaw.AbstractC1864Pa0
    public AbstractC1864Pa0.a Y(InterfaceC3605c30 interfaceC3605c30, List list, I80 i80, List list2) {
        G10.g(interfaceC3605c30, "method");
        G10.g(list, "methodTypeParameters");
        G10.g(i80, "returnType");
        G10.g(list2, "valueParameters");
        return new AbstractC1864Pa0.a(i80, null, list2, list, false, AbstractC1599Mm.k());
    }
}
