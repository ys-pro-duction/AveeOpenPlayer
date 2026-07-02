package com.daaw;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.Wl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2660Wl0 implements InterfaceC6983o51 {
    public final Collection a;
    public String b;

    public C2660Wl0(InterfaceC6983o51... interfaceC6983o51Arr) {
        if (interfaceC6983o51Arr.length < 1) {
            throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
        }
        this.a = Arrays.asList(interfaceC6983o51Arr);
    }

    @Override // com.daaw.InterfaceC6983o51
    public KI0 a(KI0 ki0, int i, int i2) {
        Iterator it = this.a.iterator();
        KI0 ki02 = ki0;
        while (it.hasNext()) {
            KI0 ki0A = ((InterfaceC6983o51) it.next()).a(ki02, i, i2);
            if (ki02 != null && !ki02.equals(ki0) && !ki02.equals(ki0A)) {
                ki02.c();
            }
            ki02 = ki0A;
        }
        return ki02;
    }

    @Override // com.daaw.InterfaceC6983o51
    public String getId() {
        if (this.b == null) {
            StringBuilder sb = new StringBuilder();
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                sb.append(((InterfaceC6983o51) it.next()).getId());
            }
            this.b = sb.toString();
        }
        return this.b;
    }
}
