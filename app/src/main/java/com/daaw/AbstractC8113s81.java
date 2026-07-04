package com.daaw;

import com.daaw.C9489x30;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.s81, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8113s81 {
    public static final Object a(InterfaceC8097s50 interfaceC8097s50, Object obj, boolean z) {
        G10.g(interfaceC8097s50, "<this>");
        G10.g(obj, "possiblyPrimitiveType");
        return z ? interfaceC8097s50.d(obj) : obj;
    }

    public static final Object b(InterfaceC9236w81 interfaceC9236w81, O80 o80, InterfaceC8097s50 interfaceC8097s50, Y71 y71) {
        G10.g(interfaceC9236w81, "<this>");
        G10.g(o80, "type");
        G10.g(interfaceC8097s50, "typeFactory");
        G10.g(y71, "mode");
        D71 d71A0 = interfaceC9236w81.a0(o80);
        if (!interfaceC9236w81.v0(d71A0)) {
            return null;
        }
        EnumC8067rz0 enumC8067rz0E0 = interfaceC9236w81.e0(d71A0);
        if (enumC8067rz0E0 != null) {
            return a(interfaceC8097s50, interfaceC8097s50.f(enumC8067rz0E0), interfaceC9236w81.q(o80) || O71.c(interfaceC9236w81, o80));
        }
        EnumC8067rz0 enumC8067rz0N = interfaceC9236w81.N(d71A0);
        if (enumC8067rz0N != null) {
            return interfaceC8097s50.b('[' + EnumC6703n50.c(enumC8067rz0N).h());
        }
        if (interfaceC9236w81.M(d71A0)) {
            BP bpN = interfaceC9236w81.n(d71A0);
            C6607ml c6607mlN = bpN != null ? C9489x30.a.n(bpN) : null;
            if (c6607mlN != null) {
                if (!y71.a()) {
                    List listI = C9489x30.a.i();
                    if (!(listI instanceof Collection) || !listI.isEmpty()) {
                        Iterator it = listI.iterator();
                        while (it.hasNext()) {
                            if (G10.c(((C9489x30.a) it.next()).d(), c6607mlN)) {
                                return null;
                            }
                        }
                    }
                }
                String strH = Y40.h(c6607mlN);
                G10.f(strH, "internalNameByClassId(...)");
                return interfaceC8097s50.c(strH);
            }
        }
        return null;
    }
}
