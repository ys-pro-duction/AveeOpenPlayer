package com.daaw;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.xz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C9747xz {
    public final boolean a;
    public final O90 b = AbstractC3192ab0.b(EnumC7395pb0.D, b.B);
    public final Comparator c;
    public final V51 d;

    /* JADX INFO: renamed from: com.daaw.xz$a */
    public static final class a implements Comparator {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(E90 e90, E90 e902) {
            G10.g(e90, "l1");
            G10.g(e902, "l2");
            int iH = G10.h(e90.R(), e902.R());
            return iH != 0 ? iH : G10.h(e90.hashCode(), e902.hashCode());
        }
    }

    /* JADX INFO: renamed from: com.daaw.xz$b */
    public static final class b extends AbstractC4192e90 implements LQ {
        public static final b B = new b();

        public b() {
            super(0);
        }

        @Override // com.daaw.LQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map invoke() {
            return new LinkedHashMap();
        }
    }

    public C9747xz(boolean z) {
        this.a = z;
        a aVar = new a();
        this.c = aVar;
        this.d = new V51(aVar);
    }

    public final void a(E90 e90) {
        G10.g(e90, "node");
        if (!e90.C0()) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.a) {
            Integer num = (Integer) c().get(e90);
            if (num == null) {
                c().put(e90, Integer.valueOf(e90.R()));
            } else {
                if (num.intValue() != e90.R()) {
                    throw new IllegalStateException("Check failed.");
                }
            }
        }
        this.d.add(e90);
    }

    public final boolean b(E90 e90) {
        G10.g(e90, "node");
        boolean zContains = this.d.contains(e90);
        if (!this.a || zContains == c().containsKey(e90)) {
            return zContains;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final Map c() {
        return (Map) this.b.getValue();
    }

    public final boolean d() {
        return this.d.isEmpty();
    }

    public final E90 e() {
        E90 e90 = (E90) this.d.first();
        G10.f(e90, "node");
        f(e90);
        return e90;
    }

    public final boolean f(E90 e90) {
        G10.g(e90, "node");
        if (!e90.C0()) {
            throw new IllegalStateException("Check failed.");
        }
        boolean zRemove = this.d.remove(e90);
        if (!this.a) {
            return zRemove;
        }
        Integer num = (Integer) c().remove(e90);
        if (!zRemove) {
            if (num == null) {
                return zRemove;
            }
            throw new IllegalStateException("Check failed.");
        }
        int iR = e90.R();
        if (num == null || num.intValue() != iR) {
            throw new IllegalStateException("Check failed.");
        }
        return zRemove;
    }

    public String toString() {
        String string = this.d.toString();
        G10.f(string, "set.toString()");
        return string;
    }
}
