package com.daaw;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.daaw.hu1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5249hu1 {
    public final AtomicInteger a;
    public final Set b;
    public final PriorityBlockingQueue c;
    public final PriorityBlockingQueue d;
    public final InterfaceC1318Jt1 e;
    public final InterfaceC2277St1 f;
    public final C3288au1[] g;
    public C1525Lt1 h;
    public final List i;
    public final List j;
    public final C2067Qt1 k;

    public C5249hu1(InterfaceC1318Jt1 interfaceC1318Jt1, InterfaceC2277St1 interfaceC2277St1, int i) {
        C2067Qt1 c2067Qt1 = new C2067Qt1(new Handler(Looper.getMainLooper()));
        this.a = new AtomicInteger();
        this.b = new HashSet();
        this.c = new PriorityBlockingQueue();
        this.d = new PriorityBlockingQueue();
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.e = interfaceC1318Jt1;
        this.f = interfaceC2277St1;
        this.g = new C3288au1[4];
        this.k = c2067Qt1;
    }

    public final AbstractC4970gu1 a(AbstractC4970gu1 abstractC4970gu1) {
        abstractC4970gu1.zzf(this);
        synchronized (this.b) {
            this.b.add(abstractC4970gu1);
        }
        abstractC4970gu1.zzg(this.a.incrementAndGet());
        abstractC4970gu1.zzm("add-to-queue");
        c(abstractC4970gu1, 0);
        this.c.add(abstractC4970gu1);
        return abstractC4970gu1;
    }

    public final void b(AbstractC4970gu1 abstractC4970gu1) {
        synchronized (this.b) {
            this.b.remove(abstractC4970gu1);
        }
        synchronized (this.i) {
            Iterator it = this.i.iterator();
            if (it.hasNext()) {
                AbstractC6314li0.a(it.next());
                throw null;
            }
        }
        c(abstractC4970gu1, 5);
    }

    public final void c(AbstractC4970gu1 abstractC4970gu1, int i) {
        synchronized (this.j) {
            try {
                Iterator it = this.j.iterator();
                if (it.hasNext()) {
                    AbstractC6314li0.a(it.next());
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        C1525Lt1 c1525Lt1 = this.h;
        if (c1525Lt1 != null) {
            c1525Lt1.b();
        }
        C3288au1[] c3288au1Arr = this.g;
        for (int i = 0; i < 4; i++) {
            C3288au1 c3288au1 = c3288au1Arr[i];
            if (c3288au1 != null) {
                c3288au1.a();
            }
        }
        C1525Lt1 c1525Lt12 = new C1525Lt1(this.c, this.d, this.e, this.k);
        this.h = c1525Lt12;
        c1525Lt12.start();
        for (int i2 = 0; i2 < 4; i2++) {
            C3288au1 c3288au12 = new C3288au1(this.d, this.f, this.e, this.k);
            this.g[i2] = c3288au12;
            c3288au12.start();
        }
    }
}
