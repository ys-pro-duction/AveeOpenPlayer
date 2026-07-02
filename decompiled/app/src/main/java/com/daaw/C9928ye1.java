package com.daaw;

import androidx.lifecycle.y;
import com.daaw.AbstractC5247hu;

/* JADX INFO: renamed from: com.daaw.ye1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C9928ye1 {
    public static final C9928ye1 a = new C9928ye1();

    /* JADX INFO: renamed from: com.daaw.ye1$a */
    public static final class a implements AbstractC5247hu.b {
        public static final a a = new a();
    }

    public final AbstractC5247hu a(InterfaceC0417Be1 interfaceC0417Be1) {
        G10.g(interfaceC0417Be1, "owner");
        return interfaceC0417Be1 instanceof androidx.lifecycle.e ? ((androidx.lifecycle.e) interfaceC0417Be1).k() : AbstractC5247hu.a.b;
    }

    public final y.c b(InterfaceC0417Be1 interfaceC0417Be1) {
        G10.g(interfaceC0417Be1, "owner");
        return interfaceC0417Be1 instanceof androidx.lifecycle.e ? ((androidx.lifecycle.e) interfaceC0417Be1).j() : C7505py.a;
    }

    public final String c(J50 j50) {
        G10.g(j50, "modelClass");
        String strA = AbstractC10207ze1.a(j50);
        if (strA == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return "androidx.lifecycle.ViewModelProvider.DefaultKey:" + strA;
    }

    public final AbstractC8526te1 d() {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }
}
