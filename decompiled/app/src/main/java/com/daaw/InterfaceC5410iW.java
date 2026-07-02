package com.daaw;

import android.net.Uri;
import com.daaw.C3449bW;
import com.daaw.InterfaceC1896Pi0;
import java.io.IOException;

/* JADX INFO: renamed from: com.daaw.iW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC5410iW {

    /* JADX INFO: renamed from: com.daaw.iW$a */
    public interface a {
        boolean b(C3449bW.a aVar, boolean z);

        void h();
    }

    /* JADX INFO: renamed from: com.daaw.iW$b */
    public static final class b extends IOException {
        public final String B;

        public b(String str) {
            this.B = str;
        }
    }

    /* JADX INFO: renamed from: com.daaw.iW$c */
    public static final class c extends IOException {
        public final String B;

        public c(String str) {
            this.B = str;
        }
    }

    /* JADX INFO: renamed from: com.daaw.iW$d */
    public interface d {
        void d(C4284eW c4284eW);
    }

    void a();

    void b(Uri uri, InterfaceC1896Pi0.a aVar, d dVar);

    void c(a aVar);

    C4284eW d(C3449bW.a aVar);

    void e(C3449bW.a aVar);

    long f();

    boolean g();

    void h(C3449bW.a aVar);

    C3449bW i();

    void j();

    void l(a aVar);

    boolean m(C3449bW.a aVar);
}
