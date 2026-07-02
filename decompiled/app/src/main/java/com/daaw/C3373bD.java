package com.daaw;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.bD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3373bD implements Iterable {
    public final SY B;
    public final UY C;

    public C3373bD(SY sy, UY uy) {
        this.B = sy;
        this.C = uy;
    }

    public static /* synthetic */ int e(Comparator comparator, LC lc, LC lc2) {
        int iCompare = comparator.compare(lc, lc2);
        return iCompare == 0 ? LC.a.compare(lc, lc2) : iCompare;
    }

    public static C3373bD p(final Comparator comparator) {
        return new C3373bD(NC.a(), new UY(Collections.EMPTY_LIST, new Comparator() { // from class: com.daaw.aD
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C3373bD.e(comparator, (LC) obj, (LC) obj2);
            }
        }));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3373bD.class != obj.getClass()) {
            return false;
        }
        C3373bD c3373bD = (C3373bD) obj;
        if (size() != c3373bD.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c3373bD.iterator();
        while (it.hasNext()) {
            if (!((LC) it.next()).equals((LC) it2.next())) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            LC lc = (LC) it.next();
            iHashCode = (((iHashCode * 31) + lc.getKey().hashCode()) * 31) + lc.h().hashCode();
        }
        return iHashCode;
    }

    public boolean isEmpty() {
        return this.B.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.C.iterator();
    }

    public C3373bD m(LC lc) {
        C3373bD c3373bDW = w(lc.getKey());
        return new C3373bD(c3373bDW.B.v(lc.getKey(), lc), c3373bDW.C.p(lc));
    }

    public LC q(TC tc) {
        return (LC) this.B.m(tc);
    }

    public LC s() {
        return (LC) this.C.m();
    }

    public int size() {
        return this.B.size();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        boolean z = true;
        while (it.hasNext()) {
            LC lc = (LC) it.next();
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(lc);
        }
        sb.append("]");
        return sb.toString();
    }

    public LC v() {
        return (LC) this.C.e();
    }

    public C3373bD w(TC tc) {
        LC lc = (LC) this.B.m(tc);
        return lc == null ? this : new C3373bD(this.B.y(tc), this.C.s(lc));
    }
}
