package com.daaw;

import com.daaw.InterfaceC4969gu0;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class RT0 extends AbstractC3311b0 implements LY {
    public static final a D = new a(null);
    public static final RT0 E = new RT0(new Object[0]);
    public final Object[] C;

    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final RT0 a() {
            return RT0.E;
        }

        public a() {
        }
    }

    public RT0(Object[] objArr) {
        G10.g(objArr, "buffer");
        this.C = objArr;
        AbstractC9971yn.a(objArr.length <= 32);
    }

    @Override // java.util.Collection, java.util.List, com.daaw.InterfaceC4969gu0
    public InterfaceC4969gu0 add(Object obj) {
        if (size() >= 32) {
            return new C6374lu0(this.C, AbstractC1350Kb1.c(obj), size() + 1, 0);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.C, size() + 1);
        G10.f(objArrCopyOf, "copyOf(this, newSize)");
        objArrCopyOf[size()] = obj;
        return new RT0(objArrCopyOf);
    }

    @Override // com.daaw.AbstractC3311b0, java.util.Collection, java.util.List, com.daaw.InterfaceC4969gu0
    public InterfaceC4969gu0 addAll(Collection collection) {
        G10.g(collection, "elements");
        if (size() + collection.size() > 32) {
            InterfaceC4969gu0.a aVarBuilder = builder();
            aVarBuilder.addAll(collection);
            return aVarBuilder.a();
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.C, size() + collection.size());
        G10.f(objArrCopyOf, "copyOf(this, newSize)");
        int size = size();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[size] = it.next();
            size++;
        }
        return new RT0(objArrCopyOf);
    }

    @Override // com.daaw.InterfaceC4969gu0
    public InterfaceC4969gu0.a builder() {
        return new C6653mu0(this, null, this.C, 0);
    }

    @Override // com.daaw.AbstractC9193w
    public int e() {
        return this.C.length;
    }

    @Override // com.daaw.J, java.util.List
    public Object get(int i) {
        C6284lc0.a(i, size());
        return this.C[i];
    }

    @Override // com.daaw.J, java.util.List
    public int indexOf(Object obj) {
        return AbstractC5431ib.L(this.C, obj);
    }

    @Override // com.daaw.J, java.util.List
    public int lastIndexOf(Object obj) {
        return AbstractC5431ib.S(this.C, obj);
    }

    @Override // com.daaw.J, java.util.List
    public ListIterator listIterator(int i) {
        C6284lc0.b(i, size());
        return new C4903gh(this.C, i, size());
    }

    @Override // com.daaw.J, java.util.List
    public InterfaceC4969gu0 set(int i, Object obj) {
        C6284lc0.a(i, size());
        Object[] objArr = this.C;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        G10.f(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[i] = obj;
        return new RT0(objArrCopyOf);
    }

    @Override // com.daaw.InterfaceC4969gu0
    public InterfaceC4969gu0 t(NQ nq) {
        G10.g(nq, "predicate");
        Object[] objArrCopyOf = this.C;
        int size = size();
        int size2 = size();
        boolean z = false;
        for (int i = 0; i < size2; i++) {
            Object obj = this.C[i];
            if (((Boolean) nq.invoke(obj)).booleanValue()) {
                if (!z) {
                    Object[] objArr = this.C;
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    G10.f(objArrCopyOf, "copyOf(this, size)");
                    z = true;
                    size = i;
                }
            } else if (z) {
                objArrCopyOf[size] = obj;
                size++;
            }
        }
        return size == size() ? this : size == 0 ? E : new RT0(AbstractC5152hb.n(objArrCopyOf, 0, size));
    }

    @Override // com.daaw.InterfaceC4969gu0
    public InterfaceC4969gu0 u(int i) {
        C6284lc0.a(i, size());
        if (size() == 1) {
            return E;
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.C, size() - 1);
        G10.f(objArrCopyOf, "copyOf(this, newSize)");
        AbstractC5152hb.h(this.C, objArrCopyOf, i, i + 1, size());
        return new RT0(objArrCopyOf);
    }

    public final Object[] y(int i) {
        return new Object[i];
    }

    @Override // java.util.List, com.daaw.InterfaceC4969gu0
    public InterfaceC4969gu0 add(int i, Object obj) {
        C6284lc0.b(i, size());
        if (i == size()) {
            return add(obj);
        }
        if (size() < 32) {
            Object[] objArrY = y(size() + 1);
            AbstractC5152hb.k(this.C, objArrY, 0, 0, i, 6, null);
            AbstractC5152hb.h(this.C, objArrY, i + 1, i, size());
            objArrY[i] = obj;
            return new RT0(objArrY);
        }
        Object[] objArr = this.C;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        G10.f(objArrCopyOf, "copyOf(this, size)");
        AbstractC5152hb.h(this.C, objArrCopyOf, i + 1, i, size() - 1);
        objArrCopyOf[i] = obj;
        return new C6374lu0(objArrCopyOf, AbstractC1350Kb1.c(this.C[31]), size() + 1, 0);
    }
}
