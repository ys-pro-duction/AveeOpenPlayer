package com.daaw;

import java.util.IdentityHashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Qb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1971Qb {
    public static final IdentityHashMap b;
    public static final C1971Qb c;
    public final IdentityHashMap a;

    /* JADX INFO: renamed from: com.daaw.Qb$b */
    public static final class b {
        public C1971Qb a;
        public IdentityHashMap b;

        public C1971Qb a() {
            if (this.b != null) {
                for (Map.Entry entry : this.a.a.entrySet()) {
                    if (!this.b.containsKey(entry.getKey())) {
                        this.b.put((c) entry.getKey(), entry.getValue());
                    }
                }
                this.a = new C1971Qb(this.b);
                this.b = null;
            }
            return this.a;
        }

        public final IdentityHashMap b(int i) {
            if (this.b == null) {
                this.b = new IdentityHashMap(i);
            }
            return this.b;
        }

        public b c(c cVar) {
            if (this.a.a.containsKey(cVar)) {
                IdentityHashMap identityHashMap = new IdentityHashMap(this.a.a);
                identityHashMap.remove(cVar);
                this.a = new C1971Qb(identityHashMap);
            }
            IdentityHashMap identityHashMap2 = this.b;
            if (identityHashMap2 != null) {
                identityHashMap2.remove(cVar);
            }
            return this;
        }

        public b d(c cVar, Object obj) {
            b(1).put(cVar, obj);
            return this;
        }

        public b(C1971Qb c1971Qb) {
            this.a = c1971Qb;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Qb$c */
    public static final class c {
        public final String a;

        public c(String str) {
            this.a = str;
        }

        public static c a(String str) {
            return new c(str);
        }

        public String toString() {
            return this.a;
        }
    }

    static {
        IdentityHashMap identityHashMap = new IdentityHashMap();
        b = identityHashMap;
        c = new C1971Qb(identityHashMap);
    }

    public static b c() {
        return new b();
    }

    public Object b(c cVar) {
        return this.a.get(cVar);
    }

    public b d() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1971Qb.class != obj.getClass()) {
            return false;
        }
        C1971Qb c1971Qb = (C1971Qb) obj;
        if (this.a.size() != c1971Qb.a.size()) {
            return false;
        }
        for (Map.Entry entry : this.a.entrySet()) {
            if (!c1971Qb.a.containsKey(entry.getKey()) || !AbstractC8301sp0.a(entry.getValue(), c1971Qb.a.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int iB = 0;
        for (Map.Entry entry : this.a.entrySet()) {
            iB += AbstractC8301sp0.b(entry.getKey(), entry.getValue());
        }
        return iB;
    }

    public String toString() {
        return this.a.toString();
    }

    public C1971Qb(IdentityHashMap identityHashMap) {
        this.a = identityHashMap;
    }
}
