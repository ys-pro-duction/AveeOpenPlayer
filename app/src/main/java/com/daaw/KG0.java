package com.daaw;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class KG0 {
    public final CU0 a;
    public final Map b;
    public final Map c;
    public final Map d;
    public final Set e;

    public KG0(CU0 cu0, Map map, Map map2, Map map3, Set set) {
        this.a = cu0;
        this.b = map;
        this.c = map2;
        this.d = map3;
        this.e = set;
    }

    public Map a() {
        return this.d;
    }

    public Set b() {
        return this.e;
    }

    public CU0 c() {
        return this.a;
    }

    public Map d() {
        return this.b;
    }

    public Map e() {
        return this.c;
    }

    public String toString() {
        return "RemoteEvent{snapshotVersion=" + this.a + ", targetChanges=" + this.b + ", targetMismatches=" + this.c + ", documentUpdates=" + this.d + ", resolvedLimboDocuments=" + this.e + '}';
    }
}
