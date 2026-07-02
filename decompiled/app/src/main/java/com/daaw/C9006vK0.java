package com.daaw;

import com.daaw.C9802yA;

/* JADX INFO: renamed from: com.daaw.vK0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C9006vK0 {
    public static final a c = new a(null);
    public final C9523xA a;
    public final C4959gs0 b;

    /* JADX INFO: renamed from: com.daaw.vK0$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final C9006vK0 a(ClassLoader classLoader) {
            G10.g(classLoader, "classLoader");
            C4221eG0 c4221eG0 = new C4221eG0(classLoader);
            C9802yA.a aVar = C9802yA.b;
            ClassLoader classLoader2 = G91.class.getClassLoader();
            G10.f(classLoader2, "getClassLoader(...)");
            C9802yA.a.C0255a c0255aA = aVar.a(c4221eG0, new C4221eG0(classLoader2), new JF0(classLoader), "runtime module for " + classLoader, C8441tK0.b, C9285wK0.a);
            return new C9006vK0(c0255aA.a().a(), new C4959gs0(c0255aA.b(), c4221eG0), null);
        }

        public a() {
        }
    }

    public /* synthetic */ C9006vK0(C9523xA c9523xA, C4959gs0 c4959gs0, AbstractC2911Yw abstractC2911Yw) {
        this(c9523xA, c4959gs0);
    }

    public final C9523xA a() {
        return this.a;
    }

    public final InterfaceC2968Zk0 b() {
        return this.a.q();
    }

    public final C4959gs0 c() {
        return this.b;
    }

    public C9006vK0(C9523xA c9523xA, C4959gs0 c4959gs0) {
        this.a = c9523xA;
        this.b = c4959gs0;
    }
}
