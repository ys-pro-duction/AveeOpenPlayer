package com.daaw;

import android.os.Handler;

/* JADX INFO: renamed from: com.daaw.Oi0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1792Oi0 {

    /* JADX INFO: renamed from: com.daaw.Oi0$a */
    public static final class a {
        public final int a;
        public final int b;
        public final int c;
        public final long d;

        public a(int i) {
            this(i, -1L);
        }

        public a a(int i) {
            return this.a == i ? this : new a(i, this.b, this.c, this.d);
        }

        public boolean b() {
            return this.b != -1;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d);
        }

        public a(int i, long j) {
            this(i, -1, -1, j);
        }

        public a(int i, int i2, int i3, long j) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = j;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Oi0$b */
    public interface b {
        void d(InterfaceC1792Oi0 interfaceC1792Oi0, L31 l31, Object obj);
    }

    void a(InterfaceC9110vi0 interfaceC9110vi0);

    void c(Handler handler, InterfaceC1896Pi0 interfaceC1896Pi0);

    void e();

    void f(WI wi, boolean z, b bVar);

    InterfaceC9110vi0 g(a aVar, O3 o3);

    void h(b bVar);

    void i(InterfaceC1896Pi0 interfaceC1896Pi0);
}
