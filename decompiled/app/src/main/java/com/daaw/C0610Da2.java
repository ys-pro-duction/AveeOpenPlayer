package com.daaw;

import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.zzo;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.Da2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0610Da2 {
    public final Set a = new HashSet();
    public final Set b = new HashSet();
    public final Set c = new HashSet();
    public final Set d = new HashSet();
    public final Set e = new HashSet();
    public final Set f = new HashSet();
    public final Set g = new HashSet();
    public final Set h = new HashSet();
    public final Set i = new HashSet();
    public final Set j = new HashSet();
    public final Set k = new HashSet();
    public final Set l = new HashSet();
    public final Set m = new HashSet();
    public final Set n = new HashSet();
    public MD2 o;

    public final C0610Da2 d(zza zzaVar, Executor executor) {
        this.c.add(new C0623Db2(zzaVar, executor));
        return this;
    }

    public final C0610Da2 e(U62 u62, Executor executor) {
        this.i.add(new C0623Db2(u62, executor));
        return this;
    }

    public final C0610Da2 f(InterfaceC6157l72 interfaceC6157l72, Executor executor) {
        this.l.add(new C0623Db2(interfaceC6157l72, executor));
        return this;
    }

    public final C0610Da2 g(InterfaceC7273p72 interfaceC7273p72, Executor executor) {
        this.f.add(new C0623Db2(interfaceC7273p72, executor));
        return this;
    }

    public final C0610Da2 h(R62 r62, Executor executor) {
        this.e.add(new C0623Db2(r62, executor));
        return this;
    }

    public final C0610Da2 i(J72 j72, Executor executor) {
        this.h.add(new C0623Db2(j72, executor));
        return this;
    }

    public final C0610Da2 j(Z72 z72, Executor executor) {
        this.g.add(new C0623Db2(z72, executor));
        return this;
    }

    public final C0610Da2 k(zzo zzoVar, Executor executor) {
        this.n.add(new C0623Db2(zzoVar, executor));
        return this;
    }

    public final C0610Da2 l(InterfaceC6162l82 interfaceC6162l82, Executor executor) {
        this.m.add(new C0623Db2(interfaceC6162l82, executor));
        return this;
    }

    public final C0610Da2 m(S82 s82, Executor executor) {
        this.b.add(new C0623Db2(s82, executor));
        return this;
    }

    public final C0610Da2 n(AppEventListener appEventListener, Executor executor) {
        this.k.add(new C0623Db2(appEventListener, executor));
        return this;
    }

    public final C0610Da2 o(InterfaceC1974Qb2 interfaceC1974Qb2, Executor executor) {
        this.d.add(new C0623Db2(interfaceC1974Qb2, executor));
        return this;
    }

    public final C0610Da2 p(MD2 md2) {
        this.o = md2;
        return this;
    }

    public final C0827Fa2 q() {
        return new C0827Fa2(this, null);
    }
}
