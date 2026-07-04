package com.daaw;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class JZ2 {
    public static final JZ2 b = new HZ2().a();
    public final Map a;

    public final Map a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof JZ2) {
            return this.a.equals(((JZ2) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
