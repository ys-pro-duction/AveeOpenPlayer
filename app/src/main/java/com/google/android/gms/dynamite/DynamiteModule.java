package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import com.daaw.A82;
import com.daaw.AbstractC7506py0;
import com.daaw.AbstractC8022rp0;
import com.daaw.AbstractC9164vt;
import com.daaw.BinderC7744qp0;
import com.daaw.Bn3;
import com.daaw.C6616mm3;
import com.daaw.C9387wh3;
import com.daaw.C9599xT;
import com.daaw.InterfaceC7934rX;
import com.daaw.Nk3;
import com.google.android.gms.common.util.DynamiteApi;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class DynamiteModule {
    public static Boolean h = null;
    public static String i = null;
    public static boolean j = false;
    public static int k = -1;
    public static Boolean l;
    public static C6616mm3 q;
    public static Bn3 r;
    public final Context a;
    public static final ThreadLocal m = new ThreadLocal();
    public static final ThreadLocal n = new A82();
    public static final b.a o = new com.google.android.gms.dynamite.a();
    public static final b b = new com.google.android.gms.dynamite.b();
    public static final b c = new c();
    public static final b d = new d();
    public static final b e = new e();
    public static final b f = new f();
    public static final b g = new g();
    public static final b p = new h();

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    public static class a extends Exception {
        public /* synthetic */ a(String str, Nk3 nk3) {
            super(str);
        }

        public /* synthetic */ a(String str, Throwable th, Nk3 nk3) {
            super(str, th);
        }
    }

    public interface b {

        public interface a {
            int a(Context context, String str, boolean z);

            int b(Context context, String str);
        }

        /* JADX INFO: renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b, reason: collision with other inner class name */
        public static class C0262b {
            public int a = 0;
            public int b = 0;
            public int c = 0;
        }

        C0262b a(Context context, String str, a aVar);
    }

    public DynamiteModule(Context context) {
        AbstractC7506py0.l(context);
        this.a = context;
    }

    public static int a(Context context, String str) {
        try {
            Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (AbstractC8022rp0.a(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String.valueOf(declaredField.get(null));
            return 0;
        } catch (ClassNotFoundException unused) {
            return 0;
        } catch (Exception e2) {
            "Failed to load module descriptor class: ".concat(String.valueOf(e2.getMessage()));
            return 0;
        }
    }

    public static int c(Context context, String str) {
        return f(context, str, false);
    }

    public static DynamiteModule e(Context context, b bVar, String str) throws Throwable {
        long j2;
        DynamiteModule dynamiteModuleH;
        Boolean bool;
        InterfaceC7934rX interfaceC7934rXC3;
        DynamiteModule dynamiteModule;
        Bn3 bn3;
        boolean z;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new a("null application Context", null);
        }
        ThreadLocal threadLocal = m;
        C9387wh3 c9387wh3 = (C9387wh3) threadLocal.get();
        C9387wh3 c9387wh32 = new C9387wh3(null);
        threadLocal.set(c9387wh32);
        ThreadLocal threadLocal2 = n;
        Long l2 = (Long) threadLocal2.get();
        long jLongValue = l2.longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
            b.C0262b c0262bA = bVar.a(context, str, o);
            int i2 = c0262bA.a;
            int i3 = c0262bA.c;
            if (i3 != 0) {
                if (i3 == -1) {
                    if (c0262bA.a != 0) {
                        i3 = -1;
                    }
                }
                j2 = 0;
                if (i3 == 1) {
                    try {
                        if (c0262bA.b != 0) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (jLongValue == j2) {
                            n.remove();
                        } else {
                            n.set(l2);
                        }
                        Cursor cursor = c9387wh32.a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        m.set(c9387wh3);
                        throw th;
                    }
                }
                if (i3 == -1) {
                    dynamiteModuleH = h(applicationContext, str);
                } else {
                    if (i3 != 1) {
                        throw new a("VersionPolicy returned invalid code:" + i3, null);
                    }
                    try {
                        int i4 = c0262bA.b;
                        try {
                            synchronized (DynamiteModule.class) {
                                if (!k(context)) {
                                    throw new a("Remote loading disabled", null);
                                }
                                bool = h;
                            }
                            if (bool == null) {
                                throw new a("Failed to determine which loading route to use.", null);
                            }
                            if (bool.booleanValue()) {
                                synchronized (DynamiteModule.class) {
                                    bn3 = r;
                                }
                                if (bn3 == null) {
                                    throw new a("DynamiteLoaderV2 was not cached.", null);
                                }
                                C9387wh3 c9387wh33 = (C9387wh3) threadLocal.get();
                                if (c9387wh33 == null || c9387wh33.a == null) {
                                    throw new a("No result cursor", null);
                                }
                                Context applicationContext2 = context.getApplicationContext();
                                Cursor cursor2 = c9387wh33.a;
                                BinderC7744qp0.Z2(null);
                                synchronized (DynamiteModule.class) {
                                    z = k >= 2;
                                }
                                Context context2 = (Context) BinderC7744qp0.I(z ? bn3.Z2(BinderC7744qp0.Z2(applicationContext2), str, i4, BinderC7744qp0.Z2(cursor2)) : bn3.I(BinderC7744qp0.Z2(applicationContext2), str, i4, BinderC7744qp0.Z2(cursor2)));
                                if (context2 == null) {
                                    throw new a("Failed to get module context", null);
                                }
                                dynamiteModule = new DynamiteModule(context2);
                            } else {
                                C6616mm3 c6616mm3L = l(context);
                                if (c6616mm3L == null) {
                                    throw new a("Failed to create IDynamiteLoader.", null);
                                }
                                int iZze = c6616mm3L.zze();
                                if (iZze >= 3) {
                                    C9387wh3 c9387wh34 = (C9387wh3) threadLocal.get();
                                    if (c9387wh34 == null) {
                                        throw new a("No cached result cursor holder", null);
                                    }
                                    interfaceC7934rXC3 = c6616mm3L.b3(BinderC7744qp0.Z2(context), str, i4, BinderC7744qp0.Z2(c9387wh34.a));
                                } else {
                                    interfaceC7934rXC3 = iZze == 2 ? c6616mm3L.c3(BinderC7744qp0.Z2(context), str, i4) : c6616mm3L.a3(BinderC7744qp0.Z2(context), str, i4);
                                }
                                Object objI = BinderC7744qp0.I(interfaceC7934rXC3);
                                if (objI == null) {
                                    throw new a("Failed to load remote module.", null);
                                }
                                dynamiteModule = new DynamiteModule((Context) objI);
                            }
                            dynamiteModuleH = dynamiteModule;
                        } catch (RemoteException e2) {
                            throw new a("Failed to load remote module.", e2, null);
                        } catch (a e3) {
                            throw e3;
                        } catch (Throwable th2) {
                            AbstractC9164vt.a(context, th2);
                            throw new a("Failed to load remote module.", th2, null);
                        }
                    } catch (a e4) {
                        e4.getMessage();
                        int i5 = c0262bA.a;
                        if (i5 == 0 || bVar.a(context, str, new i(i5, 0)).c != -1) {
                            throw new a("Remote load failed. No local fallback found.", e4, null);
                        }
                        dynamiteModuleH = h(applicationContext, str);
                    }
                }
                if (jLongValue == 0) {
                    n.remove();
                } else {
                    n.set(l2);
                }
                Cursor cursor3 = c9387wh32.a;
                if (cursor3 != null) {
                    cursor3.close();
                }
                m.set(c9387wh3);
                return dynamiteModuleH;
            }
            throw new a("No acceptable module " + str + " found. Local version is " + c0262bA.a + " and remote version is " + c0262bA.b + ".", null);
        } catch (Throwable th3) {
            th = th3;
            j2 = 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0150 A[Catch: all -> 0x00d5, TRY_LEAVE, TryCatch #10 {all -> 0x00d5, blocks: (B:3:0x0002, B:64:0x00ca, B:66:0x00d0, B:74:0x00df, B:104:0x0145, B:109:0x0150, B:125:0x017b, B:126:0x017e, B:120:0x0173, B:72:0x00db, B:128:0x0180, B:4:0x0003, B:7:0x0009, B:8:0x0025, B:62:0x00c7, B:21:0x0049, B:45:0x00a1, B:48:0x00a4, B:55:0x00bc, B:63:0x00c9, B:61:0x00c2), top: B:139:0x0002, inners: #5, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x017b A[Catch: all -> 0x00d5, TryCatch #10 {all -> 0x00d5, blocks: (B:3:0x0002, B:64:0x00ca, B:66:0x00d0, B:74:0x00df, B:104:0x0145, B:109:0x0150, B:125:0x017b, B:126:0x017e, B:120:0x0173, B:72:0x00db, B:128:0x0180, B:4:0x0003, B:7:0x0009, B:8:0x0025, B:62:0x00c7, B:21:0x0049, B:45:0x00a1, B:48:0x00a4, B:55:0x00bc, B:63:0x00c9, B:61:0x00c2), top: B:139:0x0002, inners: #5, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:? A[Catch: all -> 0x00d5, SYNTHETIC, TRY_LEAVE, TryCatch #10 {all -> 0x00d5, blocks: (B:3:0x0002, B:64:0x00ca, B:66:0x00d0, B:74:0x00df, B:104:0x0145, B:109:0x0150, B:125:0x017b, B:126:0x017e, B:120:0x0173, B:72:0x00db, B:128:0x0180, B:4:0x0003, B:7:0x0009, B:8:0x0025, B:62:0x00c7, B:21:0x0049, B:45:0x00a1, B:48:0x00a4, B:55:0x00bc, B:63:0x00c9, B:61:0x00c2), top: B:139:0x0002, inners: #5, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b0 A[Catch: all -> 0x0036, TryCatch #11 {, blocks: (B:9:0x0026, B:11:0x0032, B:52:0x00b9, B:16:0x003b, B:18:0x0042, B:20:0x0048, B:25:0x004f, B:27:0x0053, B:31:0x005d, B:33:0x0065, B:36:0x006c, B:43:0x0098, B:44:0x00a0, B:39:0x0073, B:41:0x0079, B:42:0x008a, B:47:0x00a3, B:50:0x00a6, B:51:0x00b0, B:17:0x003e), top: B:140:0x0026, inners: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int f(android.content.Context r10, java.lang.String r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 389
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.f(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int g(android.content.Context r9, java.lang.String r10, boolean r11, boolean r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.g(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    public static DynamiteModule h(Context context, String str) {
        "Selected local version of ".concat(String.valueOf(str));
        return new DynamiteModule(context);
    }

    public static void i(ClassLoader classLoader) throws a {
        Bn3 bn3;
        Nk3 nk3 = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder == null) {
                bn3 = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                bn3 = iInterfaceQueryLocalInterface instanceof Bn3 ? (Bn3) iInterfaceQueryLocalInterface : new Bn3(iBinder);
            }
            r = bn3;
        } catch (ClassNotFoundException e2) {
            e = e2;
            throw new a("Failed to instantiate dynamite loader", e, nk3);
        } catch (IllegalAccessException e3) {
            e = e3;
            throw new a("Failed to instantiate dynamite loader", e, nk3);
        } catch (InstantiationException e4) {
            e = e4;
            throw new a("Failed to instantiate dynamite loader", e, nk3);
        } catch (NoSuchMethodException e5) {
            e = e5;
            throw new a("Failed to instantiate dynamite loader", e, nk3);
        } catch (InvocationTargetException e6) {
            e = e6;
            throw new a("Failed to instantiate dynamite loader", e, nk3);
        }
    }

    public static boolean j(Cursor cursor) {
        C9387wh3 c9387wh3 = (C9387wh3) m.get();
        if (c9387wh3 == null || c9387wh3.a != null) {
            return false;
        }
        c9387wh3.a = cursor;
        return true;
    }

    public static boolean k(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(l)) {
            return true;
        }
        boolean z = false;
        if (l == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (C9599xT.f().h(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z = true;
            }
            l = Boolean.valueOf(z);
            if (z && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                j = true;
            }
        }
        return z;
    }

    public static C6616mm3 l(Context context) {
        C6616mm3 c6616mm3;
        synchronized (DynamiteModule.class) {
            C6616mm3 c6616mm32 = q;
            if (c6616mm32 != null) {
                return c6616mm32;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    c6616mm3 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    c6616mm3 = iInterfaceQueryLocalInterface instanceof C6616mm3 ? (C6616mm3) iInterfaceQueryLocalInterface : new C6616mm3(iBinder);
                }
                if (c6616mm3 != null) {
                    q = c6616mm3;
                    return c6616mm3;
                }
            } catch (Exception e2) {
                e2.getMessage();
            }
            return null;
        }
    }

    public Context b() {
        return this.a;
    }

    public IBinder d(String str) throws a {
        try {
            return (IBinder) this.a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            throw new a("Failed to instantiate module class: ".concat(String.valueOf(str)), e2, null);
        }
    }
}
