package com.daaw;

import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: com.daaw.Np1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1717Np1 implements InterfaceC7187op1 {
    public final Object a = new Object();
    public final int b;
    public final C9995yr3 c;
    public int d;
    public int e;
    public int f;
    public Exception g;
    public boolean h;

    public C1717Np1(int i, C9995yr3 c9995yr3) {
        this.b = i;
        this.c = c9995yr3;
    }

    private final void a() {
        if (this.d + this.e + this.f == this.b) {
            if (this.g == null) {
                if (this.h) {
                    this.c.s();
                    return;
                } else {
                    this.c.r(null);
                    return;
                }
            }
            this.c.q(new ExecutionException(this.e + " out of " + this.b + " underlying tasks failed", this.g));
        }
    }

    @Override // com.daaw.InterfaceC4381eq0
    public final void b() {
        synchronized (this.a) {
            this.f++;
            this.h = true;
            a();
        }
    }

    @Override // com.daaw.InterfaceC7470pq0
    public final void c(Exception exc) {
        synchronized (this.a) {
            this.e++;
            this.g = exc;
            a();
        }
    }

    @Override // com.daaw.InterfaceC0464Bq0
    public final void onSuccess(Object obj) {
        synchronized (this.a) {
            this.d++;
            a();
        }
    }
}
