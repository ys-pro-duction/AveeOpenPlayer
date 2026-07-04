package com.daaw;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

/* JADX INFO: renamed from: com.daaw.Nl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1700Nl0 {
    public static final Set a = new HashSet();
    public static final boolean b = n(System.getProperty("java.vm.version"));

    /* JADX INFO: renamed from: com.daaw.Nl0$a */
    public static final class a {
        public static void a(ClassLoader classLoader, List list, File file) throws IllegalAccessException, NoSuchFieldException, IOException {
            IOException[] iOExceptionArr;
            Object obj = AbstractC1700Nl0.g(classLoader, "pathList").get(classLoader);
            ArrayList<IOException> arrayList = new ArrayList();
            AbstractC1700Nl0.f(obj, "dexElements", b(obj, new ArrayList(list), file, arrayList));
            if (arrayList.size() > 0) {
                for (IOException iOException : arrayList) {
                }
                Field fieldG = AbstractC1700Nl0.g(obj, "dexElementsSuppressedExceptions");
                IOException[] iOExceptionArr2 = (IOException[]) fieldG.get(obj);
                if (iOExceptionArr2 == null) {
                    iOExceptionArr = (IOException[]) arrayList.toArray(new IOException[arrayList.size()]);
                } else {
                    IOException[] iOExceptionArr3 = new IOException[arrayList.size() + iOExceptionArr2.length];
                    arrayList.toArray(iOExceptionArr3);
                    System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList.size(), iOExceptionArr2.length);
                    iOExceptionArr = iOExceptionArr3;
                }
                fieldG.set(obj, iOExceptionArr);
                IOException iOException2 = new IOException("I/O exception during makeDexElement");
                iOException2.initCause((Throwable) arrayList.get(0));
                throw iOException2;
            }
        }

        public static Object[] b(Object obj, ArrayList arrayList, File file, ArrayList arrayList2) {
            return (Object[]) AbstractC1700Nl0.h(obj, "makeDexElements", ArrayList.class, File.class, ArrayList.class).invoke(obj, arrayList, file, arrayList2);
        }
    }

    public static void d(Context context) {
        File file = new File(context.getFilesDir(), "secondary-dexes");
        if (file.isDirectory()) {
            file.getPath();
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                file.getPath();
                return;
            }
            for (File file2 : fileArrListFiles) {
                file2.getPath();
                file2.length();
                if (file2.delete()) {
                    file2.getPath();
                } else {
                    file2.getPath();
                }
            }
            if (file.delete()) {
                file.getPath();
            } else {
                file.getPath();
            }
        }
    }

    public static void e(Context context, File file, File file2, String str, String str2, boolean z) {
        Set set = a;
        synchronized (set) {
            try {
                if (set.contains(file)) {
                    return;
                }
                set.add(file);
                System.getProperty("java.vm.version");
                ClassLoader classLoaderJ = j(context);
                if (classLoaderJ == null) {
                    return;
                }
                try {
                    d(context);
                } catch (Throwable unused) {
                }
                File fileK = k(context, file2, str);
                C1908Pl0 c1908Pl0 = new C1908Pl0(file, fileK);
                try {
                    try {
                        m(classLoaderJ, fileK, c1908Pl0.F(context, str2, false));
                    } catch (IOException e) {
                        if (!z) {
                            throw e;
                        }
                        m(classLoaderJ, fileK, c1908Pl0.F(context, str2, true));
                    }
                    try {
                        e = null;
                    } catch (IOException e2) {
                        e = e2;
                    }
                    if (e != null) {
                        throw e;
                    }
                } finally {
                    try {
                        c1908Pl0.close();
                    } catch (IOException unused2) {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void f(Object obj, String str, Object[] objArr) throws IllegalAccessException, NoSuchFieldException {
        Field fieldG = g(obj, str);
        Object[] objArr2 = (Object[]) fieldG.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        fieldG.set(obj, objArr3);
    }

    public static Field g(Object obj, String str) throws NoSuchFieldException {
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Field declaredField = superclass.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        throw new NoSuchFieldException("Field " + str + " not found in " + obj.getClass());
    }

    public static Method h(Object obj, String str, Class... clsArr) throws NoSuchMethodException {
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Method declaredMethod = superclass.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
            }
        }
        throw new NoSuchMethodException("Method " + str + " with parameters " + Arrays.asList(clsArr) + " not found in " + obj.getClass());
    }

    public static ApplicationInfo i(Context context) {
        try {
            return context.getApplicationInfo();
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static ClassLoader j(Context context) {
        ClassLoader classLoader;
        try {
            classLoader = context.getClassLoader();
        } catch (RuntimeException unused) {
        }
        if (classLoader instanceof BaseDexClassLoader) {
            return classLoader;
        }
        return null;
    }

    public static File k(Context context, File file, String str) throws IOException {
        File file2 = new File(file, "code_cache");
        try {
            o(file2);
        } catch (IOException unused) {
            file2 = new File(context.getFilesDir(), "code_cache");
            o(file2);
        }
        File file3 = new File(file2, str);
        o(file3);
        return file3;
    }

    public static void l(Context context) {
        if (b) {
            return;
        }
        try {
            ApplicationInfo applicationInfoI = i(context);
            if (applicationInfoI == null) {
                return;
            }
            e(context, new File(applicationInfoI.sourceDir), new File(applicationInfoI.dataDir), "secondary-dexes", "", true);
        } catch (Exception e) {
            throw new RuntimeException("MultiDex installation failed (" + e.getMessage() + ").");
        }
    }

    public static void m(ClassLoader classLoader, File file, List list) throws IllegalAccessException, NoSuchFieldException, IOException {
        if (list.isEmpty()) {
            return;
        }
        a.a(classLoader, list, file);
    }

    public static boolean n(String str) {
        if (str == null) {
            return false;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
        String strNextToken = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
        String strNextToken2 = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
        if (strNextToken == null || strNextToken2 == null) {
            return false;
        }
        try {
            int i = Integer.parseInt(strNextToken);
            return i > 2 || (i == 2 && Integer.parseInt(strNextToken2) >= 1);
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static void o(File file) throws IOException {
        file.mkdir();
        if (file.isDirectory()) {
            return;
        }
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            file.getPath();
        } else {
            file.getPath();
            parentFile.isDirectory();
            parentFile.isFile();
            parentFile.exists();
            parentFile.canRead();
            parentFile.canWrite();
        }
        throw new IOException("Failed to create directory " + file.getPath());
    }
}
