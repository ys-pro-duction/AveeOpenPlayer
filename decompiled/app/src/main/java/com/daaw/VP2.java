package com.daaw;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class VP2 extends IO2 {
    public final /* synthetic */ Iterator D;
    public final /* synthetic */ InterfaceC5661jO2 E;

    public VP2(Iterator it, InterfaceC5661jO2 interfaceC5661jO2) {
        this.D = it;
        this.E = interfaceC5661jO2;
    }

    @Override // com.daaw.IO2
    public final Object a() {
        while (this.D.hasNext()) {
            Iterator it = this.D;
            InterfaceC5661jO2 interfaceC5661jO2 = this.E;
            Object next = it.next();
            if (interfaceC5661jO2.zza(next)) {
                return next;
            }
        }
        b();
        return null;
    }
}
