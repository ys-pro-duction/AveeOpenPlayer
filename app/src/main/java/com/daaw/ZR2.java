package com.daaw;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ZR2 extends KR2 {
    public List Q;

    public ZR2(JP2 jp2, boolean z) {
        super(jp2, z, true);
        List listA = jp2.isEmpty() ? Collections.EMPTY_LIST : AbstractC4552fQ2.a(jp2.size());
        for (int i = 0; i < jp2.size(); i++) {
            listA.add(null);
        }
        this.Q = listA;
    }

    @Override // com.daaw.KR2
    public final void P(int i, Object obj) {
        List list = this.Q;
        if (list != null) {
            list.set(i, new YR2(obj));
        }
    }

    @Override // com.daaw.KR2
    public final void Q() {
        List list = this.Q;
        if (list != null) {
            e(V(list));
        }
    }

    @Override // com.daaw.KR2
    public final void U(int i) {
        super.U(i);
        this.Q = null;
    }

    public abstract Object V(List list);
}
