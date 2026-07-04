package com.daaw;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Si, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC2231Si {

    /* JADX INFO: renamed from: com.daaw.Si$a */
    public static final class a {
        public static void a(InterfaceC2231Si interfaceC2231Si, Object[] objArr) {
            G10.g(objArr, "args");
            if (AbstractC2439Ui.a(interfaceC2231Si) == objArr.length) {
                return;
            }
            throw new IllegalArgumentException("Callable expects " + AbstractC2439Ui.a(interfaceC2231Si) + " arguments, but " + objArr.length + " were provided.");
        }
    }

    List a();

    Member b();

    Object call(Object[] objArr);

    Type getReturnType();
}
