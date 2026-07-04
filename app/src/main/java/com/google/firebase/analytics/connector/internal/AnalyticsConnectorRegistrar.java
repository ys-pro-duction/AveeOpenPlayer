package com.google.firebase.analytics.connector.internal;

import android.content.Context;
import androidx.annotation.Keep;
import com.daaw.AbstractC0933Gb0;
import com.daaw.C3535bo;
import com.daaw.C6114kz;
import com.daaw.C7050oL;
import com.daaw.InterfaceC3740cZ0;
import com.daaw.InterfaceC9976yo;
import com.daaw.W3;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<C3535bo> getComponents() {
        return Arrays.asList(C3535bo.e(W3.class).b(C6114kz.k(C7050oL.class)).b(C6114kz.k(Context.class)).b(C6114kz.k(InterfaceC3740cZ0.class)).f(new InterfaceC9976yo() { // from class: com.daaw.PC1
            @Override // com.daaw.InterfaceC9976yo
            public final Object a(InterfaceC8295so interfaceC8295so) {
                return X3.g((C7050oL) interfaceC8295so.a(C7050oL.class), (Context) interfaceC8295so.a(Context.class), (InterfaceC3740cZ0) interfaceC8295so.a(InterfaceC3740cZ0.class));
            }
        }).e().d(), AbstractC0933Gb0.b("fire-analytics", "21.3.0"));
    }
}
