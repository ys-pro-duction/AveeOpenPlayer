package com.daaw;

import j$.util.Objects;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.yS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C9874yS {
    public final List a;

    public C9874yS(List list) {
        G10.g(list, "topics");
        this.a = list;
    }

    public final List a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9874yS)) {
            return false;
        }
        C9874yS c9874yS = (C9874yS) obj;
        if (this.a.size() != c9874yS.a.size()) {
            return false;
        }
        return G10.c(new HashSet(this.a), new HashSet(c9874yS.a));
    }

    public int hashCode() {
        return Objects.hash(this.a);
    }

    public String toString() {
        return "Topics=" + this.a;
    }
}
