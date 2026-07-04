package com.daaw;

import com.daaw.AbstractC3720cU0;
import com.daaw.InterfaceC4969gu0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: com.daaw.wU0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C9325wU0 implements List, InterfaceC10170zW0, InterfaceC10062z60 {
    public AW0 B = new a(AbstractC7878rJ.b());

    /* JADX INFO: renamed from: com.daaw.wU0$a */
    public static final class a extends AW0 {
        public InterfaceC4969gu0 c;
        public int d;

        public a(InterfaceC4969gu0 interfaceC4969gu0) {
            G10.g(interfaceC4969gu0, "list");
            this.c = interfaceC4969gu0;
        }

        @Override // com.daaw.AW0
        public void a(AW0 aw0) {
            G10.g(aw0, "value");
            synchronized (AbstractC9604xU0.a) {
                this.c = ((a) aw0).c;
                this.d = ((a) aw0).d;
                G91 g91 = G91.a;
            }
        }

        @Override // com.daaw.AW0
        public AW0 b() {
            return new a(this.c);
        }

        public final InterfaceC4969gu0 g() {
            return this.c;
        }

        public final int h() {
            return this.d;
        }

        public final void i(InterfaceC4969gu0 interfaceC4969gu0) {
            G10.g(interfaceC4969gu0, "<set-?>");
            this.c = interfaceC4969gu0;
        }

        public final void j(int i) {
            this.d = i;
        }
    }

    /* JADX INFO: renamed from: com.daaw.wU0$b */
    public static final class b extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ int B;
        public final /* synthetic */ Collection C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i, Collection collection) {
            super(1);
            this.B = i;
            this.C = collection;
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(List list) {
            G10.g(list, "it");
            return Boolean.valueOf(list.addAll(this.B, this.C));
        }
    }

    /* JADX INFO: renamed from: com.daaw.wU0$c */
    public static final class c extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ Collection B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Collection collection) {
            super(1);
            this.B = collection;
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(List list) {
            G10.g(list, "it");
            return Boolean.valueOf(list.retainAll(this.B));
        }
    }

    public Object D(int i) {
        AbstractC3720cU0.a aVar;
        int iH;
        InterfaceC4969gu0 interfaceC4969gu0G;
        AbstractC3720cU0 abstractC3720cU0B;
        boolean z;
        Object obj = get(i);
        do {
            synchronized (AbstractC9604xU0.a) {
                a aVar2 = (a) e();
                aVar = AbstractC3720cU0.e;
                a aVar3 = (a) AbstractC5124hU0.A(aVar2, aVar.b());
                iH = aVar3.h();
                interfaceC4969gu0G = aVar3.g();
                G91 g91 = G91.a;
            }
            G10.d(interfaceC4969gu0G);
            InterfaceC4969gu0 interfaceC4969gu0U = interfaceC4969gu0G.u(i);
            if (G10.c(interfaceC4969gu0U, interfaceC4969gu0G)) {
                return obj;
            }
            synchronized (AbstractC9604xU0.a) {
                a aVar4 = (a) e();
                AbstractC5124hU0.D();
                synchronized (AbstractC5124hU0.C()) {
                    abstractC3720cU0B = aVar.b();
                    a aVar5 = (a) AbstractC5124hU0.Z(aVar4, this, abstractC3720cU0B);
                    if (aVar5.h() == iH) {
                        aVar5.i(interfaceC4969gu0U);
                        z = true;
                        aVar5.j(aVar5.h() + 1);
                    } else {
                        z = false;
                    }
                }
                AbstractC5124hU0.J(abstractC3720cU0B, this);
            }
        } while (!z);
        return obj;
    }

    public final void E(int i, int i2) {
        AbstractC3720cU0.a aVar;
        int iH;
        InterfaceC4969gu0 interfaceC4969gu0G;
        AbstractC3720cU0 abstractC3720cU0B;
        boolean z;
        do {
            synchronized (AbstractC9604xU0.a) {
                a aVar2 = (a) e();
                aVar = AbstractC3720cU0.e;
                a aVar3 = (a) AbstractC5124hU0.A(aVar2, aVar.b());
                iH = aVar3.h();
                interfaceC4969gu0G = aVar3.g();
                G91 g91 = G91.a;
            }
            G10.d(interfaceC4969gu0G);
            InterfaceC4969gu0.a aVarBuilder = interfaceC4969gu0G.builder();
            aVarBuilder.subList(i, i2).clear();
            InterfaceC4969gu0 interfaceC4969gu0A = aVarBuilder.a();
            if (G10.c(interfaceC4969gu0A, interfaceC4969gu0G)) {
                return;
            }
            synchronized (AbstractC9604xU0.a) {
                a aVar4 = (a) e();
                AbstractC5124hU0.D();
                synchronized (AbstractC5124hU0.C()) {
                    abstractC3720cU0B = aVar.b();
                    a aVar5 = (a) AbstractC5124hU0.Z(aVar4, this, abstractC3720cU0B);
                    if (aVar5.h() == iH) {
                        aVar5.i(interfaceC4969gu0A);
                        z = true;
                        aVar5.j(aVar5.h() + 1);
                    } else {
                        z = false;
                    }
                }
                AbstractC5124hU0.J(abstractC3720cU0B, this);
            }
        } while (!z);
    }

    public final int F(Collection collection, int i, int i2) {
        AbstractC3720cU0.a aVar;
        int iH;
        InterfaceC4969gu0 interfaceC4969gu0G;
        AbstractC3720cU0 abstractC3720cU0B;
        boolean z;
        G10.g(collection, "elements");
        int size = size();
        do {
            synchronized (AbstractC9604xU0.a) {
                a aVar2 = (a) e();
                aVar = AbstractC3720cU0.e;
                a aVar3 = (a) AbstractC5124hU0.A(aVar2, aVar.b());
                iH = aVar3.h();
                interfaceC4969gu0G = aVar3.g();
                G91 g91 = G91.a;
            }
            G10.d(interfaceC4969gu0G);
            InterfaceC4969gu0.a aVarBuilder = interfaceC4969gu0G.builder();
            aVarBuilder.subList(i, i2).retainAll(collection);
            InterfaceC4969gu0 interfaceC4969gu0A = aVarBuilder.a();
            if (G10.c(interfaceC4969gu0A, interfaceC4969gu0G)) {
                break;
            }
            synchronized (AbstractC9604xU0.a) {
                a aVar4 = (a) e();
                AbstractC5124hU0.D();
                synchronized (AbstractC5124hU0.C()) {
                    abstractC3720cU0B = aVar.b();
                    a aVar5 = (a) AbstractC5124hU0.Z(aVar4, this, abstractC3720cU0B);
                    if (aVar5.h() == iH) {
                        aVar5.i(interfaceC4969gu0A);
                        z = true;
                        aVar5.j(aVar5.h() + 1);
                    } else {
                        z = false;
                    }
                }
                AbstractC5124hU0.J(abstractC3720cU0B, this);
            }
        } while (!z);
        return size - size();
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(Object obj) {
        AbstractC3720cU0.a aVar;
        int iH;
        InterfaceC4969gu0 interfaceC4969gu0G;
        boolean z;
        AbstractC3720cU0 abstractC3720cU0B;
        do {
            synchronized (AbstractC9604xU0.a) {
                a aVar2 = (a) e();
                aVar = AbstractC3720cU0.e;
                a aVar3 = (a) AbstractC5124hU0.A(aVar2, aVar.b());
                iH = aVar3.h();
                interfaceC4969gu0G = aVar3.g();
                G91 g91 = G91.a;
            }
            G10.d(interfaceC4969gu0G);
            InterfaceC4969gu0 interfaceC4969gu0Add = interfaceC4969gu0G.add(obj);
            z = false;
            if (G10.c(interfaceC4969gu0Add, interfaceC4969gu0G)) {
                return false;
            }
            synchronized (AbstractC9604xU0.a) {
                a aVar4 = (a) e();
                AbstractC5124hU0.D();
                synchronized (AbstractC5124hU0.C()) {
                    abstractC3720cU0B = aVar.b();
                    a aVar5 = (a) AbstractC5124hU0.Z(aVar4, this, abstractC3720cU0B);
                    if (aVar5.h() == iH) {
                        aVar5.i(interfaceC4969gu0Add);
                        aVar5.j(aVar5.h() + 1);
                        z = true;
                    }
                }
                AbstractC5124hU0.J(abstractC3720cU0B, this);
            }
        } while (!z);
        return true;
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection collection) {
        G10.g(collection, "elements");
        return y(new b(i, collection));
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        AbstractC3720cU0 abstractC3720cU0B;
        synchronized (AbstractC9604xU0.a) {
            a aVar = (a) e();
            AbstractC5124hU0.D();
            synchronized (AbstractC5124hU0.C()) {
                abstractC3720cU0B = AbstractC3720cU0.e.b();
                a aVar2 = (a) AbstractC5124hU0.Z(aVar, this, abstractC3720cU0B);
                aVar2.i(AbstractC7878rJ.b());
                aVar2.j(aVar2.h() + 1);
            }
            AbstractC5124hU0.J(abstractC3720cU0B, this);
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return v().g().contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection collection) {
        G10.g(collection, "elements");
        return v().g().containsAll(collection);
    }

    @Override // com.daaw.InterfaceC10170zW0
    public AW0 e() {
        return this.B;
    }

    @Override // java.util.List
    public Object get(int i) {
        return v().g().get(i);
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return v().g().indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return v().g().isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return v().g().lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return new C8210sW0(this, 0);
    }

    @Override // com.daaw.InterfaceC10170zW0
    public /* synthetic */ AW0 m(AW0 aw0, AW0 aw02, AW0 aw03) {
        return AbstractC9891yW0.a(this, aw0, aw02, aw03);
    }

    @Override // com.daaw.InterfaceC10170zW0
    public void p(AW0 aw0) {
        G10.g(aw0, "value");
        aw0.e(e());
        this.B = (a) aw0;
    }

    @Override // java.util.List
    public final /* bridge */ Object remove(int i) {
        return D(i);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        AbstractC3720cU0.a aVar;
        int iH;
        InterfaceC4969gu0 interfaceC4969gu0G;
        boolean z;
        AbstractC3720cU0 abstractC3720cU0B;
        G10.g(collection, "elements");
        do {
            synchronized (AbstractC9604xU0.a) {
                a aVar2 = (a) e();
                aVar = AbstractC3720cU0.e;
                a aVar3 = (a) AbstractC5124hU0.A(aVar2, aVar.b());
                iH = aVar3.h();
                interfaceC4969gu0G = aVar3.g();
                G91 g91 = G91.a;
            }
            G10.d(interfaceC4969gu0G);
            InterfaceC4969gu0 interfaceC4969gu0RemoveAll = interfaceC4969gu0G.removeAll(collection);
            z = false;
            if (G10.c(interfaceC4969gu0RemoveAll, interfaceC4969gu0G)) {
                return false;
            }
            synchronized (AbstractC9604xU0.a) {
                a aVar4 = (a) e();
                AbstractC5124hU0.D();
                synchronized (AbstractC5124hU0.C()) {
                    abstractC3720cU0B = aVar.b();
                    a aVar5 = (a) AbstractC5124hU0.Z(aVar4, this, abstractC3720cU0B);
                    if (aVar5.h() == iH) {
                        aVar5.i(interfaceC4969gu0RemoveAll);
                        aVar5.j(aVar5.h() + 1);
                        z = true;
                    }
                }
                AbstractC5124hU0.J(abstractC3720cU0B, this);
            }
        } while (!z);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        G10.g(collection, "elements");
        return y(new c(collection));
    }

    public final int s() {
        return ((a) AbstractC5124hU0.A((a) e(), AbstractC3720cU0.e.b())).h();
    }

    @Override // java.util.List
    public Object set(int i, Object obj) {
        AbstractC3720cU0.a aVar;
        int iH;
        InterfaceC4969gu0 interfaceC4969gu0G;
        AbstractC3720cU0 abstractC3720cU0B;
        boolean z;
        Object obj2 = get(i);
        do {
            synchronized (AbstractC9604xU0.a) {
                a aVar2 = (a) e();
                aVar = AbstractC3720cU0.e;
                a aVar3 = (a) AbstractC5124hU0.A(aVar2, aVar.b());
                iH = aVar3.h();
                interfaceC4969gu0G = aVar3.g();
                G91 g91 = G91.a;
            }
            G10.d(interfaceC4969gu0G);
            InterfaceC4969gu0 interfaceC4969gu0 = interfaceC4969gu0G.set(i, obj);
            if (G10.c(interfaceC4969gu0, interfaceC4969gu0G)) {
                return obj2;
            }
            synchronized (AbstractC9604xU0.a) {
                a aVar4 = (a) e();
                AbstractC5124hU0.D();
                synchronized (AbstractC5124hU0.C()) {
                    abstractC3720cU0B = aVar.b();
                    a aVar5 = (a) AbstractC5124hU0.Z(aVar4, this, abstractC3720cU0B);
                    if (aVar5.h() == iH) {
                        aVar5.i(interfaceC4969gu0);
                        z = true;
                        aVar5.j(aVar5.h() + 1);
                    } else {
                        z = false;
                    }
                }
                AbstractC5124hU0.J(abstractC3720cU0B, this);
            }
        } while (!z);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return w();
    }

    @Override // java.util.List
    public List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > size()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        return new UY0(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return AbstractC1080Hm.a(this);
    }

    public final a v() {
        return (a) AbstractC5124hU0.O((a) e(), this);
    }

    public int w() {
        return v().g().size();
    }

    public final boolean y(NQ nq) {
        AbstractC3720cU0.a aVar;
        int iH;
        InterfaceC4969gu0 interfaceC4969gu0G;
        Object objInvoke;
        AbstractC3720cU0 abstractC3720cU0B;
        boolean z;
        do {
            synchronized (AbstractC9604xU0.a) {
                a aVar2 = (a) e();
                aVar = AbstractC3720cU0.e;
                a aVar3 = (a) AbstractC5124hU0.A(aVar2, aVar.b());
                iH = aVar3.h();
                interfaceC4969gu0G = aVar3.g();
                G91 g91 = G91.a;
            }
            G10.d(interfaceC4969gu0G);
            InterfaceC4969gu0.a aVarBuilder = interfaceC4969gu0G.builder();
            objInvoke = nq.invoke(aVarBuilder);
            InterfaceC4969gu0 interfaceC4969gu0A = aVarBuilder.a();
            if (G10.c(interfaceC4969gu0A, interfaceC4969gu0G)) {
                break;
            }
            synchronized (AbstractC9604xU0.a) {
                a aVar4 = (a) e();
                AbstractC5124hU0.D();
                synchronized (AbstractC5124hU0.C()) {
                    abstractC3720cU0B = aVar.b();
                    a aVar5 = (a) AbstractC5124hU0.Z(aVar4, this, abstractC3720cU0B);
                    if (aVar5.h() == iH) {
                        aVar5.i(interfaceC4969gu0A);
                        z = true;
                        aVar5.j(aVar5.h() + 1);
                    } else {
                        z = false;
                    }
                }
                AbstractC5124hU0.J(abstractC3720cU0B, this);
            }
        } while (!z);
        return ((Boolean) objInvoke).booleanValue();
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        AbstractC3720cU0.a aVar;
        int iH;
        InterfaceC4969gu0 interfaceC4969gu0G;
        boolean z;
        AbstractC3720cU0 abstractC3720cU0B;
        G10.g(collection, "elements");
        do {
            synchronized (AbstractC9604xU0.a) {
                a aVar2 = (a) e();
                aVar = AbstractC3720cU0.e;
                a aVar3 = (a) AbstractC5124hU0.A(aVar2, aVar.b());
                iH = aVar3.h();
                interfaceC4969gu0G = aVar3.g();
                G91 g91 = G91.a;
            }
            G10.d(interfaceC4969gu0G);
            InterfaceC4969gu0 interfaceC4969gu0AddAll = interfaceC4969gu0G.addAll(collection);
            z = false;
            if (G10.c(interfaceC4969gu0AddAll, interfaceC4969gu0G)) {
                return false;
            }
            synchronized (AbstractC9604xU0.a) {
                a aVar4 = (a) e();
                AbstractC5124hU0.D();
                synchronized (AbstractC5124hU0.C()) {
                    abstractC3720cU0B = aVar.b();
                    a aVar5 = (a) AbstractC5124hU0.Z(aVar4, this, abstractC3720cU0B);
                    if (aVar5.h() == iH) {
                        aVar5.i(interfaceC4969gu0AddAll);
                        aVar5.j(aVar5.h() + 1);
                        z = true;
                    }
                }
                AbstractC5124hU0.J(abstractC3720cU0B, this);
            }
        } while (!z);
        return true;
    }

    @Override // java.util.List
    public ListIterator listIterator(int i) {
        return new C8210sW0(this, i);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        AbstractC3720cU0.a aVar;
        int iH;
        InterfaceC4969gu0 interfaceC4969gu0G;
        boolean z;
        AbstractC3720cU0 abstractC3720cU0B;
        do {
            synchronized (AbstractC9604xU0.a) {
                a aVar2 = (a) e();
                aVar = AbstractC3720cU0.e;
                a aVar3 = (a) AbstractC5124hU0.A(aVar2, aVar.b());
                iH = aVar3.h();
                interfaceC4969gu0G = aVar3.g();
                G91 g91 = G91.a;
            }
            G10.d(interfaceC4969gu0G);
            InterfaceC4969gu0 interfaceC4969gu0Remove = interfaceC4969gu0G.remove(obj);
            z = false;
            if (G10.c(interfaceC4969gu0Remove, interfaceC4969gu0G)) {
                return false;
            }
            synchronized (AbstractC9604xU0.a) {
                a aVar4 = (a) e();
                AbstractC5124hU0.D();
                synchronized (AbstractC5124hU0.C()) {
                    abstractC3720cU0B = aVar.b();
                    a aVar5 = (a) AbstractC5124hU0.Z(aVar4, this, abstractC3720cU0B);
                    if (aVar5.h() == iH) {
                        aVar5.i(interfaceC4969gu0Remove);
                        aVar5.j(aVar5.h() + 1);
                        z = true;
                    }
                }
                AbstractC5124hU0.J(abstractC3720cU0B, this);
            }
        } while (!z);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        G10.g(objArr, "array");
        return AbstractC1080Hm.b(this, objArr);
    }

    @Override // java.util.List
    public void add(int i, Object obj) {
        AbstractC3720cU0.a aVar;
        int iH;
        InterfaceC4969gu0 interfaceC4969gu0G;
        AbstractC3720cU0 abstractC3720cU0B;
        boolean z;
        do {
            synchronized (AbstractC9604xU0.a) {
                a aVar2 = (a) e();
                aVar = AbstractC3720cU0.e;
                a aVar3 = (a) AbstractC5124hU0.A(aVar2, aVar.b());
                iH = aVar3.h();
                interfaceC4969gu0G = aVar3.g();
                G91 g91 = G91.a;
            }
            G10.d(interfaceC4969gu0G);
            InterfaceC4969gu0 interfaceC4969gu0Add = interfaceC4969gu0G.add(i, obj);
            if (G10.c(interfaceC4969gu0Add, interfaceC4969gu0G)) {
                return;
            }
            synchronized (AbstractC9604xU0.a) {
                a aVar4 = (a) e();
                AbstractC5124hU0.D();
                synchronized (AbstractC5124hU0.C()) {
                    abstractC3720cU0B = aVar.b();
                    a aVar5 = (a) AbstractC5124hU0.Z(aVar4, this, abstractC3720cU0B);
                    if (aVar5.h() == iH) {
                        aVar5.i(interfaceC4969gu0Add);
                        z = true;
                        aVar5.j(aVar5.h() + 1);
                    } else {
                        z = false;
                    }
                }
                AbstractC5124hU0.J(abstractC3720cU0B, this);
            }
        } while (!z);
    }
}
