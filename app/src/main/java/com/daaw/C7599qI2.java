package com.daaw;

/* JADX INFO: renamed from: com.daaw.qI2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7599qI2 {
    public final String a;
    public final String b;

    public C7599qI2(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7599qI2)) {
            return false;
        }
        C7599qI2 c7599qI2 = (C7599qI2) obj;
        return this.a.equals(c7599qI2.a) && this.b.equals(c7599qI2.b);
    }

    public final int hashCode() {
        return String.valueOf(this.a).concat(String.valueOf(this.b)).hashCode();
    }
}
