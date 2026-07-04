package com.daaw;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.gP2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4827gP2 implements InterfaceC6515mQ2 {
    public transient Set B;
    public transient Collection C;
    public transient Map D;

    public abstract Collection b();

    public abstract Iterator c();

    public abstract Map d();

    public abstract Set e();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InterfaceC6515mQ2) {
            return zzs().equals(((InterfaceC6515mQ2) obj).zzs());
        }
        return false;
    }

    public final Set f() {
        Set set = this.B;
        if (set != null) {
            return set;
        }
        Set setE = e();
        this.B = setE;
        return setE;
    }

    public final int hashCode() {
        return zzs().hashCode();
    }

    public final String toString() {
        return zzs().toString();
    }

    @Override // com.daaw.InterfaceC6515mQ2
    public final Collection zzr() {
        Collection collection = this.C;
        if (collection != null) {
            return collection;
        }
        Collection collectionB = b();
        this.C = collectionB;
        return collectionB;
    }

    @Override // com.daaw.InterfaceC6515mQ2
    public final Map zzs() {
        Map map = this.D;
        if (map != null) {
            return map;
        }
        Map mapD = d();
        this.D = mapD;
        return mapD;
    }
}
