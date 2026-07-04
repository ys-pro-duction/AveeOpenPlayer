package com.daaw;

import com.daaw.AbstractC4451f50;
import com.daaw.AbstractC7261p50;

/* JADX INFO: renamed from: com.daaw.hj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5193hj0 {
    public static final a b = new a(null);
    public final String a;

    /* JADX INFO: renamed from: com.daaw.hj0$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final C5193hj0 a(String str, String str2) {
            G10.g(str, "name");
            G10.g(str2, "desc");
            return new C5193hj0(str + '#' + str2, null);
        }

        public final C5193hj0 b(AbstractC4451f50 abstractC4451f50) {
            G10.g(abstractC4451f50, "signature");
            if (abstractC4451f50 instanceof AbstractC4451f50.b) {
                AbstractC4451f50.b bVar = (AbstractC4451f50.b) abstractC4451f50;
                return d(bVar.e(), bVar.d());
            }
            if (!(abstractC4451f50 instanceof AbstractC4451f50.a)) {
                throw new C6902no0();
            }
            AbstractC4451f50.a aVar = (AbstractC4451f50.a) abstractC4451f50;
            return a(aVar.e(), aVar.d());
        }

        public final C5193hj0 c(InterfaceC2664Wm0 interfaceC2664Wm0, AbstractC7261p50.c cVar) {
            G10.g(interfaceC2664Wm0, "nameResolver");
            G10.g(cVar, "signature");
            return d(interfaceC2664Wm0.getString(cVar.A()), interfaceC2664Wm0.getString(cVar.z()));
        }

        public final C5193hj0 d(String str, String str2) {
            G10.g(str, "name");
            G10.g(str2, "desc");
            return new C5193hj0(str + str2, null);
        }

        public final C5193hj0 e(C5193hj0 c5193hj0, int i) {
            G10.g(c5193hj0, "signature");
            return new C5193hj0(c5193hj0.a() + '@' + i, null);
        }

        public a() {
        }
    }

    public /* synthetic */ C5193hj0(String str, AbstractC2911Yw abstractC2911Yw) {
        this(str);
    }

    public final String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5193hj0) && G10.c(this.a, ((C5193hj0) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "MemberSignature(signature=" + this.a + ')';
    }

    public C5193hj0(String str) {
        this.a = str;
    }
}
