package com.daaw;

/* JADX INFO: loaded from: classes4.dex */
public interface IR extends InterfaceC7058oN {

    public static final class a {
        public static /* synthetic */ InterfaceC7058oN a(IR ir, InterfaceC4684ft interfaceC4684ft, int i, EnumC5182hh enumC5182hh, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
            }
            if ((i2 & 1) != 0) {
                interfaceC4684ft = C5905kG.B;
            }
            if ((i2 & 2) != 0) {
                i = -3;
            }
            if ((i2 & 4) != 0) {
                enumC5182hh = EnumC5182hh.SUSPEND;
            }
            return ir.b(interfaceC4684ft, i, enumC5182hh);
        }
    }

    InterfaceC7058oN b(InterfaceC4684ft interfaceC4684ft, int i, EnumC5182hh enumC5182hh);
}
