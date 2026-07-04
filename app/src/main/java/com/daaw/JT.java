package com.daaw;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class JT extends Z70 {
    public final HT i;

    public JT(List list) {
        super(list);
        HT ht = (HT) ((Y70) list.get(0)).b;
        int iC = ht != null ? ht.c() : 0;
        this.i = new HT(new float[iC], new int[iC]);
    }

    @Override // com.daaw.AbstractC9089ve
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public HT i(Y70 y70, float f) {
        this.i.d((HT) y70.b, (HT) y70.c, f);
        return this.i;
    }
}
