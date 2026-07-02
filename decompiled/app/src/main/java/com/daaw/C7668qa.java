package com.daaw;

import com.daaw.C1381Kj0;
import com.daaw.C7946ra;
import com.daaw.TX0;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.daaw.qa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7668qa implements InterfaceC10022yy {
    public final C1381Kj0.b B;
    public final C7946ra C;
    public final C1381Kj0 D;

    /* JADX INFO: renamed from: com.daaw.qa$a */
    public class a implements Runnable {
        public final /* synthetic */ int B;

        public a(int i) {
            this.B = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C7668qa.this.D.isClosed()) {
                return;
            }
            try {
                C7668qa.this.D.c(this.B);
            } catch (Throwable th) {
                C7668qa.this.C.e(th);
                C7668qa.this.D.close();
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.qa$b */
    public class b implements Runnable {
        public final /* synthetic */ IE0 B;

        public b(IE0 ie0) {
            this.B = ie0;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C7668qa.this.D.l(this.B);
            } catch (Throwable th) {
                C7668qa.this.C.e(th);
                C7668qa.this.D.close();
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.qa$c */
    public class c implements Closeable, AutoCloseable {
        public final /* synthetic */ IE0 B;

        public c(IE0 ie0) {
            this.B = ie0;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.B.close();
        }
    }

    /* JADX INFO: renamed from: com.daaw.qa$d */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C7668qa.this.D.j();
        }
    }

    /* JADX INFO: renamed from: com.daaw.qa$e */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C7668qa.this.D.close();
        }
    }

    /* JADX INFO: renamed from: com.daaw.qa$f */
    public class f extends g implements Closeable, AutoCloseable {
        public final Closeable E;

        public f(Runnable runnable, Closeable closeable) {
            super(C7668qa.this, runnable, null);
            this.E = closeable;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.E.close();
        }
    }

    /* JADX INFO: renamed from: com.daaw.qa$g */
    public class g implements TX0.a {
        public final Runnable B;
        public boolean C;

        public /* synthetic */ g(C7668qa c7668qa, Runnable runnable, a aVar) {
            this(runnable);
        }

        public final void a() {
            if (this.C) {
                return;
            }
            this.B.run();
            this.C = true;
        }

        @Override // com.daaw.TX0.a
        public InputStream next() {
            a();
            return C7668qa.this.C.f();
        }

        public g(Runnable runnable) {
            this.C = false;
            this.B = runnable;
        }
    }

    /* JADX INFO: renamed from: com.daaw.qa$h */
    public interface h extends C7946ra.d {
    }

    public C7668qa(C1381Kj0.b bVar, h hVar, C1381Kj0 c1381Kj0) {
        FV0 fv0 = new FV0((C1381Kj0.b) AbstractC7785qy0.o(bVar, "listener"));
        this.B = fv0;
        C7946ra c7946ra = new C7946ra(fv0, hVar);
        this.C = c7946ra;
        c1381Kj0.o0(c7946ra);
        this.D = c1381Kj0;
    }

    @Override // com.daaw.InterfaceC10022yy
    public void c(int i) {
        this.B.a(new g(this, new a(i), null));
    }

    @Override // com.daaw.InterfaceC10022yy, java.lang.AutoCloseable
    public void close() {
        this.D.p0();
        this.B.a(new g(this, new e(), null));
    }

    @Override // com.daaw.InterfaceC10022yy
    public void d(int i) {
        this.D.d(i);
    }

    @Override // com.daaw.InterfaceC10022yy
    public void j() {
        this.B.a(new g(this, new d(), null));
    }

    @Override // com.daaw.InterfaceC10022yy
    public void l(IE0 ie0) {
        this.B.a(new f(new b(ie0), new c(ie0)));
    }

    @Override // com.daaw.InterfaceC10022yy
    public void o(InterfaceC1120Hw interfaceC1120Hw) {
        this.D.o(interfaceC1120Hw);
    }
}
