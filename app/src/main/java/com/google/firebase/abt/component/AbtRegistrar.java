package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.Keep;
import com.daaw.AbstractC0933Gb0;
import com.daaw.C3037a1;
import com.daaw.C3535bo;
import com.daaw.C6114kz;
import com.daaw.InterfaceC8295so;
import com.daaw.InterfaceC9976yo;
import com.daaw.W3;
import com.google.firebase.abt.component.AbtRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    public static /* synthetic */ C3037a1 a(InterfaceC8295so interfaceC8295so) {
        return new C3037a1((Context) interfaceC8295so.a(Context.class), interfaceC8295so.d(W3.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C3535bo> getComponents() {
        return Arrays.asList(C3535bo.e(C3037a1.class).h(LIBRARY_NAME).b(C6114kz.k(Context.class)).b(C6114kz.i(W3.class)).f(new InterfaceC9976yo() { // from class: com.daaw.d1
            @Override // com.daaw.InterfaceC9976yo
            public final Object a(InterfaceC8295so interfaceC8295so) {
                return AbtRegistrar.a(interfaceC8295so);
            }
        }).d(), AbstractC0933Gb0.b(LIBRARY_NAME, "21.1.1"));
    }
}
