package com.daaw;

import com.daaw.AbstractC2560Vm0;
import com.daaw.AbstractC4550fQ0;
import j$.util.DesugarCollections;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.daaw.Zm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2976Zm0 {
    public static final Logger e = Logger.getLogger(C2976Zm0.class.getName());
    public static C2976Zm0 f;
    public final AbstractC2560Vm0.c a = new b();
    public String b = "unknown";
    public final LinkedHashSet c = new LinkedHashSet();
    public OY d = OY.j();

    /* JADX INFO: renamed from: com.daaw.Zm0$b */
    public final class b extends AbstractC2560Vm0.c {
        public b() {
        }

        @Override // com.daaw.AbstractC2560Vm0.c
        public String a() {
            String str;
            synchronized (C2976Zm0.this) {
                str = C2976Zm0.this.b;
            }
            return str;
        }

        @Override // com.daaw.AbstractC2560Vm0.c
        public AbstractC2560Vm0 b(URI uri, AbstractC2560Vm0.a aVar) {
            AbstractC2872Ym0 abstractC2872Ym0 = (AbstractC2872Ym0) C2976Zm0.this.f().get(uri.getScheme());
            if (abstractC2872Ym0 == null) {
                return null;
            }
            return abstractC2872Ym0.b(uri, aVar);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Zm0$c */
    public static final class c implements AbstractC4550fQ0.b {
        public c() {
        }

        @Override // com.daaw.AbstractC4550fQ0.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int b(AbstractC2872Ym0 abstractC2872Ym0) {
            return abstractC2872Ym0.e();
        }

        @Override // com.daaw.AbstractC4550fQ0.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(AbstractC2872Ym0 abstractC2872Ym0) {
            return abstractC2872Ym0.d();
        }
    }

    public static synchronized C2976Zm0 d() {
        try {
            if (f == null) {
                List<AbstractC2872Ym0> listE = AbstractC4550fQ0.e(AbstractC2872Ym0.class, e(), AbstractC2872Ym0.class.getClassLoader(), new c());
                if (listE.isEmpty()) {
                    e.warning("No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
                }
                f = new C2976Zm0();
                for (AbstractC2872Ym0 abstractC2872Ym0 : listE) {
                    e.fine("Service loader found " + abstractC2872Ym0);
                    f.b(abstractC2872Ym0);
                }
                f.g();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f;
    }

    public static List e() {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(HC.class);
        } catch (ClassNotFoundException e2) {
            e.log(Level.FINE, "Unable to find DNS NameResolver", (Throwable) e2);
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public final synchronized void b(AbstractC2872Ym0 abstractC2872Ym0) {
        AbstractC7785qy0.e(abstractC2872Ym0.d(), "isAvailable() returned false");
        this.c.add(abstractC2872Ym0);
    }

    public AbstractC2560Vm0.c c() {
        return this.a;
    }

    public synchronized Map f() {
        return this.d;
    }

    public final synchronized void g() {
        try {
            HashMap map = new HashMap();
            String strC = "unknown";
            int iE = Integer.MIN_VALUE;
            for (AbstractC2872Ym0 abstractC2872Ym0 : this.c) {
                String strC2 = abstractC2872Ym0.c();
                AbstractC2872Ym0 abstractC2872Ym02 = (AbstractC2872Ym0) map.get(strC2);
                if (abstractC2872Ym02 == null || abstractC2872Ym02.e() < abstractC2872Ym0.e()) {
                    map.put(strC2, abstractC2872Ym0);
                }
                if (iE < abstractC2872Ym0.e()) {
                    iE = abstractC2872Ym0.e();
                    strC = abstractC2872Ym0.c();
                }
            }
            this.d = OY.c(map);
            this.b = strC;
        } catch (Throwable th) {
            throw th;
        }
    }
}
