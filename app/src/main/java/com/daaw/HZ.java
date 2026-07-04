package com.daaw;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class HZ {
    public static final boolean a(InterfaceC4923gl interfaceC4923gl) {
        return G10.c(AbstractC8400tA.o(interfaceC4923gl), YV0.w);
    }

    public static final boolean b(I80 i80, boolean z) {
        InterfaceC10240zl interfaceC10240zlC = i80.N0().c();
        Z71 z71 = interfaceC10240zlC instanceof Z71 ? (Z71) interfaceC10240zlC : null;
        if (z71 == null) {
            return false;
        }
        return (z || !JZ.d(z71)) && e(H81.o(z71));
    }

    public static final boolean c(InterfaceC8612tw interfaceC8612tw) {
        G10.g(interfaceC8612tw, "<this>");
        return JZ.g(interfaceC8612tw) && !a((InterfaceC4923gl) interfaceC8612tw);
    }

    public static final boolean d(I80 i80) {
        G10.g(i80, "<this>");
        InterfaceC10240zl interfaceC10240zlC = i80.N0().c();
        return interfaceC10240zlC != null && ((JZ.b(interfaceC10240zlC) && c(interfaceC10240zlC)) || JZ.i(i80));
    }

    public static final boolean e(I80 i80) {
        return d(i80) || b(i80, true);
    }

    public static final boolean f(InterfaceC1583Mi interfaceC1583Mi) {
        G10.g(interfaceC1583Mi, "descriptor");
        InterfaceC3241al interfaceC3241al = interfaceC1583Mi instanceof InterfaceC3241al ? (InterfaceC3241al) interfaceC1583Mi : null;
        if (interfaceC3241al == null || AbstractC8679uA.g(interfaceC3241al.getVisibility())) {
            return false;
        }
        InterfaceC4923gl interfaceC4923glA = interfaceC3241al.A();
        G10.f(interfaceC4923glA, "getConstructedClass(...)");
        if (JZ.g(interfaceC4923glA) || AbstractC7006oA.G(interfaceC3241al.A())) {
            return false;
        }
        List listH = interfaceC3241al.h();
        G10.f(listH, "getValueParameters(...)");
        List list = listH;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            I80 type = ((InterfaceC9918yc1) it.next()).getType();
            G10.f(type, "getType(...)");
            if (e(type)) {
                return true;
            }
        }
        return false;
    }
}
