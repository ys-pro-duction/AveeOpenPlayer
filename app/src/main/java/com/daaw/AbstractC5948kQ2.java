package com.daaw;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.kQ2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5948kQ2 extends AbstractMap {
    public transient Set B;
    public transient Collection C;

    public abstract Set b();

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.B;
        if (set != null) {
            return set;
        }
        Set setB = b();
        this.B = setB;
        return setB;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.C;
        if (collection != null) {
            return collection;
        }
        C5669jQ2 c5669jQ2 = new C5669jQ2(this);
        this.C = c5669jQ2;
        return c5669jQ2;
    }
}
