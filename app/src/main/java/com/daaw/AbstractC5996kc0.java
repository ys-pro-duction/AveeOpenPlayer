package com.daaw;

import com.daaw.AbstractC3317b10;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.kc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5996kc0 {
    public static final AbstractC5996kc0 a;
    public static final AbstractC5996kc0 b;

    /* JADX INFO: renamed from: com.daaw.kc0$b */
    public static final class b extends AbstractC5996kc0 {
        public static final Class c = DesugarCollections.unmodifiableList(Collections.EMPTY_LIST).getClass();

        public b() {
            super();
        }

        public static List f(Object obj, long j) {
            return (List) AbstractC3188aa1.G(obj, j);
        }

        public static List g(Object obj, long j, int i) {
            List listF = f(obj, j);
            if (listF.isEmpty()) {
                List c6279lb0 = listF instanceof InterfaceC6837nb0 ? new C6279lb0(i) : ((listF instanceof InterfaceC7231oz0) && (listF instanceof AbstractC3317b10.e)) ? ((AbstractC3317b10.e) listF).n(i) : new ArrayList(i);
                AbstractC3188aa1.V(obj, j, c6279lb0);
                return c6279lb0;
            }
            if (c.isAssignableFrom(listF.getClass())) {
                ArrayList arrayList = new ArrayList(listF.size() + i);
                arrayList.addAll(listF);
                AbstractC3188aa1.V(obj, j, arrayList);
                return arrayList;
            }
            if (listF instanceof Q91) {
                C6279lb0 c6279lb02 = new C6279lb0(listF.size() + i);
                c6279lb02.addAll((Q91) listF);
                AbstractC3188aa1.V(obj, j, c6279lb02);
                return c6279lb02;
            }
            if ((listF instanceof InterfaceC7231oz0) && (listF instanceof AbstractC3317b10.e)) {
                AbstractC3317b10.e eVar = (AbstractC3317b10.e) listF;
                if (!eVar.C()) {
                    AbstractC3317b10.e eVarN = eVar.n(listF.size() + i);
                    AbstractC3188aa1.V(obj, j, eVarN);
                    return eVarN;
                }
            }
            return listF;
        }

        @Override // com.daaw.AbstractC5996kc0
        public void c(Object obj, long j) {
            Object objUnmodifiableList;
            List list = (List) AbstractC3188aa1.G(obj, j);
            if (list instanceof InterfaceC6837nb0) {
                objUnmodifiableList = ((InterfaceC6837nb0) list).j();
            } else {
                if (c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof InterfaceC7231oz0) && (list instanceof AbstractC3317b10.e)) {
                    AbstractC3317b10.e eVar = (AbstractC3317b10.e) list;
                    if (eVar.C()) {
                        eVar.l();
                        return;
                    }
                    return;
                }
                objUnmodifiableList = DesugarCollections.unmodifiableList(list);
            }
            AbstractC3188aa1.V(obj, j, objUnmodifiableList);
        }

        @Override // com.daaw.AbstractC5996kc0
        public void d(Object obj, Object obj2, long j) {
            List listF = f(obj2, j);
            List listG = g(obj, j, listF.size());
            int size = listG.size();
            int size2 = listF.size();
            if (size > 0 && size2 > 0) {
                listG.addAll(listF);
            }
            if (size > 0) {
                listF = listG;
            }
            AbstractC3188aa1.V(obj, j, listF);
        }

        @Override // com.daaw.AbstractC5996kc0
        public List e(Object obj, long j) {
            return g(obj, j, 10);
        }
    }

    /* JADX INFO: renamed from: com.daaw.kc0$c */
    public static final class c extends AbstractC5996kc0 {
        public c() {
            super();
        }

        public static AbstractC3317b10.e f(Object obj, long j) {
            return (AbstractC3317b10.e) AbstractC3188aa1.G(obj, j);
        }

        @Override // com.daaw.AbstractC5996kc0
        public void c(Object obj, long j) {
            f(obj, j).l();
        }

        @Override // com.daaw.AbstractC5996kc0
        public void d(Object obj, Object obj2, long j) {
            AbstractC3317b10.e eVarF = f(obj, j);
            AbstractC3317b10.e eVarF2 = f(obj2, j);
            int size = eVarF.size();
            int size2 = eVarF2.size();
            if (size > 0 && size2 > 0) {
                if (!eVarF.C()) {
                    eVarF = eVarF.n(size2 + size);
                }
                eVarF.addAll(eVarF2);
            }
            if (size > 0) {
                eVarF2 = eVarF;
            }
            AbstractC3188aa1.V(obj, j, eVarF2);
        }

        @Override // com.daaw.AbstractC5996kc0
        public List e(Object obj, long j) {
            AbstractC3317b10.e eVarF = f(obj, j);
            if (eVarF.C()) {
                return eVarF;
            }
            int size = eVarF.size();
            AbstractC3317b10.e eVarN = eVarF.n(size == 0 ? 10 : size * 2);
            AbstractC3188aa1.V(obj, j, eVarN);
            return eVarN;
        }
    }

    static {
        a = new b();
        b = new c();
    }

    public static AbstractC5996kc0 a() {
        return a;
    }

    public static AbstractC5996kc0 b() {
        return b;
    }

    public abstract void c(Object obj, long j);

    public abstract void d(Object obj, Object obj2, long j);

    public abstract List e(Object obj, long j);

    public AbstractC5996kc0() {
    }
}
