package com.daaw;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: com.daaw.Tx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2395Tx implements MS0 {
    public final Lock b;

    public C2395Tx(Lock lock) {
        G10.g(lock, "lock");
        this.b = lock;
    }

    @Override // com.daaw.MS0
    public void a() {
        this.b.unlock();
    }

    @Override // com.daaw.MS0
    public void b() {
        this.b.lock();
    }

    public final Lock c() {
        return this.b;
    }

    public /* synthetic */ C2395Tx(Lock lock, int i, AbstractC2911Yw abstractC2911Yw) {
        this((i & 1) != 0 ? new ReentrantLock() : lock);
    }
}
