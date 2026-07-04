package com.daaw;

import com.daaw.AbstractC3651cD;
import com.daaw.C6564mc1;
import com.google.firebase.Timestamp;
import com.google.firebase.firestore.FirebaseFirestore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Oa1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1761Oa1 {
    public final FirebaseFirestore a;
    public final AbstractC3651cD.a b;

    /* JADX INFO: renamed from: com.daaw.Oa1$a */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[AbstractC3651cD.a.values().length];
            a = iArr;
            try {
                iArr[AbstractC3651cD.a.PREVIOUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[AbstractC3651cD.a.ESTIMATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public C1761Oa1(FirebaseFirestore firebaseFirestore, AbstractC3651cD.a aVar) {
        this.a = firebaseFirestore;
        this.b = aVar;
    }

    public final List a(C3748cb c3748cb) {
        ArrayList arrayList = new ArrayList(c3748cb.i0());
        Iterator it = c3748cb.g().iterator();
        while (it.hasNext()) {
            arrayList.add(f((C6564mc1) it.next()));
        }
        return arrayList;
    }

    public Map b(Map map) {
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            map2.put((String) entry.getKey(), f((C6564mc1) entry.getValue()));
        }
        return map2;
    }

    public final Object c(C6564mc1 c6564mc1) {
        C3851cw c3851cwG = C3851cw.g(c6564mc1.t0());
        TC tcK = TC.k(c6564mc1.t0());
        C3851cw c3851cwD = this.a.d();
        if (!c3851cwG.equals(c3851cwD)) {
            AbstractC2212Sd0.d("DocumentSnapshot", "Document %s contains a document reference within a different database (%s/%s) which is not supported. It will be treated as a reference in the current database (%s/%s) instead.", tcK.q(), c3851cwG.k(), c3851cwG.h(), c3851cwD.k(), c3851cwD.h());
        }
        return new com.google.firebase.firestore.a(tcK, this.a);
    }

    public final Object d(C6564mc1 c6564mc1) {
        int i = a.a[this.b.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return e(AbstractC3704cQ0.a(c6564mc1));
        }
        C6564mc1 c6564mc1B = AbstractC3704cQ0.b(c6564mc1);
        if (c6564mc1B == null) {
            return null;
        }
        return f(c6564mc1B);
    }

    public final Object e(Q31 q31) {
        return new Timestamp(q31.e0(), q31.d0());
    }

    public Object f(C6564mc1 c6564mc1) {
        switch (AbstractC0513Cc1.G(c6564mc1)) {
            case 0:
                return null;
            case 1:
                return Boolean.valueOf(c6564mc1.m0());
            case 2:
                return c6564mc1.w0().equals(C6564mc1.c.INTEGER_VALUE) ? Long.valueOf(c6564mc1.r0()) : Double.valueOf(c6564mc1.p0());
            case 3:
                return e(c6564mc1.v0());
            case 4:
                return d(c6564mc1);
            case 5:
                return c6564mc1.u0();
            case 6:
                return C2843Yf.c(c6564mc1.n0());
            case 7:
                return c(c6564mc1);
            case 8:
                return new C8193sS(c6564mc1.q0().d0(), c6564mc1.q0().e0());
            case 9:
                return a(c6564mc1.l0());
            case 10:
                return b(c6564mc1.s0().d0());
            default:
                throw AbstractC6557mb.a("Unknown value type: " + c6564mc1.w0(), new Object[0]);
        }
    }
}
