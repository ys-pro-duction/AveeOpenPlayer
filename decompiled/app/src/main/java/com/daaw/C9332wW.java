package com.daaw;

import java.net.InetSocketAddress;
import java.net.SocketAddress;

/* JADX INFO: renamed from: com.daaw.wW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9332wW extends AbstractC8126sB0 {
    public final SocketAddress B;
    public final InetSocketAddress C;
    public final String D;
    public final String E;

    /* JADX INFO: renamed from: com.daaw.wW$b */
    public static final class b {
        public SocketAddress a;
        public InetSocketAddress b;
        public String c;
        public String d;

        public C9332wW a() {
            return new C9332wW(this.a, this.b, this.c, this.d);
        }

        public b b(String str) {
            this.d = str;
            return this;
        }

        public b c(SocketAddress socketAddress) {
            this.a = (SocketAddress) AbstractC7785qy0.o(socketAddress, "proxyAddress");
            return this;
        }

        public b d(InetSocketAddress inetSocketAddress) {
            this.b = (InetSocketAddress) AbstractC7785qy0.o(inetSocketAddress, "targetAddress");
            return this;
        }

        public b e(String str) {
            this.c = str;
            return this;
        }

        public b() {
        }
    }

    public static b e() {
        return new b();
    }

    public String a() {
        return this.E;
    }

    public SocketAddress b() {
        return this.B;
    }

    public InetSocketAddress c() {
        return this.C;
    }

    public String d() {
        return this.D;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9332wW)) {
            return false;
        }
        C9332wW c9332wW = (C9332wW) obj;
        return AbstractC8301sp0.a(this.B, c9332wW.B) && AbstractC8301sp0.a(this.C, c9332wW.C) && AbstractC8301sp0.a(this.D, c9332wW.D) && AbstractC8301sp0.a(this.E, c9332wW.E);
    }

    public int hashCode() {
        return AbstractC8301sp0.b(this.B, this.C, this.D, this.E);
    }

    public String toString() {
        return AbstractC6329ll0.b(this).d("proxyAddr", this.B).d("targetAddr", this.C).d("username", this.D).e("hasPassword", this.E != null).toString();
    }

    public C9332wW(SocketAddress socketAddress, InetSocketAddress inetSocketAddress, String str, String str2) {
        AbstractC7785qy0.o(socketAddress, "proxyAddress");
        AbstractC7785qy0.o(inetSocketAddress, "targetAddress");
        if (socketAddress instanceof InetSocketAddress) {
            AbstractC7785qy0.w(!((InetSocketAddress) socketAddress).isUnresolved(), "The proxy address %s is not resolved", socketAddress);
        }
        this.B = socketAddress;
        this.C = inetSocketAddress;
        this.D = str;
        this.E = str2;
    }
}
