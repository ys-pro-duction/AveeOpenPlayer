package com.daaw;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.f20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4436f20 {
    public static C0425Bg1 a = new C0425Bg1();

    /* JADX INFO: renamed from: com.daaw.f20$a */
    public static class a extends AbstractC3043a20 {
        public static AbstractC3043a20 g = new a();

        /* JADX INFO: renamed from: com.daaw.f20$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC0171a extends AbstractC7524q2 {
            public AbstractC0171a() {
                super(a.g);
            }

            public abstract void c(Object obj, List list);
        }

        public a() {
            super(1, false, true, AbstractC3374bD0.P, JD0.Q2);
        }

        @Override // com.daaw.AbstractC3043a20
        public void b(List list, List list2) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                ((AbstractC0171a) list2.get(i)).c(list.get(i), arrayList);
            }
            AbstractC4436f20.a.a(arrayList, 0, null);
        }
    }
}
