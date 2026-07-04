package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class LB1 extends AbstractC4449f43 implements V43 {
    private static final LB1 zzb;
    private InterfaceC8095s43 zzd = AbstractC4449f43.x();

    static {
        LB1 lb1 = new LB1();
        zzb = lb1;
        AbstractC4449f43.D(LB1.class, lb1);
    }

    public static FB1 M() {
        return (FB1) zzb.j();
    }

    public static /* synthetic */ void O(LB1 lb1, EB1 eb1) {
        eb1.getClass();
        InterfaceC8095s43 interfaceC8095s43 = lb1.zzd;
        if (!interfaceC8095s43.zzc()) {
            lb1.zzd = AbstractC4449f43.y(interfaceC8095s43);
        }
        lb1.zzd.add(eb1);
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", EB1.class});
        }
        if (i2 == 3) {
            return new LB1();
        }
        AbstractC9529xB1 abstractC9529xB1 = null;
        if (i2 == 4) {
            return new FB1(abstractC9529xB1);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
