package com.daaw;

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

/* JADX INFO: loaded from: classes3.dex */
public abstract class TT0 extends AbstractMap {
    public final int B;
    public List C;
    public Map D;
    public boolean E;
    public volatile g F;
    public Map G;
    public volatile c H;

    public static class a extends TT0 {
        public a(int i) {
            super(i, null);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            AbstractC6314li0.a(obj);
            return super.t(null, obj2);
        }

        @Override // com.daaw.TT0
        public void r() {
            if (!p()) {
                if (l() > 0) {
                    AbstractC6314li0.a(k(0).getKey());
                    throw null;
                }
                Iterator it = n().iterator();
                if (it.hasNext()) {
                    AbstractC6314li0.a(((Map.Entry) it.next()).getKey());
                    throw null;
                }
            }
            super.r();
        }
    }

    public class c extends g {
        public c() {
            super(TT0.this, null);
        }

        @Override // com.daaw.TT0.g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new b(TT0.this, null);
        }

        public /* synthetic */ c(TT0 tt0, a aVar) {
            this();
        }
    }

    public static class d {
        public static final Iterator a = new a();
        public static final Iterable b = new b();

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

        public static class b implements Iterable {
            @Override // java.lang.Iterable
            public Iterator iterator() {
                return d.a;
            }
        }

        public static Iterable b() {
            return b;
        }
    }

    public class e implements Map.Entry, Comparable {
        public final Comparable B;
        public Object C;

        public e(TT0 tt0, Map.Entry entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(e eVar) {
            return getKey().compareTo(eVar.getKey());
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
            TT0.this.h();
            Object obj2 = this.C;
            this.C = obj;
            return obj2;
        }

        public String toString() {
            return this.B + "=" + this.C;
        }

        public e(Comparable comparable, Object obj) {
            this.B = comparable;
            this.C = obj;
        }
    }

    public class g extends AbstractSet {
        public g() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            TT0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = TT0.this.get(entry.getKey());
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
            TT0.this.t((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new f(TT0.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            TT0.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return TT0.this.size();
        }

        public /* synthetic */ g(TT0 tt0, a aVar) {
            this();
        }
    }

    public /* synthetic */ TT0(int i, a aVar) {
        this(i);
    }

    public static TT0 s(int i) {
        return new a(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        h();
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
        return g(comparable) >= 0 || this.D.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.F == null) {
            this.F = new g(this, null);
        }
        return this.F;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TT0)) {
            return super.equals(obj);
        }
        TT0 tt0 = (TT0) obj;
        int size = size();
        if (size != tt0.size()) {
            return false;
        }
        int iL = l();
        if (iL != tt0.l()) {
            return entrySet().equals(tt0.entrySet());
        }
        for (int i = 0; i < iL; i++) {
            if (!k(i).equals(tt0.k(i))) {
                return false;
            }
        }
        if (iL != size) {
            return this.D.equals(tt0.D);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(java.lang.Comparable r5) {
        /*
            r4 = this;
            java.util.List r0 = r4.C
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L23
            java.util.List r2 = r4.C
            java.lang.Object r2 = r2.get(r1)
            com.daaw.TT0$e r2 = (com.daaw.TT0.e) r2
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
            com.daaw.TT0$e r3 = (com.daaw.TT0.e) r3
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
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.TT0.g(java.lang.Comparable):int");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iG = g(comparable);
        return iG >= 0 ? ((e) this.C.get(iG)).getValue() : this.D.get(comparable);
    }

    public final void h() {
        if (this.E) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iL = l();
        int iHashCode = 0;
        for (int i = 0; i < iL; i++) {
            iHashCode += ((e) this.C.get(i)).hashCode();
        }
        return m() > 0 ? iHashCode + this.D.hashCode() : iHashCode;
    }

    public Set i() {
        if (this.H == null) {
            this.H = new c(this, null);
        }
        return this.H;
    }

    public final void j() {
        h();
        if (!this.C.isEmpty() || (this.C instanceof ArrayList)) {
            return;
        }
        this.C = new ArrayList(this.B);
    }

    public Map.Entry k(int i) {
        return (Map.Entry) this.C.get(i);
    }

    public int l() {
        return this.C.size();
    }

    public int m() {
        return this.D.size();
    }

    public Iterable n() {
        return this.D.isEmpty() ? d.b() : this.D.entrySet();
    }

    public final SortedMap o() {
        h();
        if (this.D.isEmpty() && !(this.D instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.D = treeMap;
            this.G = treeMap.descendingMap();
        }
        return (SortedMap) this.D;
    }

    public boolean p() {
        return this.E;
    }

    public void r() {
        if (this.E) {
            return;
        }
        this.D = this.D.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(this.D);
        this.G = this.G.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(this.G);
        this.E = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        h();
        Comparable comparable = (Comparable) obj;
        int iG = g(comparable);
        if (iG >= 0) {
            return u(iG);
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

    public Object t(Comparable comparable, Object obj) {
        h();
        int iG = g(comparable);
        if (iG >= 0) {
            return ((e) this.C.get(iG)).setValue(obj);
        }
        j();
        int i = -(iG + 1);
        if (i >= this.B) {
            return o().put(comparable, obj);
        }
        int size = this.C.size();
        int i2 = this.B;
        if (size == i2) {
            e eVar = (e) this.C.remove(i2 - 1);
            o().put(eVar.getKey(), eVar.getValue());
        }
        this.C.add(i, new e(comparable, obj));
        return null;
    }

    public final Object u(int i) {
        h();
        Object value = ((e) this.C.remove(i)).getValue();
        if (!this.D.isEmpty()) {
            Iterator it = o().entrySet().iterator();
            this.C.add(new e(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    public class b implements Iterator {
        public int B;
        public Iterator C;

        public b() {
            this.B = TT0.this.C.size();
        }

        public final Iterator a() {
            if (this.C == null) {
                this.C = TT0.this.G.entrySet().iterator();
            }
            return this.C;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (a().hasNext()) {
                return (Map.Entry) a().next();
            }
            List list = TT0.this.C;
            int i = this.B - 1;
            this.B = i;
            return (Map.Entry) list.get(i);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i = this.B;
            return (i > 0 && i <= TT0.this.C.size()) || a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public /* synthetic */ b(TT0 tt0, a aVar) {
            this();
        }
    }

    public class f implements Iterator {
        public int B;
        public boolean C;
        public Iterator D;

        public f() {
            this.B = -1;
        }

        public final Iterator a() {
            if (this.D == null) {
                this.D = TT0.this.D.entrySet().iterator();
            }
            return this.D;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            this.C = true;
            int i = this.B + 1;
            this.B = i;
            return i < TT0.this.C.size() ? (Map.Entry) TT0.this.C.get(this.B) : (Map.Entry) a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.B + 1 < TT0.this.C.size() || (!TT0.this.D.isEmpty() && a().hasNext());
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.C) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.C = false;
            TT0.this.h();
            if (this.B >= TT0.this.C.size()) {
                a().remove();
                return;
            }
            TT0 tt0 = TT0.this;
            int i = this.B;
            this.B = i - 1;
            tt0.u(i);
        }

        public /* synthetic */ f(TT0 tt0, a aVar) {
            this();
        }
    }

    public TT0(int i) {
        this.B = i;
        this.C = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        this.D = map;
        this.G = map;
    }
}
