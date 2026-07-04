package com.daaw;

import android.content.Context;

/* JADX INFO: renamed from: com.daaw.Co, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0559Co {
    public AbstractC1940Pt0 a;
    public C3481bd0 b;
    public ZZ0 c;
    public QG0 d;
    public SH e;
    public InterfaceC1096Hq f;
    public C7106oZ g;
    public InterfaceC8453tN0 h;

    /* JADX INFO: renamed from: com.daaw.Co$a */
    public static class a {
        public final Context a;
        public final C9632xb b;
        public final C4129dw c;
        public final C4408ew d;
        public final C0722Ea1 e;
        public final int f;
        public final com.google.firebase.firestore.d g;

        public a(Context context, C9632xb c9632xb, C4129dw c4129dw, C4408ew c4408ew, C0722Ea1 c0722Ea1, int i, com.google.firebase.firestore.d dVar) {
            this.a = context;
            this.b = c9632xb;
            this.c = c4129dw;
            this.d = c4408ew;
            this.e = c0722Ea1;
            this.f = i;
            this.g = dVar;
        }

        public C9632xb a() {
            return this.b;
        }

        public Context b() {
            return this.a;
        }

        public C4129dw c() {
            return this.c;
        }

        public C4408ew d() {
            return this.d;
        }

        public C0722Ea1 e() {
            return this.e;
        }

        public int f() {
            return this.f;
        }

        public com.google.firebase.firestore.d g() {
            return this.g;
        }
    }

    public abstract InterfaceC1096Hq a(a aVar);

    public abstract SH b(a aVar);

    public abstract InterfaceC8453tN0 c(a aVar);

    public abstract C7106oZ d(a aVar);

    public abstract C3481bd0 e(a aVar);

    public abstract AbstractC1940Pt0 f(a aVar);

    public abstract QG0 g(a aVar);

    public abstract ZZ0 h(a aVar);

    public InterfaceC1096Hq i() {
        return (InterfaceC1096Hq) AbstractC6557mb.e(this.f, "connectivityMonitor not initialized yet", new Object[0]);
    }

    public SH j() {
        return (SH) AbstractC6557mb.e(this.e, "eventManager not initialized yet", new Object[0]);
    }

    public InterfaceC8453tN0 k() {
        return this.h;
    }

    public C7106oZ l() {
        return this.g;
    }

    public C3481bd0 m() {
        return (C3481bd0) AbstractC6557mb.e(this.b, "localStore not initialized yet", new Object[0]);
    }

    public AbstractC1940Pt0 n() {
        return (AbstractC1940Pt0) AbstractC6557mb.e(this.a, "persistence not initialized yet", new Object[0]);
    }

    public QG0 o() {
        return (QG0) AbstractC6557mb.e(this.d, "remoteStore not initialized yet", new Object[0]);
    }

    public ZZ0 p() {
        return (ZZ0) AbstractC6557mb.e(this.c, "syncEngine not initialized yet", new Object[0]);
    }

    public void q(a aVar) {
        AbstractC1940Pt0 abstractC1940Pt0F = f(aVar);
        this.a = abstractC1940Pt0F;
        abstractC1940Pt0F.l();
        this.b = e(aVar);
        this.f = a(aVar);
        this.d = g(aVar);
        this.c = h(aVar);
        this.e = b(aVar);
        this.b.G();
        this.d.K();
        this.h = c(aVar);
        this.g = d(aVar);
    }
}
