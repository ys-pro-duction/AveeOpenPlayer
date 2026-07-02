package com.daaw;

import com.daaw.C9883yU0;
import com.daaw.InterfaceC5248hu0;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.lU0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6250lU0 extends AbstractC5962kU0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6250lU0(C9883yU0 c9883yU0) {
        super(c9883yU0);
        G10.g(c9883yU0, "map");
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return ((Boolean) p(obj)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return ((Boolean) s(collection)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return e().containsValue(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection collection) {
        G10.g(collection, "elements");
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!e().containsValue(it.next())) {
                return false;
            }
        }
        return true;
    }

    public Void p(Object obj) {
        AbstractC10162zU0.b();
        throw new D80();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        return e().j(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection collection) {
        InterfaceC5248hu0 interfaceC5248hu0G;
        int iH;
        boolean z;
        AbstractC3720cU0 abstractC3720cU0B;
        G10.g(collection, "elements");
        Set setQ0 = AbstractC2455Um.Q0(collection);
        C9883yU0 c9883yU0E = e();
        boolean z2 = false;
        do {
            synchronized (AbstractC10162zU0.a) {
                C9883yU0.a aVar = (C9883yU0.a) AbstractC5124hU0.A((C9883yU0.a) c9883yU0E.e(), AbstractC3720cU0.e.b());
                interfaceC5248hu0G = aVar.g();
                iH = aVar.h();
                G91 g91 = G91.a;
            }
            G10.d(interfaceC5248hu0G);
            InterfaceC5248hu0.a aVarBuilder = interfaceC5248hu0G.builder();
            Iterator it = c9883yU0E.entrySet().iterator();
            while (true) {
                z = true;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (setQ0.contains(entry.getValue())) {
                    aVarBuilder.remove(entry.getKey());
                    z2 = true;
                }
            }
            G91 g912 = G91.a;
            InterfaceC5248hu0 interfaceC5248hu0A = aVarBuilder.a();
            if (G10.c(interfaceC5248hu0A, interfaceC5248hu0G)) {
                break;
            }
            synchronized (AbstractC10162zU0.a) {
                C9883yU0.a aVar2 = (C9883yU0.a) c9883yU0E.e();
                AbstractC5124hU0.D();
                synchronized (AbstractC5124hU0.C()) {
                    abstractC3720cU0B = AbstractC3720cU0.e.b();
                    C9883yU0.a aVar3 = (C9883yU0.a) AbstractC5124hU0.Z(aVar2, c9883yU0E, abstractC3720cU0B);
                    if (aVar3.h() == iH) {
                        aVar3.i(interfaceC5248hu0A);
                        aVar3.j(aVar3.h() + 1);
                    } else {
                        z = false;
                    }
                }
                AbstractC5124hU0.J(abstractC3720cU0B, c9883yU0E);
            }
        } while (!z);
        return z2;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection collection) {
        InterfaceC5248hu0 interfaceC5248hu0G;
        int iH;
        boolean z;
        AbstractC3720cU0 abstractC3720cU0B;
        G10.g(collection, "elements");
        Set setQ0 = AbstractC2455Um.Q0(collection);
        C9883yU0 c9883yU0E = e();
        boolean z2 = false;
        do {
            synchronized (AbstractC10162zU0.a) {
                C9883yU0.a aVar = (C9883yU0.a) AbstractC5124hU0.A((C9883yU0.a) c9883yU0E.e(), AbstractC3720cU0.e.b());
                interfaceC5248hu0G = aVar.g();
                iH = aVar.h();
                G91 g91 = G91.a;
            }
            G10.d(interfaceC5248hu0G);
            InterfaceC5248hu0.a aVarBuilder = interfaceC5248hu0G.builder();
            Iterator it = c9883yU0E.entrySet().iterator();
            while (true) {
                z = true;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (!setQ0.contains(entry.getValue())) {
                    aVarBuilder.remove(entry.getKey());
                    z2 = true;
                }
            }
            G91 g912 = G91.a;
            InterfaceC5248hu0 interfaceC5248hu0A = aVarBuilder.a();
            if (G10.c(interfaceC5248hu0A, interfaceC5248hu0G)) {
                break;
            }
            synchronized (AbstractC10162zU0.a) {
                C9883yU0.a aVar2 = (C9883yU0.a) c9883yU0E.e();
                AbstractC5124hU0.D();
                synchronized (AbstractC5124hU0.C()) {
                    abstractC3720cU0B = AbstractC3720cU0.e.b();
                    C9883yU0.a aVar3 = (C9883yU0.a) AbstractC5124hU0.Z(aVar2, c9883yU0E, abstractC3720cU0B);
                    if (aVar3.h() == iH) {
                        aVar3.i(interfaceC5248hu0A);
                        aVar3.j(aVar3.h() + 1);
                    } else {
                        z = false;
                    }
                }
                AbstractC5124hU0.J(abstractC3720cU0B, c9883yU0E);
            }
        } while (!z);
        return z2;
    }

    public Void s(Collection collection) {
        G10.g(collection, "elements");
        AbstractC10162zU0.b();
        throw new D80();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public C9612xW0 iterator() {
        return new C9612xW0(e(), ((QY) e().f().g().entrySet()).iterator());
    }
}
