package com.daaw;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class Q00 implements C71 {
    public static final a f = new a(null);
    public final long a;
    public final InterfaceC2968Zk0 b;
    public final Set c;
    public final YS0 d;
    public final O90 e;

    public static final class a {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: renamed from: com.daaw.Q00$a$a, reason: collision with other inner class name */
        public static final class EnumC0110a {
            public static final EnumC0110a B = new EnumC0110a("COMMON_SUPER_TYPE", 0);
            public static final EnumC0110a C = new EnumC0110a("INTERSECTION_TYPE", 1);
            public static final /* synthetic */ EnumC0110a[] D;
            public static final /* synthetic */ YG E;

            static {
                EnumC0110a[] enumC0110aArrA = a();
                D = enumC0110aArrA;
                E = AbstractC3110aH.a(enumC0110aArrA);
            }

            public EnumC0110a(String str, int i) {
            }

            public static final /* synthetic */ EnumC0110a[] a() {
                return new EnumC0110a[]{B, C};
            }

            public static EnumC0110a valueOf(String str) {
                return (EnumC0110a) Enum.valueOf(EnumC0110a.class, str);
            }

            public static EnumC0110a[] values() {
                return (EnumC0110a[]) D.clone();
            }
        }

        public /* synthetic */ class b {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[EnumC0110a.values().length];
                try {
                    iArr[EnumC0110a.B.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC0110a.C.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                a = iArr;
            }
        }

        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final YS0 a(Collection collection, EnumC0110a enumC0110a) {
            if (collection.isEmpty()) {
                return null;
            }
            Iterator it = collection.iterator();
            if (!it.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next = it.next();
            while (it.hasNext()) {
                YS0 ys0 = (YS0) it.next();
                next = Q00.f.e((YS0) next, ys0, enumC0110a);
            }
            return (YS0) next;
        }

        public final YS0 b(Collection collection) {
            G10.g(collection, "types");
            return a(collection, EnumC0110a.C);
        }

        public final YS0 c(Q00 q00, Q00 q002, EnumC0110a enumC0110a) {
            Set setJ0;
            int i = b.a[enumC0110a.ordinal()];
            if (i == 1) {
                setJ0 = AbstractC2455Um.j0(q00.j(), q002.j());
            } else {
                if (i != 2) {
                    throw new C6902no0();
                }
                setJ0 = AbstractC2455Um.R0(q00.j(), q002.j());
            }
            return M80.f(C8387t71.C.j(), new Q00(q00.a, q00.b, setJ0, null), false);
        }

        public final YS0 d(Q00 q00, YS0 ys0) {
            if (q00.j().contains(ys0)) {
                return ys0;
            }
            return null;
        }

        public final YS0 e(YS0 ys0, YS0 ys02, EnumC0110a enumC0110a) {
            if (ys0 != null && ys02 != null) {
                C71 c71N0 = ys0.N0();
                C71 c71N02 = ys02.N0();
                boolean z = c71N0 instanceof Q00;
                if (z && (c71N02 instanceof Q00)) {
                    return c((Q00) c71N0, (Q00) c71N02, enumC0110a);
                }
                if (z) {
                    return d((Q00) c71N0, ys02);
                }
                if (c71N02 instanceof Q00) {
                    return d((Q00) c71N02, ys0);
                }
            }
            return null;
        }

        public a() {
        }
    }

    public /* synthetic */ Q00(long j, InterfaceC2968Zk0 interfaceC2968Zk0, Set set, AbstractC2911Yw abstractC2911Yw) {
        this(j, interfaceC2968Zk0, set);
    }

    private final List k() {
        return (List) this.e.getValue();
    }

    public static final List m(Q00 q00) {
        G10.g(q00, "this$0");
        YS0 ys0S = q00.p().x().s();
        G10.f(ys0S, "getDefaultType(...)");
        List listQ = AbstractC1599Mm.q(AbstractC8671u81.f(ys0S, AbstractC1496Lm.e(new C6998o81(EnumC1042Hc1.G, q00.d)), null, 2, null));
        if (!q00.l()) {
            listQ.add(q00.p().L());
        }
        return listQ;
    }

    public static final CharSequence o(I80 i80) {
        G10.g(i80, "it");
        return i80.toString();
    }

    @Override // com.daaw.C71
    public C71 a(Q80 q80) {
        G10.g(q80, "kotlinTypeRefiner");
        return this;
    }

    @Override // com.daaw.C71
    public Collection b() {
        return k();
    }

    @Override // com.daaw.C71
    public InterfaceC10240zl c() {
        return null;
    }

    @Override // com.daaw.C71
    public boolean d() {
        return false;
    }

    @Override // com.daaw.C71
    public List getParameters() {
        return AbstractC1599Mm.k();
    }

    public final Set j() {
        return this.c;
    }

    public final boolean l() {
        Collection collectionA = AbstractC8346sz0.a(this.b);
        if ((collectionA instanceof Collection) && collectionA.isEmpty()) {
            return true;
        }
        Iterator it = collectionA.iterator();
        while (it.hasNext()) {
            if (this.c.contains((I80) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final String n() {
        return '[' + AbstractC2455Um.n0(this.c, ",", null, null, 0, null, P00.B, 30, null) + ']';
    }

    @Override // com.daaw.C71
    public AbstractC8670u80 p() {
        return this.b.p();
    }

    public String toString() {
        return "IntegerLiteralType" + n();
    }

    public Q00(long j, InterfaceC2968Zk0 interfaceC2968Zk0, Set set) {
        this.d = M80.f(C8387t71.C.j(), this, false);
        this.e = AbstractC3192ab0.a(new O00(this));
        this.a = j;
        this.b = interfaceC2968Zk0;
        this.c = set;
    }
}
