package com.daaw;

import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: renamed from: com.daaw.xn3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9696xn3 {
    public final Object a = new Object();
    public Queue b;
    public boolean c;

    public final void a(InterfaceC5489im3 interfaceC5489im3) {
        synchronized (this.a) {
            try {
                if (this.b == null) {
                    this.b = new ArrayDeque();
                }
                this.b.add(interfaceC5489im3);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(AbstractC6963o11 abstractC6963o11) {
        InterfaceC5489im3 interfaceC5489im3;
        synchronized (this.a) {
            if (this.b != null && !this.c) {
                this.c = true;
                while (true) {
                    synchronized (this.a) {
                        try {
                            interfaceC5489im3 = (InterfaceC5489im3) this.b.poll();
                            if (interfaceC5489im3 == null) {
                                this.c = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    interfaceC5489im3.a(abstractC6963o11);
                }
            }
        }
    }
}
