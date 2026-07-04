package com.daaw;

import java.util.Comparator;

/* JADX INFO: renamed from: com.daaw.xq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C9708xq0 {
    public static final a b = new a(null);
    public final C8565tm0 a = new C8565tm0(new E90[16], 0);

    /* JADX INFO: renamed from: com.daaw.xq0$a */
    public static final class a {

        /* JADX INFO: renamed from: com.daaw.xq0$a$a, reason: collision with other inner class name */
        public static final class C0254a implements Comparator {
            public static final C0254a B = new C0254a();

            @Override // java.util.Comparator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(E90 e90, E90 e902) {
                G10.g(e90, "a");
                G10.g(e902, "b");
                int iH = G10.h(e902.R(), e90.R());
                return iH != 0 ? iH : G10.h(e90.hashCode(), e902.hashCode());
            }
        }

        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public a() {
        }
    }

    public final void a() {
        this.a.E(a.C0254a.B);
        C8565tm0 c8565tm0 = this.a;
        int iR = c8565tm0.r();
        if (iR > 0) {
            int i = iR - 1;
            Object[] objArrQ = c8565tm0.q();
            do {
                E90 e90 = (E90) objArrQ[i];
                if (e90.h0()) {
                    b(e90);
                }
                i--;
            } while (i >= 0);
        }
        this.a.k();
    }

    public final void b(E90 e90) {
        e90.K();
        int i = 0;
        e90.j1(false);
        C8565tm0 c8565tm0R0 = e90.r0();
        int iR = c8565tm0R0.r();
        if (iR > 0) {
            Object[] objArrQ = c8565tm0R0.q();
            do {
                b((E90) objArrQ[i]);
                i++;
            } while (i < iR);
        }
    }

    public final void c(E90 e90) {
        G10.g(e90, "node");
        this.a.d(e90);
        e90.j1(true);
    }

    public final void d(E90 e90) {
        G10.g(e90, "rootNode");
        this.a.k();
        this.a.d(e90);
        e90.j1(true);
    }
}
