package com.daaw;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class LV {
    public final int a;
    public final long b;
    public final Set c;

    public LV(int i, long j, Set set) {
        this.a = i;
        this.b = j;
        this.c = PY.G(set);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && LV.class == obj.getClass()) {
            LV lv = (LV) obj;
            if (this.a == lv.a && this.b == lv.b && AbstractC8301sp0.a(this.c, lv.c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return AbstractC8301sp0.b(Integer.valueOf(this.a), Long.valueOf(this.b), this.c);
    }

    public String toString() {
        return AbstractC6329ll0.b(this).b("maxAttempts", this.a).c("hedgingDelayNanos", this.b).d("nonFatalStatusCodes", this.c).toString();
    }
}
