package com.daaw;

import com.google.firebase.firestore.FirebaseFirestore;

/* JADX INFO: loaded from: classes.dex */
public final class GM extends AbstractC8526te1 {
    public final C5208hm0 b = new C5208hm0();
    public final C5208hm0 c = new C5208hm0();
    public final C5208hm0 d = new C5208hm0();

    public static final class a {
        public final String a;
        public final Exception b;

        public a(String str, Exception exc) {
            G10.g(str, "message");
            this.a = str;
            this.b = exc;
        }

        public final Exception a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return G10.c(this.a, aVar.a) && G10.c(this.b, aVar.b);
        }

        public int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            Exception exc = this.b;
            return iHashCode + (exc == null ? 0 : exc.hashCode());
        }

        public String toString() {
            return "FirestoreError(message=" + this.a + ", exception=" + this.b + ")";
        }
    }

    public static final void i(final GM gm, final FirebaseFirestore firebaseFirestore, final String str, AbstractC6963o11 abstractC6963o11) {
        G10.g(gm, "this$0");
        G10.g(firebaseFirestore, "$db");
        G10.g(str, "$email");
        G10.g(abstractC6963o11, "task");
        if (!abstractC6963o11.n()) {
            gm.b.j(new a("Existing code fetch failed", abstractC6963o11.j()));
            gm.d.l(Boolean.FALSE);
        } else {
            if (((C8130sC0) abstractC6963o11.k()).p().isEmpty()) {
                firebaseFirestore.a("codes").k(1L).w("email", AbstractC1599Mm.g(" ", "")).g().b(new InterfaceC5228hq0() { // from class: com.daaw.EM
                    @Override // com.daaw.InterfaceC5228hq0
                    public final void a(AbstractC6963o11 abstractC6963o112) {
                        GM.j(this.a, firebaseFirestore, str, abstractC6963o112);
                    }
                });
                return;
            }
            C4989gz0.a.f(str);
            C5208hm0 c5208hm0 = gm.c;
            Object objB = ((AbstractC3651cD) ((C8130sC0) abstractC6963o11.k()).p().get(0)).b("code");
            c5208hm0.j(objB instanceof String ? (String) objB : null);
            gm.d.l(Boolean.FALSE);
        }
    }

    public static final void j(final GM gm, FirebaseFirestore firebaseFirestore, final String str, AbstractC6963o11 abstractC6963o11) {
        G10.g(gm, "this$0");
        G10.g(firebaseFirestore, "$db");
        G10.g(str, "$email");
        G10.g(abstractC6963o11, "task");
        if (!abstractC6963o11.n()) {
            gm.b.j(new a("New code fetch failed", abstractC6963o11.j()));
            gm.d.l(Boolean.FALSE);
        } else if (((C8130sC0) abstractC6963o11.k()).p().isEmpty()) {
            gm.b.j(new a("Out of codes", null));
            gm.d.l(Boolean.FALSE);
        } else {
            final AbstractC3651cD abstractC3651cD = (AbstractC3651cD) ((C8130sC0) abstractC6963o11.k()).p().get(0);
            firebaseFirestore.a("codes").x(abstractC3651cD.c()).f("email", str, new Object[0]).b(new InterfaceC5228hq0() { // from class: com.daaw.FM
                @Override // com.daaw.InterfaceC5228hq0
                public final void a(AbstractC6963o11 abstractC6963o112) {
                    GM.k(this.a, str, abstractC3651cD, abstractC6963o112);
                }
            });
        }
    }

    public static final void k(GM gm, String str, AbstractC3651cD abstractC3651cD, AbstractC6963o11 abstractC6963o11) {
        G10.g(gm, "this$0");
        G10.g(str, "$email");
        G10.g(abstractC6963o11, "task");
        if (!abstractC6963o11.n()) {
            gm.b.j(new a("Email write failed", abstractC6963o11.j()));
            gm.d.l(Boolean.FALSE);
            return;
        }
        C4989gz0.a.f(str);
        C5208hm0 c5208hm0 = gm.c;
        Object objB = abstractC3651cD.b("code");
        c5208hm0.j(objB instanceof String ? (String) objB : null);
        gm.d.l(Boolean.FALSE);
    }

    public final void h(final String str) {
        G10.g(str, "email");
        Object objE = this.d.e();
        Boolean bool = Boolean.TRUE;
        if (G10.c(objE, bool)) {
            return;
        }
        this.d.l(bool);
        C4989gz0.a.g(true);
        final FirebaseFirestore firebaseFirestoreE = FirebaseFirestore.e();
        G10.f(firebaseFirestoreE, "getInstance(...)");
        firebaseFirestoreE.a("codes").k(1L).v("email", str).g().b(new InterfaceC5228hq0() { // from class: com.daaw.DM
            @Override // com.daaw.InterfaceC5228hq0
            public final void a(AbstractC6963o11 abstractC6963o11) {
                GM.i(this.a, firebaseFirestoreE, str, abstractC6963o11);
            }
        });
    }

    public final androidx.lifecycle.m l() {
        return this.b;
    }

    public final androidx.lifecycle.m m() {
        return this.d;
    }

    public final androidx.lifecycle.m n() {
        return this.c;
    }
}
