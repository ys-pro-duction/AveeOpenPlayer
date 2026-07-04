package com.daaw;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.e20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4157e20 {
    public static C0746Eg1 a = new C0746Eg1();
    public static C0746Eg1 b = new C0746Eg1();
    public static C10217zg1 c = new C10217zg1();
    public static C10217zg1 d = new C10217zg1();
    public static C10217zg1 e = new C10217zg1();
    public static C0321Ag1 f = new C0321Ag1();
    public static C0425Bg1 g = new C0425Bg1();
    public static C0321Ag1 h = new C0321Ag1();

    /* JADX INFO: renamed from: com.daaw.e20$a */
    public static class a extends AbstractC3043a20 {
        public static AbstractC3043a20 g = new a();

        /* JADX INFO: renamed from: com.daaw.e20$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC0167a extends AbstractC7524q2 {
            public AbstractC0167a() {
                super(a.g);
            }

            public abstract void c(Object obj, List list);
        }

        public a() {
            super(3, true, AbstractC3374bD0.P, JD0.O2);
        }

        @Override // com.daaw.AbstractC3043a20
        public void b(List list, List list2) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                ((AbstractC0167a) list2.get(i)).c(list.get(i), arrayList);
            }
            AbstractC4157e20.f.a(arrayList, 3);
        }
    }

    /* JADX INFO: renamed from: com.daaw.e20$b */
    public static class b extends AbstractC3043a20 {
        public static AbstractC3043a20 g = new b();

        /* JADX INFO: renamed from: com.daaw.e20$b$a */
        public static abstract class a extends AbstractC7524q2 {
            public a() {
                super(b.g);
            }

            public abstract void c(Object obj, List list);
        }

        public b() {
            super(3, true, AbstractC3374bD0.P, JD0.N2);
        }

        @Override // com.daaw.AbstractC3043a20
        public void b(List list, List list2) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                ((a) list2.get(i)).c(list.get(i), arrayList);
            }
            AbstractC4157e20.f.a(arrayList, 3);
        }
    }

    /* JADX INFO: renamed from: com.daaw.e20$c */
    public static class c extends AbstractC3043a20 {
        public static AbstractC3043a20 g = new c();

        /* JADX INFO: renamed from: com.daaw.e20$c$a */
        public static abstract class a extends AbstractC7524q2 {
            public a() {
                super(c.g);
            }

            public abstract void c(Object obj, List list);
        }

        public c() {
            super(3, true, AbstractC3374bD0.P, JD0.P2);
        }

        @Override // com.daaw.AbstractC3043a20
        public void b(List list, List list2) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                ((a) list2.get(i)).c(list.get(i), arrayList);
            }
            AbstractC4157e20.f.a(arrayList, 2);
        }
    }

    /* JADX INFO: renamed from: com.daaw.e20$d */
    public static class d {
        public C2078Qw0 a;

        public d(C2078Qw0 c2078Qw0) {
            this.a = c2078Qw0;
        }

        public C2078Qw0 a() {
            return this.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.e20$e */
    public static class e extends AbstractC3043a20 {
        public static AbstractC3043a20 g = new e();

        /* JADX INFO: renamed from: com.daaw.e20$e$a */
        public static abstract class a extends AbstractC7524q2 {
            public a() {
                super(e.g);
            }

            public abstract C61 c(Object obj, List list, InterfaceC8771uX interfaceC8771uX, C2138Rl0 c2138Rl0);
        }

        public e() {
            super(2, false, true, AbstractC3374bD0.P, JD0.R2, true);
        }

        @Override // com.daaw.AbstractC3043a20
        public void b(List list, List list2) {
            ArrayList arrayList = new ArrayList();
            InterfaceC8771uX interfaceC8771uX = null;
            InterfaceC8771uX interfaceC8771uX2 = (InterfaceC8771uX) AbstractC4157e20.a.a(null);
            C2138Rl0 c2138Rl0 = (C2138Rl0) AbstractC4157e20.b.a(new C2138Rl0());
            boolean z = false;
            InterfaceC8771uX interfaceC8771uX3 = null;
            boolean zBooleanValue = false;
            int iIntValue = 0;
            for (int i = 0; i < list.size(); i++) {
                C61 c61C = ((a) list2.get(i)).c(list.get(i), arrayList, interfaceC8771uX2, c2138Rl0);
                iIntValue = ((Integer) c61C.a).intValue();
                interfaceC8771uX3 = (InterfaceC8771uX) c61C.b;
                zBooleanValue = ((Boolean) c61C.c).booleanValue();
            }
            if (list.size() > 1) {
                iIntValue = 0;
            } else {
                z = zBooleanValue;
                interfaceC8771uX = interfaceC8771uX3;
            }
            if (z) {
                AbstractC4157e20.e.a(Integer.valueOf(iIntValue));
            } else {
                AbstractC4157e20.g.a(arrayList, Integer.valueOf(iIntValue), interfaceC8771uX);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.e20$f */
    public static class f extends AbstractC3043a20 {
        public static AbstractC3043a20 g = new f();

        /* JADX INFO: renamed from: com.daaw.e20$f$a */
        public static abstract class a extends AbstractC7524q2 {
            public a() {
                super(f.g);
            }

            public abstract void c(Object obj, List list);
        }

        public f() {
            super(2, true, false, AbstractC3374bD0.P, JD0.S2, true);
        }

        @Override // com.daaw.AbstractC3043a20
        public void b(List list, List list2) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                ((a) list2.get(i)).c(list.get(i), arrayList);
            }
            AbstractC4157e20.g.a(arrayList, 0, null);
        }
    }

    /* JADX INFO: renamed from: com.daaw.e20$g */
    public static class g extends AbstractC3043a20 {
        public static AbstractC3043a20 g = new g();

        /* JADX INFO: renamed from: com.daaw.e20$g$a */
        public static abstract class a extends AbstractC7524q2 {
            public a() {
                super(g.g);
            }

            public abstract void c(Object obj, List list);
        }

        public g() {
            super(1, false, true, AbstractC3374bD0.P, JD0.Q2, true);
        }

        @Override // com.daaw.AbstractC3043a20
        public void b(List list, List list2) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                ((a) list2.get(i)).c(list.get(i), arrayList);
            }
            AbstractC4157e20.g.a(arrayList, 0, null);
        }
    }

    /* JADX INFO: renamed from: com.daaw.e20$h */
    public static class h extends AbstractC3043a20 {
        public static AbstractC3043a20 g = new h();

        /* JADX INFO: renamed from: com.daaw.e20$h$a */
        public static abstract class a extends AbstractC7524q2 {
            public a() {
                super(h.g);
            }

            public abstract void c(Object obj, List list);
        }

        public h() {
            super(4, true, AbstractC3374bD0.s, JD0.Y2);
        }

        @Override // com.daaw.AbstractC3043a20
        public void b(List list, List list2) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                ((a) list2.get(i)).c(list.get(i), arrayList);
            }
            AbstractC4157e20.h.a(arrayList, Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: com.daaw.e20$i */
    public static class i extends AbstractC3043a20 {
        public static AbstractC3043a20 g = new i();

        /* JADX INFO: renamed from: com.daaw.e20$i$a */
        public static abstract class a extends AbstractC7524q2 {
            public a() {
                super(i.g);
            }

            public abstract void c(Object obj, List list);
        }

        public i() {
            super(7, false, true, AbstractC3374bD0.D, JD0.Z2);
        }

        @Override // com.daaw.AbstractC3043a20
        public void b(List list, List list2) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                ((a) list2.get(i)).c(list.get(i), arrayList);
            }
            AbstractC4157e20.d.a(arrayList);
        }
    }

    /* JADX INFO: renamed from: com.daaw.e20$j */
    public static class j extends AbstractC3043a20 {
        public static AbstractC3043a20 g = new j();

        /* JADX INFO: renamed from: com.daaw.e20$j$a */
        public static abstract class a extends AbstractC7524q2 {
            public a() {
                super(j.g);
            }

            public abstract d c(Object obj);
        }

        public j() {
            super(6, false, true, AbstractC3374bD0.D, JD0.M2);
        }

        @Override // com.daaw.AbstractC3043a20
        public void b(List list, List list2) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                arrayList.add(((a) list2.get(i)).c(list.get(i)));
            }
            AbstractC4157e20.c.a(arrayList);
        }
    }
}
