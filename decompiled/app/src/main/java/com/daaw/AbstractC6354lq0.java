package com.daaw;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.lq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6354lq0 extends AbstractC9284wK {
    public int b;
    public int c;

    public AbstractC6354lq0(C8046ru c8046ru, int i, int i2) {
        super(c8046ru);
        this.b = i;
        this.c = i2;
    }

    @Override // com.daaw.AbstractC9284wK
    public List b(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        try {
            int iC = c(i);
            while (iC < i2) {
                arrayList.add(Integer.valueOf(iC));
                iC = c(iC);
            }
        } catch (C6623mo0 unused) {
        }
        return arrayList;
    }
}
