package com.daaw;

import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.Yk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2864Yk0 implements InterfaceC2760Xk0 {
    public final List a;
    public final Set b;
    public final List c;
    public final Set d;

    public C2864Yk0(List list, Set set, List list2, Set set2) {
        G10.g(list, "allDependencies");
        G10.g(set, "modulesWhoseInternalsAreVisible");
        G10.g(list2, "directExpectedByDependencies");
        G10.g(set2, "allExpectedByDependencies");
        this.a = list;
        this.b = set;
        this.c = list2;
        this.d = set2;
    }

    @Override // com.daaw.InterfaceC2760Xk0
    public List a() {
        return this.a;
    }

    @Override // com.daaw.InterfaceC2760Xk0
    public Set b() {
        return this.b;
    }

    @Override // com.daaw.InterfaceC2760Xk0
    public List c() {
        return this.c;
    }
}
