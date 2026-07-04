package com.daaw;

/* JADX INFO: renamed from: com.daaw.pe0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C7410pe0 extends S00 {
    public C7410pe0(long j) {
        super(Long.valueOf(j));
    }

    @Override // com.daaw.AbstractC2887Yq
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public YS0 a(InterfaceC2968Zk0 interfaceC2968Zk0) {
        G10.g(interfaceC2968Zk0, "module");
        YS0 ys0F = interfaceC2968Zk0.p().F();
        G10.f(ys0F, "getLongType(...)");
        return ys0F;
    }

    @Override // com.daaw.AbstractC2887Yq
    public String toString() {
        return ((Number) b()).longValue() + ".toLong()";
    }
}
