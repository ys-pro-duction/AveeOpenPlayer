package com.daaw;

/* JADX INFO: renamed from: com.daaw.kk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6035kk {
    public static final InterfaceC3236ak a(int i, EnumC5182hh enumC5182hh, NQ nq) {
        if (i == -2) {
            return enumC5182hh == EnumC5182hh.SUSPEND ? new C6587mh(InterfaceC3236ak.c.a(), nq) : new C10265zq(1, enumC5182hh, nq);
        }
        if (i != -1) {
            return i != 0 ? i != Integer.MAX_VALUE ? enumC5182hh == EnumC5182hh.SUSPEND ? new C6587mh(i, nq) : new C10265zq(i, enumC5182hh, nq) : new C6587mh(Integer.MAX_VALUE, nq) : enumC5182hh == EnumC5182hh.SUSPEND ? new C6587mh(0, nq) : new C10265zq(1, enumC5182hh, nq);
        }
        if (enumC5182hh == EnumC5182hh.SUSPEND) {
            return new C10265zq(1, EnumC5182hh.DROP_OLDEST, nq);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
    }

    public static /* synthetic */ InterfaceC3236ak b(int i, EnumC5182hh enumC5182hh, NQ nq, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            enumC5182hh = EnumC5182hh.SUSPEND;
        }
        if ((i2 & 4) != 0) {
            nq = null;
        }
        return a(i, enumC5182hh, nq);
    }
}
