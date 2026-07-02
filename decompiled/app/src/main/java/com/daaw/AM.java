package com.daaw;

import com.daaw.C0;
import com.daaw.C6882nk0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AM {
    public static volatile C6882nk0 a;
    public static volatile C6882nk0 b;

    public class a implements C0.a {
        @Override // com.daaw.C0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(AbstractC3515bk abstractC3515bk, C1168Ii c1168Ii) {
            return new b(abstractC3515bk, c1168Ii, null);
        }
    }

    public static final class b extends AbstractC6397m {
        public /* synthetic */ b(AbstractC3515bk abstractC3515bk, C1168Ii c1168Ii, a aVar) {
            this(abstractC3515bk, c1168Ii);
        }

        @Override // com.daaw.C0
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public b a(AbstractC3515bk abstractC3515bk, C1168Ii c1168Ii) {
            return new b(abstractC3515bk, c1168Ii);
        }

        public b(AbstractC3515bk abstractC3515bk, C1168Ii c1168Ii) {
            super(abstractC3515bk, c1168Ii);
        }
    }

    public static C6882nk0 a() {
        C6882nk0 c6882nk0A;
        C6882nk0 c6882nk0 = b;
        if (c6882nk0 != null) {
            return c6882nk0;
        }
        synchronized (AM.class) {
            try {
                c6882nk0A = b;
                if (c6882nk0A == null) {
                    c6882nk0A = C6882nk0.g().f(C6882nk0.d.BIDI_STREAMING).b(C6882nk0.b("google.firestore.v1.Firestore", "Listen")).e(true).c(ZA0.b(C7400pc0.e0())).d(ZA0.b(C7679qc0.a0())).a();
                    b = c6882nk0A;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c6882nk0A;
    }

    public static C6882nk0 b() {
        C6882nk0 c6882nk0A;
        C6882nk0 c6882nk0 = a;
        if (c6882nk0 != null) {
            return c6882nk0;
        }
        synchronized (AM.class) {
            try {
                c6882nk0A = a;
                if (c6882nk0A == null) {
                    c6882nk0A = C6882nk0.g().f(C6882nk0.d.BIDI_STREAMING).b(C6882nk0.b("google.firestore.v1.Firestore", "Write")).e(true).c(ZA0.b(C8551tj1.f0())).d(ZA0.b(C8830uj1.b0())).a();
                    a = c6882nk0A;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c6882nk0A;
    }

    public static b c(AbstractC3515bk abstractC3515bk) {
        return (b) AbstractC6397m.e(new a(), abstractC3515bk);
    }
}
