package com.daaw;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Uu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2487Uu {
    public static C10217zg1 a = new C10217zg1();
    public static C10217zg1 b = new C10217zg1();

    /* JADX INFO: renamed from: com.daaw.Uu$a */
    public static class a extends AbstractC3043a20 {
        public static a g = new a();

        /* JADX INFO: renamed from: com.daaw.Uu$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC0125a extends AbstractC7524q2 {
            public AbstractC0125a() {
                super(a.g);
            }

            public abstract void c(Object obj, List list);
        }

        public a() {
            super(1, false, true, AbstractC3374bD0.v, JD0.c7);
        }

        @Override // com.daaw.AbstractC3043a20
        public void b(List list, List list2) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                ((AbstractC0125a) list2.get(i)).c(list.get(i), arrayList);
            }
            if (arrayList.size() > 0) {
                AbstractC2487Uu.b.a((Integer) arrayList.get(0));
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Uu$b */
    public static class b extends AbstractC3043a20 {
        public static AbstractC3043a20 g = new b();

        /* JADX INFO: renamed from: com.daaw.Uu$b$a */
        public static abstract class a extends AbstractC7524q2 {
            public a() {
                super(b.g);
            }

            public abstract void c(Object obj, List list);
        }

        public b() {
            super(0, false, true, AbstractC3374bD0.v, JD0.e7);
        }

        @Override // com.daaw.AbstractC3043a20
        public void b(List list, List list2) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                ((a) list2.get(i)).c(list.get(i), arrayList);
            }
            if (arrayList.size() > 0) {
                AbstractC2487Uu.a.a((Integer) arrayList.get(0));
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Uu$c */
    public static class c extends AbstractC3043a20 {
        public static AbstractC3043a20 g = new c();

        /* JADX INFO: renamed from: com.daaw.Uu$c$a */
        public static abstract class a extends AbstractC7524q2 {
            public a() {
                super(c.g);
            }

            public abstract void c(Object obj, List list);
        }

        public c() {
            super(0, false, true, AbstractC3374bD0.v, JD0.e7);
        }

        @Override // com.daaw.AbstractC3043a20
        public void b(List list, List list2) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                ((a) list2.get(i)).c(list.get(i), arrayList);
            }
            if (arrayList.size() > 0) {
                AbstractC2487Uu.a.a((Integer) arrayList.get(0));
            }
        }
    }
}
