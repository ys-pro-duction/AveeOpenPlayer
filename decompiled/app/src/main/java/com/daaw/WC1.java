package com.daaw;

import android.app.Activity;
import android.app.Fragment;
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

/* JADX INFO: loaded from: classes.dex */
public final class WC1 extends Fragment implements InterfaceC1453Lb0 {
    public static final WeakHashMap E = new WeakHashMap();
    public final Map B = DesugarCollections.synchronizedMap(new C2407Ua());
    public int C = 0;
    public Bundle D;

    public static WC1 f(Activity activity) {
        WC1 wc1;
        WeakHashMap weakHashMap = E;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
        if (weakReference != null && (wc1 = (WC1) weakReference.get()) != null) {
            return wc1;
        }
        try {
            WC1 wc12 = (WC1) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (wc12 == null || wc12.isRemoving()) {
                wc12 = new WC1();
                activity.getFragmentManager().beginTransaction().add(wc12, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference(wc12));
            return wc12;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e);
        }
    }

    @Override // com.daaw.InterfaceC1453Lb0
    public final void a(String str, LifecycleCallback lifecycleCallback) {
        if (this.B.containsKey(str)) {
            throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
        }
        this.B.put(str, lifecycleCallback);
        if (this.C > 0) {
            new HandlerC4026da3(Looper.getMainLooper()).post(new RunnableC0666Dm1(this, lifecycleCallback, str));
        }
    }

    @Override // com.daaw.InterfaceC1453Lb0
    public final LifecycleCallback b(String str, Class cls) {
        return (LifecycleCallback) cls.cast(this.B.get(str));
    }

    @Override // com.daaw.InterfaceC1453Lb0
    public final Activity d() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.B.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Iterator it = this.B.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).e(i, i2, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.C = 1;
        this.D = bundle;
        for (Map.Entry entry : this.B.entrySet()) {
            ((LifecycleCallback) entry.getValue()).f(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.C = 5;
        Iterator it = this.B.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).g();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.C = 3;
        Iterator it = this.B.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).h();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.B.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).i(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.C = 2;
        Iterator it = this.B.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).j();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.C = 4;
        Iterator it = this.B.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).k();
        }
    }
}
