package com.daaw;

import java.util.List;

/* JADX INFO: renamed from: com.daaw.mE1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6466mE1 extends AbstractC5601jA1 {
    public C6466mE1() {
        this.a.add(IJ1.AND);
        this.a.add(IJ1.NOT);
        this.a.add(IJ1.OR);
    }

    @Override // com.daaw.AbstractC5601jA1
    public final InterfaceC1637Mv1 a(String str, ES2 es2, List list) {
        IJ1 ij1 = IJ1.ADD;
        int iOrdinal = AbstractC7831r73.e(str).ordinal();
        if (iOrdinal == 1) {
            AbstractC7831r73.h(IJ1.AND.name(), 2, list);
            InterfaceC1637Mv1 interfaceC1637Mv1B = es2.b((InterfaceC1637Mv1) list.get(0));
            return !interfaceC1637Mv1B.zzg().booleanValue() ? interfaceC1637Mv1B : es2.b((InterfaceC1637Mv1) list.get(1));
        }
        if (iOrdinal == 47) {
            AbstractC7831r73.h(IJ1.NOT.name(), 1, list);
            return new C1406Kp1(Boolean.valueOf(!es2.b((InterfaceC1637Mv1) list.get(0)).zzg().booleanValue()));
        }
        if (iOrdinal != 50) {
            return super.b(str);
        }
        AbstractC7831r73.h(IJ1.OR.name(), 2, list);
        InterfaceC1637Mv1 interfaceC1637Mv1B2 = es2.b((InterfaceC1637Mv1) list.get(0));
        return interfaceC1637Mv1B2.zzg().booleanValue() ? interfaceC1637Mv1B2 : es2.b((InterfaceC1637Mv1) list.get(1));
    }
}
