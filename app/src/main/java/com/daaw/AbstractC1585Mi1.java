package com.daaw;

import android.os.Build;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: renamed from: com.daaw.Mi1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1585Mi1 {
    public UUID a;
    public C1793Oi1 b;
    public Set c;

    /* JADX INFO: renamed from: com.daaw.Mi1$a */
    public static abstract class a {
        public C1793Oi1 c;
        public Class e;
        public boolean a = false;
        public Set d = new HashSet();
        public UUID b = UUID.randomUUID();

        public a(Class cls) {
            this.e = cls;
            this.c = new C1793Oi1(this.b.toString(), cls.getName());
            a(cls.getName());
        }

        public final a a(String str) {
            this.d.add(str);
            return d();
        }

        public final AbstractC1585Mi1 b() {
            AbstractC1585Mi1 abstractC1585Mi1C = c();
            C6358lr c6358lr = this.c.j;
            int i = Build.VERSION.SDK_INT;
            boolean z = (i >= 24 && c6358lr.e()) || c6358lr.f() || c6358lr.g() || (i >= 23 && c6358lr.h());
            if (this.c.q && z) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            this.b = UUID.randomUUID();
            C1793Oi1 c1793Oi1 = new C1793Oi1(this.c);
            this.c = c1793Oi1;
            c1793Oi1.a = this.b.toString();
            return abstractC1585Mi1C;
        }

        public abstract AbstractC1585Mi1 c();

        public abstract a d();

        public final a e(C6358lr c6358lr) {
            this.c.j = c6358lr;
            return d();
        }

        public final a f(androidx.work.b bVar) {
            this.c.e = bVar;
            return d();
        }
    }

    public AbstractC1585Mi1(UUID uuid, C1793Oi1 c1793Oi1, Set set) {
        this.a = uuid;
        this.b = c1793Oi1;
        this.c = set;
    }

    public String a() {
        return this.a.toString();
    }

    public Set b() {
        return this.c;
    }

    public C1793Oi1 c() {
        return this.b;
    }
}
