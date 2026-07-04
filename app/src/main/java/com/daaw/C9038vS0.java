package com.daaw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.vS0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C9038vS0 {
    public final Map a = new LinkedHashMap();

    /* JADX INFO: renamed from: com.daaw.vS0$a */
    public final class a {
        public final String a;
        public final /* synthetic */ C9038vS0 b;

        /* JADX INFO: renamed from: com.daaw.vS0$a$a, reason: collision with other inner class name */
        public final class C0246a {
            public final String a;
            public final List b;
            public C0576Cs0 c;
            public final /* synthetic */ a d;

            public C0246a(a aVar, String str) {
                G10.g(str, "functionName");
                this.d = aVar;
                this.a = str;
                this.b = new ArrayList();
                this.c = D61.a("V", null);
            }

            public final C0576Cs0 a() {
                C7079oS0 c7079oS0 = C7079oS0.a;
                String strB = this.d.b();
                String str = this.a;
                List list = this.b;
                ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((C0576Cs0) it.next()).c());
                }
                String strL = c7079oS0.l(strB, c7079oS0.j(str, arrayList, (String) this.c.c()));
                M71 m71 = (M71) this.c.d();
                List list2 = this.b;
                ArrayList arrayList2 = new ArrayList(AbstractC1703Nm.v(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((M71) ((C0576Cs0) it2.next()).d());
                }
                return D61.a(strL, new C2816Xy0(m71, arrayList2));
            }

            public final void b(String str, I30... i30Arr) {
                M71 m71;
                G10.g(str, "type");
                G10.g(i30Arr, "qualifiers");
                List list = this.b;
                if (i30Arr.length == 0) {
                    m71 = null;
                } else {
                    Iterable<C8500tZ> iterableU0 = AbstractC5431ib.u0(i30Arr);
                    LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC8417tE0.d(AbstractC1369Kg0.d(AbstractC1703Nm.v(iterableU0, 10)), 16));
                    for (C8500tZ c8500tZ : iterableU0) {
                        linkedHashMap.put(Integer.valueOf(c8500tZ.c()), (I30) c8500tZ.d());
                    }
                    m71 = new M71(linkedHashMap);
                }
                list.add(D61.a(str, m71));
            }

            public final void c(EnumC6703n50 enumC6703n50) {
                G10.g(enumC6703n50, "type");
                this.c = D61.a(enumC6703n50.h(), null);
            }

            public final void d(String str, I30... i30Arr) {
                G10.g(str, "type");
                G10.g(i30Arr, "qualifiers");
                Iterable<C8500tZ> iterableU0 = AbstractC5431ib.u0(i30Arr);
                LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC8417tE0.d(AbstractC1369Kg0.d(AbstractC1703Nm.v(iterableU0, 10)), 16));
                for (C8500tZ c8500tZ : iterableU0) {
                    linkedHashMap.put(Integer.valueOf(c8500tZ.c()), (I30) c8500tZ.d());
                }
                this.c = D61.a(str, new M71(linkedHashMap));
            }
        }

        public a(C9038vS0 c9038vS0, String str) {
            G10.g(str, "className");
            this.b = c9038vS0;
            this.a = str;
        }

        public final void a(String str, NQ nq) {
            G10.g(str, "name");
            G10.g(nq, "block");
            Map map = this.b.a;
            C0246a c0246a = new C0246a(this, str);
            nq.invoke(c0246a);
            C0576Cs0 c0576Cs0A = c0246a.a();
            map.put(c0576Cs0A.c(), c0576Cs0A.d());
        }

        public final String b() {
            return this.a;
        }
    }

    public final Map b() {
        return this.a;
    }
}
