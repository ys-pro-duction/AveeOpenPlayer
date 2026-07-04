package com.daaw;

import android.os.AsyncTask;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.mO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class AsyncTaskC6505mO0 extends AsyncTask {
    public List a;
    public InterfaceC3126aL b;
    public WeakReference c;
    public int d = 0;
    public c e = new a();

    /* JADX INFO: renamed from: com.daaw.mO0$a */
    public class a implements c {
        public a() {
        }

        @Override // com.daaw.AsyncTaskC6505mO0.c
        public void a(Object obj) {
            AsyncTaskC6505mO0.this.d++;
            AsyncTaskC6505mO0.this.publishProgress(obj);
        }

        @Override // com.daaw.AsyncTaskC6505mO0.c
        public boolean isCancelled() {
            return AsyncTaskC6505mO0.this.isCancelled();
        }
    }

    /* JADX INFO: renamed from: com.daaw.mO0$b */
    public interface b {
        void a(AsyncTask asyncTask, boolean z);

        void b(AsyncTask asyncTask);

        void c(AsyncTask asyncTask, Object obj);
    }

    /* JADX INFO: renamed from: com.daaw.mO0$c */
    public interface c {
        void a(Object obj);

        boolean isCancelled();
    }

    public AsyncTaskC6505mO0(List list, InterfaceC3126aL interfaceC3126aL, WeakReference weakReference) {
        this.a = list;
        this.b = interfaceC3126aL;
        this.c = weakReference;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Void doInBackground(java.lang.String... r5) {
        /*
            r4 = this;
            r0 = 0
            r5 = r5[r0]
            com.daaw.aL r0 = r4.b
            r1 = 0
            if (r0 != 0) goto L9
            return r1
        L9:
            if (r5 == 0) goto L1a
            boolean r0 = r5.isEmpty()     // Catch: java.lang.Exception -> L18
            if (r0 != 0) goto L1a
            com.daaw.aL r0 = r4.b     // Catch: java.lang.Exception -> L18
            java.lang.String r5 = r0.a(r5)     // Catch: java.lang.Exception -> L18
            goto L1b
        L18:
            r5 = move-exception
            goto L61
        L1a:
            r5 = r1
        L1b:
            java.util.List r0 = r4.a     // Catch: java.lang.Exception -> L18
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> L18
        L21:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Exception -> L18
            if (r2 == 0) goto L3a
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Exception -> L18
            com.daaw.mO0$c r3 = r4.e     // Catch: java.lang.Exception -> L18
            boolean r3 = r3.isCancelled()     // Catch: java.lang.Exception -> L18
            if (r3 == 0) goto L34
            goto L3a
        L34:
            com.daaw.aL r3 = r4.b     // Catch: java.lang.Exception -> L18
            r3.c(r2)     // Catch: java.lang.Exception -> L18
            goto L21
        L3a:
            java.util.List r0 = r4.a     // Catch: java.lang.Exception -> L18
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> L18
        L40:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Exception -> L18
            if (r2 == 0) goto L79
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Exception -> L18
            com.daaw.mO0$c r3 = r4.e     // Catch: java.lang.Exception -> L18
            boolean r3 = r3.isCancelled()     // Catch: java.lang.Exception -> L18
            if (r3 == 0) goto L53
            goto L79
        L53:
            com.daaw.aL r3 = r4.b     // Catch: java.lang.Exception -> L18
            boolean r3 = r3.b(r5, r2)     // Catch: java.lang.Exception -> L18
            if (r3 == 0) goto L40
            com.daaw.mO0$c r3 = r4.e     // Catch: java.lang.Exception -> L18
            r3.a(r2)     // Catch: java.lang.Exception -> L18
            goto L40
        L61:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "doInBackground Exception: "
            r0.append(r2)
            java.lang.String r5 = r5.getMessage()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            com.daaw.AbstractC0441Bk1.c(r5)
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AsyncTaskC6505mO0.doInBackground(java.lang.String[]):java.lang.Void");
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onCancelled(Void r2) {
        b bVar = (b) this.c.get();
        if (bVar != null) {
            bVar.a(this, false);
        }
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(Void r2) {
        b bVar = (b) this.c.get();
        if (bVar != null) {
            bVar.a(this, true);
        }
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        b bVar = (b) this.c.get();
        if (bVar != null) {
            bVar.b(this);
        }
    }

    @Override // android.os.AsyncTask
    public void onProgressUpdate(Object... objArr) {
        b bVar = (b) this.c.get();
        if (bVar != null) {
            bVar.c(this, objArr[0]);
        }
    }
}
