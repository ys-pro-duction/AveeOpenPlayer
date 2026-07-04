package com.daaw;

import com.daaw.AbstractC3246am;
import com.daaw.C1971Qb;
import j$.util.DesugarCollections;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: com.daaw.Ac0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0304Ac0 {
    public static final C1971Qb.c b = C1971Qb.c.a("internal:health-checking-config");
    public int a;

    /* JADX INFO: renamed from: com.daaw.Ac0$b */
    public static final class b {
        public final List a;
        public final C1971Qb b;
        public final Object[][] c;

        /* JADX INFO: renamed from: com.daaw.Ac0$b$a */
        public static final class a {
            public List a;
            public C1971Qb b = C1971Qb.c;
            public Object[][] c = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);

            public b b() {
                return new b(this.a, this.b, this.c);
            }

            public final a c(Object[][] objArr) {
                Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, objArr.length, 2);
                this.c = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
                return this;
            }

            public a d(C5350iH c5350iH) {
                this.a = Collections.singletonList(c5350iH);
                return this;
            }

            public a e(List list) {
                AbstractC7785qy0.e(!list.isEmpty(), "addrs is empty");
                this.a = DesugarCollections.unmodifiableList(new ArrayList(list));
                return this;
            }

            public a f(C1971Qb c1971Qb) {
                this.b = (C1971Qb) AbstractC7785qy0.o(c1971Qb, "attrs");
                return this;
            }
        }

        public static a c() {
            return new a();
        }

        public List a() {
            return this.a;
        }

        public C1971Qb b() {
            return this.b;
        }

        public a d() {
            return c().e(this.a).f(this.b).c(this.c);
        }

        public String toString() {
            return AbstractC6329ll0.b(this).d("addrs", this.a).d("attrs", this.b).d("customOptions", Arrays.deepToString(this.c)).toString();
        }

        public b(List list, C1971Qb c1971Qb, Object[][] objArr) {
            this.a = (List) AbstractC7785qy0.o(list, "addresses are not set");
            this.b = (C1971Qb) AbstractC7785qy0.o(c1971Qb, "attrs");
            this.c = (Object[][]) AbstractC7785qy0.o(objArr, "customOptions");
        }
    }

    /* JADX INFO: renamed from: com.daaw.Ac0$c */
    public static abstract class c {
        public abstract AbstractC0304Ac0 a(d dVar);
    }

    /* JADX INFO: renamed from: com.daaw.Ac0$d */
    public static abstract class d {
        public abstract h a(b bVar);

        public abstract AbstractC6323lk b();

        public abstract ScheduledExecutorService c();

        public abstract ExecutorC3034a01 d();

        public abstract void e();

        public abstract void f(EnumC1304Jq enumC1304Jq, i iVar);
    }

    /* JADX INFO: renamed from: com.daaw.Ac0$e */
    public static final class e {
        public static final e e = new e(null, null, C6262lX0.f, false);
        public final h a;
        public final AbstractC3246am.a b;
        public final C6262lX0 c;
        public final boolean d;

        public e(h hVar, AbstractC3246am.a aVar, C6262lX0 c6262lX0, boolean z) {
            this.a = hVar;
            this.b = aVar;
            this.c = (C6262lX0) AbstractC7785qy0.o(c6262lX0, "status");
            this.d = z;
        }

        public static e e(C6262lX0 c6262lX0) {
            AbstractC7785qy0.e(!c6262lX0.o(), "drop status shouldn't be OK");
            return new e(null, null, c6262lX0, true);
        }

        public static e f(C6262lX0 c6262lX0) {
            AbstractC7785qy0.e(!c6262lX0.o(), "error status shouldn't be OK");
            return new e(null, null, c6262lX0, false);
        }

        public static e g() {
            return e;
        }

        public static e h(h hVar) {
            return i(hVar, null);
        }

        public static e i(h hVar, AbstractC3246am.a aVar) {
            return new e((h) AbstractC7785qy0.o(hVar, "subchannel"), aVar, C6262lX0.f, false);
        }

        public C6262lX0 a() {
            return this.c;
        }

        public AbstractC3246am.a b() {
            return this.b;
        }

        public h c() {
            return this.a;
        }

        public boolean d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return AbstractC8301sp0.a(this.a, eVar.a) && AbstractC8301sp0.a(this.c, eVar.c) && AbstractC8301sp0.a(this.b, eVar.b) && this.d == eVar.d;
        }

        public int hashCode() {
            return AbstractC8301sp0.b(this.a, this.c, this.b, Boolean.valueOf(this.d));
        }

        public String toString() {
            return AbstractC6329ll0.b(this).d("subchannel", this.a).d("streamTracerFactory", this.b).d("status", this.c).e("drop", this.d).toString();
        }
    }

    /* JADX INFO: renamed from: com.daaw.Ac0$f */
    public static abstract class f {
        public abstract C1168Ii a();

        public abstract C2756Xj0 b();

        public abstract C6882nk0 c();
    }

    /* JADX INFO: renamed from: com.daaw.Ac0$g */
    public static final class g {
        public final List a;
        public final C1971Qb b;
        public final Object c;

        /* JADX INFO: renamed from: com.daaw.Ac0$g$a */
        public static final class a {
            public List a;
            public C1971Qb b = C1971Qb.c;
            public Object c;

            public g a() {
                return new g(this.a, this.b, this.c);
            }

            public a b(List list) {
                this.a = list;
                return this;
            }

            public a c(C1971Qb c1971Qb) {
                this.b = c1971Qb;
                return this;
            }

            public a d(Object obj) {
                this.c = obj;
                return this;
            }
        }

        public static a d() {
            return new a();
        }

        public List a() {
            return this.a;
        }

        public C1971Qb b() {
            return this.b;
        }

        public Object c() {
            return this.c;
        }

        public a e() {
            return d().b(this.a).c(this.b).d(this.c);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return AbstractC8301sp0.a(this.a, gVar.a) && AbstractC8301sp0.a(this.b, gVar.b) && AbstractC8301sp0.a(this.c, gVar.c);
        }

        public int hashCode() {
            return AbstractC8301sp0.b(this.a, this.b, this.c);
        }

        public String toString() {
            return AbstractC6329ll0.b(this).d("addresses", this.a).d("attributes", this.b).d("loadBalancingPolicyConfig", this.c).toString();
        }

        public g(List list, C1971Qb c1971Qb, Object obj) {
            this.a = DesugarCollections.unmodifiableList(new ArrayList((Collection) AbstractC7785qy0.o(list, "addresses")));
            this.b = (C1971Qb) AbstractC7785qy0.o(c1971Qb, "attributes");
            this.c = obj;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Ac0$h */
    public static abstract class h {
        public final C5350iH a() {
            List listB = b();
            AbstractC7785qy0.w(listB.size() == 1, "%s does not have exactly one group", listB);
            return (C5350iH) listB.get(0);
        }

        public abstract List b();

        public abstract C1971Qb c();

        public abstract Object d();

        public abstract void e();

        public abstract void f();

        public abstract void g(j jVar);

        public abstract void h(List list);
    }

    /* JADX INFO: renamed from: com.daaw.Ac0$j */
    public interface j {
        void a(C1408Kq c1408Kq);
    }

    public boolean a(g gVar) {
        if (!gVar.a().isEmpty() || b()) {
            int i2 = this.a;
            this.a = i2 + 1;
            if (i2 == 0) {
                d(gVar);
            }
            this.a = 0;
            return true;
        }
        c(C6262lX0.u.q("NameResolver returned no usable address. addrs=" + gVar.a() + ", attrs=" + gVar.b()));
        return false;
    }

    public boolean b() {
        return false;
    }

    public abstract void c(C6262lX0 c6262lX0);

    public void d(g gVar) {
        int i2 = this.a;
        this.a = i2 + 1;
        if (i2 == 0) {
            a(gVar);
        }
        this.a = 0;
    }

    public abstract void f();

    /* JADX INFO: renamed from: com.daaw.Ac0$i */
    public static abstract class i {
        public abstract e a(f fVar);

        public void b() {
        }
    }

    public void e() {
    }
}
