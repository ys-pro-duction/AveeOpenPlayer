package com.daaw;

import com.daaw.AbstractC0656Dk;
import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: renamed from: com.daaw.Fk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0864Fk {
    public final C2352Tm0 a;
    public final C8146sG0 b;
    public final Collection c;
    public final NQ d;
    public final InterfaceC0543Ck[] e;

    /* JADX INFO: renamed from: com.daaw.Fk$a */
    public static final class a implements NQ {
        public static final a B = new a();

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(InterfaceC8468tR interfaceC8468tR) {
            G10.g(interfaceC8468tR, "<this>");
            return null;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Fk$b */
    public static final class b implements NQ {
        public static final b B = new b();

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(InterfaceC8468tR interfaceC8468tR) {
            G10.g(interfaceC8468tR, "<this>");
            return null;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Fk$c */
    public static final class c implements NQ {
        public static final c B = new c();

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(InterfaceC8468tR interfaceC8468tR) {
            G10.g(interfaceC8468tR, "<this>");
            return null;
        }
    }

    public C0864Fk(C2352Tm0 c2352Tm0, C8146sG0 c8146sG0, Collection collection, NQ nq, InterfaceC0543Ck... interfaceC0543CkArr) {
        this.a = c2352Tm0;
        this.b = c8146sG0;
        this.c = collection;
        this.d = nq;
        this.e = interfaceC0543CkArr;
    }

    public final AbstractC0656Dk a(InterfaceC8468tR interfaceC8468tR) {
        G10.g(interfaceC8468tR, "functionDescriptor");
        for (InterfaceC0543Ck interfaceC0543Ck : this.e) {
            String strA = interfaceC0543Ck.a(interfaceC8468tR);
            if (strA != null) {
                return new AbstractC0656Dk.b(strA);
            }
        }
        String str = (String) this.d.invoke(interfaceC8468tR);
        return str != null ? new AbstractC0656Dk.b(str) : AbstractC0656Dk.c.b;
    }

    public final boolean b(InterfaceC8468tR interfaceC8468tR) {
        G10.g(interfaceC8468tR, "functionDescriptor");
        if (this.a != null && !G10.c(interfaceC8468tR.getName(), this.a)) {
            return false;
        }
        if (this.b != null) {
            String strC = interfaceC8468tR.getName().c();
            G10.f(strC, "asString(...)");
            if (!this.b.b(strC)) {
                return false;
            }
        }
        Collection collection = this.c;
        return collection == null || collection.contains(interfaceC8468tR.getName());
    }

    public /* synthetic */ C0864Fk(C2352Tm0 c2352Tm0, InterfaceC0543Ck[] interfaceC0543CkArr, NQ nq, int i, AbstractC2911Yw abstractC2911Yw) {
        this(c2352Tm0, interfaceC0543CkArr, (i & 4) != 0 ? a.B : nq);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0864Fk(C2352Tm0 c2352Tm0, InterfaceC0543Ck[] interfaceC0543CkArr, NQ nq) {
        this(c2352Tm0, (C8146sG0) null, (Collection) null, nq, (InterfaceC0543Ck[]) Arrays.copyOf(interfaceC0543CkArr, interfaceC0543CkArr.length));
        G10.g(c2352Tm0, "name");
        G10.g(interfaceC0543CkArr, "checks");
        G10.g(nq, "additionalChecks");
    }

    public /* synthetic */ C0864Fk(C8146sG0 c8146sG0, InterfaceC0543Ck[] interfaceC0543CkArr, NQ nq, int i, AbstractC2911Yw abstractC2911Yw) {
        this(c8146sG0, interfaceC0543CkArr, (i & 4) != 0 ? b.B : nq);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0864Fk(C8146sG0 c8146sG0, InterfaceC0543Ck[] interfaceC0543CkArr, NQ nq) {
        this((C2352Tm0) null, c8146sG0, (Collection) null, nq, (InterfaceC0543Ck[]) Arrays.copyOf(interfaceC0543CkArr, interfaceC0543CkArr.length));
        G10.g(c8146sG0, "regex");
        G10.g(interfaceC0543CkArr, "checks");
        G10.g(nq, "additionalChecks");
    }

    public /* synthetic */ C0864Fk(Collection collection, InterfaceC0543Ck[] interfaceC0543CkArr, NQ nq, int i, AbstractC2911Yw abstractC2911Yw) {
        this(collection, interfaceC0543CkArr, (i & 4) != 0 ? c.B : nq);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0864Fk(Collection collection, InterfaceC0543Ck[] interfaceC0543CkArr, NQ nq) {
        this((C2352Tm0) null, (C8146sG0) null, collection, nq, (InterfaceC0543Ck[]) Arrays.copyOf(interfaceC0543CkArr, interfaceC0543CkArr.length));
        G10.g(collection, "nameList");
        G10.g(interfaceC0543CkArr, "checks");
        G10.g(nq, "additionalChecks");
    }
}
