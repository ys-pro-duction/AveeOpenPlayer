package com.daaw;

import com.daaw.AbstractC4550fQ0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.daaw.Cc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0512Cc0 {
    public static C0512Cc0 d;
    public final LinkedHashSet a = new LinkedHashSet();
    public final LinkedHashMap b = new LinkedHashMap();
    public static final Logger c = Logger.getLogger(C0512Cc0.class.getName());
    public static final Iterable e = c();

    /* JADX INFO: renamed from: com.daaw.Cc0$a */
    public static final class a implements AbstractC4550fQ0.b {
        @Override // com.daaw.AbstractC4550fQ0.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int b(AbstractC0408Bc0 abstractC0408Bc0) {
            return abstractC0408Bc0.c();
        }

        @Override // com.daaw.AbstractC4550fQ0.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(AbstractC0408Bc0 abstractC0408Bc0) {
            return abstractC0408Bc0.d();
        }
    }

    public static synchronized C0512Cc0 b() {
        try {
            if (d == null) {
                List<AbstractC0408Bc0> listE = AbstractC4550fQ0.e(AbstractC0408Bc0.class, e, AbstractC0408Bc0.class.getClassLoader(), new a());
                d = new C0512Cc0();
                for (AbstractC0408Bc0 abstractC0408Bc0 : listE) {
                    c.fine("Service loader found " + abstractC0408Bc0);
                    d.a(abstractC0408Bc0);
                }
                d.e();
            }
        } catch (Throwable th) {
            throw th;
        }
        return d;
    }

    public static List c() {
        ArrayList arrayList = new ArrayList();
        try {
            int i = C9170vu0.b;
            arrayList.add(C9170vu0.class);
        } catch (ClassNotFoundException e2) {
            c.log(Level.WARNING, "Unable to find pick-first LoadBalancer", (Throwable) e2);
        }
        try {
            int i2 = C8457tO0.b;
            arrayList.add(C8457tO0.class);
        } catch (ClassNotFoundException e3) {
            c.log(Level.FINE, "Unable to find round-robin LoadBalancer", (Throwable) e3);
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public final synchronized void a(AbstractC0408Bc0 abstractC0408Bc0) {
        AbstractC7785qy0.e(abstractC0408Bc0.d(), "isAvailable() returned false");
        this.a.add(abstractC0408Bc0);
    }

    public synchronized AbstractC0408Bc0 d(String str) {
        return (AbstractC0408Bc0) this.b.get(AbstractC7785qy0.o(str, "policy"));
    }

    public final synchronized void e() {
        try {
            this.b.clear();
            for (AbstractC0408Bc0 abstractC0408Bc0 : this.a) {
                String strB = abstractC0408Bc0.b();
                AbstractC0408Bc0 abstractC0408Bc02 = (AbstractC0408Bc0) this.b.get(strB);
                if (abstractC0408Bc02 == null || abstractC0408Bc02.c() < abstractC0408Bc0.c()) {
                    this.b.put(strB, abstractC0408Bc0);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
