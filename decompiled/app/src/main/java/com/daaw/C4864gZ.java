package com.daaw;

/* JADX INFO: renamed from: com.daaw.gZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4864gZ {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final String e;
    public final C6607ml f;

    public C4864gZ(Object obj, Object obj2, Object obj3, Object obj4, String str, C6607ml c6607ml) {
        G10.g(str, "filePath");
        G10.g(c6607ml, "classId");
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = str;
        this.f = c6607ml;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4864gZ)) {
            return false;
        }
        C4864gZ c4864gZ = (C4864gZ) obj;
        return G10.c(this.a, c4864gZ.a) && G10.c(this.b, c4864gZ.b) && G10.c(this.c, c4864gZ.c) && G10.c(this.d, c4864gZ.d) && G10.c(this.e, c4864gZ.e) && G10.c(this.f, c4864gZ.f);
    }

    public int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.b;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.c;
        int iHashCode3 = (iHashCode2 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Object obj4 = this.d;
        return ((((iHashCode3 + (obj4 != null ? obj4.hashCode() : 0)) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.a + ", compilerVersion=" + this.b + ", languageVersion=" + this.c + ", expectedVersion=" + this.d + ", filePath=" + this.e + ", classId=" + this.f + ')';
    }
}
