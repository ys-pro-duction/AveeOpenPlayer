package com.daaw;

/* JADX INFO: renamed from: com.daaw.a30, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3048a30 {
    public static final boolean a(InterfaceC3605c30 interfaceC3605c30) {
        AP apD;
        O30 o30 = (O30) AbstractC2455Um.E0(interfaceC3605c30.h());
        InterfaceC10047z30 type = o30 != null ? o30.getType() : null;
        L20 l20 = type instanceof L20 ? (L20) type : null;
        if (l20 == null) {
            return false;
        }
        K20 k20J = l20.j();
        return (k20J instanceof C20) && (apD = ((C20) k20J).d()) != null && G10.c(apD.b(), "java.lang.Object");
    }

    public static final boolean b(InterfaceC3605c30 interfaceC3605c30) {
        String strC = interfaceC3605c30.getName().c();
        int iHashCode = strC.hashCode();
        if (iHashCode != -1776922004) {
            if (iHashCode == -1295482945) {
                if (strC.equals("equals")) {
                    return a(interfaceC3605c30);
                }
                return false;
            }
            if (iHashCode != 147696667 || !strC.equals("hashCode")) {
                return false;
            }
        } else if (!strC.equals("toString")) {
            return false;
        }
        return interfaceC3605c30.h().isEmpty();
    }

    public static final boolean c(InterfaceC3327b30 interfaceC3327b30) {
        G10.g(interfaceC3327b30, "<this>");
        return interfaceC3327b30.Q().H() && (interfaceC3327b30 instanceof InterfaceC3605c30) && b((InterfaceC3605c30) interfaceC3327b30);
    }
}
