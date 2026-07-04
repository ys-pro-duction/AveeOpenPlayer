package com.daaw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.daaw.lp1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6350lp1 implements Iterable, InterfaceC1637Mv1, InterfaceC7486pt1 {
    public final SortedMap B;
    public final Map C;

    public C6350lp1() {
        this.B = new TreeMap();
        this.C = new TreeMap();
    }

    public final List D() {
        ArrayList arrayList = new ArrayList(s());
        for (int i = 0; i < s(); i++) {
            arrayList.add(v(i));
        }
        return arrayList;
    }

    public final void E() {
        this.B.clear();
    }

    public final void F(int i, InterfaceC1637Mv1 interfaceC1637Mv1) {
        if (i < 0) {
            throw new IllegalArgumentException("Invalid value index: " + i);
        }
        if (i >= s()) {
            H(i, interfaceC1637Mv1);
            return;
        }
        for (int iIntValue = ((Integer) this.B.lastKey()).intValue(); iIntValue >= i; iIntValue--) {
            SortedMap sortedMap = this.B;
            Integer numValueOf = Integer.valueOf(iIntValue);
            InterfaceC1637Mv1 interfaceC1637Mv12 = (InterfaceC1637Mv1) sortedMap.get(numValueOf);
            if (interfaceC1637Mv12 != null) {
                H(iIntValue + 1, interfaceC1637Mv12);
                this.B.remove(numValueOf);
            }
        }
        H(i, interfaceC1637Mv1);
    }

    public final void G(int i) {
        int iIntValue = ((Integer) this.B.lastKey()).intValue();
        if (i > iIntValue || i < 0) {
            return;
        }
        this.B.remove(Integer.valueOf(i));
        if (i == iIntValue) {
            SortedMap sortedMap = this.B;
            int i2 = i - 1;
            Integer numValueOf = Integer.valueOf(i2);
            if (sortedMap.containsKey(numValueOf) || i2 < 0) {
                return;
            }
            this.B.put(numValueOf, InterfaceC1637Mv1.t);
            return;
        }
        while (true) {
            i++;
            if (i > ((Integer) this.B.lastKey()).intValue()) {
                return;
            }
            SortedMap sortedMap2 = this.B;
            Integer numValueOf2 = Integer.valueOf(i);
            InterfaceC1637Mv1 interfaceC1637Mv1 = (InterfaceC1637Mv1) sortedMap2.get(numValueOf2);
            if (interfaceC1637Mv1 != null) {
                this.B.put(Integer.valueOf(i - 1), interfaceC1637Mv1);
                this.B.remove(numValueOf2);
            }
        }
    }

    public final void H(int i, InterfaceC1637Mv1 interfaceC1637Mv1) {
        if (i > 32468) {
            throw new IllegalStateException("Array too large");
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException("Out of bounds index: " + i);
        }
        if (interfaceC1637Mv1 == null) {
            this.B.remove(Integer.valueOf(i));
        } else {
            this.B.put(Integer.valueOf(i), interfaceC1637Mv1);
        }
    }

    public final boolean I(int i) {
        if (i >= 0 && i <= ((Integer) this.B.lastKey()).intValue()) {
            return this.B.containsKey(Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException("Out of bounds index: " + i);
    }

    @Override // com.daaw.InterfaceC7486pt1
    public final InterfaceC1637Mv1 e(String str) {
        InterfaceC1637Mv1 interfaceC1637Mv1;
        return "length".equals(str) ? new C1825Oq1(Double.valueOf(s())) : (!zzt(str) || (interfaceC1637Mv1 = (InterfaceC1637Mv1) this.C.get(str)) == null) ? InterfaceC1637Mv1.t : interfaceC1637Mv1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6350lp1)) {
            return false;
        }
        C6350lp1 c6350lp1 = (C6350lp1) obj;
        if (s() != c6350lp1.s()) {
            return false;
        }
        if (this.B.isEmpty()) {
            return c6350lp1.B.isEmpty();
        }
        for (int iIntValue = ((Integer) this.B.firstKey()).intValue(); iIntValue <= ((Integer) this.B.lastKey()).intValue(); iIntValue++) {
            if (!v(iIntValue).equals(c6350lp1.v(iIntValue))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.B.hashCode() * 31;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0561Co1(this);
    }

    @Override // com.daaw.InterfaceC1637Mv1
    public final InterfaceC1637Mv1 m(String str, ES2 es2, List list) {
        return ("concat".equals(str) || "every".equals(str) || "filter".equals(str) || "forEach".equals(str) || "indexOf".equals(str) || "join".equals(str) || "lastIndexOf".equals(str) || "map".equals(str) || "pop".equals(str) || "push".equals(str) || "reduce".equals(str) || "reduceRight".equals(str) || "reverse".equals(str) || "shift".equals(str) || "slice".equals(str) || "some".equals(str) || "sort".equals(str) || "splice".equals(str) || "toString".equals(str) || "unshift".equals(str)) ? HD1.a(str, this, es2, list) : AbstractC4113ds1.a(this, new C6391ly1(str), es2, list);
    }

    @Override // com.daaw.InterfaceC7486pt1
    public final void p(String str, InterfaceC1637Mv1 interfaceC1637Mv1) {
        if (interfaceC1637Mv1 == null) {
            this.C.remove(str);
        } else {
            this.C.put(str, interfaceC1637Mv1);
        }
    }

    public final int q() {
        return this.B.size();
    }

    public final int s() {
        if (this.B.isEmpty()) {
            return 0;
        }
        return ((Integer) this.B.lastKey()).intValue() + 1;
    }

    public final String toString() {
        return w(",");
    }

    public final InterfaceC1637Mv1 v(int i) {
        InterfaceC1637Mv1 interfaceC1637Mv1;
        if (i < s()) {
            return (!I(i) || (interfaceC1637Mv1 = (InterfaceC1637Mv1) this.B.get(Integer.valueOf(i))) == null) ? InterfaceC1637Mv1.t : interfaceC1637Mv1;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    public final String w(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        if (!this.B.isEmpty()) {
            int i = 0;
            while (true) {
                str2 = str == null ? "" : str;
                if (i >= s()) {
                    break;
                }
                InterfaceC1637Mv1 interfaceC1637Mv1V = v(i);
                sb.append(str2);
                if (!(interfaceC1637Mv1V instanceof C2401Ty1) && !(interfaceC1637Mv1V instanceof C0377Au1)) {
                    sb.append(interfaceC1637Mv1V.zzi());
                }
                i++;
            }
            sb.delete(0, str2.length());
        }
        return sb.toString();
    }

    public final Iterator y() {
        return this.B.keySet().iterator();
    }

    @Override // com.daaw.InterfaceC1637Mv1
    public final InterfaceC1637Mv1 zzd() {
        C6350lp1 c6350lp1 = new C6350lp1();
        for (Map.Entry entry : this.B.entrySet()) {
            if (entry.getValue() instanceof InterfaceC7486pt1) {
                c6350lp1.B.put((Integer) entry.getKey(), (InterfaceC1637Mv1) entry.getValue());
            } else {
                c6350lp1.B.put((Integer) entry.getKey(), ((InterfaceC1637Mv1) entry.getValue()).zzd());
            }
        }
        return c6350lp1;
    }

    @Override // com.daaw.InterfaceC1637Mv1
    public final Boolean zzg() {
        return Boolean.TRUE;
    }

    @Override // com.daaw.InterfaceC1637Mv1
    public final Double zzh() {
        return this.B.size() == 1 ? v(0).zzh() : this.B.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    @Override // com.daaw.InterfaceC1637Mv1
    public final String zzi() {
        return w(",");
    }

    @Override // com.daaw.InterfaceC1637Mv1
    public final Iterator zzl() {
        return new C2773Xn1(this, this.B.keySet().iterator(), this.C.keySet().iterator());
    }

    @Override // com.daaw.InterfaceC7486pt1
    public final boolean zzt(String str) {
        return "length".equals(str) || this.C.containsKey(str);
    }

    public C6350lp1(List list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                H(i, (InterfaceC1637Mv1) list.get(i));
            }
        }
    }
}
