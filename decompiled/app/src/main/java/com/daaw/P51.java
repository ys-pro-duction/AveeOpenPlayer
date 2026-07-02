package com.daaw;

import android.content.Context;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class P51 implements N51 {
    public static volatile Q51 e;
    public final InterfaceC6333lm a;
    public final InterfaceC6333lm b;
    public final InterfaceC8174sN0 c;
    public final C9350wa1 d;

    public P51(InterfaceC6333lm interfaceC6333lm, InterfaceC6333lm interfaceC6333lm2, InterfaceC8174sN0 interfaceC8174sN0, C9350wa1 c9350wa1, C9948yi1 c9948yi1) {
        this.a = interfaceC6333lm;
        this.b = interfaceC6333lm2;
        this.c = interfaceC8174sN0;
        this.d = c9350wa1;
        c9948yi1.c();
    }

    public static P51 c() {
        Q51 q51 = e;
        if (q51 != null) {
            return q51.c();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static Set d(EB eb) {
        return eb instanceof InterfaceC9547xG ? DesugarCollections.unmodifiableSet(((InterfaceC9547xG) eb).a()) : Collections.singleton(EG.b("proto"));
    }

    public static void f(Context context) {
        if (e == null) {
            synchronized (P51.class) {
                try {
                    if (e == null) {
                        e = C0700Dv.d().b(context).a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.daaw.N51
    public void a(IP0 ip0, S51 s51) {
        this.c.a(ip0.f().f(ip0.c().c()), b(ip0), s51);
    }

    public final KH b(IP0 ip0) {
        return KH.a().i(this.a.a()).k(this.b.a()).j(ip0.g()).h(new C10105zG(ip0.b(), ip0.d())).g(ip0.c().a()).d();
    }

    public C9350wa1 e() {
        return this.d;
    }

    public I51 g(EB eb) {
        return new J51(d(eb), H51.a().b(eb.getName()).c(eb.getExtras()).a(), this);
    }
}
