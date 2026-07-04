package j$.util;

import java.io.Serializable;

/* JADX INFO: renamed from: j$.util.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10387e extends RuntimeException {
    public static void a(String str, Serializable serializable) {
        throw new C10387e("Unsupported " + str + " :" + serializable);
    }
}
