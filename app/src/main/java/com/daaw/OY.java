package com.daaw;

import com.daaw.IY;
import j$.util.Map;
import j$.util.Objects;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: loaded from: classes3.dex */
public abstract class OY implements Map, Serializable, j$.util.Map {
    public static final Map.Entry[] E = new Map.Entry[0];
    public transient PY B;
    public transient PY C;
    public transient IY D;

    public static class a {
        public Comparator a;
        public Object[] b;
        public int c = 0;
        public boolean d = false;
        public C0096a e;

        /* JADX INFO: renamed from: com.daaw.OY$a$a, reason: collision with other inner class name */
        public static final class C0096a {
            public final Object a;
            public final Object b;
            public final Object c;

            public C0096a(Object obj, Object obj2, Object obj3) {
                this.a = obj;
                this.b = obj2;
                this.c = obj3;
            }

            public IllegalArgumentException a() {
                String strValueOf = String.valueOf(this.a);
                String strValueOf2 = String.valueOf(this.b);
                String strValueOf3 = String.valueOf(this.a);
                String strValueOf4 = String.valueOf(this.c);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 39 + strValueOf2.length() + strValueOf3.length() + strValueOf4.length());
                sb.append("Multiple entries with same key: ");
                sb.append(strValueOf);
                sb.append("=");
                sb.append(strValueOf2);
                sb.append(" and ");
                sb.append(strValueOf3);
                sb.append("=");
                sb.append(strValueOf4);
                return new IllegalArgumentException(sb.toString());
            }
        }

        public a(int i) {
            this.b = new Object[i * 2];
        }

        public static void i(Object[] objArr, int i, Comparator comparator) {
            Map.Entry[] entryArr = new Map.Entry[i];
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = i2 * 2;
                Object obj = objArr[i3];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i3 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i2] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, i, AbstractC5511ir0.a(comparator).b(AbstractC1161Ig0.c()));
            for (int i4 = 0; i4 < i; i4++) {
                int i5 = i4 * 2;
                objArr[i5] = entryArr[i4].getKey();
                objArr[i5 + 1] = entryArr[i4].getValue();
            }
        }

        public OY a() {
            return c();
        }

        public final OY b(boolean z) {
            Object[] objArrE;
            C0096a c0096a;
            C0096a c0096a2;
            if (z && (c0096a2 = this.e) != null) {
                throw c0096a2.a();
            }
            int length = this.c;
            if (this.a == null) {
                objArrE = this.b;
            } else {
                if (this.d) {
                    this.b = Arrays.copyOf(this.b, length * 2);
                }
                objArrE = this.b;
                if (!z) {
                    objArrE = e(objArrE, this.c);
                    if (objArrE.length < this.b.length) {
                        length = objArrE.length >>> 1;
                    }
                }
                i(objArrE, length, this.a);
            }
            this.d = true;
            C8990vG0 c8990vG0L = C8990vG0.l(length, objArrE, this);
            if (!z || (c0096a = this.e) == null) {
                return c8990vG0L;
            }
            throw c0096a.a();
        }

        public OY c() {
            return b(true);
        }

        public final void d(int i) {
            int i2 = i * 2;
            Object[] objArr = this.b;
            if (i2 > objArr.length) {
                this.b = Arrays.copyOf(objArr, IY.b.a(objArr.length, i2));
                this.d = false;
            }
        }

        public final Object[] e(Object[] objArr, int i) {
            HashSet hashSet = new HashSet();
            BitSet bitSet = new BitSet();
            for (int i2 = i - 1; i2 >= 0; i2--) {
                Object obj = objArr[i2 * 2];
                Objects.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    bitSet.set(i2);
                }
            }
            if (bitSet.isEmpty()) {
                return objArr;
            }
            Object[] objArr2 = new Object[(i - bitSet.cardinality()) * 2];
            int i3 = 0;
            int i4 = 0;
            while (i3 < i * 2) {
                if (bitSet.get(i3 >>> 1)) {
                    i3 += 2;
                } else {
                    int i5 = i4 + 1;
                    int i6 = i3 + 1;
                    Object obj2 = objArr[i3];
                    Objects.requireNonNull(obj2);
                    objArr2[i4] = obj2;
                    i4 += 2;
                    i3 += 2;
                    Object obj3 = objArr[i6];
                    Objects.requireNonNull(obj3);
                    objArr2[i5] = obj3;
                }
            }
            return objArr2;
        }

        public a f(Object obj, Object obj2) {
            d(this.c + 1);
            AbstractC0768Em.a(obj, obj2);
            Object[] objArr = this.b;
            int i = this.c;
            objArr[i * 2] = obj;
            objArr[(i * 2) + 1] = obj2;
            this.c = i + 1;
            return this;
        }

        public a g(Map.Entry entry) {
            return f(entry.getKey(), entry.getValue());
        }

        public a h(Iterable iterable) {
            if (iterable instanceof Collection) {
                d(this.c + ((Collection) iterable).size());
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                g((Map.Entry) it.next());
            }
            return this;
        }
    }

    public static OY b(Iterable iterable) {
        a aVar = new a(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        aVar.h(iterable);
        return aVar.a();
    }

    public static OY c(Map map) {
        if ((map instanceof OY) && !(map instanceof SortedMap)) {
            OY oy = (OY) map;
            if (!oy.h()) {
                return oy;
            }
        }
        return b(map.entrySet());
    }

    public static OY j() {
        return C8990vG0.I;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public abstract PY d();

    public abstract PY e();

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return AbstractC1161Ig0.a(this, obj);
    }

    public abstract IY f();

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public PY entrySet() {
        PY py = this.B;
        if (py != null) {
            return py;
        }
        PY pyD = d();
        this.B = pyD;
        return pyD;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    public abstract boolean h();

    @Override // java.util.Map
    public int hashCode() {
        return AbstractC9309wQ0.b(entrySet());
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public PY keySet() {
        PY py = this.C;
        if (py != null) {
            return py;
        }
        PY pyE = e();
        this.C = pyE;
        return pyE;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public IY values() {
        IY iy = this.D;
        if (iy != null) {
            return iy;
        }
        IY iyF = f();
        this.D = iyF;
        return iyF;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean remove(Object obj, Object obj2) {
        return Map.CC.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    public String toString() {
        return AbstractC1161Ig0.b(this);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }
}
