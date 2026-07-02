package com.daaw;

import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes4.dex */
public class M31 {
    public static final M31 d = new a();
    public boolean a;
    public long b;
    public long c;

    public long a() {
        if (this.a) {
            return this.b;
        }
        throw new IllegalStateException("No deadline");
    }

    public boolean b() {
        return this.a;
    }

    public void c() throws InterruptedIOException {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
        if (this.a && this.b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public long d() {
        return this.c;
    }

    public class a extends M31 {
        @Override // com.daaw.M31
        public void c() {
        }
    }
}
