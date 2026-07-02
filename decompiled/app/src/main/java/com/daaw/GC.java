package com.daaw;

import com.daaw.AbstractC2560Vm0;
import com.daaw.NR0;
import com.revenuecat.purchases.common.Constants;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public class GC extends AbstractC2560Vm0 {
    public static String A;
    public static final Logger s = Logger.getLogger(GC.class.getName());
    public static final Set t = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("clientLanguage", "percentage", "clientHostname", "serviceConfig")));
    public static final String u;
    public static final String v;
    public static final String w;
    public static boolean x;
    public static boolean y;
    public static boolean z;
    public final InterfaceC8405tB0 a;
    public final Random b = new Random();
    public volatile b c = d.INSTANCE;
    public final AtomicReference d = new AtomicReference();
    public final String e;
    public final String f;
    public final int g;
    public final NR0.d h;
    public final long i;
    public final ExecutorC3034a01 j;
    public final C8772uX0 k;
    public boolean l;
    public boolean m;
    public Executor n;
    public final boolean o;
    public final AbstractC2560Vm0.f p;
    public boolean q;
    public AbstractC2560Vm0.d r;

    public interface b {
        List a(String str);
    }

    public static final class c {
        public C6262lX0 a;
        public List b;
        public AbstractC2560Vm0.b c;
        public C1971Qb d;

        public c() {
        }
    }

    public enum d implements b {
        INSTANCE;

        @Override // com.daaw.GC.b
        public List a(String str) {
            return DesugarCollections.unmodifiableList(Arrays.asList(InetAddress.getAllByName(str)));
        }
    }

    public final class e implements Runnable {
        public final AbstractC2560Vm0.d B;

        public class a implements Runnable {
            public final /* synthetic */ boolean B;

            public a(boolean z) {
                this.B = z;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.B) {
                    GC gc = GC.this;
                    gc.l = true;
                    if (gc.i > 0) {
                        GC.this.k.f().g();
                    }
                }
                GC.this.q = false;
            }
        }

        public e(AbstractC2560Vm0.d dVar) {
            this.B = (AbstractC2560Vm0.d) AbstractC7785qy0.o(dVar, "savedListener");
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            ExecutorC3034a01 executorC3034a01;
            a aVar;
            Logger logger = GC.s;
            Level level = Level.FINER;
            if (logger.isLoggable(level)) {
                GC.s.finer("Attempting DNS resolution of " + GC.this.f);
            }
            c cVarN = null;
            try {
                try {
                    C5350iH c5350iHM = GC.this.m();
                    AbstractC2560Vm0.e.a aVarD = AbstractC2560Vm0.e.d();
                    if (c5350iHM != null) {
                        if (GC.s.isLoggable(level)) {
                            GC.s.finer("Using proxy address " + c5350iHM);
                        }
                        aVarD.b(Collections.singletonList(c5350iHM));
                    } else {
                        cVarN = GC.this.n(false);
                        if (cVarN.a != null) {
                            this.B.a(cVarN.a);
                            z = cVarN != null && cVarN.a == null;
                            executorC3034a01 = GC.this.j;
                            aVar = new a(z);
                            executorC3034a01.execute(aVar);
                        }
                        if (cVarN.b != null) {
                            aVarD.b(cVarN.b);
                        }
                        if (cVarN.c != null) {
                            aVarD.d(cVarN.c);
                        }
                        C1971Qb c1971Qb = cVarN.d;
                        if (c1971Qb != null) {
                            aVarD.c(c1971Qb);
                        }
                    }
                    this.B.b(aVarD.a());
                    z = cVarN != null && cVarN.a == null;
                    executorC3034a01 = GC.this.j;
                    aVar = new a(z);
                    executorC3034a01.execute(aVar);
                } catch (IOException e) {
                    this.B.a(C6262lX0.u.q("Unable to resolve host " + GC.this.f).p(e));
                    GC.this.j.execute(new a(0 != 0 && null.a == null));
                }
            } catch (Throwable th) {
                GC.this.j.execute(new a(0 != 0 && null.a == null));
                throw th;
            }
        }
    }

    public interface f {
    }

    public interface g {
    }

    static {
        String property = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi", "true");
        u = property;
        String property2 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi_localhost", "false");
        v = property2;
        String property3 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_service_config", "false");
        w = property3;
        x = Boolean.parseBoolean(property);
        y = Boolean.parseBoolean(property2);
        z = Boolean.parseBoolean(property3);
        u(GC.class.getClassLoader());
    }

    public GC(String str, String str2, AbstractC2560Vm0.a aVar, NR0.d dVar, C8772uX0 c8772uX0, boolean z2) {
        AbstractC7785qy0.o(aVar, "args");
        this.h = dVar;
        URI uriCreate = URI.create("//" + ((String) AbstractC7785qy0.o(str2, "name")));
        AbstractC7785qy0.j(uriCreate.getHost() != null, "Invalid DNS name: %s", str2);
        this.e = (String) AbstractC7785qy0.p(uriCreate.getAuthority(), "nameUri (%s) doesn't have an authority", uriCreate);
        this.f = uriCreate.getHost();
        if (uriCreate.getPort() == -1) {
            this.g = aVar.a();
        } else {
            this.g = uriCreate.getPort();
        }
        this.a = (InterfaceC8405tB0) AbstractC7785qy0.o(aVar.c(), "proxyDetector");
        this.i = r(z2);
        this.k = (C8772uX0) AbstractC7785qy0.o(c8772uX0, "stopwatch");
        this.j = (ExecutorC3034a01) AbstractC7785qy0.o(aVar.e(), "syncContext");
        Executor executorB = aVar.b();
        this.n = executorB;
        this.o = executorB == null;
        this.p = (AbstractC2560Vm0.f) AbstractC7785qy0.o(aVar.d(), "serviceConfigParser");
    }

    public static boolean B(boolean z2, boolean z3, String str) {
        if (!z2) {
            return false;
        }
        if ("localhost".equalsIgnoreCase(str)) {
            return z3;
        }
        if (str.contains(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR)) {
            return false;
        }
        boolean z4 = true;
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '.') {
                z4 &= cCharAt >= '0' && cCharAt <= '9';
            }
        }
        return true ^ z4;
    }

    public static final List o(Map map) {
        return AbstractC8650u40.g(map, "clientLanguage");
    }

    public static final List p(Map map) {
        return AbstractC8650u40.g(map, "clientHostname");
    }

    public static String q() {
        if (A == null) {
            try {
                A = InetAddress.getLocalHost().getHostName();
            } catch (UnknownHostException e2) {
                throw new RuntimeException(e2);
            }
        }
        return A;
    }

    public static long r(boolean z2) {
        if (z2) {
            return 0L;
        }
        String property = System.getProperty("networkaddress.cache.ttl");
        long j = 30;
        if (property != null) {
            try {
                j = Long.parseLong(property);
            } catch (NumberFormatException unused) {
                s.log(Level.WARNING, "Property({0}) valid is not valid number format({1}), fall back to default({2})", new Object[]{"networkaddress.cache.ttl", property, 30L});
            }
        }
        return j > 0 ? TimeUnit.SECONDS.toNanos(j) : j;
    }

    public static final Double s(Map map) {
        return AbstractC8650u40.h(map, "percentage");
    }

    public static g u(ClassLoader classLoader) {
        try {
            try {
                try {
                    AbstractC6314li0.a(Class.forName("com.daaw.T30", true, classLoader).asSubclass(g.class).getConstructor(null).newInstance(null));
                    throw null;
                } catch (Exception e2) {
                    s.log(Level.FINE, "Can't construct JndiResourceResolverFactory, skipping.", (Throwable) e2);
                    return null;
                }
            } catch (Exception e3) {
                s.log(Level.FINE, "Can't find JndiResourceResolverFactory ctor, skipping.", (Throwable) e3);
                return null;
            }
        } catch (ClassCastException e4) {
            s.log(Level.FINE, "Unable to cast JndiResourceResolverFactory, skipping.", (Throwable) e4);
            return null;
        } catch (ClassNotFoundException e5) {
            s.log(Level.FINE, "Unable to find JndiResourceResolverFactory, skipping.", (Throwable) e5);
            return null;
        }
    }

    public static Map v(Map map, Random random, String str) {
        for (Map.Entry entry : map.entrySet()) {
            AbstractC9365wd1.a(t.contains(entry.getKey()), "Bad key: %s", entry);
        }
        List listO = o(map);
        if (listO != null && !listO.isEmpty()) {
            Iterator it = listO.iterator();
            while (it.hasNext()) {
                if ("java".equalsIgnoreCase((String) it.next())) {
                }
            }
            return null;
        }
        Double dS = s(map);
        if (dS != null) {
            int iIntValue = dS.intValue();
            AbstractC9365wd1.a(iIntValue >= 0 && iIntValue <= 100, "Bad percentage: %s", dS);
            if (random.nextInt(100) >= iIntValue) {
                return null;
            }
        }
        List listP = p(map);
        if (listP != null && !listP.isEmpty()) {
            Iterator it2 = listP.iterator();
            while (it2.hasNext()) {
                if (((String) it2.next()).equals(str)) {
                }
            }
            return null;
        }
        Map mapJ = AbstractC8650u40.j(map, "serviceConfig");
        if (mapJ != null) {
            return mapJ;
        }
        throw new C9644xd1(String.format("key '%s' missing in '%s'", map, "serviceConfig"));
    }

    public static AbstractC2560Vm0.b w(List list, Random random, String str) {
        try {
            Iterator it = x(list).iterator();
            Map mapV = null;
            while (it.hasNext()) {
                try {
                    mapV = v((Map) it.next(), random, str);
                    if (mapV != null) {
                        break;
                    }
                } catch (RuntimeException e2) {
                    return AbstractC2560Vm0.b.b(C6262lX0.h.q("failed to pick service config choice").p(e2));
                }
            }
            if (mapV == null) {
                return null;
            }
            return AbstractC2560Vm0.b.a(mapV);
        } catch (IOException | RuntimeException e3) {
            return AbstractC2560Vm0.b.b(C6262lX0.h.q("failed to parse TXT records").p(e3));
        }
    }

    public static List x(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.startsWith("grpc_config=")) {
                Object objA = AbstractC6698n40.a(str.substring(12));
                if (!(objA instanceof List)) {
                    throw new ClassCastException("wrong type " + objA);
                }
                arrayList.addAll(AbstractC8650u40.a((List) objA));
            } else {
                s.log(Level.FINE, "Ignoring non service config {0}", new Object[]{str});
            }
        }
        return arrayList;
    }

    public final AbstractC2560Vm0.b A() {
        List list = Collections.EMPTY_LIST;
        t();
        if (list.isEmpty()) {
            s.log(Level.FINE, "No TXT records found for {0}", new Object[]{this.f});
            return null;
        }
        AbstractC2560Vm0.b bVarW = w(list, this.b, q());
        if (bVarW != null) {
            return bVarW.d() != null ? AbstractC2560Vm0.b.b(bVarW.d()) : this.p.a((Map) bVarW.c());
        }
        return null;
    }

    @Override // com.daaw.AbstractC2560Vm0
    public String a() {
        return this.e;
    }

    @Override // com.daaw.AbstractC2560Vm0
    public void b() {
        AbstractC7785qy0.u(this.r != null, "not started");
        y();
    }

    @Override // com.daaw.AbstractC2560Vm0
    public void c() {
        if (this.m) {
            return;
        }
        this.m = true;
        Executor executor = this.n;
        if (executor == null || !this.o) {
            return;
        }
        this.n = (Executor) NR0.f(this.h, executor);
    }

    @Override // com.daaw.AbstractC2560Vm0
    public void d(AbstractC2560Vm0.d dVar) {
        AbstractC7785qy0.u(this.r == null, "already started");
        if (this.o) {
            this.n = (Executor) NR0.d(this.h);
        }
        this.r = (AbstractC2560Vm0.d) AbstractC7785qy0.o(dVar, "listener");
        y();
    }

    public final boolean l() {
        if (!this.l) {
            return true;
        }
        long j = this.i;
        if (j != 0) {
            return j > 0 && this.k.d(TimeUnit.NANOSECONDS) > this.i;
        }
        return true;
    }

    public final C5350iH m() {
        AbstractC8126sB0 abstractC8126sB0A = this.a.a(InetSocketAddress.createUnresolved(this.f, this.g));
        if (abstractC8126sB0A != null) {
            return new C5350iH(abstractC8126sB0A);
        }
        return null;
    }

    public c n(boolean z2) {
        c cVar = new c();
        try {
            cVar.b = z();
        } catch (Exception e2) {
            if (!z2) {
                cVar.a = C6262lX0.u.q("Unable to resolve host " + this.f).p(e2);
                return cVar;
            }
        }
        if (z) {
            cVar.c = A();
        }
        return cVar;
    }

    public f t() {
        if (!B(x, y, this.f)) {
            return null;
        }
        AbstractC6314li0.a(this.d.get());
        return null;
    }

    public final void y() {
        if (this.q || this.m || !l()) {
            return;
        }
        this.q = true;
        this.n.execute(new e(this.r));
    }

    public final List z() {
        Exception e2 = null;
        try {
            try {
                List listA = this.c.a(this.f);
                ArrayList arrayList = new ArrayList(listA.size());
                Iterator it = listA.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C5350iH(new InetSocketAddress((InetAddress) it.next(), this.g)));
                }
                return DesugarCollections.unmodifiableList(arrayList);
            } catch (Exception e3) {
                e2 = e3;
                AbstractC9490x31.f(e2);
                throw new RuntimeException(e2);
            }
        } catch (Throwable th) {
            if (e2 != null) {
                s.log(Level.FINE, "Address resolution failure", (Throwable) e2);
            }
            throw th;
        }
    }
}
