package com.daaw;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class D43 extends F43 {
    public /* synthetic */ D43(C43 c43) {
        super(null);
    }

    @Override // com.daaw.F43
    public final List a(Object obj, long j) {
        InterfaceC8095s43 interfaceC8095s43 = (InterfaceC8095s43) K53.p(obj, j);
        if (interfaceC8095s43.zzc()) {
            return interfaceC8095s43;
        }
        int size = interfaceC8095s43.size();
        InterfaceC8095s43 interfaceC8095s43F = interfaceC8095s43.f(size == 0 ? 10 : size + size);
        K53.D(obj, j, interfaceC8095s43F);
        return interfaceC8095s43F;
    }

    @Override // com.daaw.F43
    public final void b(Object obj, long j) {
        ((InterfaceC8095s43) K53.p(obj, j)).zzb();
    }

    @Override // com.daaw.F43
    public final void c(Object obj, Object obj2, long j) {
        InterfaceC8095s43 interfaceC8095s43F = (InterfaceC8095s43) K53.p(obj, j);
        InterfaceC8095s43 interfaceC8095s43 = (InterfaceC8095s43) K53.p(obj2, j);
        int size = interfaceC8095s43F.size();
        int size2 = interfaceC8095s43.size();
        if (size > 0 && size2 > 0) {
            if (!interfaceC8095s43F.zzc()) {
                interfaceC8095s43F = interfaceC8095s43F.f(size2 + size);
            }
            interfaceC8095s43F.addAll(interfaceC8095s43);
        }
        if (size > 0) {
            interfaceC8095s43 = interfaceC8095s43F;
        }
        K53.D(obj, j, interfaceC8095s43);
    }
}
