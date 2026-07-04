package com.daaw;

import android.os.AsyncTask;
import com.daaw.AsyncTaskC2517Vb1;

/* JADX INFO: renamed from: com.daaw.x11, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C9480x11 {
    public String a = null;
    public HX b = null;

    /* JADX INFO: renamed from: com.daaw.x11$a */
    public class a implements AsyncTaskC2517Vb1.b {
        public final /* synthetic */ AsyncTaskC2517Vb1.b a;

        public a(AsyncTaskC2517Vb1.b bVar) {
            this.a = bVar;
        }

        @Override // com.daaw.AsyncTaskC2517Vb1.b
        public void a(Object obj, boolean z) {
            C9480x11.this.b = null;
            C9480x11.this.a = null;
            this.a.a(obj, z);
        }
    }

    public void c() {
        HX hx = this.b;
        if (hx != null) {
            hx.cancel(true);
        }
        this.b = null;
        this.a = null;
    }

    public void d(String str, HX hx, AsyncTaskC2517Vb1.b bVar) {
        c();
        this.b = hx;
        this.a = str;
        hx.a(new a(bVar));
    }

    public boolean e(String str) {
        HX hx;
        return AbstractC0405Bb1.h(this.a, str) && (hx = this.b) != null && hx.getStatus() == AsyncTask.Status.RUNNING;
    }
}
