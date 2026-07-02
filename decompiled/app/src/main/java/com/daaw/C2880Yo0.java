package com.daaw;

import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Yo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2880Yo0 implements InterfaceC2672Wo0 {
    public final Map b;
    public final C9085vd0 c;
    public final InterfaceC5752jj0 d;

    public C2880Yo0(Map map) {
        G10.g(map, "states");
        this.b = map;
        C9085vd0 c9085vd0 = new C9085vd0("Java nullability annotation states");
        this.c = c9085vd0;
        InterfaceC5752jj0 interfaceC5752jj0B = c9085vd0.b(new C2776Xo0(this));
        G10.f(interfaceC5752jj0B, "createMemoizedFunctionWithNullableValues(...)");
        this.d = interfaceC5752jj0B;
    }

    public static final Object c(C2880Yo0 c2880Yo0, AP ap) {
        G10.g(c2880Yo0, "this$0");
        G10.d(ap);
        return CP.a(ap, c2880Yo0.b);
    }

    @Override // com.daaw.InterfaceC2672Wo0
    public Object a(AP ap) {
        G10.g(ap, "fqName");
        return this.d.invoke(ap);
    }
}
