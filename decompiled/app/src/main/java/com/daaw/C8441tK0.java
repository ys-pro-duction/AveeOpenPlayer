package com.daaw;

import java.util.List;

/* JADX INFO: renamed from: com.daaw.tK0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C8441tK0 implements InterfaceC8993vH {
    public static final C8441tK0 b = new C8441tK0();

    @Override // com.daaw.InterfaceC8993vH
    public void a(InterfaceC1583Mi interfaceC1583Mi) {
        G10.g(interfaceC1583Mi, "descriptor");
        throw new IllegalStateException("Cannot infer visibility for " + interfaceC1583Mi);
    }

    @Override // com.daaw.InterfaceC8993vH
    public void b(InterfaceC4923gl interfaceC4923gl, List list) {
        G10.g(interfaceC4923gl, "descriptor");
        G10.g(list, "unresolvedSuperClasses");
        throw new IllegalStateException("Incomplete hierarchy for class " + interfaceC4923gl.getName() + ", unresolved classes " + list);
    }
}
