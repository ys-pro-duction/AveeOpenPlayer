package com.daaw;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class H11 {
    public static final H11 b = new H11();
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    public static abstract class a {
        public static a c(boolean z, int i, int i2, int i3) {
            return new C7683qd(z, i, i2, i3);
        }

        public static a d(boolean z, QI qi) {
            C4898gg c4898ggB = qi.b();
            if (c4898ggB == null) {
                return null;
            }
            return c(z, c4898ggB.c0(), c4898ggB.a0().a0().size(), c4898ggB.a0().c0());
        }

        public abstract boolean a();

        public abstract int b();

        public abstract int e();

        public abstract int f();
    }

    public static abstract class b {
        public static b b(int i, int i2, a aVar) {
            return new C7961rd(i, i2, aVar);
        }

        public static b d(boolean z, int i, QI qi) {
            return b(i, qi.a(), a.d(z, qi));
        }

        public abstract a a();

        public abstract int c();

        public abstract int e();
    }

    public static H11 a() {
        return b;
    }

    public void b(b bVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            AbstractC6314li0.a(((AtomicReference) it.next()).get());
        }
    }
}
