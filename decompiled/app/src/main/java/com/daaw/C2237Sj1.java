package com.daaw;

/* JADX INFO: renamed from: com.daaw.Sj1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2237Sj1 extends W00 {
    public final String a;
    public final Long b;

    public /* synthetic */ C2237Sj1(String str, Long l, AbstractC2027Qj1 abstractC2027Qj1) {
        this.a = str;
        this.b = l;
    }

    @Override // com.daaw.W00
    public final Long b() {
        return this.b;
    }

    @Override // com.daaw.W00
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        Long l;
        if (obj == this) {
            return true;
        }
        if (obj instanceof W00) {
            W00 w00 = (W00) obj;
            if (this.a.equals(w00.c()) && ((l = this.b) != null ? l.equals(w00.b()) : w00.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        Long l = this.b;
        return (iHashCode * 1000003) ^ (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "IntegrityTokenRequest{nonce=" + this.a + ", cloudProjectNumber=" + this.b + "}";
    }
}
