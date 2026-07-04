package com.daaw;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5831k0 implements InterfaceC4346ej0 {
    @Override // com.daaw.InterfaceC4346ej0
    public Collection a(C2352Tm0 c2352Tm0, InterfaceC7689qe0 interfaceC7689qe0) {
        G10.g(c2352Tm0, "name");
        G10.g(interfaceC7689qe0, "location");
        return i().a(c2352Tm0, interfaceC7689qe0);
    }

    @Override // com.daaw.InterfaceC4346ej0
    public Set b() {
        return i().b();
    }

    @Override // com.daaw.InterfaceC4346ej0
    public Collection c(C2352Tm0 c2352Tm0, InterfaceC7689qe0 interfaceC7689qe0) {
        G10.g(c2352Tm0, "name");
        G10.g(interfaceC7689qe0, "location");
        return i().c(c2352Tm0, interfaceC7689qe0);
    }

    @Override // com.daaw.InterfaceC4346ej0
    public Set d() {
        return i().d();
    }

    @Override // com.daaw.InterfaceC4346ej0
    public Set e() {
        return i().e();
    }

    @Override // com.daaw.FI0
    public Collection f(C1651Mz c1651Mz, NQ nq) {
        G10.g(c1651Mz, "kindFilter");
        G10.g(nq, "nameFilter");
        return i().f(c1651Mz, nq);
    }

    @Override // com.daaw.FI0
    public InterfaceC10240zl g(C2352Tm0 c2352Tm0, InterfaceC7689qe0 interfaceC7689qe0) {
        G10.g(c2352Tm0, "name");
        G10.g(interfaceC7689qe0, "location");
        return i().g(c2352Tm0, interfaceC7689qe0);
    }

    public final InterfaceC4346ej0 h() {
        if (!(i() instanceof AbstractC5831k0)) {
            return i();
        }
        InterfaceC4346ej0 interfaceC4346ej0I = i();
        G10.e(interfaceC4346ej0I, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter");
        return ((AbstractC5831k0) interfaceC4346ej0I).h();
    }

    public abstract InterfaceC4346ej0 i();
}
