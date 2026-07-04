package com.daaw;

/* JADX INFO: renamed from: com.daaw.xa3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9631xa3 {
    public final String a;
    public final C2485Ut1 b;
    public final C2485Ut1 c;
    public final int d;
    public final int e;

    public C9631xa3(String str, C2485Ut1 c2485Ut1, C2485Ut1 c2485Ut12, int i, int i2) {
        boolean z = true;
        if (i != 0) {
            if (i2 == 0) {
                i2 = 0;
            } else {
                z = false;
            }
        }
        AbstractC6048km2.d(z);
        AbstractC6048km2.c(str);
        this.a = str;
        c2485Ut1.getClass();
        this.b = c2485Ut1;
        c2485Ut12.getClass();
        this.c = c2485Ut12;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C9631xa3.class == obj.getClass()) {
            C9631xa3 c9631xa3 = (C9631xa3) obj;
            if (this.d == c9631xa3.d && this.e == c9631xa3.e && this.a.equals(c9631xa3.a) && this.b.equals(c9631xa3.b) && this.c.equals(c9631xa3.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.d + 527) * 31) + this.e) * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }
}
