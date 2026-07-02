package com.daaw;

import com.google.android.gms.ads.AdError;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.aJ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3120aJ1 extends AbstractC5601jA1 {
    public C3120aJ1() {
        this.a.add(IJ1.ASSIGN);
        this.a.add(IJ1.CONST);
        this.a.add(IJ1.CREATE_ARRAY);
        this.a.add(IJ1.CREATE_OBJECT);
        this.a.add(IJ1.EXPRESSION_LIST);
        this.a.add(IJ1.GET);
        this.a.add(IJ1.GET_INDEX);
        this.a.add(IJ1.GET_PROPERTY);
        this.a.add(IJ1.NULL);
        this.a.add(IJ1.SET_PROPERTY);
        this.a.add(IJ1.TYPEOF);
        this.a.add(IJ1.UNDEFINED);
        this.a.add(IJ1.VAR);
    }

    @Override // com.daaw.AbstractC5601jA1
    public final InterfaceC1637Mv1 a(String str, ES2 es2, List list) {
        String str2;
        int i = 0;
        IJ1 ij1 = IJ1.ADD;
        int iOrdinal = AbstractC7831r73.e(str).ordinal();
        if (iOrdinal == 3) {
            AbstractC7831r73.h(IJ1.ASSIGN.name(), 2, list);
            InterfaceC1637Mv1 interfaceC1637Mv1B = es2.b((InterfaceC1637Mv1) list.get(0));
            if (!(interfaceC1637Mv1B instanceof C6391ly1)) {
                throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", interfaceC1637Mv1B.getClass().getCanonicalName()));
            }
            if (!es2.h(interfaceC1637Mv1B.zzi())) {
                throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", interfaceC1637Mv1B.zzi()));
            }
            InterfaceC1637Mv1 interfaceC1637Mv1B2 = es2.b((InterfaceC1637Mv1) list.get(1));
            es2.g(interfaceC1637Mv1B.zzi(), interfaceC1637Mv1B2);
            return interfaceC1637Mv1B2;
        }
        if (iOrdinal == 14) {
            AbstractC7831r73.i(IJ1.CONST.name(), 2, list);
            if (list.size() % 2 != 0) {
                throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", Integer.valueOf(list.size())));
            }
            for (int i2 = 0; i2 < list.size() - 1; i2 += 2) {
                InterfaceC1637Mv1 interfaceC1637Mv1B3 = es2.b((InterfaceC1637Mv1) list.get(i2));
                if (!(interfaceC1637Mv1B3 instanceof C6391ly1)) {
                    throw new IllegalArgumentException(String.format("Expected string for const name. got %s", interfaceC1637Mv1B3.getClass().getCanonicalName()));
                }
                es2.f(interfaceC1637Mv1B3.zzi(), es2.b((InterfaceC1637Mv1) list.get(i2 + 1)));
            }
            return InterfaceC1637Mv1.t;
        }
        if (iOrdinal == 24) {
            AbstractC7831r73.i(IJ1.EXPRESSION_LIST.name(), 1, list);
            InterfaceC1637Mv1 interfaceC1637Mv1B4 = InterfaceC1637Mv1.t;
            while (i < list.size()) {
                interfaceC1637Mv1B4 = es2.b((InterfaceC1637Mv1) list.get(i));
                if (interfaceC1637Mv1B4 instanceof C5229hq1) {
                    throw new IllegalStateException("ControlValue cannot be in an expression list");
                }
                i++;
            }
            return interfaceC1637Mv1B4;
        }
        if (iOrdinal == 33) {
            AbstractC7831r73.h(IJ1.GET.name(), 1, list);
            InterfaceC1637Mv1 interfaceC1637Mv1B5 = es2.b((InterfaceC1637Mv1) list.get(0));
            if (interfaceC1637Mv1B5 instanceof C6391ly1) {
                return es2.d(interfaceC1637Mv1B5.zzi());
            }
            throw new IllegalArgumentException(String.format("Expected string for get var. got %s", interfaceC1637Mv1B5.getClass().getCanonicalName()));
        }
        if (iOrdinal == 49) {
            AbstractC7831r73.h(IJ1.NULL.name(), 0, list);
            return InterfaceC1637Mv1.u;
        }
        if (iOrdinal == 58) {
            AbstractC7831r73.h(IJ1.SET_PROPERTY.name(), 3, list);
            InterfaceC1637Mv1 interfaceC1637Mv1B6 = es2.b((InterfaceC1637Mv1) list.get(0));
            InterfaceC1637Mv1 interfaceC1637Mv1B7 = es2.b((InterfaceC1637Mv1) list.get(1));
            InterfaceC1637Mv1 interfaceC1637Mv1B8 = es2.b((InterfaceC1637Mv1) list.get(2));
            if (interfaceC1637Mv1B6 == InterfaceC1637Mv1.t || interfaceC1637Mv1B6 == InterfaceC1637Mv1.u) {
                throw new IllegalStateException(String.format("Can't set property %s of %s", interfaceC1637Mv1B7.zzi(), interfaceC1637Mv1B6.zzi()));
            }
            if ((interfaceC1637Mv1B6 instanceof C6350lp1) && (interfaceC1637Mv1B7 instanceof C1825Oq1)) {
                ((C6350lp1) interfaceC1637Mv1B6).H(interfaceC1637Mv1B7.zzh().intValue(), interfaceC1637Mv1B8);
                return interfaceC1637Mv1B8;
            }
            if (interfaceC1637Mv1B6 instanceof InterfaceC7486pt1) {
                ((InterfaceC7486pt1) interfaceC1637Mv1B6).p(interfaceC1637Mv1B7.zzi(), interfaceC1637Mv1B8);
            }
            return interfaceC1637Mv1B8;
        }
        if (iOrdinal == 17) {
            if (list.isEmpty()) {
                return new C6350lp1();
            }
            C6350lp1 c6350lp1 = new C6350lp1();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                InterfaceC1637Mv1 interfaceC1637Mv1B9 = es2.b((InterfaceC1637Mv1) it.next());
                if (interfaceC1637Mv1B9 instanceof C5229hq1) {
                    throw new IllegalStateException("Failed to evaluate array element");
                }
                c6350lp1.H(i, interfaceC1637Mv1B9);
                i++;
            }
            return c6350lp1;
        }
        if (iOrdinal == 18) {
            if (list.isEmpty()) {
                return new C2693Wt1();
            }
            if (list.size() % 2 != 0) {
                throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", Integer.valueOf(list.size())));
            }
            C2693Wt1 c2693Wt1 = new C2693Wt1();
            while (i < list.size() - 1) {
                InterfaceC1637Mv1 interfaceC1637Mv1B10 = es2.b((InterfaceC1637Mv1) list.get(i));
                InterfaceC1637Mv1 interfaceC1637Mv1B11 = es2.b((InterfaceC1637Mv1) list.get(i + 1));
                if ((interfaceC1637Mv1B10 instanceof C5229hq1) || (interfaceC1637Mv1B11 instanceof C5229hq1)) {
                    throw new IllegalStateException("Failed to evaluate map entry");
                }
                c2693Wt1.p(interfaceC1637Mv1B10.zzi(), interfaceC1637Mv1B11);
                i += 2;
            }
            return c2693Wt1;
        }
        if (iOrdinal == 35 || iOrdinal == 36) {
            AbstractC7831r73.h(IJ1.GET_PROPERTY.name(), 2, list);
            InterfaceC1637Mv1 interfaceC1637Mv1B12 = es2.b((InterfaceC1637Mv1) list.get(0));
            InterfaceC1637Mv1 interfaceC1637Mv1B13 = es2.b((InterfaceC1637Mv1) list.get(1));
            if ((interfaceC1637Mv1B12 instanceof C6350lp1) && AbstractC7831r73.k(interfaceC1637Mv1B13)) {
                return ((C6350lp1) interfaceC1637Mv1B12).v(interfaceC1637Mv1B13.zzh().intValue());
            }
            if (interfaceC1637Mv1B12 instanceof InterfaceC7486pt1) {
                return ((InterfaceC7486pt1) interfaceC1637Mv1B12).e(interfaceC1637Mv1B13.zzi());
            }
            if (interfaceC1637Mv1B12 instanceof C6391ly1) {
                if ("length".equals(interfaceC1637Mv1B13.zzi())) {
                    return new C1825Oq1(Double.valueOf(interfaceC1637Mv1B12.zzi().length()));
                }
                if (AbstractC7831r73.k(interfaceC1637Mv1B13) && interfaceC1637Mv1B13.zzh().doubleValue() < interfaceC1637Mv1B12.zzi().length()) {
                    return new C6391ly1(String.valueOf(interfaceC1637Mv1B12.zzi().charAt(interfaceC1637Mv1B13.zzh().intValue())));
                }
            }
            return InterfaceC1637Mv1.t;
        }
        switch (iOrdinal) {
            case 62:
                AbstractC7831r73.h(IJ1.TYPEOF.name(), 1, list);
                InterfaceC1637Mv1 interfaceC1637Mv1B14 = es2.b((InterfaceC1637Mv1) list.get(0));
                if (interfaceC1637Mv1B14 instanceof C2401Ty1) {
                    str2 = AdError.UNDEFINED_DOMAIN;
                } else if (interfaceC1637Mv1B14 instanceof C1406Kp1) {
                    str2 = "boolean";
                } else if (interfaceC1637Mv1B14 instanceof C1825Oq1) {
                    str2 = "number";
                } else if (interfaceC1637Mv1B14 instanceof C6391ly1) {
                    str2 = "string";
                } else if (interfaceC1637Mv1B14 instanceof C5253hv1) {
                    str2 = "function";
                } else {
                    if ((interfaceC1637Mv1B14 instanceof C8335sw1) || (interfaceC1637Mv1B14 instanceof C5229hq1)) {
                        throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", interfaceC1637Mv1B14));
                    }
                    str2 = "object";
                }
                return new C6391ly1(str2);
            case 63:
                AbstractC7831r73.h(IJ1.UNDEFINED.name(), 0, list);
                return InterfaceC1637Mv1.t;
            case 64:
                AbstractC7831r73.i(IJ1.VAR.name(), 1, list);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    InterfaceC1637Mv1 interfaceC1637Mv1B15 = es2.b((InterfaceC1637Mv1) it2.next());
                    if (!(interfaceC1637Mv1B15 instanceof C6391ly1)) {
                        throw new IllegalArgumentException(String.format("Expected string for var name. got %s", interfaceC1637Mv1B15.getClass().getCanonicalName()));
                    }
                    es2.e(interfaceC1637Mv1B15.zzi(), InterfaceC1637Mv1.t);
                }
                return InterfaceC1637Mv1.t;
            default:
                return super.b(str);
        }
    }
}
