package com.daaw;

import java.util.Collection;
import java.util.LinkedList;

/* JADX INFO: renamed from: com.daaw.Hr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1101Hr0 {
    public static final Collection b(Collection collection, NQ nq) {
        G10.g(collection, "<this>");
        G10.g(nq, "descriptorByHandle");
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        VT0 vt0A = VT0.D.a();
        while (!linkedList.isEmpty()) {
            Object objE0 = AbstractC2455Um.e0(linkedList);
            VT0 vt0A2 = VT0.D.a();
            Collection collectionQ = C0789Er0.q(objE0, linkedList, nq, new C0997Gr0(vt0A2));
            G10.f(collectionQ, "extractMembersOverridableInBothWays(...)");
            if (collectionQ.size() == 1 && vt0A2.isEmpty()) {
                Object objB0 = AbstractC2455Um.B0(collectionQ);
                G10.f(objB0, "single(...)");
                vt0A.add(objB0);
            } else {
                Object objL = C0789Er0.L(collectionQ, nq);
                InterfaceC1376Ki interfaceC1376Ki = (InterfaceC1376Ki) nq.invoke(objL);
                for (Object obj : collectionQ) {
                    G10.d(obj);
                    if (!C0789Er0.B(interfaceC1376Ki, (InterfaceC1376Ki) nq.invoke(obj))) {
                        vt0A2.add(obj);
                    }
                }
                if (!vt0A2.isEmpty()) {
                    vt0A.addAll(vt0A2);
                }
                vt0A.add(objL);
            }
        }
        return vt0A;
    }

    public static final G91 c(VT0 vt0, Object obj) {
        G10.g(vt0, "$conflictedHandles");
        G10.d(obj);
        vt0.add(obj);
        return G91.a;
    }
}
