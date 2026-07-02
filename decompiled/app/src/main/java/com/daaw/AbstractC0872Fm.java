package com.daaw;

import com.daaw.Z1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Fm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0872Fm {

    /* JADX INFO: renamed from: com.daaw.Fm$a */
    public static final class a extends AbstractC4192e90 implements LQ {
        public static final a B = new a();

        public a() {
            super(0);
        }

        @Override // com.daaw.LQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    public static final boolean a(List list) {
        List listK;
        long jT;
        if (list.size() < 2) {
            return true;
        }
        if (list.size() == 0 || list.size() == 1) {
            listK = AbstractC1599Mm.k();
        } else {
            listK = new ArrayList();
            Object obj = list.get(0);
            int iM = AbstractC1599Mm.m(list);
            int i = 0;
            while (i < iM) {
                i++;
                Object obj2 = list.get(i);
                C8461tP0 c8461tP0 = (C8461tP0) obj2;
                C8461tP0 c8461tP02 = (C8461tP0) obj;
                listK.add(C9982yp0.d(AbstractC0460Bp0.a(Math.abs(C9982yp0.l(c8461tP02.f().d()) - C9982yp0.l(c8461tP0.f().d())), Math.abs(C9982yp0.m(c8461tP02.f().d()) - C9982yp0.m(c8461tP0.f().d())))));
                obj = obj2;
            }
        }
        if (listK.size() == 1) {
            jT = ((C9982yp0) AbstractC2455Um.e0(listK)).t();
        } else {
            if (listK.isEmpty()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object objE0 = AbstractC2455Um.e0(listK);
            int iM2 = AbstractC1599Mm.m(listK);
            if (1 <= iM2) {
                int i2 = 1;
                while (true) {
                    objE0 = C9982yp0.d(C9982yp0.q(((C9982yp0) objE0).t(), ((C9982yp0) listK.get(i2)).t()));
                    if (i2 == iM2) {
                        break;
                    }
                    i2++;
                }
            }
            jT = ((C9982yp0) objE0).t();
        }
        return C9982yp0.f(jT) < C9982yp0.e(jT);
    }

    public static final void b(C8461tP0 c8461tP0, Z1 z1) {
        G10.g(c8461tP0, "node");
        G10.g(z1, "info");
        C6788nP0 c6788nP0H = c8461tP0.h();
        C9584xP0 c9584xP0 = C9584xP0.a;
        AbstractC6314li0.a(AbstractC7067oP0.a(c6788nP0H, c9584xP0.a()));
        ArrayList arrayList = new ArrayList();
        if (AbstractC7067oP0.a(c8461tP0.h(), c9584xP0.r()) != null) {
            List listO = c8461tP0.o();
            int size = listO.size();
            for (int i = 0; i < size; i++) {
                C8461tP0 c8461tP02 = (C8461tP0) listO.get(i);
                if (c8461tP02.h().p(C9584xP0.a.s())) {
                    arrayList.add(c8461tP02);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean zA = a(arrayList);
        z1.p0(Z1.e.b(zA ? 1 : arrayList.size(), zA ? arrayList.size() : 1, false, 0));
    }

    public static final void c(C8461tP0 c8461tP0, Z1 z1) {
        G10.g(c8461tP0, "node");
        G10.g(z1, "info");
        C6788nP0 c6788nP0H = c8461tP0.h();
        C9584xP0 c9584xP0 = C9584xP0.a;
        AbstractC6314li0.a(AbstractC7067oP0.a(c6788nP0H, c9584xP0.b()));
        C8461tP0 c8461tP0M = c8461tP0.m();
        if (c8461tP0M == null || AbstractC7067oP0.a(c8461tP0M.h(), c9584xP0.r()) == null) {
            return;
        }
        AbstractC6314li0.a(AbstractC7067oP0.a(c8461tP0M.h(), c9584xP0.a()));
        if (c8461tP0.h().p(c9584xP0.s())) {
            ArrayList arrayList = new ArrayList();
            List listO = c8461tP0M.o();
            int size = listO.size();
            for (int i = 0; i < size; i++) {
                C8461tP0 c8461tP02 = (C8461tP0) listO.get(i);
                if (c8461tP02.h().p(C9584xP0.a.s())) {
                    arrayList.add(c8461tP02);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            boolean zA = a(arrayList);
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                C8461tP0 c8461tP03 = (C8461tP0) arrayList.get(i2);
                if (c8461tP03.i() == c8461tP0.i()) {
                    Z1.f fVarA = Z1.f.a(zA ? 0 : i2, 1, zA ? i2 : 0, 1, false, ((Boolean) c8461tP03.h().w(C9584xP0.a.s(), a.B)).booleanValue());
                    if (fVarA != null) {
                        z1.q0(fVarA);
                    }
                }
            }
        }
    }
}
