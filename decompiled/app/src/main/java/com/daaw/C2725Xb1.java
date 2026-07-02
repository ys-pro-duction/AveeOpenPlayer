package com.daaw;

import android.os.AsyncTask;
import com.daaw.AsyncTaskC2517Vb1;

/* JADX INFO: renamed from: com.daaw.Xb1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2725Xb1 implements HX {
    public AsyncTaskC2517Vb1 a;
    public FQ b;

    /* JADX INFO: renamed from: com.daaw.Xb1$a */
    public class a implements AsyncTaskC2517Vb1.b {
        public final /* synthetic */ AsyncTaskC2517Vb1.b a;

        public a(AsyncTaskC2517Vb1.b bVar) {
            this.a = bVar;
        }

        @Override // com.daaw.AsyncTaskC2517Vb1.b
        public void a(Object obj, boolean z) {
            this.a.a(C2725Xb1.this.b.a(obj), z);
        }
    }

    public C2725Xb1(AsyncTaskC2517Vb1 asyncTaskC2517Vb1, FQ fq) {
        this.a = asyncTaskC2517Vb1;
        this.b = fq;
    }

    @Override // com.daaw.HX
    public void a(AsyncTaskC2517Vb1.b bVar) {
        this.a.a(new a(bVar));
    }

    @Override // com.daaw.HX
    public boolean cancel(boolean z) {
        return this.a.cancel(z);
    }

    @Override // com.daaw.HX
    public AsyncTask.Status getStatus() {
        return this.a.getStatus();
    }
}
