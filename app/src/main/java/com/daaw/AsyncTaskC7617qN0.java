package com.daaw;

import android.content.Context;
import android.os.AsyncTask;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.qN0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class AsyncTaskC7617qN0 extends AsyncTask {
    public Context a;
    public File b;
    public b c;
    public WeakReference d;
    public List f = new ArrayList();
    public d g = new a();
    public String e = "";

    /* JADX INFO: renamed from: com.daaw.qN0$a */
    public class a implements d {
        public a() {
        }

        @Override // com.daaw.AsyncTaskC7617qN0.d
        public void a(File file) {
            String canonicalPath;
            try {
                canonicalPath = file.getCanonicalPath();
            } catch (IOException unused) {
                canonicalPath = null;
            }
            if (canonicalPath != null) {
                AsyncTaskC7617qN0.this.publishProgress(canonicalPath);
            }
        }

        @Override // com.daaw.AsyncTaskC7617qN0.d
        public void b(File file) {
            try {
                AsyncTaskC7617qN0.this.f.add(file.getCanonicalPath());
            } catch (IOException unused) {
            }
        }

        @Override // com.daaw.AsyncTaskC7617qN0.d
        public boolean isCancelled() {
            return AsyncTaskC7617qN0.this.isCancelled();
        }
    }

    /* JADX INFO: renamed from: com.daaw.qN0$b */
    public interface b {
        String a(String str);

        boolean b(String str, Object obj);
    }

    /* JADX INFO: renamed from: com.daaw.qN0$c */
    public interface c {
        void a(AsyncTask asyncTask, boolean z, List list);

        void b(AsyncTask asyncTask, String str);

        void c(AsyncTask asyncTask);
    }

    /* JADX INFO: renamed from: com.daaw.qN0$d */
    public interface d {
        void a(File file);

        void b(File file);

        boolean isCancelled();
    }

    public AsyncTaskC7617qN0(Context context, File file, b bVar, WeakReference weakReference) {
        this.a = context;
        this.b = file;
        this.c = bVar;
        this.d = weakReference;
    }

    public static AsyncTaskC7617qN0 c(Context context, File file, b bVar, WeakReference weakReference) {
        return new AsyncTaskC7617qN0(context, file, bVar, weakReference);
    }

    public static boolean e(Context context, d dVar, File file, boolean z, String str, b bVar) {
        Context context2;
        d dVar2;
        String str2;
        b bVar2;
        File[] fileArrListFiles = file.listFiles();
        try {
            int length = fileArrListFiles.length;
            int i = 0;
            while (i < length) {
                File file2 = fileArrListFiles[i];
                if (dVar.isCancelled()) {
                    return false;
                }
                if (file2.isDirectory()) {
                    dVar.a(file2);
                    if (z) {
                        context2 = context;
                        dVar2 = dVar;
                        str2 = str;
                        bVar2 = bVar;
                    } else {
                        context2 = context;
                        dVar2 = dVar;
                        str2 = str;
                        bVar2 = bVar;
                        if (!e(context2, dVar2, file2, false, str2, bVar2)) {
                            return false;
                        }
                    }
                } else {
                    context2 = context;
                    dVar2 = dVar;
                    str2 = str;
                    bVar2 = bVar;
                    if (bVar2 != null ? bVar2.b(str2, file2) : true) {
                        dVar2.b(file2);
                    }
                }
                i++;
                context = context2;
                dVar = dVar2;
                str = str2;
                bVar = bVar2;
            }
        } catch (Exception unused) {
        }
        return true;
    }

    public static boolean f(Context context, d dVar, File file, boolean z, String str, b bVar) {
        return e(context, dVar, file, z, bVar.a(str), bVar);
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Void doInBackground(String... strArr) {
        f(this.a, this.g, this.b, false, strArr[0], this.c);
        return null;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void onCancelled(Void r3) {
        c cVar = (c) this.d.get();
        if (cVar != null) {
            cVar.a(this, false, null);
        }
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(Void r3) {
        c cVar = (c) this.d.get();
        if (cVar != null) {
            cVar.a(this, true, this.f);
        }
    }

    public void i() {
        execute(this.e);
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        c cVar = (c) this.d.get();
        if (cVar != null) {
            cVar.c(this);
        }
    }

    @Override // android.os.AsyncTask
    public void onProgressUpdate(Object... objArr) {
        c cVar = (c) this.d.get();
        if (cVar != null) {
            cVar.b(this, (String) objArr[0]);
        }
    }
}
