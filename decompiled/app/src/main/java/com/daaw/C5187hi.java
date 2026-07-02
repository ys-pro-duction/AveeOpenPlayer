package com.daaw;

/* JADX INFO: renamed from: com.daaw.hi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5187hi extends S00 {
    public C5187hi(byte b) {
        super(Byte.valueOf(b));
    }

    @Override // com.daaw.AbstractC2887Yq
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public YS0 a(InterfaceC2968Zk0 interfaceC2968Zk0) {
        G10.g(interfaceC2968Zk0, "module");
        YS0 ys0T = interfaceC2968Zk0.p().t();
        G10.f(ys0T, "getByteType(...)");
        return ys0T;
    }

    @Override // com.daaw.AbstractC2887Yq
    public String toString() {
        return ((Number) b()).intValue() + ".toByte()";
    }
}
