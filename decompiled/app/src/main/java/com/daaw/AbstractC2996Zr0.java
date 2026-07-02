package com.daaw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Zr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2996Zr0 {
    public static final void a(InterfaceC2580Vr0 interfaceC2580Vr0, AP ap, Collection collection) {
        G10.g(interfaceC2580Vr0, "<this>");
        G10.g(ap, "fqName");
        G10.g(collection, "packageFragments");
        if (interfaceC2580Vr0 instanceof InterfaceC3277as0) {
            ((InterfaceC3277as0) interfaceC2580Vr0).b(ap, collection);
        } else {
            collection.addAll(interfaceC2580Vr0.c(ap));
        }
    }

    public static final boolean b(InterfaceC2580Vr0 interfaceC2580Vr0, AP ap) {
        G10.g(interfaceC2580Vr0, "<this>");
        G10.g(ap, "fqName");
        return interfaceC2580Vr0 instanceof InterfaceC3277as0 ? ((InterfaceC3277as0) interfaceC2580Vr0).a(ap) : c(interfaceC2580Vr0, ap).isEmpty();
    }

    public static final List c(InterfaceC2580Vr0 interfaceC2580Vr0, AP ap) {
        G10.g(interfaceC2580Vr0, "<this>");
        G10.g(ap, "fqName");
        ArrayList arrayList = new ArrayList();
        a(interfaceC2580Vr0, ap, arrayList);
        return arrayList;
    }
}
