package com.daaw;

import java.util.List;

/* JADX INFO: renamed from: com.daaw.c20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3600c20 {
    public static C0321Ag1 a = new C0321Ag1();
    public static C0321Ag1 b = new C0321Ag1();
    public static C0321Ag1 c = new C0321Ag1();

    /* JADX INFO: renamed from: com.daaw.c20$a */
    public static class a extends AbstractC3043a20 {
        public static AbstractC3043a20 g = new a();

        /* JADX INFO: renamed from: com.daaw.c20$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC0157a extends AbstractC7524q2 {
            public AbstractC0157a() {
                super(a.g);
            }

            public abstract void c(Object obj, C2138Rl0 c2138Rl0);
        }

        public a() {
            super(4, false, true, AbstractC3374bD0.v, JD0.L2);
        }

        @Override // com.daaw.AbstractC3043a20
        public void b(List list, List list2) {
            C2138Rl0 c2138Rl0 = new C2138Rl0();
            for (int i = 0; i < list.size(); i++) {
                ((AbstractC0157a) list2.get(i)).c(list.get(i), c2138Rl0);
            }
            B61 b61 = c2138Rl0.size() > 0 ? c2138Rl0.get(c2138Rl0.size() - 1) : null;
            if (b61 != null) {
                Long l = (Long) b61.a;
                l.longValue();
                AbstractC3600c20.c.a(l, (String) b61.b);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.c20$b */
    public static class b extends AbstractC3043a20 {
        public static AbstractC3043a20 g = new b();

        /* JADX INFO: renamed from: com.daaw.c20$b$a */
        public static abstract class a extends AbstractC7524q2 {
            public a() {
                super(b.g);
            }

            public abstract void c(Object obj, C2138Rl0 c2138Rl0);
        }

        public b() {
            super(4, true, true, AbstractC3374bD0.v, JD0.W2);
        }

        @Override // com.daaw.AbstractC3043a20
        public void b(List list, List list2) {
            C2138Rl0 c2138Rl0 = new C2138Rl0();
            for (int i = 0; i < list.size(); i++) {
                ((a) list2.get(i)).c(list.get(i), c2138Rl0);
            }
            B61 b61 = c2138Rl0.size() > 0 ? c2138Rl0.get(c2138Rl0.size() - 1) : null;
            if (b61 != null) {
                AbstractC3600c20.a.a((String) b61.a, (String) b61.b);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.c20$c */
    public static class c extends AbstractC3043a20 {
        public static AbstractC3043a20 g = new c();

        /* JADX INFO: renamed from: com.daaw.c20$c$a */
        public static abstract class a extends AbstractC7524q2 {
            public a() {
                super(c.g);
            }

            public abstract void c(Object obj, C2138Rl0 c2138Rl0);
        }

        public c() {
            super(4, false, true, AbstractC3374bD0.N, JD0.X2);
        }

        @Override // com.daaw.AbstractC3043a20
        public void b(List list, List list2) {
            C2138Rl0 c2138Rl0 = new C2138Rl0();
            for (int i = 0; i < list.size(); i++) {
                ((a) list2.get(i)).c(list.get(i), c2138Rl0);
            }
            B61 b61 = c2138Rl0.size() > 0 ? c2138Rl0.get(c2138Rl0.size() - 1) : null;
            if (b61 != null) {
                Long l = (Long) b61.a;
                l.longValue();
                AbstractC3600c20.b.a(l, (String) b61.b);
            }
        }
    }
}
