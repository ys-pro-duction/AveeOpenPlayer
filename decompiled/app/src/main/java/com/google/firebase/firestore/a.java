package com.google.firebase.firestore;

import com.daaw.AbstractC6838nb1;
import com.daaw.AbstractC6963o11;
import com.daaw.AbstractC8342sy0;
import com.daaw.C1346Ka1;
import com.daaw.C6669my0;
import com.daaw.EI;
import com.daaw.TC;
import com.daaw.UI0;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public class a {
    public final TC a;
    public final FirebaseFirestore b;

    public a(TC tc, FirebaseFirestore firebaseFirestore) {
        this.a = (TC) AbstractC8342sy0.b(tc);
        this.b = firebaseFirestore;
    }

    public static a a(UI0 ui0, FirebaseFirestore firebaseFirestore) {
        if (ui0.p() % 2 == 0) {
            return new a(TC.l(ui0), firebaseFirestore);
        }
        throw new IllegalArgumentException("Invalid document reference. Document references must have an even number of segments, but " + ui0.g() + " has " + ui0.p());
    }

    public FirebaseFirestore b() {
        return this.b;
    }

    public TC c() {
        return this.a;
    }

    public String d() {
        return this.a.q().g();
    }

    public final AbstractC6963o11 e(C1346Ka1 c1346Ka1) {
        return this.b.c().o(Collections.singletonList(c1346Ka1.a(this.a, C6669my0.a(true)))).g(EI.b, AbstractC6838nb1.x());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a.equals(aVar.a) && this.b.equals(aVar.b);
    }

    public AbstractC6963o11 f(String str, Object obj, Object... objArr) {
        return e(this.b.g().i(AbstractC6838nb1.f(1, str, obj, objArr)));
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }
}
