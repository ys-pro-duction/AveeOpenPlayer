package com.daaw;

/* JADX INFO: renamed from: com.daaw.Yj1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2861Yj1 extends X00 {
    public final String a;

    @Override // com.daaw.X00
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof X00) {
            return this.a.equals(((X00) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "IntegrityTokenResponse{token=" + this.a + "}";
    }
}
