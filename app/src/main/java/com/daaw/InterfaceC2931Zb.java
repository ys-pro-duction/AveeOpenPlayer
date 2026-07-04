package com.daaw;

import android.os.Handler;
import com.google.android.exoplayer2.Format;

/* JADX INFO: renamed from: com.daaw.Zb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2931Zb {

    /* JADX INFO: renamed from: com.daaw.Zb$a */
    public static final class a {
        public final Handler a;
        public final InterfaceC2931Zb b;

        /* JADX INFO: renamed from: com.daaw.Zb$a$a, reason: collision with other inner class name */
        public class RunnableC0141a implements Runnable {
            public final /* synthetic */ C0912Fw B;

            public RunnableC0141a(C0912Fw c0912Fw) {
                this.B = c0912Fw;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.D(this.B);
            }
        }

        /* JADX INFO: renamed from: com.daaw.Zb$a$b */
        public class b implements Runnable {
            public final /* synthetic */ String B;
            public final /* synthetic */ long C;
            public final /* synthetic */ long D;

            public b(String str, long j, long j2) {
                this.B = str;
                this.C = j;
                this.D = j2;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.n(this.B, this.C, this.D);
            }
        }

        /* JADX INFO: renamed from: com.daaw.Zb$a$c */
        public class c implements Runnable {
            public final /* synthetic */ Format B;

            public c(Format format) {
                this.B = format;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.z(this.B);
            }
        }

        /* JADX INFO: renamed from: com.daaw.Zb$a$d */
        public class d implements Runnable {
            public final /* synthetic */ int B;
            public final /* synthetic */ long C;
            public final /* synthetic */ long D;

            public d(int i, long j, long j2) {
                this.B = i;
                this.C = j;
                this.D = j2;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.B(this.B, this.C, this.D);
            }
        }

        /* JADX INFO: renamed from: com.daaw.Zb$a$e */
        public class e implements Runnable {
            public final /* synthetic */ C0912Fw B;

            public e(C0912Fw c0912Fw) {
                this.B = c0912Fw;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.B.a();
                a.this.b.j(this.B);
            }
        }

        /* JADX INFO: renamed from: com.daaw.Zb$a$f */
        public class f implements Runnable {
            public final /* synthetic */ int B;

            public f(int i) {
                this.B = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.a(this.B);
            }
        }

        public a(Handler handler, InterfaceC2931Zb interfaceC2931Zb) {
            this.a = interfaceC2931Zb != null ? (Handler) AbstractC7115ob.e(handler) : null;
            this.b = interfaceC2931Zb;
        }

        public void b(int i) {
            if (this.b != null) {
                this.a.post(new f(i));
            }
        }

        public void c(int i, long j, long j2) {
            if (this.b != null) {
                this.a.post(new d(i, j, j2));
            }
        }

        public void d(String str, long j, long j2) {
            if (this.b != null) {
                this.a.post(new b(str, j, j2));
            }
        }

        public void e(C0912Fw c0912Fw) {
            if (this.b != null) {
                this.a.post(new e(c0912Fw));
            }
        }

        public void f(C0912Fw c0912Fw) {
            if (this.b != null) {
                this.a.post(new RunnableC0141a(c0912Fw));
            }
        }

        public void g(Format format) {
            if (this.b != null) {
                this.a.post(new c(format));
            }
        }
    }

    void B(int i, long j, long j2);

    void D(C0912Fw c0912Fw);

    void a(int i);

    void j(C0912Fw c0912Fw);

    void n(String str, long j, long j2);

    void z(Format format);
}
