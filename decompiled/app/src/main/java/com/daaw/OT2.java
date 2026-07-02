package com.daaw;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes3.dex */
public final class OT2 {
    public final Class a;
    public PT2 d;
    public ConcurrentMap b = new ConcurrentHashMap();
    public final List c = new ArrayList();
    public JZ2 e = JZ2.b;

    public /* synthetic */ OT2(Class cls, NT2 nt2) {
        this.a = cls;
    }

    public final OT2 a(Object obj, Object obj2, E13 e13) {
        e(obj, obj2, e13, false);
        return this;
    }

    public final OT2 b(Object obj, Object obj2, E13 e13) {
        e(obj, obj2, e13, true);
        return this;
    }

    public final OT2 c(JZ2 jz2) {
        if (this.b == null) {
            throw new IllegalStateException("setAnnotations cannot be called after build");
        }
        this.e = jz2;
        return this;
    }

    public final XT2 d() {
        ConcurrentMap concurrentMap = this.b;
        if (concurrentMap == null) {
            throw new IllegalStateException("build cannot be called twice");
        }
        XT2 xt2 = new XT2(concurrentMap, this.c, this.d, this.e, this.a, null);
        this.b = null;
        return xt2;
    }

    public final OT2 e(Object obj, Object obj2, E13 e13, boolean z) throws GeneralSecurityException {
        byte[] bArrArray;
        if (this.b == null) {
            throw new IllegalStateException("addPrimitive cannot be called after build");
        }
        if (obj == null && obj2 == null) {
            throw new GeneralSecurityException("at least one of the `fullPrimitive` or `primitive` must be set");
        }
        if (e13.V() != 3) {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        Integer numValueOf = Integer.valueOf(e13.M());
        if (e13.Q() == EnumC3603c23.RAW) {
            numValueOf = null;
        }
        AbstractC8758uT2 abstractC8758uT2A = C10176zX2.b().a(XX2.a(e13.N().R(), e13.N().Q(), e13.N().N(), e13.Q(), numValueOf), C3444bU2.a());
        int iOrdinal = e13.Q().ordinal();
        if (iOrdinal == 1) {
            bArrArray = ByteBuffer.allocate(5).put((byte) 1).putInt(e13.M()).array();
        } else if (iOrdinal == 2) {
            bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(e13.M()).array();
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(e13.M()).array();
        } else {
            bArrArray = AbstractC8200sT2.a;
        }
        PT2 pt2 = new PT2(obj, obj2, bArrArray, e13.V(), e13.Q(), e13.M(), e13.N().R(), abstractC8758uT2A);
        ConcurrentMap concurrentMap = this.b;
        List list = this.c;
        ArrayList arrayList = new ArrayList();
        arrayList.add(pt2);
        VT2 vt2 = new VT2(pt2.g(), null);
        List list2 = (List) concurrentMap.put(vt2, DesugarCollections.unmodifiableList(arrayList));
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(list2);
            arrayList2.add(pt2);
            concurrentMap.put(vt2, DesugarCollections.unmodifiableList(arrayList2));
        }
        list.add(pt2);
        if (!z) {
            return this;
        }
        if (this.d != null) {
            throw new IllegalStateException("you cannot set two primary primitives");
        }
        this.d = pt2;
        return this;
    }
}
