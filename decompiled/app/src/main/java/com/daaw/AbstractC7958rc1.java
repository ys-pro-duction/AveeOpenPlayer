package com.daaw;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.rc1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC7958rc1 {
    public /* synthetic */ AbstractC7958rc1(AbstractC2911Yw abstractC2911Yw) {
        this();
    }

    public abstract boolean a(C2352Tm0 c2352Tm0);

    public final AbstractC7958rc1 b(NQ nq) {
        G10.g(nq, "transform");
        if (this instanceof IZ) {
            IZ iz = (IZ) this;
            return new IZ(iz.c(), (InterfaceC3159aT0) nq.invoke(iz.d()));
        }
        if (!(this instanceof C2034Ql0)) {
            throw new C6902no0();
        }
        List<C0576Cs0> listC = ((C2034Ql0) this).c();
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(listC, 10));
        for (C0576Cs0 c0576Cs0 : listC) {
            arrayList.add(D61.a((C2352Tm0) c0576Cs0.a(), nq.invoke((InterfaceC3159aT0) c0576Cs0.b())));
        }
        return new C2034Ql0(arrayList);
    }

    public AbstractC7958rc1() {
    }
}
