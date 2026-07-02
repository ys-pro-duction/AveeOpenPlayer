package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import androidx.fragment.app.FragmentManager;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class QP extends OP {
    public final Activity B;
    public final Context C;
    public final Handler D;
    public final int E;
    public final FragmentManager F;

    public QP(Activity activity, Context context, Handler handler, int i) {
        G10.g(context, "context");
        G10.g(handler, "handler");
        this.B = activity;
        this.C = context;
        this.D = handler;
        this.E = i;
        this.F = new ZP();
    }

    public void A(androidx.fragment.app.c cVar, Intent intent, int i, Bundle bundle) {
        G10.g(cVar, "fragment");
        G10.g(intent, "intent");
        if (i != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        AbstractC9438ws.j(this.C, intent, bundle);
    }

    public abstract void B();

    public final Activity o() {
        return this.B;
    }

    public final Context r() {
        return this.C;
    }

    public final FragmentManager s() {
        return this.F;
    }

    public final Handler t() {
        return this.D;
    }

    public abstract void x(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract Object y();

    public abstract LayoutInflater z();

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QP(MP mp) {
        this(mp, mp, new Handler(), 0);
        G10.g(mp, "activity");
    }
}
