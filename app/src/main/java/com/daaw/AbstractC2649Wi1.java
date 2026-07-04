package com.daaw;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;

/* JADX INFO: renamed from: com.daaw.Wi1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2649Wi1 {
    public static final String a = AbstractC1772Od0.f("WorkerFactory");

    /* JADX INFO: renamed from: com.daaw.Wi1$a */
    public class a extends AbstractC2649Wi1 {
        @Override // com.daaw.AbstractC2649Wi1
        public ListenableWorker a(Context context, String str, WorkerParameters workerParameters) {
            return null;
        }
    }

    public static AbstractC2649Wi1 c() {
        return new a();
    }

    public abstract ListenableWorker a(Context context, String str, WorkerParameters workerParameters);

    public final ListenableWorker b(Context context, String str, WorkerParameters workerParameters) {
        Class clsAsSubclass;
        ListenableWorker listenableWorkerA = a(context, str, workerParameters);
        if (listenableWorkerA == null) {
            try {
                clsAsSubclass = Class.forName(str).asSubclass(ListenableWorker.class);
            } catch (Throwable th) {
                AbstractC1772Od0.c().b(a, "Invalid class: " + str, th);
                clsAsSubclass = null;
            }
            if (clsAsSubclass != null) {
                try {
                    listenableWorkerA = (ListenableWorker) clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                } catch (Throwable th2) {
                    AbstractC1772Od0.c().b(a, "Could not instantiate " + str, th2);
                }
            }
        }
        if (listenableWorkerA == null || !listenableWorkerA.isUsed()) {
            return listenableWorkerA;
        }
        throw new IllegalStateException(String.format("WorkerFactory (%s) returned an instance of a ListenableWorker (%s) which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.", getClass().getName(), str));
    }
}
