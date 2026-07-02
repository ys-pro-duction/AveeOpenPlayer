package com.daaw;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Fe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0840Fe implements Comparable {
    public final List B;

    public AbstractC0840Fe(List list) {
        this.B = list;
    }

    public AbstractC0840Fe a(AbstractC0840Fe abstractC0840Fe) {
        ArrayList arrayList = new ArrayList(this.B);
        arrayList.addAll(abstractC0840Fe.B);
        return k(arrayList);
    }

    public AbstractC0840Fe c(String str) {
        ArrayList arrayList = new ArrayList(this.B);
        arrayList.add(str);
        return k(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbstractC0840Fe) && compareTo((AbstractC0840Fe) obj) == 0;
    }

    public abstract String g();

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public int compareTo(AbstractC0840Fe abstractC0840Fe) {
        int iP = p();
        int iP2 = abstractC0840Fe.p();
        for (int i = 0; i < iP && i < iP2; i++) {
            int iCompareTo = m(i).compareTo(abstractC0840Fe.m(i));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return AbstractC6838nb1.l(iP, iP2);
    }

    public int hashCode() {
        return ((getClass().hashCode() + 37) * 37) + this.B.hashCode();
    }

    public abstract AbstractC0840Fe k(List list);

    public String l() {
        return (String) this.B.get(p() - 1);
    }

    public String m(int i) {
        return (String) this.B.get(i);
    }

    public boolean n() {
        return p() == 0;
    }

    public boolean o(AbstractC0840Fe abstractC0840Fe) {
        if (p() > abstractC0840Fe.p()) {
            return false;
        }
        for (int i = 0; i < p(); i++) {
            if (!m(i).equals(abstractC0840Fe.m(i))) {
                return false;
            }
        }
        return true;
    }

    public int p() {
        return this.B.size();
    }

    public AbstractC0840Fe q(int i) {
        int iP = p();
        AbstractC6557mb.d(iP >= i, "Can't call popFirst with count > length() (%d > %d)", Integer.valueOf(i), Integer.valueOf(iP));
        return k(this.B.subList(i, iP));
    }

    public AbstractC0840Fe r() {
        return k(this.B.subList(0, p() - 1));
    }

    public String toString() {
        return g();
    }
}
