package com.daaw;

import java.util.List;

/* JADX INFO: renamed from: com.daaw.Wc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2623Wc extends KV {
    public final String a;
    public final List b;

    public C2623Wc(String str, List list) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.a = str;
        if (list == null) {
            throw new NullPointerException("Null usedDates");
        }
        this.b = list;
    }

    @Override // com.daaw.KV
    public List b() {
        return this.b;
    }

    @Override // com.daaw.KV
    public String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof KV) {
            KV kv = (KV) obj;
            if (this.a.equals(kv.c()) && this.b.equals(kv.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.a + ", usedDates=" + this.b + "}";
    }
}
