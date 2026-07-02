package com.daaw;

/* JADX INFO: renamed from: com.daaw.qA1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7566qA1 {
    public final long a;
    public final String b;
    public final int c;

    public C7566qA1(long j, String str, int i) {
        this.a = j;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C7566qA1)) {
            C7566qA1 c7566qA1 = (C7566qA1) obj;
            if (c7566qA1.a == this.a && c7566qA1.c == this.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.a;
    }
}
