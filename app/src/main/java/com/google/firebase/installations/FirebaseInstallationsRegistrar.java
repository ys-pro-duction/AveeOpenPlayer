package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.daaw.AbstractC0933Gb0;
import com.daaw.C3535bo;
import com.daaw.C4205eC0;
import com.daaw.C6114kz;
import com.daaw.C7050oL;
import com.daaw.GV;
import com.daaw.HV;
import com.daaw.InterfaceC2939Zd;
import com.daaw.InterfaceC3216ag;
import com.daaw.InterfaceC8295so;
import com.daaw.InterfaceC9976yo;
import com.daaw.KL;
import com.daaw.QL;
import com.daaw.RL;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    public static /* synthetic */ RL a(InterfaceC8295so interfaceC8295so) {
        return new QL((C7050oL) interfaceC8295so.a(C7050oL.class), interfaceC8295so.d(HV.class), (ExecutorService) interfaceC8295so.c(C4205eC0.a(InterfaceC2939Zd.class, ExecutorService.class)), KL.b((Executor) interfaceC8295so.c(C4205eC0.a(InterfaceC3216ag.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C3535bo> getComponents() {
        return Arrays.asList(C3535bo.e(RL.class).h(LIBRARY_NAME).b(C6114kz.k(C7050oL.class)).b(C6114kz.i(HV.class)).b(C6114kz.j(C4205eC0.a(InterfaceC2939Zd.class, ExecutorService.class))).b(C6114kz.j(C4205eC0.a(InterfaceC3216ag.class, Executor.class))).f(new InterfaceC9976yo() { // from class: com.daaw.TL
            @Override // com.daaw.InterfaceC9976yo
            public final Object a(InterfaceC8295so interfaceC8295so) {
                return FirebaseInstallationsRegistrar.a(interfaceC8295so);
            }
        }).d(), GV.a(), AbstractC0933Gb0.b(LIBRARY_NAME, "17.1.3"));
    }
}
