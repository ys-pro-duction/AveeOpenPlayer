package com.daaw;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* JADX INFO: renamed from: com.daaw.Ne0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1672Ne0 {
    public static final Map a = new HashMap();
    public static final byte[] b = {80, 75, 3, 4};

    public static boolean A(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static Boolean B(InterfaceC7424ph interfaceC7424ph) {
        try {
            InterfaceC7424ph interfaceC7424phPeek = interfaceC7424ph.peek();
            for (byte b2 : b) {
                if (interfaceC7424phPeek.j0() != b2) {
                    return Boolean.FALSE;
                }
            }
            interfaceC7424phPeek.close();
            return Boolean.TRUE;
        } catch (Exception e) {
            AbstractC1876Pd0.b("Failed to check zip file header", e);
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused) {
            return Boolean.FALSE;
        }
    }

    public static String C(Context context, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("rawRes");
        sb.append(A(context) ? "_night_" : "_day_");
        sb.append(i);
        return sb.toString();
    }

    public static /* synthetic */ C7415pf0 a(WeakReference weakReference, Context context, int i, String str) {
        Context context2 = (Context) weakReference.get();
        if (context2 != null) {
            context = context2;
        }
        return v(context, i, str);
    }

    public static /* synthetic */ C7415pf0 b(Context context, String str, String str2) {
        C7415pf0 c7415pf0C = U80.d(context).c(str, str2);
        if (str2 != null && c7415pf0C.b() != null) {
            C0841Fe0.b().c(str2, (C0737Ee0) c7415pf0C.b());
        }
        return c7415pf0C;
    }

    public static /* synthetic */ void c(String str, AtomicBoolean atomicBoolean, Throwable th) {
        a.remove(str);
        atomicBoolean.set(true);
    }

    public static /* synthetic */ void f(String str, AtomicBoolean atomicBoolean, C0737Ee0 c0737Ee0) {
        a.remove(str);
        atomicBoolean.set(true);
    }

    public static /* synthetic */ C7415pf0 g(C0737Ee0 c0737Ee0) {
        return new C7415pf0(c0737Ee0);
    }

    public static C7972rf0 h(final String str, Callable callable) {
        final C0737Ee0 c0737Ee0A = str == null ? null : C0841Fe0.b().a(str);
        if (c0737Ee0A != null) {
            return new C7972rf0(new Callable() { // from class: com.daaw.Je0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return AbstractC1672Ne0.g(c0737Ee0A);
                }
            });
        }
        if (str != null) {
            Map map = a;
            if (map.containsKey(str)) {
                return (C7972rf0) map.get(str);
            }
        }
        C7972rf0 c7972rf0 = new C7972rf0(callable);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            c7972rf0.d(new InterfaceC6011kf0() { // from class: com.daaw.Ke0
                @Override // com.daaw.InterfaceC6011kf0
                public final void onResult(Object obj) {
                    AbstractC1672Ne0.f(str, atomicBoolean, (C0737Ee0) obj);
                }
            });
            c7972rf0.c(new InterfaceC6011kf0() { // from class: com.daaw.Le0
                @Override // com.daaw.InterfaceC6011kf0
                public final void onResult(Object obj) {
                    AbstractC1672Ne0.c(str, atomicBoolean, (Throwable) obj);
                }
            });
            if (!atomicBoolean.get()) {
                a.put(str, c7972rf0);
            }
        }
        return c7972rf0;
    }

    public static C5732jf0 i(C0737Ee0 c0737Ee0, String str) {
        for (C5732jf0 c5732jf0 : c0737Ee0.j().values()) {
            if (c5732jf0.b().equals(str)) {
                return c5732jf0;
            }
        }
        return null;
    }

    public static C7972rf0 j(Context context, String str) {
        return k(context, str, "asset_" + str);
    }

    public static C7972rf0 k(Context context, final String str, final String str2) {
        final Context applicationContext = context.getApplicationContext();
        return h(str2, new Callable() { // from class: com.daaw.Ie0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return AbstractC1672Ne0.m(applicationContext, str, str2);
            }
        });
    }

    public static C7415pf0 l(Context context, String str) {
        return m(context, str, "asset_" + str);
    }

    public static C7415pf0 m(Context context, String str, String str2) {
        try {
            if (!str.endsWith(".zip") && !str.endsWith(".lottie")) {
                return o(context.getAssets().open(str), str2);
            }
            return y(new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e) {
            return new C7415pf0((Throwable) e);
        }
    }

    public static C7972rf0 n(final InputStream inputStream, final String str) {
        return h(str, new Callable() { // from class: com.daaw.He0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return AbstractC1672Ne0.o(inputStream, str);
            }
        });
    }

    public static C7415pf0 o(InputStream inputStream, String str) {
        return p(inputStream, str, true);
    }

    public static C7415pf0 p(InputStream inputStream, String str, boolean z) {
        try {
            return q(AbstractC6977o40.U(AbstractC2468Up0.b(AbstractC2468Up0.f(inputStream))), str);
        } finally {
            if (z) {
                AbstractC0301Ab1.c(inputStream);
            }
        }
    }

    public static C7415pf0 q(AbstractC6977o40 abstractC6977o40, String str) {
        return r(abstractC6977o40, str, true);
    }

    public static C7415pf0 r(AbstractC6977o40 abstractC6977o40, String str, boolean z) {
        try {
            try {
                C0737Ee0 c0737Ee0A = AbstractC1776Oe0.a(abstractC6977o40);
                if (str != null) {
                    C0841Fe0.b().c(str, c0737Ee0A);
                }
                C7415pf0 c7415pf0 = new C7415pf0(c0737Ee0A);
                if (z) {
                    AbstractC0301Ab1.c(abstractC6977o40);
                }
                return c7415pf0;
            } catch (Exception e) {
                C7415pf0 c7415pf02 = new C7415pf0((Throwable) e);
                if (z) {
                    AbstractC0301Ab1.c(abstractC6977o40);
                }
                return c7415pf02;
            }
        } catch (Throwable th) {
            if (z) {
                AbstractC0301Ab1.c(abstractC6977o40);
            }
            throw th;
        }
    }

    public static C7972rf0 s(Context context, int i) {
        return t(context, i, C(context, i));
    }

    public static C7972rf0 t(Context context, final int i, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return h(str, new Callable() { // from class: com.daaw.Me0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return AbstractC1672Ne0.a(weakReference, applicationContext, i, str);
            }
        });
    }

    public static C7415pf0 u(Context context, int i) {
        return v(context, i, C(context, i));
    }

    public static C7415pf0 v(Context context, int i, String str) {
        try {
            InterfaceC7424ph interfaceC7424phB = AbstractC2468Up0.b(AbstractC2468Up0.f(context.getResources().openRawResource(i)));
            return B(interfaceC7424phB).booleanValue() ? y(new ZipInputStream(interfaceC7424phB.e1()), str) : o(interfaceC7424phB.e1(), str);
        } catch (Resources.NotFoundException e) {
            return new C7415pf0((Throwable) e);
        }
    }

    public static C7972rf0 w(Context context, String str) {
        return x(context, str, "url_" + str);
    }

    public static C7972rf0 x(final Context context, final String str, final String str2) {
        return h(str2, new Callable() { // from class: com.daaw.Ge0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return AbstractC1672Ne0.b(context, str, str2);
            }
        });
    }

    public static C7415pf0 y(ZipInputStream zipInputStream, String str) {
        try {
            return z(zipInputStream, str);
        } finally {
            AbstractC0301Ab1.c(zipInputStream);
        }
    }

    public static C7415pf0 z(ZipInputStream zipInputStream, String str) {
        HashMap map = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            C0737Ee0 c0737Ee0 = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(".json")) {
                    c0737Ee0 = (C0737Ee0) r(AbstractC6977o40.U(AbstractC2468Up0.b(AbstractC2468Up0.f(zipInputStream))), null, false).b();
                } else if (name.contains(".png") || name.contains(".webp") || name.contains(".jpg") || name.contains(".jpeg")) {
                    map.put(name.split("/")[r1.length - 1], BitmapFactory.decodeStream(zipInputStream));
                } else {
                    zipInputStream.closeEntry();
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (c0737Ee0 == null) {
                return new C7415pf0((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : map.entrySet()) {
                C5732jf0 c5732jf0I = i(c0737Ee0, (String) entry.getKey());
                if (c5732jf0I != null) {
                    c5732jf0I.f(AbstractC0301Ab1.l((Bitmap) entry.getValue(), c5732jf0I.e(), c5732jf0I.c()));
                }
            }
            for (Map.Entry entry2 : c0737Ee0.j().entrySet()) {
                if (((C5732jf0) entry2.getValue()).a() == null) {
                    return new C7415pf0((Throwable) new IllegalStateException("There is no image for " + ((C5732jf0) entry2.getValue()).b()));
                }
            }
            if (str != null) {
                C0841Fe0.b().c(str, c0737Ee0);
            }
            return new C7415pf0(c0737Ee0);
        } catch (IOException e) {
            return new C7415pf0((Throwable) e);
        }
    }
}
