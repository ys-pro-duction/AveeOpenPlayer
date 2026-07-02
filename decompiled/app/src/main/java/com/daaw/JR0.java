package com.daaw;

/* JADX INFO: loaded from: classes4.dex */
public abstract class JR0 {
    public static final YZ0 a = new YZ0("NO_VALUE");

    public static final InterfaceC7450pm0 a(int i, int i2, EnumC5182hh enumC5182hh) {
        if (i < 0) {
            throw new IllegalArgumentException(("replay cannot be negative, but was " + i).toString());
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(("extraBufferCapacity cannot be negative, but was " + i2).toString());
        }
        if (i > 0 || i2 > 0 || enumC5182hh == EnumC5182hh.SUSPEND) {
            int i3 = i2 + i;
            if (i3 < 0) {
                i3 = Integer.MAX_VALUE;
            }
            return new IR0(i, i3, enumC5182hh);
        }
        throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + enumC5182hh).toString());
    }

    public static /* synthetic */ InterfaceC7450pm0 b(int i, int i2, EnumC5182hh enumC5182hh, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            enumC5182hh = EnumC5182hh.SUSPEND;
        }
        return a(i, i2, enumC5182hh);
    }

    public static final InterfaceC7058oN e(HR0 hr0, InterfaceC4684ft interfaceC4684ft, int i, EnumC5182hh enumC5182hh) {
        return ((i == 0 || i == -3) && enumC5182hh == EnumC5182hh.SUSPEND) ? hr0 : new C5197hk(hr0, interfaceC4684ft, i, enumC5182hh);
    }

    public static final Object f(Object[] objArr, long j) {
        return objArr[(objArr.length - 1) & ((int) j)];
    }

    public static final void g(Object[] objArr, long j, Object obj) {
        objArr[(objArr.length - 1) & ((int) j)] = obj;
    }
}
