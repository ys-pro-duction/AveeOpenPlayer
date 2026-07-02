package com.daaw;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class B43 extends F43 {
    public static final Class c = DesugarCollections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public /* synthetic */ B43(A43 a43) {
        super(null);
    }

    public static List f(Object obj, long j, int i) {
        List list = (List) K53.p(obj, j);
        if (list.isEmpty()) {
            List c9776y43 = list instanceof InterfaceC10055z43 ? new C9776y43(i) : ((list instanceof InterfaceC3340b53) && (list instanceof InterfaceC8095s43)) ? ((InterfaceC8095s43) list).f(i) : new ArrayList(i);
            K53.D(obj, j, c9776y43);
            return c9776y43;
        }
        if (c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i);
            arrayList.addAll(list);
            K53.D(obj, j, arrayList);
            return arrayList;
        }
        if (list instanceof B53) {
            C9776y43 c9776y432 = new C9776y43(list.size() + i);
            c9776y432.addAll(c9776y432.size(), (B53) list);
            K53.D(obj, j, c9776y432);
            return c9776y432;
        }
        if ((list instanceof InterfaceC3340b53) && (list instanceof InterfaceC8095s43)) {
            InterfaceC8095s43 interfaceC8095s43 = (InterfaceC8095s43) list;
            if (!interfaceC8095s43.zzc()) {
                InterfaceC8095s43 interfaceC8095s43F = interfaceC8095s43.f(list.size() + i);
                K53.D(obj, j, interfaceC8095s43F);
                return interfaceC8095s43F;
            }
        }
        return list;
    }

    @Override // com.daaw.F43
    public final List a(Object obj, long j) {
        return f(obj, j, 10);
    }

    @Override // com.daaw.F43
    public final void b(Object obj, long j) {
        Object objUnmodifiableList;
        List list = (List) K53.p(obj, j);
        if (list instanceof InterfaceC10055z43) {
            objUnmodifiableList = ((InterfaceC10055z43) list).zze();
        } else {
            if (c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof InterfaceC3340b53) && (list instanceof InterfaceC8095s43)) {
                InterfaceC8095s43 interfaceC8095s43 = (InterfaceC8095s43) list;
                if (interfaceC8095s43.zzc()) {
                    interfaceC8095s43.zzb();
                    return;
                }
                return;
            }
            objUnmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        K53.D(obj, j, objUnmodifiableList);
    }

    @Override // com.daaw.F43
    public final void c(Object obj, Object obj2, long j) {
        List list = (List) K53.p(obj2, j);
        List listF = f(obj, j, list.size());
        int size = listF.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listF.addAll(list);
        }
        if (size > 0) {
            list = listF;
        }
        K53.D(obj, j, list);
    }
}
