package com.daaw;

import android.content.Context;
import android.os.AsyncTask;
import com.daaw.C10270zr;
import java.io.File;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.daaw.hO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class AsyncTaskC5100hO0 extends AsyncTask {
    public Context a;
    public File b;
    public InterfaceC3126aL c;
    public WeakReference d;
    public int e = 0;
    public c f = new a();

    /* JADX INFO: renamed from: com.daaw.hO0$b */
    public interface b {
        void a(AsyncTask asyncTask, boolean z);

        void b(AsyncTask asyncTask);

        void c(AsyncTask asyncTask, C10270zr.s sVar);
    }

    /* JADX INFO: renamed from: com.daaw.hO0$c */
    public interface c {
        void a(C10270zr.s sVar);

        void b(C10270zr.s sVar);

        boolean isCancelled();
    }

    public AsyncTaskC5100hO0(Context context, File file, InterfaceC3126aL interfaceC3126aL, WeakReference weakReference) {
        this.a = context;
        this.b = file;
        this.c = interfaceC3126aL;
        this.d = weakReference;
    }

    public static boolean e(Context context, c cVar, File file, boolean z, String str, InterfaceC3126aL interfaceC3126aL) {
        try {
            for (File file2 : file.listFiles()) {
                if (cVar.isCancelled()) {
                    return false;
                }
                if (!file2.isDirectory()) {
                    if (interfaceC3126aL != null ? file2.getName().toLowerCase().contains(str) : true) {
                        cVar.b(new C10270zr.s(false, file2.getName(), file2.length(), file2.getCanonicalPath(), file2.lastModified(), new C2078Qw0(file2)));
                    }
                } else if (!z) {
                    if (interfaceC3126aL == null) {
                        cVar.a(new C10270zr.s(true, file2.getName(), file2.listFiles() != null ? r0.length : 0, file2.getCanonicalPath(), file2.lastModified()));
                    } else if (!e(context, cVar, file2, false, str, interfaceC3126aL)) {
                        return false;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return true;
    }

    public static boolean f(Context context, c cVar, File file, boolean z, String str, InterfaceC3126aL interfaceC3126aL) {
        String strA;
        InterfaceC3126aL interfaceC3126aL2;
        if (str == null || str.isEmpty() || interfaceC3126aL == null) {
            strA = null;
            interfaceC3126aL2 = null;
        } else {
            strA = interfaceC3126aL.a(str);
            interfaceC3126aL2 = interfaceC3126aL;
        }
        return e(context, cVar, file, z, strA, interfaceC3126aL2);
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Void doInBackground(String... strArr) {
        f(this.a, this.f, this.b, false, strArr[0], this.c);
        return null;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void onCancelled(Void r2) {
        b bVar = (b) this.d.get();
        if (bVar != null) {
            bVar.a(this, false);
        }
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(Void r2) {
        b bVar = (b) this.d.get();
        if (bVar != null) {
            bVar.a(this, true);
        }
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        b bVar = (b) this.d.get();
        if (bVar != null) {
            bVar.b(this);
        }
    }

    @Override // android.os.AsyncTask
    public void onProgressUpdate(Object... objArr) {
        b bVar = (b) this.d.get();
        if (bVar != null) {
            bVar.c(this, (C10270zr.s) objArr[0]);
        }
    }

    /* JADX INFO: renamed from: com.daaw.hO0$a */
    public class a implements c {
        public a() {
        }

        @Override // com.daaw.AsyncTaskC5100hO0.c
        public void b(C10270zr.s sVar) {
            sVar.p(AsyncTaskC5100hO0.this.e);
            AsyncTaskC5100hO0.this.e++;
            AsyncTaskC5100hO0.this.publishProgress(sVar);
        }

        @Override // com.daaw.AsyncTaskC5100hO0.c
        public boolean isCancelled() {
            return AsyncTaskC5100hO0.this.isCancelled();
        }

        @Override // com.daaw.AsyncTaskC5100hO0.c
        public void a(C10270zr.s sVar) {
        }
    }
}
