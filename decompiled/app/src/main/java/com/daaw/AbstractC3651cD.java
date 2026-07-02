package com.daaw;

import com.google.firebase.firestore.FirebaseFirestore;

/* JADX INFO: renamed from: com.daaw.cD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3651cD {
    public final FirebaseFirestore a;
    public final TC b;
    public final LC c;
    public final C6529mU0 d;

    /* JADX INFO: renamed from: com.daaw.cD$a */
    public enum a {
        NONE,
        ESTIMATE,
        PREVIOUS;

        public static final a E = NONE;
    }

    public AbstractC3651cD(FirebaseFirestore firebaseFirestore, TC tc, LC lc, boolean z, boolean z2) {
        this.a = (FirebaseFirestore) AbstractC8342sy0.b(firebaseFirestore);
        this.b = (TC) AbstractC8342sy0.b(tc);
        this.c = lc;
        this.d = new C6529mU0(z2, z);
    }

    public Object a(C6767nK c6767nK, a aVar) {
        AbstractC8342sy0.c(c6767nK, "Provided field path must not be null.");
        AbstractC8342sy0.c(aVar, "Provided serverTimestampBehavior value must not be null.");
        return d(c6767nK.b(), aVar);
    }

    public Object b(String str) {
        return a(C6767nK.a(str), a.E);
    }

    public String c() {
        return this.b.p();
    }

    public final Object d(C6488mK c6488mK, a aVar) {
        C6564mc1 c6564mc1E;
        LC lc = this.c;
        if (lc == null || (c6564mc1E = lc.e(c6488mK)) == null) {
            return null;
        }
        return new C1761Oa1(this.a, aVar).f(c6564mc1E);
    }

    public boolean equals(Object obj) {
        LC lc;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC3651cD)) {
            return false;
        }
        AbstractC3651cD abstractC3651cD = (AbstractC3651cD) obj;
        return this.a.equals(abstractC3651cD.a) && this.b.equals(abstractC3651cD.b) && ((lc = this.c) != null ? lc.equals(abstractC3651cD.c) : abstractC3651cD.c == null) && this.d.equals(abstractC3651cD.d);
    }

    public int hashCode() {
        int iHashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        LC lc = this.c;
        int iHashCode2 = (iHashCode + (lc != null ? lc.getKey().hashCode() : 0)) * 31;
        LC lc2 = this.c;
        return ((iHashCode2 + (lc2 != null ? lc2.h().hashCode() : 0)) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "DocumentSnapshot{key=" + this.b + ", metadata=" + this.d + ", doc=" + this.c + '}';
    }
}
