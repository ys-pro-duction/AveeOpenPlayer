package com.google.firebase.crashlytics;

import com.daaw.AbstractC0933Gb0;
import com.daaw.C3535bo;
import com.daaw.C6114kz;
import com.daaw.C7050oL;
import com.daaw.IL;
import com.daaw.InterfaceC0692Dt;
import com.daaw.InterfaceC8295so;
import com.daaw.InterfaceC9976yo;
import com.daaw.RL;
import com.daaw.W3;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {
    public final IL b(InterfaceC8295so interfaceC8295so) {
        return IL.b((C7050oL) interfaceC8295so.a(C7050oL.class), (RL) interfaceC8295so.a(RL.class), interfaceC8295so.i(InterfaceC0692Dt.class), interfaceC8295so.i(W3.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        return Arrays.asList(C3535bo.e(IL.class).h("fire-cls").b(C6114kz.k(C7050oL.class)).b(C6114kz.k(RL.class)).b(C6114kz.a(InterfaceC0692Dt.class)).b(C6114kz.a(W3.class)).f(new InterfaceC9976yo() { // from class: com.daaw.It
            @Override // com.daaw.InterfaceC9976yo
            public final Object a(InterfaceC8295so interfaceC8295so) {
                return this.a.b(interfaceC8295so);
            }
        }).e().d(), AbstractC0933Gb0.b("fire-cls", "18.3.7"));
    }
}
