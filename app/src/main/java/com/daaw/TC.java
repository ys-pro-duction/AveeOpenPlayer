package com.daaw;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class TC implements Comparable {
    public static final Comparator C;
    public static final UY D;
    public final UI0 B;

    static {
        Comparator comparator = new Comparator() { // from class: com.daaw.SC
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((TC) obj).compareTo((TC) obj2);
            }
        };
        C = comparator;
        D = new UY(Collections.EMPTY_LIST, comparator);
    }

    public TC(UI0 ui0) {
        AbstractC6557mb.d(s(ui0), "Not a document key path: %s", ui0);
        this.B = ui0;
    }

    public static Comparator a() {
        return C;
    }

    public static TC g() {
        return m(Collections.EMPTY_LIST);
    }

    public static UY h() {
        return D;
    }

    public static TC k(String str) {
        UI0 ui0U = UI0.u(str);
        AbstractC6557mb.d(ui0U.p() > 4 && ui0U.m(0).equals("projects") && ui0U.m(2).equals("databases") && ui0U.m(4).equals("documents"), "Tried to parse an invalid key: %s", ui0U);
        return l((UI0) ui0U.q(5));
    }

    public static TC l(UI0 ui0) {
        return new TC(ui0);
    }

    public static TC m(List list) {
        return new TC(UI0.t(list));
    }

    public static boolean s(UI0 ui0) {
        return ui0.p() % 2 == 0;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(TC tc) {
        return this.B.compareTo(tc.B);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TC.class != obj.getClass()) {
            return false;
        }
        return this.B.equals(((TC) obj).B);
    }

    public int hashCode() {
        return this.B.hashCode();
    }

    public String n() {
        return this.B.m(r0.p() - 2);
    }

    public UI0 o() {
        return (UI0) this.B.r();
    }

    public String p() {
        return this.B.l();
    }

    public UI0 q() {
        return this.B;
    }

    public boolean r(String str) {
        if (this.B.p() < 2) {
            return false;
        }
        UI0 ui0 = this.B;
        return ((String) ui0.B.get(ui0.p() - 2)).equals(str);
    }

    public String toString() {
        return this.B.toString();
    }
}
