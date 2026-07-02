package com.daaw;

import com.daaw.AbstractC5362iK;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.vj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9115vj0 implements JG0 {
    public SY a = NC.a();
    public InterfaceC7942rZ b;

    /* JADX INFO: renamed from: com.daaw.vj0$b */
    public class b implements Iterable {

        /* JADX INFO: renamed from: com.daaw.vj0$b$a */
        public class a implements Iterator {
            public final /* synthetic */ Iterator B;

            public a(Iterator it) {
                this.B = it;
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public LC next() {
                return (LC) ((Map.Entry) this.B.next()).getValue();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.B.hasNext();
            }
        }

        public b() {
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new a(C9115vj0.this.a.iterator());
        }
    }

    @Override // com.daaw.JG0
    public Map a(C5890kC0 c5890kC0, AbstractC5362iK.a aVar, Set set) {
        HashMap map = new HashMap();
        Iterator itW = this.a.w(TC.l((UI0) c5890kC0.m().c("")));
        while (itW.hasNext()) {
            Map.Entry entry = (Map.Entry) itW.next();
            LC lc = (LC) entry.getValue();
            TC tc = (TC) entry.getKey();
            if (!c5890kC0.m().o(tc.q())) {
                break;
            }
            if (tc.q().p() <= c5890kC0.m().p() + 1 && AbstractC5362iK.a.k(lc).compareTo(aVar) > 0 && (set.contains(lc.getKey()) || c5890kC0.t(lc))) {
                map.put(lc.getKey(), lc.a());
            }
        }
        return map;
    }

    @Override // com.daaw.JG0
    public void b(InterfaceC7942rZ interfaceC7942rZ) {
        this.b = interfaceC7942rZ;
    }

    @Override // com.daaw.JG0
    public Map c(Iterable iterable) {
        HashMap map = new HashMap();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            TC tc = (TC) it.next();
            map.put(tc, e(tc));
        }
        return map;
    }

    @Override // com.daaw.JG0
    public Map d(String str, AbstractC5362iK.a aVar, int i) {
        throw new UnsupportedOperationException("getAll(String, IndexOffset, int) is not supported.");
    }

    @Override // com.daaw.JG0
    public C4083dm0 e(TC tc) {
        LC lc = (LC) this.a.m(tc);
        return lc != null ? lc.a() : C4083dm0.q(tc);
    }

    @Override // com.daaw.JG0
    public void f(C4083dm0 c4083dm0, CU0 cu0) {
        AbstractC6557mb.d(this.b != null, "setIndexManager() not called", new Object[0]);
        AbstractC6557mb.d(!cu0.equals(CU0.C), "Cannot add document to the RemoteDocumentCache with a read time of zero", new Object[0]);
        this.a = this.a.v(c4083dm0.getKey(), c4083dm0.a().v(cu0));
        this.b.h(c4083dm0.getKey().o());
    }

    public long h(C1872Pc0 c1872Pc0) {
        Iterator it = new b().iterator();
        long jC = 0;
        while (it.hasNext()) {
            jC += (long) c1872Pc0.j((LC) it.next()).c();
        }
        return jC;
    }

    public Iterable i() {
        return new b();
    }

    @Override // com.daaw.JG0
    public void removeAll(Collection collection) {
        AbstractC6557mb.d(this.b != null, "setIndexManager() not called", new Object[0]);
        SY syA = NC.a();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            TC tc = (TC) it.next();
            this.a = this.a.y(tc);
            syA = syA.v(tc, C4083dm0.r(tc, CU0.C));
        }
        this.b.i(syA);
    }
}
