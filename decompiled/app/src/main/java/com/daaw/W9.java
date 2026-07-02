package com.daaw;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.startup.InitializationProvider;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class W9 {
    public static volatile W9 d;
    public static final Object e = new Object();
    public final Context c;
    public final Set b = new HashSet();
    public final Map a = new HashMap();

    public W9(Context context) {
        this.c = context.getApplicationContext();
    }

    public static W9 e(Context context) {
        if (d == null) {
            synchronized (e) {
                try {
                    if (d == null) {
                        d = new W9(context);
                    }
                } finally {
                }
            }
        }
        return d;
    }

    public void a() {
        try {
            try {
                P41.a("Startup");
                b(this.c.getPackageManager().getProviderInfo(new ComponentName(this.c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            } catch (PackageManager.NameNotFoundException e2) {
                throw new C5411iW0(e2);
            }
        } finally {
            P41.b();
        }
    }

    public void b(Bundle bundle) {
        String string = this.c.getString(ID0.a);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (GZ.class.isAssignableFrom(cls)) {
                            this.b.add(cls);
                        }
                    }
                }
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    d((Class) it.next(), hashSet);
                }
            } catch (ClassNotFoundException e2) {
                throw new C5411iW0(e2);
            }
        }
    }

    public Object c(Class cls) {
        Object objD;
        synchronized (e) {
            try {
                objD = this.a.get(cls);
                if (objD == null) {
                    objD = d(cls, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objD;
    }

    public final Object d(Class cls, Set set) {
        Object objB;
        if (P41.d()) {
            try {
                P41.a(cls.getSimpleName());
            } catch (Throwable th) {
                P41.b();
                throw th;
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.a.containsKey(cls)) {
            objB = this.a.get(cls);
        } else {
            set.add(cls);
            try {
                GZ gz = (GZ) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listA = gz.a();
                if (!listA.isEmpty()) {
                    for (Class cls2 : listA) {
                        if (!this.a.containsKey(cls2)) {
                            d(cls2, set);
                        }
                    }
                }
                objB = gz.b(this.c);
                set.remove(cls);
                this.a.put(cls, objB);
            } catch (Throwable th2) {
                throw new C5411iW0(th2);
            }
        }
        P41.b();
        return objB;
    }

    public Object f(Class cls) {
        return c(cls);
    }

    public boolean g(Class cls) {
        return this.b.contains(cls);
    }
}
