package com.daaw;

import com.daaw.H31;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.h80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5034h80 {
    public static final a c = new a(null);
    public final C4755g80 a;
    public boolean b;

    /* JADX INFO: renamed from: com.daaw.h80$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final C5034h80 a() {
            return new C5034h80(null);
        }

        public a() {
        }
    }

    public /* synthetic */ C5034h80(AbstractC2911Yw abstractC2911Yw) {
        this();
    }

    public final void a() {
        this.a.a();
    }

    public final C4755g80 b() {
        return this.a;
    }

    public final void c(List list) throws C9743xy {
        this.a.f(list, this.b, false);
    }

    public final C5034h80 d(List list) throws C9743xy {
        G10.g(list, "modules");
        AbstractC2316Td0 abstractC2316Td0D = this.a.d();
        EnumC9912yb0 enumC9912yb0 = EnumC9912yb0.C;
        if (abstractC2316Td0D.d().compareTo(enumC9912yb0) > 0) {
            c(list);
            return this;
        }
        long jA = H31.a.a();
        c(list);
        long jC = H31.a.c(jA);
        int iJ = this.a.c().j();
        this.a.d().b(enumC9912yb0, "Started " + iJ + " definitions in " + ME.a(jC) + " ms");
        return this;
    }

    public C5034h80() {
        this.a = new C4755g80();
        this.b = true;
    }
}
