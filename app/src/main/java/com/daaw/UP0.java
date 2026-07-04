package com.daaw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class UP0 extends TP0 {

    public static final class a implements Iterable, InterfaceC9783y60 {
        public final /* synthetic */ KP0 B;

        public a(KP0 kp0) {
            this.B = kp0;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return this.B.iterator();
        }
    }

    public static final class b extends AbstractC4192e90 implements NQ {
        public static final b B = new b();

        public b() {
            super(1);
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj == null);
        }
    }

    public /* synthetic */ class c extends AbstractC9591xR implements NQ {
        public static final c B = new c();

        public c() {
            super(1, KP0.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Iterator invoke(KP0 kp0) {
            G10.g(kp0, "p0");
            return kp0.iterator();
        }
    }

    public static List A(KP0 kp0) {
        G10.g(kp0, "<this>");
        Iterator it = kp0.iterator();
        if (!it.hasNext()) {
            return AbstractC1599Mm.k();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return AbstractC1496Lm.e(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static List B(KP0 kp0) {
        G10.g(kp0, "<this>");
        return (List) z(kp0, new ArrayList());
    }

    public static Iterable k(KP0 kp0) {
        G10.g(kp0, "<this>");
        return new a(kp0);
    }

    public static int l(KP0 kp0) {
        G10.g(kp0, "<this>");
        Iterator it = kp0.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                AbstractC1599Mm.t();
            }
        }
        return i;
    }

    public static KP0 m(KP0 kp0, int i) {
        G10.g(kp0, "<this>");
        if (i >= 0) {
            return i == 0 ? kp0 : kp0 instanceof InterfaceC9260wE ? ((InterfaceC9260wE) kp0).a(i) : new C8137sE(kp0, i);
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    public static KP0 n(KP0 kp0, NQ nq) {
        G10.g(kp0, "<this>");
        G10.g(nq, "predicate");
        return new C4808gL(kp0, true, nq);
    }

    public static KP0 o(KP0 kp0, NQ nq) {
        G10.g(kp0, "<this>");
        G10.g(nq, "predicate");
        return new C4808gL(kp0, false, nq);
    }

    public static KP0 p(KP0 kp0) {
        G10.g(kp0, "<this>");
        KP0 kp0O = o(kp0, b.B);
        G10.e(kp0O, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return kp0O;
    }

    public static Object q(KP0 kp0) {
        G10.g(kp0, "<this>");
        Iterator it = kp0.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static KP0 r(KP0 kp0, NQ nq) {
        G10.g(kp0, "<this>");
        G10.g(nq, "transform");
        return new TM(kp0, nq, c.B);
    }

    public static Object s(KP0 kp0) {
        G10.g(kp0, "<this>");
        Iterator it = kp0.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static KP0 t(KP0 kp0, NQ nq) {
        G10.g(kp0, "<this>");
        G10.g(nq, "transform");
        return new C8098s51(kp0, nq);
    }

    public static KP0 u(KP0 kp0, NQ nq) {
        G10.g(kp0, "<this>");
        G10.g(nq, "transform");
        return p(new C8098s51(kp0, nq));
    }

    public static KP0 v(KP0 kp0, KP0 kp02) {
        G10.g(kp0, "<this>");
        G10.g(kp02, "elements");
        return SP0.f(SP0.j(kp0, kp02));
    }

    public static KP0 w(KP0 kp0, Iterable iterable) {
        G10.g(kp0, "<this>");
        G10.g(iterable, "elements");
        return SP0.f(SP0.j(kp0, AbstractC2455Um.V(iterable)));
    }

    public static KP0 x(KP0 kp0, Object obj) {
        G10.g(kp0, "<this>");
        return SP0.f(SP0.j(kp0, SP0.j(obj)));
    }

    public static KP0 y(KP0 kp0, NQ nq) {
        G10.g(kp0, "<this>");
        G10.g(nq, "predicate");
        return new X01(kp0, nq);
    }

    public static final Collection z(KP0 kp0, Collection collection) {
        G10.g(kp0, "<this>");
        G10.g(collection, "destination");
        Iterator it = kp0.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
        return collection;
    }
}
