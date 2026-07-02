package com.daaw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.sw1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8335sw1 implements InterfaceC1637Mv1 {
    public final String B;
    public final ArrayList C;

    public C8335sw1(String str, List list) {
        this.B = str;
        ArrayList arrayList = new ArrayList();
        this.C = arrayList;
        arrayList.addAll(list);
    }

    public final String a() {
        return this.B;
    }

    public final ArrayList b() {
        return this.C;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8335sw1)) {
            return false;
        }
        C8335sw1 c8335sw1 = (C8335sw1) obj;
        String str = this.B;
        if (str == null ? c8335sw1.B == null : str.equals(c8335sw1.B)) {
            return this.C.equals(c8335sw1.C);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.B;
        return ((str != null ? str.hashCode() : 0) * 31) + this.C.hashCode();
    }

    @Override // com.daaw.InterfaceC1637Mv1
    public final InterfaceC1637Mv1 m(String str, ES2 es2, List list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    @Override // com.daaw.InterfaceC1637Mv1
    public final Boolean zzg() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override // com.daaw.InterfaceC1637Mv1
    public final Double zzh() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override // com.daaw.InterfaceC1637Mv1
    public final String zzi() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    @Override // com.daaw.InterfaceC1637Mv1
    public final Iterator zzl() {
        return null;
    }

    @Override // com.daaw.InterfaceC1637Mv1
    public final InterfaceC1637Mv1 zzd() {
        return this;
    }
}
