package com.daaw;

import android.content.ContentUris;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import com.revenuecat.purchases.common.Constants;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class UK {
    /* JADX WARN: Removed duplicated region for block: B:25:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(android.content.Context r8, android.net.Uri r9, java.lang.String r10, java.lang.String[] r11) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "_data"
            java.lang.String[] r3 = new java.lang.String[]{r0}
            r7 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L37
            r6 = 0
            r2 = r9
            r4 = r10
            r5 = r11
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L37
            if (r8 == 0) goto L2e
            boolean r9 = r8.moveToFirst()     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L2b
            if (r9 == 0) goto L2e
            int r9 = r8.getColumnIndexOrThrow(r0)     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L2b
            java.lang.String r9 = r8.getString(r9)     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L2b
            r8.close()
            return r9
        L27:
            r0 = move-exception
            r9 = r0
            r7 = r8
            goto L43
        L2b:
            r0 = move-exception
            r9 = r0
            goto L3a
        L2e:
            if (r8 == 0) goto L42
        L30:
            r8.close()
            goto L42
        L34:
            r0 = move-exception
            r9 = r0
            goto L43
        L37:
            r0 = move-exception
            r9 = r0
            r8 = r7
        L3a:
            java.lang.String r10 = ""
            com.daaw.AbstractC0441Bk1.b(r9, r10)     // Catch: java.lang.Throwable -> L27
            if (r8 == 0) goto L42
            goto L30
        L42:
            return r7
        L43:
            if (r7 == 0) goto L48
            r7.close()
        L48:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.UK.a(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }

    public static String b(Context context, Uri uri) {
        Uri uri2 = null;
        if (DocumentsContract.isDocumentUri(context, uri)) {
            if (f(uri)) {
                return DocumentsContract.getDocumentId(uri);
            }
            if (d(uri)) {
                String[] strArrSplit = DocumentsContract.getDocumentId(uri).split(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
                String str = strArrSplit[0];
                if ("primary".equalsIgnoreCase(str)) {
                    return Environment.getExternalStorageDirectory() + "/" + strArrSplit[1];
                }
                return "/storage/" + str + "/" + strArrSplit[1];
            }
            if (c(uri)) {
                try {
                    return a(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.parseLong(DocumentsContract.getDocumentId(uri))), null, null);
                } catch (NumberFormatException unused) {
                    Objects.toString(uri);
                    return null;
                }
            }
            if (g(uri)) {
                String[] strArrSplit2 = DocumentsContract.getDocumentId(uri).split(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
                String str2 = strArrSplit2[0];
                if ("image".equals(str2)) {
                    uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                } else if ("video".equals(str2)) {
                    uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                } else if ("audio".equals(str2)) {
                    uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                }
                return a(context, uri2, "_id=?", new String[]{strArrSplit2[1]});
            }
        } else {
            if ("content".equalsIgnoreCase(uri.getScheme())) {
                return e(uri) ? uri.getLastPathSegment() : a(context, uri, null, null);
            }
            if ("file".equalsIgnoreCase(uri.getScheme())) {
                return uri.getPath();
            }
        }
        return null;
    }

    public static boolean c(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    public static boolean d(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    public static boolean e(Uri uri) {
        return "com.google.android.apps.photos.content".equals(uri.getAuthority());
    }

    public static boolean f(Uri uri) {
        return "com.ianhanniballake.localstorage.documents".equals(uri.getAuthority());
    }

    public static boolean g(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }
}
