package com.daaw;

import java.util.List;

/* JADX INFO: renamed from: com.daaw.oc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7120oc extends AbstractC2423Ue {
    public final List a;

    public C7120oc(List list) {
        if (list == null) {
            throw new NullPointerException("Null logRequests");
        }
        this.a = list;
    }

    @Override // com.daaw.AbstractC2423Ue
    public List c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2423Ue) {
            return this.a.equals(((AbstractC2423Ue) obj).c());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.a + "}";
    }
}
