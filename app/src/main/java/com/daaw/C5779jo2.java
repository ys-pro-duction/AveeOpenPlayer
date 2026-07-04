package com.daaw;

/* JADX INFO: renamed from: com.daaw.jo2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5779jo2 {
    public final InterfaceC1810Om2 a;
    public boolean b;

    public C5779jo2(InterfaceC1810Om2 interfaceC1810Om2) {
        this.a = interfaceC1810Om2;
    }

    public final synchronized void a() {
        while (!this.b) {
            wait();
        }
    }

    public final synchronized void b() {
        boolean z = false;
        while (!this.b) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean c() {
        boolean z;
        z = this.b;
        this.b = false;
        return z;
    }

    public final synchronized boolean d() {
        return this.b;
    }

    public final synchronized boolean e() {
        if (this.b) {
            return false;
        }
        this.b = true;
        notifyAll();
        return true;
    }
}
