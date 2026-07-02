package com.daaw;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class E0 extends AbstractC3868d0 {
    public final List c = new ArrayList();

    public AbstractC3868d0[] b() {
        AbstractC3868d0[] abstractC3868d0Arr = new AbstractC3868d0[this.c.size()];
        this.c.toArray(abstractC3868d0Arr);
        return abstractC3868d0Arr;
    }
}
