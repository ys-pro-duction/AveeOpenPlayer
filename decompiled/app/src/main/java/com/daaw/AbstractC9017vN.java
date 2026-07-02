package com.daaw;

import com.daaw.IR;

/* JADX INFO: renamed from: com.daaw.vN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC9017vN {
    public static final InterfaceC7058oN a(InterfaceC7058oN interfaceC7058oN, int i, EnumC5182hh enumC5182hh) {
        int i2;
        if (i < 0 && i != -2 && i != -1) {
            throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i).toString());
        }
        if (i == -1 && enumC5182hh != EnumC5182hh.SUSPEND) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i == -1) {
            enumC5182hh = EnumC5182hh.DROP_OLDEST;
            i2 = 0;
        } else {
            i2 = i;
        }
        EnumC5182hh enumC5182hh2 = enumC5182hh;
        return interfaceC7058oN instanceof IR ? IR.a.a((IR) interfaceC7058oN, null, i2, enumC5182hh2, 1, null) : new C5197hk(interfaceC7058oN, null, i2, enumC5182hh2, 2, null);
    }

    public static /* synthetic */ InterfaceC7058oN b(InterfaceC7058oN interfaceC7058oN, int i, EnumC5182hh enumC5182hh, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -2;
        }
        if ((i2 & 2) != 0) {
            enumC5182hh = EnumC5182hh.SUSPEND;
        }
        return AbstractC7894rN.a(interfaceC7058oN, i, enumC5182hh);
    }
}
