package com.daaw;

/* JADX INFO: renamed from: com.daaw.n81, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6719n81 implements InterfaceC6440m81 {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC6440m81)) {
            return false;
        }
        InterfaceC6440m81 interfaceC6440m81 = (InterfaceC6440m81) obj;
        return c() == interfaceC6440m81.c() && b() == interfaceC6440m81.b() && getType().equals(interfaceC6440m81.getType());
    }

    public int hashCode() {
        int iHashCode = b().hashCode();
        if (D81.w(getType())) {
            return (iHashCode * 31) + 19;
        }
        return (iHashCode * 31) + (c() ? 17 : getType().hashCode());
    }

    public String toString() {
        if (c()) {
            return "*";
        }
        if (b() == EnumC1042Hc1.F) {
            return getType().toString();
        }
        return b() + " " + getType();
    }
}
