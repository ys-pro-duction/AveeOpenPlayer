package com.daaw;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: com.daaw.rw2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8057rw2 {
    public final InterfaceC1810Om2 a;
    public final InterfaceC1834Os2 b;
    public final InterfaceC5531iv2 c;
    public final CopyOnWriteArraySet d;
    public final ArrayDeque e;
    public final ArrayDeque f;
    public final Object g;
    public boolean h;
    public boolean i;

    public C8057rw2(Looper looper, InterfaceC1810Om2 interfaceC1810Om2, InterfaceC5531iv2 interfaceC5531iv2) {
        this(new CopyOnWriteArraySet(), looper, interfaceC1810Om2, interfaceC5531iv2, true);
    }

    public static /* synthetic */ boolean g(C8057rw2 c8057rw2, Message message) {
        Iterator it = c8057rw2.d.iterator();
        while (it.hasNext()) {
            ((C1638Mv2) it.next()).b(c8057rw2.c);
            if (c8057rw2.b.b(0)) {
                return true;
            }
        }
        return true;
    }

    public final C8057rw2 a(Looper looper, InterfaceC5531iv2 interfaceC5531iv2) {
        return new C8057rw2(this.d, looper, this.a, interfaceC5531iv2, this.i);
    }

    public final void b(Object obj) {
        synchronized (this.g) {
            try {
                if (this.h) {
                    return;
                }
                this.d.add(new C1638Mv2(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        h();
        if (this.f.isEmpty()) {
            return;
        }
        if (!this.b.b(0)) {
            InterfaceC1834Os2 interfaceC1834Os2 = this.b;
            interfaceC1834Os2.g(interfaceC1834Os2.zzb(0));
        }
        boolean zIsEmpty = this.e.isEmpty();
        this.e.addAll(this.f);
        this.f.clear();
        if (zIsEmpty) {
            while (!this.e.isEmpty()) {
                ((Runnable) this.e.peekFirst()).run();
                this.e.removeFirst();
            }
        }
    }

    public final void d(final int i, final InterfaceC0803Eu2 interfaceC0803Eu2) {
        h();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.d);
        this.f.add(new Runnable() { // from class: com.daaw.au2
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    InterfaceC0803Eu2 interfaceC0803Eu22 = interfaceC0803Eu2;
                    ((C1638Mv2) it.next()).a(i, interfaceC0803Eu22);
                }
            }
        });
    }

    public final void e() {
        h();
        synchronized (this.g) {
            this.h = true;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((C1638Mv2) it.next()).c(this.c);
        }
        this.d.clear();
    }

    public final void f(Object obj) {
        h();
        for (C1638Mv2 c1638Mv2 : this.d) {
            if (c1638Mv2.a.equals(obj)) {
                c1638Mv2.c(this.c);
                this.d.remove(c1638Mv2);
            }
        }
    }

    public final void h() {
        if (this.i) {
            AbstractC6048km2.f(Thread.currentThread() == this.b.zza().getThread());
        }
    }

    public C8057rw2(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, InterfaceC1810Om2 interfaceC1810Om2, InterfaceC5531iv2 interfaceC5531iv2, boolean z) {
        this.a = interfaceC1810Om2;
        this.d = copyOnWriteArraySet;
        this.c = interfaceC5531iv2;
        this.g = new Object();
        this.e = new ArrayDeque();
        this.f = new ArrayDeque();
        this.b = interfaceC1810Om2.a(looper, new Handler.Callback() { // from class: com.daaw.wt2
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                C8057rw2.g(this.B, message);
                return true;
            }
        });
        this.i = z;
    }
}
