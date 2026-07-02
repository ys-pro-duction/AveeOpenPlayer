package com.daaw;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Zj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2964Zj0 implements InterfaceC2627Wd {
    public final a a;
    public final C4689fu b;
    public final Map c;

    /* JADX INFO: renamed from: com.daaw.Zj0$a */
    public static class a {
        public final Context a;
        public Map b = null;

        public a(Context context) {
            this.a = context;
        }

        public static Bundle d(Context context) {
            ServiceInfo serviceInfo;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128)) == null) {
                    return null;
                }
                return serviceInfo.metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        public final Map a(Context context) {
            Bundle bundleD = d(context);
            if (bundleD == null) {
                return Collections.EMPTY_MAP;
            }
            HashMap map = new HashMap();
            for (String str : bundleD.keySet()) {
                Object obj = bundleD.get(str);
                if ((obj instanceof String) && str.startsWith("backend:")) {
                    for (String str2 : ((String) obj).split(",", -1)) {
                        String strTrim = str2.trim();
                        if (!strTrim.isEmpty()) {
                            map.put(strTrim, str.substring(8));
                        }
                    }
                }
            }
            return map;
        }

        public InterfaceC2523Vd b(String str) {
            String str2 = (String) c().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (InterfaceC2523Vd) Class.forName(str2).asSubclass(InterfaceC2523Vd.class).getDeclaredConstructor(null).newInstance(null);
            } catch (ClassNotFoundException unused) {
                String.format("Class %s is not found.", str2);
                return null;
            } catch (IllegalAccessException unused2) {
                String.format("Could not instantiate %s.", str2);
                return null;
            } catch (InstantiationException unused3) {
                String.format("Could not instantiate %s.", str2);
                return null;
            } catch (NoSuchMethodException unused4) {
                String.format("Could not instantiate %s", str2);
                return null;
            } catch (InvocationTargetException unused5) {
                String.format("Could not instantiate %s", str2);
                return null;
            }
        }

        public final Map c() {
            if (this.b == null) {
                this.b = a(this.a);
            }
            return this.b;
        }
    }

    public C2964Zj0(Context context, C4689fu c4689fu) {
        this(new a(context), c4689fu);
    }

    @Override // com.daaw.InterfaceC2627Wd
    public synchronized G51 a(String str) {
        if (this.c.containsKey(str)) {
            return (G51) this.c.get(str);
        }
        InterfaceC2523Vd interfaceC2523VdB = this.a.b(str);
        if (interfaceC2523VdB == null) {
            return null;
        }
        G51 g51Create = interfaceC2523VdB.create(this.b.a(str));
        this.c.put(str, g51Create);
        return g51Create;
    }

    public C2964Zj0(a aVar, C4689fu c4689fu) {
        this.c = new HashMap();
        this.a = aVar;
        this.b = c4689fu;
    }
}
