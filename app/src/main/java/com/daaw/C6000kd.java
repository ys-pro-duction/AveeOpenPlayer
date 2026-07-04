package com.daaw;

import com.daaw.IP0;

/* JADX INFO: renamed from: com.daaw.kd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6000kd extends IP0 {
    public final H51 a;
    public final String b;
    public final GH c;
    public final InterfaceC7819r51 d;
    public final EG e;

    /* JADX INFO: renamed from: com.daaw.kd$b */
    public static final class b extends IP0.a {
        public H51 a;
        public String b;
        public GH c;
        public InterfaceC7819r51 d;
        public EG e;

        @Override // com.daaw.IP0.a
        public IP0 a() {
            String str = "";
            if (this.a == null) {
                str = " transportContext";
            }
            if (this.b == null) {
                str = str + " transportName";
            }
            if (this.c == null) {
                str = str + " event";
            }
            if (this.d == null) {
                str = str + " transformer";
            }
            if (this.e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new C6000kd(this.a, this.b, this.c, this.d, this.e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.IP0.a
        public IP0.a b(EG eg) {
            if (eg == null) {
                throw new NullPointerException("Null encoding");
            }
            this.e = eg;
            return this;
        }

        @Override // com.daaw.IP0.a
        public IP0.a c(GH gh) {
            if (gh == null) {
                throw new NullPointerException("Null event");
            }
            this.c = gh;
            return this;
        }

        @Override // com.daaw.IP0.a
        public IP0.a d(InterfaceC7819r51 interfaceC7819r51) {
            if (interfaceC7819r51 == null) {
                throw new NullPointerException("Null transformer");
            }
            this.d = interfaceC7819r51;
            return this;
        }

        @Override // com.daaw.IP0.a
        public IP0.a e(H51 h51) {
            if (h51 == null) {
                throw new NullPointerException("Null transportContext");
            }
            this.a = h51;
            return this;
        }

        @Override // com.daaw.IP0.a
        public IP0.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.b = str;
            return this;
        }
    }

    @Override // com.daaw.IP0
    public EG b() {
        return this.e;
    }

    @Override // com.daaw.IP0
    public GH c() {
        return this.c;
    }

    @Override // com.daaw.IP0
    public InterfaceC7819r51 e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof IP0) {
            IP0 ip0 = (IP0) obj;
            if (this.a.equals(ip0.f()) && this.b.equals(ip0.g()) && this.c.equals(ip0.c()) && this.d.equals(ip0.e()) && this.e.equals(ip0.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.daaw.IP0
    public H51 f() {
        return this.a;
    }

    @Override // com.daaw.IP0
    public String g() {
        return this.b;
    }

    public int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.a + ", transportName=" + this.b + ", event=" + this.c + ", transformer=" + this.d + ", encoding=" + this.e + "}";
    }

    public C6000kd(H51 h51, String str, GH gh, InterfaceC7819r51 interfaceC7819r51, EG eg) {
        this.a = h51;
        this.b = str;
        this.c = gh;
        this.d = interfaceC7819r51;
        this.e = eg;
    }
}
