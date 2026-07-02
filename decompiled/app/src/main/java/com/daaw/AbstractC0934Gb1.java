package com.daaw;

import android.content.Context;
import android.content.res.Resources;
import android.media.MediaScannerConnection;
import android.net.Uri;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.daaw.Gb1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0934Gb1 {

    /* JADX INFO: renamed from: com.daaw.Gb1$b */
    public static class b extends RuntimeException {
        public b(String str) {
            super(str);
        }
    }

    public static void a(InputStream inputStream, File file) throws IOException {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i <= 0) {
                        fileOutputStream.close();
                        inputStream.close();
                        return;
                    }
                    fileOutputStream.write(bArr, 0, i);
                }
            } finally {
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static File b(File file, String str) {
        String strC = c(str);
        String strD = d(str);
        File file2 = new File(file, str);
        int i = 0;
        while (file2.exists()) {
            i++;
            file2 = new File(file, strD + " (" + i + ")" + strC);
        }
        return file2;
    }

    public static String c(String str) {
        if (str == null || str.lastIndexOf(46) == -1) {
            return null;
        }
        return str.substring(str.lastIndexOf(46));
    }

    public static String d(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        return iLastIndexOf >= 0 ? str.substring(0, iLastIndexOf) : str;
    }

    public static void e(Context context) {
        try {
            f(context.getCacheDir());
        } catch (Exception unused) {
        }
    }

    public static boolean f(File file) {
        if (file == null || !file.isDirectory()) {
            if (file == null || !file.isFile()) {
                return false;
            }
            return file.delete();
        }
        for (File file2 : file.listFiles()) {
            if (!f(file2)) {
                return false;
            }
        }
        return file.delete();
    }

    public static String g(String str) {
        try {
            return str.substring(str.lastIndexOf("/") + 1);
        } catch (Exception unused) {
            return str;
        }
    }

    public static String h(String str, char c) {
        try {
            return str.substring(Math.max(str.lastIndexOf(47), Math.max(str.lastIndexOf(92), str.lastIndexOf(c))) + 1);
        } catch (Exception unused) {
            return str;
        }
    }

    public static String i(File file) {
        return j(file.getName());
    }

    public static String j(String str) {
        if (str == null) {
            return "";
        }
        try {
            return str.substring(str.lastIndexOf(".") + 1).toLowerCase();
        } catch (Exception unused) {
            return "";
        }
    }

    public static String k(String str) {
        String strSubstring = "";
        if (str == null) {
            return "";
        }
        try {
            strSubstring = str.substring(str.lastIndexOf("."));
        } catch (Exception unused) {
        }
        return strSubstring.toLowerCase();
    }

    public static String l(String str) {
        try {
            str = str.substring(str.lastIndexOf("/") + 1);
        } catch (Exception unused) {
        }
        int iLastIndexOf = str.lastIndexOf(".");
        if (iLastIndexOf <= 0) {
            return str;
        }
        try {
            return str.substring(0, iLastIndexOf);
        } catch (Exception unused2) {
            return str;
        }
    }

    public static boolean m(String str) {
        return new File(str).exists();
    }

    public static String n(String str) {
        return str.replaceAll("[^a-zA-Z0-9(){}.-]", "_");
    }

    public static String o(String str, String str2, String str3) {
        String strT;
        String strT2;
        if (str3.equals("/")) {
            strT = s(str);
            strT2 = s(str2);
        } else {
            if (!str3.equals("\\")) {
                throw new IllegalArgumentException("Unrecognised dir separator '" + str3 + "'");
            }
            strT = t(str);
            strT2 = t(str2);
        }
        String[] strArrSplit = strT2.split(Pattern.quote(str3));
        String[] strArrSplit2 = strT.split(Pattern.quote(str3));
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        while (i < strArrSplit2.length && i < strArrSplit.length && strArrSplit2[i].equals(strArrSplit[i])) {
            stringBuffer.append(strArrSplit2[i] + str3);
            i++;
        }
        if (i == 0) {
            throw new b("No common path element found for '" + strT + "' and '" + strT2 + "'");
        }
        File file = new File(strT2);
        boolean zIsFile = file.exists() ? file.isFile() : !str2.endsWith(str3);
        StringBuilder sb = new StringBuilder();
        if (strArrSplit.length != i) {
            int length = zIsFile ? (strArrSplit.length - i) - 1 : strArrSplit.length - i;
            for (int i2 = 0; i2 < length; i2++) {
                sb.append("..");
                sb.append(str3);
            }
        }
        sb.append(strT.substring(stringBuffer.length()));
        return sb.toString();
    }

    public static String p(InputStream inputStream) {
        try {
            char[] cArr = new char[1024];
            StringBuilder sb = new StringBuilder(100000);
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
            while (true) {
                int i = inputStreamReader.read(cArr, 0, 1024);
                if (i < 0) {
                    return sb.toString();
                }
                sb.append(cArr, 0, i);
            }
        } catch (Exception unused) {
            return null;
        }
    }

    public static String q(Resources resources, int i) {
        StringBuilder sb = new StringBuilder(128);
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(resources.openRawResource(i)));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line);
                    sb.append('\n');
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return sb.toString();
        } catch (Exception e2) {
            e2.printStackTrace();
            return sb.toString();
        }
    }

    public static void r(Context context, String str) {
        MediaScannerConnection.scanFile(context, new String[]{str}, null, new a());
    }

    public static String s(String str) {
        return (str == null || str.indexOf(92) == -1) ? str : str.replace('\\', '/');
    }

    public static String t(String str) {
        return (str == null || str.indexOf(47) == -1) ? str : str.replace('/', '\\');
    }

    /* JADX INFO: renamed from: com.daaw.Gb1$a */
    public class a implements MediaScannerConnection.OnScanCompletedListener {
        @Override // android.media.MediaScannerConnection.OnScanCompletedListener
        public void onScanCompleted(String str, Uri uri) {
        }
    }
}
