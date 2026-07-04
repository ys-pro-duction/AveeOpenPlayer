package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public class M91 extends K91 {
    @Override // com.daaw.K91
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public L91 g(Object obj) {
        return ((AbstractC5394iS) obj).unknownFields;
    }

    @Override // com.daaw.K91
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public int h(L91 l91) {
        return l91.d();
    }

    @Override // com.daaw.K91
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public int i(L91 l91) {
        return l91.e();
    }

    @Override // com.daaw.K91
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public L91 k(L91 l91, L91 l912) {
        return L91.c().equals(l912) ? l91 : L91.c().equals(l91) ? L91.j(l91, l912) : l91.i(l912);
    }

    @Override // com.daaw.K91
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public L91 n() {
        return L91.k();
    }

    @Override // com.daaw.K91
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void o(Object obj, L91 l91) {
        p(obj, l91);
    }

    @Override // com.daaw.K91
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void p(Object obj, L91 l91) {
        ((AbstractC5394iS) obj).unknownFields = l91;
    }

    @Override // com.daaw.K91
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public L91 r(L91 l91) {
        l91.h();
        return l91;
    }

    @Override // com.daaw.K91
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void s(L91 l91, InterfaceC9674xj1 interfaceC9674xj1) {
        l91.p(interfaceC9674xj1);
    }

    @Override // com.daaw.K91
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void t(L91 l91, InterfaceC9674xj1 interfaceC9674xj1) {
        l91.r(interfaceC9674xj1);
    }

    @Override // com.daaw.K91
    public void j(Object obj) {
        g(obj).h();
    }

    @Override // com.daaw.K91
    public boolean q(KE0 ke0) {
        return false;
    }

    @Override // com.daaw.K91
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void a(L91 l91, int i, int i2) {
        l91.n(AbstractC6027ki1.c(i, 5), Integer.valueOf(i2));
    }

    @Override // com.daaw.K91
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void b(L91 l91, int i, long j) {
        l91.n(AbstractC6027ki1.c(i, 1), Long.valueOf(j));
    }

    @Override // com.daaw.K91
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void c(L91 l91, int i, L91 l912) {
        l91.n(AbstractC6027ki1.c(i, 3), l912);
    }

    @Override // com.daaw.K91
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void d(L91 l91, int i, AbstractC4340ei abstractC4340ei) {
        l91.n(AbstractC6027ki1.c(i, 2), abstractC4340ei);
    }

    @Override // com.daaw.K91
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void e(L91 l91, int i, long j) {
        l91.n(AbstractC6027ki1.c(i, 0), Long.valueOf(j));
    }

    @Override // com.daaw.K91
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public L91 f(Object obj) {
        L91 l91G = g(obj);
        if (l91G != L91.c()) {
            return l91G;
        }
        L91 l91K = L91.k();
        p(obj, l91K);
        return l91K;
    }
}
