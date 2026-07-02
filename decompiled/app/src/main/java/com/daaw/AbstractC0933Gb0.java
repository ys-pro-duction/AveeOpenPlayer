package com.daaw;

import android.content.Context;

/* JADX INFO: renamed from: com.daaw.Gb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0933Gb0 {

    /* JADX INFO: renamed from: com.daaw.Gb0$a */
    public interface a {
        String a(Object obj);
    }

    public static C3535bo b(String str, String str2) {
        return C3535bo.l(AbstractC0725Eb0.a(str, str2), AbstractC0725Eb0.class);
    }

    public static C3535bo c(final String str, final a aVar) {
        return C3535bo.m(AbstractC0725Eb0.class).b(C6114kz.k(Context.class)).f(new InterfaceC9976yo() { // from class: com.daaw.Fb0
            @Override // com.daaw.InterfaceC9976yo
            public final Object a(InterfaceC8295so interfaceC8295so) {
                return AbstractC0725Eb0.a(str, aVar.a((Context) interfaceC8295so.a(Context.class)));
            }
        }).d();
    }
}
