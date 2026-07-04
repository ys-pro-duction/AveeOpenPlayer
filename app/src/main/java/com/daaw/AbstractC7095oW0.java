package com.daaw;

/* JADX INFO: renamed from: com.daaw.oW0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC7095oW0 {
    public static final YZ0 a = new YZ0("NONE");
    public static final YZ0 b = new YZ0("PENDING");

    public static final InterfaceC8286sm0 a(Object obj) {
        if (obj == null) {
            obj = AbstractC2360To0.a;
        }
        return new C6816nW0(obj);
    }

    public static final InterfaceC7058oN d(InterfaceC6537mW0 interfaceC6537mW0, InterfaceC4684ft interfaceC4684ft, int i, EnumC5182hh enumC5182hh) {
        return (((i < 0 || i >= 2) && i != -2) || enumC5182hh != EnumC5182hh.DROP_OLDEST) ? JR0.e(interfaceC6537mW0, interfaceC4684ft, i, enumC5182hh) : interfaceC6537mW0;
    }
}
