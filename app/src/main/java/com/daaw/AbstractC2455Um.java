package com.daaw;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.Um, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2455Um extends AbstractC2351Tm {

    /* JADX INFO: renamed from: com.daaw.Um$a */
    public static final class a implements KP0 {
        public final /* synthetic */ Iterable a;

        public a(Iterable iterable) {
            this.a = iterable;
        }

        @Override // com.daaw.KP0
        public Iterator iterator() {
            return this.a.iterator();
        }
    }

    /* JADX INFO: renamed from: com.daaw.Um$b */
    public static final class b extends AbstractC4192e90 implements LQ {
        public final /* synthetic */ Iterable B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Iterable iterable) {
            super(0);
            this.B = iterable;
        }

        @Override // com.daaw.LQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Iterator invoke() {
            return this.B.iterator();
        }
    }

    public static List A0(Collection collection, Object obj) {
        G10.g(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static Object B0(Iterable iterable) {
        G10.g(iterable, "<this>");
        if (iterable instanceof List) {
            return C0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static Object C0(List list) {
        G10.g(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static Object D0(Iterable iterable) {
        G10.g(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return list.get(0);
            }
            return null;
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    public static Object E0(List list) {
        G10.g(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static List F0(List list, H00 h00) {
        G10.g(list, "<this>");
        G10.g(h00, "indices");
        return h00.isEmpty() ? AbstractC1599Mm.k() : M0(list.subList(h00.E().intValue(), h00.D().intValue() + 1));
    }

    public static List G0(Iterable iterable) {
        G10.g(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List listN0 = N0(iterable);
            AbstractC2037Qm.y(listN0);
            return listN0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return M0(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        AbstractC5152hb.v((Comparable[]) array);
        return AbstractC5152hb.d(array);
    }

    public static List H0(Iterable iterable, Comparator comparator) {
        G10.g(iterable, "<this>");
        G10.g(comparator, "comparator");
        if (!(iterable instanceof Collection)) {
            List listN0 = N0(iterable);
            AbstractC2037Qm.z(listN0, comparator);
            return listN0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return M0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        AbstractC5152hb.w(array, comparator);
        return AbstractC5152hb.d(array);
    }

    public static final List I0(Iterable iterable, int i) {
        G10.g(iterable, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return AbstractC1599Mm.k();
        }
        if (iterable instanceof Collection) {
            if (i >= ((Collection) iterable).size()) {
                return M0(iterable);
            }
            if (i == 1) {
                return AbstractC1496Lm.e(d0(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return AbstractC1599Mm.r(arrayList);
    }

    public static List J0(List list, int i) {
        G10.g(list, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return AbstractC1599Mm.k();
        }
        int size = list.size();
        if (i >= size) {
            return M0(list);
        }
        if (i == 1) {
            return AbstractC1496Lm.e(p0(list));
        }
        ArrayList arrayList = new ArrayList(i);
        if (list instanceof RandomAccess) {
            for (int i2 = size - i; i2 < size; i2++) {
                arrayList.add(list.get(i2));
            }
        } else {
            ListIterator listIterator = list.listIterator(size - i);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static final Collection K0(Iterable iterable, Collection collection) {
        G10.g(iterable, "<this>");
        G10.g(collection, "destination");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
        return collection;
    }

    public static int[] L0(Collection collection) {
        G10.g(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static List M0(Iterable iterable) {
        G10.g(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return AbstractC1599Mm.r(N0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return AbstractC1599Mm.k();
        }
        if (size != 1) {
            return O0(collection);
        }
        return AbstractC1496Lm.e(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static final List N0(Iterable iterable) {
        G10.g(iterable, "<this>");
        return iterable instanceof Collection ? O0((Collection) iterable) : (List) K0(iterable, new ArrayList());
    }

    public static List O0(Collection collection) {
        G10.g(collection, "<this>");
        return new ArrayList(collection);
    }

    public static Set P0(Iterable iterable) {
        G10.g(iterable, "<this>");
        return iterable instanceof Collection ? new LinkedHashSet((Collection) iterable) : (Set) K0(iterable, new LinkedHashSet());
    }

    public static Set Q0(Iterable iterable) {
        G10.g(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return AbstractC9867yQ0.f((Set) K0(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return AbstractC9867yQ0.d();
        }
        if (size != 1) {
            return (Set) K0(iterable, new LinkedHashSet(AbstractC1369Kg0.d(collection.size())));
        }
        return AbstractC9588xQ0.c(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static Set R0(Iterable iterable, Iterable iterable2) {
        G10.g(iterable, "<this>");
        G10.g(iterable2, "other");
        Set setP0 = P0(iterable);
        AbstractC2141Rm.A(setP0, iterable2);
        return setP0;
    }

    public static Iterable S0(Iterable iterable) {
        G10.g(iterable, "<this>");
        return new C8779uZ(new b(iterable));
    }

    public static List T0(Iterable iterable, Iterable iterable2) {
        G10.g(iterable, "<this>");
        G10.g(iterable2, "other");
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(AbstractC1703Nm.v(iterable, 10), AbstractC1703Nm.v(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(D61.a(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static boolean U(Iterable iterable, NQ nq) {
        G10.g(iterable, "<this>");
        G10.g(nq, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (!((Boolean) nq.invoke(it.next())).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static KP0 V(Iterable iterable) {
        G10.g(iterable, "<this>");
        return new a(iterable);
    }

    public static boolean W(Iterable iterable, Object obj) {
        G10.g(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).contains(obj) : i0(iterable, obj) >= 0;
    }

    public static List X(Iterable iterable) {
        G10.g(iterable, "<this>");
        return M0(P0(iterable));
    }

    public static List Y(Iterable iterable, int i) {
        ArrayList arrayList;
        G10.g(iterable, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return M0(iterable);
        }
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size() - i;
            if (size <= 0) {
                return AbstractC1599Mm.k();
            }
            if (size == 1) {
                return AbstractC1496Lm.e(o0(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    int size2 = collection.size();
                    while (i < size2) {
                        arrayList.add(((List) iterable).get(i));
                        i++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i2 = 0;
        for (Object obj : iterable) {
            if (i2 >= i) {
                arrayList.add(obj);
            } else {
                i2++;
            }
        }
        return AbstractC1599Mm.r(arrayList);
    }

    public static List Z(List list, int i) {
        G10.g(list, "<this>");
        if (i >= 0) {
            return I0(list, AbstractC8417tE0.d(list.size() - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    public static List a0(Iterable iterable, NQ nq) {
        G10.g(iterable, "<this>");
        G10.g(nq, "predicate");
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (((Boolean) nq.invoke(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static List b0(Iterable iterable) {
        G10.g(iterable, "<this>");
        return (List) c0(iterable, new ArrayList());
    }

    public static final Collection c0(Iterable iterable, Collection collection) {
        G10.g(iterable, "<this>");
        G10.g(collection, "destination");
        for (Object obj : iterable) {
            if (obj != null) {
                collection.add(obj);
            }
        }
        return collection;
    }

    public static Object d0(Iterable iterable) {
        G10.g(iterable, "<this>");
        if (iterable instanceof List) {
            return e0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object e0(List list) {
        G10.g(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object f0(Iterable iterable) {
        G10.g(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static Object g0(List list) {
        G10.g(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object h0(List list, int i) {
        G10.g(list, "<this>");
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static final int i0(Iterable iterable, Object obj) {
        G10.g(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i = 0;
        for (Object obj2 : iterable) {
            if (i < 0) {
                AbstractC1599Mm.u();
            }
            if (G10.c(obj, obj2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static Set j0(Iterable iterable, Iterable iterable2) {
        G10.g(iterable, "<this>");
        G10.g(iterable2, "other");
        Set setP0 = P0(iterable);
        AbstractC2141Rm.L(setP0, iterable2);
        return setP0;
    }

    public static final Appendable k0(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, NQ nq) throws IOException {
        G10.g(iterable, "<this>");
        G10.g(appendable, "buffer");
        G10.g(charSequence, "separator");
        G10.g(charSequence2, "prefix");
        G10.g(charSequence3, "postfix");
        G10.g(charSequence4, "truncated");
        appendable.append(charSequence2);
        int i2 = 0;
        for (Object obj : iterable) {
            i2++;
            if (i2 > 1) {
                appendable.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            AbstractC8218sY0.a(appendable, obj, nq);
        }
        if (i >= 0 && i2 > i) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    public static final String m0(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, NQ nq) {
        G10.g(iterable, "<this>");
        G10.g(charSequence, "separator");
        G10.g(charSequence2, "prefix");
        G10.g(charSequence3, "postfix");
        G10.g(charSequence4, "truncated");
        String string = ((StringBuilder) k0(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, nq)).toString();
        G10.f(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String n0(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, NQ nq, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i2 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i2 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i2 & 8) != 0) {
            i = -1;
        }
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i2 & 32) != 0) {
            nq = null;
        }
        CharSequence charSequence5 = charSequence4;
        NQ nq2 = nq;
        return m0(iterable, charSequence, charSequence2, charSequence3, i, charSequence5, nq2);
    }

    public static Object o0(Iterable iterable) {
        G10.g(iterable, "<this>");
        if (iterable instanceof List) {
            return p0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static Object p0(List list) {
        G10.g(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(AbstractC1599Mm.m(list));
    }

    public static Object q0(Iterable iterable) {
        G10.g(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(list.size() - 1);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static Object r0(List list) {
        G10.g(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static List s0(Iterable iterable, NQ nq) {
        G10.g(iterable, "<this>");
        G10.g(nq, "transform");
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(nq.invoke(it.next()));
        }
        return arrayList;
    }

    public static Float t0(Iterable iterable) {
        G10.g(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    public static Comparable u0(Iterable iterable) {
        G10.g(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Float v0(Iterable iterable) {
        G10.g(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    public static List w0(Iterable iterable, Object obj) {
        G10.g(iterable, "<this>");
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(iterable, 10));
        boolean z = false;
        for (Object obj2 : iterable) {
            boolean z2 = true;
            if (!z && G10.c(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static List x0(Iterable iterable, Iterable iterable2) {
        G10.g(iterable, "<this>");
        G10.g(iterable2, "elements");
        if (iterable instanceof Collection) {
            return z0((Collection) iterable, iterable2);
        }
        ArrayList arrayList = new ArrayList();
        AbstractC2141Rm.A(arrayList, iterable);
        AbstractC2141Rm.A(arrayList, iterable2);
        return arrayList;
    }

    public static List y0(Iterable iterable, Object obj) {
        G10.g(iterable, "<this>");
        if (iterable instanceof Collection) {
            return A0((Collection) iterable, obj);
        }
        ArrayList arrayList = new ArrayList();
        AbstractC2141Rm.A(arrayList, iterable);
        arrayList.add(obj);
        return arrayList;
    }

    public static List z0(Collection collection, Iterable iterable) {
        G10.g(collection, "<this>");
        G10.g(iterable, "elements");
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            AbstractC2141Rm.A(arrayList, iterable);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection.size() + collection2.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }
}
