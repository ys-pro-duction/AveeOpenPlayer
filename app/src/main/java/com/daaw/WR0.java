package com.daaw;

/* JADX INFO: loaded from: classes4.dex */
public final class WR0 extends S00 {
    public WR0(short s) {
        super(Short.valueOf(s));
    }

    @Override // com.daaw.AbstractC2887Yq
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public YS0 a(InterfaceC2968Zk0 interfaceC2968Zk0) {
        G10.g(interfaceC2968Zk0, "module");
        YS0 ys0T = interfaceC2968Zk0.p().T();
        G10.f(ys0T, "getShortType(...)");
        return ys0T;
    }

    @Override // com.daaw.AbstractC2887Yq
    public String toString() {
        return ((Number) b()).intValue() + ".toShort()";
    }
}
