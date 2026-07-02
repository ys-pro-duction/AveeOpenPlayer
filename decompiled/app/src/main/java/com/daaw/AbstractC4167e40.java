package com.daaw;

/* JADX INFO: renamed from: com.daaw.e40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4167e40 {
    public static final YZ0 a = new YZ0("COMPLETING_ALREADY");
    public static final YZ0 b = new YZ0("COMPLETING_WAITING_CHILDREN");
    public static final YZ0 c = new YZ0("COMPLETING_RETRY");
    public static final YZ0 d = new YZ0("TOO_LATE_TO_CANCEL");
    public static final YZ0 e = new YZ0("SEALED");
    public static final C4220eG f = new C4220eG(false);
    public static final C4220eG g = new C4220eG(true);

    public static final Object g(Object obj) {
        return obj instanceof InterfaceC5143hZ ? new C5422iZ((InterfaceC5143hZ) obj) : obj;
    }

    public static final Object h(Object obj) {
        InterfaceC5143hZ interfaceC5143hZ;
        C5422iZ c5422iZ = obj instanceof C5422iZ ? (C5422iZ) obj : null;
        return (c5422iZ == null || (interfaceC5143hZ = c5422iZ.a) == null) ? obj : interfaceC5143hZ;
    }
}
