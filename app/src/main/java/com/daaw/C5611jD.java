package com.daaw;

/* JADX INFO: renamed from: com.daaw.jD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5611jD extends AbstractC2887Yq {
    public C5611jD(double d) {
        super(Double.valueOf(d));
    }

    @Override // com.daaw.AbstractC2887Yq
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public YS0 a(InterfaceC2968Zk0 interfaceC2968Zk0) {
        G10.g(interfaceC2968Zk0, "module");
        YS0 ys0Z = interfaceC2968Zk0.p().z();
        G10.f(ys0Z, "getDoubleType(...)");
        return ys0Z;
    }

    @Override // com.daaw.AbstractC2887Yq
    public String toString() {
        return ((Number) b()).doubleValue() + ".toDouble()";
    }
}
