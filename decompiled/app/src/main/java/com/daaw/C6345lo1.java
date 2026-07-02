package com.daaw;

/* JADX INFO: renamed from: com.daaw.lo1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6345lo1 {
    public final C7182oo1 a;
    public final C7182oo1 b;

    public C6345lo1(C7182oo1 c7182oo1, C7182oo1 c7182oo12) {
        this.a = c7182oo1;
        this.b = c7182oo12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C6345lo1.class == obj.getClass()) {
            C6345lo1 c6345lo1 = (C6345lo1) obj;
            if (this.a.equals(c6345lo1.a) && this.b.equals(c6345lo1.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        C7182oo1 c7182oo1 = this.a;
        C7182oo1 c7182oo12 = this.b;
        return "[" + c7182oo1.toString() + (c7182oo1.equals(c7182oo12) ? "" : ", ".concat(this.b.toString())) + "]";
    }
}
