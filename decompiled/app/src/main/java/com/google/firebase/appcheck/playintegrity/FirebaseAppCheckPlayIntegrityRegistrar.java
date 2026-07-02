package com.google.firebase.appcheck.playintegrity;

import com.daaw.AbstractC0933Gb0;
import com.daaw.C3535bo;
import com.daaw.C4205eC0;
import com.daaw.C6114kz;
import com.daaw.C7050oL;
import com.daaw.C9174vv0;
import com.daaw.InterfaceC2516Vb0;
import com.daaw.InterfaceC3216ag;
import com.daaw.InterfaceC8295so;
import com.daaw.InterfaceC9976yo;
import com.google.firebase.appcheck.playintegrity.FirebaseAppCheckPlayIntegrityRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public class FirebaseAppCheckPlayIntegrityRegistrar implements ComponentRegistrar {
    public static /* synthetic */ C9174vv0 a(C4205eC0 c4205eC0, C4205eC0 c4205eC02, InterfaceC8295so interfaceC8295so) {
        return new C9174vv0((C7050oL) interfaceC8295so.a(C7050oL.class), (Executor) interfaceC8295so.c(c4205eC0), (Executor) interfaceC8295so.c(c4205eC02));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        final C4205eC0 c4205eC0A = C4205eC0.a(InterfaceC2516Vb0.class, Executor.class);
        final C4205eC0 c4205eC0A2 = C4205eC0.a(InterfaceC3216ag.class, Executor.class);
        return Arrays.asList(C3535bo.e(C9174vv0.class).h("fire-app-check-play-integrity").b(C6114kz.k(C7050oL.class)).b(C6114kz.j(c4205eC0A)).b(C6114kz.j(c4205eC0A2)).f(new InterfaceC9976yo() { // from class: com.daaw.qL
            @Override // com.daaw.InterfaceC9976yo
            public final Object a(InterfaceC8295so interfaceC8295so) {
                return FirebaseAppCheckPlayIntegrityRegistrar.a(c4205eC0A, c4205eC0A2, interfaceC8295so);
            }
        }).d(), AbstractC0933Gb0.b("fire-app-check-play-integrity", "17.0.1"));
    }
}
