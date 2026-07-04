package com.daaw;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Au1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0377Au1 implements InterfaceC1637Mv1 {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof C0377Au1;
    }

    public final int hashCode() {
        return 1;
    }

    @Override // com.daaw.InterfaceC1637Mv1
    public final InterfaceC1637Mv1 m(String str, ES2 es2, List list) {
        throw new IllegalStateException(String.format("null has no function %s", str));
    }

    @Override // com.daaw.InterfaceC1637Mv1
    public final InterfaceC1637Mv1 zzd() {
        return InterfaceC1637Mv1.u;
    }

    @Override // com.daaw.InterfaceC1637Mv1
    public final Boolean zzg() {
        return Boolean.FALSE;
    }

    @Override // com.daaw.InterfaceC1637Mv1
    public final Double zzh() {
        return Double.valueOf(0.0d);
    }

    @Override // com.daaw.InterfaceC1637Mv1
    public final String zzi() {
        return "null";
    }

    @Override // com.daaw.InterfaceC1637Mv1
    public final Iterator zzl() {
        return null;
    }
}
