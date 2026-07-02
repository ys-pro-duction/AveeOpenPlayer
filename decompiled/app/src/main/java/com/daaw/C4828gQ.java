package com.daaw;

import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.gQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4828gQ {
    public static final C4828gQ a = new C4828gQ();
    public static c b = c.d;

    /* JADX INFO: renamed from: com.daaw.gQ$a */
    public enum a {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_WRONG_NESTED_HIERARCHY,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    /* JADX INFO: renamed from: com.daaw.gQ$b */
    public interface b {
    }

    /* JADX INFO: renamed from: com.daaw.gQ$c */
    public static final class c {
        public static final a c = new a(null);
        public static final c d = new c(AbstractC9867yQ0.d(), null, AbstractC1473Lg0.h());
        public final Set a;
        public final Map b;

        /* JADX INFO: renamed from: com.daaw.gQ$c$a */
        public static final class a {
            public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
                this();
            }

            public a() {
            }
        }

        public c(Set set, b bVar, Map map) {
            G10.g(set, "flags");
            G10.g(map, "allowedViolations");
            this.a = set;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put((String) entry.getKey(), (Set) entry.getValue());
            }
            this.b = linkedHashMap;
        }

        public final Set a() {
            return this.a;
        }

        public final b b() {
            return null;
        }

        public final Map c() {
            return this.b;
        }
    }

    public static final void d(String str, AbstractC6300lf1 abstractC6300lf1) {
        G10.g(abstractC6300lf1, "$violation");
        throw abstractC6300lf1;
    }

    public static final void f(androidx.fragment.app.c cVar, String str) {
        G10.g(cVar, "fragment");
        G10.g(str, "previousFragmentId");
        C3982dQ c3982dQ = new C3982dQ(cVar, str);
        C4828gQ c4828gQ = a;
        c4828gQ.e(c3982dQ);
        c cVarB = c4828gQ.b(cVar);
        if (cVarB.a().contains(a.DETECT_FRAGMENT_REUSE) && c4828gQ.l(cVarB, cVar.getClass(), c3982dQ.getClass())) {
            c4828gQ.c(cVarB, c3982dQ);
        }
    }

    public static final void g(androidx.fragment.app.c cVar, ViewGroup viewGroup) {
        G10.g(cVar, "fragment");
        C5107hQ c5107hQ = new C5107hQ(cVar, viewGroup);
        C4828gQ c4828gQ = a;
        c4828gQ.e(c5107hQ);
        c cVarB = c4828gQ.b(cVar);
        if (cVarB.a().contains(a.DETECT_FRAGMENT_TAG_USAGE) && c4828gQ.l(cVarB, cVar.getClass(), c5107hQ.getClass())) {
            c4828gQ.c(cVarB, c5107hQ);
        }
    }

    public static final void h(androidx.fragment.app.c cVar) {
        G10.g(cVar, "fragment");
        C9316wS c9316wS = new C9316wS(cVar);
        C4828gQ c4828gQ = a;
        c4828gQ.e(c9316wS);
        c cVarB = c4828gQ.b(cVar);
        if (cVarB.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && c4828gQ.l(cVarB, cVar.getClass(), c9316wS.getClass())) {
            c4828gQ.c(cVarB, c9316wS);
        }
    }

    public static final void i(androidx.fragment.app.c cVar, ViewGroup viewGroup) {
        G10.g(cVar, "fragment");
        G10.g(viewGroup, "container");
        C9953yj1 c9953yj1 = new C9953yj1(cVar, viewGroup);
        C4828gQ c4828gQ = a;
        c4828gQ.e(c9953yj1);
        c cVarB = c4828gQ.b(cVar);
        if (cVarB.a().contains(a.DETECT_WRONG_FRAGMENT_CONTAINER) && c4828gQ.l(cVarB, cVar.getClass(), c9953yj1.getClass())) {
            c4828gQ.c(cVarB, c9953yj1);
        }
    }

    public static final void j(androidx.fragment.app.c cVar, androidx.fragment.app.c cVar2, int i) {
        G10.g(cVar, "fragment");
        G10.g(cVar2, "expectedParentFragment");
        C10232zj1 c10232zj1 = new C10232zj1(cVar, cVar2, i);
        C4828gQ c4828gQ = a;
        c4828gQ.e(c10232zj1);
        c cVarB = c4828gQ.b(cVar);
        if (cVarB.a().contains(a.DETECT_WRONG_NESTED_HIERARCHY) && c4828gQ.l(cVarB, cVar.getClass(), c10232zj1.getClass())) {
            c4828gQ.c(cVarB, c10232zj1);
        }
    }

    public final c b(androidx.fragment.app.c cVar) {
        while (cVar != null) {
            if (cVar.d0()) {
                FragmentManager fragmentManagerI = cVar.I();
                G10.f(fragmentManagerI, "declaringFragment.parentFragmentManager");
                if (fragmentManagerI.C0() != null) {
                    c cVarC0 = fragmentManagerI.C0();
                    G10.d(cVarC0);
                    return cVarC0;
                }
            }
            cVar = cVar.H();
        }
        return b;
    }

    public final void c(c cVar, final AbstractC6300lf1 abstractC6300lf1) {
        androidx.fragment.app.c cVarA = abstractC6300lf1.a();
        final String name = cVarA.getClass().getName();
        cVar.a().contains(a.PENALTY_LOG);
        cVar.b();
        if (cVar.a().contains(a.PENALTY_DEATH)) {
            k(cVarA, new Runnable() { // from class: com.daaw.fQ
                @Override // java.lang.Runnable
                public final void run() {
                    C4828gQ.d(name, abstractC6300lf1);
                }
            });
        }
    }

    public final void e(AbstractC6300lf1 abstractC6300lf1) {
        if (FragmentManager.J0(3)) {
            abstractC6300lf1.a().getClass();
        }
    }

    public final void k(androidx.fragment.app.c cVar, Runnable runnable) {
        if (!cVar.d0()) {
            runnable.run();
            return;
        }
        Handler handlerT = cVar.I().w0().t();
        if (G10.c(handlerT.getLooper(), Looper.myLooper())) {
            runnable.run();
        } else {
            handlerT.post(runnable);
        }
    }

    public final boolean l(c cVar, Class cls, Class cls2) {
        Set set = (Set) cVar.c().get(cls.getName());
        if (set == null) {
            return true;
        }
        if (G10.c(cls2.getSuperclass(), AbstractC6300lf1.class) || !AbstractC2455Um.W(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
