package com.daaw;

/* JADX INFO: renamed from: com.daaw.dZ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4019dZ0 extends IR0 implements InterfaceC6537mW0 {
    public C4019dZ0(int i) {
        super(1, Integer.MAX_VALUE, EnumC5182hh.DROP_OLDEST);
        j(Integer.valueOf(i));
    }

    @Override // com.daaw.InterfaceC6537mW0
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public Integer getValue() {
        Integer numValueOf;
        synchronized (this) {
            numValueOf = Integer.valueOf(((Number) N()).intValue());
        }
        return numValueOf;
    }

    public final boolean b0(int i) {
        boolean zJ;
        synchronized (this) {
            zJ = j(Integer.valueOf(((Number) N()).intValue() + i));
        }
        return zJ;
    }
}
