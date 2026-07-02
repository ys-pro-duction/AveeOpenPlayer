package com.daaw;

import com.daaw.SY;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class UY implements Iterable {
    public final SY B;

    public static class a implements Iterator {
        public final Iterator B;

        public a(Iterator it) {
            this.B = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.B.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return ((Map.Entry) this.B.next()).getKey();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.B.remove();
        }
    }

    public UY(List list, Comparator comparator) {
        this.B = SY.a.b(list, Collections.EMPTY_MAP, SY.a.d(), comparator);
    }

    public boolean contains(Object obj) {
        return this.B.e(obj);
    }

    public Object e() {
        return this.B.q();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UY) {
            return this.B.equals(((UY) obj).B);
        }
        return false;
    }

    public int hashCode() {
        return this.B.hashCode();
    }

    public boolean isEmpty() {
        return this.B.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new a(this.B.iterator());
    }

    public Object m() {
        return this.B.s();
    }

    public UY p(Object obj) {
        return new UY(this.B.v(obj, null));
    }

    public Iterator q(Object obj) {
        return new a(this.B.w(obj));
    }

    public UY s(Object obj) {
        SY syY = this.B.y(obj);
        return syY == this.B ? this : new UY(syY);
    }

    public int size() {
        return this.B.size();
    }

    public UY v(UY uy) {
        UY uyP;
        if (size() < uy.size()) {
            uyP = uy;
            uy = this;
        } else {
            uyP = this;
        }
        Iterator it = uy.iterator();
        while (it.hasNext()) {
            uyP = uyP.p(it.next());
        }
        return uyP;
    }

    public UY(SY sy) {
        this.B = sy;
    }
}
