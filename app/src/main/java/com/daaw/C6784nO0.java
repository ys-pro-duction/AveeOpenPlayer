package com.daaw;

import android.os.AsyncTask;

/* JADX INFO: renamed from: com.daaw.nO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C6784nO0 {
    public static C0321Ag1 c = new C0321Ag1();
    public int a = -1;
    public AsyncTask b = null;

    public void a(boolean z) {
        AsyncTask asyncTask = this.b;
        if (asyncTask == null) {
            return;
        }
        int i = this.a;
        AbstractC6278lb.f(asyncTask);
        this.b.cancel(false);
        this.b = null;
        this.a = -1;
        if (z) {
            return;
        }
        c.a(Integer.valueOf(i), "");
    }

    public void b(int i) {
        if (this.a == i) {
            a(true);
        }
    }

    public boolean c(AsyncTask asyncTask, int i) {
        return this.a == i && this.b != null && !asyncTask.isCancelled() && asyncTask == this.b;
    }

    public void d(AsyncTask asyncTask, int i) {
        a(this.a == i);
        this.a = i;
        this.b = asyncTask;
    }
}
