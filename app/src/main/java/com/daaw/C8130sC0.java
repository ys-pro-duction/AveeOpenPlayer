package com.daaw;

import com.google.firebase.firestore.FirebaseFirestore;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.sC0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C8130sC0 implements Iterable {
    public final com.google.firebase.firestore.f B;
    public final C1881Pe1 C;
    public final FirebaseFirestore D;
    public final C6529mU0 E;

    /* JADX INFO: renamed from: com.daaw.sC0$a */
    public class a implements Iterator {
        public final Iterator B;

        public a(Iterator it) {
            this.B = it;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C6178lC0 next() {
            return C8130sC0.this.m((LC) this.B.next());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.B.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("QuerySnapshot does not support remove().");
        }
    }

    public C8130sC0(com.google.firebase.firestore.f fVar, C1881Pe1 c1881Pe1, FirebaseFirestore firebaseFirestore) {
        this.B = (com.google.firebase.firestore.f) AbstractC8342sy0.b(fVar);
        this.C = (C1881Pe1) AbstractC8342sy0.b(c1881Pe1);
        this.D = (FirebaseFirestore) AbstractC8342sy0.b(firebaseFirestore);
        this.E = new C6529mU0(c1881Pe1.j(), c1881Pe1.k());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8130sC0)) {
            return false;
        }
        C8130sC0 c8130sC0 = (C8130sC0) obj;
        return this.D.equals(c8130sC0.D) && this.B.equals(c8130sC0.B) && this.C.equals(c8130sC0.C) && this.E.equals(c8130sC0.E);
    }

    public int hashCode() {
        return (((((this.D.hashCode() * 31) + this.B.hashCode()) * 31) + this.C.hashCode()) * 31) + this.E.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new a(this.C.e().iterator());
    }

    public final C6178lC0 m(LC lc) {
        return C6178lC0.e(this.D, lc, this.C.k(), this.C.f().contains(lc.getKey()));
    }

    public List p() {
        ArrayList arrayList = new ArrayList(this.C.e().size());
        Iterator it = this.C.e().iterator();
        while (it.hasNext()) {
            arrayList.add(m((LC) it.next()));
        }
        return arrayList;
    }

    public C6529mU0 q() {
        return this.E;
    }
}
