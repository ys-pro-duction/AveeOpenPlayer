package com.google.firebase.appcheck;

import com.daaw.AbstractC0933Gb0;
import com.daaw.AbstractC7329pL;
import com.daaw.C3535bo;
import com.daaw.C4205eC0;
import com.daaw.C6114kz;
import com.daaw.C7050oL;
import com.daaw.C7501px;
import com.daaw.GV;
import com.daaw.HV;
import com.daaw.InterfaceC2516Vb0;
import com.daaw.InterfaceC2939Zd;
import com.daaw.InterfaceC3216ag;
import com.daaw.InterfaceC8295so;
import com.daaw.InterfaceC8397t91;
import com.daaw.InterfaceC9200w10;
import com.daaw.InterfaceC9976yo;
import com.google.firebase.appcheck.FirebaseAppCheckRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public class FirebaseAppCheckRegistrar implements ComponentRegistrar {
    public static /* synthetic */ AbstractC7329pL a(C4205eC0 c4205eC0, C4205eC0 c4205eC02, C4205eC0 c4205eC03, C4205eC0 c4205eC04, InterfaceC8295so interfaceC8295so) {
        return new C7501px((C7050oL) interfaceC8295so.a(C7050oL.class), interfaceC8295so.d(HV.class), (Executor) interfaceC8295so.c(c4205eC0), (Executor) interfaceC8295so.c(c4205eC02), (Executor) interfaceC8295so.c(c4205eC03), (ScheduledExecutorService) interfaceC8295so.c(c4205eC04));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        final C4205eC0 c4205eC0A = C4205eC0.a(InterfaceC8397t91.class, Executor.class);
        final C4205eC0 c4205eC0A2 = C4205eC0.a(InterfaceC2516Vb0.class, Executor.class);
        final C4205eC0 c4205eC0A3 = C4205eC0.a(InterfaceC2939Zd.class, Executor.class);
        final C4205eC0 c4205eC0A4 = C4205eC0.a(InterfaceC3216ag.class, ScheduledExecutorService.class);
        return Arrays.asList(C3535bo.f(AbstractC7329pL.class, InterfaceC9200w10.class).h("fire-app-check").b(C6114kz.k(C7050oL.class)).b(C6114kz.j(c4205eC0A)).b(C6114kz.j(c4205eC0A2)).b(C6114kz.j(c4205eC0A3)).b(C6114kz.j(c4205eC0A4)).b(C6114kz.i(HV.class)).f(new InterfaceC9976yo() { // from class: com.daaw.rL
            @Override // com.daaw.InterfaceC9976yo
            public final Object a(InterfaceC8295so interfaceC8295so) {
                return FirebaseAppCheckRegistrar.a(c4205eC0A, c4205eC0A2, c4205eC0A3, c4205eC0A4, interfaceC8295so);
            }
        }).c().d(), GV.a(), AbstractC0933Gb0.b("fire-app-check", "17.0.1"));
    }
}
