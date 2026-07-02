package com.daaw;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Kp1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1406Kp1 implements InterfaceC1637Mv1 {
    public final boolean B;

    public C1406Kp1(Boolean bool) {
        this.B = bool == null ? false : bool.booleanValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1406Kp1) && this.B == ((C1406Kp1) obj).B;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.B).hashCode();
    }

    @Override // com.daaw.InterfaceC1637Mv1
    public final InterfaceC1637Mv1 m(String str, ES2 es2, List list) {
        if ("toString".equals(str)) {
            return new C6391ly1(Boolean.toString(this.B));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", Boolean.toString(this.B), str));
    }

    public final String toString() {
        return String.valueOf(this.B);
    }

    @Override // com.daaw.InterfaceC1637Mv1
    public final InterfaceC1637Mv1 zzd() {
        return new C1406Kp1(Boolean.valueOf(this.B));
    }

    @Override // com.daaw.InterfaceC1637Mv1
    public final Boolean zzg() {
        return Boolean.valueOf(this.B);
    }

    @Override // com.daaw.InterfaceC1637Mv1
    public final Double zzh() {
        return Double.valueOf(true != this.B ? 0.0d : 1.0d);
    }

    @Override // com.daaw.InterfaceC1637Mv1
    public final String zzi() {
        return Boolean.toString(this.B);
    }

    @Override // com.daaw.InterfaceC1637Mv1
    public final Iterator zzl() {
        return null;
    }
}
