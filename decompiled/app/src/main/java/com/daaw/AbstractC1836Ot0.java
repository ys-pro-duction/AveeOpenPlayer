package com.daaw;

import com.daaw.C1732Nt0;
import com.daaw.C5162hd;

/* JADX INFO: renamed from: com.daaw.Ot0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1836Ot0 {
    public static AbstractC1836Ot0 a = a().a();

    /* JADX INFO: renamed from: com.daaw.Ot0$a */
    public static abstract class a {
        public abstract AbstractC1836Ot0 a();

        public abstract a b(String str);

        public abstract a c(long j);

        public abstract a d(String str);

        public abstract a e(String str);

        public abstract a f(String str);

        public abstract a g(C1732Nt0.a aVar);

        public abstract a h(long j);
    }

    public static a a() {
        return new C5162hd.b().h(0L).g(C1732Nt0.a.ATTEMPT_MIGRATION).c(0L);
    }

    public abstract String b();

    public abstract long c();

    public abstract String d();

    public abstract String e();

    public abstract String f();

    public abstract C1732Nt0.a g();

    public abstract long h();

    public boolean i() {
        return g() == C1732Nt0.a.REGISTER_ERROR;
    }

    public boolean j() {
        return g() == C1732Nt0.a.NOT_GENERATED || g() == C1732Nt0.a.ATTEMPT_MIGRATION;
    }

    public boolean k() {
        return g() == C1732Nt0.a.REGISTERED;
    }

    public boolean l() {
        return g() == C1732Nt0.a.UNREGISTERED;
    }

    public boolean m() {
        return g() == C1732Nt0.a.ATTEMPT_MIGRATION;
    }

    public abstract a n();

    public AbstractC1836Ot0 o(String str, long j, long j2) {
        return n().b(str).c(j).h(j2).a();
    }

    public AbstractC1836Ot0 p() {
        return n().b(null).a();
    }

    public AbstractC1836Ot0 q(String str) {
        return n().e(str).g(C1732Nt0.a.REGISTER_ERROR).a();
    }

    public AbstractC1836Ot0 r() {
        return n().g(C1732Nt0.a.NOT_GENERATED).a();
    }

    public AbstractC1836Ot0 s(String str, String str2, long j, String str3, long j2) {
        return n().d(str).g(C1732Nt0.a.REGISTERED).b(str3).f(str2).c(j2).h(j).a();
    }

    public AbstractC1836Ot0 t(String str) {
        return n().d(str).g(C1732Nt0.a.UNREGISTERED).a();
    }
}
