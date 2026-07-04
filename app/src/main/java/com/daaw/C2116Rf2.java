package com.daaw;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Rf2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2116Rf2 extends AbstractC5468ii2 {
    public static final Class c = DesugarCollections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public /* synthetic */ C2116Rf2(AbstractC6859nf2 abstractC6859nf2) {
        super(null);
    }

    @Override // com.daaw.AbstractC5468ii2
    public final void a(Object obj, long j) {
        Object objUnmodifiableList;
        List list = (List) AbstractC4247eM2.k(obj, j);
        if (list instanceof InterfaceC1259Je2) {
            objUnmodifiableList = ((InterfaceC1259Je2) list).zze();
        } else {
            if (c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof InterfaceC2902Yt2) && (list instanceof M72)) {
                M72 m72 = (M72) list;
                if (m72.zzc()) {
                    m72.zzb();
                    return;
                }
                return;
            }
            objUnmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        AbstractC4247eM2.x(obj, j, objUnmodifiableList);
    }

    @Override // com.daaw.AbstractC5468ii2
    public final void b(Object obj, Object obj2, long j) {
        List list;
        List list2;
        List list3 = (List) AbstractC4247eM2.k(obj2, j);
        int size = list3.size();
        List list4 = (List) AbstractC4247eM2.k(obj, j);
        if (list4.isEmpty()) {
            List c4612fe2 = list4 instanceof InterfaceC1259Je2 ? new C4612fe2(size) : ((list4 instanceof InterfaceC2902Yt2) && (list4 instanceof M72)) ? ((M72) list4).f(size) : new ArrayList(size);
            AbstractC4247eM2.x(obj, j, c4612fe2);
            list2 = c4612fe2;
        } else {
            if (c.isAssignableFrom(list4.getClass())) {
                ArrayList arrayList = new ArrayList(list4.size() + size);
                arrayList.addAll(list4);
                AbstractC4247eM2.x(obj, j, arrayList);
                list = arrayList;
            } else if (list4 instanceof C8439tJ2) {
                C4612fe2 c4612fe22 = new C4612fe2(list4.size() + size);
                c4612fe22.addAll(c4612fe22.size(), (C8439tJ2) list4);
                AbstractC4247eM2.x(obj, j, c4612fe22);
                list = c4612fe22;
            } else {
                boolean z = list4 instanceof InterfaceC2902Yt2;
                list2 = list4;
                if (z) {
                    boolean z2 = list4 instanceof M72;
                    list2 = list4;
                    if (z2) {
                        M72 m72 = (M72) list4;
                        list2 = list4;
                        if (!m72.zzc()) {
                            M72 m72F = m72.f(list4.size() + size);
                            AbstractC4247eM2.x(obj, j, m72F);
                            list2 = m72F;
                        }
                    }
                }
            }
            list2 = list;
        }
        int size2 = list2.size();
        int size3 = list3.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list3);
        }
        if (size2 > 0) {
            list3 = list2;
        }
        AbstractC4247eM2.x(obj, j, list3);
    }
}
