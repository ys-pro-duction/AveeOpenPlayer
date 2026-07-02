package com.daaw;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import com.google.firebase.components.ComponentRegistrar;
import j$.util.Objects;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.xo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9697xo {
    public final Object a;
    public final c b;

    /* JADX INFO: renamed from: com.daaw.xo$b */
    public static class b implements c {
        public final Class a;

        public final Bundle b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) this.a), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Objects.toString(this.a);
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        @Override // com.daaw.C9697xo.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public List a(Context context) {
            Bundle bundleB = b(context);
            if (bundleB == null) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            for (String str : bundleB.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundleB.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }

        public b(Class cls) {
            this.a = cls;
        }
    }

    /* JADX INFO: renamed from: com.daaw.xo$c */
    public interface c {
        List a(Object obj);
    }

    public C9697xo(Object obj, c cVar) {
        this.a = obj;
        this.b = cVar;
    }

    public static C9697xo c(Context context, Class cls) {
        return new C9697xo(context, new b(cls));
    }

    public static ComponentRegistrar d(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
            }
            throw new R10(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
        } catch (ClassNotFoundException unused) {
            String.format("Class %s is not an found.", str);
            return null;
        } catch (IllegalAccessException e) {
            throw new R10(String.format("Could not instantiate %s.", str), e);
        } catch (InstantiationException e2) {
            throw new R10(String.format("Could not instantiate %s.", str), e2);
        } catch (NoSuchMethodException e3) {
            throw new R10(String.format("Could not instantiate %s", str), e3);
        } catch (InvocationTargetException e4) {
            throw new R10(String.format("Could not instantiate %s", str), e4);
        }
    }

    public List b() {
        ArrayList arrayList = new ArrayList();
        for (final String str : this.b.a(this.a)) {
            arrayList.add(new InterfaceC7569qB0() { // from class: com.daaw.wo
                @Override // com.daaw.InterfaceC7569qB0
                public final Object get() {
                    return C9697xo.d(str);
                }
            });
        }
        return arrayList;
    }
}
