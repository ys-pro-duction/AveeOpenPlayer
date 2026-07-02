package com.daaw;

import android.os.Handler;
import android.view.Surface;
import com.google.android.exoplayer2.Format;

/* JADX INFO: renamed from: com.daaw.Kd1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1358Kd1 {

    /* JADX INFO: renamed from: com.daaw.Kd1$a */
    public static final class a {
        public final Handler a;
        public final InterfaceC1358Kd1 b;

        /* JADX INFO: renamed from: com.daaw.Kd1$a$a, reason: collision with other inner class name */
        public class RunnableC0088a implements Runnable {
            public final /* synthetic */ C0912Fw B;

            public RunnableC0088a(C0912Fw c0912Fw) {
                this.B = c0912Fw;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.y(this.B);
            }
        }

        /* JADX INFO: renamed from: com.daaw.Kd1$a$b */
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
                a.this.b.f(this.B, this.C, this.D);
            }
        }

        /* JADX INFO: renamed from: com.daaw.Kd1$a$c */
        public class c implements Runnable {
            public final /* synthetic */ Format B;

            public c(Format format) {
                this.B = format;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.x(this.B);
            }
        }

        /* JADX INFO: renamed from: com.daaw.Kd1$a$d */
        public class d implements Runnable {
            public final /* synthetic */ int B;
            public final /* synthetic */ long C;

            public d(int i, long j) {
                this.B = i;
                this.C = j;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.q(this.B, this.C);
            }
        }

        /* JADX INFO: renamed from: com.daaw.Kd1$a$e */
        public class e implements Runnable {
            public final /* synthetic */ int B;
            public final /* synthetic */ int C;
            public final /* synthetic */ int D;
            public final /* synthetic */ float E;

            public e(int i, int i2, int i3, float f) {
                this.B = i;
                this.C = i2;
                this.D = i3;
                this.E = f;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.b(this.B, this.C, this.D, this.E);
            }
        }

        /* JADX INFO: renamed from: com.daaw.Kd1$a$f */
        public class f implements Runnable {
            public final /* synthetic */ Surface B;

            public f(Surface surface) {
                this.B = surface;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.i(this.B);
            }
        }

        /* JADX INFO: renamed from: com.daaw.Kd1$a$g */
        public class g implements Runnable {
            public final /* synthetic */ C0912Fw B;

            public g(C0912Fw c0912Fw) {
                this.B = c0912Fw;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.B.a();
                a.this.b.u(this.B);
            }
        }

        public a(Handler handler, InterfaceC1358Kd1 interfaceC1358Kd1) {
            this.a = interfaceC1358Kd1 != null ? (Handler) AbstractC7115ob.e(handler) : null;
            this.b = interfaceC1358Kd1;
        }

        public void b(String str, long j, long j2) {
            if (this.b != null) {
                this.a.post(new b(str, j, j2));
            }
        }

        public void c(C0912Fw c0912Fw) {
            if (this.b != null) {
                this.a.post(new g(c0912Fw));
            }
        }

        public void d(int i, long j) {
            if (this.b != null) {
                this.a.post(new d(i, j));
            }
        }

        public void e(C0912Fw c0912Fw) {
            if (this.b != null) {
                this.a.post(new RunnableC0088a(c0912Fw));
            }
        }

        public void f(Format format) {
            if (this.b != null) {
                this.a.post(new c(format));
            }
        }

        public void g(Surface surface) {
            if (this.b != null) {
                this.a.post(new f(surface));
            }
        }

        public void h(int i, int i2, int i3, float f2) {
            if (this.b != null) {
                this.a.post(new e(i, i2, i3, f2));
            }
        }
    }

    void b(int i, int i2, int i3, float f);

    void f(String str, long j, long j2);

    void i(Surface surface);

    void q(int i, long j);

    void u(C0912Fw c0912Fw);

    void x(Format format);

    void y(C0912Fw c0912Fw);
}
