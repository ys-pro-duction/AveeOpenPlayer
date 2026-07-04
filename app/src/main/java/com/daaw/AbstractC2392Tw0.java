package com.daaw;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import com.daaw.C2078Qw0;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: com.daaw.Tw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2392Tw0 {
    public static final ExecutorService a = Executors.newFixedThreadPool(2);

    public static /* synthetic */ C2078Qw0.b b(C2078Qw0 c2078Qw0, Object[] objArr, Handler handler, final InterfaceC5559j2 interfaceC5559j2) {
        final C2078Qw0.b bVarE = c2078Qw0.e(objArr);
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.daaw.Sw0
                @Override // java.lang.Runnable
                public final void run() {
                    interfaceC5559j2.a(bVarE);
                }
            });
            return bVarE;
        }
        interfaceC5559j2.a(bVarE);
        return bVarE;
    }

    public static void c(Context context, final C2078Qw0 c2078Qw0, Uri uri, String str, final Handler handler, final InterfaceC5559j2 interfaceC5559j2) {
        final Object[] objArr = {context, uri, str};
        a.submit(new Callable() { // from class: com.daaw.Rw0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return AbstractC2392Tw0.b(c2078Qw0, objArr, handler, interfaceC5559j2);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.daaw.C2078Qw0.c d(android.content.Context r8, android.net.Uri r9, com.daaw.C2078Qw0.b r10) {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC2392Tw0.d(android.content.Context, android.net.Uri, com.daaw.Qw0$b):com.daaw.Qw0$c");
    }
}
