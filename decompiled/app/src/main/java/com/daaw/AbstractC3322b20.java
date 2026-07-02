package com.daaw;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.b20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3322b20 {
    public static C0321Ag1 a = new C0321Ag1();
    public static C10217zg1 b = new C10217zg1();

    /* JADX INFO: renamed from: com.daaw.b20$a */
    public static class a extends AbstractC3043a20 {
        public static AbstractC3043a20 g = new a();

        /* JADX INFO: renamed from: com.daaw.b20$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC0155a extends AbstractC7524q2 {
            public AbstractC0155a() {
                super(a.g);
            }

            public abstract void c(Object obj, List list);
        }

        public a() {
            super(4, true, AbstractC3374bD0.s, JD0.K2);
        }

        @Override // com.daaw.AbstractC3043a20
        public void b(List list, List list2) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                ((AbstractC0155a) list2.get(i)).c(list.get(i), arrayList);
            }
            AbstractC3322b20.b.a(arrayList);
        }
    }

    /* JADX INFO: renamed from: com.daaw.b20$b */
    public static class b extends AbstractC3043a20 {
        public static AbstractC3043a20 g = new b();

        /* JADX INFO: renamed from: com.daaw.b20$b$a */
        public static abstract class a extends AbstractC7524q2 {
            public a() {
                super(b.g);
            }

            public abstract void c(Object obj, C2138Rl0 c2138Rl0);
        }

        public b() {
            super(4, false, true, AbstractC3374bD0.v, JD0.U2);
        }

        @Override // com.daaw.AbstractC3043a20
        public void b(List list, List list2) {
            C2138Rl0 c2138Rl0 = new C2138Rl0();
            for (int i = 0; i < list.size(); i++) {
                ((a) list2.get(i)).c(list.get(i), c2138Rl0);
            }
            B61 b61 = c2138Rl0.size() > 0 ? c2138Rl0.get(c2138Rl0.size() - 1) : null;
            if (b61 != null) {
                AbstractC3322b20.a.a((String) b61.a, (String) b61.b);
            }
        }
    }
}
