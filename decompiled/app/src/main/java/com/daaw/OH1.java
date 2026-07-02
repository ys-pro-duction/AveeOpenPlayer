package com.daaw;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class OH1 extends AbstractC5601jA1 {
    public OH1() {
        this.a.add(IJ1.ADD);
        this.a.add(IJ1.DIVIDE);
        this.a.add(IJ1.MODULUS);
        this.a.add(IJ1.MULTIPLY);
        this.a.add(IJ1.NEGATE);
        this.a.add(IJ1.POST_DECREMENT);
        this.a.add(IJ1.POST_INCREMENT);
        this.a.add(IJ1.PRE_DECREMENT);
        this.a.add(IJ1.PRE_INCREMENT);
        this.a.add(IJ1.SUBTRACT);
    }

    @Override // com.daaw.AbstractC5601jA1
    public final InterfaceC1637Mv1 a(String str, ES2 es2, List list) {
        IJ1 ij1 = IJ1.ADD;
        int iOrdinal = AbstractC7831r73.e(str).ordinal();
        if (iOrdinal == 0) {
            AbstractC7831r73.h(IJ1.ADD.name(), 2, list);
            InterfaceC1637Mv1 interfaceC1637Mv1B = es2.b((InterfaceC1637Mv1) list.get(0));
            InterfaceC1637Mv1 interfaceC1637Mv1B2 = es2.b((InterfaceC1637Mv1) list.get(1));
            if (!(interfaceC1637Mv1B instanceof InterfaceC7486pt1) && !(interfaceC1637Mv1B instanceof C6391ly1) && !(interfaceC1637Mv1B2 instanceof InterfaceC7486pt1) && !(interfaceC1637Mv1B2 instanceof C6391ly1)) {
                return new C1825Oq1(Double.valueOf(interfaceC1637Mv1B.zzh().doubleValue() + interfaceC1637Mv1B2.zzh().doubleValue()));
            }
            return new C6391ly1(String.valueOf(interfaceC1637Mv1B.zzi()).concat(String.valueOf(interfaceC1637Mv1B2.zzi())));
        }
        if (iOrdinal == 21) {
            AbstractC7831r73.h(IJ1.DIVIDE.name(), 2, list);
            return new C1825Oq1(Double.valueOf(es2.b((InterfaceC1637Mv1) list.get(0)).zzh().doubleValue() / es2.b((InterfaceC1637Mv1) list.get(1)).zzh().doubleValue()));
        }
        if (iOrdinal == 59) {
            AbstractC7831r73.h(IJ1.SUBTRACT.name(), 2, list);
            return new C1825Oq1(Double.valueOf(es2.b((InterfaceC1637Mv1) list.get(0)).zzh().doubleValue() + new C1825Oq1(Double.valueOf(-es2.b((InterfaceC1637Mv1) list.get(1)).zzh().doubleValue())).zzh().doubleValue()));
        }
        if (iOrdinal == 52 || iOrdinal == 53) {
            AbstractC7831r73.h(str, 2, list);
            InterfaceC1637Mv1 interfaceC1637Mv1B3 = es2.b((InterfaceC1637Mv1) list.get(0));
            es2.b((InterfaceC1637Mv1) list.get(1));
            return interfaceC1637Mv1B3;
        }
        if (iOrdinal == 55 || iOrdinal == 56) {
            AbstractC7831r73.h(str, 1, list);
            return es2.b((InterfaceC1637Mv1) list.get(0));
        }
        switch (iOrdinal) {
            case 44:
                AbstractC7831r73.h(IJ1.MODULUS.name(), 2, list);
                return new C1825Oq1(Double.valueOf(es2.b((InterfaceC1637Mv1) list.get(0)).zzh().doubleValue() % es2.b((InterfaceC1637Mv1) list.get(1)).zzh().doubleValue()));
            case 45:
                AbstractC7831r73.h(IJ1.MULTIPLY.name(), 2, list);
                return new C1825Oq1(Double.valueOf(es2.b((InterfaceC1637Mv1) list.get(0)).zzh().doubleValue() * es2.b((InterfaceC1637Mv1) list.get(1)).zzh().doubleValue()));
            case 46:
                AbstractC7831r73.h(IJ1.NEGATE.name(), 1, list);
                return new C1825Oq1(Double.valueOf(-es2.b((InterfaceC1637Mv1) list.get(0)).zzh().doubleValue()));
            default:
                return super.b(str);
        }
    }
}
