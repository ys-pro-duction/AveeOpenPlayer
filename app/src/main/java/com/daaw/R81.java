package com.daaw;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.OsConstants;
import com.daaw.OO;
import com.daaw.TO;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class R81 extends W81 {
    public static Class b = null;
    public static Constructor c = null;
    public static Method d = null;
    public static Method e = null;
    public static boolean f = false;

    public static boolean h(Object obj, String str, int i, boolean z) throws NoSuchMethodException {
        k();
        try {
        } catch (IllegalAccessException | InvocationTargetException e2) {
            e = e2;
        }
        try {
            return ((Boolean) d.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (InvocationTargetException e3) {
            e = e3;
            throw new RuntimeException(e);
        }
    }

    private static Typeface i(Object obj) throws NoSuchMethodException {
        Object objNewInstance;
        k();
        try {
            objNewInstance = Array.newInstance((Class<?>) b, 1);
            Array.set(objNewInstance, 0, obj);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            e = e2;
        }
        try {
            return (Typeface) e.invoke(null, objNewInstance);
        } catch (InvocationTargetException e3) {
            e = e3;
            throw new RuntimeException(e);
        }
    }

    public static void k() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f) {
            return;
        }
        f = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            method = null;
            cls = null;
            method2 = null;
        }
        c = constructor;
        b = cls;
        d = method2;
        e = method;
    }

    private static Object l() throws NoSuchMethodException {
        k();
        try {
            return c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // com.daaw.W81
    public Typeface a(Context context, OO.c cVar, Resources resources, int i) throws NoSuchMethodException {
        Object objL = l();
        for (OO.d dVar : cVar.a()) {
            File fileE = X81.e(context);
            if (fileE == null) {
                return null;
            }
            try {
                if (!X81.c(fileE, resources, dVar.b())) {
                    return null;
                }
                if (!h(objL, fileE.getPath(), dVar.e(), dVar.f())) {
                    return null;
                }
                fileE.delete();
            } catch (RuntimeException unused) {
                return null;
            } finally {
                fileE.delete();
            }
        }
        return i(objL);
    }

    @Override // com.daaw.W81
    public Typeface b(Context context, CancellationSignal cancellationSignal, TO.b[] bVarArr, int i) {
        Typeface typefaceC;
        if (bVarArr.length < 1) {
            return null;
        }
        TO.b bVarG = g(bVarArr, i);
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(bVarG.d(), "r", cancellationSignal);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return null;
            }
            try {
                File fileJ = j(parcelFileDescriptorOpenFileDescriptor);
                if (fileJ == null || !fileJ.canRead()) {
                    FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    try {
                        typefaceC = super.c(context, fileInputStream);
                        fileInputStream.close();
                    } finally {
                    }
                } else {
                    typefaceC = Typeface.createFromFile(fileJ);
                }
                parcelFileDescriptorOpenFileDescriptor.close();
                return typefaceC;
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public final File j(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String str = android.system.Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(android.system.Os.stat(str).st_mode)) {
                return new File(str);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }
}
