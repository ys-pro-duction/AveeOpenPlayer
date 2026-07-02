package com.google.firebase.firestore;

import android.app.Activity;
import com.daaw.A11;
import com.daaw.AbstractC0513Cc1;
import com.daaw.AbstractC6314li0;
import com.daaw.AbstractC6557mb;
import com.daaw.AbstractC6838nb1;
import com.daaw.AbstractC6963o11;
import com.daaw.AbstractC8342sy0;
import com.daaw.C1881Pe1;
import com.daaw.C3748cb;
import com.daaw.C4515fK;
import com.daaw.C5890kC0;
import com.daaw.C6488mK;
import com.daaw.C6564mc1;
import com.daaw.C6767nK;
import com.daaw.C7521q11;
import com.daaw.C8130sC0;
import com.daaw.C8509tb;
import com.daaw.C9359wc0;
import com.daaw.EI;
import com.daaw.InterfaceC1519Ls;
import com.daaw.InterfaceC9080vc0;
import com.daaw.LH;
import com.daaw.M2;
import com.daaw.QU0;
import com.daaw.SH;
import com.daaw.TC;
import com.daaw.UI0;
import com.daaw.ZK;
import com.google.firebase.firestore.b;
import com.google.firebase.firestore.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public class f {
    public final C5890kC0 a;
    public final FirebaseFirestore b;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[C4515fK.b.values().length];
            a = iArr;
            try {
                iArr[C4515fK.b.NOT_EQUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[C4515fK.b.ARRAY_CONTAINS_ANY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[C4515fK.b.IN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[C4515fK.b.NOT_IN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public f(C5890kC0 c5890kC0, FirebaseFirestore firebaseFirestore) {
        this.a = (C5890kC0) AbstractC8342sy0.b(c5890kC0);
        this.b = (FirebaseFirestore) AbstractC8342sy0.b(firebaseFirestore);
    }

    public static /* synthetic */ C8130sC0 a(f fVar, AbstractC6963o11 abstractC6963o11) {
        return new C8130sC0(new f(fVar.a, fVar.b), (C1881Pe1) abstractC6963o11.k(), fVar.b);
    }

    public static /* synthetic */ void b(C7521q11 c7521q11, C7521q11 c7521q112, QU0 qu0, C8130sC0 c8130sC0, c cVar) {
        if (cVar != null) {
            c7521q11.b(cVar);
            return;
        }
        try {
            ((InterfaceC9080vc0) A11.a(c7521q112.a())).remove();
            if (c8130sC0.q().a() && qu0 == QU0.SERVER) {
                c7521q11.b(new c("Failed to get documents from server. (However, these documents may exist in the local cache. Run again without setting source to SERVER to retrieve the cached documents.)", c.a.UNAVAILABLE));
            } else {
                c7521q11.c(c8130sC0);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw AbstractC6557mb.b(e, "Failed to register a listener for a query result", new Object[0]);
        } catch (ExecutionException e2) {
            throw AbstractC6557mb.b(e2, "Failed to register a listener for a query result", new Object[0]);
        }
    }

    public static /* synthetic */ void c(f fVar, LH lh, C1881Pe1 c1881Pe1, c cVar) {
        fVar.getClass();
        if (cVar != null) {
            lh.a(null, cVar);
        } else {
            AbstractC6557mb.d(c1881Pe1 != null, "Got event without value or error set", new Object[0]);
            lh.a(new C8130sC0(fVar, c1881Pe1, fVar.b), null);
        }
    }

    public final InterfaceC9080vc0 d(Executor executor, SH.a aVar, Activity activity, final LH lh) {
        q();
        C8509tb c8509tb = new C8509tb(executor, new LH() { // from class: com.daaw.jC0
            @Override // com.daaw.LH
            public final void a(Object obj, com.google.firebase.firestore.c cVar) {
                com.google.firebase.firestore.f.c(this.a, lh, (C1881Pe1) obj, cVar);
            }
        });
        return M2.c(activity, new C9359wc0(this.b.c(), this.b.c().l(this.a, aVar, c8509tb), c8509tb));
    }

    public final List e(C4515fK.b bVar) {
        int i = a.a[bVar.ordinal()];
        return i != 1 ? (i == 2 || i == 3) ? Arrays.asList(C4515fK.b.NOT_IN) : i != 4 ? new ArrayList() : Arrays.asList(C4515fK.b.ARRAY_CONTAINS_ANY, C4515fK.b.IN, C4515fK.b.NOT_IN, C4515fK.b.NOT_EQUAL) : Arrays.asList(C4515fK.b.NOT_EQUAL, C4515fK.b.NOT_IN);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.a.equals(fVar.a) && this.b.equals(fVar.b);
    }

    public final C4515fK.b f(List list, List list2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (C4515fK c4515fK : ((ZK) it.next()).d()) {
                if (list2.contains(c4515fK.h())) {
                    return c4515fK.h();
                }
            }
        }
        return null;
    }

    public AbstractC6963o11 g() {
        return h(QU0.DEFAULT);
    }

    public AbstractC6963o11 h(QU0 qu0) {
        q();
        return qu0 == QU0.CACHE ? this.b.c().i(this.a).g(EI.b, new InterfaceC1519Ls() { // from class: com.daaw.hC0
            @Override // com.daaw.InterfaceC1519Ls
            public final Object a(AbstractC6963o11 abstractC6963o11) {
                return com.google.firebase.firestore.f.a(this.a, abstractC6963o11);
            }
        }) : j(qu0);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public FirebaseFirestore i() {
        return this.b;
    }

    public final AbstractC6963o11 j(final QU0 qu0) {
        final C7521q11 c7521q11 = new C7521q11();
        final C7521q11 c7521q112 = new C7521q11();
        SH.a aVar = new SH.a();
        aVar.a = true;
        aVar.b = true;
        aVar.c = true;
        c7521q112.c(d(EI.b, aVar, null, new LH() { // from class: com.daaw.iC0
            @Override // com.daaw.LH
            public final void a(Object obj, com.google.firebase.firestore.c cVar) {
                com.google.firebase.firestore.f.b(c7521q11, c7521q112, qu0, (C8130sC0) obj, cVar);
            }
        }));
        return c7521q11.a();
    }

    public f k(long j) {
        if (j > 0) {
            return new f(this.a.s(j), this.b);
        }
        throw new IllegalArgumentException("Invalid Query. Query limit (" + j + ") is invalid. Limit must be positive.");
    }

    public final ZK l(b.a aVar) {
        new ArrayList();
        throw null;
    }

    public final C6564mc1 m(Object obj) {
        if (!(obj instanceof String)) {
            if (obj instanceof com.google.firebase.firestore.a) {
                return AbstractC0513Cc1.F(i().d(), ((com.google.firebase.firestore.a) obj).c());
            }
            throw new IllegalArgumentException("Invalid query. When querying with FieldPath.documentId() you must provide a valid String or DocumentReference, but it was of type: " + AbstractC6838nb1.w(obj));
        }
        String str = (String) obj;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Invalid query. When querying with FieldPath.documentId() you must provide a valid document ID, but it was an empty string.");
        }
        if (!this.a.q() && str.contains("/")) {
            throw new IllegalArgumentException("Invalid query. When querying a collection by FieldPath.documentId() you must provide a plain document ID, but '" + str + "' contains a '/' character.");
        }
        UI0 ui0 = (UI0) this.a.m().a(UI0.u(str));
        if (TC.s(ui0)) {
            return AbstractC0513Cc1.F(i().d(), TC.l(ui0));
        }
        throw new IllegalArgumentException("Invalid query. When querying a collection group by FieldPath.documentId(), the value provided must result in a valid document path, but '" + ui0 + "' is not because it has an odd number of segments (" + ui0.p() + ").");
    }

    public final C4515fK n(b.C0269b c0269b) {
        C6564mc1 c6564mc1E;
        C6767nK c6767nKE = c0269b.e();
        C4515fK.b bVarF = c0269b.f();
        Object objG = c0269b.g();
        AbstractC8342sy0.c(c6767nKE, "Provided field path must not be null.");
        AbstractC8342sy0.c(bVarF, "Provided op must not be null.");
        if (!c6767nKE.b().w()) {
            C4515fK.b bVar = C4515fK.b.IN;
            if (bVarF == bVar || bVarF == C4515fK.b.NOT_IN || bVarF == C4515fK.b.ARRAY_CONTAINS_ANY) {
                p(objG, bVarF);
            }
            c6564mc1E = this.b.g().e(objG, bVarF == bVar || bVarF == C4515fK.b.NOT_IN);
        } else {
            if (bVarF == C4515fK.b.ARRAY_CONTAINS || bVarF == C4515fK.b.ARRAY_CONTAINS_ANY) {
                throw new IllegalArgumentException("Invalid query. You can't perform '" + bVarF.toString() + "' queries on FieldPath.documentId().");
            }
            if (bVarF == C4515fK.b.IN || bVarF == C4515fK.b.NOT_IN) {
                p(objG, bVarF);
                C3748cb.b bVarJ0 = C3748cb.j0();
                Iterator it = ((List) objG).iterator();
                while (it.hasNext()) {
                    bVarJ0.y(m(it.next()));
                }
                c6564mc1E = (C6564mc1) C6564mc1.x0().x(bVarJ0).n();
            } else {
                c6564mc1E = m(objG);
            }
        }
        return C4515fK.f(c6767nKE.b(), bVarF, c6564mc1E);
    }

    public final ZK o(b bVar) {
        boolean z = bVar instanceof b.C0269b;
        AbstractC6557mb.d(z, "Parsing is only supported for Filter.UnaryFilter and Filter.CompositeFilter.", new Object[0]);
        if (z) {
            return n((b.C0269b) bVar);
        }
        AbstractC6314li0.a(bVar);
        return l(null);
    }

    public final void p(Object obj, C4515fK.b bVar) {
        if (!(obj instanceof List) || ((List) obj).size() == 0) {
            throw new IllegalArgumentException("Invalid Query. A non-empty array is required for '" + bVar.toString() + "' filters.");
        }
    }

    public final void q() {
        if (this.a.k().equals(C5890kC0.a.LIMIT_TO_LAST) && this.a.g().isEmpty()) {
            throw new IllegalStateException("limitToLast() queries require specifying at least one orderBy() clause");
        }
    }

    public final void r(C5890kC0 c5890kC0, C4515fK c4515fK) {
        C4515fK.b bVarH = c4515fK.h();
        if (c4515fK.j()) {
            C6488mK c6488mKP = c5890kC0.p();
            C6488mK c6488mKG = c4515fK.g();
            if (c6488mKP != null && !c6488mKP.equals(c6488mKG)) {
                throw new IllegalArgumentException(String.format("All where filters with an inequality (notEqualTo, notIn, lessThan, lessThanOrEqualTo, greaterThan, or greaterThanOrEqualTo) must be on the same field. But you have filters on '%s' and '%s'", c6488mKP.g(), c6488mKG.g()));
            }
            C6488mK c6488mKI = c5890kC0.i();
            if (c6488mKI != null) {
                t(c6488mKI, c6488mKG);
            }
        }
        C4515fK.b bVarF = f(c5890kC0.h(), e(bVarH));
        if (bVarF != null) {
            if (bVarF == bVarH) {
                throw new IllegalArgumentException("Invalid Query. You cannot use more than one '" + bVarH.toString() + "' filter.");
            }
            throw new IllegalArgumentException("Invalid Query. You cannot use '" + bVarH.toString() + "' filters with '" + bVarF.toString() + "' filters.");
        }
    }

    public final void s(ZK zk) {
        C5890kC0 c5890kC0D = this.a;
        for (C4515fK c4515fK : zk.d()) {
            r(c5890kC0D, c4515fK);
            c5890kC0D = c5890kC0D.d(c4515fK);
        }
    }

    public final void t(C6488mK c6488mK, C6488mK c6488mK2) {
        if (c6488mK.equals(c6488mK2)) {
            return;
        }
        String strG = c6488mK2.g();
        throw new IllegalArgumentException(String.format("Invalid query. You have an inequality where filter (whereLessThan(), whereGreaterThan(), etc.) on field '%s' and so you must also have '%s' as your first orderBy() field, but your first orderBy() is currently on field '%s' instead.", strG, strG, c6488mK.g()));
    }

    public f u(b bVar) {
        ZK zkO = o(bVar);
        if (zkO.b().isEmpty()) {
            return this;
        }
        s(zkO);
        return new f(this.a.d(zkO), this.b);
    }

    public f v(String str, Object obj) {
        return u(b.b(str, obj));
    }

    public f w(String str, List list) {
        return u(b.d(str, list));
    }
}
