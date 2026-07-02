package com.daaw;

import com.daaw.AbstractC4550fQ0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.daaw.ng0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6862ng0 {
    public static final Logger c = Logger.getLogger(C6862ng0.class.getName());
    public static C6862ng0 d;
    public final LinkedHashSet a = new LinkedHashSet();
    public List b = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: com.daaw.ng0$a */
    public class a implements Comparator {
        public a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractC6583mg0 abstractC6583mg0, AbstractC6583mg0 abstractC6583mg02) {
            return abstractC6583mg0.c() - abstractC6583mg02.c();
        }
    }

    /* JADX INFO: renamed from: com.daaw.ng0$b */
    public static final class b implements AbstractC4550fQ0.b {
        public b() {
        }

        @Override // com.daaw.AbstractC4550fQ0.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int b(AbstractC6583mg0 abstractC6583mg0) {
            return abstractC6583mg0.c();
        }

        @Override // com.daaw.AbstractC4550fQ0.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(AbstractC6583mg0 abstractC6583mg0) {
            return abstractC6583mg0.b();
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    public static synchronized C6862ng0 b() {
        try {
            if (d == null) {
                List<AbstractC6583mg0> listE = AbstractC4550fQ0.e(AbstractC6583mg0.class, c(), AbstractC6583mg0.class.getClassLoader(), new b(null));
                d = new C6862ng0();
                for (AbstractC6583mg0 abstractC6583mg0 : listE) {
                    c.fine("Service loader found " + abstractC6583mg0);
                    d.a(abstractC6583mg0);
                }
                d.f();
            }
        } catch (Throwable th) {
            throw th;
        }
        return d;
    }

    public static List c() {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(C1405Kp0.class);
        } catch (ClassNotFoundException e) {
            c.log(Level.FINE, "Unable to find OkHttpChannelProvider", (Throwable) e);
        }
        try {
            arrayList.add(Class.forName("io.grpc.netty.NettyChannelProvider"));
        } catch (ClassNotFoundException e2) {
            c.log(Level.FINE, "Unable to find NettyChannelProvider", (Throwable) e2);
        }
        try {
            arrayList.add(Class.forName("io.grpc.netty.UdsNettyChannelProvider"));
        } catch (ClassNotFoundException e3) {
            c.log(Level.FINE, "Unable to find UdsNettyChannelProvider", (Throwable) e3);
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public final synchronized void a(AbstractC6583mg0 abstractC6583mg0) {
        AbstractC7785qy0.e(abstractC6583mg0.b(), "isAvailable() returned false");
        this.a.add(abstractC6583mg0);
    }

    public AbstractC6583mg0 d() {
        List listE = e();
        if (listE.isEmpty()) {
            return null;
        }
        return (AbstractC6583mg0) listE.get(0);
    }

    public synchronized List e() {
        return this.b;
    }

    public final synchronized void f() {
        ArrayList arrayList = new ArrayList(this.a);
        Collections.sort(arrayList, Collections.reverseOrder(new a()));
        this.b = DesugarCollections.unmodifiableList(arrayList);
    }
}
