package com.daaw;

/* JADX INFO: renamed from: com.daaw.cw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3851cw implements Comparable {
    public static final C3851cw D = c("", "");
    public final String B;
    public final String C;

    public C3851cw(String str, String str2) {
        this.B = str;
        this.C = str2;
    }

    public static C3851cw c(String str, String str2) {
        return new C3851cw(str, str2);
    }

    public static C3851cw g(String str) {
        UI0 ui0U = UI0.u(str);
        AbstractC6557mb.d(ui0U.p() > 3 && ui0U.m(0).equals("projects") && ui0U.m(2).equals("databases"), "Tried to parse an invalid resource name: %s", ui0U);
        return new C3851cw(ui0U.m(1), ui0U.m(3));
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C3851cw c3851cw) {
        int iCompareTo = this.B.compareTo(c3851cw.B);
        return iCompareTo != 0 ? iCompareTo : this.C.compareTo(c3851cw.C);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3851cw.class == obj.getClass()) {
            C3851cw c3851cw = (C3851cw) obj;
            if (this.B.equals(c3851cw.B) && this.C.equals(c3851cw.C)) {
                return true;
            }
        }
        return false;
    }

    public String h() {
        return this.C;
    }

    public int hashCode() {
        return (this.B.hashCode() * 31) + this.C.hashCode();
    }

    public String k() {
        return this.B;
    }

    public String toString() {
        return "DatabaseId(" + this.B + ", " + this.C + ")";
    }
}
