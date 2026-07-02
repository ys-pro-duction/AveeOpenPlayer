package com.daaw;

import com.daaw.C7867rG0;
import com.daaw.InterfaceC0543Ck;

/* JADX INFO: loaded from: classes4.dex */
public final class Z10 implements InterfaceC0543Ck {
    public static final Z10 a = new Z10();
    public static final String b = "second parameter must be of type KProperty<*> or its supertype";

    @Override // com.daaw.InterfaceC0543Ck
    public String a(InterfaceC8468tR interfaceC8468tR) {
        return InterfaceC0543Ck.a.a(this, interfaceC8468tR);
    }

    @Override // com.daaw.InterfaceC0543Ck
    public boolean b(InterfaceC8468tR interfaceC8468tR) {
        G10.g(interfaceC8468tR, "functionDescriptor");
        InterfaceC9918yc1 interfaceC9918yc1 = (InterfaceC9918yc1) interfaceC8468tR.h().get(1);
        C7867rG0.b bVar = C7867rG0.k;
        G10.d(interfaceC9918yc1);
        I80 i80A = bVar.a(AbstractC8400tA.s(interfaceC9918yc1));
        if (i80A == null) {
            return false;
        }
        I80 type = interfaceC9918yc1.getType();
        G10.f(type, "getType(...)");
        return H81.w(i80A, H81.A(type));
    }

    @Override // com.daaw.InterfaceC0543Ck
    public String getDescription() {
        return b;
    }
}
