package com.daaw;

import java.util.Set;

/* JADX INFO: renamed from: com.daaw.qc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7678qc extends AbstractC8863uq {
    public final Set a;

    public C7678qc(Set set) {
        if (set == null) {
            throw new NullPointerException("Null updatedKeys");
        }
        this.a = set;
    }

    @Override // com.daaw.AbstractC8863uq
    public Set b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8863uq) {
            return this.a.equals(((AbstractC8863uq) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "ConfigUpdate{updatedKeys=" + this.a + "}";
    }
}
