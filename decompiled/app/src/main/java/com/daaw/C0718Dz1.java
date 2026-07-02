package com.daaw;

import java.util.List;

/* JADX INFO: renamed from: com.daaw.Dz1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0718Dz1 extends AbstractC5601jA1 {
    public C0718Dz1() {
        this.a.add(IJ1.BITWISE_AND);
        this.a.add(IJ1.BITWISE_LEFT_SHIFT);
        this.a.add(IJ1.BITWISE_NOT);
        this.a.add(IJ1.BITWISE_OR);
        this.a.add(IJ1.BITWISE_RIGHT_SHIFT);
        this.a.add(IJ1.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.a.add(IJ1.BITWISE_XOR);
    }

    @Override // com.daaw.AbstractC5601jA1
    public final InterfaceC1637Mv1 a(String str, ES2 es2, List list) {
        IJ1 ij1 = IJ1.ADD;
        switch (AbstractC7831r73.e(str).ordinal()) {
            case 4:
                AbstractC7831r73.h(IJ1.BITWISE_AND.name(), 2, list);
                return new C1825Oq1(Double.valueOf(AbstractC7831r73.b(es2.b((InterfaceC1637Mv1) list.get(0)).zzh().doubleValue()) & AbstractC7831r73.b(es2.b((InterfaceC1637Mv1) list.get(1)).zzh().doubleValue())));
            case 5:
                AbstractC7831r73.h(IJ1.BITWISE_LEFT_SHIFT.name(), 2, list);
                return new C1825Oq1(Double.valueOf(AbstractC7831r73.b(es2.b((InterfaceC1637Mv1) list.get(0)).zzh().doubleValue()) << ((int) (AbstractC7831r73.d(es2.b((InterfaceC1637Mv1) list.get(1)).zzh().doubleValue()) & 31))));
            case 6:
                AbstractC7831r73.h(IJ1.BITWISE_NOT.name(), 1, list);
                return new C1825Oq1(Double.valueOf(~AbstractC7831r73.b(es2.b((InterfaceC1637Mv1) list.get(0)).zzh().doubleValue())));
            case 7:
                AbstractC7831r73.h(IJ1.BITWISE_OR.name(), 2, list);
                return new C1825Oq1(Double.valueOf(AbstractC7831r73.b(es2.b((InterfaceC1637Mv1) list.get(0)).zzh().doubleValue()) | AbstractC7831r73.b(es2.b((InterfaceC1637Mv1) list.get(1)).zzh().doubleValue())));
            case 8:
                AbstractC7831r73.h(IJ1.BITWISE_RIGHT_SHIFT.name(), 2, list);
                return new C1825Oq1(Double.valueOf(AbstractC7831r73.b(es2.b((InterfaceC1637Mv1) list.get(0)).zzh().doubleValue()) >> ((int) (AbstractC7831r73.d(es2.b((InterfaceC1637Mv1) list.get(1)).zzh().doubleValue()) & 31))));
            case 9:
                AbstractC7831r73.h(IJ1.BITWISE_UNSIGNED_RIGHT_SHIFT.name(), 2, list);
                return new C1825Oq1(Double.valueOf(AbstractC7831r73.d(es2.b((InterfaceC1637Mv1) list.get(0)).zzh().doubleValue()) >>> ((int) (AbstractC7831r73.d(es2.b((InterfaceC1637Mv1) list.get(1)).zzh().doubleValue()) & 31))));
            case 10:
                AbstractC7831r73.h(IJ1.BITWISE_XOR.name(), 2, list);
                return new C1825Oq1(Double.valueOf(AbstractC7831r73.b(es2.b((InterfaceC1637Mv1) list.get(0)).zzh().doubleValue()) ^ AbstractC7831r73.b(es2.b((InterfaceC1637Mv1) list.get(1)).zzh().doubleValue())));
            default:
                return super.b(str);
        }
    }
}
