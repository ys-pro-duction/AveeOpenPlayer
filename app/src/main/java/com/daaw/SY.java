package com.daaw;

import com.daaw.SY;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SY implements Iterable {

    public static class a {
        public static final InterfaceC0118a a = new InterfaceC0118a() { // from class: com.daaw.RY
            @Override // com.daaw.SY.a.InterfaceC0118a
            public final Object a(Object obj) {
                return SY.a.a(obj);
            }
        };

        /* JADX INFO: renamed from: com.daaw.SY$a$a, reason: collision with other inner class name */
        public interface InterfaceC0118a {
            Object a(Object obj);
        }

        public static /* synthetic */ Object a(Object obj) {
            return obj;
        }

        public static SY b(List list, Map map, InterfaceC0118a interfaceC0118a, Comparator comparator) {
            return list.size() < 25 ? C2927Za.G(list, map, interfaceC0118a, comparator) : C5616jE0.D(list, map, interfaceC0118a, comparator);
        }

        public static SY c(Comparator comparator) {
            return new C2927Za(comparator);
        }

        public static InterfaceC0118a d() {
            return a;
        }
    }

    public abstract boolean e(Object obj);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SY)) {
            return false;
        }
        SY sy = (SY) obj;
        if (!p().equals(sy.p()) || size() != sy.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = sy.iterator();
        while (it.hasNext()) {
            if (!((Map.Entry) it.next()).equals(it2.next())) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int iHashCode = p().hashCode();
        Iterator it = iterator();
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + ((Map.Entry) it.next()).hashCode();
        }
        return iHashCode;
    }

    public abstract boolean isEmpty();

    @Override // java.lang.Iterable
    public abstract Iterator iterator();

    public abstract Object m(Object obj);

    public abstract Comparator p();

    public abstract Object q();

    public abstract Object s();

    public abstract int size();

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("{");
        Iterator it = iterator();
        boolean z = true;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append("(");
            sb.append(entry.getKey());
            sb.append("=>");
            sb.append(entry.getValue());
            sb.append(")");
        }
        sb.append("};");
        return sb.toString();
    }

    public abstract SY v(Object obj, Object obj2);

    public abstract Iterator w(Object obj);

    public abstract SY y(Object obj);
}
