package com.daaw;

import com.daaw.AbstractC6977o40;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.daaw.sR0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8190sR0 {
    public static final AbstractC6977o40.a a = AbstractC6977o40.a.a("nm", "hd", "it");

    public static C7911rR0 a(AbstractC6977o40 abstractC6977o40, C0737Ee0 c0737Ee0) {
        ArrayList arrayList = new ArrayList();
        String strR = null;
        boolean zS = false;
        while (abstractC6977o40.o()) {
            int iO0 = abstractC6977o40.o0(a);
            if (iO0 == 0) {
                strR = abstractC6977o40.R();
            } else if (iO0 == 1) {
                zS = abstractC6977o40.s();
            } else if (iO0 != 2) {
                abstractC6977o40.q0();
            } else {
                abstractC6977o40.c();
                while (abstractC6977o40.o()) {
                    InterfaceC6921ns interfaceC6921nsA = AbstractC7200os.a(abstractC6977o40, c0737Ee0);
                    if (interfaceC6921nsA != null) {
                        arrayList.add(interfaceC6921nsA);
                    }
                }
                abstractC6977o40.j();
            }
        }
        return new C7911rR0(strR, arrayList, zS);
    }
}
