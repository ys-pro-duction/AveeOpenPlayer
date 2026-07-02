package com.daaw;

import com.daaw.AbstractC0304Ac0;
import com.daaw.C1971Qb;

/* JADX INFO: renamed from: com.daaw.i10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5278i10 {
    public static final C1971Qb.c a = C1971Qb.c.a("internal:io.grpc.config-selector");

    /* JADX INFO: renamed from: com.daaw.i10$b */
    public static final class b {
        public final C6262lX0 a;
        public final Object b;

        /* JADX INFO: renamed from: com.daaw.i10$b$a */
        public static final class a {
            public Object a;

            public b a() {
                AbstractC7785qy0.u(this.a != null, "config is not set");
                return new b(C6262lX0.f, this.a, null);
            }

            public a b(Object obj) {
                this.a = AbstractC7785qy0.o(obj, "config");
                return this;
            }

            public a() {
            }
        }

        public static a d() {
            return new a();
        }

        public Object a() {
            return this.b;
        }

        public InterfaceC2243Sl b() {
            return null;
        }

        public C6262lX0 c() {
            return this.a;
        }

        public b(C6262lX0 c6262lX0, Object obj, InterfaceC2243Sl interfaceC2243Sl) {
            this.a = (C6262lX0) AbstractC7785qy0.o(c6262lX0, "status");
            this.b = obj;
        }
    }

    public abstract b a(AbstractC0304Ac0.f fVar);
}
