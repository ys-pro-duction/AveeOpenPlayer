package com.daaw;

import android.os.Handler;
import android.os.Looper;
import com.daaw.InterfaceC1792Oi0;
import com.google.android.exoplayer2.Format;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.daaw.Pi0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1896Pi0 {

    /* JADX INFO: renamed from: com.daaw.Pi0$a */
    public static final class a {
        public final int a;
        public final InterfaceC1792Oi0.a b;
        public final CopyOnWriteArrayList c;
        public final long d;

        /* JADX INFO: renamed from: com.daaw.Pi0$a$a, reason: collision with other inner class name */
        public class RunnableC0108a implements Runnable {
            public final /* synthetic */ InterfaceC1896Pi0 B;

            public RunnableC0108a(InterfaceC1896Pi0 interfaceC1896Pi0) {
                this.B = interfaceC1896Pi0;
            }

            @Override // java.lang.Runnable
            public void run() {
                InterfaceC1896Pi0 interfaceC1896Pi0 = this.B;
                a aVar = a.this;
                interfaceC1896Pi0.r(aVar.a, aVar.b);
            }
        }

        /* JADX INFO: renamed from: com.daaw.Pi0$a$b */
        public class b implements Runnable {
            public final /* synthetic */ InterfaceC1896Pi0 B;

            public b(InterfaceC1896Pi0 interfaceC1896Pi0) {
                this.B = interfaceC1896Pi0;
            }

            @Override // java.lang.Runnable
            public void run() {
                InterfaceC1896Pi0 interfaceC1896Pi0 = this.B;
                a aVar = a.this;
                interfaceC1896Pi0.h(aVar.a, aVar.b);
            }
        }

        /* JADX INFO: renamed from: com.daaw.Pi0$a$c */
        public class c implements Runnable {
            public final /* synthetic */ InterfaceC1896Pi0 B;
            public final /* synthetic */ b C;
            public final /* synthetic */ c D;

            public c(InterfaceC1896Pi0 interfaceC1896Pi0, b bVar, c cVar) {
                this.B = interfaceC1896Pi0;
                this.C = bVar;
                this.D = cVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                InterfaceC1896Pi0 interfaceC1896Pi0 = this.B;
                a aVar = a.this;
                interfaceC1896Pi0.w(aVar.a, aVar.b, this.C, this.D);
            }
        }

        /* JADX INFO: renamed from: com.daaw.Pi0$a$d */
        public class d implements Runnable {
            public final /* synthetic */ InterfaceC1896Pi0 B;
            public final /* synthetic */ b C;
            public final /* synthetic */ c D;

            public d(InterfaceC1896Pi0 interfaceC1896Pi0, b bVar, c cVar) {
                this.B = interfaceC1896Pi0;
                this.C = bVar;
                this.D = cVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                InterfaceC1896Pi0 interfaceC1896Pi0 = this.B;
                a aVar = a.this;
                interfaceC1896Pi0.l(aVar.a, aVar.b, this.C, this.D);
            }
        }

        /* JADX INFO: renamed from: com.daaw.Pi0$a$e */
        public class e implements Runnable {
            public final /* synthetic */ InterfaceC1896Pi0 B;
            public final /* synthetic */ b C;
            public final /* synthetic */ c D;

            public e(InterfaceC1896Pi0 interfaceC1896Pi0, b bVar, c cVar) {
                this.B = interfaceC1896Pi0;
                this.C = bVar;
                this.D = cVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                InterfaceC1896Pi0 interfaceC1896Pi0 = this.B;
                a aVar = a.this;
                interfaceC1896Pi0.E(aVar.a, aVar.b, this.C, this.D);
            }
        }

        /* JADX INFO: renamed from: com.daaw.Pi0$a$f */
        public class f implements Runnable {
            public final /* synthetic */ InterfaceC1896Pi0 B;
            public final /* synthetic */ b C;
            public final /* synthetic */ c D;
            public final /* synthetic */ IOException E;
            public final /* synthetic */ boolean F;

            public f(InterfaceC1896Pi0 interfaceC1896Pi0, b bVar, c cVar, IOException iOException, boolean z) {
                this.B = interfaceC1896Pi0;
                this.C = bVar;
                this.D = cVar;
                this.E = iOException;
                this.F = z;
            }

            @Override // java.lang.Runnable
            public void run() {
                InterfaceC1896Pi0 interfaceC1896Pi0 = this.B;
                a aVar = a.this;
                interfaceC1896Pi0.F(aVar.a, aVar.b, this.C, this.D, this.E, this.F);
            }
        }

        /* JADX INFO: renamed from: com.daaw.Pi0$a$g */
        public class g implements Runnable {
            public final /* synthetic */ InterfaceC1896Pi0 B;

            public g(InterfaceC1896Pi0 interfaceC1896Pi0) {
                this.B = interfaceC1896Pi0;
            }

            @Override // java.lang.Runnable
            public void run() {
                InterfaceC1896Pi0 interfaceC1896Pi0 = this.B;
                a aVar = a.this;
                interfaceC1896Pi0.t(aVar.a, aVar.b);
            }
        }

        /* JADX INFO: renamed from: com.daaw.Pi0$a$h */
        public class h implements Runnable {
            public final /* synthetic */ InterfaceC1896Pi0 B;
            public final /* synthetic */ c C;

            public h(InterfaceC1896Pi0 interfaceC1896Pi0, c cVar) {
                this.B = interfaceC1896Pi0;
                this.C = cVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                InterfaceC1896Pi0 interfaceC1896Pi0 = this.B;
                a aVar = a.this;
                interfaceC1896Pi0.o(aVar.a, aVar.b, this.C);
            }
        }

        /* JADX INFO: renamed from: com.daaw.Pi0$a$i */
        public class i implements Runnable {
            public final /* synthetic */ InterfaceC1896Pi0 B;
            public final /* synthetic */ c C;

            public i(InterfaceC1896Pi0 interfaceC1896Pi0, c cVar) {
                this.B = interfaceC1896Pi0;
                this.C = cVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                InterfaceC1896Pi0 interfaceC1896Pi0 = this.B;
                a aVar = a.this;
                interfaceC1896Pi0.C(aVar.a, aVar.b, this.C);
            }
        }

        /* JADX INFO: renamed from: com.daaw.Pi0$a$j */
        public static final class j {
            public final Handler a;
            public final InterfaceC1896Pi0 b;

            public j(Handler handler, InterfaceC1896Pi0 interfaceC1896Pi0) {
                this.a = handler;
                this.b = interfaceC1896Pi0;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null, 0L);
        }

        public void a(Handler handler, InterfaceC1896Pi0 interfaceC1896Pi0) {
            AbstractC7115ob.a((handler == null || interfaceC1896Pi0 == null) ? false : true);
            this.c.add(new j(handler, interfaceC1896Pi0));
        }

        public final long b(long j2) {
            long jB = AbstractC6025ki.b(j2);
            if (jB == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.d + jB;
        }

        public void c(int i2, Format format, int i3, Object obj, long j2) {
            d(new c(1, i2, format, i3, obj, b(j2), -9223372036854775807L));
        }

        public void d(c cVar) {
            for (j jVar : this.c) {
                s(jVar.a, new i(jVar.b, cVar));
            }
        }

        public void e(C2907Yv c2907Yv, int i2, int i3, Format format, int i4, Object obj, long j2, long j3, long j4, long j5, long j6) {
            g(new b(c2907Yv, j4, j5, j6), new c(i2, i3, format, i4, obj, b(j2), b(j3)));
        }

        public void f(C2907Yv c2907Yv, int i2, long j2, long j3, long j4) {
            e(c2907Yv, i2, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j2, j3, j4);
        }

        public void g(b bVar, c cVar) {
            for (j jVar : this.c) {
                s(jVar.a, new e(jVar.b, bVar, cVar));
            }
        }

        public void h(C2907Yv c2907Yv, int i2, int i3, Format format, int i4, Object obj, long j2, long j3, long j4, long j5, long j6) {
            j(new b(c2907Yv, j4, j5, j6), new c(i2, i3, format, i4, obj, b(j2), b(j3)));
        }

        public void i(C2907Yv c2907Yv, int i2, long j2, long j3, long j4) {
            h(c2907Yv, i2, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j2, j3, j4);
        }

        public void j(b bVar, c cVar) {
            for (j jVar : this.c) {
                s(jVar.a, new d(jVar.b, bVar, cVar));
            }
        }

        public void k(C2907Yv c2907Yv, int i2, int i3, Format format, int i4, Object obj, long j2, long j3, long j4, long j5, long j6, IOException iOException, boolean z) {
            m(new b(c2907Yv, j4, j5, j6), new c(i2, i3, format, i4, obj, b(j2), b(j3)), iOException, z);
        }

        public void l(C2907Yv c2907Yv, int i2, long j2, long j3, long j4, IOException iOException, boolean z) {
            k(c2907Yv, i2, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j2, j3, j4, iOException, z);
        }

        public void m(b bVar, c cVar, IOException iOException, boolean z) {
            for (j jVar : this.c) {
                s(jVar.a, new f(jVar.b, bVar, cVar, iOException, z));
            }
        }

        public void n(C2907Yv c2907Yv, int i2, int i3, Format format, int i4, Object obj, long j2, long j3, long j4) {
            p(new b(c2907Yv, j4, 0L, 0L), new c(i2, i3, format, i4, obj, b(j2), b(j3)));
        }

        public void o(C2907Yv c2907Yv, int i2, long j2) {
            n(c2907Yv, i2, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j2);
        }

        public void p(b bVar, c cVar) {
            for (j jVar : this.c) {
                s(jVar.a, new c(jVar.b, bVar, cVar));
            }
        }

        public void q() {
            AbstractC7115ob.f(this.b != null);
            for (j jVar : this.c) {
                s(jVar.a, new RunnableC0108a(jVar.b));
            }
        }

        public void r() {
            AbstractC7115ob.f(this.b != null);
            for (j jVar : this.c) {
                s(jVar.a, new b(jVar.b));
            }
        }

        public final void s(Handler handler, Runnable runnable) {
            if (handler.getLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }

        public void t() {
            AbstractC7115ob.f(this.b != null);
            for (j jVar : this.c) {
                s(jVar.a, new g(jVar.b));
            }
        }

        public void u(InterfaceC1896Pi0 interfaceC1896Pi0) {
            for (j jVar : this.c) {
                if (jVar.b == interfaceC1896Pi0) {
                    this.c.remove(jVar);
                }
            }
        }

        public void v(int i2, long j2, long j3) {
            w(new c(1, i2, null, 3, null, b(j2), b(j3)));
        }

        public void w(c cVar) {
            for (j jVar : this.c) {
                s(jVar.a, new h(jVar.b, cVar));
            }
        }

        public a x(int i2, InterfaceC1792Oi0.a aVar, long j2) {
            return new a(this.c, i2, aVar, j2);
        }

        public a(CopyOnWriteArrayList copyOnWriteArrayList, int i2, InterfaceC1792Oi0.a aVar, long j2) {
            this.c = copyOnWriteArrayList;
            this.a = i2;
            this.b = aVar;
            this.d = j2;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Pi0$b */
    public static final class b {
        public final C2907Yv a;
        public final long b;
        public final long c;
        public final long d;

        public b(C2907Yv c2907Yv, long j, long j2, long j3) {
            this.a = c2907Yv;
            this.b = j;
            this.c = j2;
            this.d = j3;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Pi0$c */
    public static final class c {
        public final int a;
        public final int b;
        public final Format c;
        public final int d;
        public final Object e;
        public final long f;
        public final long g;

        public c(int i, int i2, Format format, int i3, Object obj, long j, long j2) {
            this.a = i;
            this.b = i2;
            this.c = format;
            this.d = i3;
            this.e = obj;
            this.f = j;
            this.g = j2;
        }
    }

    void C(int i, InterfaceC1792Oi0.a aVar, c cVar);

    void E(int i, InterfaceC1792Oi0.a aVar, b bVar, c cVar);

    void F(int i, InterfaceC1792Oi0.a aVar, b bVar, c cVar, IOException iOException, boolean z);

    void h(int i, InterfaceC1792Oi0.a aVar);

    void l(int i, InterfaceC1792Oi0.a aVar, b bVar, c cVar);

    void o(int i, InterfaceC1792Oi0.a aVar, c cVar);

    void r(int i, InterfaceC1792Oi0.a aVar);

    void t(int i, InterfaceC1792Oi0.a aVar);

    void w(int i, InterfaceC1792Oi0.a aVar, b bVar, c cVar);
}
