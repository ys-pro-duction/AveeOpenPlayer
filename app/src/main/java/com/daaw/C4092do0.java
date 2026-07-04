package com.daaw;

import com.daaw.InterfaceC0543Ck;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.do0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4092do0 implements InterfaceC0543Ck {
    public static final C4092do0 a = new C4092do0();
    public static final String b = "should not have varargs or parameters with default values";

    @Override // com.daaw.InterfaceC0543Ck
    public String a(InterfaceC8468tR interfaceC8468tR) {
        return InterfaceC0543Ck.a.a(this, interfaceC8468tR);
    }

    @Override // com.daaw.InterfaceC0543Ck
    public boolean b(InterfaceC8468tR interfaceC8468tR) {
        G10.g(interfaceC8468tR, "functionDescriptor");
        List listH = interfaceC8468tR.h();
        G10.f(listH, "getValueParameters(...)");
        List<InterfaceC9918yc1> list = listH;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (InterfaceC9918yc1 interfaceC9918yc1 : list) {
            G10.d(interfaceC9918yc1);
            if (AbstractC8400tA.f(interfaceC9918yc1) || interfaceC9918yc1.g0() != null) {
                return false;
            }
        }
        return true;
    }

    @Override // com.daaw.InterfaceC0543Ck
    public String getDescription() {
        return b;
    }
}
