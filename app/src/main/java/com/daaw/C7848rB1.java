package com.daaw;

import java.util.List;

/* JADX INFO: renamed from: com.daaw.rB1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7848rB1 extends AbstractC5601jA1 {
    public C7848rB1() {
        this.a.add(IJ1.EQUALS);
        this.a.add(IJ1.GREATER_THAN);
        this.a.add(IJ1.GREATER_THAN_EQUALS);
        this.a.add(IJ1.IDENTITY_EQUALS);
        this.a.add(IJ1.IDENTITY_NOT_EQUALS);
        this.a.add(IJ1.LESS_THAN);
        this.a.add(IJ1.LESS_THAN_EQUALS);
        this.a.add(IJ1.NOT_EQUALS);
    }

    public static boolean c(InterfaceC1637Mv1 interfaceC1637Mv1, InterfaceC1637Mv1 interfaceC1637Mv12) {
        if (interfaceC1637Mv1.getClass().equals(interfaceC1637Mv12.getClass())) {
            if ((interfaceC1637Mv1 instanceof C2401Ty1) || (interfaceC1637Mv1 instanceof C0377Au1)) {
                return true;
            }
            return interfaceC1637Mv1 instanceof C1825Oq1 ? (Double.isNaN(interfaceC1637Mv1.zzh().doubleValue()) || Double.isNaN(interfaceC1637Mv12.zzh().doubleValue()) || interfaceC1637Mv1.zzh().doubleValue() != interfaceC1637Mv12.zzh().doubleValue()) ? false : true : interfaceC1637Mv1 instanceof C6391ly1 ? interfaceC1637Mv1.zzi().equals(interfaceC1637Mv12.zzi()) : interfaceC1637Mv1 instanceof C1406Kp1 ? interfaceC1637Mv1.zzg().equals(interfaceC1637Mv12.zzg()) : interfaceC1637Mv1 == interfaceC1637Mv12;
        }
        if (((interfaceC1637Mv1 instanceof C2401Ty1) || (interfaceC1637Mv1 instanceof C0377Au1)) && ((interfaceC1637Mv12 instanceof C2401Ty1) || (interfaceC1637Mv12 instanceof C0377Au1))) {
            return true;
        }
        boolean z = interfaceC1637Mv1 instanceof C1825Oq1;
        if (z && (interfaceC1637Mv12 instanceof C6391ly1)) {
            return c(interfaceC1637Mv1, new C1825Oq1(interfaceC1637Mv12.zzh()));
        }
        boolean z2 = interfaceC1637Mv1 instanceof C6391ly1;
        if (z2 && (interfaceC1637Mv12 instanceof C1825Oq1)) {
            return c(new C1825Oq1(interfaceC1637Mv1.zzh()), interfaceC1637Mv12);
        }
        if (interfaceC1637Mv1 instanceof C1406Kp1) {
            return c(new C1825Oq1(interfaceC1637Mv1.zzh()), interfaceC1637Mv12);
        }
        if (interfaceC1637Mv12 instanceof C1406Kp1) {
            return c(interfaceC1637Mv1, new C1825Oq1(interfaceC1637Mv12.zzh()));
        }
        if ((z2 || z) && (interfaceC1637Mv12 instanceof InterfaceC7486pt1)) {
            return c(interfaceC1637Mv1, new C6391ly1(interfaceC1637Mv12.zzi()));
        }
        if ((interfaceC1637Mv1 instanceof InterfaceC7486pt1) && ((interfaceC1637Mv12 instanceof C6391ly1) || (interfaceC1637Mv12 instanceof C1825Oq1))) {
            return c(new C6391ly1(interfaceC1637Mv1.zzi()), interfaceC1637Mv12);
        }
        return false;
    }

    public static boolean d(InterfaceC1637Mv1 interfaceC1637Mv1, InterfaceC1637Mv1 interfaceC1637Mv12) {
        if (interfaceC1637Mv1 instanceof InterfaceC7486pt1) {
            interfaceC1637Mv1 = new C6391ly1(interfaceC1637Mv1.zzi());
        }
        if (interfaceC1637Mv12 instanceof InterfaceC7486pt1) {
            interfaceC1637Mv12 = new C6391ly1(interfaceC1637Mv12.zzi());
        }
        if ((interfaceC1637Mv1 instanceof C6391ly1) && (interfaceC1637Mv12 instanceof C6391ly1)) {
            return interfaceC1637Mv1.zzi().compareTo(interfaceC1637Mv12.zzi()) < 0;
        }
        double dDoubleValue = interfaceC1637Mv1.zzh().doubleValue();
        double dDoubleValue2 = interfaceC1637Mv12.zzh().doubleValue();
        return (Double.isNaN(dDoubleValue) || Double.isNaN(dDoubleValue2) || (dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || ((dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || Double.compare(dDoubleValue, dDoubleValue2) >= 0)) ? false : true;
    }

    public static boolean e(InterfaceC1637Mv1 interfaceC1637Mv1, InterfaceC1637Mv1 interfaceC1637Mv12) {
        if (interfaceC1637Mv1 instanceof InterfaceC7486pt1) {
            interfaceC1637Mv1 = new C6391ly1(interfaceC1637Mv1.zzi());
        }
        if (interfaceC1637Mv12 instanceof InterfaceC7486pt1) {
            interfaceC1637Mv12 = new C6391ly1(interfaceC1637Mv12.zzi());
        }
        return (((interfaceC1637Mv1 instanceof C6391ly1) && (interfaceC1637Mv12 instanceof C6391ly1)) || !(Double.isNaN(interfaceC1637Mv1.zzh().doubleValue()) || Double.isNaN(interfaceC1637Mv12.zzh().doubleValue()))) && !d(interfaceC1637Mv12, interfaceC1637Mv1);
    }

    @Override // com.daaw.AbstractC5601jA1
    public final InterfaceC1637Mv1 a(String str, ES2 es2, List list) {
        boolean zC;
        boolean zC2;
        AbstractC7831r73.h(AbstractC7831r73.e(str).name(), 2, list);
        InterfaceC1637Mv1 interfaceC1637Mv1B = es2.b((InterfaceC1637Mv1) list.get(0));
        InterfaceC1637Mv1 interfaceC1637Mv1B2 = es2.b((InterfaceC1637Mv1) list.get(1));
        int iOrdinal = AbstractC7831r73.e(str).ordinal();
        if (iOrdinal != 23) {
            if (iOrdinal == 48) {
                zC2 = c(interfaceC1637Mv1B, interfaceC1637Mv1B2);
            } else if (iOrdinal == 42) {
                zC = d(interfaceC1637Mv1B, interfaceC1637Mv1B2);
            } else if (iOrdinal != 43) {
                switch (iOrdinal) {
                    case 37:
                        zC = d(interfaceC1637Mv1B2, interfaceC1637Mv1B);
                        break;
                    case 38:
                        zC = e(interfaceC1637Mv1B2, interfaceC1637Mv1B);
                        break;
                    case 39:
                        zC = AbstractC7831r73.l(interfaceC1637Mv1B, interfaceC1637Mv1B2);
                        break;
                    case 40:
                        zC2 = AbstractC7831r73.l(interfaceC1637Mv1B, interfaceC1637Mv1B2);
                        break;
                    default:
                        return super.b(str);
                }
            } else {
                zC = e(interfaceC1637Mv1B, interfaceC1637Mv1B2);
            }
            zC = !zC2;
        } else {
            zC = c(interfaceC1637Mv1B, interfaceC1637Mv1B2);
        }
        return zC ? InterfaceC1637Mv1.y : InterfaceC1637Mv1.z;
    }
}
