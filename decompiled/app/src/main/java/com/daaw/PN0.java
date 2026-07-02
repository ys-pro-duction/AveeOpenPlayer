package com.daaw;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class PN0 {
    public static final a e = new a(null);
    public static final C5140hY0 f = AbstractC4773gC0.a("_root_");
    public final C4755g80 a;
    public final Set b;
    public final Map c;
    public final NN0 d;

    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final C5140hY0 a() {
            return PN0.f;
        }

        public a() {
        }
    }

    public PN0(C4755g80 c4755g80) {
        G10.g(c4755g80, "_koin");
        this.a = c4755g80;
        C8112s80 c8112s80 = C8112s80.a;
        Set setE = c8112s80.e();
        this.b = setE;
        Map mapD = c8112s80.d();
        this.c = mapD;
        NN0 nn0 = new NN0(f, "_root_", true, c4755g80);
        this.d = nn0;
        setE.add(nn0.h());
        mapD.put(nn0.e(), nn0);
    }

    public final NN0 b() {
        return this.d;
    }

    public final void c(C2030Qk0 c2030Qk0) {
        this.b.addAll(c2030Qk0.d());
    }

    public final void d(Set set) {
        G10.g(set, "modules");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            c((C2030Qk0) it.next());
        }
    }
}
