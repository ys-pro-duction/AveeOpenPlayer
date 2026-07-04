package com.daaw;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.fb3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4598fb3 implements Serializable, Ta3 {
    public final Object B;

    public C4598fb3(Object obj) {
        this.B = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4598fb3) {
            return Ea3.a(this.B, ((C4598fb3) obj).B);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.B});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.B.toString() + ")";
    }

    @Override // com.daaw.Ta3
    public final Object zza() {
        return this.B;
    }
}
