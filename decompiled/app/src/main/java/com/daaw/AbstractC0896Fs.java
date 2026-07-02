package com.daaw;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.daaw.Fs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0896Fs {
    public static String[] a = {"/storage/sdcard1", "/storage/extsdcard", "/storage/sdcard0/external_sdcard", "/mnt/extsdcard", "/mnt/sdcard/external_sd", "/mnt/external_sd", "/mnt/media_rw/sdcard1", "/removable/microsd", "/mnt/emmc", "/storage/external_SD", "/storage/ext_sd", "/storage/removable/sdcard1", "/data/sdext", "/data/sdext2", "/data/sdext3", "/data/sdext4", "/sdcard1", "/sdcard2", "/storage/usbdisk0", "/storage/usbdisk1", "/storage/usbdisk2"};

    public static void a(Context context, List list) {
        for (File file : context.getExternalFilesDirs("external")) {
            if (file != null) {
                int iLastIndexOf = file.getAbsolutePath().lastIndexOf("/Android/data");
                if (iLastIndexOf < 0) {
                    file.getAbsolutePath();
                } else {
                    String strSubstring = file.getAbsolutePath().substring(0, iLastIndexOf);
                    try {
                        strSubstring = new File(strSubstring).getCanonicalPath();
                    } catch (IOException unused) {
                    }
                    list.add(strSubstring);
                }
            }
        }
        if (list.isEmpty()) {
            list.add("/storage/sdcard1");
        }
    }

    public static String b() {
        return g(Environment.getExternalStorageDirectory().getAbsolutePath(), '/');
    }

    public static String c(String str, String str2, Context context) {
        if (context != null && str != null) {
            if ("-03".equals(str)) {
                return context.getString(JD0.k1);
            }
            if (str.startsWith("-02")) {
                return context.getString(JD0.l1);
            }
        }
        if (str2 == null) {
            return "<unnamed>";
        }
        try {
            return str2.substring(str2.lastIndexOf("/") + 1);
        } catch (Exception unused) {
            return str2;
        }
    }

    public static String d(Context context) {
        List listE = e(context);
        String lowerCase = b().toLowerCase();
        ArrayList<String> arrayList = new ArrayList(listE.size());
        Iterator it = listE.iterator();
        while (it.hasNext()) {
            String lowerCase2 = g((String) it.next(), '/').toLowerCase();
            if (!lowerCase.equals(lowerCase2)) {
                arrayList.add(lowerCase2);
            }
        }
        List listAsList = Arrays.asList(a);
        String str = "";
        for (String str2 : arrayList) {
            if (!listAsList.contains(str2)) {
                str = str2;
            }
        }
        if (g(str, '/').isEmpty()) {
            File file = new File("/storage/sdcard1");
            if (file.exists()) {
                return file.getAbsolutePath();
            }
            if (arrayList.size() > 0) {
                str = (String) arrayList.get(0);
            }
        }
        return g(str, '/');
    }

    public static List e(Context context) {
        ArrayList arrayList = new ArrayList();
        String str = System.getenv("EXTERNAL_STORAGE");
        String str2 = System.getenv("SECONDARY_STORAGE");
        String str3 = System.getenv("EMULATED_STORAGE_TARGET");
        if (!TextUtils.isEmpty(str3)) {
            String str4 = Pattern.compile("/").split(Environment.getExternalStorageDirectory().getAbsolutePath())[r5.length - 1];
            try {
                Integer.valueOf(str4);
            } catch (NumberFormatException unused) {
                str4 = "";
            }
            if (TextUtils.isEmpty(str4)) {
                arrayList.add(str3);
            } else {
                arrayList.add(str3 + File.separator + str4);
            }
        } else if (f()) {
            a(context, arrayList);
        } else if (TextUtils.isEmpty(str)) {
            Collections.addAll(arrayList, a);
        } else {
            arrayList.add(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            Collections.addAll(arrayList, str2.split(File.pathSeparator));
        }
        return arrayList;
    }

    public static boolean f() {
        return Build.VERSION.SDK_INT >= 23;
    }

    public static String g(String str, char c) {
        int length = str.length();
        while (length > 0 && str.charAt(length - 1) == c) {
            length--;
        }
        return str.substring(0, length);
    }
}
