package com.daaw;

import android.content.Context;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.nS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C6799nS {
    public static final InterfaceC0657Dk0 d = new a();
    public final Map a = new HashMap();
    public final Map b = new HashMap();
    public final Context c;

    /* JADX INFO: renamed from: com.daaw.nS$a */
    public static class a implements InterfaceC0657Dk0 {
        @Override // com.daaw.InterfaceC0657Dk0
        public InterfaceC2177Rv a(Object obj, int i, int i2) {
            throw new NoSuchMethodError("This should never be called!");
        }

        public String toString() {
            return "NULL_MODEL_LOADER";
        }
    }

    public C6799nS(Context context) {
        this.c = context.getApplicationContext();
    }

    public synchronized InterfaceC0657Dk0 a(Class cls, Class cls2) {
        InterfaceC0657Dk0 interfaceC0657Dk0D = d(cls, cls2);
        if (interfaceC0657Dk0D != null) {
            if (d.equals(interfaceC0657Dk0D)) {
                return null;
            }
            return interfaceC0657Dk0D;
        }
        InterfaceC0761Ek0 interfaceC0761Ek0E = e(cls, cls2);
        if (interfaceC0761Ek0E != null) {
            interfaceC0657Dk0D = interfaceC0761Ek0E.a(this.c, this);
            b(cls, cls2, interfaceC0657Dk0D);
        } else {
            c(cls, cls2);
        }
        return interfaceC0657Dk0D;
    }

    public final void b(Class cls, Class cls2, InterfaceC0657Dk0 interfaceC0657Dk0) {
        Map map = (Map) this.b.get(cls);
        if (map == null) {
            map = new HashMap();
            this.b.put(cls, map);
        }
        map.put(cls2, interfaceC0657Dk0);
    }

    public final void c(Class cls, Class cls2) {
        b(cls, cls2, d);
    }

    public final InterfaceC0657Dk0 d(Class cls, Class cls2) {
        Map map = (Map) this.b.get(cls);
        if (map != null) {
            return (InterfaceC0657Dk0) map.get(cls2);
        }
        return null;
    }

    public final InterfaceC0761Ek0 e(Class cls, Class cls2) {
        Map map;
        Map map2 = (Map) this.a.get(cls);
        InterfaceC0761Ek0 interfaceC0761Ek0 = map2 != null ? (InterfaceC0761Ek0) map2.get(cls2) : null;
        if (interfaceC0761Ek0 == null) {
            for (Class cls3 : this.a.keySet()) {
                if (cls3.isAssignableFrom(cls) && (map = (Map) this.a.get(cls3)) != null && (interfaceC0761Ek0 = (InterfaceC0761Ek0) map.get(cls2)) != null) {
                    break;
                }
            }
        }
        return interfaceC0761Ek0;
    }

    public synchronized InterfaceC0761Ek0 f(Class cls, Class cls2, InterfaceC0761Ek0 interfaceC0761Ek0) {
        InterfaceC0761Ek0 interfaceC0761Ek02;
        try {
            this.b.clear();
            Map map = (Map) this.a.get(cls);
            if (map == null) {
                map = new HashMap();
                this.a.put(cls, map);
            }
            interfaceC0761Ek02 = (InterfaceC0761Ek0) map.put(cls2, interfaceC0761Ek0);
            if (interfaceC0761Ek02 != null) {
                Iterator it = this.a.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((Map) it.next()).containsValue(interfaceC0761Ek02)) {
                        interfaceC0761Ek02 = null;
                        break;
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return interfaceC0761Ek02;
    }
}
