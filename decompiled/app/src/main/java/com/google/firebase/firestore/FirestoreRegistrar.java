package com.google.firebase.firestore;

import android.content.Context;
import androidx.annotation.Keep;
import com.daaw.AL;
import com.daaw.AbstractC0933Gb0;
import com.daaw.C3535bo;
import com.daaw.C6114kz;
import com.daaw.C7050oL;
import com.daaw.IV;
import com.daaw.InterfaceC0826Fa1;
import com.daaw.InterfaceC3874d10;
import com.daaw.InterfaceC8295so;
import com.daaw.InterfaceC9200w10;
import com.daaw.InterfaceC9976yo;
import com.daaw.UL;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.firestore.FirestoreRegistrar;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class FirestoreRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fst";

    public static /* synthetic */ e a(InterfaceC8295so interfaceC8295so) {
        return new e((Context) interfaceC8295so.a(Context.class), (C7050oL) interfaceC8295so.a(C7050oL.class), interfaceC8295so.i(InterfaceC3874d10.class), interfaceC8295so.i(InterfaceC9200w10.class), new AL(interfaceC8295so.d(InterfaceC0826Fa1.class), interfaceC8295so.d(IV.class), (UL) interfaceC8295so.a(UL.class)));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<C3535bo> getComponents() {
        return Arrays.asList(C3535bo.e(e.class).h(LIBRARY_NAME).b(C6114kz.k(C7050oL.class)).b(C6114kz.k(Context.class)).b(C6114kz.i(IV.class)).b(C6114kz.i(InterfaceC0826Fa1.class)).b(C6114kz.a(InterfaceC3874d10.class)).b(C6114kz.a(InterfaceC9200w10.class)).b(C6114kz.h(UL.class)).f(new InterfaceC9976yo() { // from class: com.daaw.CM
            @Override // com.daaw.InterfaceC9976yo
            public final Object a(InterfaceC8295so interfaceC8295so) {
                return FirestoreRegistrar.a(interfaceC8295so);
            }
        }).d(), AbstractC0933Gb0.b(LIBRARY_NAME, "24.6.1"));
    }
}
