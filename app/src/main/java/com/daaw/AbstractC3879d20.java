package com.daaw;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.d20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3879d20 {
    public static C0850Fg1 a = new C0850Fg1();
    public static C9938yg1 b = new C9938yg1();
    public static C10217zg1 c = new C10217zg1();
    public static C10217zg1 d = new C10217zg1();

    /* JADX INFO: renamed from: com.daaw.d20$a */
    public static class a extends AbstractC3043a20 {
        public static AbstractC3043a20 g = new a();

        /* JADX INFO: renamed from: com.daaw.d20$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC0162a extends AbstractC7524q2 {
            public AbstractC0162a() {
                super(a.g);
            }

            public abstract InterfaceC6540mX c(Object obj);
        }

        public a() {
            super(1, false, AbstractC3374bD0.P, JD0.T2);
        }

        @Override // com.daaw.AbstractC3043a20
        public void b(List list, List list2) {
            int size = list.size() - 1;
            if (size < 0) {
                return;
            }
            AbstractC3879d20.d.a(((AbstractC0162a) list2.get(size)).c(list.get(size)));
        }
    }

    /* JADX INFO: renamed from: com.daaw.d20$b */
    public static class b extends AbstractC3043a20 {
        public static AbstractC3043a20 g = new b();

        /* JADX INFO: renamed from: com.daaw.d20$b$a */
        public static abstract class a extends AbstractC7524q2 {
            public a() {
                super(b.g);
            }

            public abstract void c(Object obj, List list, List list2);
        }

        public b() {
            super(5, true, AbstractC3374bD0.P, JD0.V2);
        }

        @Override // com.daaw.AbstractC3043a20
        public void b(List list, List list2) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                ((a) list2.get(i)).c(list.get(i), arrayList, arrayList2);
            }
            AbstractC3879d20.c.a(arrayList2);
        }
    }

    /* JADX INFO: renamed from: com.daaw.d20$c */
    public static class c extends AbstractC3043a20 {
        public static AbstractC3043a20 g = new c();

        /* JADX INFO: renamed from: com.daaw.d20$c$a */
        public static abstract class a extends AbstractC7524q2 {
            public a() {
                super(c.g);
            }
        }

        public c() {
            super(5, true, AbstractC3374bD0.E, JD0.a3);
        }

        @Override // com.daaw.AbstractC3043a20
        public void b(List list, List list2) {
            AbstractC3879d20.b.a();
        }

        @Override // com.daaw.AbstractC3043a20
        public boolean e() {
            return ((Boolean) AbstractC3879d20.a.a(Integer.valueOf(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.t), Boolean.FALSE)).booleanValue();
        }
    }
}
