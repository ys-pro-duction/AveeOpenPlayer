package com.daaw;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.jK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5642jK {
    public static C5642jK b = a(new HashSet());
    public final Set a;

    public C5642jK(Set set) {
        this.a = set;
    }

    public static C5642jK a(Set set) {
        return new C5642jK(set);
    }

    public Set b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5642jK.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((C5642jK) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "FieldMask{mask=" + this.a.toString() + "}";
    }
}
