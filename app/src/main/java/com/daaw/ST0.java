package com.daaw;

import com.daaw.C7604qK;
import j$.util.DesugarCollections;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ST0 extends AbstractMap {
    public final int B;
    public List C;
    public Map D;
    public boolean E;
    public volatile e F;

    public static class a extends ST0 {
        public a(int i) {
            super(i, null);
        }

        @Override // com.daaw.ST0
        public void n() {
            if (!m()) {
                for (int i = 0; i < j(); i++) {
                    Map.Entry entryI = i(i);
                    if (((C7604qK.b) entryI.getKey()).d()) {
                        entryI.setValue(DesugarCollections.unmodifiableList((List) entryI.getValue()));
                    }
                }
                for (Map.Entry entry : k()) {
                    if (((C7604qK.b) entry.getKey()).d()) {
                        entry.setValue(DesugarCollections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.n();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.p((C7604qK.b) obj, obj2);
        }
    }

    public static class b {
        public static final Iterator a = new a();
        public static final Iterable b = new C0117b();

        public static class a implements Iterator {
            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* JADX INFO: renamed from: com.daaw.ST0$b$b, reason: collision with other inner class name */
        public static class C0117b implements Iterable {
            @Override // java.lang.Iterable
            public Iterator iterator() {
                return b.a;
            }
        }

        public static Iterable b() {
            return b;
        }
    }

    public class c implements Comparable, Map.Entry {
        public final Comparable B;
        public Object C;

        public c(ST0 st0, Map.Entry entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            return getKey().compareTo(cVar.getKey());
        }

        public final boolean c(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return c(this.B, entry.getKey()) && c(this.C, entry.getValue());
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Comparable getKey() {
            return this.B;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.C;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Comparable comparable = this.B;
            int iHashCode = comparable == null ? 0 : comparable.hashCode();
            Object obj = this.C;
            return iHashCode ^ (obj != null ? obj.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            ST0.this.g();
            Object obj2 = this.C;
            this.C = obj;
            return obj2;
        }

        public String toString() {
            String strValueOf = String.valueOf(this.B);
            String strValueOf2 = String.valueOf(this.C);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 1 + strValueOf2.length());
            sb.append(strValueOf);
            sb.append("=");
            sb.append(strValueOf2);
            return sb.toString();
        }

        public c(Comparable comparable, Object obj) {
            this.B = comparable;
            this.C = obj;
        }
    }

    public class e extends AbstractSet {
        public e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            ST0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = ST0.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry entry) {
            if (contains(entry)) {
                return false;
            }
            ST0.this.p((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new d(ST0.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            ST0.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return ST0.this.size();
        }

        public /* synthetic */ e(ST0 st0, a aVar) {
            this();
        }
    }

    public /* synthetic */ ST0(int i, a aVar) {
        this(i);
    }

    public static ST0 o(int i) {
        return new a(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        g();
        if (!this.C.isEmpty()) {
            this.C.clear();
        }
        if (this.D.isEmpty()) {
            return;
        }
        this.D.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return f(comparable) >= 0 || this.D.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.F == null) {
            this.F = new e(this, null);
        }
        return this.F;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(java.lang.Comparable r5) {
        /*
            r4 = this;
            java.util.List r0 = r4.C
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L23
            java.util.List r2 = r4.C
            java.lang.Object r2 = r2.get(r1)
            com.daaw.ST0$c r2 = (com.daaw.ST0.c) r2
            java.lang.Comparable r2 = r2.getKey()
            int r2 = r5.compareTo(r2)
            if (r2 <= 0) goto L20
            int r0 = r0 + 1
        L1e:
            int r5 = -r0
            return r5
        L20:
            if (r2 != 0) goto L23
            return r1
        L23:
            r0 = 0
        L24:
            if (r0 > r1) goto L47
            int r2 = r0 + r1
            int r2 = r2 / 2
            java.util.List r3 = r4.C
            java.lang.Object r3 = r3.get(r2)
            com.daaw.ST0$c r3 = (com.daaw.ST0.c) r3
            java.lang.Comparable r3 = r3.getKey()
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L40
            int r2 = r2 + (-1)
            r1 = r2
            goto L24
        L40:
            if (r3 <= 0) goto L46
            int r2 = r2 + 1
            r0 = r2
            goto L24
        L46:
            return r2
        L47:
            int r0 = r0 + 1
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.ST0.f(java.lang.Comparable):int");
    }

    public final void g() {
        if (this.E) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iF = f(comparable);
        return iF >= 0 ? ((c) this.C.get(iF)).getValue() : this.D.get(comparable);
    }

    public final void h() {
        g();
        if (!this.C.isEmpty() || (this.C instanceof ArrayList)) {
            return;
        }
        this.C = new ArrayList(this.B);
    }

    public Map.Entry i(int i) {
        return (Map.Entry) this.C.get(i);
    }

    public int j() {
        return this.C.size();
    }

    public Iterable k() {
        return this.D.isEmpty() ? b.b() : this.D.entrySet();
    }

    public final SortedMap l() {
        g();
        if (this.D.isEmpty() && !(this.D instanceof TreeMap)) {
            this.D = new TreeMap();
        }
        return (SortedMap) this.D;
    }

    public boolean m() {
        return this.E;
    }

    public void n() {
        if (this.E) {
            return;
        }
        this.D = this.D.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(this.D);
        this.E = true;
    }

    public Object p(Comparable comparable, Object obj) {
        g();
        int iF = f(comparable);
        if (iF >= 0) {
            return ((c) this.C.get(iF)).setValue(obj);
        }
        h();
        int i = -(iF + 1);
        if (i >= this.B) {
            return l().put(comparable, obj);
        }
        int size = this.C.size();
        int i2 = this.B;
        if (size == i2) {
            c cVar = (c) this.C.remove(i2 - 1);
            l().put(cVar.getKey(), cVar.getValue());
        }
        this.C.add(i, new c(comparable, obj));
        return null;
    }

    public final Object r(int i) {
        g();
        Object value = ((c) this.C.remove(i)).getValue();
        if (!this.D.isEmpty()) {
            Iterator it = l().entrySet().iterator();
            this.C.add(new c(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        g();
        Comparable comparable = (Comparable) obj;
        int iF = f(comparable);
        if (iF >= 0) {
            return r(iF);
        }
        if (this.D.isEmpty()) {
            return null;
        }
        return this.D.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.C.size() + this.D.size();
    }

    public class d implements Iterator {
        public int B;
        public boolean C;
        public Iterator D;

        public d() {
            this.B = -1;
        }

        public final Iterator a() {
            if (this.D == null) {
                this.D = ST0.this.D.entrySet().iterator();
            }
            return this.D;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            this.C = true;
            int i = this.B + 1;
            this.B = i;
            return i < ST0.this.C.size() ? (Map.Entry) ST0.this.C.get(this.B) : (Map.Entry) a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.B + 1 < ST0.this.C.size() || a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.C) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.C = false;
            ST0.this.g();
            if (this.B >= ST0.this.C.size()) {
                a().remove();
                return;
            }
            ST0 st0 = ST0.this;
            int i = this.B;
            this.B = i - 1;
            st0.r(i);
        }

        public /* synthetic */ d(ST0 st0, a aVar) {
            this();
        }
    }

    public ST0(int i) {
        this.B = i;
        this.C = Collections.EMPTY_LIST;
        this.D = Collections.EMPTY_MAP;
    }
}
