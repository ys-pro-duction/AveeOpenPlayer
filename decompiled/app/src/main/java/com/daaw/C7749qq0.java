package com.daaw;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.qq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C7749qq0 extends AbstractC9284wK {
    public C7749qq0(C8046ru c8046ru) {
        super(c8046ru);
    }

    @Override // com.daaw.AbstractC9284wK
    public List b(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        Integer numA = ((C2676Wp0) this.a.d()).h().a();
        int iIntValue = numA.intValue();
        if (iIntValue > i && iIntValue < i2) {
            arrayList.add(numA);
        }
        return arrayList;
    }

    @Override // com.daaw.AbstractC9284wK
    public int c(int i) throws C6623mo0 {
        int iIntValue = ((C2676Wp0) this.a.d()).h().a().intValue();
        if (iIntValue > i) {
            return iIntValue;
        }
        throw new C6623mo0();
    }

    @Override // com.daaw.AbstractC9284wK
    public int d(int i) throws C6623mo0 {
        int iIntValue = ((C2676Wp0) this.a.d()).h().a().intValue();
        if (iIntValue < i) {
            return iIntValue;
        }
        throw new C6623mo0();
    }

    @Override // com.daaw.AbstractC9284wK
    public boolean e(int i) {
        return ((C2676Wp0) this.a.d()).h().a().intValue() == i;
    }

    @Override // com.daaw.AbstractC9284wK
    public boolean f(AbstractC3958dK abstractC3958dK) {
        return abstractC3958dK instanceof C2676Wp0;
    }
}
