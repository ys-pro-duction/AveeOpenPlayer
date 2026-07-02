package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.Keep;
import com.daaw.AbstractC0933Gb0;
import com.daaw.C3037a1;
import com.daaw.C3535bo;
import com.daaw.C4205eC0;
import com.daaw.C6114kz;
import com.daaw.C7050oL;
import com.daaw.GG0;
import com.daaw.InterfaceC3216ag;
import com.daaw.InterfaceC8295so;
import com.daaw.InterfaceC9976yo;
import com.daaw.RL;
import com.daaw.W3;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    public static /* synthetic */ GG0 a(C4205eC0 c4205eC0, InterfaceC8295so interfaceC8295so) {
        return new GG0((Context) interfaceC8295so.a(Context.class), (ScheduledExecutorService) interfaceC8295so.c(c4205eC0), (C7050oL) interfaceC8295so.a(C7050oL.class), (RL) interfaceC8295so.a(RL.class), ((C3037a1) interfaceC8295so.a(C3037a1.class)).b("frc"), interfaceC8295so.d(W3.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C3535bo> getComponents() {
        final C4205eC0 c4205eC0A = C4205eC0.a(InterfaceC3216ag.class, ScheduledExecutorService.class);
        return Arrays.asList(C3535bo.e(GG0.class).h(LIBRARY_NAME).b(C6114kz.k(Context.class)).b(C6114kz.j(c4205eC0A)).b(C6114kz.k(C7050oL.class)).b(C6114kz.k(RL.class)).b(C6114kz.k(C3037a1.class)).b(C6114kz.i(W3.class)).f(new InterfaceC9976yo() { // from class: com.daaw.HG0
            @Override // com.daaw.InterfaceC9976yo
            public final Object a(InterfaceC8295so interfaceC8295so) {
                return RemoteConfigRegistrar.a(c4205eC0A, interfaceC8295so);
            }
        }).e().d(), AbstractC0933Gb0.b(LIBRARY_NAME, "21.4.0"));
    }
}
