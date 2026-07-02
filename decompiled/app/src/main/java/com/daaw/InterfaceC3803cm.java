package com.daaw;

import java.io.Closeable;
import java.net.SocketAddress;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: com.daaw.cm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC3803cm extends Closeable {

    /* JADX INFO: renamed from: com.daaw.cm$a */
    public static final class a {
        public String a = "unknown-authority";
        public C1971Qb b = C1971Qb.c;
        public String c;
        public C9332wW d;

        public String a() {
            return this.a;
        }

        public C1971Qb b() {
            return this.b;
        }

        public C9332wW c() {
            return this.d;
        }

        public String d() {
            return this.c;
        }

        public a e(String str) {
            this.a = (String) AbstractC7785qy0.o(str, "authority");
            return this;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b) && AbstractC8301sp0.a(this.c, aVar.c) && AbstractC8301sp0.a(this.d, aVar.d);
        }

        public a f(C1971Qb c1971Qb) {
            AbstractC7785qy0.o(c1971Qb, "eagAttributes");
            this.b = c1971Qb;
            return this;
        }

        public a g(C9332wW c9332wW) {
            this.d = c9332wW;
            return this;
        }

        public a h(String str) {
            this.c = str;
            return this;
        }

        public int hashCode() {
            return AbstractC8301sp0.b(this.a, this.b, this.c, this.d);
        }
    }

    ScheduledExecutorService M0();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    InterfaceC0463Bq t0(SocketAddress socketAddress, a aVar, AbstractC6323lk abstractC6323lk);
}
