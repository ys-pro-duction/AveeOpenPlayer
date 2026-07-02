package com.daaw;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.r83, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7836r83 implements InterfaceC4758g83 {
    public static final InterfaceC4758g83 c = C5037h83.a(Collections.EMPTY_SET);
    public final List a;
    public final List b;

    public /* synthetic */ C7836r83(List list, List list2, AbstractC7279p83 abstractC7279p83) {
        this.a = list;
        this.b = list2;
    }

    public static C7558q83 a(int i, int i2) {
        return new C7558q83(i, i2, null);
    }

    @Override // com.daaw.InterfaceC8394t83
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Set zzb() {
        int size = this.a.size();
        ArrayList arrayList = new ArrayList(this.b.size());
        int size2 = this.b.size();
        for (int i = 0; i < size2; i++) {
            Collection collection = (Collection) ((InterfaceC8394t83) this.b.get(i)).zzb();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSetA = Y73.a(size);
        int size3 = this.a.size();
        for (int i2 = 0; i2 < size3; i2++) {
            Object objZzb = ((InterfaceC8394t83) this.a.get(i2)).zzb();
            objZzb.getClass();
            hashSetA.add(objZzb);
        }
        int size4 = arrayList.size();
        for (int i3 = 0; i3 < size4; i3++) {
            for (Object obj : (Collection) arrayList.get(i3)) {
                obj.getClass();
                hashSetA.add(obj);
            }
        }
        return DesugarCollections.unmodifiableSet(hashSetA);
    }
}
