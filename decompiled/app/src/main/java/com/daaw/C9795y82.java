package com.daaw;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import j$.util.DesugarCollections;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.daaw.y82, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C9795y82 extends androidx.fragment.app.c implements InterfaceC1453Lb0 {
    public static final WeakHashMap J0 = new WeakHashMap();
    public final Map G0 = DesugarCollections.synchronizedMap(new C2407Ua());
    public int H0 = 0;
    public Bundle I0;

    public static C9795y82 K1(MP mp) {
        C9795y82 c9795y82;
        WeakHashMap weakHashMap = J0;
        WeakReference weakReference = (WeakReference) weakHashMap.get(mp);
        if (weakReference != null && (c9795y82 = (C9795y82) weakReference.get()) != null) {
            return c9795y82;
        }
        try {
            C9795y82 c9795y822 = (C9795y82) mp.f0().j0("SupportLifecycleFragmentImpl");
            if (c9795y822 == null || c9795y822.i0()) {
                c9795y822 = new C9795y82();
                mp.f0().o().d(c9795y822, "SupportLifecycleFragmentImpl").g();
            }
            weakHashMap.put(mp, new WeakReference(c9795y822));
            return c9795y822;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
        }
    }

    @Override // androidx.fragment.app.c
    public final void M0() {
        super.M0();
        this.H0 = 3;
        Iterator it = this.G0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).h();
        }
    }

    @Override // androidx.fragment.app.c
    public final void N0(Bundle bundle) {
        super.N0(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.G0.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).i(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // androidx.fragment.app.c
    public final void O0() {
        super.O0();
        this.H0 = 2;
        Iterator it = this.G0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).j();
        }
    }

    @Override // androidx.fragment.app.c
    public final void P0() {
        super.P0();
        this.H0 = 4;
        Iterator it = this.G0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).k();
        }
    }

    @Override // com.daaw.InterfaceC1453Lb0
    public final void a(String str, LifecycleCallback lifecycleCallback) {
        if (this.G0.containsKey(str)) {
            throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
        }
        this.G0.put(str, lifecycleCallback);
        if (this.H0 > 0) {
            new HandlerC4026da3(Looper.getMainLooper()).post(new RunnableC10155zS1(this, lifecycleCallback, str));
        }
    }

    @Override // com.daaw.InterfaceC1453Lb0
    public final LifecycleCallback b(String str, Class cls) {
        return (LifecycleCallback) cls.cast(this.G0.get(str));
    }

    @Override // com.daaw.InterfaceC1453Lb0
    public final /* synthetic */ Activity d() {
        return m();
    }

    @Override // androidx.fragment.app.c
    public final void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.h(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.G0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // androidx.fragment.app.c
    public final void m0(int i, int i2, Intent intent) {
        super.m0(i, i2, intent);
        Iterator it = this.G0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).e(i, i2, intent);
        }
    }

    @Override // androidx.fragment.app.c
    public final void r0(Bundle bundle) {
        super.r0(bundle);
        this.H0 = 1;
        this.I0 = bundle;
        for (Map.Entry entry : this.G0.entrySet()) {
            ((LifecycleCallback) entry.getValue()).f(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // androidx.fragment.app.c
    public final void w0() {
        super.w0();
        this.H0 = 5;
        Iterator it = this.G0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).g();
        }
    }
}
