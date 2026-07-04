package com.daaw;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Lm1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1498Lm1 {
    public String a;
    public final long b;
    public final Map c;

    public C1498Lm1(String str, long j, Map map) {
        this.a = str;
        this.b = j;
        HashMap map2 = new HashMap();
        this.c = map2;
        if (map != null) {
            map2.putAll(map);
        }
    }

    public final long a() {
        return this.b;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C1498Lm1 clone() {
        return new C1498Lm1(this.a, this.b, new HashMap(this.c));
    }

    public final Object c(String str) {
        if (this.c.containsKey(str)) {
            return this.c.get(str);
        }
        return null;
    }

    public final String d() {
        return this.a;
    }

    public final Map e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1498Lm1)) {
            return false;
        }
        C1498Lm1 c1498Lm1 = (C1498Lm1) obj;
        if (this.b == c1498Lm1.b && this.a.equals(c1498Lm1.a)) {
            return this.c.equals(c1498Lm1.c);
        }
        return false;
    }

    public final void f(String str) {
        this.a = str;
    }

    public final void g(String str, Object obj) {
        if (obj == null) {
            this.c.remove(str);
        } else {
            this.c.put(str, obj);
        }
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j = this.b;
        return ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Event{name='" + this.a + "', timestamp=" + this.b + ", params=" + this.c.toString() + "}";
    }
}
