package com.daaw;

import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Bo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C0455Bo implements InterfaceC0776Eo {
    public static /* synthetic */ Object b(String str, C3535bo c3535bo, InterfaceC8295so interfaceC8295so) {
        try {
            AbstractC5929kM.b(str);
            return c3535bo.h().a(interfaceC8295so);
        } finally {
            AbstractC5929kM.a();
        }
    }

    @Override // com.daaw.InterfaceC0776Eo
    public List a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final C3535bo c3535boR : componentRegistrar.getComponents()) {
            final String strI = c3535boR.i();
            if (strI != null) {
                c3535boR = c3535boR.r(new InterfaceC9976yo() { // from class: com.daaw.Ao
                    @Override // com.daaw.InterfaceC9976yo
                    public final Object a(InterfaceC8295so interfaceC8295so) {
                        return C0455Bo.b(strI, c3535boR, interfaceC8295so);
                    }
                });
            }
            arrayList.add(c3535boR);
        }
        return arrayList;
    }
}
