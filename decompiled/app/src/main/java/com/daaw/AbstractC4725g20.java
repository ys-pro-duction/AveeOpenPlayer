package com.daaw;

import com.daaw.AsyncTaskC2517Vb1;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.g20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4725g20 {
    public static C0425Bg1 a = new C0425Bg1();

    /* JADX INFO: renamed from: com.daaw.g20$a */
    public static class a extends AbstractC3043a20 {
        public static AbstractC3043a20 g = new a();

        /* JADX INFO: renamed from: com.daaw.g20$a$a, reason: collision with other inner class name */
        public class C0174a implements AsyncTaskC2517Vb1.b {
            public C0174a() {
            }

            @Override // com.daaw.AsyncTaskC2517Vb1.b
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void a(List list, boolean z) {
                if (z) {
                    return;
                }
                AbstractC4725g20.a.a(list, 0, null);
            }
        }

        /* JADX INFO: renamed from: com.daaw.g20$a$b */
        public static abstract class b extends AbstractC7524q2 {
            public b() {
                super(a.g);
            }

            public abstract AsyncTaskC2517Vb1 c(Object obj);
        }

        public a() {
            super(1, false, true, AbstractC3374bD0.P, JD0.Q2);
        }

        @Override // com.daaw.AbstractC3043a20
        public void b(List list, List list2) {
            for (int i = 0; i < list.size(); i++) {
                ((b) list2.get(i)).c(list.get(i)).a(new C0174a());
            }
        }
    }
}
