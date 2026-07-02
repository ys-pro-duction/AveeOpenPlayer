package com.daaw;

import android.content.Context;
import com.daaw.AM;
import com.daaw.C9632xb;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.daaw.nU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C6807nU {
    public static BZ0 h;
    public AbstractC6963o11 a;
    public final C9632xb b;
    public C1168Ii c;
    public C9632xb.b d;
    public final Context e;
    public final C4129dw f;
    public final AbstractC0960Gi g;

    public C6807nU(C9632xb c9632xb, Context context, C4129dw c4129dw, AbstractC0960Gi abstractC0960Gi) {
        this.b = c9632xb;
        this.e = context;
        this.f = c4129dw;
        this.g = abstractC0960Gi;
        k();
    }

    public static /* synthetic */ void a(C6807nU c6807nU, AbstractC5178hg0 abstractC5178hg0) {
        c6807nU.getClass();
        abstractC5178hg0.l();
        c6807nU.k();
    }

    public static /* synthetic */ void e(C6807nU c6807nU, AbstractC5178hg0 abstractC5178hg0) {
        c6807nU.getClass();
        AbstractC2212Sd0.a("GrpcCallProvider", "connectivityAttemptTimer elapsed. Resetting the channel.", new Object[0]);
        c6807nU.h();
        c6807nU.m(abstractC5178hg0);
    }

    public static /* synthetic */ AbstractC6963o11 f(C6807nU c6807nU, C6882nk0 c6882nk0, AbstractC6963o11 abstractC6963o11) {
        c6807nU.getClass();
        return A11.e(((AbstractC5178hg0) abstractC6963o11.k()).e(c6882nk0, c6807nU.c));
    }

    public static /* synthetic */ AbstractC5178hg0 g(final C6807nU c6807nU) {
        final AbstractC5178hg0 abstractC5178hg0J = c6807nU.j(c6807nU.e, c6807nU.f);
        c6807nU.b.i(new Runnable() { // from class: com.daaw.hU
            @Override // java.lang.Runnable
            public final void run() {
                this.B.l(abstractC5178hg0J);
            }
        });
        c6807nU.c = ((AM.b) ((AM.b) AM.c(abstractC5178hg0J).c(c6807nU.g)).d(c6807nU.b.j())).b();
        AbstractC2212Sd0.a("GrpcCallProvider", "Channel successfully reset.", new Object[0]);
        return abstractC5178hg0J;
    }

    public final void h() {
        if (this.d != null) {
            AbstractC2212Sd0.a("GrpcCallProvider", "Clearing the connectivityAttemptTimer", new Object[0]);
            this.d.c();
            this.d = null;
        }
    }

    public AbstractC6963o11 i(final C6882nk0 c6882nk0) {
        return this.a.i(this.b.j(), new InterfaceC1519Ls() { // from class: com.daaw.kU
            @Override // com.daaw.InterfaceC1519Ls
            public final Object a(AbstractC6963o11 abstractC6963o11) {
                return C6807nU.f(this.a, c6882nk0, abstractC6963o11);
            }
        });
    }

    public final AbstractC5178hg0 j(Context context, C4129dw c4129dw) {
        AbstractC5456ig0 abstractC5456ig0;
        try {
            AbstractC7847rB0.a(context);
        } catch (BT | CT | IllegalStateException e) {
            AbstractC2212Sd0.d("GrpcCallProvider", "Failed to update ssl context: %s", e);
        }
        BZ0 bz0 = h;
        if (bz0 != null) {
            abstractC5456ig0 = (AbstractC5456ig0) bz0.get();
        } else {
            AbstractC5456ig0 abstractC5456ig0B = AbstractC5456ig0.b(c4129dw.b());
            if (!c4129dw.d()) {
                abstractC5456ig0B.d();
            }
            abstractC5456ig0 = abstractC5456ig0B;
        }
        abstractC5456ig0.c(30L, TimeUnit.SECONDS);
        return C3893d5.k(abstractC5456ig0).i(context).a();
    }

    public final void k() {
        this.a = A11.c(EI.c, new Callable() { // from class: com.daaw.gU
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C6807nU.g(this.a);
            }
        });
    }

    public final void l(final AbstractC5178hg0 abstractC5178hg0) {
        EnumC1304Jq enumC1304JqJ = abstractC5178hg0.j(true);
        AbstractC2212Sd0.a("GrpcCallProvider", "Current gRPC connectivity state: " + enumC1304JqJ, new Object[0]);
        h();
        if (enumC1304JqJ == EnumC1304Jq.CONNECTING) {
            AbstractC2212Sd0.a("GrpcCallProvider", "Setting the connectivityAttemptTimer", new Object[0]);
            this.d = this.b.h(C9632xb.d.CONNECTIVITY_ATTEMPT_TIMER, 15000L, new Runnable() { // from class: com.daaw.iU
                @Override // java.lang.Runnable
                public final void run() {
                    C6807nU.e(this.B, abstractC5178hg0);
                }
            });
        }
        abstractC5178hg0.k(enumC1304JqJ, new Runnable() { // from class: com.daaw.jU
            @Override // java.lang.Runnable
            public final void run() {
                C6807nU c6807nU = this.B;
                c6807nU.b.i(new Runnable() { // from class: com.daaw.lU
                    @Override // java.lang.Runnable
                    public final void run() {
                        c6807nU.l(abstractC5178hg0);
                    }
                });
            }
        });
    }

    public final void m(final AbstractC5178hg0 abstractC5178hg0) {
        this.b.i(new Runnable() { // from class: com.daaw.mU
            @Override // java.lang.Runnable
            public final void run() {
                C6807nU.a(this.B, abstractC5178hg0);
            }
        });
    }
}
