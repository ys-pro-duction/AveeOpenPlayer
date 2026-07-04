package com.daaw;

import android.os.Handler;
import com.daaw.InterfaceC5446ie;

/* JADX INFO: renamed from: com.daaw.Pw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1951Pw implements InterfaceC5446ie, InterfaceC5299i51 {
    public final Handler a;
    public final InterfaceC5446ie.a b;
    public final MT0 c;
    public final InterfaceC5207hm d;
    public int e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;

    /* JADX INFO: renamed from: com.daaw.Pw$a */
    public class a implements Runnable {
        public final /* synthetic */ int B;
        public final /* synthetic */ long C;
        public final /* synthetic */ long D;

        public a(int i, long j, long j2) {
            this.B = i;
            this.C = j;
            this.D = j2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1951Pw.this.b.k(this.B, this.C, this.D);
        }
    }

    public C1951Pw() {
        this(null, null, 1000000L, 2000, InterfaceC5207hm.a);
    }

    @Override // com.daaw.InterfaceC5299i51
    public synchronized void a(Object obj, int i) {
        this.g += (long) i;
    }

    @Override // com.daaw.InterfaceC5299i51
    public synchronized void b(Object obj) throws Throwable {
        Throwable th;
        try {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            AbstractC7115ob.f(this.e > 0);
            long jB = this.d.b();
            int i = (int) (jB - this.f);
            this.h += i;
            long j = this.i;
            long j2 = this.g;
            this.i = j + j2;
            if (i > 0) {
                try {
                    this.c.a((int) Math.sqrt(j2), (8000 * j2) / r7);
                    if (this.h >= 2000 || this.i >= 524288) {
                        this.j = (long) this.c.d(0.5f);
                    }
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            }
            f(i, this.g, this.j);
            int i2 = this.e - 1;
            this.e = i2;
            if (i2 > 0) {
                this.f = jB;
            }
            this.g = 0L;
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    @Override // com.daaw.InterfaceC5299i51
    public synchronized void c(Object obj, C2907Yv c2907Yv) {
        try {
            if (this.e == 0) {
                this.f = this.d.b();
            }
            this.e++;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.daaw.InterfaceC5446ie
    public synchronized long d() {
        return this.j;
    }

    public final void f(int i, long j, long j2) {
        Handler handler = this.a;
        if (handler == null || this.b == null) {
            return;
        }
        handler.post(new a(i, j, j2));
    }

    public C1951Pw(Handler handler, InterfaceC5446ie.a aVar, long j, int i, InterfaceC5207hm interfaceC5207hm) {
        this.a = handler;
        this.b = aVar;
        this.c = new MT0(i);
        this.d = interfaceC5207hm;
        this.j = j;
    }
}
