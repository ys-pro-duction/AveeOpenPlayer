package com.daaw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.l81, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6161l81 {
    public static final C2292Sx0 d(I80 i80) {
        G10.g(i80, "<this>");
        InterfaceC10240zl interfaceC10240zlC = i80.N0().c();
        return e(i80, interfaceC10240zlC instanceof InterfaceC0339Al ? (InterfaceC0339Al) interfaceC10240zlC : null, 0);
    }

    public static final C2292Sx0 e(I80 i80, InterfaceC0339Al interfaceC0339Al, int i) {
        if (interfaceC0339Al == null || BH.m(interfaceC0339Al)) {
            return null;
        }
        int size = interfaceC0339Al.v().size() + i;
        if (interfaceC0339Al.K()) {
            List listSubList = i80.L0().subList(i, size);
            InterfaceC8612tw interfaceC8612twB = interfaceC0339Al.b();
            return new C2292Sx0(interfaceC0339Al, listSubList, e(i80, interfaceC8612twB instanceof InterfaceC0339Al ? (InterfaceC0339Al) interfaceC8612twB : null, size));
        }
        if (size != i80.L0().size()) {
            AbstractC7006oA.E(interfaceC0339Al);
        }
        return new C2292Sx0(interfaceC0339Al, i80.L0().subList(i, i80.L0().size()), null);
    }

    public static final C1172Ij f(Z71 z71, InterfaceC8612tw interfaceC8612tw, int i) {
        return new C1172Ij(z71, interfaceC8612tw, i);
    }

    public static final List g(InterfaceC0339Al interfaceC0339Al) {
        List listK;
        Object next;
        C71 c71K;
        G10.g(interfaceC0339Al, "<this>");
        List listV = interfaceC0339Al.v();
        G10.f(listV, "getDeclaredTypeParameters(...)");
        if (!interfaceC0339Al.K() && !(interfaceC0339Al.b() instanceof InterfaceC1376Ki)) {
            return listV;
        }
        List listA = UP0.A(UP0.r(UP0.n(UP0.y(AbstractC8400tA.u(interfaceC0339Al), C5314i81.B), C5591j81.B), C5873k81.B));
        Iterator it = AbstractC8400tA.u(interfaceC0339Al).iterator();
        while (true) {
            listK = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next instanceof InterfaceC4923gl) {
                break;
            }
        }
        InterfaceC4923gl interfaceC4923gl = (InterfaceC4923gl) next;
        if (interfaceC4923gl != null && (c71K = interfaceC4923gl.k()) != null) {
            listK = c71K.getParameters();
        }
        if (listK == null) {
            listK = AbstractC1599Mm.k();
        }
        if (listA.isEmpty() && listK.isEmpty()) {
            List listV2 = interfaceC0339Al.v();
            G10.f(listV2, "getDeclaredTypeParameters(...)");
            return listV2;
        }
        List<Z71> listZ0 = AbstractC2455Um.z0(listA, listK);
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(listZ0, 10));
        for (Z71 z71 : listZ0) {
            G10.d(z71);
            arrayList.add(f(z71, interfaceC0339Al, listV.size()));
        }
        return AbstractC2455Um.z0(listV, arrayList);
    }

    public static final boolean h(InterfaceC8612tw interfaceC8612tw) {
        G10.g(interfaceC8612tw, "it");
        return interfaceC8612tw instanceof InterfaceC1376Ki;
    }

    public static final boolean i(InterfaceC8612tw interfaceC8612tw) {
        G10.g(interfaceC8612tw, "it");
        return !(interfaceC8612tw instanceof InterfaceC7195or);
    }

    public static final KP0 j(InterfaceC8612tw interfaceC8612tw) {
        G10.g(interfaceC8612tw, "it");
        List typeParameters = ((InterfaceC1376Ki) interfaceC8612tw).getTypeParameters();
        G10.f(typeParameters, "getTypeParameters(...)");
        return AbstractC2455Um.V(typeParameters);
    }
}
