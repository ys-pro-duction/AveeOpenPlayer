package com.daaw;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.lO2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6228lO2 implements Serializable, InterfaceC5661jO2 {
    public final List B;

    public final boolean equals(Object obj) {
        if (obj instanceof C6228lO2) {
            return this.B.equals(((C6228lO2) obj).B);
        }
        return false;
    }

    public final int hashCode() {
        return this.B.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.");
        sb.append("and(");
        boolean z = true;
        for (Object obj : this.B) {
            if (!z) {
                sb.append(',');
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }

    @Override // com.daaw.InterfaceC5661jO2
    public final boolean zza(Object obj) {
        for (int i = 0; i < this.B.size(); i++) {
            if (!((InterfaceC5661jO2) this.B.get(i)).zza(obj)) {
                return false;
            }
        }
        return true;
    }
}
