package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.daaw.AbstractC7506py0;
import com.daaw.C1245Jb0;
import com.daaw.C9795y82;
import com.daaw.InterfaceC1453Lb0;
import com.daaw.WC1;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public class LifecycleCallback {
    public final InterfaceC1453Lb0 B;

    public LifecycleCallback(InterfaceC1453Lb0 interfaceC1453Lb0) {
        this.B = interfaceC1453Lb0;
    }

    public static InterfaceC1453Lb0 c(Activity activity) {
        return d(new C1245Jb0(activity));
    }

    public static InterfaceC1453Lb0 d(C1245Jb0 c1245Jb0) {
        if (c1245Jb0.d()) {
            return C9795y82.K1(c1245Jb0.b());
        }
        if (c1245Jb0.c()) {
            return WC1.f(c1245Jb0.a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    @Keep
    private static InterfaceC1453Lb0 getChimeraLifecycleFragmentImpl(C1245Jb0 c1245Jb0) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public Activity b() {
        Activity activityD = this.B.d();
        AbstractC7506py0.l(activityD);
        return activityD;
    }

    public void e(int i, int i2, Intent intent) {
    }

    public void f(Bundle bundle) {
    }

    public void g() {
    }

    public void h() {
    }

    public void i(Bundle bundle) {
    }

    public void j() {
    }

    public void k() {
    }
}
