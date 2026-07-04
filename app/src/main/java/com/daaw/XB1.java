package com.daaw;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class XB1 extends AbstractC5601jA1 {
    public XB1() {
        this.a.add(IJ1.APPLY);
        this.a.add(IJ1.BLOCK);
        this.a.add(IJ1.BREAK);
        this.a.add(IJ1.CASE);
        this.a.add(IJ1.DEFAULT);
        this.a.add(IJ1.CONTINUE);
        this.a.add(IJ1.DEFINE_FUNCTION);
        this.a.add(IJ1.FN);
        this.a.add(IJ1.IF);
        this.a.add(IJ1.QUOTE);
        this.a.add(IJ1.RETURN);
        this.a.add(IJ1.SWITCH);
        this.a.add(IJ1.TERNARY);
    }

    public static InterfaceC1637Mv1 c(ES2 es2, List list) {
        AbstractC7831r73.i(IJ1.FN.name(), 2, list);
        InterfaceC1637Mv1 interfaceC1637Mv1B = es2.b((InterfaceC1637Mv1) list.get(0));
        InterfaceC1637Mv1 interfaceC1637Mv1B2 = es2.b((InterfaceC1637Mv1) list.get(1));
        if (!(interfaceC1637Mv1B2 instanceof C6350lp1)) {
            throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", interfaceC1637Mv1B2.getClass().getCanonicalName()));
        }
        List listD = ((C6350lp1) interfaceC1637Mv1B2).D();
        List arrayList = new ArrayList();
        if (list.size() > 2) {
            arrayList = list.subList(2, list.size());
        }
        return new C5253hv1(interfaceC1637Mv1B.zzi(), listD, arrayList, es2);
    }

    @Override // com.daaw.AbstractC5601jA1
    public final InterfaceC1637Mv1 a(String str, ES2 es2, List list) {
        IJ1 ij1 = IJ1.ADD;
        int iOrdinal = AbstractC7831r73.e(str).ordinal();
        if (iOrdinal == 2) {
            AbstractC7831r73.h(IJ1.APPLY.name(), 3, list);
            InterfaceC1637Mv1 interfaceC1637Mv1B = es2.b((InterfaceC1637Mv1) list.get(0));
            String strZzi = es2.b((InterfaceC1637Mv1) list.get(1)).zzi();
            InterfaceC1637Mv1 interfaceC1637Mv1B2 = es2.b((InterfaceC1637Mv1) list.get(2));
            if (!(interfaceC1637Mv1B2 instanceof C6350lp1)) {
                throw new IllegalArgumentException(String.format("Function arguments for Apply are not a list found %s", interfaceC1637Mv1B2.getClass().getCanonicalName()));
            }
            if (strZzi.isEmpty()) {
                throw new IllegalArgumentException("Function name for apply is undefined");
            }
            return interfaceC1637Mv1B.m(strZzi, es2, ((C6350lp1) interfaceC1637Mv1B2).D());
        }
        if (iOrdinal == 15) {
            AbstractC7831r73.h(IJ1.BREAK.name(), 0, list);
            return InterfaceC1637Mv1.v;
        }
        if (iOrdinal == 25) {
            return c(es2, list);
        }
        if (iOrdinal == 41) {
            AbstractC7831r73.i(IJ1.IF.name(), 2, list);
            InterfaceC1637Mv1 interfaceC1637Mv1B3 = es2.b((InterfaceC1637Mv1) list.get(0));
            InterfaceC1637Mv1 interfaceC1637Mv1B4 = es2.b((InterfaceC1637Mv1) list.get(1));
            InterfaceC1637Mv1 interfaceC1637Mv1B5 = list.size() > 2 ? es2.b((InterfaceC1637Mv1) list.get(2)) : null;
            InterfaceC1637Mv1 interfaceC1637Mv1 = InterfaceC1637Mv1.t;
            InterfaceC1637Mv1 interfaceC1637Mv1C = interfaceC1637Mv1B3.zzg().booleanValue() ? es2.c((C6350lp1) interfaceC1637Mv1B4) : interfaceC1637Mv1B5 != null ? es2.c((C6350lp1) interfaceC1637Mv1B5) : interfaceC1637Mv1;
            return interfaceC1637Mv1C instanceof C5229hq1 ? interfaceC1637Mv1C : interfaceC1637Mv1;
        }
        if (iOrdinal == 54) {
            return new C6350lp1(list);
        }
        if (iOrdinal == 57) {
            if (list.isEmpty()) {
                return InterfaceC1637Mv1.x;
            }
            AbstractC7831r73.h(IJ1.RETURN.name(), 1, list);
            return new C5229hq1("return", es2.b((InterfaceC1637Mv1) list.get(0)));
        }
        if (iOrdinal != 19) {
            if (iOrdinal == 20) {
                AbstractC7831r73.i(IJ1.DEFINE_FUNCTION.name(), 2, list);
                InterfaceC1637Mv1 interfaceC1637Mv1C2 = c(es2, list);
                AbstractC9435wr1 abstractC9435wr1 = (AbstractC9435wr1) interfaceC1637Mv1C2;
                if (abstractC9435wr1.b() == null) {
                    es2.g("", interfaceC1637Mv1C2);
                    return interfaceC1637Mv1C2;
                }
                es2.g(abstractC9435wr1.b(), interfaceC1637Mv1C2);
                return interfaceC1637Mv1C2;
            }
            if (iOrdinal == 60) {
                AbstractC7831r73.h(IJ1.SWITCH.name(), 3, list);
                InterfaceC1637Mv1 interfaceC1637Mv1B6 = es2.b((InterfaceC1637Mv1) list.get(0));
                InterfaceC1637Mv1 interfaceC1637Mv1B7 = es2.b((InterfaceC1637Mv1) list.get(1));
                InterfaceC1637Mv1 interfaceC1637Mv1B8 = es2.b((InterfaceC1637Mv1) list.get(2));
                if (!(interfaceC1637Mv1B7 instanceof C6350lp1)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
                }
                if (!(interfaceC1637Mv1B8 instanceof C6350lp1)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                }
                C6350lp1 c6350lp1 = (C6350lp1) interfaceC1637Mv1B7;
                C6350lp1 c6350lp12 = (C6350lp1) interfaceC1637Mv1B8;
                boolean z = false;
                for (int i = 0; i < c6350lp1.s(); i++) {
                    if (z || interfaceC1637Mv1B6.equals(es2.b(c6350lp1.v(i)))) {
                        InterfaceC1637Mv1 interfaceC1637Mv1B9 = es2.b(c6350lp12.v(i));
                        if (interfaceC1637Mv1B9 instanceof C5229hq1) {
                            return ((C5229hq1) interfaceC1637Mv1B9).b().equals("break") ? InterfaceC1637Mv1.t : interfaceC1637Mv1B9;
                        }
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (c6350lp1.s() + 1 == c6350lp12.s()) {
                    InterfaceC1637Mv1 interfaceC1637Mv1B10 = es2.b(c6350lp12.v(c6350lp1.s()));
                    if (interfaceC1637Mv1B10 instanceof C5229hq1) {
                        String strB = ((C5229hq1) interfaceC1637Mv1B10).b();
                        if (strB.equals("return") || strB.equals("continue")) {
                            return interfaceC1637Mv1B10;
                        }
                    }
                }
                return InterfaceC1637Mv1.t;
            }
            if (iOrdinal == 61) {
                AbstractC7831r73.h(IJ1.TERNARY.name(), 3, list);
                return es2.b((InterfaceC1637Mv1) list.get(0)).zzg().booleanValue() ? es2.b((InterfaceC1637Mv1) list.get(1)) : es2.b((InterfaceC1637Mv1) list.get(2));
            }
            switch (iOrdinal) {
                case 11:
                    return es2.a().c(new C6350lp1(list));
                case 12:
                    AbstractC7831r73.h(IJ1.BREAK.name(), 0, list);
                    return InterfaceC1637Mv1.w;
                case 13:
                    break;
                default:
                    return super.b(str);
            }
        }
        if (list.isEmpty()) {
            return InterfaceC1637Mv1.t;
        }
        InterfaceC1637Mv1 interfaceC1637Mv1B11 = es2.b((InterfaceC1637Mv1) list.get(0));
        return interfaceC1637Mv1B11 instanceof C6350lp1 ? es2.c((C6350lp1) interfaceC1637Mv1B11) : InterfaceC1637Mv1.t;
    }
}
