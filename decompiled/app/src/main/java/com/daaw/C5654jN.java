package com.daaw;

/* JADX INFO: renamed from: com.daaw.jN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5654jN extends AbstractC2887Yq {
    public C5654jN(float f) {
        super(Float.valueOf(f));
    }

    @Override // com.daaw.AbstractC2887Yq
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public YS0 a(InterfaceC2968Zk0 interfaceC2968Zk0) {
        G10.g(interfaceC2968Zk0, "module");
        YS0 ys0B = interfaceC2968Zk0.p().B();
        G10.f(ys0B, "getFloatType(...)");
        return ys0B;
    }

    @Override // com.daaw.AbstractC2887Yq
    public String toString() {
        return ((Number) b()).floatValue() + ".toFloat()";
    }
}
