package com.daaw;

import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.b51, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3338b51 {
    public final int a;
    public final com.google.android.exoplayer2.trackselection.c[] b;
    public int c;

    public C3338b51(com.google.android.exoplayer2.trackselection.c... cVarArr) {
        this.b = cVarArr;
        this.a = cVarArr.length;
    }

    public com.google.android.exoplayer2.trackselection.c a(int i) {
        return this.b[i];
    }

    public com.google.android.exoplayer2.trackselection.c[] b() {
        return (com.google.android.exoplayer2.trackselection.c[]) this.b.clone();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3338b51.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.b, ((C3338b51) obj).b);
    }

    public int hashCode() {
        if (this.c == 0) {
            this.c = 527 + Arrays.hashCode(this.b);
        }
        return this.c;
    }
}
