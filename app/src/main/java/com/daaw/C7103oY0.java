package com.daaw;

/* JADX INFO: renamed from: com.daaw.oY0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C7103oY0 extends AbstractC2887Yq {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7103oY0(String str) {
        super(str);
        G10.g(str, "value");
    }

    @Override // com.daaw.AbstractC2887Yq
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public YS0 a(InterfaceC2968Zk0 interfaceC2968Zk0) {
        G10.g(interfaceC2968Zk0, "module");
        YS0 ys0W = interfaceC2968Zk0.p().W();
        G10.f(ys0W, "getStringType(...)");
        return ys0W;
    }

    @Override // com.daaw.AbstractC2887Yq
    public String toString() {
        return '\"' + ((String) b()) + '\"';
    }
}
