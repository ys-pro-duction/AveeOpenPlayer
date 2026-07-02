package com.daaw;

import java.util.Set;

/* JADX INFO: renamed from: com.daaw.Xt1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2797Xt1 extends AbstractC1510Lp1 implements Set, j$.util.Set {
    public transient AbstractC9714xr1 C;

    public AbstractC9714xr1 E() {
        Object[] array = toArray();
        AbstractC5883kA1 abstractC5883kA1 = AbstractC9714xr1.C;
        return AbstractC9714xr1.F(array, array.length);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    return containsAll(set);
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return AbstractC2505Uy1.a(this);
    }

    @Override // com.daaw.AbstractC1510Lp1
    public AbstractC9714xr1 w() {
        AbstractC9714xr1 abstractC9714xr1 = this.C;
        if (abstractC9714xr1 != null) {
            return abstractC9714xr1;
        }
        AbstractC9714xr1 abstractC9714xr1E = E();
        this.C = abstractC9714xr1E;
        return abstractC9714xr1E;
    }
}
