package com.daaw;

import android.app.Activity;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import com.daaw.AbstractC1401Ko0;
import com.daaw.C0321Ag1;
import com.daaw.C0425Bg1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/* JADX INFO: renamed from: com.daaw.Uf1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2429Uf1 extends DB {
    public WeakReference b = new WeakReference(null);
    public final String c = ".txt";
    public final String d = ".zip";
    public final String e = ".viz";
    public final long f = 100000000;

    /* JADX INFO: renamed from: com.daaw.Uf1$a */
    public class a implements C0321Ag1.a {
        public a() {
        }

        @Override // com.daaw.C0321Ag1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(DialogFragmentC1054Hf1 dialogFragmentC1054Hf1, C2533Vf1 c2533Vf1) {
            if (c2533Vf1 == null || dialogFragmentC1054Hf1 == null) {
                return;
            }
            Activity activity = dialogFragmentC1054Hf1.getActivity();
            C2695Wu c2695WuQ = C1989Qf1.Q(c2533Vf1.a, null);
            if (c2695WuQ == null) {
                return;
            }
            String strP = c2695WuQ.p();
            String str = Environment.DIRECTORY_DOWNLOADS;
            String str2 = "visualizer_" + c2533Vf1.a;
            File fileA = SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.a(c2533Vf1.a);
            String strF = C2429Uf1.this.f(dialogFragmentC1054Hf1.getActivity(), str, str2, ".viz", strP, Arrays.asList(fileA != null ? fileA.listFiles() : new File[0]));
            AbstractC0934Gb1.r(activity, strF);
            String string = activity.getString(JD0.X4);
            C2221Sf1.g0(2, activity, string, Uri.parse(strF), AbstractC0934Gb1.g(strF), "text/plain");
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(strF), "text/plain");
            PendingIntent activity2 = PendingIntent.getActivity(activity, 0, intent, 67108864);
            NotificationManager notificationManager = (NotificationManager) activity.getSystemService("notification");
            AbstractC1401Ko0.d dVar = new AbstractC1401Ko0.d(activity);
            dVar.i(AbstractC0934Gb1.g(strF)).h(string).n(AbstractC3374bD0.S).g(activity2).l(true).e(true);
            notificationManager.notify(2, dVar.b());
            AbstractC5075hI.a.a(string);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Uf1$b */
    public class b implements C0321Ag1.a {
        public b() {
        }

        @Override // com.daaw.C0321Ag1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(DialogFragmentC1054Hf1 dialogFragmentC1054Hf1, List list) {
            if (dialogFragmentC1054Hf1 == null) {
                return;
            }
            C2429Uf1.this.b = new WeakReference(list);
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType("*/*");
            dialogFragmentC1054Hf1.startActivityForResult(Intent.createChooser(intent, dialogFragmentC1054Hf1.getResources().getString(JD0.d7)), 64);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Uf1$c */
    public class c implements C0425Bg1.a {
        public c() {
        }

        @Override // com.daaw.C0425Bg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(DialogFragmentC1054Hf1 dialogFragmentC1054Hf1, Integer num, Intent intent) {
            List list = (List) C2429Uf1.this.b.get();
            if (list == null) {
                return;
            }
            Activity activity = dialogFragmentC1054Hf1.getActivity();
            if (num.intValue() == 64) {
                if (intent == null) {
                    AbstractC0441Bk1.c("PICK_IMAGE_PROPERTY_REQUEST_CODE invalid data");
                } else {
                    C2429Uf1.this.j(activity, intent.getData(), list);
                }
            }
        }
    }

    public C2429Uf1() {
        DialogFragmentC1054Hf1.P.b(new a(), this.a);
        DialogFragmentC1054Hf1.Q.b(new b(), this.a);
        DialogFragmentC1054Hf1.J.b(new c(), this.a);
    }

    public static int c(Context context, Uri uri) {
        return k(context, uri, SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().o());
    }

    public static boolean d(ContentResolver contentResolver, Uri uri) {
        int i;
        byte[] bArr = new byte[2];
        try {
            InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
            i = inputStreamOpenInputStream != null ? inputStreamOpenInputStream.read(bArr) : 0;
            if (inputStreamOpenInputStream != null) {
                inputStreamOpenInputStream.close();
            }
        } catch (IOException | Exception unused) {
        }
        return i == 2 && bArr[0] == 80 && bArr[1] == 75;
    }

    public static void e(int i) {
        File fileA;
        FileInputStream fileInputStream;
        if (i >= 0 && (fileA = SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.a(i)) != null) {
            String strP = null;
            File file = null;
            File file2 = null;
            for (File file3 : fileA.listFiles()) {
                if (".json".equals(AbstractC0934Gb1.k(file3.getName()))) {
                    file2 = file3;
                }
                if ("scene.json".equals(file3.getName())) {
                    file = file3;
                }
            }
            if (file == null) {
                file = file2;
            }
            if (file != null) {
                try {
                    fileInputStream = new FileInputStream(file);
                } catch (FileNotFoundException | IOException unused) {
                }
                try {
                    strP = AbstractC0934Gb1.p(fileInputStream);
                    fileInputStream.close();
                    try {
                        file.delete();
                    } catch (Exception unused2) {
                    }
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            if (strP == null) {
                return;
            }
            SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().W(i, C2695Wu.g(strP), false);
        }
    }

    public static void g(File file, ZipOutputStream zipOutputStream) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        zipOutputStream.putNextEntry(new ZipEntry(file.getName()));
        byte[] bArr = new byte[1024];
        while (true) {
            int i = fileInputStream.read(bArr);
            if (i < 0) {
                zipOutputStream.closeEntry();
                fileInputStream.close();
                return;
            }
            zipOutputStream.write(bArr, 0, i);
        }
    }

    public static void h(String str, String str2, ZipOutputStream zipOutputStream) throws IOException {
        zipOutputStream.putNextEntry(new ZipEntry(str2));
        zipOutputStream.write(str.getBytes());
        zipOutputStream.closeEntry();
    }

    public static int k(Context context, Uri uri, List list) {
        int iL;
        InputStream inputStreamOpenInputStream;
        ZipInputStream zipInputStream;
        int i = -1;
        if (uri == null) {
            return -1;
        }
        byte[] bArr = new byte[1024];
        try {
            inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            zipInputStream = new ZipInputStream(inputStreamOpenInputStream);
            iL = C1989Qf1.L(C2695Wu.g(""), list, -1);
        } catch (FileNotFoundException | IOException unused) {
        }
        if (iL < 0) {
            return -1;
        }
        try {
            File fileA = SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.a(iL);
            while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    break;
                }
                FileOutputStream fileOutputStream = new FileOutputStream(new File(fileA, nextEntry.getName()));
                while (true) {
                    try {
                        int i2 = zipInputStream.read(bArr);
                        if (i2 > 0) {
                            fileOutputStream.write(bArr, 0, i2);
                        }
                    } catch (Throwable th) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                fileOutputStream.close();
            }
            zipInputStream.close();
            inputStreamOpenInputStream.close();
        } catch (FileNotFoundException | IOException unused2) {
            i = iL;
            iL = i;
        }
        e(iL);
        return iL;
    }

    public final String f(Context context, String str, String str2, String str3, String str4, List list) {
        File fileI = null;
        int i = 0;
        for (int i2 = 0; i2 < 100; i2++) {
            fileI = i == 0 ? i(context, str, str2 + str3) : i(context, str, str2 + "(" + i + ")" + str3);
            if (fileI != null && !fileI.exists()) {
                break;
            }
            i++;
        }
        if (fileI == null) {
            return null;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileI);
            ZipOutputStream zipOutputStream = new ZipOutputStream(fileOutputStream);
            h(str4, "scene.json", zipOutputStream);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                File file = (File) it.next();
                if (!"scene.json".equals(file.getName())) {
                    g(file, zipOutputStream);
                }
            }
            zipOutputStream.close();
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return fileI.getAbsolutePath();
    }

    public final File i(Context context, String str, String str2) {
        try {
            File file = new File(Environment.getExternalStoragePublicDirectory(str), AbstractC0934Gb1.n(str2));
            File parentFile = file.getParentFile();
            if (parentFile == null || parentFile.isDirectory()) {
                return file;
            }
            parentFile.mkdirs();
            return file;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public final void j(Context context, Uri uri, List list) {
        String path = uri.getPath();
        int iLastIndexOf = path.lastIndexOf(".txt");
        int iLastIndexOf2 = path.lastIndexOf(".json");
        int iMax = Math.max(iLastIndexOf, Math.max(iLastIndexOf2, Math.max(path.lastIndexOf(".zip"), path.lastIndexOf(".viz"))));
        if ((iMax == iLastIndexOf || iMax == iLastIndexOf2) && iMax != -1) {
            l(context, uri, list);
        } else {
            k(context, uri, list);
        }
    }

    public final void l(Context context, Uri uri, List list) {
        if (uri == null) {
            return;
        }
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            String strP = AbstractC0934Gb1.p(inputStreamOpenInputStream);
            if (strP == null) {
                return;
            }
            C1989Qf1.L(C2695Wu.g(strP), list, -1);
            inputStreamOpenInputStream.close();
        } catch (FileNotFoundException | IOException unused) {
        }
    }
}
