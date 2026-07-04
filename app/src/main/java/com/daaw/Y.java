package com.daaw;

import com.daaw.C9510x71;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class Y {
    public static final Y a = new Y();

    public final boolean a(C9510x71 c9510x71, InterfaceC3159aT0 interfaceC3159aT0, C9510x71.c cVar) {
        G10.g(c9510x71, "<this>");
        G10.g(interfaceC3159aT0, "type");
        G10.g(cVar, "supertypesPolicy");
        InterfaceC9515x81 interfaceC9515x81J = c9510x71.j();
        if ((interfaceC9515x81J.v(interfaceC3159aT0) && !interfaceC9515x81J.u(interfaceC3159aT0)) || interfaceC9515x81J.h(interfaceC3159aT0)) {
            return true;
        }
        c9510x71.k();
        ArrayDeque arrayDequeH = c9510x71.h();
        G10.d(arrayDequeH);
        Set setI = c9510x71.i();
        G10.d(setI);
        arrayDequeH.push(interfaceC3159aT0);
        while (!arrayDequeH.isEmpty()) {
            if (setI.size() > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + interfaceC3159aT0 + ". Supertypes = " + AbstractC2455Um.n0(setI, null, null, null, 0, null, null, 63, null)).toString());
            }
            InterfaceC3159aT0 interfaceC3159aT02 = (InterfaceC3159aT0) arrayDequeH.pop();
            G10.d(interfaceC3159aT02);
            if (setI.add(interfaceC3159aT02)) {
                C9510x71.c cVar2 = interfaceC9515x81J.u(interfaceC3159aT02) ? C9510x71.c.C0252c.a : cVar;
                if (G10.c(cVar2, C9510x71.c.C0252c.a)) {
                    cVar2 = null;
                }
                if (cVar2 == null) {
                    continue;
                } else {
                    InterfaceC9515x81 interfaceC9515x81J2 = c9510x71.j();
                    Iterator it = interfaceC9515x81J2.i(interfaceC9515x81J2.f(interfaceC3159aT02)).iterator();
                    while (it.hasNext()) {
                        InterfaceC3159aT0 interfaceC3159aT0A = cVar2.a(c9510x71, (O80) it.next());
                        if ((interfaceC9515x81J.v(interfaceC3159aT0A) && !interfaceC9515x81J.u(interfaceC3159aT0A)) || interfaceC9515x81J.h(interfaceC3159aT0A)) {
                            c9510x71.e();
                            return true;
                        }
                        arrayDequeH.add(interfaceC3159aT0A);
                    }
                }
            }
        }
        c9510x71.e();
        return false;
    }

    public final boolean b(C9510x71 c9510x71, InterfaceC3159aT0 interfaceC3159aT0, D71 d71) {
        G10.g(c9510x71, "state");
        G10.g(interfaceC3159aT0, "start");
        G10.g(d71, "end");
        InterfaceC9515x81 interfaceC9515x81J = c9510x71.j();
        if (a.c(c9510x71, interfaceC3159aT0, d71)) {
            return true;
        }
        c9510x71.k();
        ArrayDeque arrayDequeH = c9510x71.h();
        G10.d(arrayDequeH);
        Set setI = c9510x71.i();
        G10.d(setI);
        arrayDequeH.push(interfaceC3159aT0);
        while (!arrayDequeH.isEmpty()) {
            if (setI.size() > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + interfaceC3159aT0 + ". Supertypes = " + AbstractC2455Um.n0(setI, null, null, null, 0, null, null, 63, null)).toString());
            }
            InterfaceC3159aT0 interfaceC3159aT02 = (InterfaceC3159aT0) arrayDequeH.pop();
            G10.d(interfaceC3159aT02);
            if (setI.add(interfaceC3159aT02)) {
                C9510x71.c cVar = interfaceC9515x81J.u(interfaceC3159aT02) ? C9510x71.c.C0252c.a : C9510x71.c.b.a;
                if (G10.c(cVar, C9510x71.c.C0252c.a)) {
                    cVar = null;
                }
                if (cVar == null) {
                    continue;
                } else {
                    InterfaceC9515x81 interfaceC9515x81J2 = c9510x71.j();
                    Iterator it = interfaceC9515x81J2.i(interfaceC9515x81J2.f(interfaceC3159aT02)).iterator();
                    while (it.hasNext()) {
                        InterfaceC3159aT0 interfaceC3159aT0A = cVar.a(c9510x71, (O80) it.next());
                        if (a.c(c9510x71, interfaceC3159aT0A, d71)) {
                            c9510x71.e();
                            return true;
                        }
                        arrayDequeH.add(interfaceC3159aT0A);
                    }
                }
            }
        }
        c9510x71.e();
        return false;
    }

    public final boolean c(C9510x71 c9510x71, InterfaceC3159aT0 interfaceC3159aT0, D71 d71) {
        InterfaceC9515x81 interfaceC9515x81J = c9510x71.j();
        if (interfaceC9515x81J.F0(interfaceC3159aT0)) {
            return true;
        }
        if (interfaceC9515x81J.u(interfaceC3159aT0)) {
            return false;
        }
        if (c9510x71.n() && interfaceC9515x81J.d0(interfaceC3159aT0)) {
            return true;
        }
        return interfaceC9515x81J.g0(interfaceC9515x81J.f(interfaceC3159aT0), d71);
    }

    public final boolean d(C9510x71 c9510x71, InterfaceC3159aT0 interfaceC3159aT0, InterfaceC3159aT0 interfaceC3159aT02) {
        G10.g(c9510x71, "state");
        G10.g(interfaceC3159aT0, "subType");
        G10.g(interfaceC3159aT02, "superType");
        return e(c9510x71, interfaceC3159aT0, interfaceC3159aT02);
    }

    public final boolean e(C9510x71 c9510x71, InterfaceC3159aT0 interfaceC3159aT0, InterfaceC3159aT0 interfaceC3159aT02) {
        InterfaceC9515x81 interfaceC9515x81J = c9510x71.j();
        if (N0.b) {
            if (!interfaceC9515x81J.d(interfaceC3159aT0) && !interfaceC9515x81J.s(interfaceC9515x81J.f(interfaceC3159aT0))) {
                c9510x71.l(interfaceC3159aT0);
            }
            if (!interfaceC9515x81J.d(interfaceC3159aT02)) {
                c9510x71.l(interfaceC3159aT02);
            }
        }
        if (interfaceC9515x81J.u(interfaceC3159aT02) || interfaceC9515x81J.h(interfaceC3159aT0) || interfaceC9515x81J.q0(interfaceC3159aT0)) {
            return true;
        }
        if ((interfaceC3159aT0 instanceof InterfaceC1068Hj) && interfaceC9515x81J.G((InterfaceC1068Hj) interfaceC3159aT0)) {
            return true;
        }
        Y y = a;
        if (y.a(c9510x71, interfaceC3159aT0, C9510x71.c.b.a)) {
            return true;
        }
        if (interfaceC9515x81J.h(interfaceC3159aT02) || y.a(c9510x71, interfaceC3159aT02, C9510x71.c.d.a) || interfaceC9515x81J.v(interfaceC3159aT0)) {
            return false;
        }
        return y.b(c9510x71, interfaceC3159aT0, interfaceC9515x81J.f(interfaceC3159aT02));
    }
}
