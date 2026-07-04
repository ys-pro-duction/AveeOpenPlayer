package com.daaw;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.iH1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5352iH1 extends AbstractC5601jA1 {
    public C5352iH1() {
        this.a.add(IJ1.FOR_IN);
        this.a.add(IJ1.FOR_IN_CONST);
        this.a.add(IJ1.FOR_IN_LET);
        this.a.add(IJ1.FOR_LET);
        this.a.add(IJ1.FOR_OF);
        this.a.add(IJ1.FOR_OF_CONST);
        this.a.add(IJ1.FOR_OF_LET);
        this.a.add(IJ1.WHILE);
    }

    public static InterfaceC1637Mv1 c(InterfaceC3387bG1 interfaceC3387bG1, Iterator it, InterfaceC1637Mv1 interfaceC1637Mv1) {
        if (it != null) {
            while (it.hasNext()) {
                InterfaceC1637Mv1 interfaceC1637Mv1C = interfaceC3387bG1.a((InterfaceC1637Mv1) it.next()).c((C6350lp1) interfaceC1637Mv1);
                if (interfaceC1637Mv1C instanceof C5229hq1) {
                    C5229hq1 c5229hq1 = (C5229hq1) interfaceC1637Mv1C;
                    if ("break".equals(c5229hq1.b())) {
                        return InterfaceC1637Mv1.t;
                    }
                    if ("return".equals(c5229hq1.b())) {
                        return c5229hq1;
                    }
                }
            }
        }
        return InterfaceC1637Mv1.t;
    }

    public static InterfaceC1637Mv1 d(InterfaceC3387bG1 interfaceC3387bG1, InterfaceC1637Mv1 interfaceC1637Mv1, InterfaceC1637Mv1 interfaceC1637Mv12) {
        return c(interfaceC3387bG1, interfaceC1637Mv1.zzl(), interfaceC1637Mv12);
    }

    public static InterfaceC1637Mv1 e(InterfaceC3387bG1 interfaceC3387bG1, InterfaceC1637Mv1 interfaceC1637Mv1, InterfaceC1637Mv1 interfaceC1637Mv12) {
        if (interfaceC1637Mv1 instanceof Iterable) {
            return c(interfaceC3387bG1, ((Iterable) interfaceC1637Mv1).iterator(), interfaceC1637Mv12);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    @Override // com.daaw.AbstractC5601jA1
    public final InterfaceC1637Mv1 a(String str, ES2 es2, List list) {
        IJ1 ij1 = IJ1.ADD;
        int iOrdinal = AbstractC7831r73.e(str).ordinal();
        if (iOrdinal == 65) {
            AbstractC7831r73.h(IJ1.WHILE.name(), 4, list);
            InterfaceC1637Mv1 interfaceC1637Mv1 = (InterfaceC1637Mv1) list.get(0);
            InterfaceC1637Mv1 interfaceC1637Mv12 = (InterfaceC1637Mv1) list.get(1);
            InterfaceC1637Mv1 interfaceC1637Mv13 = (InterfaceC1637Mv1) list.get(2);
            InterfaceC1637Mv1 interfaceC1637Mv1B = es2.b((InterfaceC1637Mv1) list.get(3));
            if (es2.b(interfaceC1637Mv13).zzg().booleanValue()) {
                InterfaceC1637Mv1 interfaceC1637Mv1C = es2.c((C6350lp1) interfaceC1637Mv1B);
                if (interfaceC1637Mv1C instanceof C5229hq1) {
                    C5229hq1 c5229hq1 = (C5229hq1) interfaceC1637Mv1C;
                    if ("break".equals(c5229hq1.b())) {
                        return InterfaceC1637Mv1.t;
                    }
                    if ("return".equals(c5229hq1.b())) {
                        return c5229hq1;
                    }
                }
            }
            while (es2.b(interfaceC1637Mv1).zzg().booleanValue()) {
                InterfaceC1637Mv1 interfaceC1637Mv1C2 = es2.c((C6350lp1) interfaceC1637Mv1B);
                if (interfaceC1637Mv1C2 instanceof C5229hq1) {
                    C5229hq1 c5229hq12 = (C5229hq1) interfaceC1637Mv1C2;
                    if ("break".equals(c5229hq12.b())) {
                        return InterfaceC1637Mv1.t;
                    }
                    if ("return".equals(c5229hq12.b())) {
                        return c5229hq12;
                    }
                }
                es2.b(interfaceC1637Mv12);
            }
            return InterfaceC1637Mv1.t;
        }
        switch (iOrdinal) {
            case 26:
                AbstractC7831r73.h(IJ1.FOR_IN.name(), 3, list);
                if (!(list.get(0) instanceof C6391ly1)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                }
                String strZzi = ((InterfaceC1637Mv1) list.get(0)).zzi();
                return d(new EG1(es2, strZzi), es2.b((InterfaceC1637Mv1) list.get(1)), es2.b((InterfaceC1637Mv1) list.get(2)));
            case 27:
                AbstractC7831r73.h(IJ1.FOR_IN_CONST.name(), 3, list);
                if (!(list.get(0) instanceof C6391ly1)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                }
                String strZzi2 = ((InterfaceC1637Mv1) list.get(0)).zzi();
                return d(new RE1(es2, strZzi2), es2.b((InterfaceC1637Mv1) list.get(1)), es2.b((InterfaceC1637Mv1) list.get(2)));
            case 28:
                AbstractC7831r73.h(IJ1.FOR_IN_LET.name(), 3, list);
                if (!(list.get(0) instanceof C6391ly1)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                }
                String strZzi3 = ((InterfaceC1637Mv1) list.get(0)).zzi();
                return d(new C9266wF1(es2, strZzi3), es2.b((InterfaceC1637Mv1) list.get(1)), es2.b((InterfaceC1637Mv1) list.get(2)));
            case 29:
                AbstractC7831r73.h(IJ1.FOR_LET.name(), 4, list);
                InterfaceC1637Mv1 interfaceC1637Mv1B2 = es2.b((InterfaceC1637Mv1) list.get(0));
                if (!(interfaceC1637Mv1B2 instanceof C6350lp1)) {
                    throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                }
                C6350lp1 c6350lp1 = (C6350lp1) interfaceC1637Mv1B2;
                InterfaceC1637Mv1 interfaceC1637Mv14 = (InterfaceC1637Mv1) list.get(1);
                InterfaceC1637Mv1 interfaceC1637Mv15 = (InterfaceC1637Mv1) list.get(2);
                InterfaceC1637Mv1 interfaceC1637Mv1B3 = es2.b((InterfaceC1637Mv1) list.get(3));
                ES2 es2A = es2.a();
                for (int i = 0; i < c6350lp1.s(); i++) {
                    String strZzi4 = c6350lp1.v(i).zzi();
                    es2A.g(strZzi4, es2.d(strZzi4));
                }
                while (es2.b(interfaceC1637Mv14).zzg().booleanValue()) {
                    InterfaceC1637Mv1 interfaceC1637Mv1C3 = es2.c((C6350lp1) interfaceC1637Mv1B3);
                    if (interfaceC1637Mv1C3 instanceof C5229hq1) {
                        C5229hq1 c5229hq13 = (C5229hq1) interfaceC1637Mv1C3;
                        if ("break".equals(c5229hq13.b())) {
                            return InterfaceC1637Mv1.t;
                        }
                        if ("return".equals(c5229hq13.b())) {
                            return c5229hq13;
                        }
                    }
                    ES2 es2A2 = es2.a();
                    for (int i2 = 0; i2 < c6350lp1.s(); i2++) {
                        String strZzi5 = c6350lp1.v(i2).zzi();
                        es2A2.g(strZzi5, es2A.d(strZzi5));
                    }
                    es2A2.b(interfaceC1637Mv15);
                    es2A = es2A2;
                }
                return InterfaceC1637Mv1.t;
            case 30:
                AbstractC7831r73.h(IJ1.FOR_OF.name(), 3, list);
                if (!(list.get(0) instanceof C6391ly1)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                }
                String strZzi6 = ((InterfaceC1637Mv1) list.get(0)).zzi();
                return e(new EG1(es2, strZzi6), es2.b((InterfaceC1637Mv1) list.get(1)), es2.b((InterfaceC1637Mv1) list.get(2)));
            case 31:
                AbstractC7831r73.h(IJ1.FOR_OF_CONST.name(), 3, list);
                if (!(list.get(0) instanceof C6391ly1)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                }
                String strZzi7 = ((InterfaceC1637Mv1) list.get(0)).zzi();
                return e(new RE1(es2, strZzi7), es2.b((InterfaceC1637Mv1) list.get(1)), es2.b((InterfaceC1637Mv1) list.get(2)));
            case 32:
                AbstractC7831r73.h(IJ1.FOR_OF_LET.name(), 3, list);
                if (!(list.get(0) instanceof C6391ly1)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                }
                String strZzi8 = ((InterfaceC1637Mv1) list.get(0)).zzi();
                return e(new C9266wF1(es2, strZzi8), es2.b((InterfaceC1637Mv1) list.get(1)), es2.b((InterfaceC1637Mv1) list.get(2)));
            default:
                return super.b(str);
        }
    }
}
