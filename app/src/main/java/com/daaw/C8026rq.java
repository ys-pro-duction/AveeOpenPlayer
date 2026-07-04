package com.daaw;

import android.content.Context;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: com.daaw.rq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C8026rq {
    public final Set a;
    public final com.google.firebase.remoteconfig.internal.e b;
    public final com.google.firebase.remoteconfig.internal.c c;
    public final C7050oL d;
    public final RL e;
    public final C5786jq f;
    public final Context g;
    public final String h;
    public final com.google.firebase.remoteconfig.internal.d i;
    public final ScheduledExecutorService j;

    /* JADX INFO: renamed from: com.daaw.rq$a */
    public class a implements InterfaceC9428wq {
        public final InterfaceC9149vq a;

        public a(InterfaceC9149vq interfaceC9149vq) {
            this.a = interfaceC9149vq;
        }
    }

    public C8026rq(C7050oL c7050oL, RL rl, com.google.firebase.remoteconfig.internal.c cVar, C5786jq c5786jq, Context context, String str, com.google.firebase.remoteconfig.internal.d dVar, ScheduledExecutorService scheduledExecutorService) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.a = linkedHashSet;
        this.b = new com.google.firebase.remoteconfig.internal.e(c7050oL, rl, cVar, c5786jq, context, str, linkedHashSet, dVar, scheduledExecutorService);
        this.d = c7050oL;
        this.c = cVar;
        this.e = rl;
        this.f = c5786jq;
        this.g = context;
        this.h = str;
        this.i = dVar;
        this.j = scheduledExecutorService;
    }

    public synchronized InterfaceC9428wq a(InterfaceC9149vq interfaceC9149vq) {
        this.a.add(interfaceC9149vq);
        b();
        return new a(interfaceC9149vq);
    }

    public final synchronized void b() {
        if (!this.a.isEmpty()) {
            this.b.A();
        }
    }

    public synchronized void c(boolean z) {
        this.b.x(z);
        if (!z) {
            b();
        }
    }
}
