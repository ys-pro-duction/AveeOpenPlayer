package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class B70 {
    public static final a c = new a(null);
    public static final B70 d = new B70(null, null);
    public final D70 a;
    public final InterfaceC7550q70 b;

    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final B70 a(InterfaceC7550q70 interfaceC7550q70) {
            G10.g(interfaceC7550q70, "type");
            return new B70(D70.C, interfaceC7550q70);
        }

        public final B70 b(InterfaceC7550q70 interfaceC7550q70) {
            G10.g(interfaceC7550q70, "type");
            return new B70(D70.D, interfaceC7550q70);
        }

        public final B70 c() {
            return B70.d;
        }

        public final B70 d(InterfaceC7550q70 interfaceC7550q70) {
            G10.g(interfaceC7550q70, "type");
            return new B70(D70.B, interfaceC7550q70);
        }

        public a() {
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[D70.values().length];
            try {
                iArr[D70.B.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[D70.C.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[D70.D.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public B70(D70 d70, InterfaceC7550q70 interfaceC7550q70) {
        String str;
        this.a = d70;
        this.b = interfaceC7550q70;
        if ((d70 == null) == (interfaceC7550q70 == null)) {
            return;
        }
        if (d70 == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + d70 + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    public final D70 a() {
        return this.a;
    }

    public final InterfaceC7550q70 b() {
        return this.b;
    }

    public final InterfaceC7550q70 c() {
        return this.b;
    }

    public final D70 d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B70)) {
            return false;
        }
        B70 b70 = (B70) obj;
        return this.a == b70.a && G10.c(this.b, b70.b);
    }

    public int hashCode() {
        D70 d70 = this.a;
        int iHashCode = (d70 == null ? 0 : d70.hashCode()) * 31;
        InterfaceC7550q70 interfaceC7550q70 = this.b;
        return iHashCode + (interfaceC7550q70 != null ? interfaceC7550q70.hashCode() : 0);
    }

    public String toString() {
        D70 d70 = this.a;
        int i = d70 == null ? -1 : b.a[d70.ordinal()];
        if (i == -1) {
            return "*";
        }
        if (i == 1) {
            return String.valueOf(this.b);
        }
        if (i == 2) {
            return "in " + this.b;
        }
        if (i != 3) {
            throw new C6902no0();
        }
        return "out " + this.b;
    }
}
