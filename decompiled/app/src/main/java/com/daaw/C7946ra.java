package com.daaw;

import com.daaw.C1381Kj0;
import com.daaw.TX0;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: renamed from: com.daaw.ra, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7946ra implements C1381Kj0.b {
    public final d a;
    public final C1381Kj0.b b;
    public final Queue c = new ArrayDeque();

    /* JADX INFO: renamed from: com.daaw.ra$a */
    public class a implements Runnable {
        public final /* synthetic */ int B;

        public a(int i) {
            this.B = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            C7946ra.this.b.d(this.B);
        }
    }

    /* JADX INFO: renamed from: com.daaw.ra$b */
    public class b implements Runnable {
        public final /* synthetic */ boolean B;

        public b(boolean z) {
            this.B = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            C7946ra.this.b.c(this.B);
        }
    }

    /* JADX INFO: renamed from: com.daaw.ra$c */
    public class c implements Runnable {
        public final /* synthetic */ Throwable B;

        public c(Throwable th) {
            this.B = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            C7946ra.this.b.e(this.B);
        }
    }

    /* JADX INFO: renamed from: com.daaw.ra$d */
    public interface d {
        void f(Runnable runnable);
    }

    public C7946ra(C1381Kj0.b bVar, d dVar) {
        this.b = (C1381Kj0.b) AbstractC7785qy0.o(bVar, "listener");
        this.a = (d) AbstractC7785qy0.o(dVar, "transportExecutor");
    }

    @Override // com.daaw.C1381Kj0.b
    public void a(TX0.a aVar) {
        while (true) {
            InputStream next = aVar.next();
            if (next == null) {
                return;
            } else {
                this.c.add(next);
            }
        }
    }

    @Override // com.daaw.C1381Kj0.b
    public void c(boolean z) {
        this.a.f(new b(z));
    }

    @Override // com.daaw.C1381Kj0.b
    public void d(int i) {
        this.a.f(new a(i));
    }

    @Override // com.daaw.C1381Kj0.b
    public void e(Throwable th) {
        this.a.f(new c(th));
    }

    public InputStream f() {
        return (InputStream) this.c.poll();
    }
}
