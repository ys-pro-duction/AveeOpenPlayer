package com.daaw;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class FM0 implements Iterable {
    public c B;
    public c C;
    public final WeakHashMap D = new WeakHashMap();
    public int E = 0;

    public static class a extends e {
        public a(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // com.daaw.FM0.e
        public c b(c cVar) {
            return cVar.E;
        }

        @Override // com.daaw.FM0.e
        public c d(c cVar) {
            return cVar.D;
        }
    }

    public static class b extends e {
        public b(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // com.daaw.FM0.e
        public c b(c cVar) {
            return cVar.D;
        }

        @Override // com.daaw.FM0.e
        public c d(c cVar) {
            return cVar.E;
        }
    }

    public static class c implements Map.Entry {
        public final Object B;
        public final Object C;
        public c D;
        public c E;

        public c(Object obj, Object obj2) {
            this.B = obj;
            this.C = obj2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.B.equals(cVar.B) && this.C.equals(cVar.C);
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.B;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.C;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.B.hashCode() ^ this.C.hashCode();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.B + "=" + this.C;
        }
    }

    public class d extends f implements Iterator {
        public c B;
        public boolean C = true;

        public d() {
        }

        @Override // com.daaw.FM0.f
        public void a(c cVar) {
            c cVar2 = this.B;
            if (cVar == cVar2) {
                c cVar3 = cVar2.E;
                this.B = cVar3;
                this.C = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (this.C) {
                this.C = false;
                this.B = FM0.this.B;
            } else {
                c cVar = this.B;
                this.B = cVar != null ? cVar.D : null;
            }
            return this.B;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.C) {
                return FM0.this.B != null;
            }
            c cVar = this.B;
            return (cVar == null || cVar.D == null) ? false : true;
        }
    }

    public static abstract class e extends f implements Iterator {
        public c B;
        public c C;

        public e(c cVar, c cVar2) {
            this.B = cVar2;
            this.C = cVar;
        }

        @Override // com.daaw.FM0.f
        public void a(c cVar) {
            if (this.B == cVar && cVar == this.C) {
                this.C = null;
                this.B = null;
            }
            c cVar2 = this.B;
            if (cVar2 == cVar) {
                this.B = b(cVar2);
            }
            if (this.C == cVar) {
                this.C = f();
            }
        }

        public abstract c b(c cVar);

        public abstract c d(c cVar);

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            c cVar = this.C;
            this.C = f();
            return cVar;
        }

        public final c f() {
            c cVar = this.C;
            c cVar2 = this.B;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return d(cVar);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.C != null;
        }
    }

    public static abstract class f {
        public abstract void a(c cVar);
    }

    public Iterator descendingIterator() {
        b bVar = new b(this.C, this.B);
        this.D.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public Map.Entry e() {
        return this.B;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FM0)) {
            return false;
        }
        FM0 fm0 = (FM0) obj;
        if (size() != fm0.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = fm0.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += ((Map.Entry) it.next()).hashCode();
        }
        return iHashCode;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        a aVar = new a(this.B, this.C);
        this.D.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public c m(Object obj) {
        c cVar = this.B;
        while (cVar != null && !cVar.B.equals(obj)) {
            cVar = cVar.D;
        }
        return cVar;
    }

    public d p() {
        d dVar = new d();
        this.D.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Map.Entry q() {
        return this.C;
    }

    public c s(Object obj, Object obj2) {
        c cVar = new c(obj, obj2);
        this.E++;
        c cVar2 = this.C;
        if (cVar2 == null) {
            this.B = cVar;
            this.C = cVar;
            return cVar;
        }
        cVar2.D = cVar;
        cVar.E = cVar2;
        this.C = cVar;
        return cVar;
    }

    public int size() {
        return this.E;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public Object v(Object obj, Object obj2) {
        c cVarM = m(obj);
        if (cVarM != null) {
            return cVarM.C;
        }
        s(obj, obj2);
        return null;
    }

    public Object w(Object obj) {
        c cVarM = m(obj);
        if (cVarM == null) {
            return null;
        }
        this.E--;
        if (!this.D.isEmpty()) {
            Iterator it = this.D.keySet().iterator();
            while (it.hasNext()) {
                ((f) it.next()).a(cVarM);
            }
        }
        c cVar = cVarM.E;
        if (cVar != null) {
            cVar.D = cVarM.D;
        } else {
            this.B = cVarM.D;
        }
        c cVar2 = cVarM.D;
        if (cVar2 != null) {
            cVar2.E = cVar;
        } else {
            this.C = cVar;
        }
        cVarM.D = null;
        cVarM.E = null;
        return cVarM.C;
    }
}
