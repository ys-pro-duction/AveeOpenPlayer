package com.daaw;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class Vf3 extends AbstractC4056dg3 {
    public static final Class c = DesugarCollections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public /* synthetic */ Vf3(Tf3 tf3) {
        super(null);
    }

    @Override // com.daaw.AbstractC4056dg3
    public final void a(Object obj, long j) {
        Object objUnmodifiableList;
        List list = (List) AbstractC5750ji3.k(obj, j);
        if (list instanceof Rf3) {
            objUnmodifiableList = ((Rf3) list).zze();
        } else {
            if (c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof Yg3) && (list instanceof InterfaceC9377wf3)) {
                InterfaceC9377wf3 interfaceC9377wf3 = (InterfaceC9377wf3) list;
                if (interfaceC9377wf3.zzc()) {
                    interfaceC9377wf3.zzb();
                    return;
                }
                return;
            }
            objUnmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        AbstractC5750ji3.x(obj, j, objUnmodifiableList);
    }

    @Override // com.daaw.AbstractC4056dg3
    public final void b(Object obj, Object obj2, long j) {
        List list;
        List list2;
        List list3 = (List) AbstractC5750ji3.k(obj2, j);
        int size = list3.size();
        List list4 = (List) AbstractC5750ji3.k(obj, j);
        if (list4.isEmpty()) {
            List of3 = list4 instanceof Rf3 ? new Of3(size) : ((list4 instanceof Yg3) && (list4 instanceof InterfaceC9377wf3)) ? ((InterfaceC9377wf3) list4).f(size) : new ArrayList(size);
            AbstractC5750ji3.x(obj, j, of3);
            list2 = of3;
        } else {
            if (c.isAssignableFrom(list4.getClass())) {
                ArrayList arrayList = new ArrayList(list4.size() + size);
                arrayList.addAll(list4);
                AbstractC5750ji3.x(obj, j, arrayList);
                list = arrayList;
            } else if (list4 instanceof Zh3) {
                Of3 of32 = new Of3(list4.size() + size);
                of32.addAll(of32.size(), (Zh3) list4);
                AbstractC5750ji3.x(obj, j, of32);
                list = of32;
            } else {
                boolean z = list4 instanceof Yg3;
                list2 = list4;
                if (z) {
                    boolean z2 = list4 instanceof InterfaceC9377wf3;
                    list2 = list4;
                    if (z2) {
                        InterfaceC9377wf3 interfaceC9377wf3 = (InterfaceC9377wf3) list4;
                        list2 = list4;
                        if (!interfaceC9377wf3.zzc()) {
                            InterfaceC9377wf3 interfaceC9377wf3F = interfaceC9377wf3.f(list4.size() + size);
                            AbstractC5750ji3.x(obj, j, interfaceC9377wf3F);
                            list2 = interfaceC9377wf3F;
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
        AbstractC5750ji3.x(obj, j, list3);
    }
}
