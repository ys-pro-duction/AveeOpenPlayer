package com.daaw;

import android.app.job.JobInfo;
import com.daaw.C5721jd;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.vN0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9018vN0 {

    /* JADX INFO: renamed from: com.daaw.vN0$a */
    public static class a {
        public InterfaceC6333lm a;
        public Map b = new HashMap();

        public a a(EnumC8911uz0 enumC8911uz0, b bVar) {
            this.b.put(enumC8911uz0, bVar);
            return this;
        }

        public AbstractC9018vN0 b() {
            if (this.a == null) {
                throw new NullPointerException("missing required property: clock");
            }
            if (this.b.keySet().size() < EnumC8911uz0.values().length) {
                throw new IllegalStateException("Not all priorities have been configured");
            }
            Map map = this.b;
            this.b = new HashMap();
            return AbstractC9018vN0.d(this.a, map);
        }

        public a c(InterfaceC6333lm interfaceC6333lm) {
            this.a = interfaceC6333lm;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.daaw.vN0$b */
    public static abstract class b {

        /* JADX INFO: renamed from: com.daaw.vN0$b$a */
        public static abstract class a {
            public abstract b a();

            public abstract a b(long j);

            public abstract a c(Set set);

            public abstract a d(long j);
        }

        public static a a() {
            return new C5721jd.b().c(Collections.EMPTY_SET);
        }

        public abstract long b();

        public abstract Set c();

        public abstract long d();
    }

    /* JADX INFO: renamed from: com.daaw.vN0$c */
    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    public static a b() {
        return new a();
    }

    public static AbstractC9018vN0 d(InterfaceC6333lm interfaceC6333lm, Map map) {
        return new C5441id(interfaceC6333lm, map);
    }

    public static AbstractC9018vN0 f(InterfaceC6333lm interfaceC6333lm) {
        return b().a(EnumC8911uz0.DEFAULT, b.a().b(30000L).d(86400000L).a()).a(EnumC8911uz0.HIGHEST, b.a().b(1000L).d(86400000L).a()).a(EnumC8911uz0.VERY_LOW, b.a().b(86400000L).d(86400000L).c(i(c.DEVICE_IDLE)).a()).c(interfaceC6333lm).b();
    }

    public static Set i(Object... objArr) {
        return DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(objArr)));
    }

    public final long a(int i, long j) {
        return (long) (Math.pow(3.0d, i - 1) * j * Math.max(1.0d, Math.log(10000.0d) / Math.log((j > 1 ? j : 2L) * ((long) r7))));
    }

    public JobInfo.Builder c(JobInfo.Builder builder, EnumC8911uz0 enumC8911uz0, long j, int i) {
        builder.setMinimumLatency(g(enumC8911uz0, j, i));
        j(builder, ((b) h().get(enumC8911uz0)).c());
        return builder;
    }

    public abstract InterfaceC6333lm e();

    public long g(EnumC8911uz0 enumC8911uz0, long j, int i) {
        long jA = j - e().a();
        b bVar = (b) h().get(enumC8911uz0);
        return Math.min(Math.max(a(i, bVar.b()), jA), bVar.d());
    }

    public abstract Map h();

    public final void j(JobInfo.Builder builder, Set set) {
        if (set.contains(c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }
}
