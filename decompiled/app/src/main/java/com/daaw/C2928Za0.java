package com.daaw;

import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Za0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2928Za0 implements InterfaceC4188e81 {
    public final C0504Ca0 a;
    public final InterfaceC8612tw b;
    public final int c;
    public final Map d;
    public final InterfaceC5752jj0 e;

    public C2928Za0(C0504Ca0 c0504Ca0, InterfaceC8612tw interfaceC8612tw, H30 h30, int i) {
        G10.g(c0504Ca0, "c");
        G10.g(interfaceC8612tw, "containingDeclaration");
        G10.g(h30, "typeParameterOwner");
        this.a = c0504Ca0;
        this.b = interfaceC8612tw;
        this.c = i;
        this.d = AbstractC1392Km.d(h30.getTypeParameters());
        this.e = c0504Ca0.e().b(new C2824Ya0(this));
    }

    public static final C2720Xa0 c(C2928Za0 c2928Za0, G30 g30) {
        G10.g(c2928Za0, "this$0");
        G10.g(g30, "typeParameter");
        Integer num = (Integer) c2928Za0.d.get(g30);
        if (num == null) {
            return null;
        }
        return new C2720Xa0(AbstractC10275zs.k(AbstractC10275zs.d(c2928Za0.a, c2928Za0), c2928Za0.b.getAnnotations()), g30, c2928Za0.c + num.intValue(), c2928Za0.b);
    }

    @Override // com.daaw.InterfaceC4188e81
    public Z71 a(G30 g30) {
        G10.g(g30, "javaTypeParameter");
        C2720Xa0 c2720Xa0 = (C2720Xa0) this.e.invoke(g30);
        return c2720Xa0 != null ? c2720Xa0 : this.a.f().a(g30);
    }
}
