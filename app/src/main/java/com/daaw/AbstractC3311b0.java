package com.daaw;

import com.daaw.InterfaceC4969gu0;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: renamed from: com.daaw.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3311b0 extends J implements InterfaceC4969gu0 {

    /* JADX INFO: renamed from: com.daaw.b0$a */
    public static final class a extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ Collection B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Collection collection) {
            super(1);
            this.B = collection;
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(this.B.contains(obj));
        }
    }

    @Override // java.util.Collection, java.util.List, com.daaw.InterfaceC4969gu0
    public InterfaceC4969gu0 addAll(Collection collection) {
        G10.g(collection, "elements");
        InterfaceC4969gu0.a aVarBuilder = builder();
        aVarBuilder.addAll(collection);
        return aVarBuilder.a();
    }

    @Override // com.daaw.AbstractC9193w, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.daaw.AbstractC9193w, java.util.Collection, java.util.List
    public boolean containsAll(Collection collection) {
        G10.g(collection, "elements");
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // com.daaw.J, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator();
    }

    @Override // com.daaw.J, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List, com.daaw.InterfaceC4969gu0
    public InterfaceC4969gu0 remove(Object obj) {
        int iIndexOf = indexOf(obj);
        return iIndexOf != -1 ? u(iIndexOf) : this;
    }

    @Override // java.util.Collection, java.util.List, com.daaw.InterfaceC4969gu0
    public InterfaceC4969gu0 removeAll(Collection collection) {
        G10.g(collection, "elements");
        return t(new a(collection));
    }

    @Override // com.daaw.J, java.util.List
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public LY subList(int i, int i2) {
        return KY.a(this, i, i2);
    }
}
