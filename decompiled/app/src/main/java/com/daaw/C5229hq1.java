package com.daaw;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.hq1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5229hq1 implements InterfaceC1637Mv1 {
    public final InterfaceC1637Mv1 B;
    public final String C;

    public C5229hq1(String str) {
        this.B = InterfaceC1637Mv1.t;
        this.C = str;
    }

    public final InterfaceC1637Mv1 a() {
        return this.B;
    }

    public final String b() {
        return this.C;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5229hq1)) {
            return false;
        }
        C5229hq1 c5229hq1 = (C5229hq1) obj;
        return this.C.equals(c5229hq1.C) && this.B.equals(c5229hq1.B);
    }

    public final int hashCode() {
        return (this.C.hashCode() * 31) + this.B.hashCode();
    }

    @Override // com.daaw.InterfaceC1637Mv1
    public final InterfaceC1637Mv1 m(String str, ES2 es2, List list) {
        throw new IllegalStateException("Control does not have functions");
    }

    @Override // com.daaw.InterfaceC1637Mv1
    public final InterfaceC1637Mv1 zzd() {
        return new C5229hq1(this.C, this.B.zzd());
    }

    @Override // com.daaw.InterfaceC1637Mv1
    public final Boolean zzg() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // com.daaw.InterfaceC1637Mv1
    public final Double zzh() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // com.daaw.InterfaceC1637Mv1
    public final String zzi() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override // com.daaw.InterfaceC1637Mv1
    public final Iterator zzl() {
        return null;
    }

    public C5229hq1(String str, InterfaceC1637Mv1 interfaceC1637Mv1) {
        this.B = interfaceC1637Mv1;
        this.C = str;
    }
}
