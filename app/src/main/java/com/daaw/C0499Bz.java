package com.daaw;

/* JADX INFO: renamed from: com.daaw.Bz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0499Bz {
    public final String a;
    public final String b;
    public final String c;

    public C0499Bz(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0499Bz.class == obj.getClass()) {
            C0499Bz c0499Bz = (C0499Bz) obj;
            if (AbstractC6280lb1.b(this.a, c0499Bz.a) && AbstractC6280lb1.b(this.b, c0499Bz.b) && AbstractC6280lb1.b(this.c, c0499Bz.c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
